import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader70();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter8 = jaxrsReader7.LOG;
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(logAdapter8);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader38();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays68();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader89();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader45();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter0.deserializeObjectJaxrsReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader20();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader61();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader10();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader53();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter0.deserializeObjectJaxrsReader60();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader89();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader82();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter7 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter7.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter7.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter7.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter7.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter7.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter7.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader14 = serializedObjectSupporter7.deserializeObjectJaxrsReader68();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader15 = serializedObjectSupporter7.deserializeObjectJaxrsReader44();
        io.swagger.models.Swagger swagger16 = jaxrsReader15.swagger;
        springMvcApiReader6.setswagger(swagger16);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(jaxrsReader14);
        org.junit.Assert.assertNotNull(jaxrsReader15);
        org.junit.Assert.assertNotNull(swagger16);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader5();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader47();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays56();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader36();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader25();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays113();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader63();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader26();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader65();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader19();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        io.swagger.models.Operation operation3 = null;
        io.swagger.annotations.ApiOperation apiOperation4 = null;
        jaxrsReader2.updateTagsForOperation(operation3, apiOperation4);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays46();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader11();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter8 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter8.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader89();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter8.deserializeObjectJaxrsReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader62();
        jaxrsReader7.serializedObjectSupporter = serializedObjectSupporter8;
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader16 = serializedObjectSupporter8.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader17 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader18 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader19 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader20 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader58();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(jaxrsReader16);
        org.junit.Assert.assertNotNull(springMvcApiReader17);
        org.junit.Assert.assertNotNull(springMvcApiReader18);
        org.junit.Assert.assertNotNull(springMvcApiReader19);
        org.junit.Assert.assertNotNull(springMvcApiReader20);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader89();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader93();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays40();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader17();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader10();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader58();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader70();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays106();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader3();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays117();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader43();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter0.deserializeObjectJaxrsReader34();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter12 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter12.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader14 = serializedObjectSupporter12.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter12.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader16 = serializedObjectSupporter12.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader17 = serializedObjectSupporter12.deserializeObjectJaxrsReader53();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter18 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader19 = serializedObjectSupporter18.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader20 = serializedObjectSupporter18.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader21 = serializedObjectSupporter18.deserializeObjectJaxrsReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader22 = serializedObjectSupporter18.deserializeObjectSpringMvcApiReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader23 = serializedObjectSupporter18.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader24 = serializedObjectSupporter18.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader25 = serializedObjectSupporter18.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader26 = serializedObjectSupporter18.deserializeObjectSpringMvcApiReader78();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter27 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader28 = serializedObjectSupporter27.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader29 = serializedObjectSupporter27.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader30 = serializedObjectSupporter27.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader31 = serializedObjectSupporter27.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader32 = serializedObjectSupporter27.deserializeObjectSpringMvcApiReader14();
        java.lang.Class<?> wildcardClass33 = serializedObjectSupporter27.getClass();
        java.lang.annotation.Annotation[] annotationArray34 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList35 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList35, annotationArray34);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList37 = springMvcApiReader26.getParameters((java.lang.reflect.Type) wildcardClass33, (java.util.List<java.lang.annotation.Annotation>) annotationList35);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter38 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader39 = serializedObjectSupporter38.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader40 = serializedObjectSupporter38.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader41 = serializedObjectSupporter38.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader42 = serializedObjectSupporter38.deserializeObjectSpringMvcApiReader89();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter43 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader44 = serializedObjectSupporter43.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader45 = serializedObjectSupporter43.deserializeObjectSpringMvcApiReader27();
        java.lang.reflect.Type type46 = null;
        java.lang.annotation.Annotation[] annotationArray47 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList48 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList48, annotationArray47);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList50 = springMvcApiReader45.getParameters(type46, (java.util.List<java.lang.annotation.Annotation>) annotationList48);
        boolean boolean51 = springMvcApiReader42.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList48);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList52 = jaxrsReader17.getParameters((java.lang.reflect.Type) wildcardClass33, (java.util.List<java.lang.annotation.Annotation>) annotationList48);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter53 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader54 = serializedObjectSupporter53.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader55 = serializedObjectSupporter53.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader56 = serializedObjectSupporter53.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader57 = serializedObjectSupporter53.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader58 = serializedObjectSupporter53.deserializeObjectSpringMvcApiReader3();
        java.lang.reflect.Method[] methodArray59 = new java.lang.reflect.Method[] {};
        java.util.ArrayList<java.lang.reflect.Method> methodList60 = new java.util.ArrayList<java.lang.reflect.Method>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Method>) methodList60, methodArray59);
        java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> strMap62 = springMvcApiReader58.collectApisByRequestMapping((java.util.List<java.lang.reflect.Method>) methodList60);
        java.lang.reflect.Type type63 = null;
        java.lang.annotation.Annotation[] annotationArray64 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList65 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList65, annotationArray64);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList67 = springMvcApiReader58.getParameters(type63, (java.util.List<java.lang.annotation.Annotation>) annotationList65);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList68 = jaxrsReader11.getParameters((java.lang.reflect.Type) wildcardClass33, (java.util.List<java.lang.annotation.Annotation>) annotationList65);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(jaxrsReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(springMvcApiReader16);
        org.junit.Assert.assertNotNull(jaxrsReader17);
        org.junit.Assert.assertNotNull(springMvcApiReader19);
        org.junit.Assert.assertNotNull(springMvcApiReader20);
        org.junit.Assert.assertNotNull(jaxrsReader21);
        org.junit.Assert.assertNotNull(springMvcApiReader22);
        org.junit.Assert.assertNotNull(jaxrsReader23);
        org.junit.Assert.assertNotNull(springMvcApiReader24);
        org.junit.Assert.assertNotNull(springMvcApiReader25);
        org.junit.Assert.assertNotNull(springMvcApiReader26);
        org.junit.Assert.assertNotNull(springMvcApiReader28);
        org.junit.Assert.assertNotNull(springMvcApiReader29);
        org.junit.Assert.assertNotNull(springMvcApiReader30);
        org.junit.Assert.assertNotNull(springMvcApiReader31);
        org.junit.Assert.assertNotNull(springMvcApiReader32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(annotationArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(parameterList37);
        org.junit.Assert.assertNotNull(springMvcApiReader39);
        org.junit.Assert.assertNotNull(jaxrsReader40);
        org.junit.Assert.assertNotNull(springMvcApiReader41);
        org.junit.Assert.assertNotNull(springMvcApiReader42);
        org.junit.Assert.assertNotNull(springMvcApiReader44);
        org.junit.Assert.assertNotNull(springMvcApiReader45);
        org.junit.Assert.assertNotNull(annotationArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parameterList50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(parameterList52);
        org.junit.Assert.assertNotNull(springMvcApiReader54);
        org.junit.Assert.assertNotNull(springMvcApiReader55);
        org.junit.Assert.assertNotNull(springMvcApiReader56);
        org.junit.Assert.assertNotNull(jaxrsReader57);
        org.junit.Assert.assertNotNull(springMvcApiReader58);
        org.junit.Assert.assertNotNull(methodArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(annotationArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(parameterList67);
        org.junit.Assert.assertNotNull(parameterList68);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader65();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter0.deserializeObjectJaxrsReader34();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader26();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays86();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader29();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader25();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader55();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader53();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader85();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader26();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader46();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter9 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter9.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter9.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter9.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter9.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter9.deserializeObjectSpringMvcApiReader7();
        java.util.Set<java.lang.reflect.Type> typeSet15 = springMvcApiReader14.getTypesToSkip();
        springMvcApiReader8.setTypesToSkip(typeSet15);
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(typeSet15);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader84();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader52();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader84();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader89();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader47();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter0.deserializeObjectArrays95();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader45();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader50();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = springMvcApiReader9.parseOperationPath("/store/hi!", strMap11);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/store/hi!" + "'", str12, "/store/hi!");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader11();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader93();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays81();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader57();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays129();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader6();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader57();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader46();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader92();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader10();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader43();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays130();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader11();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter8 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter8.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader89();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter8.deserializeObjectJaxrsReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader62();
        jaxrsReader7.serializedObjectSupporter = serializedObjectSupporter8;
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader16 = serializedObjectSupporter8.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader17 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader18 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader62();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays19 = serializedObjectSupporter8.deserializeObjectArrays103();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(jaxrsReader16);
        org.junit.Assert.assertNotNull(springMvcApiReader17);
        org.junit.Assert.assertNotNull(springMvcApiReader18);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader13();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader53();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader89();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader2();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader65();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays147();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter7 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter7.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter7.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter7.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter7.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter7.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter7.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter7.deserializeObjectSpringMvcApiReader92();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter7.deserializeObjectSpringMvcApiReader53();
        java.lang.Class<?> wildcardClass16 = springMvcApiReader15.getClass();
        springMvcApiReader6.addTypeToSkippedTypes((java.lang.reflect.Type) wildcardClass16);
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap18 = null;
        io.swagger.annotations.Api api19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, io.swagger.models.Tag> strMap20 = springMvcApiReader6.updateTagsForApi(strMap18, api19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader6();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader83();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader14();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader57();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader1();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader85();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader50();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        java.util.Set<java.lang.reflect.Type> typeSet9 = springMvcApiReader8.getTypesToSkip();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(typeSet9);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader5();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader24();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays17();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader46();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader65();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader63();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader92();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader43();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader5();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader65();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays104();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader29();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader66();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays30();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader47();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader64();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays63();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader24();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader20();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader65();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader63();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays97();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader66();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader6();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        java.lang.String str10 = springMvcApiReader8.generateFullPath("/store/hi!");
        io.swagger.annotations.Api api11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.swagger.models.SecurityRequirement> securityRequirementList12 = springMvcApiReader8.getSecurityRequirements(api11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/pet/store/hi!" + "'", str10, "/pet/store/hi!");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader83();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader38();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader11();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader4();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays18();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader19();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader50();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter6 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter6.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader14 = serializedObjectSupporter6.deserializeObjectJaxrsReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader16 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader83();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader17 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter18 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader19 = serializedObjectSupporter18.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader20 = serializedObjectSupporter18.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader21 = serializedObjectSupporter18.deserializeObjectJaxrsReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader22 = serializedObjectSupporter18.deserializeObjectSpringMvcApiReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader23 = serializedObjectSupporter18.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader24 = serializedObjectSupporter18.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader25 = serializedObjectSupporter18.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader26 = serializedObjectSupporter18.deserializeObjectSpringMvcApiReader78();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter27 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader28 = serializedObjectSupporter27.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader29 = serializedObjectSupporter27.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader30 = serializedObjectSupporter27.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader31 = serializedObjectSupporter27.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader32 = serializedObjectSupporter27.deserializeObjectSpringMvcApiReader14();
        java.lang.Class<?> wildcardClass33 = serializedObjectSupporter27.getClass();
        java.lang.annotation.Annotation[] annotationArray34 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList35 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList35, annotationArray34);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList37 = springMvcApiReader26.getParameters((java.lang.reflect.Type) wildcardClass33, (java.util.List<java.lang.annotation.Annotation>) annotationList35);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter38 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader39 = serializedObjectSupporter38.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader40 = serializedObjectSupporter38.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader41 = serializedObjectSupporter38.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader42 = serializedObjectSupporter38.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader43 = serializedObjectSupporter38.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader44 = serializedObjectSupporter38.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader45 = serializedObjectSupporter38.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader46 = serializedObjectSupporter38.deserializeObjectJaxrsReader4();
        java.lang.reflect.Type type47 = null;
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter48 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader49 = serializedObjectSupporter48.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader50 = serializedObjectSupporter48.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader51 = serializedObjectSupporter48.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader52 = serializedObjectSupporter48.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader53 = serializedObjectSupporter48.deserializeObjectSpringMvcApiReader3();
        java.lang.reflect.Method[] methodArray54 = new java.lang.reflect.Method[] {};
        java.util.ArrayList<java.lang.reflect.Method> methodList55 = new java.util.ArrayList<java.lang.reflect.Method>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Method>) methodList55, methodArray54);
        java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> strMap57 = springMvcApiReader53.collectApisByRequestMapping((java.util.List<java.lang.reflect.Method>) methodList55);
        java.lang.reflect.Type type58 = null;
        java.lang.annotation.Annotation[] annotationArray59 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList60 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList60, annotationArray59);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList62 = springMvcApiReader53.getParameters(type58, (java.util.List<java.lang.annotation.Annotation>) annotationList60);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList63 = jaxrsReader46.getParameters(type47, (java.util.List<java.lang.annotation.Annotation>) annotationList60);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList64 = springMvcApiReader17.getParameters((java.lang.reflect.Type) wildcardClass33, (java.util.List<java.lang.annotation.Annotation>) annotationList60);
        java.util.Map<java.lang.String, java.lang.String> strMap65 = null;
        io.swagger.models.Operation operation66 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader5.updateOperationParameters(parameterList64, strMap65, operation66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(jaxrsReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(springMvcApiReader16);
        org.junit.Assert.assertNotNull(springMvcApiReader17);
        org.junit.Assert.assertNotNull(springMvcApiReader19);
        org.junit.Assert.assertNotNull(springMvcApiReader20);
        org.junit.Assert.assertNotNull(jaxrsReader21);
        org.junit.Assert.assertNotNull(springMvcApiReader22);
        org.junit.Assert.assertNotNull(jaxrsReader23);
        org.junit.Assert.assertNotNull(springMvcApiReader24);
        org.junit.Assert.assertNotNull(springMvcApiReader25);
        org.junit.Assert.assertNotNull(springMvcApiReader26);
        org.junit.Assert.assertNotNull(springMvcApiReader28);
        org.junit.Assert.assertNotNull(springMvcApiReader29);
        org.junit.Assert.assertNotNull(springMvcApiReader30);
        org.junit.Assert.assertNotNull(springMvcApiReader31);
        org.junit.Assert.assertNotNull(springMvcApiReader32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(annotationArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(parameterList37);
        org.junit.Assert.assertNotNull(springMvcApiReader39);
        org.junit.Assert.assertNotNull(jaxrsReader40);
        org.junit.Assert.assertNotNull(springMvcApiReader41);
        org.junit.Assert.assertNotNull(jaxrsReader42);
        org.junit.Assert.assertNotNull(springMvcApiReader43);
        org.junit.Assert.assertNotNull(springMvcApiReader44);
        org.junit.Assert.assertNotNull(springMvcApiReader45);
        org.junit.Assert.assertNotNull(jaxrsReader46);
        org.junit.Assert.assertNotNull(springMvcApiReader49);
        org.junit.Assert.assertNotNull(springMvcApiReader50);
        org.junit.Assert.assertNotNull(springMvcApiReader51);
        org.junit.Assert.assertNotNull(jaxrsReader52);
        org.junit.Assert.assertNotNull(springMvcApiReader53);
        org.junit.Assert.assertNotNull(methodArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(annotationArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(parameterList62);
        org.junit.Assert.assertNotNull(parameterList63);
        org.junit.Assert.assertNotNull(parameterList64);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader50();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader61();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader89();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter0.deserializeObjectArrays144();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader65();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays132();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader31();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader37();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader46();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader70();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader6();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader11();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader83();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader38();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader11();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays73();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        java.util.List<java.lang.reflect.Method> methodList4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> strMap5 = springMvcApiReader3.collectApisByRequestMapping(methodList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader92();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays69();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader11();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader61();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays5();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader31();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader37();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader6();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader66();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader1();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader57();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays42();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader70();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays138();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader12();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter8 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter8.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader1();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader85();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader50();
        jaxrsReader7.serializedObjectSupporter = serializedObjectSupporter8;
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader17 = serializedObjectSupporter8.deserializeObjectJaxrsReader25();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(jaxrsReader17);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader65();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader18();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader51();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader43();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader35();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader31();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays15();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader36();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader18();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader60();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays86();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter0.deserializeObjectArrays35();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader2();
        springMvcApiReader4.updateExtensionChain();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter6 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter6.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter6.deserializeObjectJaxrsReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader77();
        io.swagger.models.Swagger swagger12 = springMvcApiReader11.swagger;
        springMvcApiReader4.setswagger(swagger12);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(swagger12);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader38();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader46();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader64();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader1();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader53();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader1();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader25();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays69();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader83();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays10();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays72();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader64();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays79();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader38();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader50();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader6();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays79();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader38();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader36();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader60();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader50();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader57();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader45();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader52();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader24();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader20();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader69();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader10();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader64();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter0.deserializeObjectArrays104();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader1();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader45();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader37();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader93();
        io.swagger.annotations.Api api10 = null;
        boolean boolean11 = springMvcApiReader8.canReadApi(false, api10);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader24();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader1();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader50();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader6();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader43();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays22();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader10();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter0.deserializeObjectArrays104();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader5();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter0.deserializeObjectJaxrsReader14();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader50();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays27();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader13();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader46();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader49();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader1();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader47();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader47();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader54();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader50();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter8 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader83();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter8.deserializeObjectJaxrsReader38();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter12 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter12.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter12.deserializeObjectSpringMvcApiReader52();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter12.deserializeObjectSpringMvcApiReader91();
        io.swagger.models.Swagger swagger16 = springMvcApiReader15.swagger;
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter17 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader18 = serializedObjectSupporter17.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader19 = serializedObjectSupporter17.deserializeObjectJaxrsReader43();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader20 = serializedObjectSupporter17.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter21 = springMvcApiReader20.getLOG();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader22 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger16, logAdapter21);
        springMvcApiReader11.setswagger(swagger16);
        jaxrsReader7.setswagger(swagger16);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(swagger16);
        org.junit.Assert.assertNotNull(jaxrsReader18);
        org.junit.Assert.assertNotNull(jaxrsReader19);
        org.junit.Assert.assertNotNull(springMvcApiReader20);
        org.junit.Assert.assertNotNull(logAdapter21);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader63();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader18();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader60();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader37();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter0.deserializeObjectArrays87();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays65();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader54();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader50();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader85();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays10();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays16();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader83();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader38();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader64();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader42();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays160();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader82();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader86();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        io.swagger.models.Swagger swagger3 = springMvcApiReader2.getswagger();
        io.swagger.annotations.Api api4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.swagger.models.SecurityRequirement> securityRequirementList5 = springMvcApiReader2.getSecurityRequirements(api4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(swagger3);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader65();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader9();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter0.deserializeObjectArrays108();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays6();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader45();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader86();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader70();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays156();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader10();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader46();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader48();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader43();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays138();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader22();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader47();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays79();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader68();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays62();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader50();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader13();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader46();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader61();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays103();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader29();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader36();
        java.util.Set<java.lang.reflect.Type> typeSet10 = springMvcApiReader9.getTypesToSkip();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(typeSet10);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader36();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader13();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter0.deserializeObjectJaxrsReader18();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader50();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader35();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays70();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader29();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader36();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader37();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader20();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter11 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader27();
        java.lang.reflect.Type type14 = null;
        java.lang.annotation.Annotation[] annotationArray15 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList16 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList16, annotationArray15);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList18 = springMvcApiReader13.getParameters(type14, (java.util.List<java.lang.annotation.Annotation>) annotationList16);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        io.swagger.models.Operation operation20 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader10.updateOperationParameters(parameterList18, strMap19, operation20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(annotationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parameterList18);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader92();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader2();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays78();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter0.deserializeObjectJaxrsReader11();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter0.deserializeObjectJaxrsReader61();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader38();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader17();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader3();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader89();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter0.deserializeObjectJaxrsReader35();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays118();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader43();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter0.deserializeObjectJaxrsReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader43();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter0.deserializeObjectArrays119();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays103();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader6();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader24();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader89();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter9 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter9.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter9.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter9.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter9.deserializeObjectSpringMvcApiReader75();
        java.util.Set<java.lang.reflect.Type> typeSet14 = springMvcApiReader13.typesToSkip;
        springMvcApiReader8.typesToSkip = typeSet14;
        io.swagger.models.Swagger swagger16 = springMvcApiReader8.getswagger();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(typeSet14);
        org.junit.Assert.assertNotNull(swagger16);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays68();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader26();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays22();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader13();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader76();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader83();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter0.deserializeObjectArrays14();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader58();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays123();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter8 = jaxrsReader7.getLOG();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(logAdapter8);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader28();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays91();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader10();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader82();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader66();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader20();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays95();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader28();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader65();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays30();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays71();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader51();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays115();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader83();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader38();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader83();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader41();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays92();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader85();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader37();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader45();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader86();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader58();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays132();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader25();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader65();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader5();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader50();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter0.deserializeObjectArrays15();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays59();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader50();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays72();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter0.deserializeObjectArrays111();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter8 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter8.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader9();
        io.swagger.models.Swagger swagger13 = springMvcApiReader12.getswagger();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter14 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader15 = serializedObjectSupporter14.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader16 = serializedObjectSupporter14.deserializeObjectJaxrsReader43();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader17 = serializedObjectSupporter14.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter18 = springMvcApiReader17.getLOG();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader19 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger13, logAdapter18);
        springMvcApiReader7.swagger = swagger13;
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(swagger13);
        org.junit.Assert.assertNotNull(jaxrsReader15);
        org.junit.Assert.assertNotNull(jaxrsReader16);
        org.junit.Assert.assertNotNull(springMvcApiReader17);
        org.junit.Assert.assertNotNull(logAdapter18);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays161();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader1();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays112();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader57();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader83();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays154();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader58();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader59();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader5();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader17();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter0.deserializeObjectArrays147();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader50();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader26();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader5();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader47();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader58();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader38();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader35();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader37();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader83();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader38();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader2();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader35();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader50();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays155();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader50();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader29();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays144();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }
}

