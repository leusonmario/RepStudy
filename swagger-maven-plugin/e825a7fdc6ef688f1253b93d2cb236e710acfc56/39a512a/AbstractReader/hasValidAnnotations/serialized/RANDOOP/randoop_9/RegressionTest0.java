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
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        io.swagger.models.parameters.Parameter[] parameterArray5 = new io.swagger.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.models.parameters.Parameter> parameterList6 = new java.util.ArrayList<io.swagger.models.parameters.Parameter>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<io.swagger.models.parameters.Parameter>) parameterList6, parameterArray5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        io.swagger.models.Operation operation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.updateOperationParameters((java.util.List<io.swagger.models.parameters.Parameter>) parameterList6, strMap8, operation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNotNull(parameterArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter3 = springMvcApiReader2.getLOG();
        springMvcApiReader2.updateExtensionChain();
        java.lang.reflect.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.models.Operation operation6 = springMvcApiReader2.parseMethod(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(logAdapter3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        com.github.kongchen.swagger.docgen.spring.SpringResource springResource5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.models.Swagger swagger6 = springMvcApiReader2.read(springResource5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        java.lang.String str7 = springMvcApiReader2.parseOperationPath("", strMap6);
        io.swagger.models.Operation operation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.updatePath("", "hi!", operation10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Operation operation3 = null;
        io.swagger.annotations.ApiResponses apiResponses4 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.updateApiResponse(operation3, apiResponses4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        java.lang.String str7 = springMvcApiReader2.parseOperationPath("", strMap6);
        java.lang.reflect.Method method8 = null;
        io.swagger.models.Operation operation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.readImplicitParameters(method8, operation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet6 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet6);
        io.swagger.models.Operation operation9 = null;
        io.swagger.annotations.ApiOperation apiOperation10 = null;
        springMvcApiReader2.updateTagsForOperation(operation9, apiOperation10);
        java.lang.reflect.Method method12 = null;
        io.swagger.models.Operation operation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.readImplicitParameters(method12, operation13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.String str5 = springMvcApiReader2.getresourcePath();
        java.lang.String str6 = springMvcApiReader2.getresourcePath();
        io.swagger.annotations.ApiOperation apiOperation7 = null;
        io.swagger.models.Operation operation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.updateOperationProtocols(apiOperation7, operation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter3 = springMvcApiReader2.getLOG();
        java.lang.String[] strArray5 = new java.lang.String[] { "null/hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        io.swagger.models.Operation operation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = springMvcApiReader2.updateOperationConsumes(strArray5, strArray7, operation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(logAdapter3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList6 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList6);
        java.lang.String str9 = springMvcApiReader2.getresourcePath();
        io.swagger.models.Operation operation10 = null;
        io.swagger.annotations.ApiResponses apiResponses11 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.updateApiResponse(operation10, apiResponses11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet6 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet6);
        com.github.kongchen.swagger.docgen.spring.SpringResource springResource9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.models.Swagger swagger10 = springMvcApiReader2.read(springResource9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.String str5 = springMvcApiReader2.getresourcePath();
        java.lang.reflect.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.models.Operation operation7 = springMvcApiReader2.parseMethod(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet6 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet6);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter9 = springMvcApiReader2.serializedObjectSupporter;
        io.swagger.models.parameters.Parameter[] parameterArray10 = new io.swagger.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.models.parameters.Parameter> parameterList11 = new java.util.ArrayList<io.swagger.models.parameters.Parameter>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<io.swagger.models.parameters.Parameter>) parameterList11, parameterArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        io.swagger.models.Operation operation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.updateOperationParameters((java.util.List<io.swagger.models.parameters.Parameter>) parameterList11, strMap13, operation14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNotNull(parameterArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        java.lang.String str7 = springMvcApiReader2.parseOperationPath("", strMap6);
        io.swagger.annotations.ApiOperation apiOperation8 = null;
        io.swagger.models.Operation operation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.updateOperationProtocols(apiOperation8, operation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter3 = springMvcApiReader2.getLOG();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "null/hi!", "", "hi!", "" };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "null/hi!", "", "null/hi!", "", "" };
        io.swagger.models.Operation operation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = springMvcApiReader2.updateOperationProduces(strArray9, strArray16, operation17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(logAdapter3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        io.swagger.models.Swagger swagger5 = null;
        springMvcApiReader2.swagger = swagger5;
        springMvcApiReader2.resourcePath = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        java.lang.String str11 = springMvcApiReader2.parseOperationPath("hi!", strMap10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/hi!" + "'", str11, "/hi!");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet6 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet6);
        io.swagger.models.Operation operation9 = null;
        io.swagger.annotations.ApiResponses apiResponses10 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.updateApiResponse(operation9, apiResponses10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = springMvcApiReader2.serializedObjectSupporter;
        java.lang.reflect.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.models.Operation operation7 = springMvcApiReader2.parseMethod(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNull(serializedObjectSupporter5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.reflect.Method method3 = null;
        io.swagger.models.Operation operation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.readImplicitParameters(method3, operation4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.String str5 = springMvcApiReader2.getresourcePath();
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter6 = springMvcApiReader2.LOG;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(logAdapter6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        io.swagger.models.Swagger swagger5 = null;
        springMvcApiReader2.swagger = swagger5;
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter7 = null;
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter7;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet6 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet6);
        io.swagger.models.Operation operation9 = null;
        io.swagger.annotations.ApiOperation apiOperation10 = null;
        springMvcApiReader2.updateTagsForOperation(operation9, apiOperation10);
        io.swagger.annotations.Api api12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet13 = springMvcApiReader2.extractTags(api12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet6 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet6);
        java.lang.String str9 = springMvcApiReader2.getresourcePath();
        java.lang.reflect.Type[] typeArray10 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet11 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet11, typeArray10);
        springMvcApiReader2.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet11);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet6 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet6);
        java.lang.String str9 = springMvcApiReader2.getresourcePath();
        io.swagger.models.Operation operation10 = null;
        io.swagger.annotations.ApiOperation apiOperation11 = null;
        springMvcApiReader2.updateTagsForOperation(operation10, apiOperation11);
        io.swagger.models.Operation operation13 = null;
        io.swagger.annotations.ApiOperation apiOperation14 = null;
        springMvcApiReader2.updateTagsForOperation(operation13, apiOperation14);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter3 = springMvcApiReader2.getLOG();
        java.lang.reflect.Method[] methodArray4 = new java.lang.reflect.Method[] {};
        java.util.ArrayList<java.lang.reflect.Method> methodList5 = new java.util.ArrayList<java.lang.reflect.Method>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Method>) methodList5, methodArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> strMap7 = springMvcApiReader2.collectApisByRequestMapping((java.util.List<java.lang.reflect.Method>) methodList5);
        org.junit.Assert.assertNull(logAdapter3);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        java.lang.reflect.Method method5 = null;
        io.swagger.models.Operation operation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.readImplicitParameters(method5, operation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        io.swagger.models.Swagger swagger5 = null;
        springMvcApiReader2.swagger = swagger5;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter7 = springMvcApiReader2.LOG;
        springMvcApiReader2.setresourcePath("/hi!");
        io.swagger.models.Operation operation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.updatePath("", "/hi!", operation12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNull(logAdapter7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        java.lang.reflect.Method method5 = null;
        io.swagger.models.Operation operation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.readImplicitParameters(method5, operation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList6 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList6);
        java.lang.String str9 = springMvcApiReader2.getresourcePath();
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.util.ArrayList<java.lang.reflect.Method> methodList11 = new java.util.ArrayList<java.lang.reflect.Method>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Method>) methodList11, methodArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> strMap13 = springMvcApiReader2.collectApisByRequestMapping((java.util.List<java.lang.reflect.Method>) methodList11);
        java.lang.reflect.Method method14 = null;
        io.swagger.models.Operation operation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.readImplicitParameters(method14, operation15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList6 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList6);
        java.lang.String str9 = springMvcApiReader2.getresourcePath();
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.util.ArrayList<java.lang.reflect.Method> methodList11 = new java.util.ArrayList<java.lang.reflect.Method>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Method>) methodList11, methodArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> strMap13 = springMvcApiReader2.collectApisByRequestMapping((java.util.List<java.lang.reflect.Method>) methodList11);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter14 = springMvcApiReader2.serializedObjectSupporter;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter15 = springMvcApiReader2.LOG;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertNull(logAdapter15);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        io.swagger.models.Swagger swagger5 = null;
        springMvcApiReader2.swagger = swagger5;
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.spring.SpringResource springResource9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.models.Swagger swagger10 = springMvcApiReader2.read(springResource9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter3 = springMvcApiReader2.getLOG();
        springMvcApiReader2.updateExtensionChain();
        io.swagger.models.Operation operation5 = null;
        io.swagger.annotations.ApiResponses apiResponses6 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.updateApiResponse(operation5, apiResponses6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(logAdapter3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList6 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList6);
        java.lang.String str9 = springMvcApiReader2.getresourcePath();
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.util.ArrayList<java.lang.reflect.Method> methodList11 = new java.util.ArrayList<java.lang.reflect.Method>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Method>) methodList11, methodArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> strMap13 = springMvcApiReader2.collectApisByRequestMapping((java.util.List<java.lang.reflect.Method>) methodList11);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter14 = springMvcApiReader2.serializedObjectSupporter;
        io.swagger.models.Operation operation15 = null;
        io.swagger.annotations.ApiOperation apiOperation16 = null;
        springMvcApiReader2.updateTagsForOperation(operation15, apiOperation16);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        java.lang.String str20 = springMvcApiReader2.parseOperationPath("hi!", strMap19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/hi!" + "'", str20, "/hi!");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter3 = springMvcApiReader2.getLOG();
        io.swagger.models.Swagger swagger4 = null;
        springMvcApiReader2.setswagger(swagger4);
        io.swagger.models.Operation operation6 = null;
        io.swagger.annotations.ApiResponses apiResponses7 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.updateApiResponse(operation6, apiResponses7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(logAdapter3);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        io.swagger.models.Swagger swagger5 = null;
        springMvcApiReader2.swagger = swagger5;
        springMvcApiReader2.resourcePath = "hi!";
        io.swagger.models.Swagger swagger9 = null;
        springMvcApiReader2.swagger = swagger9;
        java.lang.reflect.Type type11 = null;
        java.util.List<java.lang.annotation.Annotation> annotationList12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.swagger.models.parameters.Parameter> parameterList13 = springMvcApiReader2.getParameters(type11, annotationList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter3 = springMvcApiReader2.getLOG();
        io.swagger.models.Swagger swagger4 = null;
        springMvcApiReader2.setswagger(swagger4);
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList7 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList7, typeArray6);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList7);
        java.lang.String str10 = springMvcApiReader2.getresourcePath();
        org.junit.Assert.assertNull(logAdapter3);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        io.swagger.models.Swagger swagger5 = null;
        springMvcApiReader2.swagger = swagger5;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter7 = springMvcApiReader2.LOG;
        springMvcApiReader2.setresourcePath("/hi!");
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap10 = null;
        io.swagger.annotations.Api api11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, io.swagger.models.Tag> strMap12 = springMvcApiReader2.updateTagsForApi(strMap10, api11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNull(logAdapter7);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList6 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList6);
        java.lang.String str9 = springMvcApiReader2.getresourcePath();
        springMvcApiReader2.resourcePath = "null/hi!";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        io.swagger.models.Swagger swagger5 = null;
        springMvcApiReader2.swagger = swagger5;
        java.lang.String str7 = springMvcApiReader2.resourcePath;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter3 = springMvcApiReader2.getLOG();
        io.swagger.models.Swagger swagger4 = null;
        springMvcApiReader2.setswagger(swagger4);
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList7 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList7, typeArray6);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList7);
        io.swagger.models.Swagger swagger10 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter11 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger10, logAdapter11);
        io.swagger.models.Swagger swagger13 = null;
        springMvcApiReader12.setswagger(swagger13);
        java.lang.reflect.Type[] typeArray15 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet16 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet16, typeArray15);
        springMvcApiReader12.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet16);
        java.lang.String str19 = springMvcApiReader12.getresourcePath();
        java.lang.annotation.Annotation[] annotationArray20 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList21 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList21, annotationArray20);
        boolean boolean23 = springMvcApiReader12.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList21);
        boolean boolean24 = springMvcApiReader2.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList21);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter25 = springMvcApiReader2.serializedObjectSupporter;
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        io.swagger.models.Operation operation31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray32 = springMvcApiReader2.updateOperationProduces(strArray26, strArray30, operation31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(logAdapter3);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(annotationArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = springMvcApiReader2.serializedObjectSupporter;
        java.lang.String str6 = springMvcApiReader2.resourcePath;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Operation operation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.updatePath("", "/hi!", operation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter3 = springMvcApiReader2.getLOG();
        io.swagger.models.Swagger swagger4 = null;
        springMvcApiReader2.setswagger(swagger4);
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList7 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList7, typeArray6);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList7);
        io.swagger.models.Swagger swagger10 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter11 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger10, logAdapter11);
        io.swagger.models.Swagger swagger13 = null;
        springMvcApiReader12.setswagger(swagger13);
        java.lang.reflect.Type[] typeArray15 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet16 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet16, typeArray15);
        springMvcApiReader12.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet16);
        java.lang.String str19 = springMvcApiReader12.getresourcePath();
        java.lang.annotation.Annotation[] annotationArray20 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList21 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList21, annotationArray20);
        boolean boolean23 = springMvcApiReader12.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList21);
        boolean boolean24 = springMvcApiReader2.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList21);
        io.swagger.annotations.Api api25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.swagger.models.SecurityRequirement> securityRequirementList26 = springMvcApiReader2.getSecurityRequirements(api25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(logAdapter3);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(annotationArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays1 = serializedObjectSupporter0.deserializeObjectArrays44();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays1 = serializedObjectSupporter0.deserializeObjectArrays96();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays156();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays42();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays16();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet6 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet6);
        java.lang.String str9 = springMvcApiReader2.getresourcePath();
        java.lang.annotation.Annotation[] annotationArray10 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList11 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList11, annotationArray10);
        boolean boolean13 = springMvcApiReader2.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList11);
        io.swagger.annotations.Api api15 = null;
        boolean boolean16 = springMvcApiReader2.canReadApi(false, api15);
        io.swagger.models.Swagger swagger17 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter18 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader19 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger17, logAdapter18);
        java.util.Set<java.lang.reflect.Type> typeSet20 = springMvcApiReader19.typesToSkip;
        springMvcApiReader2.typesToSkip = typeSet20;
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(annotationArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(typeSet20);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays1 = serializedObjectSupporter0.deserializeObjectArrays3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays85();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter5.deserializeObjectArrays75();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList6 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList6);
        java.lang.String str9 = springMvcApiReader2.getresourcePath();
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.util.ArrayList<java.lang.reflect.Method> methodList11 = new java.util.ArrayList<java.lang.reflect.Method>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Method>) methodList11, methodArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> strMap13 = springMvcApiReader2.collectApisByRequestMapping((java.util.List<java.lang.reflect.Method>) methodList11);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter14 = springMvcApiReader2.serializedObjectSupporter;
        io.swagger.models.Operation operation15 = null;
        io.swagger.annotations.ApiOperation apiOperation16 = null;
        springMvcApiReader2.updateTagsForOperation(operation15, apiOperation16);
        java.util.List<java.lang.reflect.Type> typeList18 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.setTypesToSkip(typeList18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays1 = serializedObjectSupporter0.deserializeObjectArrays24();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter5.deserializeObjectArrays144();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        java.lang.reflect.Method method2 = null;
        io.swagger.models.Operation operation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader1.readImplicitParameters(method2, operation3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays34();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays159();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter5.deserializeObjectArrays104();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays133();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays1 = serializedObjectSupporter0.deserializeObjectArrays129();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter5.deserializeObjectArrays72();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter5.deserializeObjectArrays24();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays154();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays36();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays47();
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays20();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter5.deserializeObjectArrays143();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter5.deserializeObjectArrays34();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays21();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter5.deserializeObjectArrays148();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays47();
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
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays151();
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays115();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays145();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader38();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays99();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays10();
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays156();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays68();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.String str5 = springMvcApiReader2.getresourcePath();
        java.lang.String str6 = springMvcApiReader2.getresourcePath();
        io.swagger.models.Swagger swagger7 = null;
        springMvcApiReader2.swagger = swagger7;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays138();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays108();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays47();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        io.swagger.models.Swagger swagger2 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter3 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger2, logAdapter3);
        io.swagger.models.Swagger swagger5 = null;
        springMvcApiReader4.setswagger(swagger5);
        java.lang.reflect.Type[] typeArray7 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet8 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet8, typeArray7);
        springMvcApiReader4.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet8);
        java.lang.String str11 = springMvcApiReader4.getresourcePath();
        io.swagger.models.Operation operation12 = null;
        io.swagger.annotations.ApiOperation apiOperation13 = null;
        springMvcApiReader4.updateTagsForOperation(operation12, apiOperation13);
        java.lang.Class<?> wildcardClass15 = springMvcApiReader4.getClass();
        java.util.List<java.lang.annotation.Annotation> annotationList16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.swagger.models.parameters.Parameter> parameterList17 = jaxrsReader1.getParameters((java.lang.reflect.Type) wildcardClass15, annotationList16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays46();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays144();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays43();
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter5.deserializeObjectArrays64();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays96();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader38();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays56();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader61();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays123();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays147();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays96();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays93();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays115();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader82();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays28();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays72();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays137();
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
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader88();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays148();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays158();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays38();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays153();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays120();
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter3 = springMvcApiReader2.getLOG();
        io.swagger.models.Swagger swagger4 = null;
        springMvcApiReader2.setswagger(swagger4);
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList7 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList7, typeArray6);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList7);
        java.util.Set<java.lang.reflect.Type> typeSet10 = springMvcApiReader2.getTypesToSkip();
        springMvcApiReader2.updateExtensionChain();
        org.junit.Assert.assertNull(logAdapter3);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(typeSet10);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays102();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays89();
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
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays27();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader63();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays63();
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.spring.SpringResource springResource4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.models.Swagger swagger5 = springMvcApiReader3.read(springResource4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays143();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader38();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays53();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader63();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays21();
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
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays129();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays9();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays5();
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
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays113();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader10();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays66();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays34();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays51();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays142();
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays111();
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays11();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays40();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays95();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays124();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays39();
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
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays104();
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays148();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays109();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays122();
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
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays22();
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays68();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader82();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays116();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays65();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays84();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays58();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays159();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader90();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays33();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter5.deserializeObjectArrays30();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.reflect.Method method5 = null;
        io.swagger.models.Operation operation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.readImplicitParameters(method5, operation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays119();
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
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays52();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays90();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays62();
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays86();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays162();
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays97();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays22();
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
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter5.deserializeObjectArrays100();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays85();
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
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays83();
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
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays1 = serializedObjectSupporter0.deserializeObjectArrays101();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList6 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList6);
        java.lang.String str9 = springMvcApiReader2.getresourcePath();
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.util.ArrayList<java.lang.reflect.Method> methodList11 = new java.util.ArrayList<java.lang.reflect.Method>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Method>) methodList11, methodArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> strMap13 = springMvcApiReader2.collectApisByRequestMapping((java.util.List<java.lang.reflect.Method>) methodList11);
        io.swagger.annotations.Api api15 = null;
        boolean boolean16 = springMvcApiReader2.canReadApi(true, api15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays153();
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays23();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays44();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader62();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays94();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays80();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays20();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter3 = springMvcApiReader2.getLOG();
        io.swagger.models.Swagger swagger4 = null;
        springMvcApiReader2.setswagger(swagger4);
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList7 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList7, typeArray6);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList7);
        io.swagger.models.Swagger swagger10 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter11 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger10, logAdapter11);
        io.swagger.models.Swagger swagger13 = null;
        springMvcApiReader12.setswagger(swagger13);
        java.lang.reflect.Type[] typeArray15 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet16 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet16, typeArray15);
        springMvcApiReader12.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet16);
        java.lang.String str19 = springMvcApiReader12.getresourcePath();
        java.lang.annotation.Annotation[] annotationArray20 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList21 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList21, annotationArray20);
        boolean boolean23 = springMvcApiReader12.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList21);
        boolean boolean24 = springMvcApiReader2.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList21);
        io.swagger.models.Swagger swagger25 = springMvcApiReader2.swagger;
        org.junit.Assert.assertNull(logAdapter3);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(annotationArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(swagger25);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader10();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays112();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter3 = springMvcApiReader2.getLOG();
        springMvcApiReader2.setresourcePath("hi!");
        java.lang.String str6 = springMvcApiReader2.resourcePath;
        org.junit.Assert.assertNull(logAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader57();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays104();
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays136();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader50();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays2();
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
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays132();
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
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader63();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter11 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter11.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = serializedObjectSupporter11.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter15 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader16 = serializedObjectSupporter15.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader17 = serializedObjectSupporter15.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader18 = serializedObjectSupporter15.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader19 = serializedObjectSupporter15.deserializeObjectSpringMvcApiReader27();
        java.lang.String[] strArray24 = new java.lang.String[] { "/hi!", "/hi!", "", "null/hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "" };
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap28 = null;
        java.util.List<io.swagger.models.SecurityRequirement> securityRequirementList29 = null;
        io.swagger.models.Operation operation30 = null;
        springMvcApiReader19.updateOperation(strArray24, strArray27, strMap28, securityRequirementList29, operation30);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter32 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader33 = serializedObjectSupporter32.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader34 = serializedObjectSupporter32.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader35 = serializedObjectSupporter32.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader36 = serializedObjectSupporter32.deserializeObjectSpringMvcApiReader27();
        java.lang.String[] strArray41 = new java.lang.String[] { "/hi!", "/hi!", "", "null/hi!" };
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "" };
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap45 = null;
        java.util.List<io.swagger.models.SecurityRequirement> securityRequirementList46 = null;
        io.swagger.models.Operation operation47 = null;
        springMvcApiReader36.updateOperation(strArray41, strArray44, strMap45, securityRequirementList46, operation47);
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap49 = null;
        io.swagger.models.SecurityRequirement[] securityRequirementArray50 = new io.swagger.models.SecurityRequirement[] {};
        java.util.ArrayList<io.swagger.models.SecurityRequirement> securityRequirementList51 = new java.util.ArrayList<io.swagger.models.SecurityRequirement>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<io.swagger.models.SecurityRequirement>) securityRequirementList51, securityRequirementArray50);
        io.swagger.models.Operation operation53 = null;
        springMvcApiReader14.updateOperation(strArray24, strArray44, strMap49, (java.util.List<io.swagger.models.SecurityRequirement>) securityRequirementList51, operation53);
        java.lang.String[] strArray55 = null;
        io.swagger.models.Operation operation56 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray57 = springMvcApiReader10.updateOperationProduces(strArray24, strArray55, operation56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(springMvcApiReader14);
        org.junit.Assert.assertNotNull(springMvcApiReader16);
        org.junit.Assert.assertNotNull(jaxrsReader17);
        org.junit.Assert.assertNotNull(jaxrsReader18);
        org.junit.Assert.assertNotNull(springMvcApiReader19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(springMvcApiReader33);
        org.junit.Assert.assertNotNull(jaxrsReader34);
        org.junit.Assert.assertNotNull(jaxrsReader35);
        org.junit.Assert.assertNotNull(springMvcApiReader36);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(securityRequirementArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays147();
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays56();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays118();
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays120();
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays127();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter5.deserializeObjectArrays14();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        java.util.Set<java.lang.reflect.Type> typeSet10 = springMvcApiReader9.getTypesToSkip();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(typeSet10);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter5.deserializeObjectArrays100();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays60();
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
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader39();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays70();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader60();
        io.swagger.annotations.ApiOperation apiOperation10 = null;
        io.swagger.models.Operation operation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jaxrsReader9.updateOperationProtocols(apiOperation10, operation11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays83();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays151();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays152();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays16();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays45();
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader26();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays16();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        io.swagger.models.parameters.Parameter[] parameterArray12 = new io.swagger.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.models.parameters.Parameter> parameterList13 = new java.util.ArrayList<io.swagger.models.parameters.Parameter>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<io.swagger.models.parameters.Parameter>) parameterList13, parameterArray12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        io.swagger.models.Operation operation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            jaxrsReader11.updateOperationParameters((java.util.List<io.swagger.models.parameters.Parameter>) parameterList13, strMap15, operation16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(parameterArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader9();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays8();
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays75();
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader63();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays156();
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays151();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.String str5 = springMvcApiReader2.getresourcePath();
        java.lang.reflect.Method[] methodArray6 = new java.lang.reflect.Method[] {};
        java.util.ArrayList<java.lang.reflect.Method> methodList7 = new java.util.ArrayList<java.lang.reflect.Method>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Method>) methodList7, methodArray6);
        java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> strMap9 = springMvcApiReader2.collectApisByRequestMapping((java.util.List<java.lang.reflect.Method>) methodList7);
        io.swagger.models.Swagger swagger10 = null;
        springMvcApiReader2.setswagger(swagger10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(methodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList6 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList6);
        java.lang.String str9 = springMvcApiReader2.getresourcePath();
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.util.ArrayList<java.lang.reflect.Method> methodList11 = new java.util.ArrayList<java.lang.reflect.Method>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Method>) methodList11, methodArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> strMap13 = springMvcApiReader2.collectApisByRequestMapping((java.util.List<java.lang.reflect.Method>) methodList11);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter14 = springMvcApiReader2.serializedObjectSupporter;
        io.swagger.models.Operation operation15 = null;
        io.swagger.annotations.ApiOperation apiOperation16 = null;
        springMvcApiReader2.updateTagsForOperation(operation15, apiOperation16);
        springMvcApiReader2.setresourcePath("hi!");
        java.lang.reflect.Type type20 = null;
        io.swagger.models.Swagger swagger21 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter22 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader23 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger21, logAdapter22);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter24 = springMvcApiReader23.getLOG();
        io.swagger.models.Swagger swagger25 = null;
        springMvcApiReader23.setswagger(swagger25);
        java.lang.reflect.Type[] typeArray27 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList28 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList28, typeArray27);
        springMvcApiReader23.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList28);
        io.swagger.models.Swagger swagger31 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter32 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader33 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger31, logAdapter32);
        io.swagger.models.Swagger swagger34 = null;
        springMvcApiReader33.setswagger(swagger34);
        java.lang.reflect.Type[] typeArray36 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet37 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet37, typeArray36);
        springMvcApiReader33.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet37);
        java.lang.String str40 = springMvcApiReader33.getresourcePath();
        java.lang.annotation.Annotation[] annotationArray41 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList42 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList42, annotationArray41);
        boolean boolean44 = springMvcApiReader33.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList42);
        boolean boolean45 = springMvcApiReader23.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList42);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList46 = springMvcApiReader2.getParameters(type20, (java.util.List<java.lang.annotation.Annotation>) annotationList42);
        java.util.Set<java.lang.reflect.Type> typeSet47 = springMvcApiReader2.typesToSkip;
        io.swagger.models.Swagger swagger48 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter49 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader50 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger48, logAdapter49);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter51 = springMvcApiReader50.getLOG();
        springMvcApiReader50.setresourcePath("hi!");
        io.swagger.models.Swagger swagger54 = springMvcApiReader50.swagger;
        io.swagger.models.Swagger swagger55 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter56 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader57 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger55, logAdapter56);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter58 = springMvcApiReader57.getLOG();
        io.swagger.models.Swagger swagger59 = null;
        springMvcApiReader57.setswagger(swagger59);
        java.lang.reflect.Type[] typeArray61 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList62 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList62, typeArray61);
        springMvcApiReader57.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList62);
        springMvcApiReader50.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList62);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList62);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertNull(logAdapter24);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(annotationArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(parameterList46);
        org.junit.Assert.assertNotNull(typeSet47);
        org.junit.Assert.assertNull(logAdapter51);
        org.junit.Assert.assertNull(swagger54);
        org.junit.Assert.assertNull(logAdapter58);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays27();
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader39();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays141();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader50();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays63();
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays72();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays1 = serializedObjectSupporter0.deserializeObjectArrays68();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays93();
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader50();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays142();
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
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays68();
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays75();
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays18();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays109();
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader88();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays146();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays157();
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.String str5 = springMvcApiReader2.getresourcePath();
        java.lang.String str6 = springMvcApiReader2.getresourcePath();
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter7 = springMvcApiReader2.getLOG();
        com.github.kongchen.swagger.docgen.spring.SpringResource springResource8 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.models.Swagger swagger9 = springMvcApiReader2.read(springResource8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(logAdapter7);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays69();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader48();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays46();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader5();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays141();
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
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader82();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader58();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays49();
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
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        io.swagger.models.Swagger swagger3 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter4 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger3, logAdapter4);
        java.util.Set<java.lang.reflect.Type> typeSet6 = springMvcApiReader5.typesToSkip;
        jaxrsReader2.typesToSkip = typeSet6;
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(typeSet6);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader82();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays96();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter5.deserializeObjectArrays84();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays75();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays97();
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
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays39();
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
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader84();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays136();
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
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays66();
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
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays157();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays86();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter4 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter4.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter4.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter4.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter8 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter8.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter8.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader27();
        java.lang.String[] strArray17 = new java.lang.String[] { "/hi!", "/hi!", "", "null/hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "" };
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap21 = null;
        java.util.List<io.swagger.models.SecurityRequirement> securityRequirementList22 = null;
        io.swagger.models.Operation operation23 = null;
        springMvcApiReader12.updateOperation(strArray17, strArray20, strMap21, securityRequirementList22, operation23);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter25 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader26 = serializedObjectSupporter25.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader27 = serializedObjectSupporter25.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader28 = serializedObjectSupporter25.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader29 = serializedObjectSupporter25.deserializeObjectSpringMvcApiReader27();
        java.lang.String[] strArray34 = new java.lang.String[] { "/hi!", "/hi!", "", "null/hi!" };
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "" };
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap38 = null;
        java.util.List<io.swagger.models.SecurityRequirement> securityRequirementList39 = null;
        io.swagger.models.Operation operation40 = null;
        springMvcApiReader29.updateOperation(strArray34, strArray37, strMap38, securityRequirementList39, operation40);
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap42 = null;
        io.swagger.models.SecurityRequirement[] securityRequirementArray43 = new io.swagger.models.SecurityRequirement[] {};
        java.util.ArrayList<io.swagger.models.SecurityRequirement> securityRequirementList44 = new java.util.ArrayList<io.swagger.models.SecurityRequirement>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<io.swagger.models.SecurityRequirement>) securityRequirementList44, securityRequirementArray43);
        io.swagger.models.Operation operation46 = null;
        springMvcApiReader7.updateOperation(strArray17, strArray37, strMap42, (java.util.List<io.swagger.models.SecurityRequirement>) securityRequirementList44, operation46);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter48 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader49 = serializedObjectSupporter48.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader50 = serializedObjectSupporter48.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader51 = serializedObjectSupporter48.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader52 = serializedObjectSupporter48.deserializeObjectSpringMvcApiReader27();
        java.lang.String[] strArray57 = new java.lang.String[] { "/hi!", "/hi!", "", "null/hi!" };
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "" };
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap61 = null;
        java.util.List<io.swagger.models.SecurityRequirement> securityRequirementList62 = null;
        io.swagger.models.Operation operation63 = null;
        springMvcApiReader52.updateOperation(strArray57, strArray60, strMap61, securityRequirementList62, operation63);
        io.swagger.models.Operation operation65 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray66 = jaxrsReader3.updateOperationConsumes(strArray37, strArray57, operation65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(springMvcApiReader26);
        org.junit.Assert.assertNotNull(jaxrsReader27);
        org.junit.Assert.assertNotNull(jaxrsReader28);
        org.junit.Assert.assertNotNull(springMvcApiReader29);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(securityRequirementArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(springMvcApiReader49);
        org.junit.Assert.assertNotNull(jaxrsReader50);
        org.junit.Assert.assertNotNull(jaxrsReader51);
        org.junit.Assert.assertNotNull(springMvcApiReader52);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray60);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays38();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter5.deserializeObjectArrays117();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays62();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader29();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays42();
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
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays66();
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader57();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays67();
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
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays107();
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
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays109();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays133();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays150();
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays131();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader88();
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
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays86();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList6 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList6);
        java.lang.String str9 = springMvcApiReader2.getresourcePath();
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.util.ArrayList<java.lang.reflect.Method> methodList11 = new java.util.ArrayList<java.lang.reflect.Method>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Method>) methodList11, methodArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> strMap13 = springMvcApiReader2.collectApisByRequestMapping((java.util.List<java.lang.reflect.Method>) methodList11);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter14 = springMvcApiReader2.serializedObjectSupporter;
        io.swagger.models.Operation operation15 = null;
        io.swagger.annotations.ApiOperation apiOperation16 = null;
        springMvcApiReader2.updateTagsForOperation(operation15, apiOperation16);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter18 = springMvcApiReader2.getLOG();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertNull(logAdapter18);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays42();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays6();
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays3();
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays15();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays117();
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader60();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays124();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays19();
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
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays105();
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
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader62();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays57();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
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
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader17();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays76();
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader68();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays70();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays159();
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
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader9();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays2();
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
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader29();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader22();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays26();
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
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays162();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays8();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader63();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays158();
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader29();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays71();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays117();
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays57();
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader85();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays105();
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
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays114();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays66();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays50();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        java.lang.reflect.Method method4 = null;
        io.swagger.models.Operation operation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader3.readImplicitParameters(method4, operation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays34();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays31();
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
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays151();
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader90();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays46();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader71();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays46();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader26();
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays11();
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader10();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader17();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays143();
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays124();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays59();
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
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays93();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader62();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays81();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays15();
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        io.swagger.annotations.ResponseHeader responseHeader11 = null;
        io.swagger.annotations.ResponseHeader[] responseHeaderArray12 = new io.swagger.annotations.ResponseHeader[] { responseHeader11 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, io.swagger.models.properties.Property> strMap13 = jaxrsReader10.parseResponseHeaders(responseHeaderArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(responseHeaderArray12);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays134();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader57();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays144();
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays158();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader80();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays43();
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
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays41();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader62();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays99();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
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
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader33();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays48();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList6 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList6);
        java.lang.String str9 = springMvcApiReader2.getresourcePath();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = springMvcApiReader2.parseOperationPath("null/hi!", strMap11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/null/hi!" + "'", str12, "/null/hi!");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays74();
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays119();
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
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays104();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays120();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays62();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays82();
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays14();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays78();
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays59();
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader24();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays14 = serializedObjectSupporter5.deserializeObjectArrays31();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays20();
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays98();
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays151();
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays60();
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader84();
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.models.Operation operation9 = springMvcApiReader7.parseMethod(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays27();
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays17();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.util.Set<java.lang.reflect.Type> typeSet3 = springMvcApiReader2.getTypesToSkip();
        java.lang.String str5 = springMvcApiReader2.generateFullPath("/hi!");
        org.junit.Assert.assertNotNull(typeSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null/hi!" + "'", str5, "null/hi!");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays148();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays82();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays137();
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
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader66();
        java.lang.String str10 = springMvcApiReader9.resourcePath;
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/user" + "'", str10, "/user");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader31();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays149();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays26();
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays66();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader31();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays23();
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
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays29();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays53();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays33();
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays126();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays122();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader85();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays31();
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader3();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader53();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays122();
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
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays76();
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
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays40();
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays126();
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader39();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays1();
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
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader93();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays61();
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
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader31();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays140();
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader28();
        io.swagger.annotations.Api api13 = null;
        boolean boolean14 = jaxrsReader11.canReadApi(false, api13);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays79();
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
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays36();
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
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        io.swagger.models.Swagger swagger5 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter6 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger5, logAdapter6);
        io.swagger.models.Swagger swagger8 = null;
        springMvcApiReader7.setswagger(swagger8);
        java.lang.reflect.Type[] typeArray10 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet11 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet11, typeArray10);
        springMvcApiReader7.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet11);
        java.lang.String str14 = springMvcApiReader7.getresourcePath();
        java.lang.annotation.Annotation[] annotationArray15 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList16 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList16, annotationArray15);
        boolean boolean18 = springMvcApiReader7.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList16);
        boolean boolean19 = jaxrsReader4.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList16);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(annotationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader22();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays21();
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        java.lang.reflect.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.models.Operation operation6 = springMvcApiReader4.parseMethod(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays57();
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
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader11();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader47();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays95();
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
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays36();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays20();
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
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays23();
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
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays116();
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
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays63();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays14();
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
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays134();
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays6();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader84();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays41();
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
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays82();
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
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays53();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader61();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = jaxrsReader9.parseOperationPath("/hi!", strMap11);
        io.swagger.models.Operation operation13 = null;
        io.swagger.annotations.ApiOperation apiOperation14 = null;
        jaxrsReader9.updateTagsForOperation(operation13, apiOperation14);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!" + "'", str12, "/hi!");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter5.deserializeObjectArrays128();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader49();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        io.swagger.models.Operation operation9 = null;
        io.swagger.annotations.ApiOperation apiOperation10 = null;
        springMvcApiReader8.updateTagsForOperation(operation9, apiOperation10);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays35();
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader51();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays102();
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays162();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader74();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader18();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays12();
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
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays87();
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
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays133();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter8 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter8.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter8.deserializeObjectSpringMvcApiReader87();
        springMvcApiReader11.updateExtensionChain();
        java.lang.String[] strArray13 = null;
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter14 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader15 = serializedObjectSupporter14.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader16 = serializedObjectSupporter14.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader17 = serializedObjectSupporter14.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter18 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader19 = serializedObjectSupporter18.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader20 = serializedObjectSupporter18.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader21 = serializedObjectSupporter18.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader22 = serializedObjectSupporter18.deserializeObjectSpringMvcApiReader27();
        java.lang.String[] strArray27 = new java.lang.String[] { "/hi!", "/hi!", "", "null/hi!" };
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "" };
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap31 = null;
        java.util.List<io.swagger.models.SecurityRequirement> securityRequirementList32 = null;
        io.swagger.models.Operation operation33 = null;
        springMvcApiReader22.updateOperation(strArray27, strArray30, strMap31, securityRequirementList32, operation33);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter35 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader36 = serializedObjectSupporter35.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader37 = serializedObjectSupporter35.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader38 = serializedObjectSupporter35.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader39 = serializedObjectSupporter35.deserializeObjectSpringMvcApiReader27();
        java.lang.String[] strArray44 = new java.lang.String[] { "/hi!", "/hi!", "", "null/hi!" };
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "" };
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap48 = null;
        java.util.List<io.swagger.models.SecurityRequirement> securityRequirementList49 = null;
        io.swagger.models.Operation operation50 = null;
        springMvcApiReader39.updateOperation(strArray44, strArray47, strMap48, securityRequirementList49, operation50);
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap52 = null;
        io.swagger.models.SecurityRequirement[] securityRequirementArray53 = new io.swagger.models.SecurityRequirement[] {};
        java.util.ArrayList<io.swagger.models.SecurityRequirement> securityRequirementList54 = new java.util.ArrayList<io.swagger.models.SecurityRequirement>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<io.swagger.models.SecurityRequirement>) securityRequirementList54, securityRequirementArray53);
        io.swagger.models.Operation operation56 = null;
        springMvcApiReader17.updateOperation(strArray27, strArray47, strMap52, (java.util.List<io.swagger.models.SecurityRequirement>) securityRequirementList54, operation56);
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap58 = null;
        io.swagger.models.SecurityRequirement[] securityRequirementArray59 = new io.swagger.models.SecurityRequirement[] {};
        java.util.ArrayList<io.swagger.models.SecurityRequirement> securityRequirementList60 = new java.util.ArrayList<io.swagger.models.SecurityRequirement>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<io.swagger.models.SecurityRequirement>) securityRequirementList60, securityRequirementArray59);
        io.swagger.models.Operation operation62 = null;
        springMvcApiReader11.updateOperation(strArray13, strArray27, strMap58, (java.util.List<io.swagger.models.SecurityRequirement>) securityRequirementList60, operation62);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter64 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader65 = serializedObjectSupporter64.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader66 = serializedObjectSupporter64.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader67 = serializedObjectSupporter64.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader68 = serializedObjectSupporter64.deserializeObjectSpringMvcApiReader27();
        java.lang.String[] strArray73 = new java.lang.String[] { "/hi!", "/hi!", "", "null/hi!" };
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "" };
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap77 = null;
        java.util.List<io.swagger.models.SecurityRequirement> securityRequirementList78 = null;
        io.swagger.models.Operation operation79 = null;
        springMvcApiReader68.updateOperation(strArray73, strArray76, strMap77, securityRequirementList78, operation79);
        io.swagger.models.Operation operation81 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray82 = springMvcApiReader2.updateOperationConsumes(strArray27, strArray76, operation81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader15);
        org.junit.Assert.assertNotNull(jaxrsReader16);
        org.junit.Assert.assertNotNull(springMvcApiReader17);
        org.junit.Assert.assertNotNull(springMvcApiReader19);
        org.junit.Assert.assertNotNull(jaxrsReader20);
        org.junit.Assert.assertNotNull(jaxrsReader21);
        org.junit.Assert.assertNotNull(springMvcApiReader22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(springMvcApiReader36);
        org.junit.Assert.assertNotNull(jaxrsReader37);
        org.junit.Assert.assertNotNull(jaxrsReader38);
        org.junit.Assert.assertNotNull(springMvcApiReader39);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(securityRequirementArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(securityRequirementArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(springMvcApiReader65);
        org.junit.Assert.assertNotNull(jaxrsReader66);
        org.junit.Assert.assertNotNull(jaxrsReader67);
        org.junit.Assert.assertNotNull(springMvcApiReader68);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray76);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader51();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays118();
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        java.lang.reflect.Method method3 = null;
        io.swagger.models.Operation operation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jaxrsReader2.readImplicitParameters(method3, operation4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader50();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays68();
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader43();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays131();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays26();
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
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader11 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader65();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays133();
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
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader40();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays121();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays121();
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.util.ArrayList<java.lang.reflect.Method> methodList3 = new java.util.ArrayList<java.lang.reflect.Method>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Method>) methodList3, methodArray2);
        java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> strMap5 = springMvcApiReader1.collectApisByRequestMapping((java.util.List<java.lang.reflect.Method>) methodList3);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays2 = serializedObjectSupporter0.deserializeObjectArrays84();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet6 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet6);
        io.swagger.models.Operation operation9 = null;
        io.swagger.annotations.ApiOperation apiOperation10 = null;
        springMvcApiReader2.updateTagsForOperation(operation9, apiOperation10);
        io.swagger.models.Operation operation12 = null;
        io.swagger.annotations.ApiResponses apiResponses13 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.updateApiResponse(operation12, apiResponses13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays108();
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader84();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader48();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays141();
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
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays17();
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
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        io.swagger.annotations.Api api13 = null;
        boolean boolean14 = jaxrsReader11.canReadApi(false, api13);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader93();
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader9 = serializedObjectSupporter5.deserializeObjectJaxrsReader33();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays32();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays49();
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
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays93();
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader14 = serializedObjectSupporter5.deserializeObjectJaxrsReader59();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
        org.junit.Assert.assertNotNull(jaxrsReader14);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays69();
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
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        io.swagger.models.Swagger swagger3 = null;
        springMvcApiReader2.setswagger(swagger3);
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet6 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet6, typeArray5);
        springMvcApiReader2.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet6);
        java.lang.String str9 = springMvcApiReader2.getresourcePath();
        io.swagger.models.Operation operation10 = null;
        io.swagger.annotations.ApiOperation apiOperation11 = null;
        springMvcApiReader2.updateTagsForOperation(operation10, apiOperation11);
        io.swagger.models.Swagger swagger13 = springMvcApiReader2.swagger;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter14 = springMvcApiReader2.LOG;
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(swagger13);
        org.junit.Assert.assertNull(logAdapter14);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader10();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader17();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays98();
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays31();
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
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader60();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays21();
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
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        io.swagger.models.Operation operation5 = null;
        io.swagger.annotations.ApiResponses apiResponses6 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader4.updateApiResponse(operation5, apiResponses6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays15();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader9();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays148();
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
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader93();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays155();
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
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader62();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader73();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays52();
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
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays74();
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
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.util.Set<java.lang.reflect.Type> typeSet3 = springMvcApiReader2.typesToSkip;
        io.swagger.annotations.ApiOperation apiOperation4 = null;
        io.swagger.models.Operation operation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader2.updateOperationProtocols(apiOperation4, operation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeSet3);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays47();
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays62();
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
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays148();
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
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader3();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader66();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays83();
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
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader66();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays129();
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays40();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays28();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader34();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays83();
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
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader6();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays88();
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader18();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays100();
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader88();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader63();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays27();
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
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
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(jaxrsReader5);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays127();
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
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader55();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader68();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays93();
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
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays14 = serializedObjectSupporter5.deserializeObjectArrays105();
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
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays14 = serializedObjectSupporter5.deserializeObjectArrays155();
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
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays122();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        jaxrsReader13.updateExtensionChain();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
        org.junit.Assert.assertNotNull(jaxrsReader13);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader57();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays158();
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
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader87();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader90();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader6();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays134();
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader28();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader42();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays8();
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
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader11();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays80();
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader85();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays30();
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader78();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays67();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays55();
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader88();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays83();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays48();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays82();
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays121();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(jaxrsReader12);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays89();
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
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader2();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader60();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays159();
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays134();
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays54();
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
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader13 = serializedObjectSupporter5.deserializeObjectJaxrsReader16();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays14 = serializedObjectSupporter5.deserializeObjectArrays47();
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
        org.junit.Assert.assertNotNull(jaxrsReader13);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader68();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays6();
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.models.Operation operation14 = springMvcApiReader12.parseMethod(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays67();
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader46();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays65();
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
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader29();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays109();
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays5();
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader51();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays31();
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
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader40();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays74();
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays75();
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader51();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays124();
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays79();
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays6();
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays61();
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
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        io.swagger.models.Swagger swagger11 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter12 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger11, logAdapter12);
        java.lang.String str15 = springMvcApiReader13.generateFullPath("hi!");
        java.lang.reflect.Type[] typeArray16 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList17 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList17, typeArray16);
        springMvcApiReader13.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList17);
        java.lang.String str20 = springMvcApiReader13.getresourcePath();
        java.lang.reflect.Method[] methodArray21 = new java.lang.reflect.Method[] {};
        java.util.ArrayList<java.lang.reflect.Method> methodList22 = new java.util.ArrayList<java.lang.reflect.Method>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Method>) methodList22, methodArray21);
        java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> strMap24 = springMvcApiReader13.collectApisByRequestMapping((java.util.List<java.lang.reflect.Method>) methodList22);
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter25 = springMvcApiReader13.serializedObjectSupporter;
        io.swagger.models.Operation operation26 = null;
        io.swagger.annotations.ApiOperation apiOperation27 = null;
        springMvcApiReader13.updateTagsForOperation(operation26, apiOperation27);
        springMvcApiReader13.setresourcePath("hi!");
        java.lang.reflect.Type type31 = null;
        io.swagger.models.Swagger swagger32 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter33 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader34 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger32, logAdapter33);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter35 = springMvcApiReader34.getLOG();
        io.swagger.models.Swagger swagger36 = null;
        springMvcApiReader34.setswagger(swagger36);
        java.lang.reflect.Type[] typeArray38 = new java.lang.reflect.Type[] {};
        java.util.ArrayList<java.lang.reflect.Type> typeList39 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList39, typeArray38);
        springMvcApiReader34.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList39);
        io.swagger.models.Swagger swagger42 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter43 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader44 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger42, logAdapter43);
        io.swagger.models.Swagger swagger45 = null;
        springMvcApiReader44.setswagger(swagger45);
        java.lang.reflect.Type[] typeArray47 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet48 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet48, typeArray47);
        springMvcApiReader44.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet48);
        java.lang.String str51 = springMvcApiReader44.getresourcePath();
        java.lang.annotation.Annotation[] annotationArray52 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList53 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList53, annotationArray52);
        boolean boolean55 = springMvcApiReader44.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList53);
        boolean boolean56 = springMvcApiReader34.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList53);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList57 = springMvcApiReader13.getParameters(type31, (java.util.List<java.lang.annotation.Annotation>) annotationList53);
        java.util.Map<java.lang.String, java.lang.String> strMap58 = null;
        io.swagger.models.Operation operation59 = null;
        // The following exception was thrown during execution in test generation
        try {
            springMvcApiReader10.updateOperationParameters(parameterList57, strMap58, operation59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null/hi!" + "'", str15, "null/hi!");
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNull(logAdapter35);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(annotationArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(parameterList57);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays28();
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader61();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader55();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays129();
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
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays71();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader10 = serializedObjectSupporter5.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader2();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays40();
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader23();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays133();
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
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays32();
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader29();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader8();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays84();
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        java.lang.String str4 = springMvcApiReader2.generateFullPath("hi!");
        io.swagger.models.Swagger swagger5 = null;
        springMvcApiReader2.swagger = swagger5;
        io.swagger.models.Swagger swagger7 = springMvcApiReader2.swagger;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null/hi!" + "'", str4, "null/hi!");
        org.junit.Assert.assertNull(swagger7);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays9 = serializedObjectSupporter0.deserializeObjectArrays29();
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
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays131();
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader29();
        java.lang.reflect.Method method5 = null;
        io.swagger.models.Operation operation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jaxrsReader4.readImplicitParameters(method5, operation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays4 = serializedObjectSupporter0.deserializeObjectArrays76();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        springMvcApiReader4.setresourcePath("hi!");
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.models.Operation operation8 = springMvcApiReader4.parseMethod(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader29();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader29();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays132();
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays74();
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader33();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays117();
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter3 = springMvcApiReader2.getLOG();
        springMvcApiReader2.setresourcePath("hi!");
        io.swagger.annotations.Api api6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.swagger.models.SecurityRequirement> securityRequirementList7 = springMvcApiReader2.getSecurityRequirements(api6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(logAdapter3);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays22();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader57();
        io.swagger.models.Swagger swagger5 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter6 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger5, logAdapter6);
        java.lang.String str9 = springMvcApiReader7.generateFullPath("hi!");
        io.swagger.models.Swagger swagger10 = null;
        springMvcApiReader7.swagger = swagger10;
        springMvcApiReader7.resourcePath = "hi!";
        io.swagger.models.Swagger swagger14 = null;
        springMvcApiReader7.swagger = swagger14;
        springMvcApiReader7.updateExtensionChain();
        io.swagger.models.Swagger swagger17 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter18 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader19 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger17, logAdapter18);
        io.swagger.models.Swagger swagger20 = null;
        springMvcApiReader19.setswagger(swagger20);
        java.lang.reflect.Type[] typeArray22 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet23 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet23, typeArray22);
        springMvcApiReader19.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet23);
        java.lang.String str26 = springMvcApiReader19.getresourcePath();
        io.swagger.models.Operation operation27 = null;
        io.swagger.annotations.ApiOperation apiOperation28 = null;
        springMvcApiReader19.updateTagsForOperation(operation27, apiOperation28);
        java.lang.Class<?> wildcardClass30 = springMvcApiReader19.getClass();
        io.swagger.models.Swagger swagger31 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter32 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader33 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger31, logAdapter32);
        io.swagger.models.Swagger swagger34 = null;
        springMvcApiReader33.setswagger(swagger34);
        java.lang.reflect.Type[] typeArray36 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet37 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet37, typeArray36);
        springMvcApiReader33.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet37);
        java.lang.String str40 = springMvcApiReader33.getresourcePath();
        java.lang.annotation.Annotation[] annotationArray41 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList42 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList42, annotationArray41);
        boolean boolean44 = springMvcApiReader33.hasValidAnnotations((java.util.List<java.lang.annotation.Annotation>) annotationList42);
        java.util.List<io.swagger.models.parameters.Parameter> parameterList45 = springMvcApiReader7.getParameters((java.lang.reflect.Type) wildcardClass30, (java.util.List<java.lang.annotation.Annotation>) annotationList42);
        jaxrsReader4.addTypeToSkippedTypes((java.lang.reflect.Type) wildcardClass30);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null/hi!" + "'", str9, "null/hi!");
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(annotationArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(parameterList45);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays15();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader19();
        java.util.Map<java.lang.String, io.swagger.models.Tag> strMap9 = null;
        io.swagger.annotations.Api api10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, io.swagger.models.Tag> strMap11 = springMvcApiReader8.updateTagsForApi(strMap9, api10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader31();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader65();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays104();
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays83();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays26();
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays87();
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader90();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays151();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader44();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader64();
        io.swagger.models.Operation operation8 = null;
        springMvcApiReader5.updatePath("/hi!", "/null/hi!", operation8);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(jaxrsReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader25();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays19();
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays130();
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays146();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader21();
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(springMvcApiReader12);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        io.swagger.models.Swagger swagger12 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter13 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader14 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger12, logAdapter13);
        io.swagger.models.Swagger swagger15 = null;
        springMvcApiReader14.setswagger(swagger15);
        java.lang.reflect.Type[] typeArray17 = new java.lang.reflect.Type[] {};
        java.util.LinkedHashSet<java.lang.reflect.Type> typeSet18 = new java.util.LinkedHashSet<java.lang.reflect.Type>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeSet18, typeArray17);
        springMvcApiReader14.setTypesToSkip((java.util.Set<java.lang.reflect.Type>) typeSet18);
        java.lang.String str21 = springMvcApiReader14.getresourcePath();
        io.swagger.models.Operation operation22 = null;
        io.swagger.annotations.ApiOperation apiOperation23 = null;
        springMvcApiReader14.updateTagsForOperation(operation22, apiOperation23);
        java.lang.Class<?> wildcardClass25 = springMvcApiReader14.getClass();
        java.lang.reflect.Type[] typeArray26 = new java.lang.reflect.Type[] { wildcardClass25 };
        java.util.ArrayList<java.lang.reflect.Type> typeList27 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList27, typeArray26);
        springMvcApiReader11.setTypesToSkip((java.util.List<java.lang.reflect.Type>) typeList27);
        io.swagger.annotations.Api api31 = null;
        boolean boolean32 = springMvcApiReader11.canReadApi(false, api31);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader76();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader71();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter5.deserializeObjectArrays27();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays3 = serializedObjectSupporter0.deserializeObjectArrays118();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays18();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(springMvcApiReader9);
        org.junit.Assert.assertNotNull(jaxrsReader10);
        org.junit.Assert.assertNotNull(springMvcApiReader11);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays8 = serializedObjectSupporter0.deserializeObjectArrays78();
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
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader13 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader80();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays14 = serializedObjectSupporter5.deserializeObjectArrays80();
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
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader69();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader11();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader7 = serializedObjectSupporter0.deserializeObjectJaxrsReader47();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader47();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader38();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays10 = serializedObjectSupporter0.deserializeObjectArrays12();
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
        org.junit.Assert.assertNotNull(springMvcApiReader9);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays80();
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays15();
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader85();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays69();
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader28();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays14();
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader13();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader45();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader72();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader11();
        io.swagger.models.Swagger swagger8 = springMvcApiReader7.getswagger();
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(swagger8);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays14 = serializedObjectSupporter5.deserializeObjectArrays81();
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
        org.junit.Assert.assertNotNull(springMvcApiReader13);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader16();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader41();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader30();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays2();
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
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader34();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays156();
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader19();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader27();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader56();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays157();
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader21();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays125();
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader16();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader34();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays7 = serializedObjectSupporter0.deserializeObjectArrays139();
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader4 = serializedObjectSupporter0.deserializeObjectJaxrsReader43();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays99();
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader12();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader91();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader30();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader54();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays51();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(springMvcApiReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader11 = serializedObjectSupporter5.deserializeObjectJaxrsReader38();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays54();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(springMvcApiReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader8);
        org.junit.Assert.assertNotNull(jaxrsReader9);
        org.junit.Assert.assertNotNull(springMvcApiReader10);
        org.junit.Assert.assertNotNull(jaxrsReader11);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays12 = serializedObjectSupporter5.deserializeObjectArrays8();
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader59();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader40();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays105();
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        io.swagger.models.Swagger swagger0 = null;
        com.github.kongchen.swagger.docgen.LogAdapter logAdapter1 = null;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = new com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader(swagger0, logAdapter1);
        springMvcApiReader2.resourcePath = "hi!";
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader6 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader15();
        springMvcApiReader2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader8 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader9();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader9 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader82();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader10 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader58();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays11 = serializedObjectSupporter5.deserializeObjectArrays13();
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader32();
        io.swagger.annotations.Api api5 = null;
        boolean boolean6 = springMvcApiReader3.canReadApi(false, api5);
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader44();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays5 = serializedObjectSupporter0.deserializeObjectArrays60();
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader12 = serializedObjectSupporter5.deserializeObjectSpringMvcApiReader67();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays145();
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
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays47();
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
            java.util.Arrays arrays13 = serializedObjectSupporter5.deserializeObjectArrays122();
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
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader21();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader79();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader34();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader10();
        java.lang.String str6 = springMvcApiReader5.getresourcePath();
        org.junit.Assert.assertNotNull(springMvcApiReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(springMvcApiReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/pet" + "'", str6, "/pet");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader1 = serializedObjectSupporter0.deserializeObjectJaxrsReader67();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader2 = serializedObjectSupporter0.deserializeObjectJaxrsReader40();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader3 = serializedObjectSupporter0.deserializeObjectJaxrsReader39();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader5();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader5 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader37();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays arrays6 = serializedObjectSupporter0.deserializeObjectArrays97();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Arrays$ArrayList cannot be cast to java.util.Arrays");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jaxrsReader1);
        org.junit.Assert.assertNotNull(jaxrsReader2);
        org.junit.Assert.assertNotNull(jaxrsReader3);
        org.junit.Assert.assertNotNull(springMvcApiReader4);
        org.junit.Assert.assertNotNull(springMvcApiReader5);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.kongchen.swagger.docgen.reader.SerializedObjectSupporter();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader1 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader15();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader2 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader71();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader3 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader7();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader4 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader77();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader5 = serializedObjectSupporter0.deserializeObjectJaxrsReader36();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader6 = serializedObjectSupporter0.deserializeObjectJaxrsReader27();
        com.github.kongchen.swagger.docgen.reader.SpringMvcApiReader springMvcApiReader7 = serializedObjectSupporter0.deserializeObjectSpringMvcApiReader60();
        com.github.kongchen.swagger.docgen.reader.JaxrsReader jaxrsReader8 = serializedObjectSupporter0.deserializeObjectJaxrsReader32();
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
        org.junit.Assert.assertNotNull(jaxrsReader5);
        org.junit.Assert.assertNotNull(jaxrsReader6);
        org.junit.Assert.assertNotNull(springMvcApiReader7);
        org.junit.Assert.assertNotNull(jaxrsReader8);
    }
}

