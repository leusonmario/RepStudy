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
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader70();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader46();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays14 = serializedObjectSupporter5.deserializeObjectArrays71();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader46();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader22();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader62();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader6();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays56();
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
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader64();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays71();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }
}

