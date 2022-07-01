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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader53();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays116();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader58();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader50();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays30();
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
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader87();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays46();
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader85();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader89();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader84();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader46();
        io.swagger.models.Swagger swagger9 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter10 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger9, logAdapter10);
        springMvcApiReader11.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter14 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter14.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader11.serializedObjectSupporter = serializedObjectSupporter14;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader17 = serializedObjectSupporter14.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader18 = serializedObjectSupporter14.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader19 = serializedObjectSupporter14.deserializeObjectSpringMvcApiReader46();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader20 = serializedObjectSupporter14.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader21 = serializedObjectSupporter14.deserializeObjectSpringMvcApiReader88();
        java.lang.reflect.Type type22 = null;
        io.swagger.models.Swagger swagger23 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter24 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader25 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger23, logAdapter24);
        io.swagger.models.Swagger swagger26 = null;
        springMvcApiReader25.setswagger(swagger26);
        java.lang.reflect.Type[] typeArray28 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet29 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet29, typeArray28);
        springMvcApiReader25.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet29);
        java.lang.String str32 = springMvcApiReader25.getresourcePath();
        java.lang.annotation.Annotation[] annotationArray33 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList34 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList34, annotationArray33);
        boolean boolean36 = springMvcApiReader25.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList34);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList37 = springMvcApiReader21.getParameters(type22, (java.util.List<java.lang.annotation.Annotation>) annotationList34);
        boolean boolean38 = jaxrsReader8.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList34);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(springMvcApiReader17);
        org.junit.Assert.assertNotNull(springMvcApiReader18);
        org.junit.Assert.assertNotNull(springMvcApiReader19);
        org.junit.Assert.assertNotNull(springMvcApiReader20);
        org.junit.Assert.assertNotNull(springMvcApiReader21);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(annotationArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(parameterList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays71();
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
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader17();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader14 = serializedObjectSupporter5.deserializeObjectJaxrsReader61();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader5();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(jaxrsReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader82();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader79();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader46();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader13();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays91();
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
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader13();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader14 = serializedObjectSupporter5.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader77();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays16 = serializedObjectSupporter5.deserializeObjectArrays119();
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
        org.junit.Assert.assertNotNull(jaxrsReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader24();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays86();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        java.lang.reflect.Method method6 = null;
        io.swagger.models.Operation operation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            jaxrsReader5.readImplicitParameters(method6, operation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader5();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader25();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader45();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader8();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays34();
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader82();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader25();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays107();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader58();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader6();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays56();
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
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader35();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays78();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader11();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader48();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader80();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays14 = serializedObjectSupporter5.deserializeObjectArrays161();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader17();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader53();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader68();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader9();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays93();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader6();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader4();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader8();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader85();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays104();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader52();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap9 = null;
        io.swagger.annotations.Api api10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, io.swagger.models.Tag> strMap11 = springMvcApiReader8.updateTagsForApi(strMap9, api10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader14 = serializedObjectSupporter5.deserializeObjectJaxrsReader16();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(jaxrsReader14);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader17();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays103();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays26();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays76();
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
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader70();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays116();
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader57();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader53();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter0.deserializeObjectArrays19();
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
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader14 = serializedObjectSupporter5.deserializeObjectJaxrsReader68();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays15 = serializedObjectSupporter5.deserializeObjectArrays140();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(jaxrsReader14);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader35();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader18();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays92();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays152();
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
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader47();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader52();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays97();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader31();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
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
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader11();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader47();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays92();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader24();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader30();
        io.swagger.models.Swagger swagger12 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter13 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger12, logAdapter13);
        springMvcApiReader14.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter17 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader18 = serializedObjectSupporter17.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader14.serializedObjectSupporter = serializedObjectSupporter17;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader20 = serializedObjectSupporter17.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader21 = serializedObjectSupporter17.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader22 = serializedObjectSupporter17.deserializeObjectJaxrsReader1();
        io.swagger.models.Swagger swagger23 = jaxrsReader22.getswagger();
        springMvcApiReader11.swagger = swagger23;
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader18);
        org.junit.Assert.assertNotNull(springMvcApiReader20);
        org.junit.Assert.assertNotNull(springMvcApiReader21);
        org.junit.Assert.assertNotNull(jaxrsReader22);
        org.junit.Assert.assertNotNull(swagger23);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays72();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader65();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader46();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader21();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays14 = serializedObjectSupporter5.deserializeObjectArrays152();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader10();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader17();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader18();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays109();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader6();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays160();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter13 = springMvcApiReader12.getLOG();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(logAdapter13);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader68();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader47();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader58();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader82();
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter6 = springMvcApiReader5.LOG;
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(logAdapter6);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        io.swagger.models.Swagger swagger8 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter9 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger8, logAdapter9);
        java.lang.String str12 = springMvcApiReader10.generateFullPath("hi!");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter13 = springMvcApiReader10.serializedObjectSupporter;
        java.lang.String[] strArray15 = new java.lang.String[] { "/hi!" };
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter16 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader17 = serializedObjectSupporter16.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader18 = serializedObjectSupporter16.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader19 = serializedObjectSupporter16.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader20 = serializedObjectSupporter16.deserializeObjectSpringMvcApiReader27();
        java.lang.String[] strArray25 = new java.lang.String[] { "/hi!", "/hi!", "", "null/hi!" };
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap29 = null;
        java.util.List<io.swagger.models.SecurityRequirement> securityRequirementList30 = null;
        io.swagger.models.Operation operation31 = null;
        springMvcApiReader20.updateOperation(strArray25, strArray28, strMap29, securityRequirementList30, operation31);
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap33 = null;
        io.swagger.models.SecurityRequirement[] securityRequirementArray34 = new io.swagger.models.SecurityRequirement[] {};
        java.util.ArrayList<io.swagger.models.SecurityRequirement> securityRequirementList35 = new java.util.ArrayList<io.swagger.models.SecurityRequirement>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<io.swagger.models.SecurityRequirement>) securityRequirementList35, securityRequirementArray34);
        io.swagger.models.Operation operation37 = null;
        springMvcApiReader10.updateOperation(strArray15, strArray28, strMap33, (java.util.List<io.swagger.models.SecurityRequirement>) securityRequirementList35, operation37);
        java.lang.String[] strArray39 = null;
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap40 = null;
        io.swagger.models.SecurityRequirement[] securityRequirementArray41 = new io.swagger.models.SecurityRequirement[] {};
        java.util.ArrayList<io.swagger.models.SecurityRequirement> securityRequirementList42 = new java.util.ArrayList<io.swagger.models.SecurityRequirement>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<io.swagger.models.SecurityRequirement>) securityRequirementList42, securityRequirementArray41);
        io.swagger.models.Operation operation44 = null;
        springMvcApiReader7.updateOperation(strArray28, strArray39, strMap40, (java.util.List<io.swagger.models.SecurityRequirement>) securityRequirementList42, operation44);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null/hi!" + "'", str12, "null/hi!");
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(springMvcApiReader17);
        org.junit.Assert.assertNotNull(jaxrsReader18);
        org.junit.Assert.assertNotNull(jaxrsReader19);
        org.junit.Assert.assertNotNull(springMvcApiReader20);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(securityRequirementArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(securityRequirementArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader29();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader20();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays65();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader51();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter10 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter10.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter10.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter10.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter10.deserializeObjectSpringMvcApiReader5();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter10.deserializeObjectSpringMvcApiReader25();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader16 = serializedObjectSupporter10.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader17 = serializedObjectSupporter10.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter18 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader19 = serializedObjectSupporter18.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader20 = serializedObjectSupporter18.deserializeObjectJaxrsReader33();
        io.swagger.models.Swagger swagger21 = jaxrsReader20.getswagger();
        springMvcApiReader17.swagger = swagger21;
        springMvcApiReader9.swagger = swagger21;
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(jaxrsReader16);
        org.junit.Assert.assertNotNull(springMvcApiReader17);
        org.junit.Assert.assertNotNull(springMvcApiReader19);
        org.junit.Assert.assertNotNull(jaxrsReader20);
        org.junit.Assert.assertNotNull(swagger21);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader50();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader10();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader15 = serializedObjectSupporter5.deserializeObjectJaxrsReader31();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(jaxrsReader15);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader6();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader18();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader20();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader37();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader35();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader33();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays126();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader89();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader16();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader57();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader86();
        springMvcApiReader5.resourcePath = "/pet";
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader20();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays67();
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
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader84();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader54();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader5();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader6();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays122();
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
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader53();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader24();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays134();
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
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader46();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader21();
        java.lang.String[] strArray17 = new java.lang.String[] { "/hi!", "/hi!", "/hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "/hi!", "/store/hi!" };
        io.swagger.models.Operation operation21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray22 = springMvcApiReader13.updateOperationConsumes(strArray17, strArray20, operation21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        io.swagger.models.Operation operation7 = null;
        springMvcApiReader4.updatePath("/pet/null/hi!", "/store", operation7);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        io.swagger.models.Swagger swagger6 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter7 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger6, logAdapter7);
        springMvcApiReader8.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter11 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader8.serializedObjectSupporter = serializedObjectSupporter11;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader16 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader70();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader17 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader18 = serializedObjectSupporter11.deserializeObjectJaxrsReader50();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader19 = serializedObjectSupporter11.deserializeObjectJaxrsReader8();
        springMvcApiReader5.serializedObjectSupporter = serializedObjectSupporter11;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader21 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader52();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(springMvcApiReader16);
        org.junit.Assert.assertNotNull(springMvcApiReader17);
        org.junit.Assert.assertNotNull(jaxrsReader18);
        org.junit.Assert.assertNotNull(jaxrsReader19);
        org.junit.Assert.assertNotNull(springMvcApiReader21);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader59();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays22();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader8();
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
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader78();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader14();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays104();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader2();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader57();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays15();
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
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader92();
        com.github.kongchen.swagger.docgen.spring.SpringResource springResource9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.models.Swagger swagger10 = springMvcApiReader8.read(springResource9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader18();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader63();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader24();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays15 = serializedObjectSupporter5.deserializeObjectArrays118();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader11();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader29();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays36();
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
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader48();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays155();
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
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader18();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader52();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader8();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter0.deserializeObjectJaxrsReader69();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader20();
        springMvcApiReader7.resourcePath = "/store";
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays68();
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
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays93();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader18();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays106();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader3();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays10();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader35();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader29();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays85();
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
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader8();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader3();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader5();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader81();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays14 = serializedObjectSupporter5.deserializeObjectArrays4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader8();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader52();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader6();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader37();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays15 = serializedObjectSupporter5.deserializeObjectArrays148();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader76();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays33();
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
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader58();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays127();
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
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader35();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader23();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader29();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader31();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader13();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays21();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader61();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader18();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader5();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader14 = serializedObjectSupporter5.deserializeObjectJaxrsReader27();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(jaxrsReader14);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter13 = springMvcApiReader12.LOG;
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(logAdapter13);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays130();
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
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader14();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader47();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader46();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader78();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader29();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader37();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader51();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter0.deserializeObjectArrays7();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays133();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader46();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        io.swagger.annotations.Api api7 = null;
        boolean boolean8 = jaxrsReader5.canReadApi(true, api7);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader24();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays97();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader14 = serializedObjectSupporter5.deserializeObjectJaxrsReader66();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(jaxrsReader14);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter11 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter11.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader16 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader17 = serializedObjectSupporter11.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader18 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader19 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader60();
        java.lang.String[] strArray23 = new java.lang.String[] { "/hi!", "/user", "null/hi!" };
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter24 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader25 = serializedObjectSupporter24.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader26 = serializedObjectSupporter24.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader27 = serializedObjectSupporter24.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader28 = serializedObjectSupporter24.deserializeObjectSpringMvcApiReader27();
        java.lang.String[] strArray33 = new java.lang.String[] { "/hi!", "/hi!", "", "null/hi!" };
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "" };
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap37 = null;
        java.util.List<io.swagger.models.SecurityRequirement> securityRequirementList38 = null;
        io.swagger.models.Operation operation39 = null;
        springMvcApiReader28.updateOperation(strArray33, strArray36, strMap37, securityRequirementList38, operation39);
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap41 = null;
        io.swagger.models.SecurityRequirement[] securityRequirementArray42 = new io.swagger.models.SecurityRequirement[] {};
        java.util.ArrayList<io.swagger.models.SecurityRequirement> securityRequirementList43 = new java.util.ArrayList<io.swagger.models.SecurityRequirement>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<io.swagger.models.SecurityRequirement>) securityRequirementList43, securityRequirementArray42);
        io.swagger.models.Operation operation45 = null;
        springMvcApiReader19.updateOperation(strArray23, strArray33, strMap41, (java.util.List<io.swagger.models.SecurityRequirement>) securityRequirementList43, operation45);
        io.swagger.models.Swagger swagger47 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter48 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader49 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger47, logAdapter48);
        java.lang.String str51 = springMvcApiReader49.generateFullPath("hi!");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter52 = springMvcApiReader49.serializedObjectSupporter;
        java.lang.String[] strArray54 = new java.lang.String[] { "/hi!" };
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter55 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader56 = serializedObjectSupporter55.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader57 = serializedObjectSupporter55.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader58 = serializedObjectSupporter55.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader59 = serializedObjectSupporter55.deserializeObjectSpringMvcApiReader27();
        java.lang.String[] strArray64 = new java.lang.String[] { "/hi!", "/hi!", "", "null/hi!" };
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "" };
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap68 = null;
        java.util.List<io.swagger.models.SecurityRequirement> securityRequirementList69 = null;
        io.swagger.models.Operation operation70 = null;
        springMvcApiReader59.updateOperation(strArray64, strArray67, strMap68, securityRequirementList69, operation70);
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap72 = null;
        io.swagger.models.SecurityRequirement[] securityRequirementArray73 = new io.swagger.models.SecurityRequirement[] {};
        java.util.ArrayList<io.swagger.models.SecurityRequirement> securityRequirementList74 = new java.util.ArrayList<io.swagger.models.SecurityRequirement>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<io.swagger.models.SecurityRequirement>) securityRequirementList74, securityRequirementArray73);
        io.swagger.models.Operation operation76 = null;
        springMvcApiReader49.updateOperation(strArray54, strArray67, strMap72, (java.util.List<io.swagger.models.SecurityRequirement>) securityRequirementList74, operation76);
        io.swagger.models.Operation operation78 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray79 = springMvcApiReader10.updateOperationProduces(strArray33, strArray54, operation78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(springMvcApiReader16);
        org.junit.Assert.assertNotNull(jaxrsReader17);
        org.junit.Assert.assertNotNull(springMvcApiReader18);
        org.junit.Assert.assertNotNull(springMvcApiReader19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(springMvcApiReader25);
        org.junit.Assert.assertNotNull(jaxrsReader26);
        org.junit.Assert.assertNotNull(jaxrsReader27);
        org.junit.Assert.assertNotNull(springMvcApiReader28);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(securityRequirementArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "null/hi!" + "'", str51, "null/hi!");
        org.junit.Assert.assertNull(serializedObjectSupporter52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(springMvcApiReader56);
        org.junit.Assert.assertNotNull(jaxrsReader57);
        org.junit.Assert.assertNotNull(jaxrsReader58);
        org.junit.Assert.assertNotNull(springMvcApiReader59);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(securityRequirementArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader4();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader35();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader64();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter11 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter11.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader16 = serializedObjectSupporter11.deserializeObjectJaxrsReader6();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader17 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader18 = serializedObjectSupporter11.deserializeObjectJaxrsReader38();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter19 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader20 = serializedObjectSupporter19.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader21 = serializedObjectSupporter19.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader22 = serializedObjectSupporter19.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader23 = serializedObjectSupporter19.deserializeObjectJaxrsReader6();
        java.util.Set<java.lang.reflect.Type> typeSet24 = jaxrsReader23.typesToSkip;
        jaxrsReader18.setTypesToSkip(typeSet24);
        jaxrsReader10.typesToSkip = typeSet24;
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(jaxrsReader16);
        org.junit.Assert.assertNotNull(springMvcApiReader17);
        org.junit.Assert.assertNotNull(jaxrsReader18);
        org.junit.Assert.assertNotNull(springMvcApiReader20);
        org.junit.Assert.assertNotNull(jaxrsReader21);
        org.junit.Assert.assertNotNull(jaxrsReader22);
        org.junit.Assert.assertNotNull(jaxrsReader23);
        org.junit.Assert.assertNotNull(typeSet24);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader18();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader47();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays15 = serializedObjectSupporter5.deserializeObjectArrays42();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader48();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays148();
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
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader8();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays10();
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
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays2();
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
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader64();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader57();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader57();
        java.lang.String str6 = springMvcApiReader5.resourcePath;
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/pet" + "'", str6, "/pet");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays8();
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
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays24();
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
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader90();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader68();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader47();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader50();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader84();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader16 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader44();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(springMvcApiReader16);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader46();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = springMvcApiReader4.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader89();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = springMvcApiReader6.parseOperationPath("/user", strMap8);
        springMvcApiReader6.setresourcePath("/null/hi!");
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/user" + "'", str9, "/user");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader22();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays125();
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
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader64();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader1();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays34();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays71();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader78();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader78();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays147();
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
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader18();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.models.Operation operation10 = springMvcApiReader8.parseMethod(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader31();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader61();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader68();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader47();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader50();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader47();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader16 = serializedObjectSupporter5.deserializeObjectJaxrsReader32();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(jaxrsReader16);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader90();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        java.lang.reflect.Method method11 = null;
        io.swagger.models.Operation operation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            jaxrsReader10.readImplicitParameters(method11, operation12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader36();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays36();
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
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader15();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays66();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader20();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader42();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays51();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader57();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader80();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader21();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays151();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader85();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter12 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter12.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader14 = serializedObjectSupporter12.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter12.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader16 = serializedObjectSupporter12.deserializeObjectJaxrsReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader17 = serializedObjectSupporter12.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader18 = serializedObjectSupporter12.deserializeObjectJaxrsReader24();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader19 = serializedObjectSupporter12.deserializeObjectJaxrsReader25();
        jaxrsReader11.serializedObjectSupporter = serializedObjectSupporter12;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays21 = serializedObjectSupporter12.deserializeObjectArrays147();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(jaxrsReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(jaxrsReader16);
        org.junit.Assert.assertNotNull(springMvcApiReader17);
        org.junit.Assert.assertNotNull(jaxrsReader18);
        org.junit.Assert.assertNotNull(jaxrsReader19);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader46();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader84();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter14 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter14.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader16 = serializedObjectSupporter14.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader17 = serializedObjectSupporter14.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader18 = serializedObjectSupporter14.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader19 = serializedObjectSupporter14.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader20 = serializedObjectSupporter14.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader21 = serializedObjectSupporter14.deserializeObjectJaxrsReader69();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader22 = serializedObjectSupporter14.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter23 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader24 = serializedObjectSupporter23.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader25 = serializedObjectSupporter23.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader26 = serializedObjectSupporter23.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader27 = serializedObjectSupporter23.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader28 = serializedObjectSupporter23.deserializeObjectJaxrsReader54();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader29 = serializedObjectSupporter23.deserializeObjectJaxrsReader5();
        java.lang.Class<?> wildcardClass30 = jaxrsReader29.getClass();
        io.swagger.models.Swagger swagger31 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter32 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader33 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger31, logAdapter32);
        springMvcApiReader33.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter36 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader37 = serializedObjectSupporter36.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader33.serializedObjectSupporter = serializedObjectSupporter36;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader39 = serializedObjectSupporter36.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader40 = serializedObjectSupporter36.deserializeObjectJaxrsReader60();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader41 = serializedObjectSupporter36.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader42 = serializedObjectSupporter36.deserializeObjectJaxrsReader2();
        io.swagger.models.Swagger swagger43 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter44 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader45 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger43, logAdapter44);
        java.lang.String str47 = springMvcApiReader45.generateFullPath("hi!");
        io.swagger.models.Swagger swagger48 = null;
        springMvcApiReader45.swagger = swagger48;
        springMvcApiReader45.resourcePath = "hi!";
        io.swagger.models.Swagger swagger52 = null;
        springMvcApiReader45.swagger = swagger52;
        springMvcApiReader45.updateExtensionChain();
        io.swagger.models.Swagger swagger55 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter56 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader57 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger55, logAdapter56);
        io.swagger.models.Swagger swagger58 = null;
        springMvcApiReader57.setswagger(swagger58);
        java.lang.reflect.Type[] typeArray60 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet61 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet61, typeArray60);
        springMvcApiReader57.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet61);
        java.lang.String str64 = springMvcApiReader57.getresourcePath();
        io.swagger.models.Operation operation65 = null;
        io.swagger.annotations.ApiOperation apiOperation66 = null;
        springMvcApiReader57.updateTagsForOperation(operation65, apiOperation66);
        java.lang.Class<?> wildcardClass68 = springMvcApiReader57.getClass();
        io.swagger.models.Swagger swagger69 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter70 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader71 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger69, logAdapter70);
        io.swagger.models.Swagger swagger72 = null;
        springMvcApiReader71.setswagger(swagger72);
        java.lang.reflect.Type[] typeArray74 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet75 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet75, typeArray74);
        springMvcApiReader71.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet75);
        java.lang.String str78 = springMvcApiReader71.getresourcePath();
        java.lang.annotation.Annotation[] annotationArray79 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList80 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList80, annotationArray79);
        boolean boolean82 = springMvcApiReader71.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList80);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList83 = springMvcApiReader45.getParameters((java.lang.reflect.Type) wildcardClass68, (java.util.List<java.lang.annotation.Annotation>) annotationList80);
        boolean boolean84 = jaxrsReader42.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList80);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList85 = springMvcApiReader22.getParameters((java.lang.reflect.Type) wildcardClass30, (java.util.List<java.lang.annotation.Annotation>) annotationList80);
        boolean boolean86 = springMvcApiReader13.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList80);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(jaxrsReader16);
        org.junit.Assert.assertNotNull(jaxrsReader17);
        org.junit.Assert.assertNotNull(jaxrsReader18);
        org.junit.Assert.assertNotNull(springMvcApiReader19);
        org.junit.Assert.assertNotNull(springMvcApiReader20);
        org.junit.Assert.assertNotNull(jaxrsReader21);
        org.junit.Assert.assertNotNull(springMvcApiReader22);
        org.junit.Assert.assertNotNull(springMvcApiReader24);
        org.junit.Assert.assertNotNull(jaxrsReader25);
        org.junit.Assert.assertNotNull(springMvcApiReader26);
        org.junit.Assert.assertNotNull(springMvcApiReader27);
        org.junit.Assert.assertNotNull(jaxrsReader28);
        org.junit.Assert.assertNotNull(jaxrsReader29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(springMvcApiReader37);
        org.junit.Assert.assertNotNull(springMvcApiReader39);
        org.junit.Assert.assertNotNull(jaxrsReader40);
        org.junit.Assert.assertNotNull(springMvcApiReader41);
        org.junit.Assert.assertNotNull(jaxrsReader42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "null/hi!" + "'", str47, "null/hi!");
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(annotationArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(parameterList83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(parameterList85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader61();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader18();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader5();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader75();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader64();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays158();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays131();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader17();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader14 = serializedObjectSupporter5.deserializeObjectJaxrsReader20();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader16 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader17 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader31();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(jaxrsReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(springMvcApiReader16);
        org.junit.Assert.assertNotNull(springMvcApiReader17);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader14();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        io.swagger.models.Swagger swagger2 = springMvcApiReader1.getswagger();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter3 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter3.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter3.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter3.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter3.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter3.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter3.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter3.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter3.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter3.deserializeObjectJaxrsReader34();
        io.swagger.models.Swagger swagger13 = jaxrsReader12.getswagger();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter14 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter14.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader16 = serializedObjectSupporter14.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader17 = serializedObjectSupporter14.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader18 = serializedObjectSupporter14.deserializeObjectJaxrsReader6();
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter19 = jaxrsReader18.LOG;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader20 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger13, logAdapter19);
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader21 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger2, logAdapter19);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(swagger2);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(swagger13);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(jaxrsReader16);
        org.junit.Assert.assertNotNull(jaxrsReader17);
        org.junit.Assert.assertNotNull(jaxrsReader18);
        org.junit.Assert.assertNotNull(logAdapter19);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader20();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays47();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader38();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader11();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter0.deserializeObjectArrays81();
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
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader31();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader62();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays28();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader17();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays6();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays99();
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
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader18();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader63();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader61();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader14 = serializedObjectSupporter5.deserializeObjectJaxrsReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader72();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader16 = serializedObjectSupporter5.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader17 = serializedObjectSupporter5.deserializeObjectJaxrsReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader18 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader13();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(jaxrsReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(jaxrsReader16);
        org.junit.Assert.assertNotNull(jaxrsReader17);
        org.junit.Assert.assertNotNull(springMvcApiReader18);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader5();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader75();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays26();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader82();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader14 = serializedObjectSupporter5.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader15 = serializedObjectSupporter5.deserializeObjectJaxrsReader68();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader16 = serializedObjectSupporter5.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader17 = serializedObjectSupporter5.deserializeObjectJaxrsReader7();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(jaxrsReader14);
        org.junit.Assert.assertNotNull(jaxrsReader15);
        org.junit.Assert.assertNotNull(jaxrsReader16);
        org.junit.Assert.assertNotNull(jaxrsReader17);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader38();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader92();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader63();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader47();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader26();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader56();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader29();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader29();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader69();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays64();
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
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        io.swagger.models.Swagger swagger3 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter4 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger3, logAdapter4);
        java.util.Set<java.lang.reflect.Type> typeSet6 = springMvcApiReader5.typesToSkip;
        jaxrsReader2.typesToSkip = typeSet6;
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter8 = jaxrsReader2.serializedObjectSupporter;
        io.swagger.models.Operation operation9 = null;
        io.swagger.annotations.ApiResponses apiResponses10 = null;
        // The following exception was thrown during execution in test generation
        try {
            jaxrsReader2.updateApiResponse(operation9, apiResponses10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(typeSet6);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter9 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter9.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter9.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter9.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter9.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter9.deserializeObjectSpringMvcApiReader65();
        springMvcApiReader8.serializedObjectSupporter = serializedObjectSupporter9;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays16 = serializedObjectSupporter9.deserializeObjectArrays43();
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
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader76();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays45();
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
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays78();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader65();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays159();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader21();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays14 = serializedObjectSupporter5.deserializeObjectArrays90();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader60();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader74();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader84();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader46();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader37();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter0.deserializeObjectJaxrsReader64();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader8();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader19();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader51();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays159();
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
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader17();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader80();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader82();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader25();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays104();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader25();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        springMvcApiReader3.updateExtensionChain();
        java.lang.String str6 = springMvcApiReader3.generateFullPath("hi!");
        java.util.Set<java.lang.reflect.Type> typeSet7 = springMvcApiReader3.typesToSkip;
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/store/hi!" + "'", str6, "/store/hi!");
        org.junit.Assert.assertNotNull(typeSet7);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader62();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays23();
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
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        java.lang.String str9 = springMvcApiReader8.getresourcePath();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/pet" + "'", str9, "/pet");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader11();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader47();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader3();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader37();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader78();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader29();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader37();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader14();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader6();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader6();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader6();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader38();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader66();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays78();
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
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader75();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader47();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays16 = serializedObjectSupporter5.deserializeObjectArrays3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays66();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader5();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader25();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter6 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter6.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter6.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter6.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter6.deserializeObjectJaxrsReader11();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter6.deserializeObjectJaxrsReader47();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader47();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader38();
        springMvcApiReader5.serializedObjectSupporter = serializedObjectSupporter6;
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader17 = serializedObjectSupporter6.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader18 = serializedObjectSupporter6.deserializeObjectSpringMvcApiReader23();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(jaxrsReader17);
        org.junit.Assert.assertNotNull(springMvcApiReader18);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader78();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader15();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays151();
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
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader82();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader43();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader59();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays135();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader70();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader51();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays113();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays90();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader1();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader16();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader38();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader16 = serializedObjectSupporter5.deserializeObjectJaxrsReader35();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader17 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader82();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(jaxrsReader16);
        org.junit.Assert.assertNotNull(springMvcApiReader17);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader66();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader35();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader10();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays114();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader82();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader43();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader52();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays50();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader89();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays65();
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
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader38();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader50();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader85();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader20();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader47();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader6();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays99();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays57();
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
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader66();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader35();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader5();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter0.deserializeObjectArrays46();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader31();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader62();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays101();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader46();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader56();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays82();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader83();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader2();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays16();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays75();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader54();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader54();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader89();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader64();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays68();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader6();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader35();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader64();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader50();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader84();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader24();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader78();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays135();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader6();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader82();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader25();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays147();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader81();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays71();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader29();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader4();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays57();
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
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader89();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.spring.SpringResource springResource6 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.models.Swagger swagger7 = springMvcApiReader5.read(springResource6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader24();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader46();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader69();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays58();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader38();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader92();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader58();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader64();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader14();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader62();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader17();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader53();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader26();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays53();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader50();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader14 = serializedObjectSupporter5.deserializeObjectJaxrsReader14();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(jaxrsReader14);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader34();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader46();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader8();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays14 = serializedObjectSupporter5.deserializeObjectArrays107();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader8();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader66();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader71();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader10();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader17();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays150();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader78();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader59();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays122();
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
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter0.deserializeObjectJaxrsReader8();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter0.deserializeObjectJaxrsReader54();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter0.deserializeObjectJaxrsReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader47();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader6();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays43();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader29();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader1();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader12 = serializedObjectSupporter5.deserializeObjectJaxrsReader45();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader37();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader1();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays50();
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
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader17();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader53();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader11();
        java.lang.String str9 = springMvcApiReader8.getresourcePath();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(jaxrsReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/user" + "'", str9, "/user");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader50();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader6();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
    }
}

