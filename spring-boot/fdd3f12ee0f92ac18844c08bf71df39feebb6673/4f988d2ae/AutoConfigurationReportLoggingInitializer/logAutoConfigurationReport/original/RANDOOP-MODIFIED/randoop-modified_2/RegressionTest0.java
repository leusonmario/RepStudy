import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        java.lang.Class<?> wildcardClass1 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass3 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass5 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass7 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass7 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass5 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass7 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass3 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass7 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass25 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass7 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass5 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass7 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass7 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass5 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass27 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass27 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass25 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass25 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass29 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass33 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass31 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass27 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass27 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass25 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext33 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass25 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass25 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass33 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass35 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass25 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass29 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass31 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass25 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext37 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass37 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext33 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass27 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass27 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass33 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass31 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass35 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass31 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass33 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass25 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext33 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext33 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass29 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass27 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass27 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass29 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass27 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass25 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass37 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass29 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass29 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass21 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

