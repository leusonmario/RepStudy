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
        java.lang.String str0 = io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "no description" + "'", str0, "no description");
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        io.swagger.oas.annotations.info.Info info0 = null;
        java.util.Optional<io.swagger.oas.models.info.Info> infoOptional1 = io.swagger.jaxrs2.OperationParser.getInfo(info0);
        org.junit.Assert.assertNotNull(infoOptional1);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.String str0 = io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "default" + "'", str0, "default");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.lang.String str0 = io.swagger.jaxrs2.OperationParser.MEDIA_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*/*" + "'", str0, "*/*");
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        io.swagger.oas.annotations.info.License license0 = null;
        java.util.Optional<io.swagger.oas.models.info.License> licenseOptional1 = io.swagger.jaxrs2.OperationParser.getLicense(license0);
        org.junit.Assert.assertNotNull(licenseOptional1);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "*/*";
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        io.swagger.jaxrs2.OperationParser operationParser0 = new io.swagger.jaxrs2.OperationParser();
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        io.swagger.oas.annotations.links.LinkParameter[] linkParameterArray0 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap1 = io.swagger.jaxrs2.OperationParser.getLinkParameters(linkParameterArray0);
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int9 = schema8.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = schema16.format("no description");
        io.swagger.oas.models.media.Schema schema19 = schema8.not(schema18);
        java.lang.Class<?> wildcardClass20 = schema19.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        io.swagger.oas.annotations.ExternalDocumentation externalDocumentation0 = null;
        java.util.Optional<io.swagger.oas.models.ExternalDocumentation> externalDocumentationOptional1 = io.swagger.jaxrs2.OperationParser.getExternalDocumentation(externalDocumentation0);
        org.junit.Assert.assertNotNull(externalDocumentationOptional1);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "no description";
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "";
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        io.swagger.oas.annotations.info.Contact contact0 = null;
        java.util.Optional<io.swagger.oas.models.info.Contact> contactOptional1 = io.swagger.jaxrs2.OperationParser.getContact(contact0);
        org.junit.Assert.assertNotNull(contactOptional1);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        io.swagger.oas.annotations.responses.ApiResponse apiResponse0 = null;
        io.swagger.oas.annotations.responses.ApiResponse[] apiResponseArray1 = new io.swagger.oas.annotations.responses.ApiResponse[] { apiResponse0 };
        javax.ws.rs.Produces produces2 = null;
        javax.ws.rs.Produces produces3 = null;
        io.swagger.oas.models.Components components4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<io.swagger.oas.models.responses.ApiResponses> apiResponsesOptional5 = io.swagger.jaxrs2.OperationParser.getApiResponses(apiResponseArray1, produces2, produces3, components4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(apiResponseArray1);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        io.swagger.oas.models.media.Discriminator discriminator7 = null;
        schema6.setDiscriminator(discriminator7);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int5 = strSchema0.getMinLength();
        java.lang.Integer int6 = strSchema0.getMaxLength();
        java.math.BigDecimal bigDecimal7 = strSchema0.getMaximum();
        java.math.BigDecimal bigDecimal8 = strSchema0.getMaximum();
        java.lang.Class<?> wildcardClass9 = strSchema0.getClass();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        io.swagger.oas.annotations.media.Schema schema0 = null;
        java.util.Optional<io.swagger.oas.models.media.Schema> schemaOptional1 = io.swagger.jaxrs2.OperationParser.getSchemaFromAnnotation(schema0);
        org.junit.Assert.assertNotNull(schemaOptional1);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "hi!";
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        io.swagger.oas.models.media.MediaType mediaType0 = null;
        io.swagger.oas.annotations.media.ExampleObject exampleObject1 = null;
        java.util.Optional<io.swagger.oas.models.media.MediaType> mediaTypeOptional2 = io.swagger.jaxrs2.OperationParser.getMediaType(mediaType0, exampleObject1);
        org.junit.Assert.assertNotNull(mediaTypeOptional2);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        io.swagger.oas.annotations.servers.Server server0 = null;
        java.util.Optional<io.swagger.oas.models.servers.Server> serverOptional1 = io.swagger.jaxrs2.OperationParser.getServer(server0);
        org.junit.Assert.assertNotNull(serverOptional1);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        io.swagger.oas.annotations.servers.Server[] serverArray0 = null;
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional1 = io.swagger.jaxrs2.OperationParser.getServers(serverArray0);
        org.junit.Assert.assertNotNull(serverListOptional1);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.lang.String str0 = io.swagger.jaxrs2.OperationParser.COMPONENTS_REF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hi!" + "'", str0, "hi!");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "hi!";
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "hi!";
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "default";
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "";
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        io.swagger.oas.annotations.parameters.RequestBody requestBody0 = null;
        io.swagger.oas.models.Components components1 = null;
        java.util.Optional<io.swagger.oas.models.parameters.RequestBody> requestBodyOptional2 = io.swagger.jaxrs2.OperationParser.getRequestBody(requestBody0, components1);
        org.junit.Assert.assertNotNull(requestBodyOptional2);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        schema3.addEnumItemObject("");
        io.swagger.oas.models.media.Schema schema6 = schema3.getNot();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema6.setProperties(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(schema6);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "*/*";
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        java.lang.Boolean boolean14 = strSchema11.getWriteOnly();
        io.swagger.oas.models.media.Schema schema16 = strSchema11.type("default");
        io.swagger.oas.models.media.Schema schema17 = strSchema0.not(schema16);
        java.lang.Class<?> wildcardClass18 = schema17.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "hi!";
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        io.swagger.oas.models.media.Schema<java.lang.Object> objSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Object>();
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        io.swagger.oas.annotations.links.Link[] linkArray0 = new io.swagger.oas.annotations.links.Link[] {};
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap1 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray0);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap2 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray0);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap3 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray0);
        java.lang.Class<?> wildcardClass4 = strMap3.getClass();
        org.junit.Assert.assertNotNull(linkArray0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Boolean boolean6 = strSchema0.getDeprecated();
        java.lang.Class<?> wildcardClass7 = strSchema0.getClass();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema12 = schema6.getAdditionalProperties();
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.oas.models.media.Schema schema14 = schema12.minLength((java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(schema12);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "";
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema12 = schema6.getAdditionalProperties();
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.oas.models.media.Schema schema14 = schema12.readOnly((java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(schema12);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "default";
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        io.swagger.oas.annotations.media.Content[] contentArray0 = null;
        io.swagger.oas.models.Components components1 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional2 = io.swagger.jaxrs2.OperationParser.getContents(contentArray0, components1);
        org.junit.Assert.assertNotNull(contentOptional2);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        schema8.setDeprecated((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal11 = schema8.getMaximum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(bigDecimal11);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "no description";
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int17 = strSchema12.getMinLength();
        java.lang.Integer int18 = strSchema12.getMaxLength();
        java.math.BigDecimal bigDecimal19 = strSchema12.getMaximum();
        io.swagger.oas.models.media.Schema schema20 = schema11.additionalProperties((io.swagger.oas.models.media.Schema) strSchema12);
        java.lang.Integer int21 = strSchema12.getMinLength();
        java.lang.Boolean boolean22 = strSchema12.getWriteOnly();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(bigDecimal19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertEquals("'" + boolean22 + "' != '" + false + "'", boolean22, false);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        strSchema0.setDefault((java.lang.Object) (byte) 100);
        strSchema0.setMinProperties((java.lang.Integer) 0);
        strSchema0.setMinProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        java.util.List<java.lang.String> strList14 = strSchema11.getRequired();
        java.lang.Boolean boolean15 = strSchema11.getUniqueItems();
        strSchema0.setDefault((java.lang.Object) boolean15);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        io.swagger.oas.annotations.media.Content[] contentArray0 = new io.swagger.oas.annotations.media.Content[] {};
        javax.ws.rs.Produces produces1 = null;
        javax.ws.rs.Produces produces2 = null;
        io.swagger.oas.models.Components components3 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional4 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces1, produces2, components3);
        javax.ws.rs.Produces produces5 = null;
        javax.ws.rs.Produces produces6 = null;
        io.swagger.oas.models.Components components7 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional8 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces5, produces6, components7);
        javax.ws.rs.Produces produces9 = null;
        javax.ws.rs.Produces produces10 = null;
        io.swagger.oas.models.Components components11 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional12 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces9, produces10, components11);
        java.lang.Class<?> wildcardClass13 = contentOptional12.getClass();
        org.junit.Assert.assertNotNull(contentArray0);
        org.junit.Assert.assertNotNull(contentOptional4);
        org.junit.Assert.assertNotNull(contentOptional8);
        org.junit.Assert.assertNotNull(contentOptional12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        io.swagger.oas.annotations.media.Content content0 = null;
        io.swagger.oas.annotations.media.Content[] contentArray1 = new io.swagger.oas.annotations.media.Content[] { content0 };
        io.swagger.oas.models.Components components2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<io.swagger.oas.models.media.Content> contentOptional3 = io.swagger.jaxrs2.OperationParser.getContents(contentArray1, components2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(contentArray1);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.lang.String str11 = strSchema0.getDescription();
        strSchema0.setDescription("default");
        java.lang.Integer int14 = strSchema0.getMaxLength();
        java.lang.Class<?> wildcardClass15 = strSchema0.getClass();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int5 = strSchema0.getMinLength();
        java.lang.Integer int6 = strSchema0.getMaxLength();
        java.math.BigDecimal bigDecimal7 = strSchema0.getMaximum();
        strSchema0.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(bigDecimal7);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "*/*";
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        java.math.BigDecimal bigDecimal7 = null;
        strSchema0.setMinimum(bigDecimal7);
        strSchema0.setMaxItems((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema11 = strSchema0.getAdditionalProperties();
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.oas.models.media.Schema schema13 = schema11.uniqueItems((java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(schema11);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.String str7 = strSchema0.getType();
        strSchema0.setExclusiveMinimum((java.lang.Boolean) false);
        strSchema0.setReadOnly((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "no description";
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema7 = strSchema0.getNot();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(schema7);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        java.util.List<java.lang.String> strList8 = strSchema5.getRequired();
        strSchema5.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int11 = strSchema5.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setName("no description");
        io.swagger.oas.models.media.Schema schema18 = strSchema12.type("");
        io.swagger.oas.models.media.Schema schema19 = strSchema5.not((io.swagger.oas.models.media.Schema) strSchema12);
        strSchema0.setExample((java.lang.Object) schema19);
        java.lang.Boolean boolean21 = schema19.getUniqueItems();
        io.swagger.oas.models.media.Schema schema23 = schema19.format("hi!");
        io.swagger.oas.models.media.Discriminator discriminator24 = schema19.getDiscriminator();
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(discriminator24);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        strSchema7.setName("no description");
        io.swagger.oas.models.media.Schema schema13 = strSchema7.type("");
        io.swagger.oas.models.media.Schema schema14 = strSchema0.not((io.swagger.oas.models.media.Schema) strSchema7);
        strSchema7.setName("");
        java.lang.Class<?> wildcardClass17 = strSchema7.getClass();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.lang.String str8 = schema6.getPattern();
        io.swagger.oas.models.media.Schema schema9 = schema6.getNot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = schema9.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(schema9);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        io.swagger.oas.models.media.Discriminator discriminator7 = null;
        io.swagger.oas.models.media.Schema schema8 = strSchema0.discriminator(discriminator7);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap9 = strSchema0.getProperties();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.Boolean boolean6 = strSchema0.getUniqueItems();
        java.math.BigDecimal bigDecimal7 = null;
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maximum(bigDecimal7);
        strSchema0.setNullable((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.lang.String str5 = strSchema0.getDescription();
        java.lang.Class<?> wildcardClass6 = strSchema0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "*/*";
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        io.swagger.oas.models.media.Schema<io.swagger.oas.annotations.Parameter[]> parameterArraySchema0 = new io.swagger.oas.models.media.Schema<io.swagger.oas.annotations.Parameter[]>();
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        strSchema0.setDeprecated((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = strSchema0.getExtensions();
        java.lang.Integer int7 = strSchema0.getMinItems();
        java.lang.Integer int8 = strSchema0.getMinLength();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.uniqueItems((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass7 = strSchema0.getClass();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap8 = schema6.getProperties();
        io.swagger.oas.models.media.Schema schema10 = schema6.minLength((java.lang.Integer) 0);
        schema6.setNullable((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        strSchema0.setMinProperties((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = strSchema0.getExtensions();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap14 = null;
        strSchema0.setProperties(strMap14);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap16 = strSchema0.getProperties();
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema10 = schema6.nullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        strSchema11.setName("no description");
        io.swagger.oas.models.media.Schema schema17 = strSchema11.type("");
        io.swagger.oas.models.media.Schema schema19 = strSchema11.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema21 = strSchema11.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray24 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        schema21.setRequired((java.util.List<java.lang.String>) strList25);
        java.util.List<java.lang.String> strList28 = schema21.getEnum();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema29 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema29.setType("hi!");
        strSchema29.setName("no description");
        io.swagger.oas.models.media.Schema schema35 = strSchema29.type("");
        io.swagger.oas.models.media.Schema schema37 = schema35.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int38 = schema37.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema39 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema39.setType("hi!");
        strSchema39.setName("no description");
        io.swagger.oas.models.media.Schema schema45 = strSchema39.type("");
        io.swagger.oas.models.media.Schema schema47 = schema45.format("no description");
        io.swagger.oas.models.media.Schema schema48 = schema37.not(schema47);
        io.swagger.oas.models.media.Schema schema50 = schema47.format("default");
        io.swagger.oas.models.media.Schema schema52 = schema47.exclusiveMinimum((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal53 = null;
        schema52.setMinimum(bigDecimal53);
        io.swagger.oas.models.media.XML xML55 = null;
        io.swagger.oas.models.media.Schema schema56 = schema52.xml(xML55);
        schema21.setAdditionalProperties(schema56);
        io.swagger.oas.models.media.Schema schema59 = schema21.deprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema60 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema60.setType("hi!");
        strSchema60.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap65 = null;
        io.swagger.oas.models.media.Schema schema66 = strSchema60.properties(strMap65);
        java.lang.Integer int67 = schema66.getMaxProperties();
        io.swagger.oas.models.media.Schema schema69 = schema66.minProperties((java.lang.Integer) 0);
        java.lang.String str70 = schema66.getType();
        schema66.setReadOnly((java.lang.Boolean) true);
        schema66.set$ref("");
        java.lang.String str75 = schema66.getName();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema76 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema76.setType("hi!");
        strSchema76.setName("no description");
        io.swagger.oas.models.media.Schema schema82 = strSchema76.type("");
        io.swagger.oas.models.media.Schema schema84 = strSchema76.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema86 = strSchema76.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray89 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        schema86.setRequired((java.util.List<java.lang.String>) strList90);
        schema66.setRequired((java.util.List<java.lang.String>) strList90);
        schema59.setRequired((java.util.List<java.lang.String>) strList90);
        schema10.setRequired((java.util.List<java.lang.String>) strList90);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(strList28);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNull(int67);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNotNull(schema84);
        org.junit.Assert.assertNotNull(schema86);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        io.swagger.oas.models.media.Schema<io.swagger.oas.annotations.responses.ApiResponse[]> apiResponseArraySchema0 = new io.swagger.oas.models.media.Schema<io.swagger.oas.annotations.responses.ApiResponse[]>();
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxItems((java.lang.Integer) 100);
        java.lang.String str9 = strSchema0.getName();
        java.math.BigDecimal bigDecimal10 = null;
        strSchema0.setMultipleOf(bigDecimal10);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema schema15 = strSchema9.type("");
        io.swagger.oas.models.media.Schema schema17 = schema15.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema18 = schema8.not(schema15);
        io.swagger.oas.models.media.Schema schema20 = schema8.minItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema22 = schema8.name("hi!");
        schema22.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema25 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema25.setType("hi!");
        strSchema25.setName("no description");
        io.swagger.oas.models.media.Schema schema31 = strSchema25.type("");
        io.swagger.oas.models.media.Schema schema33 = schema31.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema34 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema34.setType("hi!");
        strSchema34.setName("no description");
        io.swagger.oas.models.media.Schema schema40 = strSchema34.type("");
        io.swagger.oas.models.media.Schema schema42 = schema40.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema43 = schema33.not(schema40);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema44 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str45 = strSchema44.getTitle();
        io.swagger.oas.models.media.Schema schema47 = strSchema44.format("");
        strSchema44.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema50 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema50.setType("hi!");
        strSchema50.setName("no description");
        io.swagger.oas.models.media.Schema schema56 = strSchema50.type("");
        io.swagger.oas.models.media.Schema schema58 = schema56.maxProperties((java.lang.Integer) 100);
        java.lang.String[] strArray60 = new java.lang.String[] { "default" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        schema58.setRequired((java.util.List<java.lang.String>) strList61);
        strSchema44.setRequired((java.util.List<java.lang.String>) strList61);
        io.swagger.oas.models.media.Schema schema65 = schema43.required((java.util.List<java.lang.String>) strList61);
        schema22.setEnum((java.util.List<java.lang.String>) strList61);
        schema22.setFormat("hi!");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(schema65);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        io.swagger.oas.models.media.Schema schema7 = strSchema0.getNot();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(schema7);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        schema4.setPattern("");
        io.swagger.oas.models.media.Schema schema8 = schema4.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema10 = schema8.minItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema12 = schema10.minProperties((java.lang.Integer) (-1));
        schema10.setWriteOnly((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        io.swagger.oas.annotations.links.LinkParameter linkParameter0 = null;
        io.swagger.oas.annotations.links.LinkParameter[] linkParameterArray1 = new io.swagger.oas.annotations.links.LinkParameter[] { linkParameter0 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap2 = io.swagger.jaxrs2.OperationParser.getLinkParameters(linkParameterArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkParameterArray1);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        schema12.setDeprecated((java.lang.Boolean) true);
        schema12.setExclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Discriminator discriminator17 = null;
        schema12.setDiscriminator(discriminator17);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap19 = schema12.getProperties();
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Integer int7 = schema6.getMinLength();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        io.swagger.oas.models.media.Schema<java.util.RandomAccess> randomAccessSchema0 = new io.swagger.oas.models.media.Schema<java.util.RandomAccess>();
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        io.swagger.oas.annotations.Parameter[] parameterArray0 = null;
        io.swagger.oas.models.Components components1 = null;
        java.util.Optional<java.util.List<io.swagger.oas.models.parameters.Parameter>> parameterListOptional2 = io.swagger.jaxrs2.OperationParser.getParametersList(parameterArray0, components1);
        org.junit.Assert.assertNotNull(parameterListOptional2);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        io.swagger.oas.models.media.Schema schema5 = strSchema0.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema7 = schema5.exclusiveMinimum((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal12 = schema6.getMinimum();
        io.swagger.oas.models.media.Schema schema14 = schema6.minProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Discriminator discriminator15 = null;
        io.swagger.oas.models.media.Schema schema16 = schema14.discriminator(discriminator15);
        java.lang.Boolean boolean17 = schema16.getWriteOnly();
        io.swagger.oas.models.media.Schema schema19 = schema16.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema20 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema20.setType("hi!");
        java.lang.Boolean boolean23 = strSchema20.getWriteOnly();
        java.lang.Integer int24 = strSchema20.getMinProperties();
        strSchema20.setExclusiveMinimum((java.lang.Boolean) true);
        schema16.setExample((java.lang.Object) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema28 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema28.setType("hi!");
        strSchema28.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema34 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema34.setType("hi!");
        java.lang.Boolean boolean37 = strSchema34.getWriteOnly();
        io.swagger.oas.models.media.Schema schema39 = strSchema34.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema40 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema40.setType("hi!");
        java.lang.Boolean boolean43 = strSchema40.getWriteOnly();
        io.swagger.oas.models.media.Schema schema45 = strSchema40.type("default");
        strSchema34.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema40);
        io.swagger.oas.models.media.Schema schema47 = strSchema28.addProperties("", (io.swagger.oas.models.media.Schema) strSchema34);
        io.swagger.oas.models.media.Schema schema49 = strSchema34.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema50 = schema16.example((java.lang.Object) strSchema34);
        java.util.Map<java.lang.String, java.lang.Object> strMap51 = null;
        schema16.setExtensions(strMap51);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(boolean37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNull(boolean43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int17 = strSchema12.getMinLength();
        java.lang.Integer int18 = strSchema12.getMaxLength();
        java.math.BigDecimal bigDecimal19 = strSchema12.getMaximum();
        io.swagger.oas.models.media.Schema schema20 = schema11.additionalProperties((io.swagger.oas.models.media.Schema) strSchema12);
        strSchema12.setType("");
        java.lang.Boolean boolean23 = strSchema12.getWriteOnly();
        io.swagger.oas.models.media.Schema schema24 = strSchema12.getNot();
        io.swagger.oas.models.media.XML xML25 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.oas.models.media.Schema schema26 = schema24.xml(xML25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(bigDecimal19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + boolean23 + "' != '" + false + "'", boolean23, false);
        org.junit.Assert.assertNull(schema24);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        strSchema0.setMaxItems((java.lang.Integer) 10);
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean8 = strSchema0.getExclusiveMaximum();
        io.swagger.oas.models.media.Schema schema10 = strSchema0.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str12 = strSchema11.getTitle();
        io.swagger.oas.models.media.Schema schema14 = strSchema11.format("");
        strSchema11.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        strSchema17.setName("no description");
        io.swagger.oas.models.media.Schema schema23 = strSchema17.type("");
        io.swagger.oas.models.media.Schema schema25 = schema23.maxProperties((java.lang.Integer) 100);
        java.lang.String[] strArray27 = new java.lang.String[] { "default" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        schema25.setRequired((java.util.List<java.lang.String>) strList28);
        strSchema11.setRequired((java.util.List<java.lang.String>) strList28);
        io.swagger.oas.models.media.Schema schema32 = schema10.required((java.util.List<java.lang.String>) strList28);
        java.lang.Class<?> wildcardClass33 = schema10.getClass();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        schema4.setPattern("");
        io.swagger.oas.models.media.Schema schema8 = schema4.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema10 = schema4.minItems((java.lang.Integer) 100);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema10.properties(strMap11);
        schema12.addEnumItemObject("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "default";
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.description("no description");
        schema11.setPattern("");
        java.lang.Boolean boolean14 = schema11.getUniqueItems();
        io.swagger.oas.models.media.Schema schema15 = null;
        io.swagger.oas.models.media.Schema schema16 = schema11.additionalProperties(schema15);
        schema16.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema schema15 = strSchema9.type("");
        io.swagger.oas.models.media.Schema schema17 = schema15.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema18 = schema8.not(schema15);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str20 = strSchema19.getTitle();
        io.swagger.oas.models.media.Schema schema22 = strSchema19.format("");
        strSchema19.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema25 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema25.setType("hi!");
        strSchema25.setName("no description");
        io.swagger.oas.models.media.Schema schema31 = strSchema25.type("");
        io.swagger.oas.models.media.Schema schema33 = schema31.maxProperties((java.lang.Integer) 100);
        java.lang.String[] strArray35 = new java.lang.String[] { "default" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        schema33.setRequired((java.util.List<java.lang.String>) strList36);
        strSchema19.setRequired((java.util.List<java.lang.String>) strList36);
        io.swagger.oas.models.media.Schema schema40 = schema18.required((java.util.List<java.lang.String>) strList36);
        io.swagger.oas.models.media.Schema schema41 = schema18.getAdditionalProperties();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = schema41.get$ref();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(schema41);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.XML xML6 = schema5.getXml();
        io.swagger.oas.models.media.Schema schema7 = schema5.getNot();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema8 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema8.setType("hi!");
        strSchema8.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int13 = strSchema8.getMinLength();
        java.lang.Integer int14 = strSchema8.getMaxLength();
        io.swagger.oas.models.media.Schema schema16 = strSchema8.exclusiveMinimum((java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            schema7.setDefault((java.lang.Object) strSchema8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(xML6);
        org.junit.Assert.assertNull(schema7);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getNullable();
        java.lang.Object obj2 = strSchema0.getExample();
        java.math.BigDecimal bigDecimal3 = null;
        strSchema0.setMaximum(bigDecimal3);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        io.swagger.oas.models.media.Schema schema11 = strSchema5.type("");
        io.swagger.oas.models.media.Schema schema13 = schema11.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        io.swagger.oas.models.media.Schema schema20 = strSchema14.type("");
        io.swagger.oas.models.media.Schema schema22 = strSchema14.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema24 = strSchema14.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray27 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        schema24.setRequired((java.util.List<java.lang.String>) strList28);
        schema13.setRequired((java.util.List<java.lang.String>) strList28);
        strSchema0.setRequired((java.util.List<java.lang.String>) strList28);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema33 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema33.setType("hi!");
        strSchema33.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap38 = null;
        io.swagger.oas.models.media.Schema schema39 = strSchema33.properties(strMap38);
        java.lang.Integer int40 = schema39.getMaxProperties();
        io.swagger.oas.models.media.Schema schema42 = schema39.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema44 = schema39.description("no description");
        schema44.setPattern("");
        java.lang.Boolean boolean47 = schema44.getUniqueItems();
        io.swagger.oas.models.media.Schema schema48 = null;
        io.swagger.oas.models.media.Schema schema49 = schema44.additionalProperties(schema48);
        io.swagger.oas.models.media.Schema schema50 = strSchema0.example((java.lang.Object) schema48);
        java.lang.Boolean boolean51 = schema50.getNullable();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNull(int40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(boolean47);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNull(boolean51);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray13 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        schema10.setRequired((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList17 = schema10.getEnum();
        schema10.setMinProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.XML xML20 = null;
        schema10.setXml(xML20);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList17);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        schema4.setPattern("");
        io.swagger.oas.models.media.Schema schema8 = schema4.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema10 = schema8.minItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.XML xML11 = schema8.getXml();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(xML11);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        strSchema0.setMinProperties((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema schema15 = strSchema9.type("");
        io.swagger.oas.models.media.Schema schema17 = schema15.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema18 = schema8.not(schema15);
        io.swagger.oas.models.media.Schema schema20 = schema8.minItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema22 = schema8.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        java.util.List<java.lang.String> strList26 = strSchema23.getRequired();
        strSchema23.setReadOnly((java.lang.Boolean) true);
        schema8.setNot((io.swagger.oas.models.media.Schema) strSchema23);
        io.swagger.oas.annotations.links.LinkParameter[] linkParameterArray31 = new io.swagger.oas.annotations.links.LinkParameter[] {};
        java.util.Map<java.lang.String, java.lang.String> strMap32 = io.swagger.jaxrs2.OperationParser.getLinkParameters(linkParameterArray31);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = io.swagger.jaxrs2.OperationParser.getLinkParameters(linkParameterArray31);
        strSchema23.addExtension("no description", (java.lang.Object) strMap33);
        java.math.BigDecimal bigDecimal35 = strSchema23.getMinimum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(strList26);
        org.junit.Assert.assertNotNull(linkParameterArray31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(bigDecimal35);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        strSchema13.setName("no description");
        io.swagger.oas.models.media.Schema schema19 = strSchema13.type("");
        io.swagger.oas.models.media.Schema schema21 = schema19.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setName("no description");
        io.swagger.oas.models.media.Schema schema28 = strSchema22.type("");
        io.swagger.oas.models.media.Schema schema30 = strSchema22.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema32 = strSchema22.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray35 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        schema32.setRequired((java.util.List<java.lang.String>) strList36);
        schema21.setRequired((java.util.List<java.lang.String>) strList36);
        io.swagger.oas.models.media.Schema schema40 = strSchema0.required((java.util.List<java.lang.String>) strList36);
        schema40.setExclusiveMaximum((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(schema40);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema7 = strSchema0.$ref("");
        strSchema0.setMinProperties((java.lang.Integer) 100);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxLength((java.lang.Integer) 0);
        schema8.setReadOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema12 = schema8.description("");
        java.lang.Class<?> wildcardClass13 = schema12.getClass();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "default";
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal12 = schema6.getMinimum();
        io.swagger.oas.models.media.Schema schema14 = schema6.minProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Discriminator discriminator15 = null;
        io.swagger.oas.models.media.Schema schema16 = schema14.discriminator(discriminator15);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        strSchema17.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setName("no description");
        strSchema17.setNot((io.swagger.oas.models.media.Schema) strSchema22);
        java.math.BigDecimal bigDecimal28 = null;
        io.swagger.oas.models.media.Schema schema29 = strSchema17.minimum(bigDecimal28);
        schema29.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema33 = schema29.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema34 = schema14.example((java.lang.Object) schema29);
        java.lang.Boolean boolean35 = schema14.getNullable();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNull(boolean35);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema10 = schema8.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema12 = schema8.$ref("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        strSchema13.setName("no description");
        io.swagger.oas.models.media.Schema schema19 = strSchema13.type("");
        io.swagger.oas.models.media.Schema schema21 = schema19.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setName("no description");
        io.swagger.oas.models.media.Schema schema28 = strSchema22.type("");
        io.swagger.oas.models.media.Schema schema30 = strSchema22.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema32 = strSchema22.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray35 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        schema32.setRequired((java.util.List<java.lang.String>) strList36);
        schema21.setRequired((java.util.List<java.lang.String>) strList36);
        io.swagger.oas.models.media.Schema schema40 = schema12.required((java.util.List<java.lang.String>) strList36);
        java.lang.Integer int41 = schema12.getMinProperties();
        schema12.setExclusiveMaximum((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(int41);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.discriminator(discriminator8);
        io.swagger.oas.models.media.Schema schema11 = schema9.minLength((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema12 = schema11.getNot();
        // The following exception was thrown during execution in test generation
        try {
            schema12.addEnumItemObject("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(schema12);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema7 = strSchema0.title("no description");
        schema7.set$ref("");
        java.lang.Boolean boolean10 = schema7.getExclusiveMaximum();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.discriminator(discriminator8);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation10 = null;
        schema9.setExternalDocs(externalDocumentation10);
        java.lang.Class<?> wildcardClass12 = schema9.getClass();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        io.swagger.oas.models.media.Schema<java.util.AbstractList<java.lang.String>> strListSchema0 = new io.swagger.oas.models.media.Schema<java.util.AbstractList<java.lang.String>>();
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation7 = schema6.getExternalDocs();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        io.swagger.oas.models.media.Schema schema14 = strSchema10.maxLength((java.lang.Integer) 1);
        boolean boolean15 = schema6.equals((java.lang.Object) schema14);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(externalDocumentation7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int9 = schema8.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = schema16.format("no description");
        io.swagger.oas.models.media.Schema schema19 = schema8.not(schema18);
        java.lang.Integer int20 = schema8.getMaxItems();
        java.lang.Integer int21 = schema8.getMaxLength();
        io.swagger.oas.models.media.Schema schema23 = schema8.description("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema24 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema24.setType("hi!");
        strSchema24.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap29 = null;
        io.swagger.oas.models.media.Schema schema30 = strSchema24.properties(strMap29);
        java.lang.Integer int31 = schema30.getMaxProperties();
        io.swagger.oas.models.media.Schema schema33 = schema30.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema35 = schema30.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema36 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema36.setType("hi!");
        strSchema36.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int41 = strSchema36.getMinLength();
        java.lang.Integer int42 = strSchema36.getMaxLength();
        java.math.BigDecimal bigDecimal43 = strSchema36.getMaximum();
        io.swagger.oas.models.media.Schema schema44 = schema35.additionalProperties((io.swagger.oas.models.media.Schema) strSchema36);
        java.lang.Integer int45 = strSchema36.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema46 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema46.setType("hi!");
        strSchema46.setName("no description");
        io.swagger.oas.models.media.Schema schema52 = strSchema46.type("");
        io.swagger.oas.models.media.Schema schema54 = strSchema46.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema55 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema55.setType("hi!");
        strSchema55.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema60 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema60.setType("hi!");
        strSchema60.setName("no description");
        strSchema55.setNot((io.swagger.oas.models.media.Schema) strSchema60);
        java.math.BigDecimal bigDecimal66 = null;
        io.swagger.oas.models.media.Schema schema67 = strSchema55.minimum(bigDecimal66);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema68 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema68.setType("hi!");
        strSchema68.setName("no description");
        io.swagger.oas.models.media.Schema schema74 = strSchema68.type("");
        io.swagger.oas.models.media.Schema schema76 = schema74.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema77 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema77.setType("hi!");
        strSchema77.setName("no description");
        io.swagger.oas.models.media.Schema schema83 = strSchema77.type("");
        io.swagger.oas.models.media.Schema schema85 = strSchema77.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema87 = strSchema77.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray90 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList91 = new java.util.ArrayList<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList91, strArray90);
        schema87.setRequired((java.util.List<java.lang.String>) strList91);
        schema76.setRequired((java.util.List<java.lang.String>) strList91);
        io.swagger.oas.models.media.Schema schema95 = strSchema55.required((java.util.List<java.lang.String>) strList91);
        strSchema46.setEnum((java.util.List<java.lang.String>) strList91);
        strSchema36.setEnum((java.util.List<java.lang.String>) strList91);
        io.swagger.oas.models.media.Schema schema98 = schema8.required((java.util.List<java.lang.String>) strList91);
        java.math.BigDecimal bigDecimal99 = schema98.getMinimum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertNull(int42);
        org.junit.Assert.assertNull(bigDecimal43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema83);
        org.junit.Assert.assertNotNull(schema85);
        org.junit.Assert.assertNotNull(schema87);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(schema95);
        org.junit.Assert.assertNotNull(schema98);
        org.junit.Assert.assertNull(bigDecimal99);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        java.math.BigDecimal bigDecimal7 = null;
        strSchema0.setMinimum(bigDecimal7);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema12 = schema10.readOnly((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation13 = null;
        io.swagger.oas.models.media.Schema schema14 = schema10.externalDocs(externalDocumentation13);
        io.swagger.oas.models.media.Schema schema16 = schema10.format("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.math.BigDecimal bigDecimal17 = schema16.getMinimum();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(bigDecimal17);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation7 = schema6.getExternalDocs();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str11 = strSchema10.getTitle();
        io.swagger.oas.models.media.Schema schema13 = strSchema10.format("");
        strSchema10.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema16 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema16.setType("hi!");
        strSchema16.setName("no description");
        io.swagger.oas.models.media.Schema schema22 = strSchema16.type("");
        io.swagger.oas.models.media.Schema schema24 = schema22.maxProperties((java.lang.Integer) 100);
        java.lang.String[] strArray26 = new java.lang.String[] { "default" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        schema24.setRequired((java.util.List<java.lang.String>) strList27);
        strSchema10.setRequired((java.util.List<java.lang.String>) strList27);
        schema9.setNot((io.swagger.oas.models.media.Schema) strSchema10);
        io.swagger.oas.models.media.Schema schema33 = schema9.exclusiveMaximum((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass34 = schema33.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(externalDocumentation7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation12 = null;
        schema6.setExternalDocs(externalDocumentation12);
        io.swagger.oas.models.media.Schema schema15 = schema6.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema17 = schema15.uniqueItems((java.lang.Boolean) true);
        java.lang.String str18 = schema17.getPattern();
        io.swagger.oas.models.media.Discriminator discriminator19 = null;
        io.swagger.oas.models.media.Schema schema20 = schema17.discriminator(discriminator19);
        schema17.setExclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema24 = schema17.uniqueItems((java.lang.Boolean) false);
        schema24.addEnumItemObject("");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema24);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap8 = schema6.getProperties();
        java.lang.Integer int9 = schema6.getMaxItems();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema8 = schema6.exclusiveMaximum((java.lang.Boolean) false);
        schema6.setMinProperties((java.lang.Integer) 0);
        java.lang.String str11 = schema6.getPattern();
        io.swagger.oas.models.media.XML xML12 = null;
        io.swagger.oas.models.media.Schema schema13 = schema6.xml(xML12);
        java.math.BigDecimal bigDecimal14 = null;
        schema6.setMaximum(bigDecimal14);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        strSchema7.setName("no description");
        io.swagger.oas.models.media.Schema schema13 = strSchema7.type("");
        io.swagger.oas.models.media.Schema schema14 = strSchema0.not((io.swagger.oas.models.media.Schema) strSchema7);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema15.setType("hi!");
        strSchema15.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema20 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema20.setType("hi!");
        strSchema20.setName("no description");
        strSchema15.setNot((io.swagger.oas.models.media.Schema) strSchema20);
        java.math.BigDecimal bigDecimal26 = null;
        io.swagger.oas.models.media.Schema schema27 = strSchema15.minimum(bigDecimal26);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema28 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema28.setType("hi!");
        strSchema28.setName("no description");
        io.swagger.oas.models.media.Schema schema34 = strSchema28.type("");
        io.swagger.oas.models.media.Schema schema36 = schema34.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema37 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema37.setType("hi!");
        strSchema37.setName("no description");
        io.swagger.oas.models.media.Schema schema43 = strSchema37.type("");
        io.swagger.oas.models.media.Schema schema45 = strSchema37.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema47 = strSchema37.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray50 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        schema47.setRequired((java.util.List<java.lang.String>) strList51);
        schema36.setRequired((java.util.List<java.lang.String>) strList51);
        io.swagger.oas.models.media.Schema schema55 = strSchema15.required((java.util.List<java.lang.String>) strList51);
        strSchema7.setEnum((java.util.List<java.lang.String>) strList51);
        java.lang.Boolean boolean57 = strSchema7.getUniqueItems();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNull(boolean57);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.addRequiredItem("");
        io.swagger.oas.models.media.Schema schema8 = schema6.exclusiveMaximum((java.lang.Boolean) true);
        java.lang.String str9 = schema6.getTitle();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        io.swagger.oas.models.media.Schema<io.swagger.oas.annotations.links.LinkParameter[]> linkParameterArraySchema0 = new io.swagger.oas.models.media.Schema<io.swagger.oas.annotations.links.LinkParameter[]>();
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int9 = schema8.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = schema16.format("no description");
        io.swagger.oas.models.media.Schema schema19 = schema8.not(schema18);
        io.swagger.oas.models.media.Schema schema21 = schema18.format("default");
        java.lang.String str22 = schema18.getFormat();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        strSchema23.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema28 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema28.setType("hi!");
        java.util.List<java.lang.String> strList31 = strSchema28.getRequired();
        strSchema28.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int34 = strSchema28.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema35 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema35.setType("hi!");
        strSchema35.setName("no description");
        io.swagger.oas.models.media.Schema schema41 = strSchema35.type("");
        io.swagger.oas.models.media.Schema schema42 = strSchema28.not((io.swagger.oas.models.media.Schema) strSchema35);
        strSchema23.setExample((java.lang.Object) schema42);
        java.math.BigDecimal bigDecimal44 = null;
        io.swagger.oas.models.media.Schema schema45 = schema42.multipleOf(bigDecimal44);
        io.swagger.oas.models.media.Schema schema46 = schema18.example((java.lang.Object) schema42);
        schema18.setDescription("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "default" + "'", str22, "default");
        org.junit.Assert.assertNull(strList31);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema46);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int9 = schema8.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = schema16.format("no description");
        io.swagger.oas.models.media.Schema schema19 = schema8.not(schema18);
        java.lang.Integer int20 = schema8.getMaxItems();
        java.lang.Integer int21 = schema8.getMaxLength();
        io.swagger.oas.models.media.Schema schema23 = schema8.description("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema24 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema24.setType("hi!");
        strSchema24.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap29 = null;
        io.swagger.oas.models.media.Schema schema30 = strSchema24.properties(strMap29);
        java.lang.Integer int31 = schema30.getMaxProperties();
        io.swagger.oas.models.media.Schema schema33 = schema30.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema35 = schema30.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema36 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema36.setType("hi!");
        strSchema36.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int41 = strSchema36.getMinLength();
        java.lang.Integer int42 = strSchema36.getMaxLength();
        java.math.BigDecimal bigDecimal43 = strSchema36.getMaximum();
        io.swagger.oas.models.media.Schema schema44 = schema35.additionalProperties((io.swagger.oas.models.media.Schema) strSchema36);
        java.lang.Integer int45 = strSchema36.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema46 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema46.setType("hi!");
        strSchema46.setName("no description");
        io.swagger.oas.models.media.Schema schema52 = strSchema46.type("");
        io.swagger.oas.models.media.Schema schema54 = strSchema46.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema55 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema55.setType("hi!");
        strSchema55.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema60 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema60.setType("hi!");
        strSchema60.setName("no description");
        strSchema55.setNot((io.swagger.oas.models.media.Schema) strSchema60);
        java.math.BigDecimal bigDecimal66 = null;
        io.swagger.oas.models.media.Schema schema67 = strSchema55.minimum(bigDecimal66);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema68 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema68.setType("hi!");
        strSchema68.setName("no description");
        io.swagger.oas.models.media.Schema schema74 = strSchema68.type("");
        io.swagger.oas.models.media.Schema schema76 = schema74.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema77 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema77.setType("hi!");
        strSchema77.setName("no description");
        io.swagger.oas.models.media.Schema schema83 = strSchema77.type("");
        io.swagger.oas.models.media.Schema schema85 = strSchema77.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema87 = strSchema77.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray90 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList91 = new java.util.ArrayList<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList91, strArray90);
        schema87.setRequired((java.util.List<java.lang.String>) strList91);
        schema76.setRequired((java.util.List<java.lang.String>) strList91);
        io.swagger.oas.models.media.Schema schema95 = strSchema55.required((java.util.List<java.lang.String>) strList91);
        strSchema46.setEnum((java.util.List<java.lang.String>) strList91);
        strSchema36.setEnum((java.util.List<java.lang.String>) strList91);
        io.swagger.oas.models.media.Schema schema98 = schema8.required((java.util.List<java.lang.String>) strList91);
        java.math.BigDecimal bigDecimal99 = schema8.getMultipleOf();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertNull(int42);
        org.junit.Assert.assertNull(bigDecimal43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema83);
        org.junit.Assert.assertNotNull(schema85);
        org.junit.Assert.assertNotNull(schema87);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(schema95);
        org.junit.Assert.assertNotNull(schema98);
        org.junit.Assert.assertNull(bigDecimal99);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        java.util.List<java.lang.String> strList8 = strSchema5.getRequired();
        strSchema5.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int11 = strSchema5.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setName("no description");
        io.swagger.oas.models.media.Schema schema18 = strSchema12.type("");
        io.swagger.oas.models.media.Schema schema19 = strSchema5.not((io.swagger.oas.models.media.Schema) strSchema12);
        strSchema0.setExample((java.lang.Object) schema19);
        io.swagger.oas.models.media.Schema schema22 = schema19.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation23 = schema19.getExternalDocs();
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(externalDocumentation23);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        strSchema6.setName("no description");
        io.swagger.oas.models.media.Schema schema12 = strSchema6.type("");
        java.lang.Integer int13 = schema12.getMaxProperties();
        java.math.BigDecimal bigDecimal14 = null;
        schema12.setMinimum(bigDecimal14);
        io.swagger.oas.models.media.Schema schema17 = schema12.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema18 = schema12.getAdditionalProperties();
        boolean boolean19 = strSchema0.equals((java.lang.Object) schema12);
        io.swagger.oas.models.media.Schema schema21 = schema12.minProperties((java.lang.Integer) (-1));
        schema21.setDeprecated((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        schema6.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean9 = schema6.getExclusiveMinimum();
        schema6.addEnumItemObject("default");
        schema6.setWriteOnly((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        strSchema6.setName("no description");
        io.swagger.oas.models.media.Schema schema12 = strSchema6.type("");
        java.lang.Integer int13 = schema12.getMaxProperties();
        java.math.BigDecimal bigDecimal14 = null;
        schema12.setMinimum(bigDecimal14);
        io.swagger.oas.models.media.Schema schema17 = schema12.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema18 = schema12.getAdditionalProperties();
        boolean boolean19 = strSchema0.equals((java.lang.Object) schema12);
        strSchema0.setMinItems((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal22 = strSchema0.getMinimum();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(bigDecimal22);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.name("*/*");
        strSchema0.setExclusiveMinimum((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        java.util.List<java.lang.String> strList8 = strSchema5.getRequired();
        strSchema5.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int11 = strSchema5.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setName("no description");
        io.swagger.oas.models.media.Schema schema18 = strSchema12.type("");
        io.swagger.oas.models.media.Schema schema19 = strSchema5.not((io.swagger.oas.models.media.Schema) strSchema12);
        strSchema0.setExample((java.lang.Object) schema19);
        java.lang.Boolean boolean21 = schema19.getUniqueItems();
        io.swagger.oas.models.media.Schema schema23 = schema19.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema24 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema24.setType("hi!");
        strSchema24.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema29 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema29.setType("hi!");
        strSchema29.setName("no description");
        strSchema24.setNot((io.swagger.oas.models.media.Schema) strSchema29);
        java.math.BigDecimal bigDecimal35 = null;
        io.swagger.oas.models.media.Schema schema36 = strSchema24.minimum(bigDecimal35);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema37 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema37.setType("hi!");
        java.util.List<java.lang.String> strList40 = strSchema37.getRequired();
        strSchema37.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema44 = strSchema37.title("no description");
        java.lang.String str45 = schema44.getDescription();
        boolean boolean46 = schema36.equals((java.lang.Object) schema44);
        java.util.List<java.lang.String> strList47 = null;
        io.swagger.oas.models.media.Schema schema48 = schema44.required(strList47);
        schema44.setMaxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema52 = schema44.minLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal53 = null;
        schema44.setMaximum(bigDecimal53);
        java.lang.Object obj55 = schema44.getExample();
        schema19.setNot(schema44);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNull(strList40);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray13 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        schema10.setRequired((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList17 = schema10.getEnum();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema18 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema18.setType("hi!");
        strSchema18.setName("no description");
        io.swagger.oas.models.media.Schema schema24 = strSchema18.type("");
        io.swagger.oas.models.media.Schema schema26 = schema24.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int27 = schema26.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema28 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema28.setType("hi!");
        strSchema28.setName("no description");
        io.swagger.oas.models.media.Schema schema34 = strSchema28.type("");
        io.swagger.oas.models.media.Schema schema36 = schema34.format("no description");
        io.swagger.oas.models.media.Schema schema37 = schema26.not(schema36);
        io.swagger.oas.models.media.Schema schema39 = schema36.format("default");
        io.swagger.oas.models.media.Schema schema41 = schema36.exclusiveMinimum((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal42 = null;
        schema41.setMinimum(bigDecimal42);
        io.swagger.oas.models.media.XML xML44 = null;
        io.swagger.oas.models.media.Schema schema45 = schema41.xml(xML44);
        schema10.setAdditionalProperties(schema45);
        io.swagger.oas.models.media.Schema schema48 = schema10.deprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema49 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema49.setType("hi!");
        strSchema49.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap54 = null;
        io.swagger.oas.models.media.Schema schema55 = strSchema49.properties(strMap54);
        java.lang.Integer int56 = schema55.getMaxProperties();
        io.swagger.oas.models.media.Schema schema58 = schema55.minProperties((java.lang.Integer) 0);
        java.lang.String str59 = schema55.getType();
        schema55.setReadOnly((java.lang.Boolean) true);
        schema55.set$ref("");
        java.lang.String str64 = schema55.getName();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema65 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema65.setType("hi!");
        strSchema65.setName("no description");
        io.swagger.oas.models.media.Schema schema71 = strSchema65.type("");
        io.swagger.oas.models.media.Schema schema73 = strSchema65.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema75 = strSchema65.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray78 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        schema75.setRequired((java.util.List<java.lang.String>) strList79);
        schema55.setRequired((java.util.List<java.lang.String>) strList79);
        schema48.setRequired((java.util.List<java.lang.String>) strList79);
        java.lang.Boolean boolean84 = schema48.getReadOnly();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNull(int56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(boolean84);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        strSchema7.setName("no description");
        io.swagger.oas.models.media.Schema schema13 = strSchema7.type("");
        io.swagger.oas.models.media.Schema schema15 = strSchema7.exclusiveMaximum((java.lang.Boolean) false);
        schema15.setDeprecated((java.lang.Boolean) false);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation18 = null;
        io.swagger.oas.models.media.Schema schema19 = schema15.externalDocs(externalDocumentation18);
        io.swagger.oas.models.media.Schema schema20 = schema4.not(schema15);
        java.lang.Class<?> wildcardClass21 = schema4.getClass();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Object obj6 = strSchema0.getExample();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        strSchema7.setName("no description");
        io.swagger.oas.models.media.Schema schema13 = strSchema7.type("");
        io.swagger.oas.models.media.Schema schema15 = strSchema7.writeOnly((java.lang.Boolean) true);
        strSchema0.setExample((java.lang.Object) schema15);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        strSchema17.setName("no description");
        io.swagger.oas.models.media.Schema schema23 = strSchema17.type("");
        java.lang.Integer int24 = schema23.getMaxProperties();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap25 = null;
        io.swagger.oas.models.media.Schema schema26 = schema23.properties(strMap25);
        io.swagger.oas.models.media.Discriminator discriminator27 = schema26.getDiscriminator();
        schema26.setNullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema30 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema30.setType("hi!");
        strSchema30.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap35 = null;
        io.swagger.oas.models.media.Schema schema36 = strSchema30.properties(strMap35);
        java.lang.Integer int37 = schema36.getMaxProperties();
        io.swagger.oas.models.media.Schema schema39 = schema36.minProperties((java.lang.Integer) 0);
        java.lang.String str40 = schema36.getType();
        schema36.setReadOnly((java.lang.Boolean) true);
        schema36.set$ref("");
        java.lang.String str45 = schema36.getName();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema46 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema46.setType("hi!");
        strSchema46.setName("no description");
        io.swagger.oas.models.media.Schema schema52 = strSchema46.type("");
        io.swagger.oas.models.media.Schema schema54 = strSchema46.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema56 = strSchema46.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray59 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        schema56.setRequired((java.util.List<java.lang.String>) strList60);
        schema36.setRequired((java.util.List<java.lang.String>) strList60);
        io.swagger.oas.models.media.Schema schema64 = schema26.required((java.util.List<java.lang.String>) strList60);
        strSchema0.setEnum((java.util.List<java.lang.String>) strList60);
        java.math.BigDecimal bigDecimal66 = null;
        strSchema0.setMaximum(bigDecimal66);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(discriminator27);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(schema64);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        strSchema6.setName("no description");
        io.swagger.oas.models.media.Schema schema12 = strSchema6.type("");
        java.lang.Integer int13 = schema12.getMaxProperties();
        java.math.BigDecimal bigDecimal14 = null;
        schema12.setMinimum(bigDecimal14);
        io.swagger.oas.models.media.Schema schema17 = schema12.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema18 = schema12.getAdditionalProperties();
        boolean boolean19 = strSchema0.equals((java.lang.Object) schema12);
        io.swagger.oas.models.media.Schema schema21 = schema12.uniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean22 = schema12.getReadOnly();
        java.lang.Integer int23 = schema12.getMaxItems();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(int23);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.discriminator(discriminator8);
        io.swagger.oas.models.media.Schema schema11 = schema9.minLength((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema12 = schema11.getNot();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema12.setExtensions(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(schema12);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        strSchema0.set$ref("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        io.swagger.oas.models.media.Schema schema11 = strSchema5.type("");
        io.swagger.oas.models.media.Schema schema13 = schema11.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        io.swagger.oas.models.media.Schema schema20 = strSchema14.type("");
        io.swagger.oas.models.media.Schema schema22 = schema20.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema23 = schema13.not(schema20);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema24 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str25 = strSchema24.getTitle();
        io.swagger.oas.models.media.Schema schema27 = strSchema24.format("");
        strSchema24.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema30 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema30.setType("hi!");
        strSchema30.setName("no description");
        io.swagger.oas.models.media.Schema schema36 = strSchema30.type("");
        io.swagger.oas.models.media.Schema schema38 = schema36.maxProperties((java.lang.Integer) 100);
        java.lang.String[] strArray40 = new java.lang.String[] { "default" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        schema38.setRequired((java.util.List<java.lang.String>) strList41);
        strSchema24.setRequired((java.util.List<java.lang.String>) strList41);
        io.swagger.oas.models.media.Schema schema45 = schema23.required((java.util.List<java.lang.String>) strList41);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation46 = null;
        io.swagger.oas.models.media.Schema schema47 = schema45.externalDocs(externalDocumentation46);
        strSchema0.setDefault((java.lang.Object) schema45);
        io.swagger.oas.models.media.Schema schema50 = schema45.maxLength((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema52 = schema50.$ref("no description");
        io.swagger.oas.annotations.links.LinkParameter[] linkParameterArray53 = new io.swagger.oas.annotations.links.LinkParameter[] {};
        java.util.Map<java.lang.String, java.lang.String> strMap54 = io.swagger.jaxrs2.OperationParser.getLinkParameters(linkParameterArray53);
        schema50.setExample((java.lang.Object) strMap54);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(linkParameterArray53);
        org.junit.Assert.assertNotNull(strMap54);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        java.lang.Integer int5 = strSchema0.getMaxProperties();
        strSchema0.setType("default");
        java.math.BigDecimal bigDecimal8 = null;
        io.swagger.oas.models.media.Schema schema9 = strSchema0.minimum(bigDecimal8);
        io.swagger.oas.models.media.Discriminator discriminator10 = null;
        io.swagger.oas.models.media.Schema schema11 = strSchema0.discriminator(discriminator10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation12 = null;
        strSchema0.setExternalDocs(externalDocumentation12);
        io.swagger.oas.models.media.XML xML14 = null;
        io.swagger.oas.models.media.Schema schema15 = strSchema0.xml(xML14);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation16 = schema15.getExternalDocs();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(externalDocumentation16);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.addRequiredItem("");
        io.swagger.oas.models.media.Schema schema8 = schema6.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = schema6.readOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema11 = schema6.getNot();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(schema11);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = strSchema10.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema10.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray23 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        schema20.setRequired((java.util.List<java.lang.String>) strList24);
        java.util.List<java.lang.String> strList27 = schema20.getEnum();
        io.swagger.oas.models.media.Schema schema28 = strSchema0.addProperties("hi!", schema20);
        io.swagger.oas.models.media.Schema schema30 = schema20.maxProperties((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = null;
        schema30.setExtensions(strMap31);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        io.swagger.oas.models.media.Schema schema5 = strSchema0.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema7 = schema5.addRequiredItem("*/*");
        schema7.addEnumItemObject("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int17 = strSchema12.getMinLength();
        java.lang.Integer int18 = strSchema12.getMaxLength();
        java.math.BigDecimal bigDecimal19 = strSchema12.getMaximum();
        io.swagger.oas.models.media.Schema schema20 = schema11.additionalProperties((io.swagger.oas.models.media.Schema) strSchema12);
        strSchema12.setType("");
        java.math.BigDecimal bigDecimal23 = strSchema12.getMinimum();
        strSchema12.setDeprecated((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(bigDecimal19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(bigDecimal23);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        io.swagger.oas.models.media.Schema schema2 = strSchema0.maxItems((java.lang.Integer) 100);
        schema2.setTitle("");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = schema2.getProperties();
        schema2.setDeprecated((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        java.util.List<java.lang.String> strList14 = strSchema11.getRequired();
        strSchema11.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int17 = strSchema11.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema18 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema18.setType("hi!");
        strSchema18.setName("no description");
        io.swagger.oas.models.media.Schema schema24 = strSchema18.type("");
        io.swagger.oas.models.media.Schema schema25 = strSchema11.not((io.swagger.oas.models.media.Schema) strSchema18);
        io.swagger.oas.models.media.XML xML26 = null;
        strSchema18.setXml(xML26);
        io.swagger.oas.models.media.Schema schema28 = schema9.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (io.swagger.oas.models.media.Schema) strSchema18);
        io.swagger.oas.models.media.Schema schema29 = schema28.getNot();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(schema29);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        strSchema0.set$ref("default");
        java.lang.Boolean boolean5 = strSchema0.getWriteOnly();
        java.lang.Boolean boolean6 = strSchema0.getUniqueItems();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        strSchema0.setMaxItems((java.lang.Integer) 10);
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean8 = strSchema0.getExclusiveMaximum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation9 = null;
        io.swagger.oas.models.media.Schema schema10 = strSchema0.externalDocs(externalDocumentation9);
        io.swagger.oas.models.media.Schema schema12 = strSchema0.maxItems((java.lang.Integer) 100);
        schema12.setWriteOnly((java.lang.Boolean) false);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap15 = null;
        io.swagger.oas.models.media.Schema schema16 = schema12.properties(strMap15);
        java.lang.Boolean boolean17 = schema12.getDeprecated();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.name("*/*");
        io.swagger.oas.models.media.Discriminator discriminator7 = null;
        schema6.setDiscriminator(discriminator7);
        java.lang.Integer int9 = schema6.getMaxProperties();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation7 = schema6.getExternalDocs();
        io.swagger.oas.models.media.Schema schema9 = schema6.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema11 = schema6.type("*/*");
        io.swagger.oas.annotations.links.Link link13 = null;
        java.util.Optional<io.swagger.oas.models.links.Link> linkOptional14 = io.swagger.jaxrs2.OperationParser.getLink(link13);
        schema11.addExtension("*/*", (java.lang.Object) linkOptional14);
        java.lang.Integer int16 = schema11.getMaxLength();
        io.swagger.oas.models.media.XML xML17 = null;
        schema11.setXml(xML17);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(externalDocumentation7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(linkOptional14);
        org.junit.Assert.assertNull(int16);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.exclusiveMaximum((java.lang.Boolean) false);
        schema6.setDescription("hi!");
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema7 = strSchema0.type("*/*");
        java.math.BigDecimal bigDecimal8 = null;
        strSchema0.setMaximum(bigDecimal8);
        strSchema0.setReadOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema13 = strSchema0.maxLength((java.lang.Integer) (-1));
        java.lang.Boolean boolean14 = schema13.getWriteOnly();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        schema6.setMinLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation10 = null;
        io.swagger.oas.models.media.Schema schema11 = schema6.externalDocs(externalDocumentation10);
        io.swagger.oas.models.media.Schema schema13 = schema11.description("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str14 = schema11.get$ref();
        schema11.setType("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        java.math.BigDecimal bigDecimal7 = null;
        strSchema0.setMinimum(bigDecimal7);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 1);
        schema10.setExclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        io.swagger.oas.models.media.Schema schema20 = strSchema14.type("");
        io.swagger.oas.models.media.Schema schema22 = schema20.maxProperties((java.lang.Integer) 100);
        schema22.setDeprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema25 = schema10.addProperties("*/*", schema22);
        schema10.setMinItems((java.lang.Integer) 10);
        schema10.setName("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation30 = null;
        schema10.setExternalDocs(externalDocumentation30);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema25);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getWriteOnly();
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal8 = null;
        strSchema0.setMultipleOf(bigDecimal8);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.addRequiredItem("");
        strSchema0.setTitle("hi!");
        java.math.BigDecimal bigDecimal13 = null;
        strSchema0.setMultipleOf(bigDecimal13);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        schema12.setDeprecated((java.lang.Boolean) true);
        schema12.setExclusiveMinimum((java.lang.Boolean) false);
        java.lang.Boolean boolean17 = schema12.getNullable();
        schema12.setNullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema20 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema20.setType("hi!");
        strSchema20.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema25 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema25.setType("hi!");
        java.util.List<java.lang.String> strList28 = strSchema25.getRequired();
        strSchema25.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int31 = strSchema25.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema32 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema32.setType("hi!");
        strSchema32.setName("no description");
        io.swagger.oas.models.media.Schema schema38 = strSchema32.type("");
        io.swagger.oas.models.media.Schema schema39 = strSchema25.not((io.swagger.oas.models.media.Schema) strSchema32);
        strSchema20.setExample((java.lang.Object) schema39);
        schema39.setNullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema43 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema43.setType("hi!");
        java.lang.Boolean boolean46 = strSchema43.getWriteOnly();
        io.swagger.oas.models.media.Schema schema48 = strSchema43.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema49 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema49.setType("hi!");
        java.lang.Boolean boolean52 = strSchema49.getWriteOnly();
        io.swagger.oas.models.media.Schema schema54 = strSchema49.type("default");
        strSchema43.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema49);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema56 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema56.setType("hi!");
        strSchema56.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean61 = strSchema56.getDeprecated();
        java.lang.String str62 = strSchema56.getDescription();
        io.swagger.oas.models.media.Schema schema64 = strSchema56.maxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema66 = schema64.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema68 = schema64.$ref("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema69 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema69.setType("hi!");
        strSchema69.setName("no description");
        io.swagger.oas.models.media.Schema schema75 = strSchema69.type("");
        io.swagger.oas.models.media.Schema schema77 = schema75.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema78 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema78.setType("hi!");
        strSchema78.setName("no description");
        io.swagger.oas.models.media.Schema schema84 = strSchema78.type("");
        io.swagger.oas.models.media.Schema schema86 = strSchema78.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema88 = strSchema78.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray91 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList92 = new java.util.ArrayList<java.lang.String>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList92, strArray91);
        schema88.setRequired((java.util.List<java.lang.String>) strList92);
        schema77.setRequired((java.util.List<java.lang.String>) strList92);
        io.swagger.oas.models.media.Schema schema96 = schema68.required((java.util.List<java.lang.String>) strList92);
        strSchema49.setRequired((java.util.List<java.lang.String>) strList92);
        schema39.setEnum((java.util.List<java.lang.String>) strList92);
        io.swagger.oas.models.media.Schema schema99 = schema12.required((java.util.List<java.lang.String>) strList92);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNull(strList28);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNull(boolean46);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNull(boolean52);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNull(boolean61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(schema77);
        org.junit.Assert.assertNotNull(schema84);
        org.junit.Assert.assertNotNull(schema86);
        org.junit.Assert.assertNotNull(schema88);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(schema96);
        org.junit.Assert.assertNotNull(schema99);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "";
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        java.lang.Boolean boolean3 = strSchema0.getExclusiveMaximum();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.pattern("");
        java.util.List<java.lang.String> strList6 = strSchema0.getRequired();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.lang.String str5 = strSchema0.getDescription();
        strSchema0.setMinProperties((java.lang.Integer) 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        java.lang.Boolean boolean5 = schema4.getUniqueItems();
        java.lang.Boolean boolean6 = schema4.getExclusiveMinimum();
        io.swagger.oas.models.media.Schema schema8 = schema4.minProperties((java.lang.Integer) 100);
        java.util.List<java.lang.String> strList9 = schema8.getEnum();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(strList9);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        strSchema7.setName("no description");
        io.swagger.oas.models.media.Schema schema13 = strSchema7.type("");
        io.swagger.oas.models.media.Schema schema14 = strSchema0.not((io.swagger.oas.models.media.Schema) strSchema7);
        strSchema7.addEnumItemObject("default");
        io.swagger.oas.models.media.Schema schema18 = strSchema7.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema19.setType("hi!");
        strSchema19.setName("no description");
        io.swagger.oas.models.media.Schema schema25 = strSchema19.type("");
        io.swagger.oas.models.media.Schema schema27 = schema25.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Discriminator discriminator28 = null;
        io.swagger.oas.models.media.Schema schema29 = schema25.discriminator(discriminator28);
        java.lang.String str30 = schema29.getFormat();
        java.math.BigDecimal bigDecimal31 = schema29.getMinimum();
        io.swagger.oas.models.media.Schema schema32 = schema18.not(schema29);
        schema29.setMaxProperties((java.lang.Integer) 0);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(bigDecimal31);
        org.junit.Assert.assertNotNull(schema32);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        schema6.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema10 = schema6.addRequiredItem("");
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema6.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        java.lang.Boolean boolean19 = strSchema13.getDeprecated();
        java.math.BigDecimal bigDecimal20 = strSchema13.getMultipleOf();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema21 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema21.setType("hi!");
        strSchema21.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap26 = null;
        io.swagger.oas.models.media.Schema schema27 = strSchema21.properties(strMap26);
        java.lang.Integer int28 = schema27.getMaxProperties();
        io.swagger.oas.models.media.Schema schema30 = schema27.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema32 = schema27.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema33 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema33.setType("hi!");
        strSchema33.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int38 = strSchema33.getMinLength();
        java.lang.Integer int39 = strSchema33.getMaxLength();
        java.math.BigDecimal bigDecimal40 = strSchema33.getMaximum();
        io.swagger.oas.models.media.Schema schema41 = schema32.additionalProperties((io.swagger.oas.models.media.Schema) strSchema33);
        java.lang.Integer int42 = strSchema33.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema43 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema43.setType("hi!");
        strSchema43.setName("no description");
        io.swagger.oas.models.media.Schema schema49 = strSchema43.type("");
        io.swagger.oas.models.media.Schema schema51 = strSchema43.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema52 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema52.setType("hi!");
        strSchema52.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema57 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema57.setType("hi!");
        strSchema57.setName("no description");
        strSchema52.setNot((io.swagger.oas.models.media.Schema) strSchema57);
        java.math.BigDecimal bigDecimal63 = null;
        io.swagger.oas.models.media.Schema schema64 = strSchema52.minimum(bigDecimal63);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema65 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema65.setType("hi!");
        strSchema65.setName("no description");
        io.swagger.oas.models.media.Schema schema71 = strSchema65.type("");
        io.swagger.oas.models.media.Schema schema73 = schema71.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema74 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema74.setType("hi!");
        strSchema74.setName("no description");
        io.swagger.oas.models.media.Schema schema80 = strSchema74.type("");
        io.swagger.oas.models.media.Schema schema82 = strSchema74.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema84 = strSchema74.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray87 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        schema84.setRequired((java.util.List<java.lang.String>) strList88);
        schema73.setRequired((java.util.List<java.lang.String>) strList88);
        io.swagger.oas.models.media.Schema schema92 = strSchema52.required((java.util.List<java.lang.String>) strList88);
        strSchema43.setEnum((java.util.List<java.lang.String>) strList88);
        strSchema33.setEnum((java.util.List<java.lang.String>) strList88);
        io.swagger.oas.models.media.Schema schema95 = strSchema13.required((java.util.List<java.lang.String>) strList88);
        java.lang.Integer int96 = schema95.getMaxLength();
        io.swagger.oas.models.media.Schema schema97 = schema6.additionalProperties(schema95);
        io.swagger.oas.models.media.Schema schema99 = schema95.minItems((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNull(bigDecimal20);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNull(bigDecimal40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(int42);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNotNull(schema84);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(schema92);
        org.junit.Assert.assertNotNull(schema95);
        org.junit.Assert.assertNull(int96);
        org.junit.Assert.assertNotNull(schema97);
        org.junit.Assert.assertNotNull(schema99);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getNullable();
        java.lang.Object obj2 = strSchema0.getExample();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.minProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        java.lang.Boolean boolean8 = strSchema5.getWriteOnly();
        strSchema5.setMaxItems((java.lang.Integer) 10);
        strSchema5.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean13 = strSchema5.getExclusiveMaximum();
        io.swagger.oas.models.media.Schema schema15 = strSchema5.minProperties((java.lang.Integer) 0);
        java.lang.Boolean boolean16 = strSchema5.getWriteOnly();
        io.swagger.oas.models.media.XML xML17 = strSchema5.getXml();
        io.swagger.oas.models.media.Schema schema19 = strSchema5.exclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = schema4.additionalProperties((io.swagger.oas.models.media.Schema) strSchema5);
        strSchema5.setDescription("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(xML17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        strSchema0.setDeprecated((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal6 = strSchema0.getMaximum();
        java.math.BigDecimal bigDecimal7 = strSchema0.getMinimum();
        io.swagger.oas.models.media.Schema schema9 = strSchema0.maxLength((java.lang.Integer) (-1));
        java.math.BigDecimal bigDecimal10 = null;
        strSchema0.setMaximum(bigDecimal10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray13 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        schema10.setRequired((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList17 = schema10.getEnum();
        java.lang.String str18 = schema10.toString();
        io.swagger.oas.models.media.Schema schema20 = schema10.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema22 = schema20.minProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        strSchema23.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap28 = null;
        io.swagger.oas.models.media.Schema schema29 = strSchema23.properties(strMap28);
        strSchema23.setMaxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema33 = strSchema23.pattern("no description");
        java.util.List<java.lang.String> strList34 = schema33.getEnum();
        schema20.setDefault((java.lang.Object) schema33);
        io.swagger.oas.models.media.Schema schema37 = schema33.readOnly((java.lang.Boolean) true);
        java.lang.String str38 = schema37.getDescription();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str18, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(strList34);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap6 = strSchema0.getProperties();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation7 = null;
        strSchema0.setExternalDocs(externalDocumentation7);
        java.lang.Class<?> wildcardClass9 = strSchema0.getClass();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        java.lang.Boolean boolean14 = strSchema11.getWriteOnly();
        io.swagger.oas.models.media.Schema schema16 = strSchema11.type("default");
        io.swagger.oas.models.media.Schema schema17 = strSchema0.not(schema16);
        io.swagger.oas.models.media.Schema schema19 = schema16.description("default");
        io.swagger.oas.models.media.Schema schema21 = schema19.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap27 = null;
        io.swagger.oas.models.media.Schema schema28 = strSchema22.properties(strMap27);
        java.lang.Integer int29 = schema28.getMaxProperties();
        io.swagger.oas.models.media.Schema schema31 = schema28.minProperties((java.lang.Integer) 0);
        java.lang.String str32 = schema28.getType();
        io.swagger.oas.models.media.Schema schema34 = schema28.maxLength((java.lang.Integer) 100);
        schema21.setNot(schema28);
        java.lang.Integer int36 = schema21.getMinProperties();
        java.lang.Class<?> wildcardClass37 = schema21.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.String str7 = strSchema0.getPattern();
        strSchema0.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema11 = strSchema0.exclusiveMinimum((java.lang.Boolean) true);
        schema11.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema15 = schema11.type("*/*");
        java.lang.String str16 = schema11.getName();
        io.swagger.oas.models.media.Schema schema18 = schema11.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.util.List<java.lang.String> strList19 = schema11.getRequired();
        java.math.BigDecimal bigDecimal20 = null;
        io.swagger.oas.models.media.Schema schema21 = schema11.minimum(bigDecimal20);
        java.lang.String str22 = schema11.getTitle();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int9 = schema8.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = schema16.format("no description");
        io.swagger.oas.models.media.Schema schema19 = schema8.not(schema18);
        io.swagger.oas.models.media.Schema schema21 = schema18.format("default");
        io.swagger.oas.models.media.Schema schema23 = schema18.exclusiveMinimum((java.lang.Boolean) false);
        schema18.setFormat("no description");
        io.swagger.oas.models.media.Discriminator discriminator26 = schema18.getDiscriminator();
        java.lang.Object obj27 = null;
        schema18.setExample(obj27);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(discriminator26);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxProperties((java.lang.Integer) (-1));
        java.math.BigDecimal bigDecimal12 = null;
        io.swagger.oas.models.media.Schema schema13 = schema11.multipleOf(bigDecimal12);
        java.math.BigDecimal bigDecimal14 = schema11.getMaximum();
        schema11.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(bigDecimal14);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        strSchema0.setMinProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema14 = strSchema0.minProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema15 = strSchema0.getAdditionalProperties();
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(schema15);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema13.title("no description");
        java.lang.String str21 = schema20.getDescription();
        boolean boolean22 = schema12.equals((java.lang.Object) schema20);
        io.swagger.oas.models.media.Schema schema24 = schema20.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema25 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema25.setType("hi!");
        java.lang.Boolean boolean28 = strSchema25.getWriteOnly();
        strSchema25.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Discriminator discriminator31 = strSchema25.getDiscriminator();
        io.swagger.oas.models.media.Schema schema32 = schema20.additionalProperties((io.swagger.oas.models.media.Schema) strSchema25);
        java.lang.Boolean boolean33 = strSchema25.getNullable();
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(discriminator31);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(boolean33);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal11 = null;
        schema10.setMultipleOf(bigDecimal11);
        io.swagger.oas.models.media.Schema schema14 = schema10.maxItems((java.lang.Integer) 100);
        schema14.setNullable((java.lang.Boolean) false);
        schema14.setMaxProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema19.setType("hi!");
        strSchema19.setName("no description");
        io.swagger.oas.models.media.Schema schema25 = strSchema19.type("");
        io.swagger.oas.models.media.Schema schema27 = schema25.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int28 = schema27.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema29 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema29.setType("hi!");
        strSchema29.setName("no description");
        io.swagger.oas.models.media.Schema schema35 = strSchema29.type("");
        io.swagger.oas.models.media.Schema schema37 = schema35.format("no description");
        io.swagger.oas.models.media.Schema schema38 = schema27.not(schema37);
        io.swagger.oas.models.media.Schema schema40 = schema37.format("default");
        io.swagger.oas.models.media.Schema schema42 = schema37.exclusiveMinimum((java.lang.Boolean) false);
        schema37.setFormat("no description");
        java.lang.Integer int45 = schema37.getMaxLength();
        schema14.setDefault((java.lang.Object) int45);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNull(int45);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema7 = strSchema0.$ref("");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema8 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema8.setType("hi!");
        strSchema8.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap13 = null;
        io.swagger.oas.models.media.Schema schema14 = strSchema8.properties(strMap13);
        java.lang.Integer int15 = schema14.getMaxProperties();
        io.swagger.oas.models.media.Schema schema17 = schema14.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema18 = schema7.not(schema17);
        schema18.setWriteOnly((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getDeprecated();
        boolean boolean5 = strSchema0.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal6 = null;
        io.swagger.oas.models.media.Schema schema7 = strSchema0.multipleOf(bigDecimal6);
        io.swagger.oas.models.media.Schema schema9 = strSchema0.deprecated((java.lang.Boolean) false);
        schema9.setMaxItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema13 = schema9.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Discriminator discriminator14 = null;
        schema9.setDiscriminator(discriminator14);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "no description";
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        java.lang.Boolean boolean9 = strSchema6.getWriteOnly();
        io.swagger.oas.models.media.Schema schema11 = strSchema6.type("default");
        strSchema0.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema6);
        io.swagger.oas.models.media.Schema schema14 = strSchema0.$ref("*/*");
        java.math.BigDecimal bigDecimal15 = null;
        strSchema0.setMaximum(bigDecimal15);
        java.lang.Boolean boolean17 = strSchema0.getExclusiveMaximum();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getDeprecated();
        boolean boolean5 = strSchema0.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal6 = null;
        io.swagger.oas.models.media.Schema schema7 = strSchema0.multipleOf(bigDecimal6);
        java.lang.String str8 = schema7.getType();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray13 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        schema10.setRequired((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList17 = schema10.getEnum();
        schema10.setMinProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Discriminator discriminator20 = null;
        io.swagger.oas.models.media.Schema schema21 = schema10.discriminator(discriminator20);
        java.lang.String str22 = schema10.getDescription();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        io.swagger.oas.models.media.Schema<io.swagger.jaxrs2.OperationParser> operationParserSchema0 = new io.swagger.oas.models.media.Schema<io.swagger.jaxrs2.OperationParser>();
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        schema6.setExclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema13 = schema6.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        io.swagger.oas.models.media.Schema schema20 = strSchema14.type("");
        java.lang.Integer int21 = schema20.getMaxProperties();
        java.math.BigDecimal bigDecimal22 = null;
        schema20.setMinimum(bigDecimal22);
        schema20.setExclusiveMinimum((java.lang.Boolean) true);
        java.lang.Boolean boolean26 = schema20.getExclusiveMaximum();
        io.swagger.oas.models.media.Schema schema27 = schema13.not(schema20);
        java.util.List<java.lang.String> strList28 = schema13.getRequired();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(strList28);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int17 = strSchema12.getMinLength();
        java.lang.Integer int18 = strSchema12.getMaxLength();
        java.math.BigDecimal bigDecimal19 = strSchema12.getMaximum();
        io.swagger.oas.models.media.Schema schema20 = schema11.additionalProperties((io.swagger.oas.models.media.Schema) strSchema12);
        io.swagger.oas.models.media.Schema schema22 = strSchema12.type("default");
        io.swagger.oas.models.media.Schema schema24 = schema22.minItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema26 = schema24.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Discriminator discriminator27 = schema26.getDiscriminator();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(bigDecimal19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(discriminator27);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        schema12.setDeprecated((java.lang.Boolean) true);
        java.lang.Boolean boolean15 = schema12.getExclusiveMaximum();
        java.lang.Boolean boolean16 = schema12.getExclusiveMaximum();
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        strSchema0.setPattern("");
        io.swagger.oas.models.media.Schema schema7 = strSchema0.addRequiredItem("*/*");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.getNot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = schema8.getExclusiveMinimum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNull(schema8);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation7 = schema6.getExternalDocs();
        io.swagger.oas.models.media.Schema schema9 = schema6.maxProperties((java.lang.Integer) 1);
        java.lang.String str10 = schema6.get$ref();
        java.lang.String str11 = schema6.get$ref();
        io.swagger.oas.models.media.Schema schema13 = schema6.minProperties((java.lang.Integer) 100);
        schema13.setTitle("hi!");
        io.swagger.oas.models.media.Schema schema17 = schema13.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.XML xML18 = schema13.getXml();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(externalDocumentation7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(xML18);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int17 = strSchema12.getMinLength();
        java.lang.Integer int18 = strSchema12.getMaxLength();
        java.math.BigDecimal bigDecimal19 = strSchema12.getMaximum();
        io.swagger.oas.models.media.Schema schema20 = schema11.additionalProperties((io.swagger.oas.models.media.Schema) strSchema12);
        io.swagger.oas.models.media.Schema schema22 = strSchema12.type("default");
        io.swagger.oas.models.media.Schema schema24 = schema22.minItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema26 = schema24.maxProperties((java.lang.Integer) 1);
        java.lang.Boolean boolean27 = schema24.getUniqueItems();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(bigDecimal19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(boolean27);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        java.lang.Integer int5 = strSchema0.getMaxProperties();
        strSchema0.setType("default");
        java.math.BigDecimal bigDecimal8 = null;
        io.swagger.oas.models.media.Schema schema9 = strSchema0.minimum(bigDecimal8);
        schema9.setDescription("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema13 = schema9.name("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation14 = null;
        schema9.setExternalDocs(externalDocumentation14);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema2 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema2.setType("hi!");
        strSchema2.setName("no description");
        io.swagger.oas.models.media.Schema schema8 = strSchema2.type("");
        schema8.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema12 = schema8.example((java.lang.Object) '#');
        strSchema0.setExample((java.lang.Object) schema8);
        io.swagger.oas.models.media.Schema schema15 = strSchema0.uniqueItems((java.lang.Boolean) true);
        java.lang.Boolean boolean16 = schema15.getReadOnly();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int9 = schema8.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = schema16.format("no description");
        io.swagger.oas.models.media.Schema schema19 = schema8.not(schema18);
        io.swagger.oas.models.media.Schema schema21 = schema18.format("default");
        io.swagger.oas.models.media.Schema schema23 = schema18.exclusiveMinimum((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal24 = null;
        schema23.setMinimum(bigDecimal24);
        io.swagger.oas.models.media.XML xML26 = null;
        io.swagger.oas.models.media.Schema schema27 = schema23.xml(xML26);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema28 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema28.setType("hi!");
        strSchema28.setName("no description");
        io.swagger.oas.models.media.Schema schema34 = strSchema28.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation35 = schema34.getExternalDocs();
        io.swagger.oas.models.media.Schema schema37 = schema34.maxProperties((java.lang.Integer) 1);
        java.lang.String str38 = schema34.get$ref();
        io.swagger.oas.models.media.Schema schema39 = schema23.not(schema34);
        java.math.BigDecimal bigDecimal40 = null;
        io.swagger.oas.models.media.Schema schema41 = schema23.multipleOf(bigDecimal40);
        java.lang.Integer int42 = schema23.getMaxProperties();
        java.math.BigDecimal bigDecimal43 = schema23.getMultipleOf();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNull(externalDocumentation35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(int42);
        org.junit.Assert.assertNull(bigDecimal43);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        java.util.List<java.lang.String> strList8 = strSchema5.getRequired();
        strSchema5.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int11 = strSchema5.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setName("no description");
        io.swagger.oas.models.media.Schema schema18 = strSchema12.type("");
        io.swagger.oas.models.media.Schema schema19 = strSchema5.not((io.swagger.oas.models.media.Schema) strSchema12);
        strSchema0.setExample((java.lang.Object) schema19);
        io.swagger.oas.models.media.Schema schema22 = schema19.maxProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        io.swagger.oas.models.media.Schema schema27 = strSchema23.maxLength((java.lang.Integer) 1);
        schema27.setPattern("");
        io.swagger.oas.models.media.Schema schema31 = schema27.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema33 = schema31.minItems((java.lang.Integer) 10);
        schema19.setExample((java.lang.Object) schema33);
        java.lang.String str35 = schema33.getDescription();
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        io.swagger.oas.models.media.Schema schema5 = strSchema0.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema7 = schema5.exclusiveMaximum((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal8 = schema7.getMaximum();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNull(bigDecimal8);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.properties(strMap8);
        io.swagger.oas.models.media.Discriminator discriminator10 = schema9.getDiscriminator();
        java.lang.String str11 = schema9.getFormat();
        java.lang.Class<?> wildcardClass12 = schema9.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(discriminator10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        schema3.addEnumItemObject("");
        io.swagger.oas.models.media.Schema schema6 = schema3.getNot();
        schema3.setMinItems((java.lang.Integer) 1);
        java.math.BigDecimal bigDecimal9 = schema3.getMultipleOf();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(schema6);
        org.junit.Assert.assertNull(bigDecimal9);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        schema4.setPattern("");
        io.swagger.oas.models.media.Schema schema8 = schema4.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema10 = schema4.minItems((java.lang.Integer) 100);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema10.properties(strMap11);
        java.math.BigDecimal bigDecimal13 = schema12.getMinimum();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(bigDecimal13);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.name("hi!");
        io.swagger.oas.models.media.Schema schema13 = schema6.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.util.List<java.lang.String> strList14 = schema13.getRequired();
        java.lang.Integer int15 = schema13.getMaxProperties();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.String str7 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema8 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema8.setType("hi!");
        strSchema8.setName("no description");
        io.swagger.oas.models.media.Schema schema14 = strSchema8.type("");
        java.lang.Integer int15 = schema14.getMaxProperties();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap16 = null;
        io.swagger.oas.models.media.Schema schema17 = schema14.properties(strMap16);
        schema14.setPattern("hi!");
        io.swagger.oas.models.media.Schema schema21 = schema14.title("default");
        schema21.setReadOnly((java.lang.Boolean) false);
        strSchema0.setNot(schema21);
        schema21.setMaxItems((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray13 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        schema10.setRequired((java.util.List<java.lang.String>) strList14);
        io.swagger.oas.models.media.XML xML17 = null;
        schema10.setXml(xML17);
        schema10.setMaxItems((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema22 = schema10.deprecated((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal23 = null;
        io.swagger.oas.models.media.Schema schema24 = schema22.multipleOf(bigDecimal23);
        java.math.BigDecimal bigDecimal25 = null;
        schema24.setMaximum(bigDecimal25);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        java.math.BigDecimal bigDecimal13 = null;
        io.swagger.oas.models.media.Schema schema14 = schema12.multipleOf(bigDecimal13);
        schema12.setExclusiveMinimum((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal17 = schema12.getMultipleOf();
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(bigDecimal17);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        strSchema6.setName("no description");
        io.swagger.oas.models.media.Schema schema12 = strSchema6.type("");
        java.lang.Integer int13 = schema12.getMaxProperties();
        java.math.BigDecimal bigDecimal14 = null;
        schema12.setMinimum(bigDecimal14);
        io.swagger.oas.models.media.Schema schema17 = schema12.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema18 = schema12.getAdditionalProperties();
        boolean boolean19 = strSchema0.equals((java.lang.Object) schema12);
        io.swagger.oas.models.media.Schema schema21 = schema12.uniqueItems((java.lang.Boolean) false);
        java.lang.String str22 = schema12.getDescription();
        io.swagger.oas.models.media.Schema schema24 = schema12.maxItems((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass25 = schema24.getClass();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        io.swagger.oas.models.media.Schema<java.lang.CharSequence> charSequenceSchema0 = new io.swagger.oas.models.media.Schema<java.lang.CharSequence>();
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = strSchema10.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema10.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray23 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        schema20.setRequired((java.util.List<java.lang.String>) strList24);
        java.util.List<java.lang.String> strList27 = schema20.getEnum();
        io.swagger.oas.models.media.Schema schema28 = strSchema0.addProperties("hi!", schema20);
        io.swagger.oas.models.media.Discriminator discriminator29 = null;
        io.swagger.oas.models.media.Schema schema30 = strSchema0.discriminator(discriminator29);
        java.lang.Boolean boolean31 = strSchema0.getDeprecated();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNull(boolean31);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        java.lang.Boolean boolean14 = strSchema11.getWriteOnly();
        io.swagger.oas.models.media.Schema schema16 = strSchema11.type("default");
        io.swagger.oas.models.media.Schema schema17 = strSchema0.not(schema16);
        io.swagger.oas.models.media.Schema schema19 = schema17.minItems((java.lang.Integer) 0);
        schema19.setUniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap27 = null;
        io.swagger.oas.models.media.Schema schema28 = strSchema22.properties(strMap27);
        schema28.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean31 = schema28.getExclusiveMinimum();
        schema28.addEnumItemObject("default");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation34 = schema28.getExternalDocs();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema35 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema35.setType("hi!");
        java.lang.Boolean boolean38 = strSchema35.getWriteOnly();
        io.swagger.oas.models.media.Schema schema40 = strSchema35.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema41 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema41.setType("hi!");
        java.lang.Boolean boolean44 = strSchema41.getWriteOnly();
        io.swagger.oas.models.media.Schema schema46 = strSchema41.type("default");
        strSchema35.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema41);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema48 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema48.setType("hi!");
        strSchema48.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean53 = strSchema48.getDeprecated();
        java.lang.String str54 = strSchema48.getDescription();
        io.swagger.oas.models.media.Schema schema56 = strSchema48.maxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema58 = schema56.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema60 = schema56.$ref("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema61 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema61.setType("hi!");
        strSchema61.setName("no description");
        io.swagger.oas.models.media.Schema schema67 = strSchema61.type("");
        io.swagger.oas.models.media.Schema schema69 = schema67.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema70 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema70.setType("hi!");
        strSchema70.setName("no description");
        io.swagger.oas.models.media.Schema schema76 = strSchema70.type("");
        io.swagger.oas.models.media.Schema schema78 = strSchema70.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema80 = strSchema70.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray83 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        schema80.setRequired((java.util.List<java.lang.String>) strList84);
        schema69.setRequired((java.util.List<java.lang.String>) strList84);
        io.swagger.oas.models.media.Schema schema88 = schema60.required((java.util.List<java.lang.String>) strList84);
        strSchema41.setRequired((java.util.List<java.lang.String>) strList84);
        schema28.setRequired((java.util.List<java.lang.String>) strList84);
        schema19.setEnum((java.util.List<java.lang.String>) strList84);
        java.util.Map<java.lang.String, java.lang.Object> strMap92 = null;
        schema19.setExtensions(strMap92);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNull(externalDocumentation34);
        org.junit.Assert.assertNull(boolean38);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(boolean44);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNull(boolean53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema78);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(schema88);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int17 = strSchema12.getMinLength();
        java.lang.Integer int18 = strSchema12.getMaxLength();
        java.math.BigDecimal bigDecimal19 = strSchema12.getMaximum();
        io.swagger.oas.models.media.Schema schema20 = schema11.additionalProperties((io.swagger.oas.models.media.Schema) strSchema12);
        java.lang.Integer int21 = strSchema12.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setName("no description");
        io.swagger.oas.models.media.Schema schema28 = strSchema22.type("");
        io.swagger.oas.models.media.Schema schema30 = strSchema22.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema31 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema31.setType("hi!");
        strSchema31.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema36 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema36.setType("hi!");
        strSchema36.setName("no description");
        strSchema31.setNot((io.swagger.oas.models.media.Schema) strSchema36);
        java.math.BigDecimal bigDecimal42 = null;
        io.swagger.oas.models.media.Schema schema43 = strSchema31.minimum(bigDecimal42);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema44 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema44.setType("hi!");
        strSchema44.setName("no description");
        io.swagger.oas.models.media.Schema schema50 = strSchema44.type("");
        io.swagger.oas.models.media.Schema schema52 = schema50.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema53 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema53.setType("hi!");
        strSchema53.setName("no description");
        io.swagger.oas.models.media.Schema schema59 = strSchema53.type("");
        io.swagger.oas.models.media.Schema schema61 = strSchema53.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema63 = strSchema53.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray66 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        schema63.setRequired((java.util.List<java.lang.String>) strList67);
        schema52.setRequired((java.util.List<java.lang.String>) strList67);
        io.swagger.oas.models.media.Schema schema71 = strSchema31.required((java.util.List<java.lang.String>) strList67);
        strSchema22.setEnum((java.util.List<java.lang.String>) strList67);
        strSchema12.setEnum((java.util.List<java.lang.String>) strList67);
        io.swagger.oas.models.media.Schema schema75 = strSchema12.type("*/*");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap76 = strSchema12.getProperties();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(bigDecimal19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNull(strMap76);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema13 = schema6.nullable((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema15 = schema13.writeOnly((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal16 = schema13.getMaximum();
        java.lang.Boolean boolean17 = schema13.getExclusiveMinimum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(bigDecimal16);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema13.title("no description");
        java.lang.String str21 = schema20.getDescription();
        boolean boolean22 = schema12.equals((java.lang.Object) schema20);
        java.lang.Boolean boolean23 = schema20.getExclusiveMaximum();
        schema20.setType("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema27 = schema20.readOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema28 = schema27.getNot();
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.oas.models.media.Schema schema29 = schema28.getNot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(schema28);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 10\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int9 = schema8.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = schema16.format("no description");
        io.swagger.oas.models.media.Schema schema19 = schema8.not(schema18);
        io.swagger.oas.models.media.Schema schema21 = schema18.format("default");
        io.swagger.oas.models.media.Schema schema23 = schema18.exclusiveMinimum((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal24 = null;
        schema23.setMinimum(bigDecimal24);
        io.swagger.oas.models.media.XML xML26 = null;
        io.swagger.oas.models.media.Schema schema27 = schema23.xml(xML26);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema28 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema28.setType("hi!");
        strSchema28.setName("no description");
        io.swagger.oas.models.media.Schema schema34 = strSchema28.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation35 = schema34.getExternalDocs();
        io.swagger.oas.models.media.Schema schema37 = schema34.maxProperties((java.lang.Integer) 1);
        java.lang.String str38 = schema34.get$ref();
        io.swagger.oas.models.media.Schema schema39 = schema23.not(schema34);
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = null;
        schema39.setExtensions(strMap40);
        java.lang.Boolean boolean42 = schema39.getNullable();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNull(externalDocumentation35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNull(boolean42);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Boolean boolean6 = strSchema0.getDeprecated();
        java.math.BigDecimal bigDecimal7 = strSchema0.getMultipleOf();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema8 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema8.setType("hi!");
        strSchema8.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap13 = null;
        io.swagger.oas.models.media.Schema schema14 = strSchema8.properties(strMap13);
        java.lang.Integer int15 = schema14.getMaxProperties();
        io.swagger.oas.models.media.Schema schema17 = schema14.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema19 = schema14.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema20 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema20.setType("hi!");
        strSchema20.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int25 = strSchema20.getMinLength();
        java.lang.Integer int26 = strSchema20.getMaxLength();
        java.math.BigDecimal bigDecimal27 = strSchema20.getMaximum();
        io.swagger.oas.models.media.Schema schema28 = schema19.additionalProperties((io.swagger.oas.models.media.Schema) strSchema20);
        java.lang.Integer int29 = strSchema20.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema30 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema30.setType("hi!");
        strSchema30.setName("no description");
        io.swagger.oas.models.media.Schema schema36 = strSchema30.type("");
        io.swagger.oas.models.media.Schema schema38 = strSchema30.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema39 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema39.setType("hi!");
        strSchema39.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema44 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema44.setType("hi!");
        strSchema44.setName("no description");
        strSchema39.setNot((io.swagger.oas.models.media.Schema) strSchema44);
        java.math.BigDecimal bigDecimal50 = null;
        io.swagger.oas.models.media.Schema schema51 = strSchema39.minimum(bigDecimal50);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema52 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema52.setType("hi!");
        strSchema52.setName("no description");
        io.swagger.oas.models.media.Schema schema58 = strSchema52.type("");
        io.swagger.oas.models.media.Schema schema60 = schema58.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema61 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema61.setType("hi!");
        strSchema61.setName("no description");
        io.swagger.oas.models.media.Schema schema67 = strSchema61.type("");
        io.swagger.oas.models.media.Schema schema69 = strSchema61.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema71 = strSchema61.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray74 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        schema71.setRequired((java.util.List<java.lang.String>) strList75);
        schema60.setRequired((java.util.List<java.lang.String>) strList75);
        io.swagger.oas.models.media.Schema schema79 = strSchema39.required((java.util.List<java.lang.String>) strList75);
        strSchema30.setEnum((java.util.List<java.lang.String>) strList75);
        strSchema20.setEnum((java.util.List<java.lang.String>) strList75);
        io.swagger.oas.models.media.Schema schema82 = strSchema0.required((java.util.List<java.lang.String>) strList75);
        java.lang.Integer int83 = schema82.getMaxLength();
        java.lang.Boolean boolean84 = schema82.getDeprecated();
        java.lang.Boolean boolean85 = schema82.getNullable();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNull(bigDecimal27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(schema79);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNull(int83);
        org.junit.Assert.assertNull(boolean84);
        org.junit.Assert.assertNull(boolean85);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap6 = strSchema0.getProperties();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation7 = null;
        strSchema0.setExternalDocs(externalDocumentation7);
        io.swagger.oas.models.media.Discriminator discriminator9 = null;
        strSchema0.setDiscriminator(discriminator9);
        java.lang.Boolean boolean11 = strSchema0.getDeprecated();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        java.lang.Boolean boolean9 = strSchema6.getWriteOnly();
        io.swagger.oas.models.media.Schema schema11 = strSchema6.type("default");
        strSchema0.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema6);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        strSchema13.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean18 = strSchema13.getDeprecated();
        java.lang.String str19 = strSchema13.getDescription();
        io.swagger.oas.models.media.Schema schema21 = strSchema13.maxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema23 = schema21.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema25 = schema21.$ref("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema26 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema26.setType("hi!");
        strSchema26.setName("no description");
        io.swagger.oas.models.media.Schema schema32 = strSchema26.type("");
        io.swagger.oas.models.media.Schema schema34 = schema32.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema35 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema35.setType("hi!");
        strSchema35.setName("no description");
        io.swagger.oas.models.media.Schema schema41 = strSchema35.type("");
        io.swagger.oas.models.media.Schema schema43 = strSchema35.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema45 = strSchema35.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray48 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        schema45.setRequired((java.util.List<java.lang.String>) strList49);
        schema34.setRequired((java.util.List<java.lang.String>) strList49);
        io.swagger.oas.models.media.Schema schema53 = schema25.required((java.util.List<java.lang.String>) strList49);
        strSchema6.setRequired((java.util.List<java.lang.String>) strList49);
        java.lang.Integer int55 = strSchema6.getMinLength();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNull(int55);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        strSchema9.setNot((io.swagger.oas.models.media.Schema) strSchema14);
        java.math.BigDecimal bigDecimal20 = null;
        io.swagger.oas.models.media.Schema schema21 = strSchema9.minimum(bigDecimal20);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setName("no description");
        io.swagger.oas.models.media.Schema schema28 = strSchema22.type("");
        io.swagger.oas.models.media.Schema schema30 = schema28.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema31 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema31.setType("hi!");
        strSchema31.setName("no description");
        io.swagger.oas.models.media.Schema schema37 = strSchema31.type("");
        io.swagger.oas.models.media.Schema schema39 = strSchema31.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema41 = strSchema31.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray44 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        schema41.setRequired((java.util.List<java.lang.String>) strList45);
        schema30.setRequired((java.util.List<java.lang.String>) strList45);
        io.swagger.oas.models.media.Schema schema49 = strSchema9.required((java.util.List<java.lang.String>) strList45);
        strSchema0.setEnum((java.util.List<java.lang.String>) strList45);
        java.math.BigDecimal bigDecimal51 = strSchema0.getMinimum();
        strSchema0.setNullable((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNull(bigDecimal51);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal12 = schema6.getMinimum();
        java.math.BigDecimal bigDecimal13 = null;
        io.swagger.oas.models.media.Schema schema14 = schema6.maximum(bigDecimal13);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation15 = schema6.getExternalDocs();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(externalDocumentation15);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema schema15 = strSchema9.type("");
        io.swagger.oas.models.media.Schema schema17 = schema15.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema18 = schema8.not(schema15);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str20 = strSchema19.getTitle();
        io.swagger.oas.models.media.Schema schema22 = strSchema19.format("");
        strSchema19.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema25 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema25.setType("hi!");
        strSchema25.setName("no description");
        io.swagger.oas.models.media.Schema schema31 = strSchema25.type("");
        io.swagger.oas.models.media.Schema schema33 = schema31.maxProperties((java.lang.Integer) 100);
        java.lang.String[] strArray35 = new java.lang.String[] { "default" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        schema33.setRequired((java.util.List<java.lang.String>) strList36);
        strSchema19.setRequired((java.util.List<java.lang.String>) strList36);
        io.swagger.oas.models.media.Schema schema40 = schema18.required((java.util.List<java.lang.String>) strList36);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation41 = null;
        io.swagger.oas.models.media.Schema schema42 = schema40.externalDocs(externalDocumentation41);
        schema40.setUniqueItems((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema42);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal11 = null;
        schema10.setMultipleOf(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        strSchema13.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap18 = null;
        io.swagger.oas.models.media.Schema schema19 = strSchema13.properties(strMap18);
        java.lang.Integer int20 = schema19.getMaxProperties();
        io.swagger.oas.models.media.Schema schema22 = schema19.type("*/*");
        schema10.setAdditionalProperties(schema22);
        io.swagger.oas.models.media.Schema schema25 = schema22.maxItems((java.lang.Integer) 1);
        java.lang.Integer int26 = schema22.getMinLength();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema schema15 = strSchema9.type("");
        io.swagger.oas.models.media.Schema schema17 = schema15.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema18 = schema8.not(schema15);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str20 = strSchema19.getTitle();
        io.swagger.oas.models.media.Schema schema22 = strSchema19.format("");
        strSchema19.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema25 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema25.setType("hi!");
        strSchema25.setName("no description");
        io.swagger.oas.models.media.Schema schema31 = strSchema25.type("");
        io.swagger.oas.models.media.Schema schema33 = schema31.maxProperties((java.lang.Integer) 100);
        java.lang.String[] strArray35 = new java.lang.String[] { "default" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        schema33.setRequired((java.util.List<java.lang.String>) strList36);
        strSchema19.setRequired((java.util.List<java.lang.String>) strList36);
        io.swagger.oas.models.media.Schema schema40 = schema18.required((java.util.List<java.lang.String>) strList36);
        io.swagger.oas.models.media.Schema schema41 = schema18.getAdditionalProperties();
        io.swagger.oas.models.media.Schema schema42 = schema18.getNot();
        java.math.BigDecimal bigDecimal43 = null;
        schema18.setMaximum(bigDecimal43);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        io.swagger.oas.models.media.Discriminator discriminator7 = null;
        io.swagger.oas.models.media.Schema schema8 = strSchema0.discriminator(discriminator7);
        io.swagger.oas.models.media.Schema schema10 = schema8.description("default");
        schema10.setNullable((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema10 = schema8.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema12 = schema8.$ref("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        strSchema13.setName("no description");
        io.swagger.oas.models.media.Schema schema19 = strSchema13.type("");
        io.swagger.oas.models.media.Schema schema21 = schema19.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setName("no description");
        io.swagger.oas.models.media.Schema schema28 = strSchema22.type("");
        io.swagger.oas.models.media.Schema schema30 = strSchema22.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema32 = strSchema22.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray35 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        schema32.setRequired((java.util.List<java.lang.String>) strList36);
        schema21.setRequired((java.util.List<java.lang.String>) strList36);
        io.swagger.oas.models.media.Schema schema40 = schema12.required((java.util.List<java.lang.String>) strList36);
        java.lang.Integer int41 = schema12.getMinProperties();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation42 = schema12.getExternalDocs();
        io.swagger.oas.models.media.Discriminator discriminator43 = null;
        schema12.setDiscriminator(discriminator43);
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = null;
        schema12.setExtensions(strMap45);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertNull(externalDocumentation42);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.properties(strMap8);
        schema6.setPattern("hi!");
        io.swagger.oas.models.media.Schema schema13 = schema6.title("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema15.setType("hi!");
        strSchema15.setName("no description");
        io.swagger.oas.models.media.Schema schema21 = strSchema15.type("");
        io.swagger.oas.models.media.Schema schema23 = schema21.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema24 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema24.setType("hi!");
        strSchema24.setName("no description");
        io.swagger.oas.models.media.Schema schema30 = strSchema24.type("");
        io.swagger.oas.models.media.Schema schema32 = schema30.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema33 = schema23.not(schema30);
        io.swagger.oas.models.media.Schema schema35 = schema23.minItems((java.lang.Integer) 0);
        schema13.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) 0);
        java.lang.Boolean boolean37 = schema13.getNullable();
        schema13.setUniqueItems((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNull(boolean37);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        java.lang.Boolean boolean9 = strSchema6.getWriteOnly();
        io.swagger.oas.models.media.Schema schema11 = strSchema6.type("default");
        strSchema0.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema6);
        io.swagger.oas.models.media.Schema schema14 = strSchema0.$ref("*/*");
        io.swagger.oas.models.media.Schema schema16 = schema14.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str17 = schema16.getPattern();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str17, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        strSchema0.setExtensions(strMap1);
        io.swagger.oas.models.media.Schema schema4 = strSchema0.type("");
        schema4.setDeprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema8 = schema4.minProperties((java.lang.Integer) 0);
        schema4.setNullable((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.deprecated((java.lang.Boolean) false);
        schema5.setUniqueItems((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.format("no description");
        io.swagger.oas.models.media.Schema schema10 = schema8.format("");
        io.swagger.oas.models.media.Schema schema12 = schema8.maxItems((java.lang.Integer) 0);
        io.swagger.oas.annotations.links.LinkParameter[] linkParameterArray13 = new io.swagger.oas.annotations.links.LinkParameter[] {};
        java.util.Map<java.lang.String, java.lang.String> strMap14 = io.swagger.jaxrs2.OperationParser.getLinkParameters(linkParameterArray13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = io.swagger.jaxrs2.OperationParser.getLinkParameters(linkParameterArray13);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = io.swagger.jaxrs2.OperationParser.getLinkParameters(linkParameterArray13);
        boolean boolean17 = schema8.equals((java.lang.Object) strMap16);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(linkParameterArray13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int9 = schema8.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = schema16.format("no description");
        io.swagger.oas.models.media.Schema schema19 = schema8.not(schema18);
        io.swagger.oas.models.media.Schema schema21 = schema18.format("default");
        java.lang.String str22 = schema18.getFormat();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        strSchema23.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema28 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema28.setType("hi!");
        java.util.List<java.lang.String> strList31 = strSchema28.getRequired();
        strSchema28.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int34 = strSchema28.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema35 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema35.setType("hi!");
        strSchema35.setName("no description");
        io.swagger.oas.models.media.Schema schema41 = strSchema35.type("");
        io.swagger.oas.models.media.Schema schema42 = strSchema28.not((io.swagger.oas.models.media.Schema) strSchema35);
        strSchema23.setExample((java.lang.Object) schema42);
        java.math.BigDecimal bigDecimal44 = null;
        io.swagger.oas.models.media.Schema schema45 = schema42.multipleOf(bigDecimal44);
        io.swagger.oas.models.media.Schema schema46 = schema18.example((java.lang.Object) schema42);
        java.lang.String str47 = schema42.getFormat();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation48 = null;
        schema42.setExternalDocs(externalDocumentation48);
        java.lang.Integer int50 = schema42.getMinLength();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "default" + "'", str22, "default");
        org.junit.Assert.assertNull(strList31);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(int50);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema7 = strSchema0.$ref("");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema8 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema8.setType("hi!");
        strSchema8.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap13 = null;
        io.swagger.oas.models.media.Schema schema14 = strSchema8.properties(strMap13);
        java.lang.Integer int15 = schema14.getMaxProperties();
        io.swagger.oas.models.media.Schema schema17 = schema14.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema18 = schema7.not(schema17);
        io.swagger.oas.models.media.Schema schema20 = schema17.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Discriminator discriminator21 = schema17.getDiscriminator();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(discriminator21);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.discriminator(discriminator8);
        schema9.setMaxProperties((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal12 = null;
        io.swagger.oas.models.media.Schema schema13 = schema9.multipleOf(bigDecimal12);
        io.swagger.oas.models.media.Schema schema14 = schema9.getAdditionalProperties();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(schema14);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        strSchema7.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap12 = null;
        io.swagger.oas.models.media.Schema schema13 = strSchema7.properties(strMap12);
        java.lang.Integer int14 = schema13.getMaxProperties();
        io.swagger.oas.models.media.Schema schema16 = schema13.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema18 = schema13.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema19.setType("hi!");
        strSchema19.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int24 = strSchema19.getMinLength();
        java.lang.Integer int25 = strSchema19.getMaxLength();
        java.math.BigDecimal bigDecimal26 = strSchema19.getMaximum();
        io.swagger.oas.models.media.Schema schema27 = schema18.additionalProperties((io.swagger.oas.models.media.Schema) strSchema19);
        strSchema19.setType("");
        io.swagger.oas.models.media.Schema schema30 = schema5.addProperties("default", (io.swagger.oas.models.media.Schema) strSchema19);
        strSchema19.setMinItems((java.lang.Integer) 10);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNull(bigDecimal26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema30);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.discriminator(discriminator8);
        schema9.setMaxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema13 = schema9.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema15 = schema9.$ref("default");
        java.lang.Boolean boolean16 = schema9.getDeprecated();
        io.swagger.oas.models.media.Schema schema18 = schema9.minLength((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass19 = schema9.getClass();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        java.lang.String str7 = strSchema0.get$ref();
        java.lang.String str8 = strSchema0.getPattern();
        java.math.BigDecimal bigDecimal9 = null;
        strSchema0.setMultipleOf(bigDecimal9);
        io.swagger.oas.models.media.Schema schema11 = strSchema0.getNot();
        java.lang.Object obj12 = null;
        strSchema0.setExample(obj12);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(schema11);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        strSchema0.setMaxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema7 = strSchema0.$ref("hi!");
        java.math.BigDecimal bigDecimal8 = strSchema0.getMinimum();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNull(bigDecimal8);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.String str7 = strSchema0.getPattern();
        strSchema0.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema11 = strSchema0.exclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema13 = strSchema0.maxLength((java.lang.Integer) (-1));
        java.lang.Boolean boolean14 = schema13.getDeprecated();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.exclusiveMaximum((java.lang.Boolean) false);
        schema8.setDeprecated((java.lang.Boolean) false);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema8.externalDocs(externalDocumentation11);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation13 = null;
        schema12.setExternalDocs(externalDocumentation13);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema13 = schema6.exclusiveMaximum((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal14 = schema6.getMaximum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(bigDecimal14);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation7 = schema6.getExternalDocs();
        io.swagger.oas.models.media.Schema schema9 = schema6.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema11 = schema6.type("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        java.lang.Boolean boolean15 = strSchema12.getDeprecated();
        boolean boolean17 = strSchema12.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal18 = null;
        io.swagger.oas.models.media.Schema schema19 = strSchema12.multipleOf(bigDecimal18);
        io.swagger.oas.models.media.Schema schema21 = strSchema12.deprecated((java.lang.Boolean) false);
        boolean boolean22 = schema6.equals((java.lang.Object) schema21);
        java.math.BigDecimal bigDecimal23 = null;
        io.swagger.oas.models.media.Schema schema24 = schema6.maximum(bigDecimal23);
        io.swagger.oas.models.media.Schema schema26 = schema24.nullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema28 = schema26.readOnly((java.lang.Boolean) true);
        schema26.setUniqueItems((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(externalDocumentation7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema28);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.format("no description");
        schema6.setMinLength((java.lang.Integer) 10);
        java.lang.String str11 = schema6.getPattern();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema7 = strSchema0.title("no description");
        java.lang.String str8 = schema7.getDescription();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation9 = null;
        io.swagger.oas.models.media.Schema schema10 = schema7.externalDocs(externalDocumentation9);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str12 = strSchema11.getTitle();
        io.swagger.oas.models.media.Schema schema14 = strSchema11.format("");
        strSchema11.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        io.swagger.oas.models.media.Schema schema21 = strSchema17.maxLength((java.lang.Integer) 1);
        schema21.setPattern("");
        io.swagger.oas.models.media.Schema schema25 = schema21.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray29 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        schema25.setEnum((java.util.List<java.lang.String>) strList30);
        strSchema11.setEnum((java.util.List<java.lang.String>) strList30);
        schema10.setRequired((java.util.List<java.lang.String>) strList30);
        java.lang.Class<?> wildcardClass35 = schema10.getClass();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        java.math.BigDecimal bigDecimal7 = null;
        strSchema0.setMinimum(bigDecimal7);
        strSchema0.setMaxItems((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema12 = strSchema0.exclusiveMaximum((java.lang.Boolean) true);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        schema4.setPattern("");
        io.swagger.oas.models.media.Schema schema8 = schema4.maxItems((java.lang.Integer) 10);
        java.lang.String str9 = schema4.getName();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int17 = strSchema12.getMinLength();
        java.lang.Integer int18 = strSchema12.getMaxLength();
        java.math.BigDecimal bigDecimal19 = strSchema12.getMaximum();
        io.swagger.oas.models.media.Schema schema20 = schema11.additionalProperties((io.swagger.oas.models.media.Schema) strSchema12);
        strSchema12.setType("");
        java.lang.Boolean boolean23 = strSchema12.getWriteOnly();
        java.lang.Class<?> wildcardClass24 = strSchema12.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(bigDecimal19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + boolean23 + "' != '" + false + "'", boolean23, false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int5 = strSchema0.getMinLength();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema8 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema8.setType("hi!");
        java.util.List<java.lang.String> strList11 = strSchema8.getRequired();
        strSchema8.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema15 = strSchema8.title("no description");
        schema15.set$ref("");
        io.swagger.oas.models.media.Schema schema19 = schema15.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema0.addProperties("*/*", schema19);
        java.math.BigDecimal bigDecimal21 = schema20.getMinimum();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(bigDecimal21);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        java.util.List<java.lang.String> strList8 = strSchema5.getRequired();
        strSchema5.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int11 = strSchema5.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setName("no description");
        io.swagger.oas.models.media.Schema schema18 = strSchema12.type("");
        io.swagger.oas.models.media.Schema schema19 = strSchema5.not((io.swagger.oas.models.media.Schema) strSchema12);
        strSchema0.setExample((java.lang.Object) schema19);
        java.math.BigDecimal bigDecimal21 = null;
        schema19.setMultipleOf(bigDecimal21);
        schema19.addEnumItemObject("hi!");
        java.lang.Boolean boolean25 = schema19.getNullable();
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(boolean25);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal11 = null;
        schema10.setMinimum(bigDecimal11);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.String[] strArray10 = new java.lang.String[] { "default" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        schema8.setRequired((java.util.List<java.lang.String>) strList11);
        java.lang.Class<?> wildcardClass14 = strList11.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema13.title("no description");
        java.lang.String str21 = schema20.getDescription();
        boolean boolean22 = schema12.equals((java.lang.Object) schema20);
        io.swagger.oas.models.media.Schema schema24 = schema20.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema25 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema25.setType("hi!");
        java.lang.Boolean boolean28 = strSchema25.getWriteOnly();
        strSchema25.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Discriminator discriminator31 = strSchema25.getDiscriminator();
        io.swagger.oas.models.media.Schema schema32 = schema20.additionalProperties((io.swagger.oas.models.media.Schema) strSchema25);
        java.math.BigDecimal bigDecimal33 = null;
        strSchema25.setMultipleOf(bigDecimal33);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(discriminator31);
        org.junit.Assert.assertNotNull(schema32);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.type("*/*");
        java.lang.Class<?> wildcardClass10 = schema6.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema schema7 = schema5.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.XML xML8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema5.xml(xML8);
        schema9.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema8 = schema6.getNot();
        schema6.setMaxLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema12 = schema6.minItems((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass13 = schema12.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(schema8);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        strSchema13.setName("no description");
        io.swagger.oas.models.media.Schema schema19 = strSchema13.type("");
        io.swagger.oas.models.media.Schema schema21 = schema19.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setName("no description");
        io.swagger.oas.models.media.Schema schema28 = strSchema22.type("");
        io.swagger.oas.models.media.Schema schema30 = strSchema22.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema32 = strSchema22.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray35 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        schema32.setRequired((java.util.List<java.lang.String>) strList36);
        schema21.setRequired((java.util.List<java.lang.String>) strList36);
        io.swagger.oas.models.media.Schema schema40 = strSchema0.required((java.util.List<java.lang.String>) strList36);
        schema40.addEnumItemObject("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Integer int43 = schema40.getMaxProperties();
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(int43);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        io.swagger.oas.annotations.media.Content[] contentArray0 = null;
        javax.ws.rs.Produces produces1 = null;
        javax.ws.rs.Produces produces2 = null;
        io.swagger.oas.models.Components components3 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional4 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces1, produces2, components3);
        org.junit.Assert.assertNotNull(contentOptional4);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema schema7 = schema5.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema9 = schema5.minItems((java.lang.Integer) 0);
        java.lang.String str10 = schema5.toString();
        java.util.List<java.lang.String> strList11 = schema5.getEnum();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str10, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(strList11);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        strSchema6.setName("no description");
        io.swagger.oas.models.media.Schema schema12 = strSchema6.type("");
        java.lang.Integer int13 = schema12.getMaxProperties();
        io.swagger.oas.models.media.Schema schema15 = schema12.name("default");
        io.swagger.oas.models.media.Schema schema16 = strSchema0.addProperties("*/*", schema15);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        strSchema17.setName("no description");
        io.swagger.oas.models.media.Schema schema23 = strSchema17.type("");
        io.swagger.oas.models.media.Schema schema25 = strSchema17.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema27 = strSchema17.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema28 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema28.setType("hi!");
        java.lang.Boolean boolean31 = strSchema28.getWriteOnly();
        io.swagger.oas.models.media.Schema schema33 = strSchema28.type("default");
        io.swagger.oas.models.media.Schema schema34 = strSchema17.not(schema33);
        io.swagger.oas.models.media.Schema schema36 = schema34.minItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema37 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema37.setType("hi!");
        strSchema37.setName("no description");
        io.swagger.oas.models.media.Schema schema43 = strSchema37.type("");
        java.lang.Integer int44 = schema43.getMaxProperties();
        java.math.BigDecimal bigDecimal45 = null;
        schema43.setMinimum(bigDecimal45);
        io.swagger.oas.models.media.Schema schema48 = schema43.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema50 = schema48.maxProperties((java.lang.Integer) (-1));
        schema36.setExample((java.lang.Object) schema48);
        java.math.BigDecimal bigDecimal52 = schema36.getMultipleOf();
        io.swagger.oas.models.media.Schema schema54 = schema36.title("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema55 = strSchema0.additionalProperties(schema36);
        schema36.setExclusiveMinimum((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNull(int44);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNull(bigDecimal52);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema55);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema4 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema4.setType("hi!");
        strSchema4.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int9 = strSchema4.getMinLength();
        java.lang.String str10 = strSchema4.getDescription();
        strSchema0.setExample((java.lang.Object) str10);
        io.swagger.oas.models.media.Schema schema13 = strSchema0.$ref("default");
        java.lang.String str14 = strSchema0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int17 = strSchema12.getMinLength();
        java.lang.Integer int18 = strSchema12.getMaxLength();
        java.math.BigDecimal bigDecimal19 = strSchema12.getMaximum();
        io.swagger.oas.models.media.Schema schema20 = schema11.additionalProperties((io.swagger.oas.models.media.Schema) strSchema12);
        io.swagger.oas.models.media.Schema schema22 = strSchema12.type("default");
        io.swagger.oas.models.media.Schema schema24 = schema22.minItems((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass25 = schema22.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(bigDecimal19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema13.title("no description");
        java.lang.String str21 = schema20.getDescription();
        boolean boolean22 = schema12.equals((java.lang.Object) schema20);
        java.util.List<java.lang.String> strList23 = null;
        io.swagger.oas.models.media.Schema schema24 = schema20.required(strList23);
        schema20.setMaxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema28 = schema20.minLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema30 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema30.setType("hi!");
        strSchema30.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap35 = null;
        io.swagger.oas.models.media.Schema schema36 = strSchema30.properties(strMap35);
        java.lang.Integer int37 = schema36.getMaxProperties();
        io.swagger.oas.models.media.Schema schema39 = schema36.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema41 = schema36.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema42 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema42.setType("hi!");
        strSchema42.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int47 = strSchema42.getMinLength();
        java.lang.Integer int48 = strSchema42.getMaxLength();
        java.math.BigDecimal bigDecimal49 = strSchema42.getMaximum();
        io.swagger.oas.models.media.Schema schema50 = schema41.additionalProperties((io.swagger.oas.models.media.Schema) strSchema42);
        io.swagger.oas.models.media.Schema schema52 = schema50.readOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema53 = schema20.addProperties("default", schema50);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema54 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema54.setType("hi!");
        strSchema54.setName("no description");
        io.swagger.oas.models.media.Schema schema60 = strSchema54.type("");
        java.lang.Integer int61 = schema60.getMaxProperties();
        java.math.BigDecimal bigDecimal62 = null;
        schema60.setMinimum(bigDecimal62);
        io.swagger.oas.models.media.Schema schema65 = schema60.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation66 = null;
        schema60.setExternalDocs(externalDocumentation66);
        io.swagger.oas.models.media.Schema schema69 = schema60.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema70 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema70.setType("hi!");
        java.lang.Boolean boolean73 = strSchema70.getWriteOnly();
        strSchema70.setWriteOnly((java.lang.Boolean) false);
        schema60.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema70);
        java.lang.Integer int77 = schema60.getMaxProperties();
        java.lang.Integer int78 = schema60.getMaxItems();
        schema60.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema82 = schema60.writeOnly((java.lang.Boolean) false);
        schema60.setDeprecated((java.lang.Boolean) true);
        schema50.setAdditionalProperties(schema60);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema86 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean87 = strSchema86.getUniqueItems();
        schema60.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema86);
        io.swagger.oas.models.media.Schema schema90 = strSchema86.writeOnly((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(int47);
        org.junit.Assert.assertNull(int48);
        org.junit.Assert.assertNull(bigDecimal49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNull(int61);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNull(boolean73);
        org.junit.Assert.assertNull(int77);
        org.junit.Assert.assertNull(int78);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNull(boolean87);
        org.junit.Assert.assertNotNull(schema90);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        java.lang.Integer int5 = strSchema0.getMaxProperties();
        strSchema0.setType("default");
        java.math.BigDecimal bigDecimal8 = null;
        io.swagger.oas.models.media.Schema schema9 = strSchema0.minimum(bigDecimal8);
        strSchema0.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema13 = strSchema0.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema13.setMaxLength((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema17 = schema13.uniqueItems((java.lang.Boolean) false);
        java.lang.String str18 = schema17.getFormat();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        java.math.BigDecimal bigDecimal7 = null;
        strSchema0.setMinimum(bigDecimal7);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema12 = schema10.readOnly((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation13 = null;
        io.swagger.oas.models.media.Schema schema14 = schema10.externalDocs(externalDocumentation13);
        io.swagger.oas.models.media.Schema schema16 = schema10.format("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema18 = schema10.addRequiredItem("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str19 = schema10.get$ref();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 10\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean10 = strSchema5.getDeprecated();
        io.swagger.oas.models.media.Schema schema12 = strSchema5.nullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema13 = schema4.example((java.lang.Object) strSchema5);
        java.lang.Integer int14 = strSchema5.getMinItems();
        java.math.BigDecimal bigDecimal15 = null;
        io.swagger.oas.models.media.Schema schema16 = strSchema5.minimum(bigDecimal15);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        java.util.List<java.lang.String> strList8 = strSchema5.getRequired();
        strSchema5.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int11 = strSchema5.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setName("no description");
        io.swagger.oas.models.media.Schema schema18 = strSchema12.type("");
        io.swagger.oas.models.media.Schema schema19 = strSchema5.not((io.swagger.oas.models.media.Schema) strSchema12);
        strSchema0.setExample((java.lang.Object) schema19);
        java.math.BigDecimal bigDecimal21 = null;
        io.swagger.oas.models.media.Schema schema22 = schema19.multipleOf(bigDecimal21);
        java.lang.Integer int23 = schema19.getMinProperties();
        schema19.setExclusiveMinimum((java.lang.Boolean) true);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(int23);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.minProperties((java.lang.Integer) (-1));
        java.lang.String str12 = schema6.getName();
        schema6.set$ref("");
        io.swagger.oas.models.media.Discriminator discriminator15 = schema6.getDiscriminator();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(discriminator15);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal11 = null;
        schema10.setMultipleOf(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        strSchema13.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap18 = null;
        io.swagger.oas.models.media.Schema schema19 = strSchema13.properties(strMap18);
        java.lang.Integer int20 = schema19.getMaxProperties();
        io.swagger.oas.models.media.Schema schema22 = schema19.type("*/*");
        schema10.setAdditionalProperties(schema22);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema24 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema24.setType("hi!");
        io.swagger.oas.models.media.Schema schema28 = strSchema24.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema30 = schema28.example((java.lang.Object) (short) 0);
        schema28.setWriteOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema34 = schema28.maxProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema36 = schema34.maxLength((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal37 = null;
        io.swagger.oas.models.media.Schema schema38 = schema36.multipleOf(bigDecimal37);
        java.util.List<java.lang.String> strList39 = schema36.getRequired();
        schema10.setExample((java.lang.Object) strList39);
        java.lang.Class<?> wildcardClass41 = schema10.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(strList39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        io.swagger.oas.annotations.responses.ApiResponse[] apiResponseArray0 = null;
        javax.ws.rs.Produces produces1 = null;
        javax.ws.rs.Produces produces2 = null;
        io.swagger.oas.models.Components components3 = null;
        java.util.Optional<io.swagger.oas.models.responses.ApiResponses> apiResponsesOptional4 = io.swagger.jaxrs2.OperationParser.getApiResponses(apiResponseArray0, produces1, produces2, components3);
        org.junit.Assert.assertNotNull(apiResponsesOptional4);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        strSchema9.setNot((io.swagger.oas.models.media.Schema) strSchema14);
        java.math.BigDecimal bigDecimal20 = null;
        io.swagger.oas.models.media.Schema schema21 = strSchema9.minimum(bigDecimal20);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setName("no description");
        io.swagger.oas.models.media.Schema schema28 = strSchema22.type("");
        io.swagger.oas.models.media.Schema schema30 = schema28.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema31 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema31.setType("hi!");
        strSchema31.setName("no description");
        io.swagger.oas.models.media.Schema schema37 = strSchema31.type("");
        io.swagger.oas.models.media.Schema schema39 = strSchema31.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema41 = strSchema31.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray44 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        schema41.setRequired((java.util.List<java.lang.String>) strList45);
        schema30.setRequired((java.util.List<java.lang.String>) strList45);
        io.swagger.oas.models.media.Schema schema49 = strSchema9.required((java.util.List<java.lang.String>) strList45);
        strSchema0.setEnum((java.util.List<java.lang.String>) strList45);
        java.math.BigDecimal bigDecimal51 = strSchema0.getMinimum();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema53 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema53.setType("hi!");
        java.lang.Boolean boolean56 = strSchema53.getWriteOnly();
        io.swagger.oas.models.media.Schema schema58 = strSchema53.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema59 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema59.setType("hi!");
        java.lang.Boolean boolean62 = strSchema59.getWriteOnly();
        io.swagger.oas.models.media.Schema schema64 = strSchema59.type("default");
        strSchema53.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema59);
        io.swagger.oas.models.media.Schema schema67 = strSchema53.$ref("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema69 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema69.setType("hi!");
        strSchema69.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema74 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema74.setType("hi!");
        strSchema74.setName("no description");
        strSchema69.setNot((io.swagger.oas.models.media.Schema) strSchema74);
        strSchema69.setMinProperties((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap82 = strSchema69.getExtensions();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap83 = null;
        strSchema69.setProperties(strMap83);
        java.math.BigDecimal bigDecimal85 = null;
        io.swagger.oas.models.media.Schema schema86 = strSchema69.maximum(bigDecimal85);
        io.swagger.oas.models.media.Schema schema87 = strSchema53.addProperties("", (io.swagger.oas.models.media.Schema) strSchema69);
        io.swagger.oas.models.media.XML xML88 = null;
        schema87.setXml(xML88);
        strSchema0.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) schema87);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation91 = null;
        strSchema0.setExternalDocs(externalDocumentation91);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNull(bigDecimal51);
        org.junit.Assert.assertNull(boolean56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNull(boolean62);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNull(strMap82);
        org.junit.Assert.assertNotNull(schema86);
        org.junit.Assert.assertNotNull(schema87);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.description("no description");
        schema11.setPattern("");
        java.lang.Boolean boolean14 = schema11.getNullable();
        java.lang.String str15 = schema11.getTitle();
        java.math.BigDecimal bigDecimal16 = schema11.getMaximum();
        java.math.BigDecimal bigDecimal17 = schema11.getMinimum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(bigDecimal16);
        org.junit.Assert.assertNull(bigDecimal17);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        java.lang.Boolean boolean9 = strSchema6.getWriteOnly();
        io.swagger.oas.models.media.Schema schema11 = strSchema6.type("default");
        strSchema0.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema6);
        strSchema6.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema16 = strSchema6.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Integer int17 = schema16.getMinItems();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(int17);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema13.title("no description");
        java.lang.String str21 = schema20.getDescription();
        boolean boolean22 = schema12.equals((java.lang.Object) schema20);
        schema20.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 10\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.maxItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        io.swagger.oas.models.media.Schema schema11 = strSchema7.maxLength((java.lang.Integer) 1);
        schema11.setPattern("");
        io.swagger.oas.models.media.Schema schema15 = schema11.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray19 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        schema15.setEnum((java.util.List<java.lang.String>) strList20);
        io.swagger.oas.models.media.Schema schema23 = schema6.example((java.lang.Object) schema15);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema24 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema24.setType("hi!");
        java.util.List<java.lang.String> strList27 = strSchema24.getRequired();
        strSchema24.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int30 = strSchema24.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema31 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema31.setType("hi!");
        strSchema31.setName("no description");
        io.swagger.oas.models.media.Schema schema37 = strSchema31.type("");
        io.swagger.oas.models.media.Schema schema38 = strSchema24.not((io.swagger.oas.models.media.Schema) strSchema31);
        java.lang.Boolean boolean39 = strSchema24.getUniqueItems();
        java.lang.Boolean boolean40 = strSchema24.getNullable();
        io.swagger.oas.models.media.Schema schema42 = strSchema24.uniqueItems((java.lang.Boolean) false);
        strSchema24.setMinItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema45 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema45.setType("hi!");
        strSchema45.setName("no description");
        io.swagger.oas.models.media.Schema schema51 = strSchema45.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation52 = schema51.getExternalDocs();
        io.swagger.oas.models.media.Schema schema54 = schema51.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema56 = schema51.type("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema57 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema57.setType("hi!");
        java.lang.Boolean boolean60 = strSchema57.getDeprecated();
        boolean boolean62 = strSchema57.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal63 = null;
        io.swagger.oas.models.media.Schema schema64 = strSchema57.multipleOf(bigDecimal63);
        io.swagger.oas.models.media.Schema schema66 = strSchema57.deprecated((java.lang.Boolean) false);
        boolean boolean67 = schema51.equals((java.lang.Object) schema66);
        java.math.BigDecimal bigDecimal68 = null;
        io.swagger.oas.models.media.Schema schema69 = schema51.maximum(bigDecimal68);
        io.swagger.oas.models.media.Schema schema71 = schema69.nullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema72 = strSchema24.not(schema69);
        schema23.setAdditionalProperties(schema69);
        java.lang.Integer int74 = schema69.getMinItems();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(boolean39);
        org.junit.Assert.assertNull(boolean40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNull(externalDocumentation52);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNull(boolean60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNull(int74);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema10 = schema6.addRequiredItem("no description");
        io.swagger.oas.models.media.Schema schema11 = schema10.getNot();
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.oas.models.media.Schema schema12 = schema11.getAdditionalProperties();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(schema11);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        schema12.setDeprecated((java.lang.Boolean) true);
        java.lang.Boolean boolean15 = schema12.getExclusiveMaximum();
        io.swagger.oas.models.media.Schema schema17 = schema12.name("hi!");
        java.lang.String str18 = schema12.getType();
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int5 = strSchema0.getMinLength();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema8 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema8.setType("hi!");
        java.util.List<java.lang.String> strList11 = strSchema8.getRequired();
        strSchema8.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema15 = strSchema8.title("no description");
        schema15.set$ref("");
        io.swagger.oas.models.media.Schema schema19 = schema15.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema0.addProperties("*/*", schema19);
        java.lang.Boolean boolean21 = strSchema0.getExclusiveMaximum();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(boolean21);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.name("hi!");
        io.swagger.oas.models.media.Schema schema13 = schema6.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema15 = schema13.writeOnly((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        schema6.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema10 = schema6.example((java.lang.Object) '#');
        io.swagger.oas.models.ExternalDocumentation externalDocumentation11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema10.externalDocs(externalDocumentation11);
        java.math.BigDecimal bigDecimal13 = schema10.getMinimum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(bigDecimal13);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.addRequiredItem("*/*");
        io.swagger.oas.models.media.XML xML7 = null;
        schema6.setXml(xML7);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        java.lang.Integer int17 = schema16.getMaxProperties();
        java.math.BigDecimal bigDecimal18 = null;
        schema16.setMinimum(bigDecimal18);
        io.swagger.oas.models.media.Schema schema21 = schema16.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation22 = null;
        schema16.setExternalDocs(externalDocumentation22);
        io.swagger.oas.models.media.Schema schema25 = schema16.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema26 = schema6.addProperties("default", schema25);
        io.swagger.oas.models.media.Schema schema28 = schema6.type("");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema28);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        strSchema7.setName("no description");
        io.swagger.oas.models.media.Schema schema13 = strSchema7.type("");
        io.swagger.oas.models.media.Schema schema14 = strSchema0.not((io.swagger.oas.models.media.Schema) strSchema7);
        strSchema0.setMinLength((java.lang.Integer) 0);
        strSchema0.setNullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema0.uniqueItems((java.lang.Boolean) false);
        java.util.List<java.lang.String> strList21 = schema20.getEnum();
        schema20.setName("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(strList21);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        strSchema6.setName("no description");
        io.swagger.oas.models.media.Schema schema12 = strSchema6.type("");
        java.lang.Integer int13 = schema12.getMaxProperties();
        java.math.BigDecimal bigDecimal14 = null;
        schema12.setMinimum(bigDecimal14);
        io.swagger.oas.models.media.Schema schema17 = schema12.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema18 = schema12.getAdditionalProperties();
        boolean boolean19 = strSchema0.equals((java.lang.Object) schema12);
        java.lang.String str20 = schema12.toString();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 10\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str20, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 10\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        schema4.setPattern("");
        io.swagger.oas.models.media.Schema schema8 = schema4.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema10 = schema4.minItems((java.lang.Integer) 100);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema10.properties(strMap11);
        java.lang.Boolean boolean13 = schema12.getDeprecated();
        java.lang.Integer int14 = schema12.getMinLength();
        java.lang.Object obj15 = schema12.getExample();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int5 = strSchema0.getMinLength();
        java.lang.Integer int6 = strSchema0.getMaxLength();
        java.math.BigDecimal bigDecimal7 = strSchema0.getMaximum();
        io.swagger.oas.models.media.Schema schema9 = strSchema0.name("no description");
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = strSchema0.getExtensions();
        java.lang.String str11 = strSchema0.getFormat();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        schema4.setPattern("hi!");
        java.lang.Boolean boolean7 = schema4.getUniqueItems();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        java.util.List<java.lang.String> strList8 = strSchema5.getRequired();
        strSchema5.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema12 = strSchema5.title("no description");
        java.math.BigDecimal bigDecimal13 = strSchema5.getMaximum();
        io.swagger.oas.models.media.Schema schema14 = strSchema0.not((io.swagger.oas.models.media.Schema) strSchema5);
        java.lang.Integer int15 = schema14.getMaxItems();
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(bigDecimal13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        io.swagger.oas.models.media.Schema schema5 = strSchema0.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema7 = strSchema0.description("*/*");
        io.swagger.oas.models.media.Schema schema9 = schema7.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 10\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str10 = schema7.getFormat();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxProperties((java.lang.Integer) (-1));
        java.math.BigDecimal bigDecimal12 = null;
        io.swagger.oas.models.media.Schema schema13 = schema11.multipleOf(bigDecimal12);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        io.swagger.oas.models.media.Schema schema20 = strSchema14.type("");
        io.swagger.oas.models.media.Schema schema22 = strSchema14.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema24 = strSchema14.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray27 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        schema24.setRequired((java.util.List<java.lang.String>) strList28);
        java.util.List<java.lang.String> strList31 = schema24.getEnum();
        java.lang.Integer int32 = schema24.getMaxLength();
        io.swagger.oas.models.media.Schema schema34 = schema24.pattern("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema35 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema35.setType("hi!");
        strSchema35.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema40 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema40.setType("hi!");
        strSchema40.setName("no description");
        strSchema35.setNot((io.swagger.oas.models.media.Schema) strSchema40);
        java.math.BigDecimal bigDecimal46 = null;
        io.swagger.oas.models.media.Schema schema47 = strSchema35.minimum(bigDecimal46);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema48 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema48.setType("hi!");
        java.util.List<java.lang.String> strList51 = strSchema48.getRequired();
        strSchema48.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema55 = strSchema48.title("no description");
        java.lang.String str56 = schema55.getDescription();
        boolean boolean57 = schema47.equals((java.lang.Object) schema55);
        io.swagger.oas.models.media.Schema schema59 = schema55.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema60 = schema24.example((java.lang.Object) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema61 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema61.setType("hi!");
        strSchema61.setName("no description");
        io.swagger.oas.models.media.Schema schema67 = strSchema61.type("");
        io.swagger.oas.models.media.Schema schema69 = strSchema61.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema71 = strSchema61.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema72 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema72.setType("hi!");
        java.lang.Boolean boolean75 = strSchema72.getWriteOnly();
        io.swagger.oas.models.media.Schema schema77 = strSchema72.type("default");
        io.swagger.oas.models.media.Schema schema78 = strSchema61.not(schema77);
        java.math.BigDecimal bigDecimal79 = null;
        schema77.setMultipleOf(bigDecimal79);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema81 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema81.setType("hi!");
        io.swagger.oas.models.media.Schema schema85 = strSchema81.maxLength((java.lang.Integer) 1);
        schema85.setPattern("");
        io.swagger.oas.models.media.Schema schema89 = schema85.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray93 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList94 = new java.util.ArrayList<java.lang.String>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList94, strArray93);
        schema89.setEnum((java.util.List<java.lang.String>) strList94);
        io.swagger.oas.models.media.Schema schema97 = schema77.required((java.util.List<java.lang.String>) strList94);
        io.swagger.oas.models.media.Schema schema98 = schema60.required((java.util.List<java.lang.String>) strList94);
        io.swagger.oas.models.media.Schema schema99 = schema13.additionalProperties(schema60);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(strList31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNull(strList51);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNull(boolean75);
        org.junit.Assert.assertNotNull(schema77);
        org.junit.Assert.assertNotNull(schema78);
        org.junit.Assert.assertNotNull(schema85);
        org.junit.Assert.assertNotNull(schema89);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(schema97);
        org.junit.Assert.assertNotNull(schema98);
        org.junit.Assert.assertNotNull(schema99);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        java.math.BigDecimal bigDecimal10 = schema6.getMultipleOf();
        io.swagger.oas.models.media.Schema schema12 = schema6.name("");
        schema6.setPattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int17 = strSchema12.getMinLength();
        java.lang.Integer int18 = strSchema12.getMaxLength();
        java.math.BigDecimal bigDecimal19 = strSchema12.getMaximum();
        io.swagger.oas.models.media.Schema schema20 = schema11.additionalProperties((io.swagger.oas.models.media.Schema) strSchema12);
        io.swagger.oas.models.media.Schema schema22 = strSchema12.type("default");
        io.swagger.oas.models.media.Schema schema24 = schema22.minItems((java.lang.Integer) 100);
        java.lang.Boolean boolean25 = schema24.getExclusiveMaximum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(bigDecimal19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(boolean25);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        schema4.setPattern("");
        io.swagger.oas.models.media.Schema schema8 = schema4.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray12 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        schema8.setEnum((java.util.List<java.lang.String>) strList13);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap16 = null;
        schema8.setProperties(strMap16);
        java.lang.Boolean boolean18 = schema8.getExclusiveMinimum();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(boolean18);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.XML xML8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.xml(xML8);
        io.swagger.oas.models.media.Schema schema11 = schema6.minItems((java.lang.Integer) 10);
        schema6.setExclusiveMinimum((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema13.title("no description");
        java.lang.String str21 = schema20.getDescription();
        boolean boolean22 = schema12.equals((java.lang.Object) schema20);
        io.swagger.oas.models.media.Schema schema24 = schema20.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema25 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema25.setType("hi!");
        java.lang.Boolean boolean28 = strSchema25.getWriteOnly();
        strSchema25.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Discriminator discriminator31 = strSchema25.getDiscriminator();
        io.swagger.oas.models.media.Schema schema32 = schema20.additionalProperties((io.swagger.oas.models.media.Schema) strSchema25);
        strSchema25.setTitle("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(discriminator31);
        org.junit.Assert.assertNotNull(schema32);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "#/components/schemas/default";
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        schema6.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema10 = schema6.addRequiredItem("");
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema6.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        java.lang.Boolean boolean19 = strSchema13.getDeprecated();
        java.math.BigDecimal bigDecimal20 = strSchema13.getMultipleOf();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema21 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema21.setType("hi!");
        strSchema21.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap26 = null;
        io.swagger.oas.models.media.Schema schema27 = strSchema21.properties(strMap26);
        java.lang.Integer int28 = schema27.getMaxProperties();
        io.swagger.oas.models.media.Schema schema30 = schema27.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema32 = schema27.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema33 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema33.setType("hi!");
        strSchema33.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int38 = strSchema33.getMinLength();
        java.lang.Integer int39 = strSchema33.getMaxLength();
        java.math.BigDecimal bigDecimal40 = strSchema33.getMaximum();
        io.swagger.oas.models.media.Schema schema41 = schema32.additionalProperties((io.swagger.oas.models.media.Schema) strSchema33);
        java.lang.Integer int42 = strSchema33.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema43 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema43.setType("hi!");
        strSchema43.setName("no description");
        io.swagger.oas.models.media.Schema schema49 = strSchema43.type("");
        io.swagger.oas.models.media.Schema schema51 = strSchema43.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema52 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema52.setType("hi!");
        strSchema52.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema57 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema57.setType("hi!");
        strSchema57.setName("no description");
        strSchema52.setNot((io.swagger.oas.models.media.Schema) strSchema57);
        java.math.BigDecimal bigDecimal63 = null;
        io.swagger.oas.models.media.Schema schema64 = strSchema52.minimum(bigDecimal63);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema65 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema65.setType("hi!");
        strSchema65.setName("no description");
        io.swagger.oas.models.media.Schema schema71 = strSchema65.type("");
        io.swagger.oas.models.media.Schema schema73 = schema71.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema74 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema74.setType("hi!");
        strSchema74.setName("no description");
        io.swagger.oas.models.media.Schema schema80 = strSchema74.type("");
        io.swagger.oas.models.media.Schema schema82 = strSchema74.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema84 = strSchema74.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray87 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        schema84.setRequired((java.util.List<java.lang.String>) strList88);
        schema73.setRequired((java.util.List<java.lang.String>) strList88);
        io.swagger.oas.models.media.Schema schema92 = strSchema52.required((java.util.List<java.lang.String>) strList88);
        strSchema43.setEnum((java.util.List<java.lang.String>) strList88);
        strSchema33.setEnum((java.util.List<java.lang.String>) strList88);
        io.swagger.oas.models.media.Schema schema95 = strSchema13.required((java.util.List<java.lang.String>) strList88);
        java.lang.Integer int96 = schema95.getMaxLength();
        io.swagger.oas.models.media.Schema schema97 = schema6.additionalProperties(schema95);
        java.math.BigDecimal bigDecimal98 = null;
        io.swagger.oas.models.media.Schema schema99 = schema97.multipleOf(bigDecimal98);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNull(bigDecimal20);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNull(bigDecimal40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(int42);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNotNull(schema84);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(schema92);
        org.junit.Assert.assertNotNull(schema95);
        org.junit.Assert.assertNull(int96);
        org.junit.Assert.assertNotNull(schema97);
        org.junit.Assert.assertNotNull(schema99);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        schema6.setType("no description");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation10 = null;
        schema6.setExternalDocs(externalDocumentation10);
        io.swagger.oas.models.media.Schema schema13 = schema6.name("*/*");
        schema13.setDeprecated((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        io.swagger.oas.models.media.Schema<java.lang.Iterable<java.lang.String>> strIterableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Iterable<java.lang.String>>();
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray13 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        schema10.setRequired((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList17 = schema10.getEnum();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema18 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema18.setType("hi!");
        strSchema18.setName("no description");
        io.swagger.oas.models.media.Schema schema24 = strSchema18.type("");
        io.swagger.oas.models.media.Schema schema26 = schema24.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int27 = schema26.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema28 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema28.setType("hi!");
        strSchema28.setName("no description");
        io.swagger.oas.models.media.Schema schema34 = strSchema28.type("");
        io.swagger.oas.models.media.Schema schema36 = schema34.format("no description");
        io.swagger.oas.models.media.Schema schema37 = schema26.not(schema36);
        io.swagger.oas.models.media.Schema schema39 = schema36.format("default");
        io.swagger.oas.models.media.Schema schema41 = schema36.exclusiveMinimum((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal42 = null;
        schema41.setMinimum(bigDecimal42);
        io.swagger.oas.models.media.XML xML44 = null;
        io.swagger.oas.models.media.Schema schema45 = schema41.xml(xML44);
        schema10.setAdditionalProperties(schema45);
        io.swagger.oas.models.media.Schema schema48 = schema10.deprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema50 = schema10.format("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.math.BigDecimal bigDecimal51 = schema50.getMinimum();
        schema50.setMinProperties((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNull(bigDecimal51);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Discriminator discriminator9 = null;
        io.swagger.oas.models.media.Schema schema10 = schema6.discriminator(discriminator9);
        java.lang.String str11 = schema10.getFormat();
        java.math.BigDecimal bigDecimal12 = schema10.getMinimum();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap13 = null;
        io.swagger.oas.models.media.Schema schema14 = schema10.properties(strMap13);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema15.setType("hi!");
        strSchema15.setName("no description");
        io.swagger.oas.models.media.Schema schema21 = strSchema15.type("");
        io.swagger.oas.models.media.Schema schema23 = strSchema15.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema25 = strSchema15.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray28 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        schema25.setRequired((java.util.List<java.lang.String>) strList29);
        java.util.List<java.lang.String> strList32 = schema25.getEnum();
        java.lang.String str33 = schema25.toString();
        io.swagger.oas.models.media.Schema schema35 = schema25.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema37 = schema25.exclusiveMinimum((java.lang.Boolean) false);
        schema14.setDefault((java.lang.Object) schema25);
        io.swagger.oas.models.media.Schema schema40 = schema14.nullable((java.lang.Boolean) false);
        java.lang.String str41 = schema40.getTitle();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap42 = null;
        schema40.setProperties(strMap42);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(strList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str33, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        io.swagger.oas.models.media.Schema<java.util.Collection<java.lang.String>> strCollectionSchema0 = new io.swagger.oas.models.media.Schema<java.util.Collection<java.lang.String>>();
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = strSchema10.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema10.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray23 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        schema20.setRequired((java.util.List<java.lang.String>) strList24);
        java.util.List<java.lang.String> strList27 = schema20.getEnum();
        io.swagger.oas.models.media.Schema schema28 = strSchema0.addProperties("hi!", schema20);
        java.lang.Boolean boolean29 = schema28.getExclusiveMinimum();
        java.lang.String str30 = schema28.get$ref();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        java.lang.Boolean boolean14 = strSchema11.getWriteOnly();
        io.swagger.oas.models.media.Schema schema16 = strSchema11.type("default");
        io.swagger.oas.models.media.Schema schema17 = strSchema0.not(schema16);
        io.swagger.oas.models.media.Schema schema19 = schema17.minItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema20 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema20.setType("hi!");
        strSchema20.setName("no description");
        io.swagger.oas.models.media.Schema schema26 = strSchema20.type("");
        java.lang.Integer int27 = schema26.getMaxProperties();
        java.math.BigDecimal bigDecimal28 = null;
        schema26.setMinimum(bigDecimal28);
        io.swagger.oas.models.media.Schema schema31 = schema26.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema33 = schema31.maxProperties((java.lang.Integer) (-1));
        schema19.setExample((java.lang.Object) schema31);
        io.swagger.oas.models.media.Schema schema36 = schema31.minProperties((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass37 = schema36.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        schema6.setType("no description");
        java.lang.Class<?> wildcardClass10 = schema6.getClass();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        io.swagger.oas.models.media.Discriminator discriminator7 = null;
        io.swagger.oas.models.media.Schema schema8 = strSchema0.discriminator(discriminator7);
        strSchema0.addEnumItemObject("");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        strSchema11.setName("no description");
        io.swagger.oas.models.media.Schema schema17 = strSchema11.type("");
        io.swagger.oas.models.media.Schema schema19 = schema17.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int20 = schema19.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema21 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema21.setType("hi!");
        strSchema21.setName("no description");
        io.swagger.oas.models.media.Schema schema27 = strSchema21.type("");
        io.swagger.oas.models.media.Schema schema29 = schema27.format("no description");
        io.swagger.oas.models.media.Schema schema30 = schema19.not(schema29);
        java.math.BigDecimal bigDecimal31 = null;
        io.swagger.oas.models.media.Schema schema32 = schema29.multipleOf(bigDecimal31);
        java.math.BigDecimal bigDecimal33 = null;
        io.swagger.oas.models.media.Schema schema34 = schema29.minimum(bigDecimal33);
        io.swagger.oas.models.media.Schema schema36 = schema29.description("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema29.setMinLength((java.lang.Integer) 10);
        strSchema0.setNot(schema29);
        strSchema0.setMaxItems((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getDeprecated();
        boolean boolean5 = strSchema0.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal6 = null;
        io.swagger.oas.models.media.Schema schema7 = strSchema0.multipleOf(bigDecimal6);
        io.swagger.oas.models.media.Schema schema9 = strSchema0.deprecated((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal10 = null;
        io.swagger.oas.models.media.Schema schema11 = schema9.multipleOf(bigDecimal10);
        io.swagger.oas.models.media.Discriminator discriminator12 = schema9.getDiscriminator();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        io.swagger.oas.models.media.Schema schema17 = strSchema13.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema19 = schema17.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean20 = schema19.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator21 = null;
        io.swagger.oas.models.media.Schema schema22 = schema19.discriminator(discriminator21);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        strSchema23.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean28 = strSchema23.getDeprecated();
        java.lang.String str29 = strSchema23.getDescription();
        io.swagger.oas.models.media.Schema schema31 = strSchema23.maxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema33 = schema31.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema35 = schema31.$ref("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema36 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema36.setType("hi!");
        strSchema36.setName("no description");
        io.swagger.oas.models.media.Schema schema42 = strSchema36.type("");
        io.swagger.oas.models.media.Schema schema44 = schema42.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema45 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema45.setType("hi!");
        strSchema45.setName("no description");
        io.swagger.oas.models.media.Schema schema51 = strSchema45.type("");
        io.swagger.oas.models.media.Schema schema53 = strSchema45.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema55 = strSchema45.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray58 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        schema55.setRequired((java.util.List<java.lang.String>) strList59);
        schema44.setRequired((java.util.List<java.lang.String>) strList59);
        io.swagger.oas.models.media.Schema schema63 = schema35.required((java.util.List<java.lang.String>) strList59);
        schema22.setRequired((java.util.List<java.lang.String>) strList59);
        io.swagger.oas.models.media.Schema schema65 = schema9.required((java.util.List<java.lang.String>) strList59);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema66 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema66.setType("hi!");
        strSchema66.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean71 = strSchema66.getDeprecated();
        java.lang.String str72 = strSchema66.getDescription();
        java.lang.Boolean boolean73 = strSchema66.getNullable();
        io.swagger.oas.models.media.Schema schema74 = schema9.example((java.lang.Object) boolean73);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(discriminator12);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNull(boolean71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(boolean73);
        org.junit.Assert.assertNotNull(schema74);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        java.lang.Boolean boolean14 = strSchema11.getWriteOnly();
        io.swagger.oas.models.media.Schema schema16 = strSchema11.type("default");
        io.swagger.oas.models.media.Schema schema17 = strSchema0.not(schema16);
        io.swagger.oas.models.media.Schema schema19 = schema17.minItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema21 = schema19.minProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema23 = schema21.title("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema24 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema24.setType("hi!");
        strSchema24.setName("no description");
        io.swagger.oas.models.media.Schema schema30 = strSchema24.type("");
        java.lang.Integer int31 = schema30.getMaxProperties();
        java.math.BigDecimal bigDecimal32 = null;
        schema30.setMinimum(bigDecimal32);
        io.swagger.oas.models.media.Schema schema35 = schema30.maxProperties((java.lang.Integer) 1);
        schema35.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Discriminator discriminator38 = schema35.getDiscriminator();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation39 = null;
        io.swagger.oas.models.media.Schema schema40 = schema35.externalDocs(externalDocumentation39);
        schema21.setNot(schema35);
        io.swagger.oas.models.media.Schema schema43 = schema21.maxProperties((java.lang.Integer) 100);
        java.lang.Boolean boolean44 = schema21.getExclusiveMaximum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNull(discriminator38);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNull(boolean44);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.String str7 = strSchema0.getPattern();
        strSchema0.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema11 = strSchema0.exclusiveMinimum((java.lang.Boolean) true);
        schema11.setReadOnly((java.lang.Boolean) true);
        schema11.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        java.lang.Boolean boolean20 = strSchema17.getWriteOnly();
        strSchema17.setMaxItems((java.lang.Integer) 10);
        strSchema17.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean25 = strSchema17.getExclusiveMaximum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation26 = null;
        io.swagger.oas.models.media.Schema schema27 = strSchema17.externalDocs(externalDocumentation26);
        schema11.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) strSchema17);
        io.swagger.oas.models.media.XML xML29 = null;
        io.swagger.oas.models.media.Schema schema30 = schema11.xml(xML29);
        io.swagger.oas.models.media.Schema schema32 = schema11.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.XML xML33 = null;
        schema32.setXml(xML33);
        schema32.setTitle("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray13 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        schema10.setRequired((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList17 = schema10.getEnum();
        java.lang.String str18 = schema10.toString();
        io.swagger.oas.models.media.Schema schema20 = schema10.deprecated((java.lang.Boolean) true);
        java.lang.Integer int21 = schema20.getMinProperties();
        schema20.setType("");
        io.swagger.oas.models.media.Discriminator discriminator24 = null;
        io.swagger.oas.models.media.Schema schema25 = schema20.discriminator(discriminator24);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str18, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(schema25);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        java.util.List<java.lang.String> strList8 = strSchema5.getRequired();
        strSchema5.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int11 = strSchema5.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setName("no description");
        io.swagger.oas.models.media.Schema schema18 = strSchema12.type("");
        io.swagger.oas.models.media.Schema schema19 = strSchema5.not((io.swagger.oas.models.media.Schema) strSchema12);
        strSchema0.setExample((java.lang.Object) schema19);
        java.math.BigDecimal bigDecimal21 = null;
        io.swagger.oas.models.media.Schema schema22 = schema19.multipleOf(bigDecimal21);
        io.swagger.oas.models.media.Discriminator discriminator23 = null;
        io.swagger.oas.models.media.Schema schema24 = schema22.discriminator(discriminator23);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema25 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema25.setType("hi!");
        strSchema25.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap30 = null;
        io.swagger.oas.models.media.Schema schema31 = strSchema25.properties(strMap30);
        java.lang.Integer int32 = schema31.getMaxProperties();
        schema31.setMinLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation35 = null;
        io.swagger.oas.models.media.Schema schema36 = schema31.externalDocs(externalDocumentation35);
        java.math.BigDecimal bigDecimal37 = null;
        io.swagger.oas.models.media.Schema schema38 = schema31.maximum(bigDecimal37);
        io.swagger.oas.models.media.Schema schema39 = schema22.example((java.lang.Object) bigDecimal37);
        java.lang.String str40 = schema22.getType();
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.addRequiredItem("*/*");
        schema6.setNullable((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema schema15 = strSchema9.type("");
        io.swagger.oas.models.media.Schema schema17 = schema15.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema18 = schema8.not(schema15);
        io.swagger.oas.models.media.Schema schema20 = schema8.minItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema22 = schema8.name("hi!");
        schema22.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema25 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema25.setType("hi!");
        strSchema25.setName("no description");
        io.swagger.oas.models.media.Schema schema31 = strSchema25.type("");
        io.swagger.oas.models.media.Schema schema33 = schema31.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema34 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema34.setType("hi!");
        strSchema34.setName("no description");
        io.swagger.oas.models.media.Schema schema40 = strSchema34.type("");
        io.swagger.oas.models.media.Schema schema42 = schema40.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema43 = schema33.not(schema40);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema44 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str45 = strSchema44.getTitle();
        io.swagger.oas.models.media.Schema schema47 = strSchema44.format("");
        strSchema44.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema50 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema50.setType("hi!");
        strSchema50.setName("no description");
        io.swagger.oas.models.media.Schema schema56 = strSchema50.type("");
        io.swagger.oas.models.media.Schema schema58 = schema56.maxProperties((java.lang.Integer) 100);
        java.lang.String[] strArray60 = new java.lang.String[] { "default" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        schema58.setRequired((java.util.List<java.lang.String>) strList61);
        strSchema44.setRequired((java.util.List<java.lang.String>) strList61);
        io.swagger.oas.models.media.Schema schema65 = schema43.required((java.util.List<java.lang.String>) strList61);
        schema22.setEnum((java.util.List<java.lang.String>) strList61);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema67 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema67.setType("hi!");
        java.util.List<java.lang.String> strList70 = strSchema67.getRequired();
        strSchema67.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int73 = strSchema67.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema74 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema74.setType("hi!");
        strSchema74.setName("no description");
        io.swagger.oas.models.media.Schema schema80 = strSchema74.type("");
        io.swagger.oas.models.media.Schema schema81 = strSchema67.not((io.swagger.oas.models.media.Schema) strSchema74);
        java.lang.Boolean boolean82 = strSchema67.getUniqueItems();
        java.lang.Boolean boolean83 = strSchema67.getNullable();
        io.swagger.oas.models.media.Schema schema85 = strSchema67.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema87 = strSchema67.maxItems((java.lang.Integer) (-1));
        strSchema67.setType("default");
        io.swagger.oas.models.media.Schema schema90 = schema22.not((io.swagger.oas.models.media.Schema) strSchema67);
        schema22.setWriteOnly((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNull(strList70);
        org.junit.Assert.assertNull(int73);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(schema81);
        org.junit.Assert.assertNull(boolean82);
        org.junit.Assert.assertNull(boolean83);
        org.junit.Assert.assertNotNull(schema85);
        org.junit.Assert.assertNotNull(schema87);
        org.junit.Assert.assertNotNull(schema90);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.addRequiredItem("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        java.util.List<java.lang.String> strList10 = strSchema7.getRequired();
        strSchema7.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int13 = strSchema7.getMinLength();
        strSchema7.setUniqueItems((java.lang.Boolean) false);
        strSchema0.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema7);
        io.swagger.oas.models.media.Schema schema18 = strSchema7.minItems((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema20 = schema18.description("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Discriminator discriminator21 = schema18.getDiscriminator();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(discriminator21);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Boolean boolean6 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.addRequiredItem("");
        java.lang.Integer int9 = strSchema0.getMinProperties();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema schema7 = schema5.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema9 = schema5.readOnly((java.lang.Boolean) false);
        schema5.setExclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        java.util.List<java.lang.String> strList15 = strSchema12.getRequired();
        strSchema12.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema19 = strSchema12.title("no description");
        io.swagger.oas.models.media.Schema schema21 = strSchema12.minProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        strSchema23.setName("no description");
        io.swagger.oas.models.media.Schema schema29 = strSchema23.type("");
        io.swagger.oas.models.media.Schema schema31 = strSchema23.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema33 = strSchema23.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray36 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        schema33.setRequired((java.util.List<java.lang.String>) strList37);
        strSchema12.addExtension("", (java.lang.Object) schema33);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema41 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema41.setType("hi!");
        strSchema41.setName("no description");
        io.swagger.oas.models.media.Schema schema47 = strSchema41.type("");
        io.swagger.oas.models.media.Schema schema49 = strSchema41.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema51 = strSchema41.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray54 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        schema51.setRequired((java.util.List<java.lang.String>) strList55);
        schema33.setEnum((java.util.List<java.lang.String>) strList55);
        java.lang.Object obj59 = null;
        io.swagger.oas.models.media.Schema schema60 = schema33.example(obj59);
        schema5.setExample(obj59);
        schema5.setDescription("default");
        io.swagger.oas.models.media.Schema schema65 = schema5.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema67 = schema5.title("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema67.setTitle("default");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNotNull(schema67);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        schema6.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema10 = schema6.addRequiredItem("");
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema6.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        java.lang.Boolean boolean19 = strSchema13.getDeprecated();
        java.math.BigDecimal bigDecimal20 = strSchema13.getMultipleOf();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema21 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema21.setType("hi!");
        strSchema21.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap26 = null;
        io.swagger.oas.models.media.Schema schema27 = strSchema21.properties(strMap26);
        java.lang.Integer int28 = schema27.getMaxProperties();
        io.swagger.oas.models.media.Schema schema30 = schema27.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema32 = schema27.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema33 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema33.setType("hi!");
        strSchema33.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int38 = strSchema33.getMinLength();
        java.lang.Integer int39 = strSchema33.getMaxLength();
        java.math.BigDecimal bigDecimal40 = strSchema33.getMaximum();
        io.swagger.oas.models.media.Schema schema41 = schema32.additionalProperties((io.swagger.oas.models.media.Schema) strSchema33);
        java.lang.Integer int42 = strSchema33.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema43 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema43.setType("hi!");
        strSchema43.setName("no description");
        io.swagger.oas.models.media.Schema schema49 = strSchema43.type("");
        io.swagger.oas.models.media.Schema schema51 = strSchema43.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema52 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema52.setType("hi!");
        strSchema52.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema57 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema57.setType("hi!");
        strSchema57.setName("no description");
        strSchema52.setNot((io.swagger.oas.models.media.Schema) strSchema57);
        java.math.BigDecimal bigDecimal63 = null;
        io.swagger.oas.models.media.Schema schema64 = strSchema52.minimum(bigDecimal63);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema65 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema65.setType("hi!");
        strSchema65.setName("no description");
        io.swagger.oas.models.media.Schema schema71 = strSchema65.type("");
        io.swagger.oas.models.media.Schema schema73 = schema71.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema74 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema74.setType("hi!");
        strSchema74.setName("no description");
        io.swagger.oas.models.media.Schema schema80 = strSchema74.type("");
        io.swagger.oas.models.media.Schema schema82 = strSchema74.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema84 = strSchema74.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray87 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        schema84.setRequired((java.util.List<java.lang.String>) strList88);
        schema73.setRequired((java.util.List<java.lang.String>) strList88);
        io.swagger.oas.models.media.Schema schema92 = strSchema52.required((java.util.List<java.lang.String>) strList88);
        strSchema43.setEnum((java.util.List<java.lang.String>) strList88);
        strSchema33.setEnum((java.util.List<java.lang.String>) strList88);
        io.swagger.oas.models.media.Schema schema95 = strSchema13.required((java.util.List<java.lang.String>) strList88);
        java.lang.Integer int96 = schema95.getMaxLength();
        io.swagger.oas.models.media.Schema schema97 = schema6.additionalProperties(schema95);
        java.lang.String str98 = schema6.getType();
        java.lang.Integer int99 = schema6.getMaxLength();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNull(bigDecimal20);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNull(bigDecimal40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(int42);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNotNull(schema84);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(schema92);
        org.junit.Assert.assertNotNull(schema95);
        org.junit.Assert.assertNull(int96);
        org.junit.Assert.assertNotNull(schema97);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
        org.junit.Assert.assertNull(int99);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getDeprecated();
        boolean boolean5 = strSchema0.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal6 = null;
        io.swagger.oas.models.media.Schema schema7 = strSchema0.multipleOf(bigDecimal6);
        io.swagger.oas.models.media.Schema schema9 = strSchema0.deprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema15.setType("hi!");
        strSchema15.setName("no description");
        strSchema10.setNot((io.swagger.oas.models.media.Schema) strSchema15);
        java.math.BigDecimal bigDecimal21 = null;
        io.swagger.oas.models.media.Schema schema22 = strSchema10.minimum(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = null;
        io.swagger.oas.models.media.Schema schema24 = schema22.multipleOf(bigDecimal23);
        strSchema0.setAdditionalProperties(schema22);
        schema22.setMaxItems((java.lang.Integer) 0);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int9 = schema8.getMinItems();
        schema8.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema8.setTitle("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal12 = schema6.getMinimum();
        io.swagger.oas.models.media.Schema schema14 = schema6.minProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Discriminator discriminator15 = null;
        io.swagger.oas.models.media.Schema schema16 = schema14.discriminator(discriminator15);
        java.lang.Boolean boolean17 = schema16.getWriteOnly();
        io.swagger.oas.models.media.Schema schema19 = schema16.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema20 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema20.setType("hi!");
        java.lang.Boolean boolean23 = strSchema20.getWriteOnly();
        java.lang.Integer int24 = strSchema20.getMinProperties();
        strSchema20.setExclusiveMinimum((java.lang.Boolean) true);
        schema16.setExample((java.lang.Object) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema28 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema28.setType("hi!");
        strSchema28.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema34 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema34.setType("hi!");
        java.lang.Boolean boolean37 = strSchema34.getWriteOnly();
        io.swagger.oas.models.media.Schema schema39 = strSchema34.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema40 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema40.setType("hi!");
        java.lang.Boolean boolean43 = strSchema40.getWriteOnly();
        io.swagger.oas.models.media.Schema schema45 = strSchema40.type("default");
        strSchema34.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema40);
        io.swagger.oas.models.media.Schema schema47 = strSchema28.addProperties("", (io.swagger.oas.models.media.Schema) strSchema34);
        io.swagger.oas.models.media.Schema schema49 = strSchema34.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema50 = schema16.example((java.lang.Object) strSchema34);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema51 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema51.setType("hi!");
        strSchema51.setName("no description");
        io.swagger.oas.models.media.Schema schema57 = strSchema51.type("");
        io.swagger.oas.models.media.Schema schema59 = schema57.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int60 = schema59.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema61 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema61.setType("hi!");
        strSchema61.setName("no description");
        io.swagger.oas.models.media.Schema schema67 = strSchema61.type("");
        io.swagger.oas.models.media.Schema schema69 = schema67.format("no description");
        io.swagger.oas.models.media.Schema schema70 = schema59.not(schema69);
        io.swagger.oas.models.media.Schema schema72 = schema69.format("default");
        io.swagger.oas.models.media.Schema schema74 = schema69.exclusiveMinimum((java.lang.Boolean) false);
        schema69.setFormat("no description");
        io.swagger.oas.models.media.Schema schema77 = strSchema34.example((java.lang.Object) "no description");
        strSchema34.setUniqueItems((java.lang.Boolean) true);
        strSchema34.setMinProperties((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(boolean37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNull(boolean43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNull(int60);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(schema77);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        java.util.List<java.lang.String> strList14 = strSchema11.getRequired();
        strSchema11.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int17 = strSchema11.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema18 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema18.setType("hi!");
        strSchema18.setName("no description");
        io.swagger.oas.models.media.Schema schema24 = strSchema18.type("");
        io.swagger.oas.models.media.Schema schema25 = strSchema11.not((io.swagger.oas.models.media.Schema) strSchema18);
        io.swagger.oas.models.media.XML xML26 = null;
        strSchema18.setXml(xML26);
        io.swagger.oas.models.media.Schema schema28 = schema9.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (io.swagger.oas.models.media.Schema) strSchema18);
        java.lang.Integer int29 = schema28.getMaxProperties();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(int29);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        strSchema6.setName("no description");
        io.swagger.oas.models.media.Schema schema12 = strSchema6.type("");
        java.lang.Integer int13 = schema12.getMaxProperties();
        java.math.BigDecimal bigDecimal14 = null;
        schema12.setMinimum(bigDecimal14);
        io.swagger.oas.models.media.Schema schema17 = schema12.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema18 = schema12.getAdditionalProperties();
        boolean boolean19 = strSchema0.equals((java.lang.Object) schema12);
        io.swagger.oas.models.media.Schema schema21 = schema12.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema22 = schema12.getNot();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation23 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.oas.models.media.Schema schema24 = schema22.externalDocs(externalDocumentation23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(schema22);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        io.swagger.oas.annotations.links.Link[] linkArray0 = null;
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap1 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray0);
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema13 = schema6.nullable((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass14 = schema13.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        java.lang.Boolean boolean9 = strSchema6.getWriteOnly();
        io.swagger.oas.models.media.Schema schema11 = strSchema6.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        java.lang.Boolean boolean15 = strSchema12.getWriteOnly();
        io.swagger.oas.models.media.Schema schema17 = strSchema12.type("default");
        strSchema6.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema12);
        io.swagger.oas.models.media.Schema schema19 = strSchema0.addProperties("", (io.swagger.oas.models.media.Schema) strSchema6);
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        java.lang.String str22 = strSchema0.getFormat();
        strSchema0.setDeprecated((java.lang.Boolean) false);
        strSchema0.setUniqueItems((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        schema6.setMinLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation10 = null;
        io.swagger.oas.models.media.Schema schema11 = schema6.externalDocs(externalDocumentation10);
        io.swagger.oas.models.media.Schema schema13 = schema11.description("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str14 = schema11.get$ref();
        io.swagger.oas.models.media.Schema schema15 = null;
        schema11.setNot(schema15);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal12 = schema6.getMinimum();
        io.swagger.oas.models.media.Schema schema14 = schema6.minProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Discriminator discriminator15 = null;
        io.swagger.oas.models.media.Schema schema16 = schema14.discriminator(discriminator15);
        io.swagger.oas.models.media.Schema schema18 = schema16.format("");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        strSchema9.setNot((io.swagger.oas.models.media.Schema) strSchema14);
        java.math.BigDecimal bigDecimal20 = null;
        io.swagger.oas.models.media.Schema schema21 = strSchema9.minimum(bigDecimal20);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setName("no description");
        io.swagger.oas.models.media.Schema schema28 = strSchema22.type("");
        io.swagger.oas.models.media.Schema schema30 = schema28.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema31 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema31.setType("hi!");
        strSchema31.setName("no description");
        io.swagger.oas.models.media.Schema schema37 = strSchema31.type("");
        io.swagger.oas.models.media.Schema schema39 = strSchema31.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema41 = strSchema31.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray44 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        schema41.setRequired((java.util.List<java.lang.String>) strList45);
        schema30.setRequired((java.util.List<java.lang.String>) strList45);
        io.swagger.oas.models.media.Schema schema49 = strSchema9.required((java.util.List<java.lang.String>) strList45);
        strSchema0.setEnum((java.util.List<java.lang.String>) strList45);
        java.math.BigDecimal bigDecimal51 = strSchema0.getMinimum();
        io.swagger.oas.models.media.Discriminator discriminator52 = null;
        io.swagger.oas.models.media.Schema schema53 = strSchema0.discriminator(discriminator52);
        io.swagger.oas.models.media.Schema schema54 = null;
        strSchema0.setNot(schema54);
        io.swagger.oas.models.media.Schema schema57 = strSchema0.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema59 = strSchema0.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        strSchema0.setMaxItems((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNull(bigDecimal51);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema59);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        strSchema6.setName("no description");
        io.swagger.oas.models.media.Schema schema12 = strSchema6.type("");
        java.lang.Integer int13 = schema12.getMaxProperties();
        java.math.BigDecimal bigDecimal14 = null;
        schema12.setMinimum(bigDecimal14);
        io.swagger.oas.models.media.Schema schema17 = schema12.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema18 = schema12.getAdditionalProperties();
        boolean boolean19 = strSchema0.equals((java.lang.Object) schema12);
        strSchema0.setMinItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema23 = strSchema0.deprecated((java.lang.Boolean) false);
        java.lang.Integer int24 = strSchema0.getMinProperties();
        io.swagger.oas.models.media.Schema schema26 = strSchema0.nullable((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema28 = schema26.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Discriminator discriminator29 = null;
        schema28.setDiscriminator(discriminator29);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema28);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        schema4.setDescription("no description");
        java.math.BigDecimal bigDecimal7 = null;
        schema4.setMultipleOf(bigDecimal7);
        io.swagger.oas.models.media.Schema schema10 = schema4.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.XML xML11 = null;
        schema10.setXml(xML11);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema10 = schema8.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema12 = schema8.$ref("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        strSchema13.setName("no description");
        io.swagger.oas.models.media.Schema schema19 = strSchema13.type("");
        io.swagger.oas.models.media.Schema schema21 = schema19.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setName("no description");
        io.swagger.oas.models.media.Schema schema28 = strSchema22.type("");
        io.swagger.oas.models.media.Schema schema30 = strSchema22.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema32 = strSchema22.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray35 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        schema32.setRequired((java.util.List<java.lang.String>) strList36);
        schema21.setRequired((java.util.List<java.lang.String>) strList36);
        io.swagger.oas.models.media.Schema schema40 = schema12.required((java.util.List<java.lang.String>) strList36);
        java.lang.Boolean boolean41 = schema12.getExclusiveMaximum();
        java.lang.Boolean boolean42 = schema12.getWriteOnly();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertEquals("'" + boolean41 + "' != '" + true + "'", boolean41, true);
        org.junit.Assert.assertNull(boolean42);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxLength((java.lang.Integer) 0);
        schema8.setReadOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema12 = schema8.description("");
        io.swagger.oas.models.media.Schema schema14 = schema8.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema15.setType("hi!");
        java.lang.Boolean boolean18 = strSchema15.getDeprecated();
        boolean boolean20 = strSchema15.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal21 = null;
        io.swagger.oas.models.media.Schema schema22 = strSchema15.multipleOf(bigDecimal21);
        io.swagger.oas.models.media.Schema schema24 = strSchema15.deprecated((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal25 = null;
        io.swagger.oas.models.media.Schema schema26 = schema24.multipleOf(bigDecimal25);
        boolean boolean27 = schema14.equals((java.lang.Object) schema26);
        java.lang.String str28 = schema26.getDescription();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema13 = schema6.exclusiveMaximum((java.lang.Boolean) true);
        java.lang.String str14 = schema13.get$ref();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        strSchema9.setNot((io.swagger.oas.models.media.Schema) strSchema14);
        java.math.BigDecimal bigDecimal20 = null;
        io.swagger.oas.models.media.Schema schema21 = strSchema9.minimum(bigDecimal20);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setName("no description");
        io.swagger.oas.models.media.Schema schema28 = strSchema22.type("");
        io.swagger.oas.models.media.Schema schema30 = schema28.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema31 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema31.setType("hi!");
        strSchema31.setName("no description");
        io.swagger.oas.models.media.Schema schema37 = strSchema31.type("");
        io.swagger.oas.models.media.Schema schema39 = strSchema31.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema41 = strSchema31.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray44 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        schema41.setRequired((java.util.List<java.lang.String>) strList45);
        schema30.setRequired((java.util.List<java.lang.String>) strList45);
        io.swagger.oas.models.media.Schema schema49 = strSchema9.required((java.util.List<java.lang.String>) strList45);
        strSchema0.setEnum((java.util.List<java.lang.String>) strList45);
        java.lang.String str51 = strSchema0.getType();
        io.swagger.oas.models.media.Schema schema53 = strSchema0.minProperties((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass54 = strSchema0.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        schema4.setPattern("");
        java.lang.String str7 = schema4.getPattern();
        java.lang.String str8 = schema4.get$ref();
        java.lang.String str9 = schema4.toString();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str9, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema13.title("no description");
        java.lang.String str21 = schema20.getDescription();
        boolean boolean22 = schema12.equals((java.lang.Object) schema20);
        java.util.List<java.lang.String> strList23 = null;
        io.swagger.oas.models.media.Schema schema24 = schema20.required(strList23);
        schema20.setMaxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema28 = schema20.minLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal29 = null;
        schema20.setMaximum(bigDecimal29);
        java.math.BigDecimal bigDecimal31 = schema20.getMinimum();
        io.swagger.oas.models.media.Schema schema33 = schema20.maxItems((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema35 = schema20.pattern("#/components/schemas/default");
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(bigDecimal31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap6 = strSchema0.getProperties();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        strSchema0.setMaxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema11 = strSchema0.getNot();
        // The following exception was thrown during execution in test generation
        try {
            io.swagger.oas.models.media.Schema schema13 = schema11.maxLength((java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(schema11);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema7 = strSchema0.title("no description");
        io.swagger.oas.models.media.Schema schema9 = strSchema0.minProperties((java.lang.Integer) 1);
        schema9.setMinProperties((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal12 = null;
        io.swagger.oas.models.media.Schema schema13 = schema9.minimum(bigDecimal12);
        io.swagger.oas.models.media.Discriminator discriminator14 = null;
        schema13.setDiscriminator(discriminator14);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        java.util.List<java.lang.String> strList8 = strSchema5.getRequired();
        strSchema5.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int11 = strSchema5.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setName("no description");
        io.swagger.oas.models.media.Schema schema18 = strSchema12.type("");
        io.swagger.oas.models.media.Schema schema19 = strSchema5.not((io.swagger.oas.models.media.Schema) strSchema12);
        strSchema0.setExample((java.lang.Object) schema19);
        java.math.BigDecimal bigDecimal21 = null;
        schema19.setMultipleOf(bigDecimal21);
        schema19.setMaxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.XML xML25 = schema19.getXml();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema26 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema26.setType("hi!");
        strSchema26.setWriteOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema32 = strSchema26.maxItems((java.lang.Integer) 0);
        schema19.setDefault((java.lang.Object) 0);
        java.lang.Boolean boolean34 = schema19.getUniqueItems();
        java.lang.Boolean boolean35 = schema19.getDeprecated();
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(xML25);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(boolean34);
        org.junit.Assert.assertNull(boolean35);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        strSchema7.setName("no description");
        io.swagger.oas.models.media.Schema schema13 = strSchema7.type("");
        io.swagger.oas.models.media.Schema schema14 = strSchema0.not((io.swagger.oas.models.media.Schema) strSchema7);
        java.math.BigDecimal bigDecimal15 = null;
        io.swagger.oas.models.media.Schema schema16 = strSchema0.multipleOf(bigDecimal15);
        io.swagger.oas.models.media.Schema schema18 = schema16.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema20 = schema16.description("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.math.BigDecimal bigDecimal21 = null;
        io.swagger.oas.models.media.Schema schema22 = schema20.maximum(bigDecimal21);
        io.swagger.oas.models.media.Schema schema24 = schema22.readOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema26 = schema24.minLength((java.lang.Integer) 0);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema26);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        java.util.List<java.lang.String> strList14 = strSchema11.getRequired();
        strSchema11.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int17 = strSchema11.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema18 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema18.setType("hi!");
        strSchema18.setName("no description");
        io.swagger.oas.models.media.Schema schema24 = strSchema18.type("");
        io.swagger.oas.models.media.Schema schema25 = strSchema11.not((io.swagger.oas.models.media.Schema) strSchema18);
        io.swagger.oas.models.media.XML xML26 = null;
        strSchema18.setXml(xML26);
        io.swagger.oas.models.media.Schema schema28 = schema9.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (io.swagger.oas.models.media.Schema) strSchema18);
        java.lang.String str29 = strSchema18.getName();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "no description" + "'", str29, "no description");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema schema15 = strSchema9.type("");
        io.swagger.oas.models.media.Schema schema17 = schema15.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema18 = schema8.not(schema15);
        io.swagger.oas.models.media.Schema schema20 = schema8.minItems((java.lang.Integer) 0);
        java.lang.String str21 = schema20.getName();
        io.swagger.oas.models.media.Schema schema23 = schema20.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema24 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema24.setType("hi!");
        strSchema24.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema29 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema29.setType("hi!");
        java.util.List<java.lang.String> strList32 = strSchema29.getRequired();
        strSchema29.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int35 = strSchema29.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema36 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema36.setType("hi!");
        strSchema36.setName("no description");
        io.swagger.oas.models.media.Schema schema42 = strSchema36.type("");
        io.swagger.oas.models.media.Schema schema43 = strSchema29.not((io.swagger.oas.models.media.Schema) strSchema36);
        strSchema24.setExample((java.lang.Object) schema43);
        strSchema24.setPattern("*/*");
        io.swagger.oas.models.media.Schema schema48 = strSchema24.maxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema50 = schema48.minLength((java.lang.Integer) (-1));
        boolean boolean51 = schema20.equals((java.lang.Object) schema50);
        schema50.setMinProperties((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "no description" + "'", str21, "no description");
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(strList32);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        strSchema6.setName("no description");
        io.swagger.oas.models.media.Schema schema12 = strSchema6.type("");
        java.lang.Integer int13 = schema12.getMaxProperties();
        java.math.BigDecimal bigDecimal14 = null;
        schema12.setMinimum(bigDecimal14);
        io.swagger.oas.models.media.Schema schema17 = schema12.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema18 = schema12.getAdditionalProperties();
        boolean boolean19 = strSchema0.equals((java.lang.Object) schema12);
        strSchema0.setMaxItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap27 = null;
        io.swagger.oas.models.media.Schema schema28 = strSchema22.properties(strMap27);
        java.lang.Integer int29 = schema28.getMaxProperties();
        io.swagger.oas.models.media.Schema schema31 = schema28.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema33 = schema28.description("no description");
        schema33.setPattern("");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema36 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema36.setType("hi!");
        strSchema36.setName("no description");
        io.swagger.oas.models.media.Schema schema42 = strSchema36.type("");
        io.swagger.oas.models.media.Schema schema44 = schema42.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Discriminator discriminator45 = null;
        io.swagger.oas.models.media.Schema schema46 = schema42.discriminator(discriminator45);
        java.lang.Boolean boolean47 = schema42.getWriteOnly();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema48 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema48.setType("hi!");
        strSchema48.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema54 = strSchema48.addRequiredItem("");
        io.swagger.oas.models.media.Schema schema56 = schema54.exclusiveMaximum((java.lang.Boolean) true);
        schema56.setMaxItems((java.lang.Integer) 0);
        java.lang.String str59 = schema56.toString();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema60 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema60.setType("hi!");
        java.util.List<java.lang.String> strList63 = strSchema60.getRequired();
        strSchema60.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema67 = strSchema60.title("no description");
        java.lang.String str68 = schema67.getDescription();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation69 = null;
        io.swagger.oas.models.media.Schema schema70 = schema67.externalDocs(externalDocumentation69);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema71 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str72 = strSchema71.getTitle();
        io.swagger.oas.models.media.Schema schema74 = strSchema71.format("");
        strSchema71.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema77 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema77.setType("hi!");
        io.swagger.oas.models.media.Schema schema81 = strSchema77.maxLength((java.lang.Integer) 1);
        schema81.setPattern("");
        io.swagger.oas.models.media.Schema schema85 = schema81.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray89 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        schema85.setEnum((java.util.List<java.lang.String>) strList90);
        strSchema71.setEnum((java.util.List<java.lang.String>) strList90);
        schema70.setRequired((java.util.List<java.lang.String>) strList90);
        schema56.setEnum((java.util.List<java.lang.String>) strList90);
        schema42.setRequired((java.util.List<java.lang.String>) strList90);
        io.swagger.oas.models.media.Schema schema97 = schema33.required((java.util.List<java.lang.String>) strList90);
        strSchema0.setEnum((java.util.List<java.lang.String>) strList90);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNull(boolean47);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str59, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(strList63);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(schema81);
        org.junit.Assert.assertNotNull(schema85);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(schema97);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.name("hi!");
        java.lang.Boolean boolean12 = schema6.getExclusiveMinimum();
        schema6.setMaxProperties((java.lang.Integer) (-1));
        schema6.setMaxLength((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        java.lang.Integer int4 = strSchema0.getMinProperties();
        strSchema0.setExclusiveMinimum((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        java.lang.Boolean boolean9 = strSchema6.getWriteOnly();
        io.swagger.oas.models.media.Schema schema11 = strSchema6.type("default");
        strSchema0.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema6);
        strSchema6.setExclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema15.setType("hi!");
        strSchema15.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap20 = null;
        io.swagger.oas.models.media.Schema schema21 = strSchema15.properties(strMap20);
        java.lang.Integer int22 = schema21.getMaxProperties();
        io.swagger.oas.models.media.Schema schema24 = schema21.minProperties((java.lang.Integer) 0);
        java.lang.String str25 = schema21.getType();
        strSchema6.setDefault((java.lang.Object) schema21);
        io.swagger.oas.models.media.Schema schema28 = strSchema6.maxProperties((java.lang.Integer) 1);
        java.lang.Boolean boolean29 = strSchema6.getUniqueItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema30 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema30.setType("hi!");
        io.swagger.oas.models.media.Schema schema34 = strSchema30.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema36 = schema34.example((java.lang.Object) (short) 0);
        io.swagger.oas.models.media.Schema schema38 = schema34.$ref("default");
        strSchema6.setExample((java.lang.Object) schema34);
        schema34.setUniqueItems((java.lang.Boolean) true);
        schema34.setNullable((java.lang.Boolean) true);
        schema34.setPattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.XML xML46 = schema34.getXml();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(xML46);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray13 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        schema10.setRequired((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList17 = schema10.getEnum();
        java.lang.String str18 = schema10.toString();
        io.swagger.oas.models.media.Schema schema20 = schema10.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema22 = schema20.minProperties((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal23 = schema20.getMaximum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str18, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(bigDecimal23);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getDeprecated();
        boolean boolean5 = strSchema0.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal6 = null;
        io.swagger.oas.models.media.Schema schema7 = strSchema0.multipleOf(bigDecimal6);
        java.lang.Integer int8 = strSchema0.getMinProperties();
        java.lang.String str9 = strSchema0.getFormat();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Discriminator discriminator9 = null;
        io.swagger.oas.models.media.Schema schema10 = schema6.discriminator(discriminator9);
        java.lang.String str11 = schema10.getFormat();
        java.math.BigDecimal bigDecimal12 = schema10.getMinimum();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap13 = null;
        io.swagger.oas.models.media.Schema schema14 = schema10.properties(strMap13);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema15.setType("hi!");
        strSchema15.setName("no description");
        io.swagger.oas.models.media.Schema schema21 = strSchema15.type("");
        io.swagger.oas.models.media.Schema schema23 = strSchema15.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema25 = strSchema15.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray28 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        schema25.setRequired((java.util.List<java.lang.String>) strList29);
        java.util.List<java.lang.String> strList32 = schema25.getEnum();
        java.lang.String str33 = schema25.toString();
        io.swagger.oas.models.media.Schema schema35 = schema25.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema37 = schema25.exclusiveMinimum((java.lang.Boolean) false);
        schema14.setDefault((java.lang.Object) schema25);
        java.lang.Class<?> wildcardClass39 = schema25.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(strList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str33, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.description("no description");
        java.lang.Integer int12 = schema11.getMaxProperties();
        java.lang.String str13 = schema11.toString();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: no description\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str13, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: no description\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation12 = null;
        schema6.setExternalDocs(externalDocumentation12);
        io.swagger.oas.models.media.Schema schema15 = schema6.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema16 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema16.setType("hi!");
        java.lang.Boolean boolean19 = strSchema16.getWriteOnly();
        strSchema16.setWriteOnly((java.lang.Boolean) false);
        schema6.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema16);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        strSchema23.setName("no description");
        io.swagger.oas.models.media.Schema schema29 = strSchema23.type("");
        java.lang.Integer int30 = schema29.getMaxProperties();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap31 = null;
        io.swagger.oas.models.media.Schema schema32 = schema29.properties(strMap31);
        schema29.setPattern("hi!");
        io.swagger.oas.models.media.Schema schema36 = schema29.title("default");
        io.swagger.oas.models.media.Schema schema38 = schema36.deprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema39 = schema6.additionalProperties(schema38);
        schema39.setReadOnly((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        java.math.BigDecimal bigDecimal7 = null;
        strSchema0.setMinimum(bigDecimal7);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 1);
        schema10.setExclusiveMaximum((java.lang.Boolean) false);
        java.lang.String str13 = schema10.toString();
        schema10.setType("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean16 = schema10.getExclusiveMaximum();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str13, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + false + "'", boolean16, false);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.properties(strMap8);
        schema6.setPattern("hi!");
        io.swagger.oas.models.media.Schema schema13 = schema6.title("default");
        io.swagger.oas.models.media.Discriminator discriminator14 = null;
        io.swagger.oas.models.media.Schema schema15 = schema13.discriminator(discriminator14);
        java.lang.Integer int16 = schema13.getMaxProperties();
        schema13.setMinProperties((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(int16);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.lang.Integer int11 = strSchema0.getMaxProperties();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setName("no description");
        io.swagger.oas.models.media.Schema schema18 = strSchema12.type("");
        java.lang.Integer int19 = schema18.getMaxProperties();
        java.math.BigDecimal bigDecimal20 = null;
        schema18.setMinimum(bigDecimal20);
        io.swagger.oas.models.media.Schema schema23 = schema18.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation24 = null;
        schema18.setExternalDocs(externalDocumentation24);
        io.swagger.oas.models.media.Schema schema27 = schema18.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema29 = schema27.uniqueItems((java.lang.Boolean) true);
        boolean boolean30 = strSchema0.equals((java.lang.Object) schema29);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = schema29.getExtensions();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation32 = schema29.getExternalDocs();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNull(externalDocumentation32);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        strSchema9.setNot((io.swagger.oas.models.media.Schema) strSchema14);
        java.math.BigDecimal bigDecimal20 = null;
        io.swagger.oas.models.media.Schema schema21 = strSchema9.minimum(bigDecimal20);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setName("no description");
        io.swagger.oas.models.media.Schema schema28 = strSchema22.type("");
        io.swagger.oas.models.media.Schema schema30 = schema28.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema31 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema31.setType("hi!");
        strSchema31.setName("no description");
        io.swagger.oas.models.media.Schema schema37 = strSchema31.type("");
        io.swagger.oas.models.media.Schema schema39 = strSchema31.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema41 = strSchema31.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray44 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        schema41.setRequired((java.util.List<java.lang.String>) strList45);
        schema30.setRequired((java.util.List<java.lang.String>) strList45);
        io.swagger.oas.models.media.Schema schema49 = strSchema9.required((java.util.List<java.lang.String>) strList45);
        strSchema0.setEnum((java.util.List<java.lang.String>) strList45);
        java.lang.String str51 = strSchema0.getType();
        io.swagger.oas.models.media.Discriminator discriminator52 = strSchema0.getDiscriminator();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema53 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema53.setType("hi!");
        java.lang.Boolean boolean56 = strSchema53.getWriteOnly();
        io.swagger.oas.models.media.Schema schema58 = strSchema53.type("default");
        io.swagger.oas.models.media.Schema schema60 = strSchema53.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema62 = schema60.title("default");
        strSchema0.setAdditionalProperties(schema62);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(discriminator52);
        org.junit.Assert.assertNull(boolean56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema62);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        schema4.setWriteOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = schema4.maxProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema12 = schema10.maxLength((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal13 = null;
        io.swagger.oas.models.media.Schema schema14 = schema12.multipleOf(bigDecimal13);
        java.util.List<java.lang.String> strList15 = schema12.getRequired();
        io.swagger.oas.models.media.XML xML16 = schema12.getXml();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        strSchema17.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap22 = null;
        io.swagger.oas.models.media.Schema schema23 = strSchema17.properties(strMap22);
        java.lang.Integer int24 = schema23.getMaxProperties();
        io.swagger.oas.models.media.Schema schema26 = schema23.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema28 = schema23.maxProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema30 = schema23.addRequiredItem("hi!");
        io.swagger.oas.models.media.Schema schema32 = schema30.name("no description");
        java.util.List<java.lang.String> strList33 = schema30.getEnum();
        io.swagger.oas.models.media.Schema schema34 = schema12.example((java.lang.Object) strList33);
        io.swagger.oas.models.media.Schema schema36 = schema12.maxLength((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema37 = schema36.getNot();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNull(xML16);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(strList33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNull(schema37);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        java.lang.Boolean boolean9 = strSchema6.getWriteOnly();
        io.swagger.oas.models.media.Schema schema11 = strSchema6.type("default");
        strSchema0.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema6);
        io.swagger.oas.models.media.Schema schema14 = strSchema0.$ref("*/*");
        java.lang.Integer int15 = schema14.getMinProperties();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.name("default");
        java.lang.String str10 = schema9.getType();
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema9.maximum(bigDecimal11);
        java.lang.Class<?> wildcardClass13 = schema12.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int9 = schema8.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = schema16.format("no description");
        io.swagger.oas.models.media.Schema schema19 = schema8.not(schema18);
        java.math.BigDecimal bigDecimal20 = null;
        io.swagger.oas.models.media.Schema schema21 = schema18.multipleOf(bigDecimal20);
        java.lang.String str22 = schema21.getTitle();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation23 = schema21.getExternalDocs();
        java.math.BigDecimal bigDecimal24 = schema21.getMinimum();
        java.lang.String str25 = schema21.getFormat();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(externalDocumentation23);
        org.junit.Assert.assertNull(bigDecimal24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "no description" + "'", str25, "no description");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema7 = strSchema0.$ref("");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema8 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema8.setType("hi!");
        strSchema8.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap13 = null;
        io.swagger.oas.models.media.Schema schema14 = strSchema8.properties(strMap13);
        java.lang.Integer int15 = schema14.getMaxProperties();
        io.swagger.oas.models.media.Schema schema17 = schema14.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema18 = schema7.not(schema17);
        java.lang.Class<?> wildcardClass19 = schema18.getClass();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.lang.String[] strArray0 = null;
        java.util.Optional<java.util.Set<io.swagger.oas.models.tags.Tag>> tagSetOptional1 = io.swagger.jaxrs2.OperationParser.getTags(strArray0);
        org.junit.Assert.assertNotNull(tagSetOptional1);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema7 = strSchema0.title("no description");
        io.swagger.oas.models.media.Schema schema9 = strSchema0.minProperties((java.lang.Integer) 1);
        schema9.setWriteOnly((java.lang.Boolean) false);
        schema9.setDeprecated((java.lang.Boolean) true);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        schema4.setPattern("");
        java.lang.String str7 = schema4.getPattern();
        io.swagger.oas.models.media.Schema schema9 = schema4.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        java.util.List<java.lang.String> strList8 = strSchema5.getRequired();
        strSchema5.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int11 = strSchema5.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setName("no description");
        io.swagger.oas.models.media.Schema schema18 = strSchema12.type("");
        io.swagger.oas.models.media.Schema schema19 = strSchema5.not((io.swagger.oas.models.media.Schema) strSchema12);
        strSchema0.setExample((java.lang.Object) schema19);
        java.lang.Boolean boolean21 = schema19.getUniqueItems();
        io.swagger.oas.models.media.Schema schema23 = schema19.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema24 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str25 = strSchema24.getTitle();
        io.swagger.oas.models.media.Schema schema27 = strSchema24.format("");
        strSchema24.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema31 = strSchema24.readOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema32 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema32.setType("hi!");
        java.lang.Boolean boolean35 = strSchema32.getDeprecated();
        boolean boolean37 = strSchema32.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal38 = null;
        io.swagger.oas.models.media.Schema schema39 = strSchema32.multipleOf(bigDecimal38);
        io.swagger.oas.models.media.Schema schema41 = strSchema32.deprecated((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal42 = null;
        io.swagger.oas.models.media.Schema schema43 = schema41.multipleOf(bigDecimal42);
        io.swagger.oas.models.media.Discriminator discriminator44 = schema41.getDiscriminator();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema45 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema45.setType("hi!");
        io.swagger.oas.models.media.Schema schema49 = strSchema45.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema51 = schema49.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean52 = schema51.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator53 = null;
        io.swagger.oas.models.media.Schema schema54 = schema51.discriminator(discriminator53);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema55 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema55.setType("hi!");
        strSchema55.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean60 = strSchema55.getDeprecated();
        java.lang.String str61 = strSchema55.getDescription();
        io.swagger.oas.models.media.Schema schema63 = strSchema55.maxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema65 = schema63.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema67 = schema63.$ref("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema68 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema68.setType("hi!");
        strSchema68.setName("no description");
        io.swagger.oas.models.media.Schema schema74 = strSchema68.type("");
        io.swagger.oas.models.media.Schema schema76 = schema74.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema77 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema77.setType("hi!");
        strSchema77.setName("no description");
        io.swagger.oas.models.media.Schema schema83 = strSchema77.type("");
        io.swagger.oas.models.media.Schema schema85 = strSchema77.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema87 = strSchema77.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray90 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList91 = new java.util.ArrayList<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList91, strArray90);
        schema87.setRequired((java.util.List<java.lang.String>) strList91);
        schema76.setRequired((java.util.List<java.lang.String>) strList91);
        io.swagger.oas.models.media.Schema schema95 = schema67.required((java.util.List<java.lang.String>) strList91);
        schema54.setRequired((java.util.List<java.lang.String>) strList91);
        io.swagger.oas.models.media.Schema schema97 = schema41.required((java.util.List<java.lang.String>) strList91);
        strSchema24.setEnum((java.util.List<java.lang.String>) strList91);
        schema23.setEnum((java.util.List<java.lang.String>) strList91);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNull(discriminator44);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNull(boolean52);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNull(boolean60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema83);
        org.junit.Assert.assertNotNull(schema85);
        org.junit.Assert.assertNotNull(schema87);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(schema95);
        org.junit.Assert.assertNotNull(schema97);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        strSchema0.setMinProperties((java.lang.Integer) 100);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "no description", "default" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        strSchema0.setRequired((java.util.List<java.lang.String>) strList13);
        java.lang.Boolean boolean16 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation17 = null;
        io.swagger.oas.models.media.Schema schema18 = strSchema0.externalDocs(externalDocumentation17);
        java.lang.String str19 = strSchema0.getPattern();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        java.lang.String str10 = schema6.getType();
        schema6.setReadOnly((java.lang.Boolean) true);
        schema6.set$ref("");
        java.lang.String str15 = schema6.getName();
        java.math.BigDecimal bigDecimal16 = schema6.getMinimum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(bigDecimal16);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema13.title("no description");
        java.lang.String str21 = schema20.getDescription();
        boolean boolean22 = schema12.equals((java.lang.Object) schema20);
        java.util.List<java.lang.String> strList23 = null;
        io.swagger.oas.models.media.Schema schema24 = schema20.required(strList23);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema25 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema25.setType("hi!");
        strSchema25.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema30 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema30.setType("hi!");
        strSchema30.setName("no description");
        strSchema25.setNot((io.swagger.oas.models.media.Schema) strSchema30);
        java.lang.String str36 = strSchema25.getDescription();
        schema24.setExample((java.lang.Object) str36);
        java.lang.Integer int38 = schema24.getMaxLength();
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(int38);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        schema3.addEnumItemObject("");
        io.swagger.oas.models.media.Schema schema6 = schema3.getNot();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        strSchema7.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap12 = null;
        io.swagger.oas.models.media.Schema schema13 = strSchema7.properties(strMap12);
        java.lang.String str14 = strSchema7.getPattern();
        java.lang.String str15 = strSchema7.getPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        strSchema7.setExtensions(strMap16);
        // The following exception was thrown during execution in test generation
        try {
            schema6.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(schema6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int9 = schema8.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = schema16.format("no description");
        io.swagger.oas.models.media.Schema schema19 = schema8.not(schema18);
        io.swagger.oas.models.media.Schema schema21 = schema18.format("default");
        io.swagger.oas.models.media.Schema schema23 = schema18.exclusiveMinimum((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass24 = schema23.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.addRequiredItem("*/*");
        io.swagger.oas.models.media.Schema schema8 = schema6.minItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema10 = schema8.format("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema10.setType("hi!");
        java.lang.Class<?> wildcardClass13 = schema10.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation7 = schema6.getExternalDocs();
        io.swagger.oas.models.media.Schema schema9 = schema6.maxProperties((java.lang.Integer) 1);
        java.lang.String str10 = schema6.get$ref();
        java.lang.String str11 = schema6.get$ref();
        io.swagger.oas.models.media.Schema schema13 = schema6.minProperties((java.lang.Integer) 100);
        schema13.setTitle("hi!");
        io.swagger.oas.models.media.Schema schema17 = schema13.minProperties((java.lang.Integer) (-1));
        java.math.BigDecimal bigDecimal18 = null;
        io.swagger.oas.models.media.Schema schema19 = schema13.maximum(bigDecimal18);
        java.lang.Class<?> wildcardClass20 = schema19.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(externalDocumentation7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getDeprecated();
        boolean boolean5 = strSchema0.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal6 = null;
        io.swagger.oas.models.media.Schema schema7 = strSchema0.multipleOf(bigDecimal6);
        io.swagger.oas.models.media.Schema schema9 = strSchema0.deprecated((java.lang.Boolean) false);
        schema9.setMaxItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema13 = schema9.writeOnly((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass14 = schema13.getClass();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        io.swagger.oas.models.media.Schema schema11 = strSchema5.type("");
        io.swagger.oas.models.media.Schema schema13 = strSchema5.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema19.setType("hi!");
        strSchema19.setName("no description");
        strSchema14.setNot((io.swagger.oas.models.media.Schema) strSchema19);
        java.math.BigDecimal bigDecimal25 = null;
        io.swagger.oas.models.media.Schema schema26 = strSchema14.minimum(bigDecimal25);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema27 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema27.setType("hi!");
        strSchema27.setName("no description");
        io.swagger.oas.models.media.Schema schema33 = strSchema27.type("");
        io.swagger.oas.models.media.Schema schema35 = schema33.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema36 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema36.setType("hi!");
        strSchema36.setName("no description");
        io.swagger.oas.models.media.Schema schema42 = strSchema36.type("");
        io.swagger.oas.models.media.Schema schema44 = strSchema36.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema46 = strSchema36.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray49 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        schema46.setRequired((java.util.List<java.lang.String>) strList50);
        schema35.setRequired((java.util.List<java.lang.String>) strList50);
        io.swagger.oas.models.media.Schema schema54 = strSchema14.required((java.util.List<java.lang.String>) strList50);
        strSchema5.setEnum((java.util.List<java.lang.String>) strList50);
        java.math.BigDecimal bigDecimal56 = strSchema5.getMinimum();
        io.swagger.oas.models.media.Discriminator discriminator57 = null;
        io.swagger.oas.models.media.Schema schema58 = strSchema5.discriminator(discriminator57);
        java.math.BigDecimal bigDecimal59 = null;
        io.swagger.oas.models.media.Schema schema60 = strSchema5.maximum(bigDecimal59);
        io.swagger.oas.models.media.Schema schema61 = strSchema0.additionalProperties(schema60);
        strSchema0.setMinProperties((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNull(bigDecimal56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema61);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        java.lang.String str10 = schema6.getType();
        java.lang.String str11 = schema6.getPattern();
        java.lang.String str12 = schema6.getFormat();
        java.lang.Boolean boolean13 = schema6.getExclusiveMaximum();
        schema6.setWriteOnly((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.addRequiredItem("");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.String str7 = strSchema0.getPattern();
        strSchema0.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema11 = strSchema0.exclusiveMinimum((java.lang.Boolean) true);
        schema11.setReadOnly((java.lang.Boolean) true);
        schema11.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        java.lang.Boolean boolean20 = strSchema17.getWriteOnly();
        strSchema17.setMaxItems((java.lang.Integer) 10);
        strSchema17.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean25 = strSchema17.getExclusiveMaximum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation26 = null;
        io.swagger.oas.models.media.Schema schema27 = strSchema17.externalDocs(externalDocumentation26);
        schema11.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) strSchema17);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap29 = null;
        io.swagger.oas.models.media.Schema schema30 = schema11.properties(strMap29);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema30);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema schema15 = strSchema9.type("");
        io.swagger.oas.models.media.Schema schema17 = strSchema9.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema19 = strSchema9.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray22 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        schema19.setRequired((java.util.List<java.lang.String>) strList23);
        schema8.setRequired((java.util.List<java.lang.String>) strList23);
        schema8.setUniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema29 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema29.setType("hi!");
        java.lang.Boolean boolean32 = strSchema29.getWriteOnly();
        io.swagger.oas.models.media.Schema schema34 = strSchema29.type("default");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap35 = strSchema29.getProperties();
        io.swagger.oas.models.media.Schema schema37 = strSchema29.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema38 = schema8.additionalProperties((io.swagger.oas.models.media.Schema) strSchema29);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema39 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema39.setType("hi!");
        strSchema39.setName("no description");
        io.swagger.oas.models.media.Schema schema45 = strSchema39.type("");
        java.lang.Integer int46 = schema45.getMaxProperties();
        java.math.BigDecimal bigDecimal47 = null;
        schema45.setMinimum(bigDecimal47);
        io.swagger.oas.models.media.Schema schema50 = schema45.maxLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal51 = schema45.getMinimum();
        io.swagger.oas.models.media.Schema schema53 = schema45.minProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Discriminator discriminator54 = null;
        io.swagger.oas.models.media.Schema schema55 = schema53.discriminator(discriminator54);
        io.swagger.oas.models.media.XML xML56 = null;
        schema53.setXml(xML56);
        java.math.BigDecimal bigDecimal58 = null;
        io.swagger.oas.models.media.Schema schema59 = schema53.multipleOf(bigDecimal58);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema60 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema60.setType("hi!");
        strSchema60.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap65 = null;
        io.swagger.oas.models.media.Schema schema66 = strSchema60.properties(strMap65);
        java.lang.String str67 = strSchema60.getPattern();
        strSchema60.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema71 = strSchema60.exclusiveMinimum((java.lang.Boolean) true);
        schema71.setReadOnly((java.lang.Boolean) true);
        schema71.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema77 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema77.setType("hi!");
        java.lang.Boolean boolean80 = strSchema77.getWriteOnly();
        strSchema77.setMaxItems((java.lang.Integer) 10);
        strSchema77.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean85 = strSchema77.getExclusiveMaximum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation86 = null;
        io.swagger.oas.models.media.Schema schema87 = strSchema77.externalDocs(externalDocumentation86);
        schema71.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) strSchema77);
        io.swagger.oas.models.media.Schema schema90 = schema71.description("default");
        schema90.set$ref("hi!");
        io.swagger.oas.models.media.Schema schema94 = schema90.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema96 = schema90.deprecated((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap97 = schema96.getExtensions();
        schema53.setExtensions(strMap97);
        schema38.setExtensions(strMap97);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNull(strMap35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNull(bigDecimal51);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNull(boolean80);
        org.junit.Assert.assertNull(boolean85);
        org.junit.Assert.assertNotNull(schema87);
        org.junit.Assert.assertNotNull(schema90);
        org.junit.Assert.assertNotNull(schema94);
        org.junit.Assert.assertNotNull(schema96);
        org.junit.Assert.assertNotNull(strMap97);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = strSchema0.getExtensions();
        java.lang.Boolean boolean8 = strSchema0.getUniqueItems();
        java.lang.Integer int9 = strSchema0.getMaxLength();
        java.lang.Integer int10 = strSchema0.getMinProperties();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.discriminator(discriminator8);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation10 = null;
        schema9.setExternalDocs(externalDocumentation10);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        strSchema13.setName("no description");
        io.swagger.oas.models.media.Schema schema19 = strSchema13.type("");
        io.swagger.oas.models.media.Schema schema21 = strSchema13.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema23 = strSchema13.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema24 = schema9.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (io.swagger.oas.models.media.Schema) strSchema13);
        java.lang.Boolean boolean25 = strSchema13.getUniqueItems();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = strSchema13.getExtensions();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNull(strMap26);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: no description\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        strSchema7.setName("no description");
        io.swagger.oas.models.media.Schema schema13 = strSchema7.type("");
        io.swagger.oas.models.media.Schema schema14 = strSchema0.not((io.swagger.oas.models.media.Schema) strSchema7);
        strSchema7.addEnumItemObject("default");
        strSchema7.setMinProperties((java.lang.Integer) 1);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation19 = strSchema7.getExternalDocs();
        java.lang.Class<?> wildcardClass20 = strSchema7.getClass();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(externalDocumentation19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal11 = null;
        schema10.setMultipleOf(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        strSchema13.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap18 = null;
        io.swagger.oas.models.media.Schema schema19 = strSchema13.properties(strMap18);
        java.lang.Integer int20 = schema19.getMaxProperties();
        io.swagger.oas.models.media.Schema schema22 = schema19.type("*/*");
        schema10.setAdditionalProperties(schema22);
        io.swagger.oas.models.media.Schema schema25 = schema22.maxItems((java.lang.Integer) 1);
        java.lang.Boolean boolean26 = schema22.getUniqueItems();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(boolean26);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        java.lang.Boolean boolean12 = schema11.getNullable();
        io.swagger.oas.models.media.Schema schema14 = schema11.pattern("default");
        io.swagger.oas.models.media.Schema schema16 = schema11.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        strSchema17.setName("no description");
        io.swagger.oas.models.media.Schema schema23 = strSchema17.type("");
        io.swagger.oas.models.media.Schema schema25 = schema23.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int26 = schema25.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema27 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema27.setType("hi!");
        strSchema27.setName("no description");
        io.swagger.oas.models.media.Schema schema33 = strSchema27.type("");
        io.swagger.oas.models.media.Schema schema35 = schema33.format("no description");
        io.swagger.oas.models.media.Schema schema36 = schema25.not(schema35);
        io.swagger.oas.models.media.Schema schema38 = schema35.format("default");
        io.swagger.oas.models.media.Schema schema40 = schema35.exclusiveMinimum((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal41 = null;
        schema40.setMinimum(bigDecimal41);
        schema11.setNot(schema40);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema44 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema44.setType("hi!");
        strSchema44.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int49 = strSchema44.getMinLength();
        java.lang.String str50 = strSchema44.getDescription();
        java.math.BigDecimal bigDecimal51 = null;
        io.swagger.oas.models.media.Schema schema52 = strSchema44.multipleOf(bigDecimal51);
        java.lang.Integer int53 = schema52.getMaxProperties();
        boolean boolean54 = schema11.equals((java.lang.Object) int53);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNull(int53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray13 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        schema10.setRequired((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList17 = schema10.getEnum();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema18 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema18.setType("hi!");
        strSchema18.setName("no description");
        io.swagger.oas.models.media.Schema schema24 = strSchema18.type("");
        io.swagger.oas.models.media.Schema schema26 = schema24.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int27 = schema26.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema28 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema28.setType("hi!");
        strSchema28.setName("no description");
        io.swagger.oas.models.media.Schema schema34 = strSchema28.type("");
        io.swagger.oas.models.media.Schema schema36 = schema34.format("no description");
        io.swagger.oas.models.media.Schema schema37 = schema26.not(schema36);
        io.swagger.oas.models.media.Schema schema39 = schema36.format("default");
        io.swagger.oas.models.media.Schema schema41 = schema36.exclusiveMinimum((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal42 = null;
        schema41.setMinimum(bigDecimal42);
        io.swagger.oas.models.media.XML xML44 = null;
        io.swagger.oas.models.media.Schema schema45 = schema41.xml(xML44);
        schema10.setAdditionalProperties(schema45);
        schema45.setMaxItems((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema45);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        strSchema0.setMaxItems((java.lang.Integer) 10);
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation8 = strSchema0.getExternalDocs();
        java.lang.Boolean boolean9 = strSchema0.getExclusiveMaximum();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(externalDocumentation8);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        strSchema7.setName("no description");
        io.swagger.oas.models.media.Schema schema13 = strSchema7.type("");
        io.swagger.oas.models.media.Schema schema14 = strSchema0.not((io.swagger.oas.models.media.Schema) strSchema7);
        java.lang.Boolean boolean15 = strSchema0.getUniqueItems();
        java.lang.Boolean boolean16 = strSchema0.getNullable();
        io.swagger.oas.models.media.Schema schema18 = strSchema0.uniqueItems((java.lang.Boolean) false);
        strSchema0.setMinItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema21 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema21.setType("hi!");
        strSchema21.setName("no description");
        io.swagger.oas.models.media.Schema schema27 = strSchema21.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation28 = schema27.getExternalDocs();
        io.swagger.oas.models.media.Schema schema30 = schema27.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema32 = schema27.type("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema33 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema33.setType("hi!");
        java.lang.Boolean boolean36 = strSchema33.getDeprecated();
        boolean boolean38 = strSchema33.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal39 = null;
        io.swagger.oas.models.media.Schema schema40 = strSchema33.multipleOf(bigDecimal39);
        io.swagger.oas.models.media.Schema schema42 = strSchema33.deprecated((java.lang.Boolean) false);
        boolean boolean43 = schema27.equals((java.lang.Object) schema42);
        java.math.BigDecimal bigDecimal44 = null;
        io.swagger.oas.models.media.Schema schema45 = schema27.maximum(bigDecimal44);
        io.swagger.oas.models.media.Schema schema47 = schema45.nullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema48 = strSchema0.not(schema45);
        io.swagger.oas.models.media.Schema schema50 = schema45.title("hi!");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation51 = null;
        schema50.setExternalDocs(externalDocumentation51);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(externalDocumentation28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema50);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap6 = strSchema0.getProperties();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str9 = strSchema0.getFormat();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema4 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema4.setType("hi!");
        strSchema4.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int9 = strSchema4.getMinLength();
        java.lang.String str10 = strSchema4.getDescription();
        strSchema0.setExample((java.lang.Object) str10);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        java.lang.Boolean boolean15 = strSchema12.getWriteOnly();
        io.swagger.oas.models.media.Schema schema17 = strSchema12.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema18 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema18.setType("hi!");
        strSchema18.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int23 = strSchema18.getMinLength();
        strSchema18.setDescription("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema17.setNot((io.swagger.oas.models.media.Schema) strSchema18);
        java.math.BigDecimal bigDecimal27 = strSchema18.getMultipleOf();
        io.swagger.oas.models.media.Schema schema28 = strSchema0.example((java.lang.Object) strSchema18);
        strSchema18.setMaxItems((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNull(bigDecimal27);
        org.junit.Assert.assertNotNull(schema28);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: no description\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "#/components/schemas/default";
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal6 = null;
        strSchema0.setMultipleOf(bigDecimal6);
        java.lang.Integer int8 = strSchema0.getMinItems();
        java.lang.Integer int9 = strSchema0.getMaxProperties();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation7 = schema6.getExternalDocs();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str11 = strSchema10.getTitle();
        io.swagger.oas.models.media.Schema schema13 = strSchema10.format("");
        strSchema10.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema16 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema16.setType("hi!");
        strSchema16.setName("no description");
        io.swagger.oas.models.media.Schema schema22 = strSchema16.type("");
        io.swagger.oas.models.media.Schema schema24 = schema22.maxProperties((java.lang.Integer) 100);
        java.lang.String[] strArray26 = new java.lang.String[] { "default" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        schema24.setRequired((java.util.List<java.lang.String>) strList27);
        strSchema10.setRequired((java.util.List<java.lang.String>) strList27);
        schema9.setNot((io.swagger.oas.models.media.Schema) strSchema10);
        io.swagger.oas.models.media.Schema schema33 = schema9.exclusiveMaximum((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal34 = null;
        schema33.setMinimum(bigDecimal34);
        java.math.BigDecimal bigDecimal36 = null;
        schema33.setMultipleOf(bigDecimal36);
        io.swagger.oas.models.media.Schema schema39 = schema33.readOnly((java.lang.Boolean) false);
        schema39.setType("hi!");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(externalDocumentation7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema39);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation7 = schema6.getExternalDocs();
        io.swagger.oas.models.media.Schema schema9 = schema6.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema11 = schema6.type("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        java.lang.Boolean boolean15 = strSchema12.getDeprecated();
        boolean boolean17 = strSchema12.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal18 = null;
        io.swagger.oas.models.media.Schema schema19 = strSchema12.multipleOf(bigDecimal18);
        io.swagger.oas.models.media.Schema schema21 = strSchema12.deprecated((java.lang.Boolean) false);
        boolean boolean22 = schema6.equals((java.lang.Object) schema21);
        java.lang.String str23 = schema21.getName();
        java.util.List<java.lang.String> strList24 = schema21.getRequired();
        java.lang.Integer int25 = schema21.getMinItems();
        java.lang.String str26 = schema21.getPattern();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(externalDocumentation7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: true\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = strSchema0.getNullable();
        io.swagger.oas.models.media.Schema schema6 = strSchema0.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema7 = schema6.getAdditionalProperties();
        io.swagger.oas.models.media.XML xML8 = schema6.getXml();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(schema7);
        org.junit.Assert.assertNull(xML8);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema schema15 = strSchema9.type("");
        io.swagger.oas.models.media.Schema schema17 = schema15.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema18 = schema8.not(schema15);
        io.swagger.oas.models.media.Schema schema20 = schema8.minItems((java.lang.Integer) 0);
        java.lang.String str21 = schema20.getName();
        io.swagger.oas.models.media.Schema schema23 = schema20.pattern("");
        java.lang.Integer int24 = schema23.getMinProperties();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "no description" + "'", str21, "no description");
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(int24);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        schema4.setDescription("no description");
        java.math.BigDecimal bigDecimal7 = null;
        schema4.setMultipleOf(bigDecimal7);
        schema4.setMaxItems((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        io.swagger.oas.models.media.Schema schema2 = strSchema0.maxItems((java.lang.Integer) 100);
        schema2.setTitle("");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = schema2.getProperties();
        schema2.setReadOnly((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        schema6.setExclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema13 = schema6.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        io.swagger.oas.models.media.Schema schema20 = strSchema14.type("");
        java.lang.Integer int21 = schema20.getMaxProperties();
        java.math.BigDecimal bigDecimal22 = null;
        schema20.setMinimum(bigDecimal22);
        schema20.setExclusiveMinimum((java.lang.Boolean) true);
        java.lang.Boolean boolean26 = schema20.getExclusiveMaximum();
        io.swagger.oas.models.media.Schema schema27 = schema13.not(schema20);
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = schema27.getExtensions();
        io.swagger.oas.models.media.Schema schema30 = schema27.minProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema31 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean32 = strSchema31.getUniqueItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema33 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema33.setType("hi!");
        strSchema33.setName("no description");
        io.swagger.oas.models.media.Schema schema39 = strSchema33.type("");
        schema39.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema43 = schema39.example((java.lang.Object) '#');
        strSchema31.setExample((java.lang.Object) schema39);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema45 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema45.setType("hi!");
        strSchema45.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap50 = null;
        io.swagger.oas.models.media.Schema schema51 = strSchema45.properties(strMap50);
        java.lang.Integer int52 = schema51.getMaxProperties();
        io.swagger.oas.models.media.Schema schema54 = schema51.minProperties((java.lang.Integer) 0);
        java.lang.String str55 = schema51.getType();
        schema51.setReadOnly((java.lang.Boolean) true);
        schema51.set$ref("");
        java.lang.String str60 = schema51.getName();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema61 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema61.setType("hi!");
        strSchema61.setName("no description");
        io.swagger.oas.models.media.Schema schema67 = strSchema61.type("");
        io.swagger.oas.models.media.Schema schema69 = strSchema61.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema71 = strSchema61.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray74 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        schema71.setRequired((java.util.List<java.lang.String>) strList75);
        schema51.setRequired((java.util.List<java.lang.String>) strList75);
        schema39.setEnum((java.util.List<java.lang.String>) strList75);
        io.swagger.oas.models.media.Schema schema80 = schema27.required((java.util.List<java.lang.String>) strList75);
        java.lang.Integer int81 = schema80.getMaxLength();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(strMap28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNull(int52);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNull(int81);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema8 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema8.setType("hi!");
        io.swagger.oas.models.media.Schema schema12 = strSchema8.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema14 = schema12.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean15 = schema14.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator16 = null;
        io.swagger.oas.models.media.Schema schema17 = schema14.discriminator(discriminator16);
        java.lang.Boolean boolean18 = schema14.getNullable();
        strSchema0.addExtension("default", (java.lang.Object) boolean18);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation20 = null;
        strSchema0.setExternalDocs(externalDocumentation20);
        io.swagger.oas.models.media.Schema schema23 = strSchema0.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean24 = schema23.getReadOnly();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(boolean24);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        schema12.setDeprecated((java.lang.Boolean) true);
        schema12.setExclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema18 = schema12.readOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema20 = schema12.readOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema22 = schema20.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = strSchema10.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema10.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray23 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        schema20.setRequired((java.util.List<java.lang.String>) strList24);
        java.util.List<java.lang.String> strList27 = schema20.getEnum();
        io.swagger.oas.models.media.Schema schema28 = strSchema0.addProperties("hi!", schema20);
        java.math.BigDecimal bigDecimal29 = null;
        io.swagger.oas.models.media.Schema schema30 = schema28.multipleOf(bigDecimal29);
        schema28.setName("");
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxLength((java.lang.Integer) 0);
        java.lang.Integer int9 = schema8.getMinItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation10 = null;
        io.swagger.oas.models.media.Schema schema11 = schema8.externalDocs(externalDocumentation10);
        java.lang.Boolean boolean12 = schema8.getDeprecated();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema7 = strSchema0.title("no description");
        schema7.set$ref("");
        io.swagger.oas.models.media.Schema schema11 = schema7.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        io.swagger.oas.models.media.Schema schema16 = strSchema12.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema18 = strSchema12.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema19.setType("hi!");
        java.util.List<java.lang.String> strList22 = strSchema19.getRequired();
        strSchema19.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema26 = strSchema19.title("no description");
        java.lang.String str27 = schema26.getDescription();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation28 = null;
        io.swagger.oas.models.media.Schema schema29 = schema26.externalDocs(externalDocumentation28);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema30 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str31 = strSchema30.getTitle();
        io.swagger.oas.models.media.Schema schema33 = strSchema30.format("");
        strSchema30.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema36 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema36.setType("hi!");
        io.swagger.oas.models.media.Schema schema40 = strSchema36.maxLength((java.lang.Integer) 1);
        schema40.setPattern("");
        io.swagger.oas.models.media.Schema schema44 = schema40.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray48 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        schema44.setEnum((java.util.List<java.lang.String>) strList49);
        strSchema30.setEnum((java.util.List<java.lang.String>) strList49);
        schema29.setRequired((java.util.List<java.lang.String>) strList49);
        schema18.setRequired((java.util.List<java.lang.String>) strList49);
        io.swagger.oas.models.media.Schema schema55 = schema11.required((java.util.List<java.lang.String>) strList49);
        io.swagger.oas.models.media.Schema schema57 = schema55.description("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema59 = schema57.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.XML xML60 = null;
        io.swagger.oas.models.media.Schema schema61 = schema57.xml(xML60);
        java.lang.Boolean boolean62 = schema61.getNullable();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNull(boolean62);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.String[] strArray10 = new java.lang.String[] { "default" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        schema8.setRequired((java.util.List<java.lang.String>) strList11);
        java.lang.String str14 = schema8.getTitle();
        java.lang.Boolean boolean15 = schema8.getWriteOnly();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema16 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema16.setType("hi!");
        strSchema16.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema21 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema21.setType("hi!");
        java.util.List<java.lang.String> strList24 = strSchema21.getRequired();
        strSchema21.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int27 = strSchema21.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema28 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema28.setType("hi!");
        strSchema28.setName("no description");
        io.swagger.oas.models.media.Schema schema34 = strSchema28.type("");
        io.swagger.oas.models.media.Schema schema35 = strSchema21.not((io.swagger.oas.models.media.Schema) strSchema28);
        strSchema16.setExample((java.lang.Object) schema35);
        io.swagger.oas.models.media.Schema schema37 = schema8.not((io.swagger.oas.models.media.Schema) strSchema16);
        java.lang.Class<?> wildcardClass38 = schema8.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        strSchema0.set$ref("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        io.swagger.oas.models.media.Schema schema11 = strSchema5.type("");
        io.swagger.oas.models.media.Schema schema13 = strSchema5.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema15 = strSchema5.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray18 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        schema15.setRequired((java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = schema15.getEnum();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        strSchema23.setName("no description");
        io.swagger.oas.models.media.Schema schema29 = strSchema23.type("");
        io.swagger.oas.models.media.Schema schema31 = schema29.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int32 = schema31.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema33 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema33.setType("hi!");
        strSchema33.setName("no description");
        io.swagger.oas.models.media.Schema schema39 = strSchema33.type("");
        io.swagger.oas.models.media.Schema schema41 = schema39.format("no description");
        io.swagger.oas.models.media.Schema schema42 = schema31.not(schema41);
        io.swagger.oas.models.media.Schema schema44 = schema41.format("default");
        io.swagger.oas.models.media.Schema schema46 = schema41.exclusiveMinimum((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal47 = null;
        schema46.setMinimum(bigDecimal47);
        io.swagger.oas.models.media.XML xML49 = null;
        io.swagger.oas.models.media.Schema schema50 = schema46.xml(xML49);
        schema15.setAdditionalProperties(schema50);
        io.swagger.oas.models.media.Schema schema53 = schema15.deprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema54 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema54.setType("hi!");
        strSchema54.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap59 = null;
        io.swagger.oas.models.media.Schema schema60 = strSchema54.properties(strMap59);
        java.lang.Integer int61 = schema60.getMaxProperties();
        io.swagger.oas.models.media.Schema schema63 = schema60.minProperties((java.lang.Integer) 0);
        java.lang.String str64 = schema60.getType();
        schema60.setReadOnly((java.lang.Boolean) true);
        schema60.set$ref("");
        java.lang.String str69 = schema60.getName();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema70 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema70.setType("hi!");
        strSchema70.setName("no description");
        io.swagger.oas.models.media.Schema schema76 = strSchema70.type("");
        io.swagger.oas.models.media.Schema schema78 = strSchema70.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema80 = strSchema70.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray83 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        schema80.setRequired((java.util.List<java.lang.String>) strList84);
        schema60.setRequired((java.util.List<java.lang.String>) strList84);
        schema53.setRequired((java.util.List<java.lang.String>) strList84);
        io.swagger.oas.models.media.Schema schema89 = strSchema0.required((java.util.List<java.lang.String>) strList84);
        java.lang.Boolean boolean90 = strSchema0.getUniqueItems();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNull(int61);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema78);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(schema89);
        org.junit.Assert.assertNull(boolean90);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        strSchema0.setDefault((java.lang.Object) (byte) 100);
        strSchema0.setMinProperties((java.lang.Integer) 0);
        strSchema0.setMinProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema12 = strSchema0.deprecated((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal13 = null;
        io.swagger.oas.models.media.Schema schema14 = strSchema0.minimum(bigDecimal13);
        schema14.setReadOnly((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        java.lang.Boolean boolean9 = strSchema6.getWriteOnly();
        io.swagger.oas.models.media.Schema schema11 = strSchema6.type("default");
        strSchema0.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema6);
        strSchema6.setExclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema15.setType("hi!");
        strSchema15.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap20 = null;
        io.swagger.oas.models.media.Schema schema21 = strSchema15.properties(strMap20);
        java.lang.Integer int22 = schema21.getMaxProperties();
        io.swagger.oas.models.media.Schema schema24 = schema21.minProperties((java.lang.Integer) 0);
        java.lang.String str25 = schema21.getType();
        strSchema6.setDefault((java.lang.Object) schema21);
        io.swagger.oas.models.media.Schema schema28 = strSchema6.maxProperties((java.lang.Integer) 1);
        java.lang.Boolean boolean29 = strSchema6.getUniqueItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema31 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema31.setType("hi!");
        strSchema31.setName("no description");
        io.swagger.oas.models.media.Schema schema37 = strSchema31.type("");
        io.swagger.oas.models.media.Schema schema39 = strSchema31.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema41 = strSchema31.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema42 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema42.setType("hi!");
        java.lang.Boolean boolean45 = strSchema42.getWriteOnly();
        io.swagger.oas.models.media.Schema schema47 = strSchema42.type("default");
        io.swagger.oas.models.media.Schema schema48 = strSchema31.not(schema47);
        io.swagger.oas.models.media.Schema schema50 = schema48.minItems((java.lang.Integer) 0);
        java.math.BigDecimal bigDecimal51 = schema50.getMultipleOf();
        java.lang.Boolean boolean52 = schema50.getExclusiveMaximum();
        io.swagger.oas.models.media.Schema schema53 = strSchema6.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema50);
        strSchema6.setDeprecated((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(boolean45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNull(bigDecimal51);
        org.junit.Assert.assertNull(boolean52);
        org.junit.Assert.assertNotNull(schema53);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema schema7 = strSchema0.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.math.BigDecimal bigDecimal8 = null;
        io.swagger.oas.models.media.Schema schema9 = strSchema0.multipleOf(bigDecimal8);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        strSchema0.setDefault((java.lang.Object) (byte) 100);
        strSchema0.setMinProperties((java.lang.Integer) 0);
        strSchema0.setMinProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema12 = strSchema0.deprecated((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal13 = schema12.getMinimum();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(bigDecimal13);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int5 = strSchema0.getMinLength();
        java.lang.Integer int6 = strSchema0.getMaxLength();
        strSchema0.addEnumItemObject("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Object obj9 = strSchema0.getExample();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.discriminator(discriminator8);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation10 = null;
        schema9.setExternalDocs(externalDocumentation10);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        strSchema13.setName("no description");
        io.swagger.oas.models.media.Schema schema19 = strSchema13.type("");
        io.swagger.oas.models.media.Schema schema21 = strSchema13.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema23 = strSchema13.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema24 = schema9.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (io.swagger.oas.models.media.Schema) strSchema13);
        io.swagger.oas.models.media.Schema schema25 = schema24.getAdditionalProperties();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(schema25);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.String str7 = strSchema0.getPattern();
        java.lang.String str8 = strSchema0.getPattern();
        strSchema0.setMaxLength((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema12 = strSchema0.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        io.swagger.oas.models.media.Schema schema20 = strSchema14.type("");
        io.swagger.oas.models.media.Schema schema22 = schema20.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int23 = schema22.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema24 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema24.setType("hi!");
        strSchema24.setName("no description");
        io.swagger.oas.models.media.Schema schema30 = strSchema24.type("");
        io.swagger.oas.models.media.Schema schema32 = schema30.format("no description");
        io.swagger.oas.models.media.Schema schema33 = schema22.not(schema32);
        io.swagger.oas.models.media.Schema schema35 = schema32.format("default");
        io.swagger.oas.models.media.Schema schema37 = schema35.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema38 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema38.setType("hi!");
        strSchema38.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap43 = null;
        io.swagger.oas.models.media.Schema schema44 = strSchema38.properties(strMap43);
        java.lang.Integer int45 = schema44.getMaxProperties();
        schema44.setMinLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation48 = null;
        io.swagger.oas.models.media.Schema schema49 = schema44.externalDocs(externalDocumentation48);
        io.swagger.oas.models.media.Schema schema51 = schema49.description("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema52 = schema37.not(schema49);
        io.swagger.oas.models.media.Schema schema53 = schema52.getNot();
        io.swagger.oas.models.media.Schema schema54 = strSchema0.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema53);
        java.lang.Class<?> wildcardClass55 = schema54.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        java.math.BigDecimal bigDecimal10 = schema6.getMultipleOf();
        io.swagger.oas.models.media.Schema schema12 = schema6.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        strSchema13.setName("no description");
        io.swagger.oas.models.media.Schema schema19 = strSchema13.type("");
        java.lang.Integer int20 = schema19.getMaxProperties();
        io.swagger.oas.models.media.Schema schema22 = schema19.name("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        strSchema23.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap28 = null;
        io.swagger.oas.models.media.Schema schema29 = strSchema23.properties(strMap28);
        java.lang.String str30 = strSchema23.getType();
        schema19.setNot((io.swagger.oas.models.media.Schema) strSchema23);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema32 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema32.setType("hi!");
        strSchema32.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema37 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema37.setType("hi!");
        java.util.List<java.lang.String> strList40 = strSchema37.getRequired();
        strSchema37.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int43 = strSchema37.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema44 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema44.setType("hi!");
        strSchema44.setName("no description");
        io.swagger.oas.models.media.Schema schema50 = strSchema44.type("");
        io.swagger.oas.models.media.Schema schema51 = strSchema37.not((io.swagger.oas.models.media.Schema) strSchema44);
        strSchema32.setExample((java.lang.Object) schema51);
        java.math.BigDecimal bigDecimal53 = null;
        schema51.setMultipleOf(bigDecimal53);
        io.swagger.oas.models.media.Schema schema56 = schema51.maxProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema57 = schema19.example((java.lang.Object) schema56);
        java.lang.Boolean boolean58 = schema56.getNullable();
        schema12.setExample((java.lang.Object) schema56);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(strList40);
        org.junit.Assert.assertNull(int43);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNull(boolean58);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.minProperties((java.lang.Integer) (-1));
        java.lang.String str12 = schema6.getName();
        schema6.setUniqueItems((java.lang.Boolean) false);
        schema6.setName("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        schema6.setFormat("");
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema6.multipleOf(bigDecimal11);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        schema6.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema10 = schema6.addRequiredItem("");
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema6.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        java.lang.Boolean boolean19 = strSchema13.getDeprecated();
        java.math.BigDecimal bigDecimal20 = strSchema13.getMultipleOf();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema21 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema21.setType("hi!");
        strSchema21.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap26 = null;
        io.swagger.oas.models.media.Schema schema27 = strSchema21.properties(strMap26);
        java.lang.Integer int28 = schema27.getMaxProperties();
        io.swagger.oas.models.media.Schema schema30 = schema27.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema32 = schema27.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema33 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema33.setType("hi!");
        strSchema33.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int38 = strSchema33.getMinLength();
        java.lang.Integer int39 = strSchema33.getMaxLength();
        java.math.BigDecimal bigDecimal40 = strSchema33.getMaximum();
        io.swagger.oas.models.media.Schema schema41 = schema32.additionalProperties((io.swagger.oas.models.media.Schema) strSchema33);
        java.lang.Integer int42 = strSchema33.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema43 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema43.setType("hi!");
        strSchema43.setName("no description");
        io.swagger.oas.models.media.Schema schema49 = strSchema43.type("");
        io.swagger.oas.models.media.Schema schema51 = strSchema43.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema52 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema52.setType("hi!");
        strSchema52.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema57 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema57.setType("hi!");
        strSchema57.setName("no description");
        strSchema52.setNot((io.swagger.oas.models.media.Schema) strSchema57);
        java.math.BigDecimal bigDecimal63 = null;
        io.swagger.oas.models.media.Schema schema64 = strSchema52.minimum(bigDecimal63);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema65 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema65.setType("hi!");
        strSchema65.setName("no description");
        io.swagger.oas.models.media.Schema schema71 = strSchema65.type("");
        io.swagger.oas.models.media.Schema schema73 = schema71.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema74 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema74.setType("hi!");
        strSchema74.setName("no description");
        io.swagger.oas.models.media.Schema schema80 = strSchema74.type("");
        io.swagger.oas.models.media.Schema schema82 = strSchema74.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema84 = strSchema74.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray87 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        schema84.setRequired((java.util.List<java.lang.String>) strList88);
        schema73.setRequired((java.util.List<java.lang.String>) strList88);
        io.swagger.oas.models.media.Schema schema92 = strSchema52.required((java.util.List<java.lang.String>) strList88);
        strSchema43.setEnum((java.util.List<java.lang.String>) strList88);
        strSchema33.setEnum((java.util.List<java.lang.String>) strList88);
        io.swagger.oas.models.media.Schema schema95 = strSchema13.required((java.util.List<java.lang.String>) strList88);
        java.lang.Integer int96 = schema95.getMaxLength();
        io.swagger.oas.models.media.Schema schema97 = schema6.additionalProperties(schema95);
        java.math.BigDecimal bigDecimal98 = null;
        schema95.setMinimum(bigDecimal98);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNull(bigDecimal20);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNull(bigDecimal40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(int42);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNotNull(schema84);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(schema92);
        org.junit.Assert.assertNotNull(schema95);
        org.junit.Assert.assertNull(int96);
        org.junit.Assert.assertNotNull(schema97);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation7 = schema6.getExternalDocs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = externalDocumentation7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(externalDocumentation7);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema8 = schema6.getNot();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        io.swagger.oas.models.media.Schema schema13 = strSchema9.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema15 = schema13.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean16 = schema15.getExclusiveMaximum();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap17 = schema15.getProperties();
        io.swagger.oas.models.media.Schema schema19 = schema15.format("");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema20 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema20.setType("hi!");
        io.swagger.oas.models.media.Schema schema24 = strSchema20.maxLength((java.lang.Integer) 1);
        schema24.setPattern("");
        io.swagger.oas.models.media.Schema schema28 = schema24.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray32 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        schema28.setEnum((java.util.List<java.lang.String>) strList33);
        schema19.setEnum((java.util.List<java.lang.String>) strList33);
        // The following exception was thrown during execution in test generation
        try {
            schema8.setRequired((java.util.List<java.lang.String>) strList33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(schema8);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema13.title("no description");
        java.lang.String str21 = schema20.getDescription();
        boolean boolean22 = schema12.equals((java.lang.Object) schema20);
        java.util.List<java.lang.String> strList23 = null;
        io.swagger.oas.models.media.Schema schema24 = schema20.required(strList23);
        schema20.setMaxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema28 = schema20.minLength((java.lang.Integer) 10);
        java.lang.Object obj29 = schema20.getExample();
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        java.lang.String str6 = schema5.getDescription();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema8 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema8.setType("hi!");
        strSchema8.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap13 = null;
        io.swagger.oas.models.media.Schema schema14 = strSchema8.properties(strMap13);
        io.swagger.oas.models.media.Schema schema16 = strSchema8.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema17 = schema5.addProperties("no description", schema16);
        io.swagger.oas.models.media.Schema schema19 = schema5.exclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema21 = schema19.$ref("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str23 = strSchema22.getTitle();
        io.swagger.oas.models.media.Schema schema25 = strSchema22.format("");
        strSchema22.setDeprecated((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal28 = strSchema22.getMaximum();
        java.math.BigDecimal bigDecimal29 = strSchema22.getMinimum();
        io.swagger.oas.models.media.Schema schema31 = strSchema22.deprecated((java.lang.Boolean) true);
        schema31.setMinLength((java.lang.Integer) (-1));
        schema21.setExample((java.lang.Object) schema31);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap35 = schema31.getProperties();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(bigDecimal28);
        org.junit.Assert.assertNull(bigDecimal29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNull(strMap35);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "#/components/schemas/default";
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 10\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        schema6.setMinLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation10 = null;
        io.swagger.oas.models.media.Schema schema11 = schema6.externalDocs(externalDocumentation10);
        io.swagger.oas.models.media.Schema schema13 = schema11.description("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema15 = schema13.name("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema15.setWriteOnly((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.discriminator(discriminator8);
        io.swagger.oas.models.media.Schema schema11 = schema6.nullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema13 = schema6.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Discriminator discriminator14 = schema13.getDiscriminator();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(discriminator14);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema13 = schema6.nullable((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema15 = schema13.writeOnly((java.lang.Boolean) true);
        schema15.setMaxItems((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray13 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        schema10.setRequired((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList17 = schema10.getEnum();
        java.lang.Integer int18 = schema10.getMaxLength();
        io.swagger.oas.models.media.Schema schema20 = schema10.pattern("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema21 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema21.setType("hi!");
        strSchema21.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema26 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema26.setType("hi!");
        strSchema26.setName("no description");
        strSchema21.setNot((io.swagger.oas.models.media.Schema) strSchema26);
        java.math.BigDecimal bigDecimal32 = null;
        io.swagger.oas.models.media.Schema schema33 = strSchema21.minimum(bigDecimal32);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema34 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema34.setType("hi!");
        java.util.List<java.lang.String> strList37 = strSchema34.getRequired();
        strSchema34.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema41 = strSchema34.title("no description");
        java.lang.String str42 = schema41.getDescription();
        boolean boolean43 = schema33.equals((java.lang.Object) schema41);
        io.swagger.oas.models.media.Schema schema45 = schema41.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema46 = schema10.example((java.lang.Object) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema47 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema47.setType("hi!");
        strSchema47.setName("no description");
        io.swagger.oas.models.media.Schema schema53 = strSchema47.type("");
        io.swagger.oas.models.media.Schema schema55 = strSchema47.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema57 = strSchema47.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema58 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema58.setType("hi!");
        java.lang.Boolean boolean61 = strSchema58.getWriteOnly();
        io.swagger.oas.models.media.Schema schema63 = strSchema58.type("default");
        io.swagger.oas.models.media.Schema schema64 = strSchema47.not(schema63);
        java.math.BigDecimal bigDecimal65 = null;
        schema63.setMultipleOf(bigDecimal65);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema67 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema67.setType("hi!");
        io.swagger.oas.models.media.Schema schema71 = strSchema67.maxLength((java.lang.Integer) 1);
        schema71.setPattern("");
        io.swagger.oas.models.media.Schema schema75 = schema71.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray79 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        schema75.setEnum((java.util.List<java.lang.String>) strList80);
        io.swagger.oas.models.media.Schema schema83 = schema63.required((java.util.List<java.lang.String>) strList80);
        io.swagger.oas.models.media.Schema schema84 = schema46.required((java.util.List<java.lang.String>) strList80);
        java.math.BigDecimal bigDecimal85 = null;
        schema46.setMultipleOf(bigDecimal85);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(strList37);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNull(boolean61);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(schema83);
        org.junit.Assert.assertNotNull(schema84);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Discriminator discriminator9 = null;
        io.swagger.oas.models.media.Schema schema10 = schema6.discriminator(discriminator9);
        java.lang.String str11 = schema10.getFormat();
        java.math.BigDecimal bigDecimal12 = schema10.getMinimum();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap13 = null;
        io.swagger.oas.models.media.Schema schema14 = schema10.properties(strMap13);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation15 = null;
        io.swagger.oas.models.media.Schema schema16 = schema14.externalDocs(externalDocumentation15);
        java.math.BigDecimal bigDecimal17 = null;
        schema16.setMultipleOf(bigDecimal17);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.String str7 = strSchema0.getPattern();
        java.lang.String str8 = strSchema0.get$ref();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int9 = schema8.getMinItems();
        java.util.List<java.lang.String> strList10 = schema8.getRequired();
        java.lang.Boolean boolean11 = schema8.getExclusiveMinimum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap8 = schema6.getProperties();
        io.swagger.oas.models.media.Schema schema10 = schema6.format("");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        io.swagger.oas.models.media.Schema schema15 = strSchema11.maxLength((java.lang.Integer) 1);
        schema15.setPattern("");
        io.swagger.oas.models.media.Schema schema19 = schema15.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray23 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        schema19.setEnum((java.util.List<java.lang.String>) strList24);
        schema10.setEnum((java.util.List<java.lang.String>) strList24);
        schema10.setReadOnly((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        java.lang.String str7 = strSchema0.get$ref();
        io.swagger.oas.models.media.Schema schema9 = strSchema0.minItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean15 = strSchema10.getDeprecated();
        strSchema10.setMinProperties((java.lang.Integer) 100);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "no description", "default" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        strSchema10.setRequired((java.util.List<java.lang.String>) strList23);
        strSchema0.setEnum((java.util.List<java.lang.String>) strList23);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema27 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema27.setType("hi!");
        java.lang.Boolean boolean30 = strSchema27.getWriteOnly();
        io.swagger.oas.models.media.Schema schema32 = strSchema27.type("default");
        java.lang.String str33 = schema32.getDescription();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema35 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema35.setType("hi!");
        strSchema35.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap40 = null;
        io.swagger.oas.models.media.Schema schema41 = strSchema35.properties(strMap40);
        io.swagger.oas.models.media.Schema schema43 = strSchema35.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema44 = schema32.addProperties("no description", schema43);
        io.swagger.oas.models.media.Schema schema46 = schema32.exclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema48 = schema46.$ref("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema49 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str50 = strSchema49.getTitle();
        io.swagger.oas.models.media.Schema schema52 = strSchema49.format("");
        strSchema49.setDeprecated((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal55 = strSchema49.getMaximum();
        java.math.BigDecimal bigDecimal56 = strSchema49.getMinimum();
        io.swagger.oas.models.media.Schema schema58 = strSchema49.deprecated((java.lang.Boolean) true);
        schema58.setMinLength((java.lang.Integer) (-1));
        schema48.setExample((java.lang.Object) schema58);
        strSchema0.setDefault((java.lang.Object) schema58);
        strSchema0.setName("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNull(bigDecimal55);
        org.junit.Assert.assertNull(bigDecimal56);
        org.junit.Assert.assertNotNull(schema58);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxLength((java.lang.Integer) 0);
        java.lang.Integer int9 = schema8.getMinItems();
        java.math.BigDecimal bigDecimal10 = schema8.getMaximum();
        java.math.BigDecimal bigDecimal11 = null;
        schema8.setMaximum(bigDecimal11);
        schema8.setName("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(bigDecimal10);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        strSchema0.setMaxItems((java.lang.Integer) 10);
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean8 = strSchema0.getExclusiveMaximum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation9 = null;
        io.swagger.oas.models.media.Schema schema10 = strSchema0.externalDocs(externalDocumentation9);
        io.swagger.oas.models.media.Schema schema12 = strSchema0.maxItems((java.lang.Integer) 100);
        schema12.setWriteOnly((java.lang.Boolean) false);
        java.lang.Boolean boolean15 = schema12.getDeprecated();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema7 = strSchema0.title("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema9 = strSchema0.readOnly((java.lang.Boolean) false);
        java.lang.Boolean boolean10 = strSchema0.getExclusiveMaximum();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal11 = null;
        schema10.setMultipleOf(bigDecimal11);
        io.swagger.oas.models.media.Schema schema14 = schema10.maxItems((java.lang.Integer) 100);
        java.util.List<java.lang.String> strList15 = schema10.getRequired();
        io.swagger.oas.models.media.Schema schema17 = schema10.maxProperties((java.lang.Integer) 10);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap18 = schema17.getProperties();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation19 = null;
        io.swagger.oas.models.media.Schema schema20 = schema17.externalDocs(externalDocumentation19);
        java.lang.String str21 = schema20.getType();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation7 = schema6.getExternalDocs();
        io.swagger.oas.models.media.Schema schema9 = schema6.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema11 = schema6.type("*/*");
        java.lang.Integer int12 = schema11.getMaxLength();
        java.math.BigDecimal bigDecimal13 = schema11.getMultipleOf();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(externalDocumentation7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(bigDecimal13);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema10 = schema6.addRequiredItem("no description");
        java.lang.String str11 = schema10.toString();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 100\n    minProperties: null\n    required: [no description]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str11, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 100\n    minProperties: null\n    required: [no description]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Boolean boolean6 = strSchema0.getDeprecated();
        java.math.BigDecimal bigDecimal7 = strSchema0.getMultipleOf();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = bigDecimal7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(bigDecimal7);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxProperties((java.lang.Integer) 1);
        schema11.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Discriminator discriminator14 = schema11.getDiscriminator();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation15 = null;
        io.swagger.oas.models.media.Schema schema16 = schema11.externalDocs(externalDocumentation15);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        strSchema17.setName("no description");
        io.swagger.oas.models.media.Schema schema23 = strSchema17.type("");
        io.swagger.oas.models.media.Schema schema25 = strSchema17.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema27 = strSchema17.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema28 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema28.setType("hi!");
        java.lang.Boolean boolean31 = strSchema28.getWriteOnly();
        io.swagger.oas.models.media.Schema schema33 = strSchema28.type("default");
        io.swagger.oas.models.media.Schema schema34 = strSchema17.not(schema33);
        io.swagger.oas.models.media.Schema schema36 = schema33.description("default");
        io.swagger.oas.models.media.Schema schema38 = schema36.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema39 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema39.setType("hi!");
        strSchema39.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap44 = null;
        io.swagger.oas.models.media.Schema schema45 = strSchema39.properties(strMap44);
        java.lang.Integer int46 = schema45.getMaxProperties();
        io.swagger.oas.models.media.Schema schema48 = schema45.minProperties((java.lang.Integer) 0);
        java.lang.String str49 = schema45.getType();
        io.swagger.oas.models.media.Schema schema51 = schema45.maxLength((java.lang.Integer) 100);
        schema38.setNot(schema45);
        java.lang.Boolean boolean53 = schema45.getNullable();
        schema16.setExample((java.lang.Object) schema45);
        schema45.setFormat("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(discriminator14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNull(boolean53);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema7 = strSchema0.$ref("");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema8 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema8.setType("hi!");
        strSchema8.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap13 = null;
        io.swagger.oas.models.media.Schema schema14 = strSchema8.properties(strMap13);
        java.lang.Integer int15 = schema14.getMaxProperties();
        io.swagger.oas.models.media.Schema schema17 = schema14.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema18 = schema7.not(schema17);
        io.swagger.oas.models.media.Schema schema20 = schema17.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str21 = schema17.getPattern();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation4 = schema3.getExternalDocs();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(externalDocumentation4);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        java.lang.String str6 = schema5.getDescription();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema8 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema8.setType("hi!");
        strSchema8.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap13 = null;
        io.swagger.oas.models.media.Schema schema14 = strSchema8.properties(strMap13);
        io.swagger.oas.models.media.Schema schema16 = strSchema8.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema17 = schema5.addProperties("no description", schema16);
        io.swagger.oas.models.media.Schema schema19 = schema5.exclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema21 = schema19.$ref("default");
        io.swagger.oas.models.media.Discriminator discriminator22 = schema21.getDiscriminator();
        java.lang.Integer int23 = schema21.getMaxProperties();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(discriminator22);
        org.junit.Assert.assertNull(int23);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray13 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        schema10.setRequired((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList17 = schema10.getEnum();
        schema10.setMinProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Discriminator discriminator20 = null;
        io.swagger.oas.models.media.Schema schema21 = schema10.discriminator(discriminator20);
        io.swagger.oas.models.media.Schema schema23 = schema10.exclusiveMaximum((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = schema23.getExtensions();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal12 = schema6.getMinimum();
        io.swagger.oas.models.media.Schema schema14 = schema6.minProperties((java.lang.Integer) 1);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap15 = null;
        io.swagger.oas.models.media.Schema schema16 = schema6.properties(strMap15);
        java.lang.Boolean boolean17 = schema6.getUniqueItems();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal12 = schema6.getMinimum();
        io.swagger.oas.models.media.Schema schema14 = schema6.minProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Discriminator discriminator15 = null;
        io.swagger.oas.models.media.Schema schema16 = schema14.discriminator(discriminator15);
        io.swagger.oas.models.media.Schema schema18 = schema14.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = schema18.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.XML xML21 = null;
        schema18.setXml(xML21);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        io.swagger.oas.models.media.Schema schema11 = strSchema5.type("");
        io.swagger.oas.models.media.Schema schema13 = strSchema5.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema19.setType("hi!");
        strSchema19.setName("no description");
        strSchema14.setNot((io.swagger.oas.models.media.Schema) strSchema19);
        java.math.BigDecimal bigDecimal25 = null;
        io.swagger.oas.models.media.Schema schema26 = strSchema14.minimum(bigDecimal25);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema27 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema27.setType("hi!");
        strSchema27.setName("no description");
        io.swagger.oas.models.media.Schema schema33 = strSchema27.type("");
        io.swagger.oas.models.media.Schema schema35 = schema33.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema36 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema36.setType("hi!");
        strSchema36.setName("no description");
        io.swagger.oas.models.media.Schema schema42 = strSchema36.type("");
        io.swagger.oas.models.media.Schema schema44 = strSchema36.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema46 = strSchema36.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray49 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        schema46.setRequired((java.util.List<java.lang.String>) strList50);
        schema35.setRequired((java.util.List<java.lang.String>) strList50);
        io.swagger.oas.models.media.Schema schema54 = strSchema14.required((java.util.List<java.lang.String>) strList50);
        strSchema5.setEnum((java.util.List<java.lang.String>) strList50);
        java.math.BigDecimal bigDecimal56 = strSchema5.getMinimum();
        io.swagger.oas.models.media.Discriminator discriminator57 = null;
        io.swagger.oas.models.media.Schema schema58 = strSchema5.discriminator(discriminator57);
        java.math.BigDecimal bigDecimal59 = null;
        io.swagger.oas.models.media.Schema schema60 = strSchema5.maximum(bigDecimal59);
        io.swagger.oas.models.media.Schema schema61 = strSchema0.additionalProperties(schema60);
        schema61.setTitle("hi!");
        java.lang.String str64 = schema61.getFormat();
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNull(bigDecimal56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.String str7 = strSchema0.getPattern();
        strSchema0.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema11 = strSchema0.exclusiveMinimum((java.lang.Boolean) true);
        schema11.setReadOnly((java.lang.Boolean) true);
        schema11.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        java.lang.Boolean boolean20 = strSchema17.getWriteOnly();
        strSchema17.setMaxItems((java.lang.Integer) 10);
        strSchema17.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean25 = strSchema17.getExclusiveMaximum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation26 = null;
        io.swagger.oas.models.media.Schema schema27 = strSchema17.externalDocs(externalDocumentation26);
        schema11.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) strSchema17);
        io.swagger.oas.models.media.Schema schema30 = schema11.description("default");
        io.swagger.oas.models.media.Schema schema32 = schema11.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Discriminator discriminator33 = schema32.getDiscriminator();
        io.swagger.oas.models.media.XML xML34 = null;
        io.swagger.oas.models.media.Schema schema35 = schema32.xml(xML34);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation36 = null;
        schema35.setExternalDocs(externalDocumentation36);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(discriminator33);
        org.junit.Assert.assertNotNull(schema35);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        java.lang.String str7 = strSchema0.get$ref();
        java.lang.String str8 = strSchema0.getPattern();
        io.swagger.oas.models.media.Schema schema10 = strSchema0.readOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        java.lang.Boolean boolean14 = strSchema11.getWriteOnly();
        io.swagger.oas.models.media.Schema schema16 = strSchema11.type("default");
        java.lang.String str17 = schema16.getDescription();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema19.setType("hi!");
        strSchema19.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap24 = null;
        io.swagger.oas.models.media.Schema schema25 = strSchema19.properties(strMap24);
        io.swagger.oas.models.media.Schema schema27 = strSchema19.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema28 = schema16.addProperties("no description", schema27);
        io.swagger.oas.models.media.Schema schema30 = schema16.exclusiveMinimum((java.lang.Boolean) true);
        java.lang.Integer int31 = schema16.getMaxItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema32 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema32.setType("hi!");
        java.util.List<java.lang.String> strList35 = strSchema32.getRequired();
        strSchema32.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int38 = strSchema32.getMinLength();
        io.swagger.oas.models.media.Schema schema40 = strSchema32.maxItems((java.lang.Integer) 100);
        schema16.setExample((java.lang.Object) schema40);
        io.swagger.oas.models.media.Schema schema43 = schema40.maxItems((java.lang.Integer) (-1));
        strSchema0.setAdditionalProperties(schema43);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema45 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema45.setType("hi!");
        strSchema45.setName("no description");
        io.swagger.oas.models.media.Schema schema51 = strSchema45.type("");
        io.swagger.oas.models.media.Schema schema53 = strSchema45.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema55 = strSchema45.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Discriminator discriminator56 = strSchema45.getDiscriminator();
        java.math.BigDecimal bigDecimal57 = null;
        io.swagger.oas.models.media.Schema schema58 = strSchema45.multipleOf(bigDecimal57);
        io.swagger.oas.models.media.Discriminator discriminator59 = null;
        strSchema45.setDiscriminator(discriminator59);
        boolean boolean61 = schema43.equals((java.lang.Object) discriminator59);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNull(strList35);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNull(discriminator56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        java.lang.Integer int5 = strSchema0.getMaxProperties();
        strSchema0.setType("default");
        java.math.BigDecimal bigDecimal8 = null;
        io.swagger.oas.models.media.Schema schema9 = strSchema0.minimum(bigDecimal8);
        schema9.setDescription("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema9.setMaxProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema15 = schema9.maxLength((java.lang.Integer) 0);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: []\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 10\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getDeprecated();
        java.lang.Integer int4 = strSchema0.getMaxItems();
        strSchema0.setMinLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema8 = strSchema0.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation9 = schema8.getExternalDocs();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(externalDocumentation9);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        schema4.setWriteOnly((java.lang.Boolean) true);
        java.lang.Boolean boolean9 = schema4.getWriteOnly();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int9 = schema8.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = schema16.format("no description");
        io.swagger.oas.models.media.Schema schema19 = schema8.not(schema18);
        schema19.setMaxProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Discriminator discriminator22 = schema19.getDiscriminator();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(discriminator22);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        io.swagger.oas.models.media.Schema schema5 = strSchema0.exclusiveMaximum((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal6 = null;
        schema5.setMaximum(bigDecimal6);
        java.lang.String str8 = schema5.getTitle();
        java.lang.Class<?> wildcardClass9 = schema5.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        java.lang.Boolean boolean14 = strSchema11.getWriteOnly();
        io.swagger.oas.models.media.Schema schema16 = strSchema11.type("default");
        io.swagger.oas.models.media.Schema schema17 = strSchema0.not(schema16);
        io.swagger.oas.models.media.Schema schema19 = schema17.minItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema20 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema20.setType("hi!");
        strSchema20.setName("no description");
        io.swagger.oas.models.media.Schema schema26 = strSchema20.type("");
        java.lang.Integer int27 = schema26.getMaxProperties();
        java.math.BigDecimal bigDecimal28 = null;
        schema26.setMinimum(bigDecimal28);
        io.swagger.oas.models.media.Schema schema31 = schema26.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema33 = schema31.maxProperties((java.lang.Integer) (-1));
        schema19.setExample((java.lang.Object) schema31);
        schema19.setType("default");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        java.math.BigDecimal bigDecimal7 = null;
        strSchema0.setMinimum(bigDecimal7);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 1);
        schema10.setExclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        io.swagger.oas.models.media.Schema schema20 = strSchema14.type("");
        io.swagger.oas.models.media.Schema schema22 = schema20.maxProperties((java.lang.Integer) 100);
        schema22.setDeprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema25 = schema10.addProperties("*/*", schema22);
        schema10.setMinItems((java.lang.Integer) 10);
        schema10.setName("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema30 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema30.setType("hi!");
        strSchema30.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean35 = strSchema30.getDeprecated();
        java.lang.String str36 = strSchema30.getDescription();
        io.swagger.oas.models.media.Schema schema38 = strSchema30.maxLength((java.lang.Integer) 0);
        java.lang.Integer int39 = schema38.getMinItems();
        java.math.BigDecimal bigDecimal40 = null;
        io.swagger.oas.models.media.Schema schema41 = schema38.minimum(bigDecimal40);
        io.swagger.oas.models.media.Schema schema42 = schema10.example((java.lang.Object) schema38);
        io.swagger.oas.models.media.XML xML43 = null;
        io.swagger.oas.models.media.Schema schema44 = schema42.xml(xML43);
        io.swagger.oas.models.media.Discriminator discriminator45 = null;
        schema44.setDiscriminator(discriminator45);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema44);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 100\n    minProperties: null\n    required: [no description]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = strSchema10.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema10.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray23 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        schema20.setRequired((java.util.List<java.lang.String>) strList24);
        java.util.List<java.lang.String> strList27 = schema20.getEnum();
        io.swagger.oas.models.media.Schema schema28 = strSchema0.addProperties("hi!", schema20);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema29 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema29.setType("hi!");
        java.util.List<java.lang.String> strList32 = strSchema29.getRequired();
        strSchema29.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int35 = strSchema29.getMinLength();
        io.swagger.oas.models.media.Schema schema37 = strSchema29.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema38 = schema20.additionalProperties((io.swagger.oas.models.media.Schema) strSchema29);
        java.lang.Integer int39 = schema20.getMaxProperties();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(strList32);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(int39);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        io.swagger.jaxrs2.OperationParser.COMPONENTS_REF = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.writeOnly((java.lang.Boolean) true);
        schema8.setExclusiveMaximum((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        strSchema0.setMaxLength((java.lang.Integer) 100);
        java.lang.String str7 = strSchema0.toString();
        io.swagger.oas.models.media.Schema schema9 = strSchema0.deprecated((java.lang.Boolean) true);
        strSchema0.setMinItems((java.lang.Integer) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str7, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema10 = schema8.uniqueItems((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal11 = null;
        schema8.setMaximum(bigDecimal11);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation7 = schema6.getExternalDocs();
        schema6.setUniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.type("");
        io.swagger.oas.models.media.Schema schema18 = strSchema10.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema10.addRequiredItem("");
        schema6.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema10);
        schema6.setMinLength((java.lang.Integer) 1);
        java.lang.Boolean boolean24 = schema6.getExclusiveMinimum();
        java.lang.String str25 = schema6.getTitle();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(externalDocumentation7);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.String str7 = strSchema0.getType();
        java.lang.String str8 = strSchema0.getTitle();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation12 = null;
        schema6.setExternalDocs(externalDocumentation12);
        io.swagger.oas.models.media.Schema schema15 = schema6.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema17 = schema15.uniqueItems((java.lang.Boolean) true);
        java.lang.String str18 = schema17.getPattern();
        io.swagger.oas.models.media.Discriminator discriminator19 = null;
        io.swagger.oas.models.media.Schema schema20 = schema17.discriminator(discriminator19);
        schema17.setExclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema24 = schema17.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema26 = schema24.minItems((java.lang.Integer) 1);
        io.swagger.oas.models.media.Discriminator discriminator27 = schema26.getDiscriminator();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(discriminator27);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        strSchema0.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        io.swagger.oas.models.media.Schema schema10 = strSchema6.maxLength((java.lang.Integer) 1);
        schema10.setPattern("");
        io.swagger.oas.models.media.Schema schema14 = schema10.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray18 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        schema14.setEnum((java.util.List<java.lang.String>) strList19);
        strSchema0.setEnum((java.util.List<java.lang.String>) strList19);
        strSchema0.addEnumItemObject("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema26 = strSchema0.format("*/*");
        java.lang.Boolean boolean27 = schema26.getDeprecated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertEquals("'" + boolean27 + "' != '" + true + "'", boolean27, true);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        io.swagger.jaxrs2.OperationParser.DEFAULT_DESCRIPTION = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema schema15 = strSchema9.type("");
        io.swagger.oas.models.media.Schema schema17 = schema15.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema18 = schema8.not(schema15);
        java.lang.Integer int19 = schema15.getMaxItems();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = schema15.getExtensions();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(strMap20);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        strSchema7.setName("no description");
        io.swagger.oas.models.media.Schema schema13 = strSchema7.type("");
        io.swagger.oas.models.media.Schema schema14 = strSchema0.not((io.swagger.oas.models.media.Schema) strSchema7);
        strSchema7.addEnumItemObject("default");
        strSchema7.setMinProperties((java.lang.Integer) 1);
        java.lang.String str19 = strSchema7.getName();
        java.lang.Object obj20 = strSchema7.getExample();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "no description" + "'", str19, "no description");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        io.swagger.oas.models.media.Schema schema5 = strSchema0.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str7 = strSchema6.getTitle();
        io.swagger.oas.models.media.Schema schema9 = strSchema6.format("");
        io.swagger.oas.models.media.Schema schema11 = strSchema6.exclusiveMaximum((java.lang.Boolean) true);
        strSchema0.setExample((java.lang.Object) true);
        io.swagger.oas.models.media.Schema schema14 = strSchema0.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean15 = strSchema0.getUniqueItems();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.String str7 = strSchema0.getPattern();
        strSchema0.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema11 = strSchema0.exclusiveMinimum((java.lang.Boolean) true);
        schema11.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema15 = schema11.type("*/*");
        java.lang.String str16 = schema11.getName();
        io.swagger.oas.models.media.Schema schema18 = schema11.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema18.setTitle("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: []\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(schema18);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema7 = strSchema0.type("*/*");
        java.math.BigDecimal bigDecimal8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema7.minimum(bigDecimal8);
        java.lang.Class<?> wildcardClass10 = schema9.getClass();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.String str7 = strSchema0.getPattern();
        strSchema0.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema11 = strSchema0.exclusiveMinimum((java.lang.Boolean) true);
        schema11.setReadOnly((java.lang.Boolean) true);
        schema11.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        java.lang.Boolean boolean20 = strSchema17.getWriteOnly();
        strSchema17.setMaxItems((java.lang.Integer) 10);
        strSchema17.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean25 = strSchema17.getExclusiveMaximum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation26 = null;
        io.swagger.oas.models.media.Schema schema27 = strSchema17.externalDocs(externalDocumentation26);
        schema11.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) strSchema17);
        io.swagger.oas.models.media.Schema schema30 = schema11.description("default");
        io.swagger.oas.models.media.Schema schema32 = schema11.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Discriminator discriminator33 = schema32.getDiscriminator();
        io.swagger.oas.models.media.Schema schema35 = schema32.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 10\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.math.BigDecimal bigDecimal36 = schema35.getMultipleOf();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(discriminator33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNull(bigDecimal36);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema10 = schema6.addRequiredItem("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        java.lang.Boolean boolean14 = strSchema11.getWriteOnly();
        io.swagger.oas.models.media.Schema schema16 = strSchema11.type("default");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap17 = strSchema11.getProperties();
        schema10.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema11);
        strSchema11.setMinLength((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema22 = strSchema11.pattern("#/components/schemas/default");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap23 = null;
        schema22.setProperties(strMap23);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNotNull(schema22);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        java.lang.String str7 = strSchema0.get$ref();
        java.lang.String str8 = strSchema0.getPattern();
        java.lang.Integer int9 = strSchema0.getMinLength();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int5 = strSchema0.getMinLength();
        java.lang.Integer int6 = strSchema0.getMaxLength();
        java.lang.Integer int7 = strSchema0.getMinProperties();
        strSchema0.setUniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation10 = null;
        strSchema0.setExternalDocs(externalDocumentation10);
        io.swagger.oas.models.media.Schema schema13 = strSchema0.deprecated((java.lang.Boolean) false);
        schema13.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: []\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        schema4.setPattern("");
        io.swagger.oas.models.media.Schema schema8 = schema4.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema10 = schema4.minItems((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema4.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        strSchema13.setName("no description");
        io.swagger.oas.models.media.Schema schema19 = strSchema13.type("");
        java.lang.Integer int20 = schema19.getMaxProperties();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap21 = null;
        io.swagger.oas.models.media.Schema schema22 = schema19.properties(strMap21);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        java.util.List<java.lang.String> strList26 = strSchema23.getRequired();
        strSchema23.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int29 = strSchema23.getMinLength();
        java.lang.String str30 = strSchema23.get$ref();
        io.swagger.oas.models.media.Schema schema32 = strSchema23.name("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation33 = schema32.getExternalDocs();
        io.swagger.oas.models.media.Schema schema34 = schema22.not(schema32);
        java.lang.Object obj35 = schema32.getExample();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation36 = null;
        io.swagger.oas.models.media.Schema schema37 = schema32.externalDocs(externalDocumentation36);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema38 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema38.setType("hi!");
        io.swagger.oas.models.media.Schema schema42 = strSchema38.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema44 = strSchema38.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema45 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema45.setType("hi!");
        java.util.List<java.lang.String> strList48 = strSchema45.getRequired();
        strSchema45.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema52 = strSchema45.title("no description");
        java.lang.String str53 = schema52.getDescription();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation54 = null;
        io.swagger.oas.models.media.Schema schema55 = schema52.externalDocs(externalDocumentation54);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema56 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str57 = strSchema56.getTitle();
        io.swagger.oas.models.media.Schema schema59 = strSchema56.format("");
        strSchema56.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema62 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema62.setType("hi!");
        io.swagger.oas.models.media.Schema schema66 = strSchema62.maxLength((java.lang.Integer) 1);
        schema66.setPattern("");
        io.swagger.oas.models.media.Schema schema70 = schema66.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray74 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        schema70.setEnum((java.util.List<java.lang.String>) strList75);
        strSchema56.setEnum((java.util.List<java.lang.String>) strList75);
        schema55.setRequired((java.util.List<java.lang.String>) strList75);
        schema44.setRequired((java.util.List<java.lang.String>) strList75);
        schema32.setRequired((java.util.List<java.lang.String>) strList75);
        io.swagger.oas.models.media.Schema schema82 = schema12.required((java.util.List<java.lang.String>) strList75);
        schema82.setNullable((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(strList26);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(externalDocumentation33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(strList48);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(schema82);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.minimum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema13.title("no description");
        java.lang.String str21 = schema20.getDescription();
        boolean boolean22 = schema12.equals((java.lang.Object) schema20);
        java.lang.Boolean boolean23 = schema20.getExclusiveMaximum();
        schema20.setType("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema27 = schema20.readOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema28 = schema27.getNot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int29 = schema28.getMaxProperties();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(schema28);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        schema3.setMinItems((java.lang.Integer) 0);
        schema3.setMinProperties((java.lang.Integer) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
    }
}

