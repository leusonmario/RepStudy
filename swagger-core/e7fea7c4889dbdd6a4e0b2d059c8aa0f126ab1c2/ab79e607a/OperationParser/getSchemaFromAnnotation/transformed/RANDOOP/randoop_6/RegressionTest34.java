import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest34 {

    public static boolean debug = false;

    @Test
    public void test17001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17001");
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
        java.lang.String str51 = schema50.getFormat();
        io.swagger.oas.models.media.Schema schema52 = schema50.getAdditionalProperties();
        schema50.setType("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.math.BigDecimal bigDecimal55 = null;
        io.swagger.oas.models.media.Schema schema56 = schema50.maximum(bigDecimal55);
        schema56.setWriteOnly((java.lang.Boolean) false);
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
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(schema52);
        org.junit.Assert.assertNotNull(schema56);
    }

    @Test
    public void test17002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17002");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.addRequiredItem("");
        io.swagger.oas.models.media.Schema schema7 = strSchema0.getAdditionalProperties();
        io.swagger.oas.models.media.Schema schema9 = strSchema0.maxProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema15.setType("hi!");
        strSchema15.setName("no description");
        strSchema10.setNot((io.swagger.oas.models.media.Schema) strSchema15);
        java.math.BigDecimal bigDecimal21 = null;
        io.swagger.oas.models.media.Schema schema22 = strSchema10.minimum(bigDecimal21);
        schema22.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema25 = schema9.additionalProperties(schema22);
        io.swagger.oas.models.media.Schema schema27 = schema25.title("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: false\n    maxLength: 1\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 100\n    minProperties: null\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: #/components/schemas/default\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: 0\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema29 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema29.setType("hi!");
        strSchema29.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap34 = null;
        io.swagger.oas.models.media.Schema schema35 = strSchema29.properties(strMap34);
        java.lang.Integer int36 = schema35.getMaxProperties();
        io.swagger.oas.models.media.Schema schema38 = schema35.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema40 = schema35.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema42 = schema35.exclusiveMaximum((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap43 = schema35.getProperties();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema44 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema44.setType("hi!");
        strSchema44.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap49 = null;
        io.swagger.oas.models.media.Schema schema50 = strSchema44.properties(strMap49);
        strSchema44.setMaxLength((java.lang.Integer) 0);
        java.lang.Integer int53 = strSchema44.getMaxProperties();
        io.swagger.oas.models.media.Schema schema55 = strSchema44.description("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema56 = schema35.additionalProperties((io.swagger.oas.models.media.Schema) strSchema44);
        io.swagger.oas.models.media.Schema schema57 = schema27.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 10\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema56);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNull(strMap43);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNull(int53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema57);
    }

    @Test
    public void test17003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17003");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.discriminator(discriminator8);
        schema9.setMaxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema13 = schema9.title("");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str16 = strSchema15.getTitle();
        io.swagger.oas.models.media.Schema schema18 = strSchema15.format("");
        strSchema15.setDeprecated((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = strSchema15.getExtensions();
        java.lang.Integer int22 = strSchema15.getMinItems();
        strSchema15.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema25 = schema9.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (io.swagger.oas.models.media.Schema) strSchema15);
        strSchema15.setPattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema28 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema28.setType("hi!");
        io.swagger.oas.models.media.Schema schema32 = strSchema28.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema34 = schema32.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean35 = schema34.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator36 = null;
        io.swagger.oas.models.media.Schema schema37 = schema34.discriminator(discriminator36);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation38 = null;
        schema37.setExternalDocs(externalDocumentation38);
        schema37.setType("");
        io.swagger.oas.models.media.Schema schema43 = schema37.maxProperties((java.lang.Integer) 0);
        schema37.setDeprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema47 = schema37.deprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema49 = schema47.minProperties((java.lang.Integer) 10);
        strSchema15.setAdditionalProperties(schema47);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema49);
    }

    @Test
    public void test17004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17004");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema8 = schema6.exclusiveMaximum((java.lang.Boolean) false);
        schema6.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema12 = schema6.maxProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int19 = strSchema13.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema20 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema20.setType("hi!");
        strSchema20.setName("no description");
        io.swagger.oas.models.media.Schema schema26 = strSchema20.type("");
        io.swagger.oas.models.media.Schema schema27 = strSchema13.not((io.swagger.oas.models.media.Schema) strSchema20);
        java.lang.Boolean boolean28 = strSchema13.getUniqueItems();
        java.lang.Boolean boolean29 = strSchema13.getNullable();
        io.swagger.oas.models.media.Schema schema31 = strSchema13.uniqueItems((java.lang.Boolean) false);
        strSchema13.setMinItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema34 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema34.setType("hi!");
        strSchema34.setName("no description");
        io.swagger.oas.models.media.Schema schema40 = strSchema34.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation41 = schema40.getExternalDocs();
        io.swagger.oas.models.media.Schema schema43 = schema40.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema45 = schema40.type("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema46 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema46.setType("hi!");
        java.lang.Boolean boolean49 = strSchema46.getDeprecated();
        boolean boolean51 = strSchema46.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal52 = null;
        io.swagger.oas.models.media.Schema schema53 = strSchema46.multipleOf(bigDecimal52);
        io.swagger.oas.models.media.Schema schema55 = strSchema46.deprecated((java.lang.Boolean) false);
        boolean boolean56 = schema40.equals((java.lang.Object) schema55);
        java.math.BigDecimal bigDecimal57 = null;
        io.swagger.oas.models.media.Schema schema58 = schema40.maximum(bigDecimal57);
        io.swagger.oas.models.media.Schema schema60 = schema58.nullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema61 = strSchema13.not(schema58);
        schema12.setDefault((java.lang.Object) strSchema13);
        java.lang.Integer int63 = schema12.getMinItems();
        java.math.BigDecimal bigDecimal64 = null;
        io.swagger.oas.models.media.Schema schema65 = schema12.maximum(bigDecimal64);
        java.lang.String str66 = schema65.getName();
        schema65.setMaxItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema70 = schema65.minProperties((java.lang.Integer) 10);
        java.lang.Boolean boolean71 = schema70.getUniqueItems();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(externalDocumentation41);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNull(boolean49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNull(int63);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertEquals("'" + boolean71 + "' != '" + true + "'", boolean71, true);
    }

    @Test
    public void test17005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17005");
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
        io.swagger.oas.models.media.Schema schema28 = schema24.minProperties((java.lang.Integer) 10);
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
    public void test17006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17006");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema8 = schema6.exclusiveMaximum((java.lang.Boolean) false);
        schema6.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema12 = schema6.maxProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int19 = strSchema13.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema20 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema20.setType("hi!");
        strSchema20.setName("no description");
        io.swagger.oas.models.media.Schema schema26 = strSchema20.type("");
        io.swagger.oas.models.media.Schema schema27 = strSchema13.not((io.swagger.oas.models.media.Schema) strSchema20);
        java.lang.Boolean boolean28 = strSchema13.getUniqueItems();
        java.lang.Boolean boolean29 = strSchema13.getNullable();
        io.swagger.oas.models.media.Schema schema31 = strSchema13.uniqueItems((java.lang.Boolean) false);
        strSchema13.setMinItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema34 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema34.setType("hi!");
        strSchema34.setName("no description");
        io.swagger.oas.models.media.Schema schema40 = strSchema34.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation41 = schema40.getExternalDocs();
        io.swagger.oas.models.media.Schema schema43 = schema40.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema45 = schema40.type("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema46 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema46.setType("hi!");
        java.lang.Boolean boolean49 = strSchema46.getDeprecated();
        boolean boolean51 = strSchema46.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal52 = null;
        io.swagger.oas.models.media.Schema schema53 = strSchema46.multipleOf(bigDecimal52);
        io.swagger.oas.models.media.Schema schema55 = strSchema46.deprecated((java.lang.Boolean) false);
        boolean boolean56 = schema40.equals((java.lang.Object) schema55);
        java.math.BigDecimal bigDecimal57 = null;
        io.swagger.oas.models.media.Schema schema58 = schema40.maximum(bigDecimal57);
        io.swagger.oas.models.media.Schema schema60 = schema58.nullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema61 = strSchema13.not(schema58);
        schema12.setDefault((java.lang.Object) strSchema13);
        java.lang.String str63 = schema12.toString();
        io.swagger.oas.models.media.XML xML64 = null;
        io.swagger.oas.models.media.Schema schema65 = schema12.xml(xML64);
        java.lang.Boolean boolean66 = schema65.getDeprecated();
        io.swagger.oas.models.media.Schema schema68 = schema65.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(externalDocumentation41);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNull(boolean49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: true\n    maxProperties: 0\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str63, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: true\n    maxProperties: 0\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNull(boolean66);
        org.junit.Assert.assertNotNull(schema68);
    }

    @Test
    public void test17007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17007");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        strSchema0.setMaxLength((java.lang.Integer) 100);
        java.lang.String str7 = strSchema0.toString();
        io.swagger.oas.models.media.Schema schema9 = strSchema0.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation10 = null;
        io.swagger.oas.models.media.Schema schema11 = schema9.externalDocs(externalDocumentation10);
        io.swagger.oas.models.media.Discriminator discriminator12 = null;
        schema9.setDiscriminator(discriminator12);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap19 = null;
        io.swagger.oas.models.media.Schema schema20 = strSchema14.properties(strMap19);
        java.lang.Boolean boolean21 = strSchema14.getDeprecated();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        io.swagger.oas.models.media.Schema schema26 = strSchema22.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema28 = schema26.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean29 = schema28.getExclusiveMaximum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation30 = schema28.getExternalDocs();
        java.math.BigDecimal bigDecimal31 = schema28.getMaximum();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema33 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema33.setType("hi!");
        strSchema33.setName("no description");
        io.swagger.oas.models.media.Schema schema39 = strSchema33.addRequiredItem("*/*");
        io.swagger.oas.models.media.Schema schema40 = schema28.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (io.swagger.oas.models.media.Schema) strSchema33);
        io.swagger.oas.models.media.Schema schema42 = schema40.pattern("no description");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap43 = schema42.getProperties();
        io.swagger.oas.models.media.Schema schema44 = strSchema14.properties(strMap43);
        io.swagger.oas.models.media.Schema schema45 = schema9.properties(strMap43);
        io.swagger.oas.models.media.Discriminator discriminator46 = null;
        io.swagger.oas.models.media.Schema schema47 = schema9.discriminator(discriminator46);
        java.math.BigDecimal bigDecimal48 = null;
        io.swagger.oas.models.media.Schema schema49 = schema9.minimum(bigDecimal48);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str7, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertNull(externalDocumentation30);
        org.junit.Assert.assertNull(bigDecimal31);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema49);
    }

    @Test
    public void test17008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17008");
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
        java.lang.Integer int24 = schema23.getMinLength();
        io.swagger.oas.models.media.Schema schema26 = schema23.minProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema27 = schema26.getNot();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation28 = null;
        io.swagger.oas.models.media.Schema schema29 = schema26.externalDocs(externalDocumentation28);
        io.swagger.oas.models.media.Schema schema31 = schema26.maxLength((java.lang.Integer) 10);
        java.util.List<java.lang.String> strList32 = schema26.getEnum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(schema27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNull(strList32);
    }

    @Test
    public void test17009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17009");
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
        io.swagger.oas.models.media.Schema schema18 = strSchema7.addRequiredItem("");
        io.swagger.oas.models.media.Schema schema20 = strSchema7.minProperties((java.lang.Integer) 100);
        java.lang.String str21 = strSchema7.getFormat();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        java.lang.Boolean boolean25 = strSchema22.getWriteOnly();
        io.swagger.oas.models.media.Schema schema27 = strSchema22.type("default");
        io.swagger.oas.models.media.Schema schema28 = strSchema7.not((io.swagger.oas.models.media.Schema) strSchema22);
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema44 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema44.setType("hi!");
        strSchema44.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema49 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema49.setType("hi!");
        strSchema49.setName("no description");
        strSchema44.setNot((io.swagger.oas.models.media.Schema) strSchema49);
        strSchema44.setMinProperties((java.lang.Integer) 10);
        strSchema44.setReadOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap59 = strSchema44.getExtensions();
        strSchema44.setType("no description");
        schema43.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema44);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap63 = null;
        schema43.setProperties(strMap63);
        java.math.BigDecimal bigDecimal65 = null;
        schema43.setMultipleOf(bigDecimal65);
        io.swagger.oas.models.media.Schema schema68 = schema43.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema69 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema69.setType("hi!");
        strSchema69.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap74 = null;
        io.swagger.oas.models.media.Schema schema75 = strSchema69.properties(strMap74);
        java.lang.Integer int76 = schema75.getMaxProperties();
        schema75.setMinLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation79 = null;
        io.swagger.oas.models.media.Schema schema80 = schema75.externalDocs(externalDocumentation79);
        java.math.BigDecimal bigDecimal81 = null;
        io.swagger.oas.models.media.Schema schema82 = schema75.multipleOf(bigDecimal81);
        schema68.setNot(schema75);
        io.swagger.oas.models.media.Schema schema85 = schema75.maxItems((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema86 = strSchema22.example((java.lang.Object) schema85);
        schema86.setWriteOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema90 = schema86.minItems((java.lang.Integer) (-1));
        schema90.addEnumItemObject("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 10\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(strList32);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNull(strMap59);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNull(int76);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNotNull(schema85);
        org.junit.Assert.assertNotNull(schema86);
        org.junit.Assert.assertNotNull(schema90);
    }

    @Test
    public void test17010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17010");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxItems((java.lang.Integer) 100);
        schema8.setNullable((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema12 = schema8.minLength((java.lang.Integer) 100);
        java.lang.String str13 = schema8.getDescription();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17011");
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
        java.lang.String str31 = schema5.getPattern();
        schema5.setExclusiveMaximum((java.lang.Boolean) true);
        schema5.setExclusiveMaximum((java.lang.Boolean) true);
        java.util.List<java.lang.String> strList36 = schema5.getEnum();
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(strList36);
    }

    @Test
    public void test17012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17012");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        strSchema0.setMaxLength((java.lang.Integer) 0);
        java.lang.Integer int9 = strSchema0.getMaxProperties();
        java.lang.String str10 = strSchema0.getType();
        strSchema0.setMaxItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema14 = strSchema0.type("*/*");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(schema14);
    }

    @Test
    public void test17013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17013");
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
        io.swagger.oas.models.media.Schema schema24 = schema22.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation25 = null;
        io.swagger.oas.models.media.Schema schema26 = schema22.externalDocs(externalDocumentation25);
        io.swagger.oas.models.media.Schema schema28 = schema26.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema30 = schema28.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Integer int31 = schema28.getMinProperties();
        java.lang.String str32 = schema28.getPattern();
        schema28.setMinProperties((java.lang.Integer) 10);
        schema28.setTitle("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str32, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
    }

    @Test
    public void test17014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17014");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        schema4.setWriteOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = schema4.maxProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema12 = schema10.maxLength((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal13 = null;
        io.swagger.oas.models.media.Schema schema14 = schema12.multipleOf(bigDecimal13);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema15.setType("hi!");
        strSchema15.setName("no description");
        io.swagger.oas.models.media.Schema schema21 = strSchema15.type("");
        java.lang.Integer int22 = schema21.getMaxProperties();
        java.math.BigDecimal bigDecimal23 = null;
        schema21.setMinimum(bigDecimal23);
        io.swagger.oas.models.media.Schema schema26 = schema21.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation27 = null;
        schema21.setExternalDocs(externalDocumentation27);
        io.swagger.oas.models.media.Schema schema30 = schema21.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema32 = schema30.uniqueItems((java.lang.Boolean) true);
        java.lang.String str33 = schema32.getPattern();
        io.swagger.oas.models.media.Discriminator discriminator34 = null;
        io.swagger.oas.models.media.Schema schema35 = schema32.discriminator(discriminator34);
        schema32.setExclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema39 = schema32.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema40 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema40.setType("hi!");
        java.lang.Boolean boolean43 = strSchema40.getWriteOnly();
        io.swagger.oas.models.media.Schema schema45 = strSchema40.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema46 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema46.setType("hi!");
        java.lang.Boolean boolean49 = strSchema46.getWriteOnly();
        io.swagger.oas.models.media.Schema schema51 = strSchema46.type("default");
        strSchema40.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema46);
        strSchema46.setExclusiveMinimum((java.lang.Boolean) false);
        strSchema46.setMinItems((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema57 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema57.setType("hi!");
        strSchema57.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean62 = strSchema57.getDeprecated();
        strSchema57.setMinProperties((java.lang.Integer) 100);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "hi!", "no description", "default" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        strSchema57.setRequired((java.util.List<java.lang.String>) strList70);
        strSchema46.setRequired((java.util.List<java.lang.String>) strList70);
        io.swagger.oas.models.media.Schema schema74 = schema32.required((java.util.List<java.lang.String>) strList70);
        schema12.setExample((java.lang.Object) schema32);
        java.lang.Boolean boolean76 = schema12.getWriteOnly();
        io.swagger.oas.models.media.Schema schema77 = schema12.getNot();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNull(boolean43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNull(boolean49);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNull(boolean62);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertEquals("'" + boolean76 + "' != '" + true + "'", boolean76, true);
        org.junit.Assert.assertNull(schema77);
    }

    @Test
    public void test17015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17015");
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        strSchema23.setName("no description");
        io.swagger.oas.models.media.Schema schema29 = strSchema23.type("");
        io.swagger.oas.models.media.Schema schema31 = strSchema23.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema33 = strSchema23.maxItems((java.lang.Integer) 100);
        java.lang.Integer int34 = strSchema23.getMaxProperties();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema35 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema35.setType("hi!");
        strSchema35.setName("no description");
        io.swagger.oas.models.media.Schema schema41 = strSchema35.type("");
        java.lang.Integer int42 = schema41.getMaxProperties();
        java.math.BigDecimal bigDecimal43 = null;
        schema41.setMinimum(bigDecimal43);
        io.swagger.oas.models.media.Schema schema46 = schema41.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation47 = null;
        schema41.setExternalDocs(externalDocumentation47);
        io.swagger.oas.models.media.Schema schema50 = schema41.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema52 = schema50.uniqueItems((java.lang.Boolean) true);
        boolean boolean53 = strSchema23.equals((java.lang.Object) schema52);
        io.swagger.oas.models.media.Schema schema54 = schema17.not((io.swagger.oas.models.media.Schema) strSchema23);
        io.swagger.oas.models.media.Schema schema56 = schema17.description("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: -1\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema58 = schema17.minLength((java.lang.Integer) (-1));
        schema58.setMaxProperties((java.lang.Integer) 100);
        java.lang.Integer int61 = schema58.getMinItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation62 = null;
        io.swagger.oas.models.media.Schema schema63 = schema58.externalDocs(externalDocumentation62);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(int42);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNull(int61);
        org.junit.Assert.assertNotNull(schema63);
    }

    @Test
    public void test17016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17016");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema7 = strSchema0.title("no description");
        io.swagger.oas.models.media.Schema schema9 = strSchema0.minProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema11 = schema9.example((java.lang.Object) (-1));
        io.swagger.oas.models.media.Schema schema13 = schema9.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Integer int14 = schema13.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema15.setType("hi!");
        strSchema15.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap20 = null;
        io.swagger.oas.models.media.Schema schema21 = strSchema15.properties(strMap20);
        strSchema15.setMaxLength((java.lang.Integer) 0);
        strSchema15.setName("hi!");
        io.swagger.oas.models.media.Schema schema27 = strSchema15.description("*/*");
        strSchema15.setWriteOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema31 = strSchema15.minLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema33 = strSchema15.$ref("");
        java.math.BigDecimal bigDecimal34 = null;
        schema33.setMaximum(bigDecimal34);
        java.lang.String str36 = schema33.getName();
        io.swagger.oas.models.media.Schema schema37 = schema13.additionalProperties(schema33);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema39 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema39.setType("hi!");
        strSchema39.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema44 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema44.setType("hi!");
        java.util.List<java.lang.String> strList47 = strSchema44.getRequired();
        strSchema44.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int50 = strSchema44.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema51 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema51.setType("hi!");
        strSchema51.setName("no description");
        io.swagger.oas.models.media.Schema schema57 = strSchema51.type("");
        io.swagger.oas.models.media.Schema schema58 = strSchema44.not((io.swagger.oas.models.media.Schema) strSchema51);
        strSchema39.setExample((java.lang.Object) schema58);
        strSchema39.setPattern("*/*");
        io.swagger.oas.models.media.Discriminator discriminator62 = null;
        io.swagger.oas.models.media.Schema schema63 = strSchema39.discriminator(discriminator62);
        io.swagger.oas.models.media.Schema schema65 = strSchema39.readOnly((java.lang.Boolean) false);
        schema65.setMinItems((java.lang.Integer) 1);
        java.lang.String str68 = schema65.get$ref();
        schema13.addExtension("class Schema {\n    title: \n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: hi!\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: \n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) schema65);
        java.lang.Boolean boolean70 = schema13.getUniqueItems();
        io.swagger.oas.models.media.Schema schema72 = schema13.readOnly((java.lang.Boolean) true);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNull(strList47);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(boolean70);
        org.junit.Assert.assertNotNull(schema72);
    }

    @Test
    public void test17017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17017");
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema25 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str26 = strSchema25.getTitle();
        io.swagger.oas.models.media.Schema schema28 = strSchema25.format("");
        io.swagger.oas.models.media.Schema schema30 = strSchema25.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema32 = strSchema25.description("*/*");
        boolean boolean33 = schema21.equals((java.lang.Object) "*/*");
        java.lang.Integer int34 = schema21.getMinLength();
        io.swagger.oas.models.media.Schema schema36 = schema21.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema37 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema37.setType("hi!");
        strSchema37.setName("no description");
        io.swagger.oas.models.media.Schema schema43 = strSchema37.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation44 = schema43.getExternalDocs();
        io.swagger.oas.models.media.Schema schema46 = schema43.minProperties((java.lang.Integer) (-1));
        java.lang.Boolean boolean47 = schema46.getReadOnly();
        io.swagger.oas.models.media.Discriminator discriminator48 = null;
        schema46.setDiscriminator(discriminator48);
        schema46.setExclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema53 = schema46.maxLength((java.lang.Integer) 10);
        schema36.setExample((java.lang.Object) schema53);
        io.swagger.oas.models.media.Schema schema56 = schema53.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 0\n    minProperties: -1\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNull(externalDocumentation44);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNull(boolean47);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema56);
    }

    @Test
    public void test17018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17018");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema7 = strSchema0.type("*/*");
        java.math.BigDecimal bigDecimal8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema7.minimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema9.addRequiredItem("default");
        io.swagger.oas.models.media.XML xML12 = null;
        schema11.setXml(xML12);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test17019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17019");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation5 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        java.util.List<java.lang.String> strList9 = strSchema6.getRequired();
        strSchema6.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int12 = strSchema6.getMinLength();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = strSchema6.getExtensions();
        java.lang.Boolean boolean14 = strSchema6.getUniqueItems();
        java.lang.Integer int15 = strSchema6.getMaxLength();
        io.swagger.oas.models.media.Schema schema16 = strSchema0.example((java.lang.Object) strSchema6);
        java.lang.Boolean boolean17 = schema16.getWriteOnly();
        io.swagger.oas.models.media.Schema schema19 = schema16.maxItems((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal20 = null;
        schema16.setMaximum(bigDecimal20);
        org.junit.Assert.assertNull(externalDocumentation5);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + true + "'", boolean17, true);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test17020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17020");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema13 = schema6.exclusiveMaximum((java.lang.Boolean) true);
        schema6.setFormat("");
        schema6.setMinItems((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal18 = schema6.getMaximum();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema19.setType("hi!");
        java.util.List<java.lang.String> strList22 = strSchema19.getRequired();
        strSchema19.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int25 = strSchema19.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema26 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema26.setType("hi!");
        strSchema26.setName("no description");
        io.swagger.oas.models.media.Schema schema32 = strSchema26.type("");
        io.swagger.oas.models.media.Schema schema33 = strSchema19.not((io.swagger.oas.models.media.Schema) strSchema26);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema34 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema34.setType("hi!");
        strSchema34.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema39 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema39.setType("hi!");
        strSchema39.setName("no description");
        strSchema34.setNot((io.swagger.oas.models.media.Schema) strSchema39);
        java.math.BigDecimal bigDecimal45 = null;
        io.swagger.oas.models.media.Schema schema46 = strSchema34.minimum(bigDecimal45);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema47 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema47.setType("hi!");
        strSchema47.setName("no description");
        io.swagger.oas.models.media.Schema schema53 = strSchema47.type("");
        io.swagger.oas.models.media.Schema schema55 = schema53.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema56 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema56.setType("hi!");
        strSchema56.setName("no description");
        io.swagger.oas.models.media.Schema schema62 = strSchema56.type("");
        io.swagger.oas.models.media.Schema schema64 = strSchema56.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema66 = strSchema56.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray69 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        schema66.setRequired((java.util.List<java.lang.String>) strList70);
        schema55.setRequired((java.util.List<java.lang.String>) strList70);
        io.swagger.oas.models.media.Schema schema74 = strSchema34.required((java.util.List<java.lang.String>) strList70);
        strSchema26.setEnum((java.util.List<java.lang.String>) strList70);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema76 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema76.setType("hi!");
        io.swagger.oas.models.media.Schema schema80 = strSchema76.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema82 = strSchema76.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Discriminator discriminator83 = strSchema76.getDiscriminator();
        io.swagger.oas.models.media.Schema schema84 = strSchema26.additionalProperties((io.swagger.oas.models.media.Schema) strSchema76);
        java.lang.Integer int85 = strSchema76.getMaxProperties();
        io.swagger.oas.models.media.Schema schema87 = strSchema76.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema87.setDeprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema90 = schema6.additionalProperties(schema87);
        io.swagger.oas.models.media.Schema schema92 = schema6.maxProperties((java.lang.Integer) 100);
        schema6.setExclusiveMinimum((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(bigDecimal18);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNull(discriminator83);
        org.junit.Assert.assertNotNull(schema84);
        org.junit.Assert.assertNull(int85);
        org.junit.Assert.assertNotNull(schema87);
        org.junit.Assert.assertNotNull(schema90);
        org.junit.Assert.assertNotNull(schema92);
    }

    @Test
    public void test17021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17021");
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
        io.swagger.oas.models.ExternalDocumentation externalDocumentation21 = null;
        io.swagger.oas.models.media.Schema schema22 = schema20.externalDocs(externalDocumentation21);
        java.lang.String str23 = schema22.getPattern();
        schema22.setMaxItems((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test17022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17022");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        io.swagger.oas.models.media.Discriminator discriminator7 = null;
        io.swagger.oas.models.media.Schema schema8 = strSchema0.discriminator(discriminator7);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap9 = null;
        strSchema0.setProperties(strMap9);
        io.swagger.oas.models.media.Discriminator discriminator11 = null;
        strSchema0.setDiscriminator(discriminator11);
        io.swagger.oas.models.media.Schema schema14 = strSchema0.minLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema16 = schema14.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str17 = schema14.getType();
        schema14.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test17023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17023");
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
        io.swagger.oas.models.media.Schema schema24 = schema6.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema26 = schema24.maxLength((java.lang.Integer) 10);
        java.lang.Integer int27 = schema24.getMinLength();
        io.swagger.oas.models.media.Schema schema29 = schema24.maxLength((java.lang.Integer) 10);
        schema29.setType("#/components/schemas/class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 0\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: -1\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema29.setMinItems((java.lang.Integer) 1);
        java.lang.String str34 = schema29.getDescription();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test17024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17024");
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema19.setType("hi!");
        strSchema19.setName("no description");
        io.swagger.oas.models.media.Schema schema25 = strSchema19.type("");
        io.swagger.oas.models.media.Schema schema27 = strSchema19.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema29 = strSchema19.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema30 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema30.setType("hi!");
        java.lang.Boolean boolean33 = strSchema30.getWriteOnly();
        io.swagger.oas.models.media.Schema schema35 = strSchema30.type("default");
        io.swagger.oas.models.media.Schema schema36 = strSchema19.not(schema35);
        io.swagger.oas.models.media.Schema schema38 = schema36.minItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema39 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema39.setType("hi!");
        strSchema39.setName("no description");
        io.swagger.oas.models.media.Schema schema45 = strSchema39.type("");
        java.lang.Integer int46 = schema45.getMaxProperties();
        java.math.BigDecimal bigDecimal47 = null;
        schema45.setMinimum(bigDecimal47);
        io.swagger.oas.models.media.Schema schema50 = schema45.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema52 = schema50.maxProperties((java.lang.Integer) (-1));
        schema38.setExample((java.lang.Object) schema50);
        java.math.BigDecimal bigDecimal54 = schema38.getMultipleOf();
        io.swagger.oas.models.media.Schema schema56 = schema38.title("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema58 = schema56.minItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema59 = schema16.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema58);
        java.lang.String str60 = schema58.getTitle();
        io.swagger.oas.models.media.Schema schema62 = schema58.uniqueItems((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(boolean33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNull(bigDecimal54);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str60, "class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema62);
    }

    @Test
    public void test17025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17025");
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
        io.swagger.oas.models.media.Schema schema19 = schema16.minItems((java.lang.Integer) (-1));
        java.lang.String str20 = schema16.getTitle();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test17026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17026");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema schema7 = schema5.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.XML xML8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema5.xml(xML8);
        io.swagger.oas.models.media.Schema schema11 = schema9.pattern("*/*");
        java.lang.Boolean boolean12 = schema11.getDeprecated();
        java.util.List<java.lang.String> strList13 = null;
        io.swagger.oas.models.media.Schema schema14 = schema11.required(strList13);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema15.setType("hi!");
        strSchema15.setName("no description");
        io.swagger.oas.models.media.Schema schema21 = strSchema15.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation22 = schema21.getExternalDocs();
        io.swagger.oas.models.media.Schema schema24 = schema21.minProperties((java.lang.Integer) (-1));
        schema21.setExclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema27 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema27.setType("hi!");
        strSchema27.setName("no description");
        io.swagger.oas.models.media.Schema schema33 = strSchema27.type("");
        io.swagger.oas.models.media.Schema schema35 = strSchema27.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema37 = strSchema27.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema38 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema38.setType("hi!");
        strSchema38.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean43 = strSchema38.getDeprecated();
        java.lang.String str44 = strSchema38.getDescription();
        io.swagger.oas.models.media.Schema schema46 = strSchema38.maxLength((java.lang.Integer) 0);
        java.lang.Integer int47 = strSchema38.getMaxItems();
        io.swagger.oas.models.media.Schema schema49 = strSchema38.format("");
        io.swagger.oas.models.media.Schema schema51 = strSchema38.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema51.setDeprecated((java.lang.Boolean) true);
        schema51.setExclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema56 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema56.setType("hi!");
        strSchema56.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap61 = null;
        io.swagger.oas.models.media.Schema schema62 = strSchema56.properties(strMap61);
        java.lang.Boolean boolean63 = strSchema56.getDeprecated();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema64 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema64.setType("hi!");
        io.swagger.oas.models.media.Schema schema68 = strSchema64.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema70 = schema68.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean71 = schema70.getExclusiveMaximum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation72 = schema70.getExternalDocs();
        java.math.BigDecimal bigDecimal73 = schema70.getMaximum();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema75 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema75.setType("hi!");
        strSchema75.setName("no description");
        io.swagger.oas.models.media.Schema schema81 = strSchema75.addRequiredItem("*/*");
        io.swagger.oas.models.media.Schema schema82 = schema70.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (io.swagger.oas.models.media.Schema) strSchema75);
        io.swagger.oas.models.media.Schema schema84 = schema82.pattern("no description");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap85 = schema84.getProperties();
        io.swagger.oas.models.media.Schema schema86 = strSchema56.properties(strMap85);
        io.swagger.oas.models.media.Schema schema87 = schema51.properties(strMap85);
        strSchema27.setProperties(strMap85);
        schema21.setProperties(strMap85);
        io.swagger.oas.models.media.Schema schema90 = schema11.properties(strMap85);
        java.util.List<java.lang.String> strList91 = schema11.getRequired();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(externalDocumentation22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNull(boolean43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNull(int47);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertNull(boolean63);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNull(boolean71);
        org.junit.Assert.assertNull(externalDocumentation72);
        org.junit.Assert.assertNull(bigDecimal73);
        org.junit.Assert.assertNotNull(schema81);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNotNull(schema84);
        org.junit.Assert.assertNotNull(strMap85);
        org.junit.Assert.assertNotNull(schema86);
        org.junit.Assert.assertNotNull(schema87);
        org.junit.Assert.assertNotNull(schema90);
        org.junit.Assert.assertNull(strList91);
    }

    @Test
    public void test17027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17027");
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
        strSchema15.setMinProperties((java.lang.Integer) 10);
        strSchema15.setReadOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = strSchema15.getExtensions();
        strSchema15.setType("no description");
        schema14.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema15);
        io.swagger.oas.models.media.Schema schema35 = strSchema15.uniqueItems((java.lang.Boolean) true);
        java.lang.Boolean boolean36 = strSchema15.getExclusiveMinimum();
        strSchema15.setUniqueItems((java.lang.Boolean) false);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNull(boolean36);
    }

    @Test
    public void test17028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17028");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        strSchema0.setDefault((java.lang.Object) (byte) 100);
        java.math.BigDecimal bigDecimal7 = null;
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maximum(bigDecimal7);
        java.math.BigDecimal bigDecimal9 = null;
        io.swagger.oas.models.media.Schema schema10 = strSchema0.minimum(bigDecimal9);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test17029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17029");
        io.swagger.oas.annotations.links.Link link0 = null;
        io.swagger.oas.annotations.links.Link[] linkArray1 = new io.swagger.oas.annotations.links.Link[] { link0 };
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap2 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap3 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap4 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap5 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap6 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap7 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap8 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap9 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap10 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap11 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap12 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap13 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap14 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap15 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap16 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap17 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        java.util.Map<java.lang.String, io.swagger.oas.models.links.Link> strMap18 = io.swagger.jaxrs2.OperationParser.getLinks(linkArray1);
        org.junit.Assert.assertNotNull(linkArray1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test17030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17030");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.addRequiredItem("");
        io.swagger.oas.models.media.Schema schema8 = schema6.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = schema6.nullable((java.lang.Boolean) true);
        java.lang.Integer int11 = schema10.getMaxItems();
        io.swagger.oas.models.media.Schema schema13 = schema10.title("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: -1\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema15 = schema10.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.math.BigDecimal bigDecimal16 = null;
        schema15.setMultipleOf(bigDecimal16);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test17031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17031");
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
        java.math.BigDecimal bigDecimal18 = null;
        schema16.setMultipleOf(bigDecimal18);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema20 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema20.setType("hi!");
        io.swagger.oas.models.media.Schema schema24 = strSchema20.maxLength((java.lang.Integer) 1);
        schema24.setPattern("");
        io.swagger.oas.models.media.Schema schema28 = schema24.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray32 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        schema28.setEnum((java.util.List<java.lang.String>) strList33);
        io.swagger.oas.models.media.Schema schema36 = schema16.required((java.util.List<java.lang.String>) strList33);
        schema36.set$ref("");
        schema36.setName("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: true\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Integer int41 = schema36.getMinItems();
        io.swagger.oas.models.media.Schema schema43 = schema36.deprecated((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertNotNull(schema43);
    }

    @Test
    public void test17032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17032");
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
        io.swagger.oas.models.media.XML xML25 = null;
        io.swagger.oas.models.media.Schema schema26 = schema6.xml(xML25);
        schema26.setMaxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema30 = schema26.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Discriminator discriminator31 = null;
        io.swagger.oas.models.media.Schema schema32 = schema30.discriminator(discriminator31);
        java.math.BigDecimal bigDecimal33 = null;
        io.swagger.oas.models.media.Schema schema34 = schema32.maximum(bigDecimal33);
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
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema34);
    }

    @Test
    public void test17033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17033");
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
        schema28.setTitle("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema28.setMinLength((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema34 = schema28.uniqueItems((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema34);
    }

    @Test
    public void test17034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17034");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        schema6.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema10 = schema6.example((java.lang.Object) '#');
        java.lang.Boolean boolean11 = schema6.getNullable();
        java.math.BigDecimal bigDecimal12 = schema6.getMaximum();
        java.lang.String str13 = schema6.getPattern();
        io.swagger.oas.models.media.Schema schema15 = schema6.exclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean16 = schema6.getUniqueItems();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test17035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17035");
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
        strSchema11.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int17 = strSchema11.getMinLength();
        java.lang.String str18 = strSchema11.get$ref();
        io.swagger.oas.models.media.Schema schema19 = strSchema0.additionalProperties((io.swagger.oas.models.media.Schema) strSchema11);
        io.swagger.oas.models.media.Schema schema21 = strSchema0.name("hi!");
        schema21.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema24 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema24.setType("hi!");
        strSchema24.setName("no description");
        io.swagger.oas.models.media.Schema schema30 = strSchema24.type("");
        io.swagger.oas.models.media.Schema schema32 = schema30.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema34 = schema30.nullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema36 = schema34.$ref("default");
        schema34.setDescription("default");
        java.lang.Object obj39 = schema34.getExample();
        io.swagger.oas.models.media.Schema schema40 = schema21.not(schema34);
        io.swagger.oas.models.media.Schema schema41 = schema40.getAdditionalProperties();
        schema41.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema45 = schema41.title("hi!");
        schema41.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 10\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema45);
    }

    @Test
    public void test17036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17036");
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
        io.swagger.oas.models.media.Schema schema22 = schema11.type("hi!");
        io.swagger.oas.models.media.Schema schema24 = schema11.addRequiredItem("*/*");
        io.swagger.oas.models.media.Schema schema26 = schema24.minItems((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema28 = schema26.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 10\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: true\n    maxProperties: null\n    minProperties: -1\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap29 = schema28.getProperties();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema30 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema30.setType("hi!");
        strSchema30.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema35 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema35.setType("hi!");
        strSchema35.setName("no description");
        strSchema30.setNot((io.swagger.oas.models.media.Schema) strSchema35);
        java.math.BigDecimal bigDecimal41 = null;
        io.swagger.oas.models.media.Schema schema42 = strSchema30.minimum(bigDecimal41);
        schema42.setDeprecated((java.lang.Boolean) true);
        schema42.setExclusiveMinimum((java.lang.Boolean) false);
        java.lang.Boolean boolean47 = schema42.getNullable();
        schema42.setNullable((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation50 = null;
        io.swagger.oas.models.media.Schema schema51 = schema42.externalDocs(externalDocumentation50);
        io.swagger.oas.models.media.Discriminator discriminator52 = null;
        io.swagger.oas.models.media.Schema schema53 = schema42.discriminator(discriminator52);
        io.swagger.oas.models.media.Schema schema55 = schema53.maxItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema56 = schema28.additionalProperties(schema53);
        java.math.BigDecimal bigDecimal57 = null;
        schema28.setMaximum(bigDecimal57);
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
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(strMap29);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNull(boolean47);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema56);
    }

    @Test
    public void test17037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17037");
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
        io.swagger.oas.models.media.Schema schema23 = schema21.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema23.setMaxItems((java.lang.Integer) 10);
        java.lang.Boolean boolean26 = schema23.getExclusiveMaximum();
        schema23.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema29 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema29.setType("hi!");
        io.swagger.oas.models.media.Schema schema33 = strSchema29.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema35 = schema33.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean36 = schema35.getExclusiveMaximum();
        schema35.setType("no description");
        io.swagger.oas.models.media.Schema schema40 = schema35.exclusiveMaximum((java.lang.Boolean) true);
        schema35.setNullable((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema44 = schema35.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema46 = schema35.minProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema47 = schema23.additionalProperties(schema46);
        java.math.BigDecimal bigDecimal48 = null;
        schema47.setMinimum(bigDecimal48);
        io.swagger.oas.models.media.Schema schema51 = schema47.minProperties((java.lang.Integer) 10);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema51);
    }

    @Test
    public void test17038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17038");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getDeprecated();
        boolean boolean5 = strSchema0.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal6 = null;
        io.swagger.oas.models.media.Schema schema7 = strSchema0.multipleOf(bigDecimal6);
        io.swagger.oas.models.media.Schema schema9 = strSchema0.deprecated((java.lang.Boolean) false);
        strSchema0.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        strSchema0.addEnumItemObject("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        io.swagger.oas.models.media.Schema schema20 = strSchema14.type("");
        java.lang.Integer int21 = schema20.getMaxProperties();
        java.math.BigDecimal bigDecimal22 = null;
        schema20.setMinimum(bigDecimal22);
        io.swagger.oas.models.media.Schema schema25 = schema20.maxLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal26 = schema20.getMinimum();
        io.swagger.oas.models.media.Schema schema28 = schema20.minProperties((java.lang.Integer) 1);
        java.math.BigDecimal bigDecimal29 = schema28.getMinimum();
        schema28.setDescription("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 0\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: -1\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema32 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema32.setType("hi!");
        java.util.List<java.lang.String> strList35 = strSchema32.getRequired();
        java.lang.Boolean boolean36 = strSchema32.getUniqueItems();
        strSchema32.setPattern("");
        java.lang.String str39 = strSchema32.getPattern();
        java.lang.String str40 = strSchema32.get$ref();
        strSchema32.setMaxItems((java.lang.Integer) (-1));
        schema28.setDefault((java.lang.Object) strSchema32);
        io.swagger.oas.models.media.Schema schema44 = strSchema0.not((io.swagger.oas.models.media.Schema) strSchema32);
        java.math.BigDecimal bigDecimal45 = null;
        strSchema0.setMinimum(bigDecimal45);
        io.swagger.oas.models.media.Schema schema48 = strSchema0.nullable((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(bigDecimal26);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(bigDecimal29);
        org.junit.Assert.assertNull(strList35);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema48);
    }

    @Test
    public void test17039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17039");
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
        java.math.BigDecimal bigDecimal38 = null;
        io.swagger.oas.models.media.Schema schema39 = schema8.maximum(bigDecimal38);
        schema39.setTitle("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: 100\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
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
        org.junit.Assert.assertNotNull(schema39);
    }

    @Test
    public void test17040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17040");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        java.lang.String str10 = schema6.getType();
        io.swagger.oas.models.media.Schema schema12 = schema6.maxLength((java.lang.Integer) 100);
        java.lang.Boolean boolean13 = schema12.getExclusiveMinimum();
        io.swagger.oas.models.media.Discriminator discriminator14 = null;
        io.swagger.oas.models.media.Schema schema15 = schema12.discriminator(discriminator14);
        java.lang.String str16 = schema15.getName();
        java.lang.String str17 = schema15.getPattern();
        io.swagger.oas.models.media.Schema schema19 = schema15.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema21 = schema19.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema23 = schema21.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: false\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 100\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema21.setPattern("class Schema {\n    title: no description\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
    }

    @Test
    public void test17041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17041");
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
        io.swagger.oas.models.media.Schema schema27 = schema22.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema29 = schema27.exclusiveMaximum((java.lang.Boolean) true);
        java.lang.String str30 = schema27.getPattern();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test17042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17042");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.addRequiredItem("*/*");
        io.swagger.oas.models.media.Schema schema8 = schema6.minItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema10 = schema6.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.XML xML11 = schema10.getXml();
        schema10.setExclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema14 = schema10.getAdditionalProperties();
        schema10.setExclusiveMinimum((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(xML11);
        org.junit.Assert.assertNull(schema14);
    }

    @Test
    public void test17043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17043");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema10 = schema6.addRequiredItem("no description");
        java.util.List<java.lang.String> strList11 = schema6.getEnum();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setName("no description");
        io.swagger.oas.models.media.Schema schema18 = strSchema12.addRequiredItem("*/*");
        io.swagger.oas.models.media.XML xML19 = null;
        schema18.setXml(xML19);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setName("no description");
        io.swagger.oas.models.media.Schema schema28 = strSchema22.type("");
        java.lang.Integer int29 = schema28.getMaxProperties();
        java.math.BigDecimal bigDecimal30 = null;
        schema28.setMinimum(bigDecimal30);
        io.swagger.oas.models.media.Schema schema33 = schema28.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation34 = null;
        schema28.setExternalDocs(externalDocumentation34);
        io.swagger.oas.models.media.Schema schema37 = schema28.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema38 = schema18.addProperties("default", schema37);
        java.math.BigDecimal bigDecimal39 = null;
        schema18.setMaximum(bigDecimal39);
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = schema18.getExtensions();
        io.swagger.oas.models.media.Discriminator discriminator42 = null;
        io.swagger.oas.models.media.Schema schema43 = schema18.discriminator(discriminator42);
        io.swagger.oas.models.media.Schema schema44 = schema6.not(schema18);
        io.swagger.oas.models.media.Schema schema46 = schema6.minItems((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(strMap41);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema46);
    }

    @Test
    public void test17044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17044");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.discriminator(discriminator8);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation10 = null;
        io.swagger.oas.models.media.Schema schema11 = schema6.externalDocs(externalDocumentation10);
        io.swagger.oas.models.media.Schema schema13 = schema6.maxProperties((java.lang.Integer) 100);
        java.lang.String str14 = schema13.getPattern();
        io.swagger.oas.models.media.Schema schema16 = schema13.writeOnly((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test17045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17045");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema schema7 = schema5.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.XML xML8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema5.xml(xML8);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap10 = null;
        schema5.setProperties(strMap10);
        java.lang.Boolean boolean12 = schema5.getWriteOnly();
        io.swagger.oas.models.media.Schema schema14 = schema5.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema5.setMinProperties((java.lang.Integer) 100);
        java.lang.Boolean boolean17 = schema5.getWriteOnly();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test17046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17046");
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
        io.swagger.oas.models.media.Schema schema20 = schema12.minLength((java.lang.Integer) 1);
        java.math.BigDecimal bigDecimal21 = schema12.getMaximum();
        io.swagger.oas.models.media.Discriminator discriminator22 = null;
        io.swagger.oas.models.media.Schema schema23 = schema12.discriminator(discriminator22);
        schema23.setDescription("");
        io.swagger.oas.models.media.Schema schema27 = schema23.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema23.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 10\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(bigDecimal21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema27);
    }

    @Test
    public void test17047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17047");
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
        io.swagger.oas.models.media.Schema schema22 = schema11.type("hi!");
        io.swagger.oas.models.media.Schema schema24 = schema11.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema26 = schema24.addRequiredItem("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema28 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean29 = strSchema28.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation30 = strSchema28.getExternalDocs();
        io.swagger.oas.models.media.Schema schema32 = strSchema28.description("");
        java.lang.Integer int33 = strSchema28.getMaxProperties();
        strSchema28.setType("default");
        java.math.BigDecimal bigDecimal36 = null;
        io.swagger.oas.models.media.Schema schema37 = strSchema28.minimum(bigDecimal36);
        strSchema28.setDeprecated((java.lang.Boolean) true);
        schema26.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema41 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema41.setType("hi!");
        io.swagger.oas.models.media.Schema schema45 = strSchema41.maxLength((java.lang.Integer) 1);
        schema45.setPattern("");
        io.swagger.oas.models.media.Schema schema49 = schema45.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema51 = schema49.minItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema53 = schema51.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema55 = schema53.description("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema56 = schema26.not(schema55);
        schema26.setPattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 10\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema26.setMinProperties((java.lang.Integer) 100);
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
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertNull(externalDocumentation30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema56);
    }

    @Test
    public void test17048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17048");
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
        io.swagger.oas.models.ExternalDocumentation externalDocumentation13 = schema8.getExternalDocs();
        java.lang.String str14 = schema8.getDescription();
        java.math.BigDecimal bigDecimal15 = schema8.getMinimum();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema16 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema16.setType("hi!");
        io.swagger.oas.models.media.Schema schema20 = strSchema16.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema22 = schema20.example((java.lang.Object) (short) 0);
        io.swagger.oas.models.media.Schema schema24 = schema22.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema26 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema26.setType("hi!");
        strSchema26.setName("no description");
        io.swagger.oas.models.media.Schema schema32 = strSchema26.type("");
        io.swagger.oas.models.media.Schema schema34 = strSchema26.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema36 = strSchema26.maxItems((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal37 = null;
        schema36.setMultipleOf(bigDecimal37);
        io.swagger.oas.models.media.Schema schema40 = schema36.maxItems((java.lang.Integer) 100);
        java.util.List<java.lang.String> strList41 = schema36.getRequired();
        io.swagger.oas.models.media.Schema schema43 = schema36.maxProperties((java.lang.Integer) 10);
        schema22.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) schema43);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema45 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema45.setType("hi!");
        strSchema45.setName("no description");
        io.swagger.oas.models.media.Schema schema51 = strSchema45.type("");
        io.swagger.oas.models.media.Schema schema53 = strSchema45.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema55 = strSchema45.maxItems((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal56 = null;
        schema55.setMultipleOf(bigDecimal56);
        io.swagger.oas.models.media.Schema schema59 = schema55.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema61 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema61.setType("hi!");
        strSchema61.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema66 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema66.setType("hi!");
        strSchema66.setName("no description");
        strSchema61.setNot((io.swagger.oas.models.media.Schema) strSchema66);
        java.math.BigDecimal bigDecimal72 = null;
        io.swagger.oas.models.media.Schema schema73 = strSchema61.minimum(bigDecimal72);
        java.math.BigDecimal bigDecimal74 = null;
        io.swagger.oas.models.media.Schema schema75 = schema73.multipleOf(bigDecimal74);
        io.swagger.oas.models.media.Schema schema76 = schema55.addProperties("no description", schema73);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation77 = null;
        io.swagger.oas.models.media.Schema schema78 = schema76.externalDocs(externalDocumentation77);
        schema43.setAdditionalProperties(schema78);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap80 = schema43.getProperties();
        java.lang.Integer int81 = schema43.getMaxLength();
        io.swagger.oas.models.media.Schema schema82 = schema8.not(schema43);
        java.lang.String str83 = schema8.getFormat();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNull(externalDocumentation13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(bigDecimal15);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(strList41);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema78);
        org.junit.Assert.assertNull(strMap80);
        org.junit.Assert.assertNull(int81);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNull(str83);
    }

    @Test
    public void test17049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17049");
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
        schema6.setMaxProperties((java.lang.Integer) (-1));
        schema6.setReadOnly((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal19 = null;
        io.swagger.oas.models.media.Schema schema20 = schema6.minimum(bigDecimal19);
        schema20.setMaxItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        io.swagger.oas.models.media.Schema schema27 = strSchema23.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema29 = schema27.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean30 = schema29.getExclusiveMaximum();
        io.swagger.oas.models.media.Schema schema32 = schema29.$ref("*/*");
        io.swagger.oas.models.media.Discriminator discriminator33 = null;
        io.swagger.oas.models.media.Schema schema34 = schema32.discriminator(discriminator33);
        io.swagger.oas.models.media.XML xML35 = null;
        io.swagger.oas.models.media.Schema schema36 = schema32.xml(xML35);
        schema32.setDescription("");
        io.swagger.oas.models.media.Schema schema40 = schema32.nullable((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema42 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema42.setType("hi!");
        strSchema42.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap47 = null;
        io.swagger.oas.models.media.Schema schema48 = strSchema42.properties(strMap47);
        java.lang.String str49 = strSchema42.getPattern();
        strSchema42.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema53 = strSchema42.exclusiveMinimum((java.lang.Boolean) true);
        schema53.setReadOnly((java.lang.Boolean) true);
        schema53.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema59 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema59.setType("hi!");
        java.lang.Boolean boolean62 = strSchema59.getWriteOnly();
        strSchema59.setMaxItems((java.lang.Integer) 10);
        strSchema59.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean67 = strSchema59.getExclusiveMaximum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation68 = null;
        io.swagger.oas.models.media.Schema schema69 = strSchema59.externalDocs(externalDocumentation68);
        schema53.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) strSchema59);
        io.swagger.oas.models.media.Schema schema72 = schema53.description("default");
        io.swagger.oas.models.media.Schema schema74 = schema53.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Discriminator discriminator75 = schema74.getDiscriminator();
        java.lang.Integer int76 = schema74.getMaxProperties();
        io.swagger.oas.models.media.Schema schema77 = schema32.addProperties("#/components/schemas/class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema74);
        io.swagger.oas.models.media.Schema schema78 = schema20.not(schema77);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNull(boolean62);
        org.junit.Assert.assertNull(boolean67);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNull(discriminator75);
        org.junit.Assert.assertNull(int76);
        org.junit.Assert.assertNotNull(schema77);
        org.junit.Assert.assertNotNull(schema78);
    }

    @Test
    public void test17050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17050");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        strSchema7.setName("no description");
        io.swagger.oas.models.media.Schema schema13 = strSchema7.type("");
        java.lang.Integer int14 = schema13.getMaxProperties();
        io.swagger.oas.models.media.Schema schema15 = schema13.getNot();
        schema6.setNot(schema13);
        java.lang.String str17 = schema6.getType();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(schema15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test17051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17051");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.XML xML5 = null;
        schema4.setXml(xML5);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        strSchema7.setName("no description");
        io.swagger.oas.models.media.Schema schema13 = strSchema7.type("");
        io.swagger.oas.models.media.Schema schema15 = strSchema7.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema17 = strSchema7.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray20 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        schema17.setRequired((java.util.List<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList24 = schema17.getEnum();
        schema17.setMinProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Discriminator discriminator27 = null;
        io.swagger.oas.models.media.Schema schema28 = schema17.discriminator(discriminator27);
        io.swagger.oas.models.media.Schema schema30 = schema17.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema31 = schema4.example((java.lang.Object) schema30);
        schema31.setExclusiveMinimum((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
    }

    @Test
    public void test17052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17052");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int5 = strSchema0.getMinLength();
        java.lang.Integer int6 = strSchema0.getMaxLength();
        java.math.BigDecimal bigDecimal7 = strSchema0.getMaximum();
        io.swagger.oas.models.media.Schema schema9 = strSchema0.name("no description");
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = strSchema0.getExtensions();
        io.swagger.oas.models.media.Schema schema12 = strSchema0.exclusiveMinimum((java.lang.Boolean) false);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test17053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17053");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        io.swagger.oas.models.media.Discriminator discriminator7 = null;
        io.swagger.oas.models.media.Schema schema8 = strSchema0.discriminator(discriminator7);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap9 = null;
        strSchema0.setProperties(strMap9);
        io.swagger.oas.models.media.Discriminator discriminator11 = null;
        strSchema0.setDiscriminator(discriminator11);
        java.lang.Boolean boolean13 = strSchema0.getExclusiveMaximum();
        java.lang.String str14 = strSchema0.getName();
        java.math.BigDecimal bigDecimal15 = null;
        io.swagger.oas.models.media.Schema schema16 = strSchema0.minimum(bigDecimal15);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        strSchema17.setName("no description");
        io.swagger.oas.models.media.Schema schema23 = strSchema17.type("");
        schema23.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema27 = schema23.example((java.lang.Object) '#');
        io.swagger.oas.models.ExternalDocumentation externalDocumentation28 = null;
        io.swagger.oas.models.media.Schema schema29 = schema27.externalDocs(externalDocumentation28);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema30 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema30.setType("hi!");
        java.util.List<java.lang.String> strList33 = strSchema30.getRequired();
        strSchema30.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema37 = strSchema30.title("no description");
        schema37.setUniqueItems((java.lang.Boolean) false);
        schema29.setDefault((java.lang.Object) false);
        io.swagger.oas.models.media.Schema schema41 = strSchema0.not(schema29);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema42 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema42.setType("hi!");
        java.lang.Boolean boolean45 = strSchema42.getWriteOnly();
        io.swagger.oas.models.media.Schema schema47 = strSchema42.type("default");
        java.lang.String str48 = schema47.getDescription();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema50 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema50.setType("hi!");
        strSchema50.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap55 = null;
        io.swagger.oas.models.media.Schema schema56 = strSchema50.properties(strMap55);
        io.swagger.oas.models.media.Schema schema58 = strSchema50.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema59 = schema47.addProperties("no description", schema58);
        schema58.setWriteOnly((java.lang.Boolean) false);
        java.lang.Boolean boolean62 = schema58.getExclusiveMinimum();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema63 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema63.setType("hi!");
        strSchema63.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema68 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema68.setType("hi!");
        java.util.List<java.lang.String> strList71 = strSchema68.getRequired();
        strSchema68.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int74 = strSchema68.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema75 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema75.setType("hi!");
        strSchema75.setName("no description");
        io.swagger.oas.models.media.Schema schema81 = strSchema75.type("");
        io.swagger.oas.models.media.Schema schema82 = strSchema68.not((io.swagger.oas.models.media.Schema) strSchema75);
        strSchema63.setExample((java.lang.Object) schema82);
        io.swagger.oas.models.media.Schema schema85 = schema82.maxProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema87 = schema85.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation88 = null;
        io.swagger.oas.models.media.Schema schema89 = schema85.externalDocs(externalDocumentation88);
        io.swagger.oas.models.media.Schema schema91 = schema89.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema93 = schema91.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Integer int94 = schema91.getMinProperties();
        io.swagger.oas.models.media.Discriminator discriminator95 = null;
        io.swagger.oas.models.media.Schema schema96 = schema91.discriminator(discriminator95);
        io.swagger.oas.models.media.Schema schema97 = schema58.example((java.lang.Object) schema91);
        schema29.setExample((java.lang.Object) schema58);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(strList33);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(boolean45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNull(boolean62);
        org.junit.Assert.assertNull(strList71);
        org.junit.Assert.assertNull(int74);
        org.junit.Assert.assertNotNull(schema81);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNotNull(schema85);
        org.junit.Assert.assertNotNull(schema87);
        org.junit.Assert.assertNotNull(schema89);
        org.junit.Assert.assertNotNull(schema91);
        org.junit.Assert.assertNotNull(schema93);
        org.junit.Assert.assertNull(int94);
        org.junit.Assert.assertNotNull(schema96);
        org.junit.Assert.assertNotNull(schema97);
    }

    @Test
    public void test17054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17054");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        java.lang.Integer int4 = strSchema0.getMinProperties();
        strSchema0.setExclusiveMinimum((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap7 = strSchema0.getProperties();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema8 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema8.setType("hi!");
        java.util.List<java.lang.String> strList11 = strSchema8.getRequired();
        strSchema8.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int14 = strSchema8.getMinLength();
        io.swagger.oas.models.media.Schema schema16 = strSchema8.maxItems((java.lang.Integer) 100);
        schema16.setDescription("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: false\n    xml: null\n}");
        strSchema0.setAdditionalProperties(schema16);
        schema16.setMaxItems((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test17055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17055");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        schema6.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema10 = schema6.example((java.lang.Object) '#');
        io.swagger.oas.models.ExternalDocumentation externalDocumentation11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema10.externalDocs(externalDocumentation11);
        java.lang.Boolean boolean13 = schema10.getUniqueItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap19 = null;
        io.swagger.oas.models.media.Schema schema20 = strSchema14.properties(strMap19);
        java.lang.Integer int21 = schema20.getMaxProperties();
        io.swagger.oas.models.media.Schema schema23 = schema20.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema25 = schema20.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema27 = schema20.nullable((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema29 = schema27.writeOnly((java.lang.Boolean) true);
        schema10.setAdditionalProperties(schema27);
        schema27.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: true\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema29);
    }

    @Test
    public void test17056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17056");
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema35 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema35.setType("hi!");
        strSchema35.setName("no description");
        io.swagger.oas.models.media.Schema schema41 = strSchema35.type("");
        io.swagger.oas.models.media.Schema schema43 = strSchema35.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema45 = strSchema35.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema46 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema46.setType("hi!");
        java.lang.Boolean boolean49 = strSchema46.getWriteOnly();
        io.swagger.oas.models.media.Schema schema51 = strSchema46.type("default");
        io.swagger.oas.models.media.Schema schema52 = strSchema35.not(schema51);
        java.math.BigDecimal bigDecimal53 = null;
        schema51.setMultipleOf(bigDecimal53);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema55 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema55.setType("hi!");
        io.swagger.oas.models.media.Schema schema59 = strSchema55.maxLength((java.lang.Integer) 1);
        schema59.setPattern("");
        io.swagger.oas.models.media.Schema schema63 = schema59.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray67 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        schema63.setEnum((java.util.List<java.lang.String>) strList68);
        io.swagger.oas.models.media.Schema schema71 = schema51.required((java.util.List<java.lang.String>) strList68);
        schema19.setEnum((java.util.List<java.lang.String>) strList68);
        java.lang.String str73 = schema19.getDescription();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema74 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema74.setType("hi!");
        strSchema74.setName("no description");
        io.swagger.oas.models.media.Schema schema80 = strSchema74.type("");
        io.swagger.oas.models.media.Schema schema82 = schema80.format("no description");
        io.swagger.oas.models.media.Schema schema84 = schema82.format("");
        io.swagger.oas.models.media.Schema schema86 = schema84.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema87 = schema19.additionalProperties(schema86);
        schema19.setDeprecated((java.lang.Boolean) true);
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
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNull(boolean49);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNotNull(schema84);
        org.junit.Assert.assertNotNull(schema86);
        org.junit.Assert.assertNotNull(schema87);
    }

    @Test
    public void test17057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17057");
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
        javax.ws.rs.Produces produces13 = null;
        javax.ws.rs.Produces produces14 = null;
        io.swagger.oas.models.Components components15 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional16 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces13, produces14, components15);
        io.swagger.oas.models.Components components17 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional18 = io.swagger.jaxrs2.OperationParser.getContents(contentArray0, components17);
        javax.ws.rs.Produces produces19 = null;
        javax.ws.rs.Produces produces20 = null;
        io.swagger.oas.models.Components components21 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional22 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces19, produces20, components21);
        javax.ws.rs.Produces produces23 = null;
        javax.ws.rs.Produces produces24 = null;
        io.swagger.oas.models.Components components25 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional26 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces23, produces24, components25);
        javax.ws.rs.Produces produces27 = null;
        javax.ws.rs.Produces produces28 = null;
        io.swagger.oas.models.Components components29 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional30 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces27, produces28, components29);
        javax.ws.rs.Produces produces31 = null;
        javax.ws.rs.Produces produces32 = null;
        io.swagger.oas.models.Components components33 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional34 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces31, produces32, components33);
        javax.ws.rs.Produces produces35 = null;
        javax.ws.rs.Produces produces36 = null;
        io.swagger.oas.models.Components components37 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional38 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces35, produces36, components37);
        io.swagger.oas.models.Components components39 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional40 = io.swagger.jaxrs2.OperationParser.getContents(contentArray0, components39);
        org.junit.Assert.assertNotNull(contentArray0);
        org.junit.Assert.assertNotNull(contentOptional4);
        org.junit.Assert.assertNotNull(contentOptional8);
        org.junit.Assert.assertNotNull(contentOptional12);
        org.junit.Assert.assertNotNull(contentOptional16);
        org.junit.Assert.assertNotNull(contentOptional18);
        org.junit.Assert.assertNotNull(contentOptional22);
        org.junit.Assert.assertNotNull(contentOptional26);
        org.junit.Assert.assertNotNull(contentOptional30);
        org.junit.Assert.assertNotNull(contentOptional34);
        org.junit.Assert.assertNotNull(contentOptional38);
        org.junit.Assert.assertNotNull(contentOptional40);
    }

    @Test
    public void test17058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17058");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxLength((java.lang.Integer) 0);
        schema8.setReadOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema12 = schema8.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean13 = schema12.getDeprecated();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap19 = null;
        io.swagger.oas.models.media.Schema schema20 = strSchema14.properties(strMap19);
        strSchema14.setMaxLength((java.lang.Integer) 0);
        strSchema14.setName("hi!");
        io.swagger.oas.models.media.Schema schema26 = strSchema14.description("*/*");
        strSchema14.setWriteOnly((java.lang.Boolean) true);
        java.lang.String str29 = strSchema14.getDefault();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema31 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema31.setType("hi!");
        java.lang.Boolean boolean34 = strSchema31.getDeprecated();
        io.swagger.oas.models.media.Schema schema36 = strSchema31.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema38 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema38.setType("hi!");
        strSchema38.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap43 = null;
        io.swagger.oas.models.media.Schema schema44 = strSchema38.properties(strMap43);
        java.lang.Integer int45 = schema44.getMaxProperties();
        io.swagger.oas.models.media.Schema schema47 = schema44.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema49 = schema44.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema50 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema50.setType("hi!");
        strSchema50.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int55 = strSchema50.getMinLength();
        java.lang.Integer int56 = strSchema50.getMaxLength();
        java.math.BigDecimal bigDecimal57 = strSchema50.getMaximum();
        io.swagger.oas.models.media.Schema schema58 = schema49.additionalProperties((io.swagger.oas.models.media.Schema) strSchema50);
        strSchema50.setType("");
        io.swagger.oas.models.media.Schema schema61 = schema36.addProperties("default", (io.swagger.oas.models.media.Schema) strSchema50);
        java.lang.String str62 = schema36.getPattern();
        schema36.setExclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema66 = schema36.minLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema67 = strSchema14.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 10\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema66);
        schema67.setName("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema70 = schema12.not(schema67);
        io.swagger.oas.models.media.Schema schema72 = schema67.description("default");
        schema67.setNullable((java.lang.Boolean) false);
        java.lang.String str75 = schema67.getName();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(boolean34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNull(int55);
        org.junit.Assert.assertNull(int56);
        org.junit.Assert.assertNull(bigDecimal57);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str75, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
    }

    @Test
    public void test17059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17059");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        schema6.setMinLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation10 = null;
        io.swagger.oas.models.media.Schema schema11 = schema6.externalDocs(externalDocumentation10);
        java.math.BigDecimal bigDecimal12 = null;
        io.swagger.oas.models.media.Schema schema13 = schema6.maximum(bigDecimal12);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        java.util.List<java.lang.String> strList17 = strSchema14.getRequired();
        strSchema14.setReadOnly((java.lang.Boolean) true);
        java.lang.Boolean boolean20 = strSchema14.getDeprecated();
        java.math.BigDecimal bigDecimal21 = strSchema14.getMultipleOf();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap27 = null;
        io.swagger.oas.models.media.Schema schema28 = strSchema22.properties(strMap27);
        java.lang.Integer int29 = schema28.getMaxProperties();
        io.swagger.oas.models.media.Schema schema31 = schema28.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema33 = schema28.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema34 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema34.setType("hi!");
        strSchema34.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int39 = strSchema34.getMinLength();
        java.lang.Integer int40 = strSchema34.getMaxLength();
        java.math.BigDecimal bigDecimal41 = strSchema34.getMaximum();
        io.swagger.oas.models.media.Schema schema42 = schema33.additionalProperties((io.swagger.oas.models.media.Schema) strSchema34);
        java.lang.Integer int43 = strSchema34.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema44 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema44.setType("hi!");
        strSchema44.setName("no description");
        io.swagger.oas.models.media.Schema schema50 = strSchema44.type("");
        io.swagger.oas.models.media.Schema schema52 = strSchema44.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema53 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema53.setType("hi!");
        strSchema53.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema58 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema58.setType("hi!");
        strSchema58.setName("no description");
        strSchema53.setNot((io.swagger.oas.models.media.Schema) strSchema58);
        java.math.BigDecimal bigDecimal64 = null;
        io.swagger.oas.models.media.Schema schema65 = strSchema53.minimum(bigDecimal64);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema66 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema66.setType("hi!");
        strSchema66.setName("no description");
        io.swagger.oas.models.media.Schema schema72 = strSchema66.type("");
        io.swagger.oas.models.media.Schema schema74 = schema72.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema75 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema75.setType("hi!");
        strSchema75.setName("no description");
        io.swagger.oas.models.media.Schema schema81 = strSchema75.type("");
        io.swagger.oas.models.media.Schema schema83 = strSchema75.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema85 = strSchema75.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray88 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList89 = new java.util.ArrayList<java.lang.String>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList89, strArray88);
        schema85.setRequired((java.util.List<java.lang.String>) strList89);
        schema74.setRequired((java.util.List<java.lang.String>) strList89);
        io.swagger.oas.models.media.Schema schema93 = strSchema53.required((java.util.List<java.lang.String>) strList89);
        strSchema44.setEnum((java.util.List<java.lang.String>) strList89);
        strSchema34.setEnum((java.util.List<java.lang.String>) strList89);
        io.swagger.oas.models.media.Schema schema96 = strSchema14.required((java.util.List<java.lang.String>) strList89);
        schema6.setEnum((java.util.List<java.lang.String>) strList89);
        java.lang.String str98 = schema6.getFormat();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNull(bigDecimal21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNull(int40);
        org.junit.Assert.assertNull(bigDecimal41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNull(int43);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(schema81);
        org.junit.Assert.assertNotNull(schema83);
        org.junit.Assert.assertNotNull(schema85);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(schema93);
        org.junit.Assert.assertNotNull(schema96);
        org.junit.Assert.assertNull(str98);
    }

    @Test
    public void test17060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17060");
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
        java.math.BigDecimal bigDecimal47 = null;
        io.swagger.oas.models.media.Schema schema48 = schema46.maximum(bigDecimal47);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation49 = null;
        io.swagger.oas.models.media.Schema schema50 = schema48.externalDocs(externalDocumentation49);
        schema50.setTitle("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: 10\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
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
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema50);
    }

    @Test
    public void test17061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17061");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        java.math.BigDecimal bigDecimal7 = null;
        strSchema0.setMinimum(bigDecimal7);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema12 = schema10.readOnly((java.lang.Boolean) true);
        java.lang.String str13 = schema12.toString();
        schema12.set$ref("hi!");
        io.swagger.oas.models.media.Schema schema17 = schema12.name("class Schema {\n    title: \n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: -1\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: false\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str18 = schema17.getPattern();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str13, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test17062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17062");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.XML xML5 = null;
        schema4.setXml(xML5);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        strSchema7.setName("no description");
        io.swagger.oas.models.media.Schema schema13 = strSchema7.type("");
        io.swagger.oas.models.media.Schema schema15 = strSchema7.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema17 = strSchema7.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray20 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        schema17.setRequired((java.util.List<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList24 = schema17.getEnum();
        schema17.setMinProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Discriminator discriminator27 = null;
        io.swagger.oas.models.media.Schema schema28 = schema17.discriminator(discriminator27);
        io.swagger.oas.models.media.Schema schema30 = schema17.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema31 = schema4.example((java.lang.Object) schema30);
        java.lang.Object obj32 = schema31.getExample();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 10\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 10\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 10\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
    }

    @Test
    public void test17063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17063");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema13 = schema6.nullable((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema15 = schema6.maxItems((java.lang.Integer) (-1));
        java.lang.Boolean boolean16 = schema15.getReadOnly();
        java.lang.String str17 = schema15.getTitle();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test17064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17064");
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
        java.lang.String str35 = schema34.getDescription();
        io.swagger.oas.models.media.Schema schema37 = schema34.name("#/components/schemas/no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema38 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema38.setType("hi!");
        strSchema38.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema43 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema43.setType("hi!");
        strSchema43.setName("no description");
        strSchema38.setNot((io.swagger.oas.models.media.Schema) strSchema43);
        java.math.BigDecimal bigDecimal49 = null;
        io.swagger.oas.models.media.Schema schema50 = strSchema38.minimum(bigDecimal49);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema51 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema51.setType("hi!");
        strSchema51.setName("no description");
        io.swagger.oas.models.media.Schema schema57 = strSchema51.type("");
        io.swagger.oas.models.media.Schema schema59 = schema57.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema60 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema60.setType("hi!");
        strSchema60.setName("no description");
        io.swagger.oas.models.media.Schema schema66 = strSchema60.type("");
        io.swagger.oas.models.media.Schema schema68 = strSchema60.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema70 = strSchema60.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray73 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        schema70.setRequired((java.util.List<java.lang.String>) strList74);
        schema59.setRequired((java.util.List<java.lang.String>) strList74);
        io.swagger.oas.models.media.Schema schema78 = strSchema38.required((java.util.List<java.lang.String>) strList74);
        java.lang.Integer int79 = strSchema38.getMaxProperties();
        java.util.List<java.lang.String> strList80 = strSchema38.getRequired();
        io.swagger.oas.models.media.Schema schema81 = schema37.required(strList80);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation82 = schema37.getExternalDocs();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema83 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema83.setType("hi!");
        strSchema83.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap88 = null;
        io.swagger.oas.models.media.Schema schema89 = strSchema83.properties(strMap88);
        io.swagger.oas.models.media.Discriminator discriminator90 = null;
        io.swagger.oas.models.media.Schema schema91 = strSchema83.discriminator(discriminator90);
        io.swagger.oas.models.media.Schema schema93 = strSchema83.format("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema95 = schema93.format("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean96 = schema93.getDeprecated();
        schema37.setExample((java.lang.Object) boolean96);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(schema78);
        org.junit.Assert.assertNull(int79);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertNotNull(schema81);
        org.junit.Assert.assertNull(externalDocumentation82);
        org.junit.Assert.assertNotNull(schema89);
        org.junit.Assert.assertNotNull(schema91);
        org.junit.Assert.assertNotNull(schema93);
        org.junit.Assert.assertNotNull(schema95);
        org.junit.Assert.assertNull(boolean96);
    }

    @Test
    public void test17065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17065");
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
        io.swagger.oas.models.media.Schema schema36 = schema21.readOnly((java.lang.Boolean) false);
        schema36.setMinProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema40 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema40.setType("hi!");
        java.util.List<java.lang.String> strList43 = strSchema40.getRequired();
        strSchema40.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int46 = strSchema40.getMinLength();
        java.math.BigDecimal bigDecimal47 = null;
        strSchema40.setMinimum(bigDecimal47);
        strSchema40.setMaxItems((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema51 = strSchema40.getAdditionalProperties();
        schema36.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) strSchema40);
        io.swagger.oas.models.media.Schema schema54 = strSchema40.format("");
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
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNull(strList43);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNull(schema51);
        org.junit.Assert.assertNotNull(schema54);
    }

    @Test
    public void test17066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17066");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.Schema schema9 = schema6.$ref("*/*");
        io.swagger.oas.models.media.Discriminator discriminator10 = null;
        io.swagger.oas.models.media.Schema schema11 = schema9.discriminator(discriminator10);
        io.swagger.oas.models.media.XML xML12 = null;
        io.swagger.oas.models.media.Schema schema13 = schema9.xml(xML12);
        io.swagger.oas.models.media.Schema schema15 = schema9.readOnly((java.lang.Boolean) true);
        java.lang.Boolean boolean16 = schema15.getWriteOnly();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test17067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17067");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxItems((java.lang.Integer) 100);
        java.lang.String str9 = strSchema0.getName();
        java.lang.Boolean boolean10 = strSchema0.getExclusiveMaximum();
        strSchema0.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test17068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17068");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.discriminator(discriminator8);
        io.swagger.oas.models.media.Schema schema11 = schema6.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema13 = schema11.readOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema15 = schema11.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: []\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: false\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema17 = schema11.exclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema19 = schema11.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test17069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17069");
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
        java.lang.Boolean boolean19 = schema18.getDeprecated();
        java.lang.Integer int20 = schema18.getMinItems();
        java.lang.String str21 = schema18.getTitle();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test17070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17070");
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
        schema20.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str24 = schema20.getDescription();
        java.util.List<java.lang.String> strList25 = schema20.getEnum();
        schema20.setTitle("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: false\n    maxLength: 1\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 100\n    minProperties: 10\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: 0\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str28 = schema20.getDescription();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema30 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema30.setType("hi!");
        java.lang.Boolean boolean33 = strSchema30.getDeprecated();
        io.swagger.oas.models.media.Schema schema35 = strSchema30.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema37 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema37.setType("hi!");
        strSchema37.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap42 = null;
        io.swagger.oas.models.media.Schema schema43 = strSchema37.properties(strMap42);
        java.lang.Integer int44 = schema43.getMaxProperties();
        io.swagger.oas.models.media.Schema schema46 = schema43.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema48 = schema43.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema49 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema49.setType("hi!");
        strSchema49.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int54 = strSchema49.getMinLength();
        java.lang.Integer int55 = strSchema49.getMaxLength();
        java.math.BigDecimal bigDecimal56 = strSchema49.getMaximum();
        io.swagger.oas.models.media.Schema schema57 = schema48.additionalProperties((io.swagger.oas.models.media.Schema) strSchema49);
        strSchema49.setType("");
        io.swagger.oas.models.media.Schema schema60 = schema35.addProperties("default", (io.swagger.oas.models.media.Schema) strSchema49);
        java.lang.String str61 = schema35.getPattern();
        schema35.setExclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema65 = schema35.minLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema67 = schema65.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema68 = schema20.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: true\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema67);
        java.lang.String str69 = schema68.getPattern();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "no description" + "'", str21, "no description");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(strList25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(boolean33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNull(int44);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNull(int54);
        org.junit.Assert.assertNull(int55);
        org.junit.Assert.assertNull(bigDecimal56);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test17071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17071");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.deprecated((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        schema5.setExtensions(strMap6);
        java.math.BigDecimal bigDecimal8 = schema5.getMultipleOf();
        java.math.BigDecimal bigDecimal9 = null;
        io.swagger.oas.models.media.Schema schema10 = schema5.minimum(bigDecimal9);
        io.swagger.oas.models.media.Schema schema12 = schema5.format("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test17072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17072");
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
        java.math.BigDecimal bigDecimal35 = schema10.getMultipleOf();
        io.swagger.oas.models.media.Schema schema37 = schema10.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema39 = schema10.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema40 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema40.setType("hi!");
        strSchema40.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap45 = null;
        io.swagger.oas.models.media.Schema schema46 = strSchema40.properties(strMap45);
        strSchema40.setMaxLength((java.lang.Integer) 0);
        strSchema40.setName("hi!");
        io.swagger.oas.models.media.Schema schema52 = strSchema40.description("*/*");
        java.util.List<java.lang.String> strList53 = strSchema40.getRequired();
        io.swagger.oas.models.media.Schema schema55 = strSchema40.pattern("");
        io.swagger.oas.models.media.Schema schema56 = schema10.not(schema55);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation57 = schema56.getExternalDocs();
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
        org.junit.Assert.assertNull(bigDecimal35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNull(strList53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNull(externalDocumentation57);
    }

    @Test
    public void test17073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17073");
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
        schema19.setTitle("*/*");
        io.swagger.oas.models.media.Schema schema23 = schema19.format("default");
        io.swagger.oas.models.media.Schema schema25 = schema19.deprecated((java.lang.Boolean) true);
        schema25.setReadOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema29 = schema25.minItems((java.lang.Integer) 0);
        schema29.setPattern("#/components/schemas/class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 0\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: -1\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema32 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema32.setType("hi!");
        strSchema32.setName("no description");
        io.swagger.oas.models.media.Schema schema38 = strSchema32.type("");
        io.swagger.oas.models.media.Schema schema40 = schema38.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int41 = schema40.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema42 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema42.setType("hi!");
        strSchema42.setName("no description");
        io.swagger.oas.models.media.Schema schema48 = strSchema42.type("");
        io.swagger.oas.models.media.Schema schema50 = schema48.format("no description");
        io.swagger.oas.models.media.Schema schema51 = schema40.not(schema50);
        java.math.BigDecimal bigDecimal52 = null;
        io.swagger.oas.models.media.Schema schema53 = schema50.multipleOf(bigDecimal52);
        java.lang.Boolean boolean54 = schema50.getNullable();
        schema50.setName("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Integer int57 = schema50.getMinProperties();
        boolean boolean58 = schema29.equals((java.lang.Object) schema50);
        io.swagger.oas.models.media.Schema schema60 = schema50.nullable((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal61 = null;
        schema50.setMaximum(bigDecimal61);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNull(boolean54);
        org.junit.Assert.assertNull(int57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(schema60);
    }

    @Test
    public void test17074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17074");
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
        io.swagger.oas.models.media.Schema schema28 = schema8.maxLength((java.lang.Integer) (-1));
        java.lang.String str29 = schema28.getPattern();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema30 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema30.setType("hi!");
        io.swagger.oas.models.media.Schema schema34 = strSchema30.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema36 = schema34.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean37 = schema36.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator38 = null;
        io.swagger.oas.models.media.Schema schema39 = schema36.discriminator(discriminator38);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation40 = null;
        io.swagger.oas.models.media.Schema schema41 = schema36.externalDocs(externalDocumentation40);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema42 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema42.setType("hi!");
        strSchema42.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap47 = null;
        io.swagger.oas.models.media.Schema schema48 = strSchema42.properties(strMap47);
        java.lang.Integer int49 = schema48.getMaxProperties();
        io.swagger.oas.models.media.Schema schema51 = schema48.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema53 = schema48.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema54 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema54.setType("hi!");
        strSchema54.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int59 = strSchema54.getMinLength();
        java.lang.Integer int60 = strSchema54.getMaxLength();
        java.math.BigDecimal bigDecimal61 = strSchema54.getMaximum();
        io.swagger.oas.models.media.Schema schema62 = schema53.additionalProperties((io.swagger.oas.models.media.Schema) strSchema54);
        io.swagger.oas.models.media.Schema schema64 = schema53.type("hi!");
        io.swagger.oas.models.media.Schema schema66 = schema53.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema68 = schema66.pattern("hi!");
        schema66.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Integer int71 = schema66.getMaxLength();
        io.swagger.oas.models.media.Schema schema73 = schema66.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema75 = schema73.minItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema76 = schema36.not(schema73);
        io.swagger.oas.models.media.Schema schema78 = schema73.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: true\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema80 = schema78.maxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema81 = schema28.example((java.lang.Object) 0);
        schema28.setMaxLength((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNull(boolean37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNull(int59);
        org.junit.Assert.assertNull(int60);
        org.junit.Assert.assertNull(bigDecimal61);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNull(int71);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema78);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(schema81);
    }

    @Test
    public void test17075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17075");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        java.lang.Boolean boolean5 = schema4.getUniqueItems();
        io.swagger.oas.models.media.Schema schema7 = schema4.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema9 = schema4.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: no description\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema11 = schema9.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Discriminator discriminator12 = null;
        io.swagger.oas.models.media.Schema schema13 = schema9.discriminator(discriminator12);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation14 = null;
        schema9.setExternalDocs(externalDocumentation14);
        io.swagger.oas.models.media.Schema schema17 = schema9.maxProperties((java.lang.Integer) 10);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema17);
    }

    @Test
    public void test17076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17076");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema7 = strSchema0.nullable((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test17077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17077");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int5 = strSchema0.getMinLength();
        java.lang.Integer int6 = strSchema0.getMaxLength();
        java.math.BigDecimal bigDecimal7 = strSchema0.getMaximum();
        io.swagger.oas.models.media.Schema schema9 = strSchema0.name("no description");
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = strSchema0.getExtensions();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap11 = null;
        io.swagger.oas.models.media.Schema schema12 = strSchema0.properties(strMap11);
        java.math.BigDecimal bigDecimal13 = null;
        strSchema0.setMultipleOf(bigDecimal13);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str16 = strSchema15.getTitle();
        io.swagger.oas.models.media.Schema schema18 = strSchema15.format("");
        io.swagger.oas.models.media.Schema schema20 = strSchema15.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema22 = strSchema15.description("*/*");
        strSchema15.setPattern("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.XML xML25 = null;
        io.swagger.oas.models.media.Schema schema26 = strSchema15.xml(xML25);
        io.swagger.oas.models.media.Schema schema28 = schema26.minProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema29 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str30 = strSchema29.getTitle();
        io.swagger.oas.models.media.Schema schema32 = strSchema29.format("");
        io.swagger.oas.models.media.Schema schema34 = strSchema29.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema36 = schema34.exclusiveMaximum((java.lang.Boolean) true);
        schema36.setMaxItems((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema39 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema39.setType("hi!");
        java.lang.Boolean boolean42 = strSchema39.getWriteOnly();
        io.swagger.oas.models.media.Schema schema44 = strSchema39.type("default");
        java.lang.String str45 = schema44.getDescription();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema47 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema47.setType("hi!");
        strSchema47.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap52 = null;
        io.swagger.oas.models.media.Schema schema53 = strSchema47.properties(strMap52);
        io.swagger.oas.models.media.Schema schema55 = strSchema47.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema56 = schema44.addProperties("no description", schema55);
        io.swagger.oas.models.media.Schema schema58 = schema44.exclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema60 = schema58.$ref("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema61 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str62 = strSchema61.getTitle();
        io.swagger.oas.models.media.Schema schema64 = strSchema61.format("");
        strSchema61.setDeprecated((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal67 = strSchema61.getMaximum();
        java.math.BigDecimal bigDecimal68 = strSchema61.getMinimum();
        io.swagger.oas.models.media.Schema schema70 = strSchema61.deprecated((java.lang.Boolean) true);
        schema70.setMinLength((java.lang.Integer) (-1));
        schema60.setExample((java.lang.Object) schema70);
        io.swagger.oas.models.media.Schema schema75 = schema60.readOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Discriminator discriminator76 = null;
        schema75.setDiscriminator(discriminator76);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap78 = schema75.getProperties();
        io.swagger.oas.models.media.Schema schema79 = schema36.properties(strMap78);
        io.swagger.oas.models.media.Schema schema80 = schema26.properties(strMap78);
        strSchema0.setProperties(strMap78);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNull(boolean42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNull(bigDecimal67);
        org.junit.Assert.assertNull(bigDecimal68);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(strMap78);
        org.junit.Assert.assertNotNull(schema79);
        org.junit.Assert.assertNotNull(schema80);
    }

    @Test
    public void test17078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17078");
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
        java.lang.String str22 = schema19.getTitle();
        io.swagger.oas.models.media.Schema schema24 = schema19.uniqueItems((java.lang.Boolean) true);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(schema24);
    }

    @Test
    public void test17079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17079");
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema36 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema36.setType("hi!");
        strSchema36.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap41 = null;
        io.swagger.oas.models.media.Schema schema42 = strSchema36.properties(strMap41);
        io.swagger.oas.models.media.Discriminator discriminator43 = null;
        io.swagger.oas.models.media.Schema schema44 = strSchema36.discriminator(discriminator43);
        io.swagger.oas.models.media.Schema schema45 = schema44.getNot();
        io.swagger.oas.models.media.Schema schema47 = schema44.$ref("hi!");
        io.swagger.oas.models.media.Discriminator discriminator48 = null;
        schema47.setDiscriminator(discriminator48);
        io.swagger.oas.models.media.Schema schema50 = schema35.additionalProperties(schema47);
        io.swagger.oas.models.media.Schema schema52 = schema47.nullable((java.lang.Boolean) false);
        java.lang.Integer int53 = schema52.getMaxProperties();
        io.swagger.oas.models.media.Schema schema55 = schema52.nullable((java.lang.Boolean) false);
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
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(schema45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNull(int53);
        org.junit.Assert.assertNotNull(schema55);
    }

    @Test
    public void test17080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17080");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        strSchema0.setDeprecated((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal6 = strSchema0.getMaximum();
        java.math.BigDecimal bigDecimal7 = strSchema0.getMinimum();
        io.swagger.oas.models.media.Schema schema9 = strSchema0.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema11 = strSchema0.nullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Discriminator discriminator12 = null;
        io.swagger.oas.models.media.Schema schema13 = schema11.discriminator(discriminator12);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test17081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17081");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        strSchema0.setExtensions(strMap1);
        io.swagger.oas.models.media.Schema schema4 = strSchema0.type("");
        java.lang.Integer int5 = strSchema0.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        java.util.List<java.lang.String> strList9 = strSchema6.getRequired();
        strSchema6.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int12 = strSchema6.getMinLength();
        java.math.BigDecimal bigDecimal13 = null;
        strSchema6.setMinimum(bigDecimal13);
        io.swagger.oas.models.media.Schema schema16 = strSchema6.maxItems((java.lang.Integer) 1);
        schema16.setExclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema20 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema20.setType("hi!");
        strSchema20.setName("no description");
        io.swagger.oas.models.media.Schema schema26 = strSchema20.type("");
        io.swagger.oas.models.media.Schema schema28 = schema26.maxProperties((java.lang.Integer) 100);
        schema28.setDeprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema31 = schema16.addProperties("*/*", schema28);
        io.swagger.oas.models.media.Schema schema33 = schema28.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema34 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean35 = strSchema34.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation36 = strSchema34.getExternalDocs();
        strSchema34.set$ref("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema39 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema39.setType("hi!");
        strSchema39.setName("no description");
        io.swagger.oas.models.media.Schema schema45 = strSchema39.type("");
        io.swagger.oas.models.media.Schema schema47 = schema45.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema48 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema48.setType("hi!");
        strSchema48.setName("no description");
        io.swagger.oas.models.media.Schema schema54 = strSchema48.type("");
        io.swagger.oas.models.media.Schema schema56 = schema54.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema57 = schema47.not(schema54);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema58 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str59 = strSchema58.getTitle();
        io.swagger.oas.models.media.Schema schema61 = strSchema58.format("");
        strSchema58.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema64 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema64.setType("hi!");
        strSchema64.setName("no description");
        io.swagger.oas.models.media.Schema schema70 = strSchema64.type("");
        io.swagger.oas.models.media.Schema schema72 = schema70.maxProperties((java.lang.Integer) 100);
        java.lang.String[] strArray74 = new java.lang.String[] { "default" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        schema72.setRequired((java.util.List<java.lang.String>) strList75);
        strSchema58.setRequired((java.util.List<java.lang.String>) strList75);
        io.swagger.oas.models.media.Schema schema79 = schema57.required((java.util.List<java.lang.String>) strList75);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation80 = null;
        io.swagger.oas.models.media.Schema schema81 = schema79.externalDocs(externalDocumentation80);
        strSchema34.setDefault((java.lang.Object) schema79);
        schema28.setExample((java.lang.Object) schema79);
        java.math.BigDecimal bigDecimal84 = schema79.getMaximum();
        io.swagger.oas.models.media.Schema schema85 = strSchema0.not(schema79);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertNull(externalDocumentation36);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(schema79);
        org.junit.Assert.assertNotNull(schema81);
        org.junit.Assert.assertNull(bigDecimal84);
        org.junit.Assert.assertNotNull(schema85);
    }

    @Test
    public void test17082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17082");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getWriteOnly();
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        strSchema0.setMinItems((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema13 = strSchema0.title("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        java.lang.Boolean boolean17 = strSchema14.getWriteOnly();
        java.lang.Integer int18 = strSchema14.getMinProperties();
        strSchema14.setExclusiveMinimum((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal21 = null;
        strSchema14.setMinimum(bigDecimal21);
        io.swagger.oas.models.media.Schema schema23 = strSchema14.getNot();
        io.swagger.oas.models.media.Schema schema25 = strSchema14.readOnly((java.lang.Boolean) false);
        schema25.setNullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema28 = schema13.additionalProperties(schema25);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation29 = schema28.getExternalDocs();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(schema23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(externalDocumentation29);
    }

    @Test
    public void test17083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17083");
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
        java.lang.Integer int15 = schema11.getMaxItems();
        io.swagger.oas.models.media.Schema schema17 = schema11.deprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema19 = schema11.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema21 = schema19.nullable((java.lang.Boolean) true);
        schema21.setPattern("");
        java.math.BigDecimal bigDecimal24 = null;
        io.swagger.oas.models.media.Schema schema25 = schema21.multipleOf(bigDecimal24);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation26 = null;
        io.swagger.oas.models.media.Schema schema27 = schema21.externalDocs(externalDocumentation26);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(discriminator14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema27);
    }

    @Test
    public void test17084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17084");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxLength((java.lang.Integer) 0);
        java.lang.Integer int9 = strSchema0.getMaxItems();
        io.swagger.oas.models.media.Schema schema11 = strSchema0.format("");
        io.swagger.oas.models.media.Schema schema13 = strSchema0.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean14 = schema13.getReadOnly();
        io.swagger.oas.models.media.Discriminator discriminator15 = schema13.getDiscriminator();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(discriminator15);
    }

    @Test
    public void test17085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17085");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        strSchema0.setMaxLength((java.lang.Integer) 0);
        java.lang.Integer int9 = strSchema0.getMaxProperties();
        java.math.BigDecimal bigDecimal10 = null;
        strSchema0.setMinimum(bigDecimal10);
        io.swagger.oas.models.media.XML xML12 = null;
        strSchema0.setXml(xML12);
        strSchema0.setMaxProperties((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test17086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17086");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxLength((java.lang.Integer) 0);
        java.lang.Integer int9 = schema8.getMinItems();
        java.math.BigDecimal bigDecimal10 = null;
        io.swagger.oas.models.media.Schema schema11 = schema8.minimum(bigDecimal10);
        io.swagger.oas.models.media.Schema schema13 = schema8.title("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: false\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema15 = schema13.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.XML xML16 = null;
        io.swagger.oas.models.media.Schema schema17 = schema15.xml(xML16);
        schema17.setMinLength((java.lang.Integer) 1);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
    }

    @Test
    public void test17087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17087");
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
        strSchema0.setPattern("*/*");
        io.swagger.oas.models.media.Schema schema24 = strSchema0.maxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema26 = strSchema0.exclusiveMaximum((java.lang.Boolean) true);
        schema26.setMaxProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema30 = schema26.maxProperties((java.lang.Integer) 0);
        schema26.setType("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 10\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema34 = schema26.minProperties((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema34);
    }

    @Test
    public void test17088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17088");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxLength((java.lang.Integer) 0);
        java.lang.Integer int9 = strSchema0.getMaxItems();
        io.swagger.oas.models.media.Schema schema11 = strSchema0.format("");
        io.swagger.oas.models.media.Schema schema13 = strSchema0.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema13.setDeprecated((java.lang.Boolean) true);
        schema13.setMaxLength((java.lang.Integer) 10);
        schema13.setWriteOnly((java.lang.Boolean) false);
        schema13.addEnumItemObject("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 10\n    minLength: null\n    pattern: null\n    maxItems: 10\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: -1\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: false\n    xml: null\n}");
        java.lang.Integer int22 = schema13.getMinProperties();
        io.swagger.oas.models.media.Schema schema24 = schema13.maxProperties((java.lang.Integer) 100);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(schema24);
    }

    @Test
    public void test17089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17089");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        schema6.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean9 = schema6.getExclusiveMinimum();
        schema6.addEnumItemObject("default");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation12 = schema6.getExternalDocs();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.lang.Boolean boolean16 = strSchema13.getWriteOnly();
        io.swagger.oas.models.media.Schema schema18 = strSchema13.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema19.setType("hi!");
        java.lang.Boolean boolean22 = strSchema19.getWriteOnly();
        io.swagger.oas.models.media.Schema schema24 = strSchema19.type("default");
        strSchema13.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema19);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema26 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema26.setType("hi!");
        strSchema26.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean31 = strSchema26.getDeprecated();
        java.lang.String str32 = strSchema26.getDescription();
        io.swagger.oas.models.media.Schema schema34 = strSchema26.maxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema36 = schema34.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema38 = schema34.$ref("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema39 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema39.setType("hi!");
        strSchema39.setName("no description");
        io.swagger.oas.models.media.Schema schema45 = strSchema39.type("");
        io.swagger.oas.models.media.Schema schema47 = schema45.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema48 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema48.setType("hi!");
        strSchema48.setName("no description");
        io.swagger.oas.models.media.Schema schema54 = strSchema48.type("");
        io.swagger.oas.models.media.Schema schema56 = strSchema48.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema58 = strSchema48.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray61 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        schema58.setRequired((java.util.List<java.lang.String>) strList62);
        schema47.setRequired((java.util.List<java.lang.String>) strList62);
        io.swagger.oas.models.media.Schema schema66 = schema38.required((java.util.List<java.lang.String>) strList62);
        strSchema19.setRequired((java.util.List<java.lang.String>) strList62);
        schema6.setRequired((java.util.List<java.lang.String>) strList62);
        java.lang.String str69 = schema6.getType();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema70 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema70.setType("hi!");
        java.util.List<java.lang.String> strList73 = strSchema70.getRequired();
        strSchema70.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema77 = strSchema70.title("no description");
        io.swagger.oas.models.media.Schema schema79 = strSchema70.maxLength((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema80 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema80.setType("hi!");
        strSchema80.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int85 = strSchema80.getMinLength();
        java.lang.Integer int86 = strSchema80.getMaxLength();
        java.math.BigDecimal bigDecimal87 = strSchema80.getMaximum();
        io.swagger.oas.models.media.Schema schema88 = schema79.additionalProperties((io.swagger.oas.models.media.Schema) strSchema80);
        io.swagger.oas.models.media.Schema schema90 = schema88.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean91 = schema88.getExclusiveMaximum();
        io.swagger.oas.models.media.Schema schema92 = schema6.not(schema88);
        java.lang.Integer int93 = schema6.getMaxLength();
        io.swagger.oas.models.media.Schema schema95 = schema6.maxItems((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(externalDocumentation12);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNull(strList73);
        org.junit.Assert.assertNotNull(schema77);
        org.junit.Assert.assertNotNull(schema79);
        org.junit.Assert.assertNull(int85);
        org.junit.Assert.assertNull(int86);
        org.junit.Assert.assertNull(bigDecimal87);
        org.junit.Assert.assertNotNull(schema88);
        org.junit.Assert.assertNotNull(schema90);
        org.junit.Assert.assertNull(boolean91);
        org.junit.Assert.assertNotNull(schema92);
        org.junit.Assert.assertNull(int93);
        org.junit.Assert.assertNotNull(schema95);
    }

    @Test
    public void test17090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17090");
        io.swagger.jaxrs2.OperationParser.RESPONSE_DEFAULT = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 10\n    required: [*/*, */*]\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: true\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test17091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17091");
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema27 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema27.setType("hi!");
        strSchema27.setName("no description");
        io.swagger.oas.models.media.Schema schema33 = strSchema27.type("");
        java.lang.Integer int34 = schema33.getMaxProperties();
        java.math.BigDecimal bigDecimal35 = null;
        schema33.setMinimum(bigDecimal35);
        io.swagger.oas.models.media.Schema schema38 = schema33.maxLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal39 = schema33.getMinimum();
        io.swagger.oas.models.media.Schema schema41 = schema33.minProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Discriminator discriminator42 = null;
        io.swagger.oas.models.media.Schema schema43 = schema41.discriminator(discriminator42);
        io.swagger.oas.models.media.Schema schema45 = schema41.writeOnly((java.lang.Boolean) true);
        strSchema0.setAdditionalProperties(schema41);
        io.swagger.oas.models.media.Schema schema48 = strSchema0.readOnly((java.lang.Boolean) false);
        java.lang.Boolean boolean49 = strSchema0.getNullable();
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
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(bigDecimal39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertEquals("'" + boolean49 + "' != '" + false + "'", boolean49, false);
    }

    @Test
    public void test17092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17092");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.format("no description");
        io.swagger.oas.models.media.Schema schema10 = schema8.format("");
        schema10.setMinItems((java.lang.Integer) 1);
        schema10.setName("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Class<?> wildcardClass15 = schema10.getClass();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test17093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17093");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.format("no description");
        io.swagger.oas.models.media.Schema schema10 = schema8.format("");
        schema10.setMinItems((java.lang.Integer) 1);
        schema10.setName("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Discriminator discriminator15 = null;
        io.swagger.oas.models.media.Schema schema16 = schema10.discriminator(discriminator15);
        java.lang.Integer int17 = schema10.getMinProperties();
        io.swagger.oas.models.media.Schema schema19 = schema10.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema21 = schema19.maxProperties((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test17094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17094");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema7 = strSchema0.title("no description");
        schema7.set$ref("");
        schema7.setMaxItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        java.util.List<java.lang.String> strList16 = strSchema13.getRequired();
        strSchema13.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int19 = strSchema13.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema20 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema20.setType("hi!");
        strSchema20.setName("no description");
        io.swagger.oas.models.media.Schema schema26 = strSchema20.type("");
        io.swagger.oas.models.media.Schema schema27 = strSchema13.not((io.swagger.oas.models.media.Schema) strSchema20);
        java.lang.Boolean boolean28 = strSchema13.getUniqueItems();
        java.lang.Boolean boolean29 = strSchema13.getNullable();
        io.swagger.oas.models.media.Schema schema31 = strSchema13.uniqueItems((java.lang.Boolean) false);
        java.lang.Integer int32 = strSchema13.getMinItems();
        java.lang.Boolean boolean33 = strSchema13.getDeprecated();
        io.swagger.oas.models.media.Schema schema34 = schema7.addProperties("#/components/schemas/hi!", (io.swagger.oas.models.media.Schema) strSchema13);
        io.swagger.oas.models.media.Schema schema36 = schema34.nullable((java.lang.Boolean) true);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNull(boolean33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
    }

    @Test
    public void test17095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17095");
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
        io.swagger.oas.models.media.Schema schema50 = schema48.title("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 0\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: -1\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema50.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: 0\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Integer int53 = schema50.getMaxProperties();
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
        org.junit.Assert.assertNull(int53);
    }

    @Test
    public void test17096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17096");
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        java.util.List<java.lang.String> strList20 = strSchema17.getRequired();
        strSchema17.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int23 = strSchema17.getMinLength();
        java.math.BigDecimal bigDecimal24 = null;
        strSchema17.setMinimum(bigDecimal24);
        io.swagger.oas.models.media.Schema schema27 = strSchema17.maxItems((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema29 = schema27.readOnly((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation30 = null;
        io.swagger.oas.models.media.Schema schema31 = schema27.externalDocs(externalDocumentation30);
        io.swagger.oas.models.media.Schema schema32 = schema11.additionalProperties(schema27);
        io.swagger.oas.models.media.Schema schema34 = schema11.deprecated((java.lang.Boolean) true);
        java.lang.String str35 = schema34.getTitle();
        io.swagger.oas.models.media.Discriminator discriminator36 = null;
        io.swagger.oas.models.media.Schema schema37 = schema34.discriminator(discriminator36);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strList20);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(schema37);
    }

    @Test
    public void test17097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17097");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema10 = schema6.nullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema12 = schema10.$ref("default");
        io.swagger.oas.models.media.Schema schema14 = schema12.title("");
        io.swagger.oas.models.media.Schema schema16 = schema14.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema18 = schema14.writeOnly((java.lang.Boolean) true);
        java.lang.Object obj19 = schema18.getExample();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test17098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17098");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema5 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema5.setType("hi!");
        strSchema5.setName("no description");
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema5);
        io.swagger.oas.models.media.Schema schema12 = strSchema5.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Discriminator discriminator13 = null;
        io.swagger.oas.models.media.Schema schema14 = strSchema5.discriminator(discriminator13);
        strSchema5.setMinProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        strSchema17.setName("no description");
        io.swagger.oas.models.media.Schema schema23 = strSchema17.type("");
        io.swagger.oas.models.media.Schema schema25 = schema23.format("no description");
        io.swagger.oas.models.media.Schema schema27 = schema25.format("");
        schema27.setMinItems((java.lang.Integer) 1);
        schema27.setName("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Discriminator discriminator32 = null;
        io.swagger.oas.models.media.Schema schema33 = schema27.discriminator(discriminator32);
        io.swagger.oas.models.media.XML xML34 = schema33.getXml();
        java.lang.Integer int35 = schema33.getMinLength();
        io.swagger.oas.models.media.Schema schema37 = schema33.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: no description\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema38 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema38.setType("hi!");
        strSchema38.setName("no description");
        io.swagger.oas.models.media.Schema schema44 = strSchema38.type("");
        io.swagger.oas.models.media.Schema schema46 = schema44.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int47 = schema46.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema48 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema48.setType("hi!");
        strSchema48.setName("no description");
        io.swagger.oas.models.media.Schema schema54 = strSchema48.type("");
        io.swagger.oas.models.media.Schema schema56 = schema54.format("no description");
        io.swagger.oas.models.media.Schema schema57 = schema46.not(schema56);
        java.lang.Integer int58 = schema46.getMaxItems();
        java.lang.Integer int59 = schema46.getMaxLength();
        io.swagger.oas.models.media.Schema schema61 = schema46.title("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema62 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema62.setType("hi!");
        strSchema62.setWriteOnly((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation67 = strSchema62.getExternalDocs();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema68 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema68.setType("hi!");
        io.swagger.oas.models.media.Schema schema72 = strSchema68.maxLength((java.lang.Integer) 1);
        schema72.setPattern("");
        io.swagger.oas.models.media.Schema schema76 = schema72.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray80 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        schema76.setEnum((java.util.List<java.lang.String>) strList81);
        strSchema62.setRequired((java.util.List<java.lang.String>) strList81);
        schema61.setRequired((java.util.List<java.lang.String>) strList81);
        schema37.setRequired((java.util.List<java.lang.String>) strList81);
        strSchema5.setNot(schema37);
        java.math.BigDecimal bigDecimal88 = strSchema5.getMultipleOf();
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(xML34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNull(int47);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNull(int58);
        org.junit.Assert.assertNull(int59);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNull(externalDocumentation67);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(bigDecimal88);
    }

    @Test
    public void test17099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17099");
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
        io.swagger.oas.models.media.Schema schema22 = schema11.type("hi!");
        io.swagger.oas.models.media.Schema schema24 = schema11.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema26 = schema24.pattern("hi!");
        schema24.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Integer int29 = schema24.getMaxLength();
        schema24.setReadOnly((java.lang.Boolean) false);
        java.lang.Object obj32 = schema24.getExample();
        schema24.setNullable((java.lang.Boolean) false);
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
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test17100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17100");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        schema4.setPattern("");
        io.swagger.oas.models.media.Schema schema8 = schema4.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema10 = schema8.minItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        strSchema11.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema16 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema16.setType("hi!");
        strSchema16.setName("no description");
        strSchema11.setNot((io.swagger.oas.models.media.Schema) strSchema16);
        java.math.BigDecimal bigDecimal22 = null;
        io.swagger.oas.models.media.Schema schema23 = strSchema11.minimum(bigDecimal22);
        schema23.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema27 = schema23.maxItems((java.lang.Integer) 10);
        schema8.setDefault((java.lang.Object) schema27);
        java.lang.Integer int29 = schema8.getMinProperties();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema30 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema30.setType("hi!");
        strSchema30.setName("no description");
        io.swagger.oas.models.media.Schema schema36 = strSchema30.type("");
        io.swagger.oas.models.media.Schema schema38 = schema36.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int39 = schema38.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema40 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema40.setType("hi!");
        strSchema40.setName("no description");
        io.swagger.oas.models.media.Schema schema46 = strSchema40.type("");
        io.swagger.oas.models.media.Schema schema48 = schema46.format("no description");
        io.swagger.oas.models.media.Schema schema49 = schema38.not(schema48);
        java.math.BigDecimal bigDecimal50 = null;
        io.swagger.oas.models.media.Schema schema51 = schema48.multipleOf(bigDecimal50);
        java.math.BigDecimal bigDecimal52 = null;
        schema48.setMaximum(bigDecimal52);
        io.swagger.oas.models.media.Schema schema54 = schema8.not(schema48);
        io.swagger.oas.models.media.Schema schema56 = schema8.maxLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal57 = null;
        schema8.setMinimum(bigDecimal57);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema56);
    }

    @Test
    public void test17101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17101");
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema25 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str26 = strSchema25.getTitle();
        io.swagger.oas.models.media.Schema schema28 = strSchema25.format("");
        io.swagger.oas.models.media.Schema schema30 = strSchema25.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema32 = strSchema25.description("*/*");
        boolean boolean33 = schema21.equals((java.lang.Object) "*/*");
        io.swagger.oas.models.media.Discriminator discriminator34 = null;
        io.swagger.oas.models.media.Schema schema35 = schema21.discriminator(discriminator34);
        io.swagger.oas.models.media.Discriminator discriminator36 = null;
        io.swagger.oas.models.media.Schema schema37 = schema35.discriminator(discriminator36);
        io.swagger.oas.models.media.Schema schema39 = schema37.type("default");
        io.swagger.oas.models.media.Schema schema41 = schema39.minLength((java.lang.Integer) 0);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation42 = null;
        schema39.setExternalDocs(externalDocumentation42);
        schema39.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema47 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema47.setType("hi!");
        strSchema47.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap52 = null;
        io.swagger.oas.models.media.Schema schema53 = strSchema47.properties(strMap52);
        java.lang.Integer int54 = schema53.getMaxProperties();
        io.swagger.oas.models.media.Schema schema56 = schema53.type("*/*");
        io.swagger.oas.models.media.Schema schema58 = schema53.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema60 = schema53.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema61 = schema39.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: false\n    readOnly: false\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema60);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNull(int54);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema61);
    }

    @Test
    public void test17102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17102");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        java.math.BigDecimal bigDecimal10 = schema6.getMultipleOf();
        io.swagger.oas.models.media.Schema schema12 = schema6.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation13 = null;
        schema12.setExternalDocs(externalDocumentation13);
        io.swagger.oas.models.media.XML xML15 = null;
        io.swagger.oas.models.media.Schema schema16 = schema12.xml(xML15);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test17103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17103");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema schema7 = schema5.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema9 = schema5.readOnly((java.lang.Boolean) false);
        schema9.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setName("no description");
        io.swagger.oas.models.media.Schema schema18 = strSchema12.type("");
        schema9.setExample((java.lang.Object) "");
        io.swagger.oas.models.media.XML xML20 = null;
        io.swagger.oas.models.media.Schema schema21 = schema9.xml(xML20);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test17104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17104");
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap27 = null;
        io.swagger.oas.models.media.Schema schema28 = strSchema22.properties(strMap27);
        java.lang.String str29 = strSchema22.getPattern();
        strSchema22.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema33 = strSchema22.exclusiveMinimum((java.lang.Boolean) true);
        schema33.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema37 = schema33.maxProperties((java.lang.Integer) 100);
        java.lang.Object obj38 = schema37.getExample();
        schema11.setExample((java.lang.Object) schema37);
        io.swagger.oas.models.media.Schema<java.lang.Class<?>> wildcardClassSchema40 = new io.swagger.oas.models.media.Schema<java.lang.Class<?>>();
        io.swagger.oas.models.media.Schema schema41 = schema11.not((io.swagger.oas.models.media.Schema) wildcardClassSchema40);
        java.lang.String str42 = schema41.getFormat();
        java.lang.Integer int43 = schema41.getMaxLength();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(int43);
    }

    @Test
    public void test17105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17105");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation7 = schema6.getExternalDocs();
        io.swagger.oas.models.media.Schema schema9 = schema6.maxProperties((java.lang.Integer) 1);
        java.lang.String str10 = schema6.get$ref();
        java.lang.String str11 = schema6.get$ref();
        io.swagger.oas.models.media.Schema schema13 = schema6.minProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema15 = schema13.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.XML xML16 = null;
        schema15.setXml(xML16);
        io.swagger.oas.models.media.Schema schema19 = schema15.minProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema21 = schema15.nullable((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(externalDocumentation7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test17106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17106");
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema35 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema35.setType("hi!");
        java.lang.Boolean boolean38 = strSchema35.getWriteOnly();
        io.swagger.oas.models.media.Schema schema40 = strSchema35.type("default");
        io.swagger.oas.models.media.Schema schema42 = strSchema35.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Object obj43 = strSchema35.getExample();
        io.swagger.oas.models.media.Discriminator discriminator44 = null;
        io.swagger.oas.models.media.Schema schema45 = strSchema35.discriminator(discriminator44);
        schema19.setExample((java.lang.Object) schema45);
        io.swagger.oas.models.media.Schema schema48 = schema45.uniqueItems((java.lang.Boolean) true);
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
        org.junit.Assert.assertNull(boolean38);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema48);
    }

    @Test
    public void test17107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17107");
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
        java.lang.String str20 = schema18.getFormat();
        java.util.List<java.lang.String> strList21 = schema18.getRequired();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "no description" + "'", str20, "no description");
        org.junit.Assert.assertNull(strList21);
    }

    @Test
    public void test17108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17108");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        strSchema0.setMaxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema7 = strSchema0.$ref("hi!");
        io.swagger.oas.models.media.Discriminator discriminator8 = null;
        schema7.setDiscriminator(discriminator8);
        io.swagger.oas.models.media.Schema schema11 = schema7.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 10\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema13 = schema7.deprecated((java.lang.Boolean) true);
        schema13.setMinProperties((java.lang.Integer) 100);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test17109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17109");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.XML xML6 = schema5.getXml();
        io.swagger.oas.models.media.Schema schema7 = schema5.getNot();
        java.lang.Integer int8 = schema5.getMaxProperties();
        io.swagger.oas.models.media.Schema schema10 = schema5.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        strSchema11.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean16 = strSchema11.getDeprecated();
        io.swagger.oas.models.media.Schema schema18 = strSchema11.type("*/*");
        java.math.BigDecimal bigDecimal19 = null;
        io.swagger.oas.models.media.Schema schema20 = schema18.minimum(bigDecimal19);
        java.lang.Boolean boolean21 = schema18.getDeprecated();
        io.swagger.oas.models.media.Schema schema22 = schema5.additionalProperties(schema18);
        io.swagger.oas.models.media.Schema schema23 = schema22.getAdditionalProperties();
        schema23.set$ref("#/components/schemas/");
        java.util.List<java.lang.String> strList26 = schema23.getRequired();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(xML6);
        org.junit.Assert.assertNull(schema7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(strList26);
    }

    @Test
    public void test17110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17110");
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
        java.lang.Integer int19 = strSchema11.getMinItems();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = strSchema11.getExtensions();
        strSchema11.setUniqueItems((java.lang.Boolean) false);
        java.lang.String str23 = strSchema11.getName();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test17111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17111");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        strSchema0.setNullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema8 = strSchema0.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation9 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        strSchema11.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema17 = strSchema11.addRequiredItem("");
        io.swagger.oas.models.media.Schema schema19 = schema17.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema0.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema19);
        io.swagger.oas.models.media.Schema schema22 = schema19.format("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: no description\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(externalDocumentation9);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
    }

    @Test
    public void test17112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17112");
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
        java.lang.Boolean boolean36 = schema33.getExclusiveMaximum();
        java.lang.String str37 = schema33.getDescription();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation38 = schema33.getExternalDocs();
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
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(externalDocumentation38);
    }

    @Test
    public void test17113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17113");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema7 = strSchema0.title("no description");
        io.swagger.oas.models.media.Schema schema9 = strSchema0.minProperties((java.lang.Integer) 1);
        java.lang.String str10 = schema9.get$ref();
        java.util.List<java.lang.String> strList11 = schema9.getEnum();
        io.swagger.oas.models.media.Discriminator discriminator12 = null;
        io.swagger.oas.models.media.Schema schema13 = schema9.discriminator(discriminator12);
        io.swagger.oas.models.media.Schema schema15 = schema9.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 10\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema17 = schema15.minProperties((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = schema15.getExtensions();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test17114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17114");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int6 = strSchema0.getMinLength();
        java.math.BigDecimal bigDecimal7 = null;
        strSchema0.setMinimum(bigDecimal7);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.maxItems((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema12 = schema10.readOnly((java.lang.Boolean) true);
        java.lang.String str13 = schema12.toString();
        schema12.set$ref("hi!");
        io.swagger.oas.models.media.Schema schema17 = schema12.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema19 = schema17.title("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema21 = schema19.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str22 = schema19.getType();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str24 = strSchema23.getTitle();
        io.swagger.oas.models.media.Schema schema26 = strSchema23.format("");
        io.swagger.oas.models.media.Schema schema28 = strSchema23.name("default");
        io.swagger.oas.models.media.Schema schema30 = strSchema23.readOnly((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal31 = null;
        io.swagger.oas.models.media.Schema schema32 = schema30.maximum(bigDecimal31);
        java.lang.Boolean boolean33 = schema30.getExclusiveMaximum();
        io.swagger.oas.models.media.Schema schema35 = schema30.exclusiveMaximum((java.lang.Boolean) true);
        schema19.setDefault((java.lang.Object) schema30);
        java.lang.String str37 = schema19.getDescription();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str13, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(boolean33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test17115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17115");
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
        io.swagger.oas.models.media.XML xML19 = null;
        schema10.setXml(xML19);
        schema10.setReadOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema24 = schema10.description("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 10\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema26 = schema10.title("#/components/schemas/no description");
        io.swagger.oas.models.media.Schema schema28 = schema26.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 100\n    minProperties: null\n    required: [no description]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.math.BigDecimal bigDecimal29 = null;
        io.swagger.oas.models.media.Schema schema30 = schema26.maximum(bigDecimal29);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
    }

    @Test
    public void test17116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17116");
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
        schema8.setMinProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap27 = null;
        io.swagger.oas.models.media.Schema schema28 = strSchema22.properties(strMap27);
        java.lang.Integer int29 = schema28.getMaxProperties();
        io.swagger.oas.models.media.Schema schema31 = schema28.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema33 = schema28.name("hi!");
        io.swagger.oas.models.media.Schema schema35 = schema28.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema36 = schema8.example((java.lang.Object) schema35);
        java.lang.String str37 = schema36.getFormat();
        schema36.setMinProperties((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test17117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17117");
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
        java.lang.Integer int16 = schema6.getMinItems();
        java.lang.String str17 = schema6.getFormat();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test17118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17118");
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
        io.swagger.oas.models.media.Schema schema22 = schema17.exclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean23 = schema17.getExclusiveMinimum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(boolean23);
    }

    @Test
    public void test17119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17119");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        io.swagger.oas.models.media.Schema schema8 = schema4.$ref("default");
        schema4.setExclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        java.lang.Boolean boolean14 = strSchema11.getWriteOnly();
        io.swagger.oas.models.media.Schema schema16 = strSchema11.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        strSchema17.setName("no description");
        io.swagger.oas.models.media.Schema schema23 = strSchema17.type("");
        java.lang.Integer int24 = schema23.getMaxProperties();
        java.math.BigDecimal bigDecimal25 = null;
        schema23.setMinimum(bigDecimal25);
        io.swagger.oas.models.media.Schema schema28 = schema23.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema29 = schema23.getAdditionalProperties();
        boolean boolean30 = strSchema11.equals((java.lang.Object) schema23);
        io.swagger.oas.models.media.Schema schema32 = schema23.uniqueItems((java.lang.Boolean) false);
        java.lang.String str33 = schema23.getDescription();
        schema23.setMaxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema37 = schema23.description("default");
        java.lang.Integer int38 = schema37.getMinLength();
        schema4.setAdditionalProperties(schema37);
        io.swagger.oas.models.media.Schema schema41 = schema4.deprecated((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal42 = null;
        io.swagger.oas.models.media.Schema schema43 = schema4.minimum(bigDecimal42);
        java.lang.Integer int44 = schema43.getMinLength();
        io.swagger.oas.models.media.Schema schema46 = schema43.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 100\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: true\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(schema29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNull(int44);
        org.junit.Assert.assertNotNull(schema46);
    }

    @Test
    public void test17120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17120");
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
        java.lang.String str14 = schema13.getName();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema16 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema16.setType("hi!");
        strSchema16.setName("no description");
        io.swagger.oas.models.media.Schema schema22 = strSchema16.type("");
        java.lang.Integer int23 = schema22.getMaxProperties();
        java.math.BigDecimal bigDecimal24 = null;
        schema22.setMinimum(bigDecimal24);
        io.swagger.oas.models.media.Schema schema27 = schema22.maxLength((java.lang.Integer) 10);
        java.lang.Boolean boolean28 = schema27.getNullable();
        java.lang.Boolean boolean29 = schema27.getExclusiveMaximum();
        io.swagger.oas.models.media.Schema schema30 = schema13.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema27);
        io.swagger.oas.models.media.Schema schema32 = schema13.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.math.BigDecimal bigDecimal33 = null;
        schema13.setMinimum(bigDecimal33);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
    }

    @Test
    public void test17121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17121");
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
        schema19.setName("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.math.BigDecimal bigDecimal26 = null;
        io.swagger.oas.models.media.Schema schema27 = schema19.maximum(bigDecimal26);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation28 = null;
        io.swagger.oas.models.media.Schema schema29 = schema19.externalDocs(externalDocumentation28);
        io.swagger.oas.models.media.Schema schema31 = schema29.exclusiveMaximum((java.lang.Boolean) false);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema31);
    }

    @Test
    public void test17122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17122");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.addRequiredItem("*/*");
        io.swagger.oas.models.media.Schema schema8 = schema6.minItems((java.lang.Integer) 10);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap9 = schema6.getProperties();
        schema6.setReadOnly((java.lang.Boolean) false);
        schema6.setNullable((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal14 = null;
        io.swagger.oas.models.media.Schema schema15 = schema6.maximum(bigDecimal14);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema16 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema16.setType("hi!");
        io.swagger.oas.models.media.Schema schema20 = strSchema16.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema22 = schema20.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean23 = schema22.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator24 = null;
        io.swagger.oas.models.media.Schema schema25 = schema22.discriminator(discriminator24);
        schema25.setMaxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema29 = schema25.format("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Discriminator discriminator30 = schema29.getDiscriminator();
        java.lang.Integer int31 = schema29.getMaxItems();
        java.lang.Integer int32 = schema29.getMaxItems();
        boolean boolean33 = schema6.equals((java.lang.Object) schema29);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(discriminator30);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test17123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17123");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        java.lang.String str10 = schema6.getType();
        io.swagger.oas.models.media.Schema schema12 = schema6.maxLength((java.lang.Integer) 100);
        java.lang.Boolean boolean13 = schema6.getExclusiveMinimum();
        schema6.setMaxItems((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test17124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17124");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.description("no description");
        schema11.setPattern("");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        io.swagger.oas.models.media.Schema schema20 = strSchema14.type("");
        io.swagger.oas.models.media.Schema schema22 = schema20.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Discriminator discriminator23 = null;
        io.swagger.oas.models.media.Schema schema24 = schema20.discriminator(discriminator23);
        java.lang.Boolean boolean25 = schema20.getWriteOnly();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema26 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema26.setType("hi!");
        strSchema26.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema32 = strSchema26.addRequiredItem("");
        io.swagger.oas.models.media.Schema schema34 = schema32.exclusiveMaximum((java.lang.Boolean) true);
        schema34.setMaxItems((java.lang.Integer) 0);
        java.lang.String str37 = schema34.toString();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema38 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema38.setType("hi!");
        java.util.List<java.lang.String> strList41 = strSchema38.getRequired();
        strSchema38.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema45 = strSchema38.title("no description");
        java.lang.String str46 = schema45.getDescription();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation47 = null;
        io.swagger.oas.models.media.Schema schema48 = schema45.externalDocs(externalDocumentation47);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema49 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str50 = strSchema49.getTitle();
        io.swagger.oas.models.media.Schema schema52 = strSchema49.format("");
        strSchema49.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema55 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema55.setType("hi!");
        io.swagger.oas.models.media.Schema schema59 = strSchema55.maxLength((java.lang.Integer) 1);
        schema59.setPattern("");
        io.swagger.oas.models.media.Schema schema63 = schema59.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray67 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        schema63.setEnum((java.util.List<java.lang.String>) strList68);
        strSchema49.setEnum((java.util.List<java.lang.String>) strList68);
        schema48.setRequired((java.util.List<java.lang.String>) strList68);
        schema34.setEnum((java.util.List<java.lang.String>) strList68);
        schema20.setRequired((java.util.List<java.lang.String>) strList68);
        io.swagger.oas.models.media.Schema schema75 = schema11.required((java.util.List<java.lang.String>) strList68);
        java.lang.String str76 = schema11.getPattern();
        java.lang.Boolean boolean77 = schema11.getDeprecated();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str37, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(strList41);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNull(boolean77);
    }

    @Test
    public void test17125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17125");
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
        io.swagger.oas.models.media.Schema schema16 = schema6.title("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: []\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str17 = schema16.get$ref();
        io.swagger.oas.models.media.XML xML18 = null;
        io.swagger.oas.models.media.Schema schema19 = schema16.xml(xML18);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test17126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17126");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxLength((java.lang.Integer) 0);
        schema8.setType("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        strSchema11.setName("no description");
        io.swagger.oas.models.media.Schema schema17 = strSchema11.type("");
        io.swagger.oas.models.media.Schema schema19 = strSchema11.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema21 = strSchema11.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        java.lang.Boolean boolean25 = strSchema22.getWriteOnly();
        io.swagger.oas.models.media.Schema schema27 = strSchema22.type("default");
        io.swagger.oas.models.media.Schema schema28 = strSchema11.not(schema27);
        java.math.BigDecimal bigDecimal29 = null;
        schema27.setMultipleOf(bigDecimal29);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema31 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema31.setType("hi!");
        io.swagger.oas.models.media.Schema schema35 = strSchema31.maxLength((java.lang.Integer) 1);
        schema35.setPattern("");
        io.swagger.oas.models.media.Schema schema39 = schema35.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray43 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        schema39.setEnum((java.util.List<java.lang.String>) strList44);
        io.swagger.oas.models.media.Schema schema47 = schema27.required((java.util.List<java.lang.String>) strList44);
        java.math.BigDecimal bigDecimal48 = null;
        schema47.setMinimum(bigDecimal48);
        schema47.setDescription("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: true\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Discriminator discriminator52 = schema47.getDiscriminator();
        schema8.setExample((java.lang.Object) schema47);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNull(discriminator52);
    }

    @Test
    public void test17127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17127");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema7 = strSchema0.$ref("");
        strSchema0.addEnumItemObject("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema10 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema10.setType("hi!");
        strSchema10.setName("no description");
        io.swagger.oas.models.media.Schema schema16 = strSchema10.addRequiredItem("*/*");
        io.swagger.oas.models.media.Schema schema18 = strSchema10.nullable((java.lang.Boolean) true);
        strSchema0.setNot(schema18);
        io.swagger.oas.models.media.Schema schema21 = schema18.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: -1\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.annotations.servers.Server server22 = null;
        io.swagger.oas.annotations.servers.Server[] serverArray23 = new io.swagger.oas.annotations.servers.Server[] { server22 };
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional24 = io.swagger.jaxrs2.OperationParser.getServers(serverArray23);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional25 = io.swagger.jaxrs2.OperationParser.getServers(serverArray23);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional26 = io.swagger.jaxrs2.OperationParser.getServers(serverArray23);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional27 = io.swagger.jaxrs2.OperationParser.getServers(serverArray23);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional28 = io.swagger.jaxrs2.OperationParser.getServers(serverArray23);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional29 = io.swagger.jaxrs2.OperationParser.getServers(serverArray23);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional30 = io.swagger.jaxrs2.OperationParser.getServers(serverArray23);
        schema21.setDefault((java.lang.Object) serverListOptional30);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(serverArray23);
        org.junit.Assert.assertNotNull(serverListOptional24);
        org.junit.Assert.assertNotNull(serverListOptional25);
        org.junit.Assert.assertNotNull(serverListOptional26);
        org.junit.Assert.assertNotNull(serverListOptional27);
        org.junit.Assert.assertNotNull(serverListOptional28);
        org.junit.Assert.assertNotNull(serverListOptional29);
        org.junit.Assert.assertNotNull(serverListOptional30);
    }

    @Test
    public void test17128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17128");
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
        schema12.setMaxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema25 = schema12.maxLength((java.lang.Integer) (-1));
        java.lang.String str26 = schema12.getPattern();
        io.swagger.oas.models.media.Schema schema28 = schema12.format("");
        java.lang.String str29 = schema28.getPattern();
        java.lang.String[] strArray32 = new java.lang.String[] { "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: 0\n    minProperties: 0\n    required: []\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: false\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" };
        java.util.Optional<java.util.Set<io.swagger.oas.models.tags.Tag>> tagSetOptional33 = io.swagger.jaxrs2.OperationParser.getTags(strArray32);
        java.util.Optional<java.util.Set<io.swagger.oas.models.tags.Tag>> tagSetOptional34 = io.swagger.jaxrs2.OperationParser.getTags(strArray32);
        boolean boolean35 = schema28.equals((java.lang.Object) tagSetOptional34);
        java.lang.Boolean boolean36 = schema28.getExclusiveMinimum();
        io.swagger.oas.models.media.Schema schema38 = schema28.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: 0\n    minProperties: 0\n    required: []\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(tagSetOptional33);
        org.junit.Assert.assertNotNull(tagSetOptional34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertNotNull(schema38);
    }

    @Test
    public void test17129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17129");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        schema6.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema10 = schema6.addRequiredItem("");
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema6.minimum(bigDecimal11);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation13 = null;
        io.swagger.oas.models.media.Schema schema14 = schema12.externalDocs(externalDocumentation13);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema15.setType("hi!");
        strSchema15.setName("no description");
        io.swagger.oas.models.media.Schema schema21 = strSchema15.type("");
        java.lang.Integer int22 = schema21.getMaxProperties();
        java.math.BigDecimal bigDecimal23 = null;
        schema21.setMinimum(bigDecimal23);
        schema21.setExclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema28 = schema21.title("hi!");
        io.swagger.oas.models.media.Schema schema30 = schema21.addRequiredItem("default");
        io.swagger.oas.models.media.Schema schema31 = schema14.not(schema21);
        java.math.BigDecimal bigDecimal32 = schema31.getMaximum();
        io.swagger.oas.models.media.Schema schema34 = schema31.readOnly((java.lang.Boolean) true);
        schema31.setName("");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNull(bigDecimal32);
        org.junit.Assert.assertNotNull(schema34);
    }

    @Test
    public void test17130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17130");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.maxItems((java.lang.Integer) 0);
        java.lang.String str7 = schema6.getDescription();
        java.math.BigDecimal bigDecimal8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.multipleOf(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema9.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: 0\n    uniqueItems: null\n    maxProperties: 100\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: false\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Integer int12 = schema11.getMinItems();
        io.swagger.oas.models.media.XML xML13 = null;
        io.swagger.oas.models.media.Schema schema14 = schema11.xml(xML13);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(schema14);
    }

    @Test
    public void test17131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17131");
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
        io.swagger.oas.models.media.XML xML15 = null;
        strSchema7.setXml(xML15);
        strSchema7.setNullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema19.setType("hi!");
        strSchema19.setName("no description");
        io.swagger.oas.models.media.Schema schema25 = strSchema19.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation26 = schema25.getExternalDocs();
        io.swagger.oas.models.media.Schema schema28 = schema25.minProperties((java.lang.Integer) (-1));
        schema25.setExclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema32 = schema25.maxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema33 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema33.setType("hi!");
        strSchema33.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap38 = null;
        io.swagger.oas.models.media.Schema schema39 = strSchema33.properties(strMap38);
        java.lang.Integer int40 = schema39.getMaxProperties();
        io.swagger.oas.models.media.Schema schema42 = schema39.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema44 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema44.setType("hi!");
        java.util.List<java.lang.String> strList47 = strSchema44.getRequired();
        strSchema44.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int50 = strSchema44.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema51 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema51.setType("hi!");
        strSchema51.setName("no description");
        io.swagger.oas.models.media.Schema schema57 = strSchema51.type("");
        io.swagger.oas.models.media.Schema schema58 = strSchema44.not((io.swagger.oas.models.media.Schema) strSchema51);
        io.swagger.oas.models.media.XML xML59 = null;
        strSchema51.setXml(xML59);
        io.swagger.oas.models.media.Schema schema61 = schema42.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (io.swagger.oas.models.media.Schema) strSchema51);
        schema32.setDefault((java.lang.Object) strSchema51);
        strSchema7.setDefault((java.lang.Object) strSchema51);
        java.lang.Integer int64 = strSchema7.getMaxItems();
        io.swagger.oas.models.media.XML xML65 = null;
        io.swagger.oas.models.media.Schema schema66 = strSchema7.xml(xML65);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(externalDocumentation26);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNull(int40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNull(strList47);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNull(int64);
        org.junit.Assert.assertNotNull(schema66);
    }

    @Test
    public void test17132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17132");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        schema4.setPattern("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema7 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema7.setType("hi!");
        java.util.List<java.lang.String> strList10 = strSchema7.getRequired();
        strSchema7.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema14 = strSchema7.title("no description");
        java.lang.String str15 = schema14.getDescription();
        java.lang.String str16 = schema14.getType();
        io.swagger.oas.models.media.Discriminator discriminator17 = null;
        io.swagger.oas.models.media.Schema schema18 = schema14.discriminator(discriminator17);
        io.swagger.oas.models.media.Schema schema20 = schema14.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: true\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 10\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setName("no description");
        io.swagger.oas.models.media.Schema schema28 = strSchema22.type("");
        io.swagger.oas.models.media.Schema schema30 = schema28.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema31 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema31.setType("hi!");
        strSchema31.setName("no description");
        io.swagger.oas.models.media.Schema schema37 = strSchema31.type("");
        io.swagger.oas.models.media.Schema schema39 = schema37.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema40 = schema30.not(schema37);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema41 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str42 = strSchema41.getTitle();
        io.swagger.oas.models.media.Schema schema44 = strSchema41.format("");
        strSchema41.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema47 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema47.setType("hi!");
        strSchema47.setName("no description");
        io.swagger.oas.models.media.Schema schema53 = strSchema47.type("");
        io.swagger.oas.models.media.Schema schema55 = schema53.maxProperties((java.lang.Integer) 100);
        java.lang.String[] strArray57 = new java.lang.String[] { "default" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        schema55.setRequired((java.util.List<java.lang.String>) strList58);
        strSchema41.setRequired((java.util.List<java.lang.String>) strList58);
        io.swagger.oas.models.media.Schema schema62 = schema40.required((java.util.List<java.lang.String>) strList58);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation63 = null;
        io.swagger.oas.models.media.Schema schema64 = schema62.externalDocs(externalDocumentation63);
        schema64.setMinLength((java.lang.Integer) 1);
        java.math.BigDecimal bigDecimal67 = schema64.getMaximum();
        schema14.addExtension("", (java.lang.Object) schema64);
        schema64.setMaxLength((java.lang.Integer) 100);
        schema4.setAdditionalProperties(schema64);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema73 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema73.setType("hi!");
        strSchema73.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int78 = strSchema73.getMinLength();
        java.lang.Integer int79 = strSchema73.getMaxLength();
        java.lang.Integer int80 = strSchema73.getMinProperties();
        io.swagger.oas.models.media.XML xML81 = null;
        io.swagger.oas.models.media.Schema schema82 = strSchema73.xml(xML81);
        io.swagger.oas.models.media.Schema schema83 = schema4.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: true\n    maxProperties: 0\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (io.swagger.oas.models.media.Schema) strSchema73);
        java.lang.String str84 = schema83.getTitle();
        schema83.setNullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema88 = schema83.maxItems((java.lang.Integer) 100);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNull(bigDecimal67);
        org.junit.Assert.assertNull(int78);
        org.junit.Assert.assertNull(int79);
        org.junit.Assert.assertNull(int80);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNotNull(schema83);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNotNull(schema88);
    }

    @Test
    public void test17133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17133");
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
        java.math.BigDecimal bigDecimal17 = schema11.getMinimum();
        io.swagger.oas.models.media.Schema schema19 = schema11.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema21 = schema11.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Discriminator discriminator22 = schema11.getDiscriminator();
        java.math.BigDecimal bigDecimal23 = schema11.getMinimum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(bigDecimal17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(discriminator22);
        org.junit.Assert.assertNull(bigDecimal23);
    }

    @Test
    public void test17134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17134");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        java.math.BigDecimal bigDecimal10 = schema6.getMultipleOf();
        io.swagger.oas.models.media.Schema schema12 = schema6.name("");
        java.math.BigDecimal bigDecimal13 = schema12.getMultipleOf();
        java.lang.Integer int14 = schema12.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema15.setType("hi!");
        java.lang.Boolean boolean18 = strSchema15.getWriteOnly();
        io.swagger.oas.models.media.Schema schema20 = strSchema15.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema21 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema21.setType("hi!");
        strSchema21.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int26 = strSchema21.getMinLength();
        strSchema21.setDescription("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema20.setNot((io.swagger.oas.models.media.Schema) strSchema21);
        io.swagger.oas.models.media.Schema schema30 = schema20.getNot();
        java.lang.String str31 = schema30.getName();
        io.swagger.oas.models.media.Discriminator discriminator32 = schema30.getDiscriminator();
        io.swagger.oas.models.media.Schema schema33 = schema12.not(schema30);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema34 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema34.setType("hi!");
        strSchema34.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean39 = strSchema34.getDeprecated();
        java.lang.String str40 = strSchema34.getDescription();
        io.swagger.oas.models.media.Schema schema42 = strSchema34.maxLength((java.lang.Integer) 0);
        java.lang.Integer int43 = schema42.getMinItems();
        java.math.BigDecimal bigDecimal44 = null;
        io.swagger.oas.models.media.Schema schema45 = schema42.minimum(bigDecimal44);
        schema42.setPattern("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation48 = null;
        schema42.setExternalDocs(externalDocumentation48);
        schema42.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema33.setNot(schema42);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(bigDecimal13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(discriminator32);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(boolean39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNull(int43);
        org.junit.Assert.assertNotNull(schema45);
    }

    @Test
    public void test17135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17135");
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
        java.lang.Integer int24 = schema23.getMinLength();
        java.math.BigDecimal bigDecimal25 = null;
        schema23.setMultipleOf(bigDecimal25);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema27 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema27.setType("hi!");
        strSchema27.setName("no description");
        io.swagger.oas.models.media.Schema schema33 = strSchema27.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation34 = schema33.getExternalDocs();
        io.swagger.oas.models.media.Schema schema36 = schema33.minProperties((java.lang.Integer) (-1));
        schema33.setExclusiveMinimum((java.lang.Boolean) false);
        schema33.setMaxItems((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema42 = schema33.writeOnly((java.lang.Boolean) false);
        schema23.setExample((java.lang.Object) false);
        schema23.setMaxProperties((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(externalDocumentation34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema42);
    }

    @Test
    public void test17136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17136");
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
        schema19.setWriteOnly((java.lang.Boolean) false);
        schema19.setMinItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema27 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema27.setType("hi!");
        strSchema27.setName("no description");
        io.swagger.oas.models.media.Schema schema33 = strSchema27.type("");
        io.swagger.oas.models.media.Schema schema35 = schema33.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema36 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema36.setType("hi!");
        strSchema36.setName("no description");
        io.swagger.oas.models.media.Schema schema42 = strSchema36.type("");
        io.swagger.oas.models.media.Schema schema44 = schema42.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema45 = schema35.not(schema42);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema46 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str47 = strSchema46.getTitle();
        io.swagger.oas.models.media.Schema schema49 = strSchema46.format("");
        strSchema46.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema52 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema52.setType("hi!");
        strSchema52.setName("no description");
        io.swagger.oas.models.media.Schema schema58 = strSchema52.type("");
        io.swagger.oas.models.media.Schema schema60 = schema58.maxProperties((java.lang.Integer) 100);
        java.lang.String[] strArray62 = new java.lang.String[] { "default" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        schema60.setRequired((java.util.List<java.lang.String>) strList63);
        strSchema46.setRequired((java.util.List<java.lang.String>) strList63);
        io.swagger.oas.models.media.Schema schema67 = schema45.required((java.util.List<java.lang.String>) strList63);
        schema19.setEnum((java.util.List<java.lang.String>) strList63);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation69 = schema19.getExternalDocs();
        schema19.setNullable((java.lang.Boolean) false);
        schema19.setMaxLength((java.lang.Integer) 0);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNull(externalDocumentation69);
    }

    @Test
    public void test17137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17137");
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
        schema17.setMinItems((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema21 = schema17.addRequiredItem("default");
        java.lang.String str22 = schema21.getName();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation23 = null;
        schema21.setExternalDocs(externalDocumentation23);
        io.swagger.oas.models.media.Schema schema26 = schema21.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(schema26);
    }

    @Test
    public void test17138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17138");
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
        io.swagger.oas.models.media.Schema schema19 = schema17.name("default");
        java.lang.String str20 = schema19.getDescription();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema21 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean22 = strSchema21.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation23 = strSchema21.getExternalDocs();
        io.swagger.oas.models.media.Schema schema25 = strSchema21.description("");
        java.lang.Integer int26 = strSchema21.getMaxProperties();
        strSchema21.setType("default");
        java.math.BigDecimal bigDecimal29 = null;
        io.swagger.oas.models.media.Schema schema30 = strSchema21.minimum(bigDecimal29);
        strSchema21.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema34 = strSchema21.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema34.setMaxLength((java.lang.Integer) 100);
        java.util.List<java.lang.String> strList37 = schema34.getRequired();
        schema19.setNot(schema34);
        io.swagger.oas.models.media.Schema schema40 = schema34.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: false\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: */*\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: true\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema42 = schema34.type("");
        schema42.setWriteOnly((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal45 = null;
        io.swagger.oas.models.media.Schema schema46 = schema42.maximum(bigDecimal45);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(externalDocumentation23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNull(strList37);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema46);
    }

    @Test
    public void test17139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17139");
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
        java.math.BigDecimal bigDecimal20 = schema19.getMultipleOf();
        java.lang.Boolean boolean21 = schema19.getReadOnly();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap27 = null;
        io.swagger.oas.models.media.Schema schema28 = strSchema22.properties(strMap27);
        java.lang.String str29 = strSchema22.getPattern();
        strSchema22.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema33 = strSchema22.exclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema35 = strSchema22.maxLength((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema36 = schema19.not(schema35);
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = schema36.getExtensions();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(bigDecimal20);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNull(strMap37);
    }

    @Test
    public void test17140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17140");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.addRequiredItem("*/*");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.readOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.XML xML9 = strSchema0.getXml();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation10 = null;
        strSchema0.setExternalDocs(externalDocumentation10);
        java.lang.Integer int12 = strSchema0.getMinLength();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(xML9);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test17141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17141");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema7 = strSchema0.type("*/*");
        java.math.BigDecimal bigDecimal8 = null;
        strSchema0.setMaximum(bigDecimal8);
        strSchema0.setReadOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema13 = strSchema0.maxLength((java.lang.Integer) (-1));
        schema13.setDeprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema17 = schema13.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema19 = schema13.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema21 = schema19.uniqueItems((java.lang.Boolean) true);
        java.lang.String str22 = schema19.getPattern();
        io.swagger.oas.models.media.Schema schema24 = schema19.exclusiveMaximum((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal25 = null;
        schema19.setMaximum(bigDecimal25);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(schema24);
    }

    @Test
    public void test17142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17142");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        strSchema0.setMaxItems((java.lang.Integer) 10);
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean8 = strSchema0.getExclusiveMaximum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation9 = null;
        io.swagger.oas.models.media.Schema schema10 = strSchema0.externalDocs(externalDocumentation9);
        io.swagger.oas.models.media.Schema schema12 = strSchema0.maxItems((java.lang.Integer) 100);
        strSchema0.setMinLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema15 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema15.setType("hi!");
        java.lang.Boolean boolean18 = strSchema15.getWriteOnly();
        strSchema15.setMaxItems((java.lang.Integer) 10);
        strSchema15.setUniqueItems((java.lang.Boolean) false);
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
        io.swagger.oas.models.media.Schema schema45 = schema42.maxProperties((java.lang.Integer) (-1));
        strSchema15.setNot(schema45);
        java.lang.Integer int47 = strSchema15.getMinProperties();
        java.lang.Object obj48 = strSchema15.getExample();
        strSchema0.setNot((io.swagger.oas.models.media.Schema) strSchema15);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema50 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema50.setType("hi!");
        java.lang.Boolean boolean53 = strSchema50.getWriteOnly();
        strSchema50.setMaxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema57 = strSchema50.$ref("hi!");
        io.swagger.oas.models.media.Schema schema59 = strSchema50.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema61 = schema59.maxItems((java.lang.Integer) 1);
        strSchema0.setAdditionalProperties(schema61);
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema66 = strSchema0.minLength((java.lang.Integer) 0);
        java.math.BigDecimal bigDecimal67 = null;
        io.swagger.oas.models.media.Schema schema68 = schema66.multipleOf(bigDecimal67);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNull(strList31);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNull(int47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(boolean53);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNotNull(schema68);
    }

    @Test
    public void test17143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17143");
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
        strSchema12.setReadOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        strSchema23.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap28 = null;
        io.swagger.oas.models.media.Schema schema29 = strSchema23.properties(strMap28);
        java.lang.String str30 = strSchema23.getPattern();
        strSchema23.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema34 = strSchema23.exclusiveMinimum((java.lang.Boolean) true);
        schema34.setReadOnly((java.lang.Boolean) true);
        schema34.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema40 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema40.setType("hi!");
        java.lang.Boolean boolean43 = strSchema40.getWriteOnly();
        strSchema40.setMaxItems((java.lang.Integer) 10);
        strSchema40.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean48 = strSchema40.getExclusiveMaximum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation49 = null;
        io.swagger.oas.models.media.Schema schema50 = strSchema40.externalDocs(externalDocumentation49);
        schema34.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) strSchema40);
        io.swagger.oas.models.media.XML xML52 = null;
        io.swagger.oas.models.media.Schema schema53 = schema34.xml(xML52);
        java.lang.Boolean boolean54 = schema53.getNullable();
        java.math.BigDecimal bigDecimal55 = null;
        schema53.setMultipleOf(bigDecimal55);
        strSchema12.setAdditionalProperties(schema53);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema58 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema58.setType("hi!");
        strSchema58.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap63 = null;
        io.swagger.oas.models.media.Schema schema64 = strSchema58.properties(strMap63);
        java.lang.String str65 = strSchema58.getPattern();
        strSchema58.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema69 = strSchema58.exclusiveMinimum((java.lang.Boolean) true);
        schema69.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema73 = schema69.type("*/*");
        java.lang.String str74 = schema69.getName();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema75 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema75.setType("hi!");
        java.util.List<java.lang.String> strList78 = strSchema75.getRequired();
        strSchema75.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int81 = strSchema75.getMinLength();
        java.math.BigDecimal bigDecimal82 = null;
        strSchema75.setMinimum(bigDecimal82);
        io.swagger.oas.models.media.Schema schema85 = strSchema75.maxItems((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema87 = schema85.readOnly((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation88 = null;
        io.swagger.oas.models.media.Schema schema89 = schema85.externalDocs(externalDocumentation88);
        io.swagger.oas.models.media.Schema schema90 = schema69.additionalProperties(schema85);
        schema90.setName("class Schema {\n    title: \n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: hi!\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: \n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        strSchema12.setAdditionalProperties(schema90);
        io.swagger.oas.models.media.Schema schema95 = strSchema12.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: no description\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema97 = strSchema12.deprecated((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(bigDecimal19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNull(boolean43);
        org.junit.Assert.assertNull(boolean48);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNull(boolean54);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(strList78);
        org.junit.Assert.assertNull(int81);
        org.junit.Assert.assertNotNull(schema85);
        org.junit.Assert.assertNotNull(schema87);
        org.junit.Assert.assertNotNull(schema89);
        org.junit.Assert.assertNotNull(schema90);
        org.junit.Assert.assertNotNull(schema95);
        org.junit.Assert.assertNotNull(schema97);
    }

    @Test
    public void test17144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17144");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.discriminator(discriminator8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema13 = schema11.maxProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema15 = schema13.nullable((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test17145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17145");
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
        schema20.setMultipleOf(bigDecimal29);
        io.swagger.oas.models.media.XML xML31 = schema20.getXml();
        java.util.List<java.lang.String> strList32 = null;
        io.swagger.oas.models.media.Schema schema33 = schema20.required(strList32);
        schema20.setPattern("hi!");
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(xML31);
        org.junit.Assert.assertNotNull(schema33);
    }

    @Test
    public void test17146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17146");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema6 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema6.setType("hi!");
        java.lang.Boolean boolean9 = strSchema6.getWriteOnly();
        io.swagger.oas.models.media.Schema schema11 = strSchema6.type("default");
        strSchema0.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema6);
        java.util.List<java.lang.String> strList13 = strSchema0.getRequired();
        strSchema0.setPattern("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema16 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema16.setType("hi!");
        strSchema16.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema21 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema21.setType("hi!");
        strSchema21.setName("no description");
        strSchema16.setNot((io.swagger.oas.models.media.Schema) strSchema21);
        java.math.BigDecimal bigDecimal27 = null;
        io.swagger.oas.models.media.Schema schema28 = strSchema16.minimum(bigDecimal27);
        schema28.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema32 = schema28.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema33 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema33.setType("hi!");
        strSchema33.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap38 = null;
        io.swagger.oas.models.media.Schema schema39 = strSchema33.properties(strMap38);
        java.lang.String str40 = strSchema33.getPattern();
        strSchema33.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema44 = strSchema33.exclusiveMinimum((java.lang.Boolean) true);
        schema44.setReadOnly((java.lang.Boolean) true);
        schema44.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema50 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema50.setType("hi!");
        java.lang.Boolean boolean53 = strSchema50.getWriteOnly();
        strSchema50.setMaxItems((java.lang.Integer) 10);
        strSchema50.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean58 = strSchema50.getExclusiveMaximum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation59 = null;
        io.swagger.oas.models.media.Schema schema60 = strSchema50.externalDocs(externalDocumentation59);
        schema44.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) strSchema50);
        io.swagger.oas.models.media.Schema schema63 = schema44.description("default");
        schema63.set$ref("hi!");
        io.swagger.oas.models.media.Schema schema67 = schema63.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema69 = schema63.deprecated((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap70 = schema69.getExtensions();
        schema28.setExtensions(strMap70);
        strSchema0.setExtensions(strMap70);
        java.lang.Boolean boolean73 = strSchema0.getNullable();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(boolean53);
        org.junit.Assert.assertNull(boolean58);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertNull(boolean73);
    }

    @Test
    public void test17147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17147");
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
        javax.ws.rs.Produces produces13 = null;
        javax.ws.rs.Produces produces14 = null;
        io.swagger.oas.models.Components components15 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional16 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces13, produces14, components15);
        io.swagger.oas.models.Components components17 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional18 = io.swagger.jaxrs2.OperationParser.getContents(contentArray0, components17);
        javax.ws.rs.Produces produces19 = null;
        javax.ws.rs.Produces produces20 = null;
        io.swagger.oas.models.Components components21 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional22 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces19, produces20, components21);
        javax.ws.rs.Produces produces23 = null;
        javax.ws.rs.Produces produces24 = null;
        io.swagger.oas.models.Components components25 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional26 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces23, produces24, components25);
        io.swagger.oas.models.Components components27 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional28 = io.swagger.jaxrs2.OperationParser.getContents(contentArray0, components27);
        javax.ws.rs.Produces produces29 = null;
        javax.ws.rs.Produces produces30 = null;
        io.swagger.oas.models.Components components31 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional32 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces29, produces30, components31);
        javax.ws.rs.Produces produces33 = null;
        javax.ws.rs.Produces produces34 = null;
        io.swagger.oas.models.Components components35 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional36 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces33, produces34, components35);
        io.swagger.oas.models.Components components37 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional38 = io.swagger.jaxrs2.OperationParser.getContents(contentArray0, components37);
        javax.ws.rs.Produces produces39 = null;
        javax.ws.rs.Produces produces40 = null;
        io.swagger.oas.models.Components components41 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional42 = io.swagger.jaxrs2.OperationParser.getContent(contentArray0, produces39, produces40, components41);
        io.swagger.oas.models.Components components43 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional44 = io.swagger.jaxrs2.OperationParser.getContents(contentArray0, components43);
        org.junit.Assert.assertNotNull(contentArray0);
        org.junit.Assert.assertNotNull(contentOptional4);
        org.junit.Assert.assertNotNull(contentOptional8);
        org.junit.Assert.assertNotNull(contentOptional12);
        org.junit.Assert.assertNotNull(contentOptional16);
        org.junit.Assert.assertNotNull(contentOptional18);
        org.junit.Assert.assertNotNull(contentOptional22);
        org.junit.Assert.assertNotNull(contentOptional26);
        org.junit.Assert.assertNotNull(contentOptional28);
        org.junit.Assert.assertNotNull(contentOptional32);
        org.junit.Assert.assertNotNull(contentOptional36);
        org.junit.Assert.assertNotNull(contentOptional38);
        org.junit.Assert.assertNotNull(contentOptional42);
        org.junit.Assert.assertNotNull(contentOptional44);
    }

    @Test
    public void test17148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17148");
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema16 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema16.setType("hi!");
        strSchema16.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema21 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema21.setType("hi!");
        strSchema21.setName("no description");
        strSchema16.setNot((io.swagger.oas.models.media.Schema) strSchema21);
        strSchema16.setMinProperties((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = strSchema16.getExtensions();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap30 = null;
        strSchema16.setProperties(strMap30);
        java.math.BigDecimal bigDecimal32 = null;
        io.swagger.oas.models.media.Schema schema33 = strSchema16.maximum(bigDecimal32);
        io.swagger.oas.models.media.Schema schema34 = strSchema0.addProperties("", (io.swagger.oas.models.media.Schema) strSchema16);
        io.swagger.oas.models.media.XML xML35 = null;
        schema34.setXml(xML35);
        io.swagger.oas.models.media.Schema schema38 = schema34.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema40 = schema38.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema42 = schema38.title("");
        java.math.BigDecimal bigDecimal43 = null;
        schema38.setMinimum(bigDecimal43);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(strMap29);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema42);
    }

    @Test
    public void test17149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17149");
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
        java.lang.Boolean boolean15 = schema14.getReadOnly();
        io.swagger.oas.models.media.Schema schema17 = schema14.exclusiveMinimum((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal18 = null;
        schema17.setMaximum(bigDecimal18);
        io.swagger.oas.models.media.XML xML20 = null;
        io.swagger.oas.models.media.Schema schema21 = schema17.xml(xML20);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test17150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17150");
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
        io.swagger.oas.models.media.Schema schema17 = schema12.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema18 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema18.setType("hi!");
        strSchema18.setName("no description");
        io.swagger.oas.models.media.Schema schema24 = strSchema18.type("");
        java.lang.Integer int25 = schema24.getMaxProperties();
        java.math.BigDecimal bigDecimal26 = null;
        schema24.setMinimum(bigDecimal26);
        java.math.BigDecimal bigDecimal28 = null;
        schema24.setMinimum(bigDecimal28);
        java.lang.String str30 = schema24.getFormat();
        io.swagger.oas.models.media.Schema schema32 = schema24.name("*/*");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema33 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema33.setType("hi!");
        strSchema33.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap38 = null;
        io.swagger.oas.models.media.Schema schema39 = strSchema33.properties(strMap38);
        java.lang.String str40 = strSchema33.getPattern();
        strSchema33.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema44 = strSchema33.exclusiveMinimum((java.lang.Boolean) true);
        schema44.setReadOnly((java.lang.Boolean) true);
        schema44.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema50 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema50.setType("hi!");
        java.lang.Boolean boolean53 = strSchema50.getWriteOnly();
        strSchema50.setMaxItems((java.lang.Integer) 10);
        strSchema50.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean58 = strSchema50.getExclusiveMaximum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation59 = null;
        io.swagger.oas.models.media.Schema schema60 = strSchema50.externalDocs(externalDocumentation59);
        schema44.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) strSchema50);
        io.swagger.oas.models.media.Schema schema63 = schema44.description("default");
        io.swagger.oas.models.media.Schema schema65 = schema44.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        boolean boolean66 = schema24.equals((java.lang.Object) schema44);
        schema17.setExample((java.lang.Object) schema24);
        io.swagger.oas.models.media.Schema schema69 = schema24.exclusiveMinimum((java.lang.Boolean) true);
        schema69.setNullable((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(boolean53);
        org.junit.Assert.assertNull(boolean58);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(schema69);
    }

    @Test
    public void test17151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17151");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        java.lang.String str10 = schema6.getType();
        java.math.BigDecimal bigDecimal11 = null;
        schema6.setMaximum(bigDecimal11);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        strSchema13.setName("no description");
        io.swagger.oas.models.media.Schema schema19 = strSchema13.type("");
        io.swagger.oas.models.media.Schema schema21 = schema19.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema23 = schema19.nullable((java.lang.Boolean) true);
        schema23.setWriteOnly((java.lang.Boolean) false);
        schema6.setDefault((java.lang.Object) schema23);
        schema6.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema29 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema29.setType("hi!");
        strSchema29.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema34 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema34.setType("hi!");
        strSchema34.setName("no description");
        strSchema29.setNot((io.swagger.oas.models.media.Schema) strSchema34);
        java.lang.String str40 = strSchema29.getDescription();
        io.swagger.oas.models.media.Schema schema42 = strSchema29.description("");
        schema42.addEnumItemObject("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str45 = schema42.get$ref();
        io.swagger.oas.models.media.Schema schema46 = schema6.example((java.lang.Object) schema42);
        schema6.setPattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: false\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(schema46);
    }

    @Test
    public void test17152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17152");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema7 = strSchema0.type("*/*");
        java.math.BigDecimal bigDecimal8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema7.minimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema9.addRequiredItem("default");
        io.swagger.oas.models.media.Schema schema13 = schema11.maxProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean15 = strSchema14.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation16 = strSchema14.getExternalDocs();
        io.swagger.oas.models.media.Schema schema18 = strSchema14.description("");
        strSchema14.setDefault((java.lang.Object) (byte) 100);
        java.math.BigDecimal bigDecimal21 = null;
        io.swagger.oas.models.media.Schema schema22 = strSchema14.maximum(bigDecimal21);
        io.swagger.oas.models.media.Schema schema24 = schema22.format("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: 0\n    minProperties: 0\n    required: []\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema25 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema25.setType("hi!");
        strSchema25.setName("no description");
        io.swagger.oas.models.media.Schema schema31 = strSchema25.type("");
        io.swagger.oas.models.media.Schema schema33 = strSchema25.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema35 = strSchema25.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray38 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        schema35.setRequired((java.util.List<java.lang.String>) strList39);
        io.swagger.oas.models.media.XML xML42 = null;
        schema35.setXml(xML42);
        schema35.setMaxItems((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema47 = schema35.deprecated((java.lang.Boolean) false);
        java.util.List<java.lang.String> strList48 = schema47.getRequired();
        schema24.setRequired(strList48);
        io.swagger.oas.models.media.Schema schema50 = schema11.required(strList48);
        io.swagger.oas.models.media.Discriminator discriminator51 = null;
        schema11.setDiscriminator(discriminator51);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(externalDocumentation16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(schema50);
    }

    @Test
    public void test17153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17153");
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
        io.swagger.oas.models.media.Schema schema32 = schema29.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema33 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema33.setType("hi!");
        strSchema33.setName("no description");
        io.swagger.oas.models.media.Schema schema39 = strSchema33.type("");
        io.swagger.oas.models.media.Schema schema41 = schema39.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int42 = schema41.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema43 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema43.setType("hi!");
        strSchema43.setName("no description");
        io.swagger.oas.models.media.Schema schema49 = strSchema43.type("");
        io.swagger.oas.models.media.Schema schema51 = schema49.format("no description");
        io.swagger.oas.models.media.Schema schema52 = schema41.not(schema51);
        java.math.BigDecimal bigDecimal53 = null;
        io.swagger.oas.models.media.Schema schema54 = schema51.multipleOf(bigDecimal53);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation55 = null;
        io.swagger.oas.models.media.Schema schema56 = schema51.externalDocs(externalDocumentation55);
        io.swagger.oas.models.media.Schema schema58 = schema56.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation59 = schema58.getExternalDocs();
        java.lang.Integer int60 = schema58.getMinProperties();
        io.swagger.oas.models.media.Schema schema62 = schema58.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: true\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema29.setExample((java.lang.Object) schema62);
        java.math.BigDecimal bigDecimal64 = schema62.getMaximum();
        java.math.BigDecimal bigDecimal65 = null;
        schema62.setMaximum(bigDecimal65);
        io.swagger.oas.models.media.Schema schema68 = schema62.nullable((java.lang.Boolean) true);
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
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(int42);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNull(externalDocumentation59);
        org.junit.Assert.assertNull(int60);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertNull(bigDecimal64);
        org.junit.Assert.assertNotNull(schema68);
    }

    @Test
    public void test17154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17154");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        io.swagger.oas.models.media.Discriminator discriminator7 = null;
        io.swagger.oas.models.media.Schema schema8 = strSchema0.discriminator(discriminator7);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str10 = strSchema9.getTitle();
        io.swagger.oas.models.media.Schema schema12 = strSchema9.format("");
        io.swagger.oas.models.media.Schema schema14 = strSchema9.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema16 = schema14.writeOnly((java.lang.Boolean) true);
        schema8.setNot(schema16);
        io.swagger.oas.models.media.XML xML18 = null;
        schema16.setXml(xML18);
        io.swagger.oas.models.media.Schema schema21 = schema16.deprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema22 = schema16.getAdditionalProperties();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(schema22);
    }

    @Test
    public void test17155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17155");
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
        java.lang.String str28 = schema13.getName();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "no description" + "'", str28, "no description");
    }

    @Test
    public void test17156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17156");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getDeprecated();
        boolean boolean5 = strSchema0.equals((java.lang.Object) "default");
        java.math.BigDecimal bigDecimal6 = null;
        io.swagger.oas.models.media.Schema schema7 = strSchema0.multipleOf(bigDecimal6);
        io.swagger.oas.models.media.Schema schema9 = strSchema0.deprecated((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal10 = null;
        io.swagger.oas.models.media.Schema schema11 = schema9.multipleOf(bigDecimal10);
        java.lang.String str12 = schema11.get$ref();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17157");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.addRequiredItem("");
        io.swagger.oas.models.media.Schema schema8 = schema6.exclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean9 = schema6.getWriteOnly();
        java.lang.Integer int10 = schema6.getMaxLength();
        io.swagger.oas.annotations.media.Content[] contentArray11 = new io.swagger.oas.annotations.media.Content[] {};
        javax.ws.rs.Produces produces12 = null;
        javax.ws.rs.Produces produces13 = null;
        io.swagger.oas.models.Components components14 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional15 = io.swagger.jaxrs2.OperationParser.getContent(contentArray11, produces12, produces13, components14);
        javax.ws.rs.Produces produces16 = null;
        javax.ws.rs.Produces produces17 = null;
        io.swagger.oas.models.Components components18 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional19 = io.swagger.jaxrs2.OperationParser.getContent(contentArray11, produces16, produces17, components18);
        javax.ws.rs.Produces produces20 = null;
        javax.ws.rs.Produces produces21 = null;
        io.swagger.oas.models.Components components22 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional23 = io.swagger.jaxrs2.OperationParser.getContent(contentArray11, produces20, produces21, components22);
        javax.ws.rs.Produces produces24 = null;
        javax.ws.rs.Produces produces25 = null;
        io.swagger.oas.models.Components components26 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional27 = io.swagger.jaxrs2.OperationParser.getContent(contentArray11, produces24, produces25, components26);
        io.swagger.oas.models.Components components28 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional29 = io.swagger.jaxrs2.OperationParser.getContents(contentArray11, components28);
        javax.ws.rs.Produces produces30 = null;
        javax.ws.rs.Produces produces31 = null;
        io.swagger.oas.models.Components components32 = null;
        java.util.Optional<io.swagger.oas.models.media.Content> contentOptional33 = io.swagger.jaxrs2.OperationParser.getContent(contentArray11, produces30, produces31, components32);
        boolean boolean34 = schema6.equals((java.lang.Object) components32);
        schema6.setType("class Schema {\n    title: \n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: hi!\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: \n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema37 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema37.setType("hi!");
        strSchema37.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap42 = null;
        io.swagger.oas.models.media.Schema schema43 = strSchema37.properties(strMap42);
        java.lang.String str44 = strSchema37.getPattern();
        strSchema37.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema48 = strSchema37.exclusiveMinimum((java.lang.Boolean) true);
        schema48.setReadOnly((java.lang.Boolean) true);
        schema48.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema54 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema54.setType("hi!");
        java.lang.Boolean boolean57 = strSchema54.getWriteOnly();
        strSchema54.setMaxItems((java.lang.Integer) 10);
        strSchema54.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean62 = strSchema54.getExclusiveMaximum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation63 = null;
        io.swagger.oas.models.media.Schema schema64 = strSchema54.externalDocs(externalDocumentation63);
        schema48.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) strSchema54);
        io.swagger.oas.models.media.XML xML66 = null;
        io.swagger.oas.models.media.Schema schema67 = schema48.xml(xML66);
        java.lang.Boolean boolean68 = schema67.getNullable();
        java.math.BigDecimal bigDecimal69 = null;
        schema67.setMultipleOf(bigDecimal69);
        io.swagger.oas.models.media.Schema schema72 = schema67.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema73 = schema6.example((java.lang.Object) schema72);
        java.lang.String str74 = schema72.getPattern();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(contentArray11);
        org.junit.Assert.assertNotNull(contentOptional15);
        org.junit.Assert.assertNotNull(contentOptional19);
        org.junit.Assert.assertNotNull(contentOptional23);
        org.junit.Assert.assertNotNull(contentOptional27);
        org.junit.Assert.assertNotNull(contentOptional29);
        org.junit.Assert.assertNotNull(contentOptional33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNull(boolean57);
        org.junit.Assert.assertNull(boolean62);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNull(boolean68);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test17158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17158");
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
        io.swagger.oas.models.media.Schema schema22 = strSchema0.deprecated((java.lang.Boolean) false);
        io.swagger.oas.annotations.servers.Server server23 = null;
        io.swagger.oas.annotations.servers.Server[] serverArray24 = new io.swagger.oas.annotations.servers.Server[] { server23 };
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional25 = io.swagger.jaxrs2.OperationParser.getServers(serverArray24);
        strSchema0.setExample((java.lang.Object) serverArray24);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional27 = io.swagger.jaxrs2.OperationParser.getServers(serverArray24);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional28 = io.swagger.jaxrs2.OperationParser.getServers(serverArray24);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional29 = io.swagger.jaxrs2.OperationParser.getServers(serverArray24);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional30 = io.swagger.jaxrs2.OperationParser.getServers(serverArray24);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional31 = io.swagger.jaxrs2.OperationParser.getServers(serverArray24);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional32 = io.swagger.jaxrs2.OperationParser.getServers(serverArray24);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional33 = io.swagger.jaxrs2.OperationParser.getServers(serverArray24);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional34 = io.swagger.jaxrs2.OperationParser.getServers(serverArray24);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional35 = io.swagger.jaxrs2.OperationParser.getServers(serverArray24);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional36 = io.swagger.jaxrs2.OperationParser.getServers(serverArray24);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional37 = io.swagger.jaxrs2.OperationParser.getServers(serverArray24);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(serverArray24);
        org.junit.Assert.assertNotNull(serverListOptional25);
        org.junit.Assert.assertNotNull(serverListOptional27);
        org.junit.Assert.assertNotNull(serverListOptional28);
        org.junit.Assert.assertNotNull(serverListOptional29);
        org.junit.Assert.assertNotNull(serverListOptional30);
        org.junit.Assert.assertNotNull(serverListOptional31);
        org.junit.Assert.assertNotNull(serverListOptional32);
        org.junit.Assert.assertNotNull(serverListOptional33);
        org.junit.Assert.assertNotNull(serverListOptional34);
        org.junit.Assert.assertNotNull(serverListOptional35);
        org.junit.Assert.assertNotNull(serverListOptional36);
        org.junit.Assert.assertNotNull(serverListOptional37);
    }

    @Test
    public void test17159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17159");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema6.discriminator(discriminator8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal12 = null;
        io.swagger.oas.models.media.Schema schema13 = schema11.minimum(bigDecimal12);
        io.swagger.oas.models.media.Schema schema15 = schema11.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation16 = null;
        io.swagger.oas.models.media.Schema schema17 = schema15.externalDocs(externalDocumentation16);
        io.swagger.oas.models.media.Schema schema19 = schema15.minProperties((java.lang.Integer) 0);
        schema15.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: 10\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: true\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test17160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17160");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        io.swagger.oas.models.media.Discriminator discriminator7 = null;
        io.swagger.oas.models.media.Schema schema8 = strSchema0.discriminator(discriminator7);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap9 = null;
        strSchema0.setProperties(strMap9);
        strSchema0.setExclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema14 = strSchema0.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema16 = strSchema0.nullable((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema18 = strSchema0.exclusiveMinimum((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
    }

    @Test
    public void test17161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17161");
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
        schema26.setReadOnly((java.lang.Boolean) false);
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
    }

    @Test
    public void test17162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17162");
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
        io.swagger.oas.models.media.Schema schema20 = strSchema0.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema22 = strSchema0.maxItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema24 = strSchema0.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema25 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema25.setType("hi!");
        strSchema25.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean30 = strSchema25.getDeprecated();
        io.swagger.oas.models.media.Schema schema32 = strSchema25.$ref("");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema33 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema33.setType("hi!");
        strSchema33.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap38 = null;
        io.swagger.oas.models.media.Schema schema39 = strSchema33.properties(strMap38);
        java.lang.Integer int40 = schema39.getMaxProperties();
        io.swagger.oas.models.media.Schema schema42 = schema39.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema43 = schema32.not(schema42);
        java.util.List<java.lang.String> strList44 = schema42.getEnum();
        strSchema0.setExample((java.lang.Object) schema42);
        io.swagger.oas.models.media.Schema schema47 = schema42.maxItems((java.lang.Integer) (-1));
        schema42.setExclusiveMaximum((java.lang.Boolean) false);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNull(int40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNull(strList44);
        org.junit.Assert.assertNotNull(schema47);
    }

    @Test
    public void test17163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17163");
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema27 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema27.setType("hi!");
        strSchema27.setName("no description");
        io.swagger.oas.models.media.Schema schema33 = strSchema27.type("");
        java.lang.Integer int34 = schema33.getMaxProperties();
        java.math.BigDecimal bigDecimal35 = null;
        schema33.setMinimum(bigDecimal35);
        io.swagger.oas.models.media.Schema schema38 = schema33.maxLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal39 = schema33.getMinimum();
        io.swagger.oas.models.media.Schema schema41 = schema33.minProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Discriminator discriminator42 = null;
        io.swagger.oas.models.media.Schema schema43 = schema41.discriminator(discriminator42);
        io.swagger.oas.models.media.Schema schema45 = schema41.writeOnly((java.lang.Boolean) true);
        strSchema0.setAdditionalProperties(schema41);
        java.lang.String str47 = strSchema0.getFormat();
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
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(bigDecimal39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test17164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17164");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        strSchema0.setMaxItems((java.lang.Integer) 10);
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean8 = strSchema0.getExclusiveMaximum();
        io.swagger.oas.models.media.Schema schema10 = strSchema0.minProperties((java.lang.Integer) 0);
        java.lang.Boolean boolean11 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.XML xML12 = strSchema0.getXml();
        io.swagger.oas.models.media.Schema schema14 = strSchema0.exclusiveMinimum((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = schema14.getExtensions();
        java.util.List<java.lang.String> strList16 = schema14.getRequired();
        schema14.setMaxProperties((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(xML12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strList16);
    }

    @Test
    public void test17165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17165");
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
        io.swagger.oas.models.media.Schema schema22 = schema11.type("hi!");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap23 = null;
        io.swagger.oas.models.media.Schema schema24 = schema11.properties(strMap23);
        schema11.setMinLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema28 = schema11.minProperties((java.lang.Integer) (-1));
        schema11.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: null\n    required: null\n    type: */*\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: #/components/schemas/default\n    nullable: false\n    readOnly: false\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
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
        org.junit.Assert.assertNotNull(schema28);
    }

    @Test
    public void test17166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17166");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema8 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema8.setType("hi!");
        strSchema8.setDefault((java.lang.Object) '#');
        java.math.BigDecimal bigDecimal13 = null;
        io.swagger.oas.models.media.Schema schema14 = strSchema8.multipleOf(bigDecimal13);
        io.swagger.oas.models.media.Schema schema15 = schema6.not(schema14);
        io.swagger.oas.models.media.Schema schema17 = schema15.minProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema19 = schema15.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation20 = null;
        io.swagger.oas.models.media.Schema schema21 = schema15.externalDocs(externalDocumentation20);
        io.swagger.oas.models.media.Schema schema23 = schema15.description("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: true\n    maxProperties: 0\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema23.setUniqueItems((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
    }

    @Test
    public void test17167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17167");
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
        java.lang.Integer int19 = strSchema11.getMinItems();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = strSchema11.getExtensions();
        io.swagger.oas.models.media.Schema schema22 = strSchema11.writeOnly((java.lang.Boolean) true);
        java.lang.Boolean boolean23 = schema22.getUniqueItems();
        java.math.BigDecimal bigDecimal24 = null;
        io.swagger.oas.models.media.Schema schema25 = schema22.multipleOf(bigDecimal24);
        schema25.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str28 = schema25.get$ref();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test17168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17168");
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
        io.swagger.oas.models.media.Schema schema31 = strSchema19.getNot();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema32 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema32.setType("hi!");
        io.swagger.oas.models.media.Schema schema36 = strSchema32.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema38 = schema36.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean39 = schema38.getExclusiveMaximum();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap40 = schema38.getProperties();
        io.swagger.oas.models.media.Schema schema42 = schema38.format("");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema43 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema43.setType("hi!");
        io.swagger.oas.models.media.Schema schema47 = strSchema43.maxLength((java.lang.Integer) 1);
        schema47.setPattern("");
        io.swagger.oas.models.media.Schema schema51 = schema47.maxItems((java.lang.Integer) 10);
        java.lang.String[] strArray55 = new java.lang.String[] { "default", "", "no description" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        schema51.setEnum((java.util.List<java.lang.String>) strList56);
        schema42.setEnum((java.util.List<java.lang.String>) strList56);
        strSchema19.setEnum((java.util.List<java.lang.String>) strList56);
        java.lang.Integer int61 = strSchema19.getMaxProperties();
        strSchema19.setMinLength((java.lang.Integer) 1);
        strSchema19.setMinLength((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap66 = strSchema19.getExtensions();
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
        org.junit.Assert.assertNull(schema31);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(boolean39);
        org.junit.Assert.assertNull(strMap40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(int61);
        org.junit.Assert.assertNull(strMap66);
    }

    @Test
    public void test17169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17169");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema6 = schema4.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean7 = schema6.getExclusiveMaximum();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap8 = schema6.getProperties();
        io.swagger.oas.models.media.Schema schema10 = schema6.minLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema10.getNot();
        java.lang.Boolean boolean12 = schema10.getExclusiveMinimum();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(schema11);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test17170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17170");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        io.swagger.oas.models.media.Schema schema4 = strSchema0.maxLength((java.lang.Integer) 1);
        schema4.setPattern("");
        io.swagger.oas.models.media.Schema schema8 = schema4.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema10 = schema4.minItems((java.lang.Integer) 100);
        java.util.List<java.lang.String> strList11 = schema10.getEnum();
        java.lang.Boolean boolean12 = schema10.getUniqueItems();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test17171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17171");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        strSchema0.setMaxLength((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema8 = strSchema0.nullable((java.lang.Boolean) false);
        java.util.List<java.lang.String> strList9 = strSchema0.getRequired();
        io.swagger.oas.models.media.Schema schema11 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema13 = schema11.description("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.math.BigDecimal bigDecimal14 = schema11.getMinimum();
        schema11.setFormat("no description");
        java.lang.Boolean boolean17 = schema11.getExclusiveMinimum();
        schema11.setDeprecated((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(bigDecimal14);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test17172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17172");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        strSchema0.setMaxLength((java.lang.Integer) 100);
        java.lang.String str7 = strSchema0.toString();
        io.swagger.oas.models.media.Schema schema9 = strSchema0.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation10 = null;
        io.swagger.oas.models.media.Schema schema11 = schema9.externalDocs(externalDocumentation10);
        io.swagger.oas.models.media.Discriminator discriminator12 = null;
        schema9.setDiscriminator(discriminator12);
        io.swagger.oas.models.media.XML xML14 = schema9.getXml();
        schema9.setName("*/*");
        java.lang.Integer int17 = schema9.getMinLength();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str7, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(xML14);
        org.junit.Assert.assertNull(int17);
    }

    @Test
    public void test17173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17173");
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
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap28 = null;
        io.swagger.oas.models.media.Schema schema29 = schema23.properties(strMap28);
        io.swagger.oas.models.media.Schema schema31 = schema29.deprecated((java.lang.Boolean) false);
        schema31.setMinItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema35 = schema31.name("class Schema {\n    title: no description\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: 100\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: #/components/schemas/\n    nullable: null\n    readOnly: true\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Integer int36 = schema31.getMaxItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema37 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema37.setType("hi!");
        strSchema37.setName("no description");
        io.swagger.oas.models.media.Schema schema43 = strSchema37.type("");
        schema43.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema47 = schema43.addRequiredItem("");
        io.swagger.oas.models.media.Schema schema49 = schema43.minItems((java.lang.Integer) 0);
        schema49.setMinLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema53 = schema49.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema55 = schema53.exclusiveMinimum((java.lang.Boolean) false);
        schema31.setExample((java.lang.Object) schema53);
        java.lang.String str57 = schema53.getPattern();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test17174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17174");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        strSchema0.setDeprecated((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = strSchema0.getExtensions();
        java.lang.Integer int7 = strSchema0.getMinItems();
        io.swagger.oas.models.media.Schema schema9 = strSchema0.pattern("");
        schema9.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema13 = schema9.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: false\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: */*\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: true\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema14 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema14.setType("hi!");
        strSchema14.setName("no description");
        io.swagger.oas.models.media.Schema schema20 = strSchema14.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation21 = schema20.getExternalDocs();
        schema20.setUniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema24 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema24.setType("hi!");
        strSchema24.setName("no description");
        io.swagger.oas.models.media.Schema schema30 = strSchema24.type("");
        io.swagger.oas.models.media.Schema schema32 = strSchema24.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema34 = strSchema24.addRequiredItem("");
        schema20.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema24);
        io.swagger.oas.models.media.Schema schema37 = schema20.minItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema38 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema38.setType("hi!");
        java.lang.Boolean boolean41 = strSchema38.getWriteOnly();
        io.swagger.oas.models.media.Schema schema43 = strSchema38.type("default");
        java.lang.String str44 = schema43.getDescription();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema46 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema46.setType("hi!");
        strSchema46.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap51 = null;
        io.swagger.oas.models.media.Schema schema52 = strSchema46.properties(strMap51);
        io.swagger.oas.models.media.Schema schema54 = strSchema46.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema55 = schema43.addProperties("no description", schema54);
        io.swagger.oas.models.media.Schema schema57 = schema43.exclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema59 = schema57.$ref("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema60 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str61 = strSchema60.getTitle();
        io.swagger.oas.models.media.Schema schema63 = strSchema60.format("");
        strSchema60.setDeprecated((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal66 = strSchema60.getMaximum();
        java.math.BigDecimal bigDecimal67 = strSchema60.getMinimum();
        io.swagger.oas.models.media.Schema schema69 = strSchema60.deprecated((java.lang.Boolean) true);
        schema69.setMinLength((java.lang.Integer) (-1));
        schema59.setExample((java.lang.Object) schema69);
        io.swagger.oas.models.media.Schema schema74 = schema59.readOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Discriminator discriminator75 = null;
        schema74.setDiscriminator(discriminator75);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap77 = schema74.getProperties();
        io.swagger.oas.models.media.Schema schema78 = schema20.properties(strMap77);
        schema13.setProperties(strMap77);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(externalDocumentation21);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNull(boolean41);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNull(bigDecimal66);
        org.junit.Assert.assertNull(bigDecimal67);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertNotNull(schema78);
    }

    @Test
    public void test17175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17175");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema7 = strSchema0.type("*/*");
        java.math.BigDecimal bigDecimal8 = null;
        strSchema0.setMaximum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = strSchema0.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema13 = strSchema0.readOnly((java.lang.Boolean) false);
        schema13.setExclusiveMinimum((java.lang.Boolean) true);
        java.lang.String str16 = schema13.getFormat();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test17176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17176");
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
        java.util.List<java.lang.String> strList17 = schema14.getEnum();
        io.swagger.oas.models.media.Schema schema19 = schema14.nullable((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test17177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17177");
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
        io.swagger.oas.models.media.Schema schema19 = schema17.minLength((java.lang.Integer) (-1));
        java.lang.String str20 = schema17.getPattern();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test17178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17178");
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
        io.swagger.oas.models.media.Schema schema20 = strSchema0.deprecated((java.lang.Boolean) true);
        strSchema0.setMaxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        strSchema23.setName("no description");
        io.swagger.oas.models.media.Schema schema29 = strSchema23.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation30 = schema29.getExternalDocs();
        io.swagger.oas.models.media.Schema schema32 = schema29.maxProperties((java.lang.Integer) 1);
        java.lang.String str33 = schema29.get$ref();
        java.lang.String str34 = schema29.get$ref();
        io.swagger.oas.models.media.Schema schema36 = schema29.minProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.XML xML37 = null;
        schema29.setXml(xML37);
        strSchema0.setAdditionalProperties(schema29);
        schema29.setMaxProperties((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(externalDocumentation30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(schema36);
    }

    @Test
    public void test17179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17179");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        io.swagger.oas.models.media.Schema schema5 = strSchema0.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema7 = schema5.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation8 = schema5.getExternalDocs();
        io.swagger.oas.models.media.Discriminator discriminator9 = null;
        schema5.setDiscriminator(discriminator9);
        io.swagger.oas.models.media.Schema schema12 = schema5.exclusiveMinimum((java.lang.Boolean) false);
        schema12.setPattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: 0\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNull(externalDocumentation8);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test17180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17180");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema8 = schema6.getNot();
        schema6.setMaxLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema12 = schema6.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema14 = schema6.minProperties((java.lang.Integer) 10);
        schema6.setExclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema18 = schema6.minProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema20 = schema6.format("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: no description\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.XML xML21 = schema20.getXml();
        schema20.setMinItems((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(schema8);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(xML21);
    }

    @Test
    public void test17181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17181");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        schema6.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean9 = schema6.getExclusiveMinimum();
        schema6.addEnumItemObject("default");
        java.math.BigDecimal bigDecimal12 = null;
        schema6.setMaximum(bigDecimal12);
        io.swagger.oas.models.media.XML xML14 = schema6.getXml();
        io.swagger.oas.models.media.Discriminator discriminator15 = schema6.getDiscriminator();
        io.swagger.oas.models.media.Schema schema17 = schema6.exclusiveMinimum((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal18 = null;
        io.swagger.oas.models.media.Schema schema19 = schema17.minimum(bigDecimal18);
        io.swagger.oas.models.media.Schema schema21 = schema17.maxItems((java.lang.Integer) 10);
        java.util.List<java.lang.String> strList22 = schema21.getRequired();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(xML14);
        org.junit.Assert.assertNull(discriminator15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(strList22);
    }

    @Test
    public void test17182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17182");
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
        java.lang.Boolean boolean15 = schema6.getReadOnly();
        io.swagger.oas.models.media.XML xML16 = null;
        schema6.setXml(xML16);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
    }

    @Test
    public void test17183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17183");
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
        java.lang.String str24 = schema23.getType();
        java.lang.Object obj25 = null;
        io.swagger.oas.models.media.Schema schema26 = schema23.example(obj25);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema27 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema27.setType("hi!");
        strSchema27.setName("no description");
        io.swagger.oas.models.media.Schema schema33 = strSchema27.type("");
        java.lang.Integer int34 = schema33.getMaxProperties();
        java.math.BigDecimal bigDecimal35 = null;
        schema33.setMinimum(bigDecimal35);
        io.swagger.oas.models.media.Schema schema38 = schema33.maxProperties((java.lang.Integer) 1);
        schema38.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Discriminator discriminator41 = schema38.getDiscriminator();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation42 = null;
        io.swagger.oas.models.media.Schema schema43 = schema38.externalDocs(externalDocumentation42);
        schema26.setAdditionalProperties(schema43);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema45 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema45.setType("hi!");
        strSchema45.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap50 = null;
        io.swagger.oas.models.media.Schema schema51 = strSchema45.properties(strMap50);
        java.lang.String str52 = strSchema45.getPattern();
        strSchema45.setMaxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema56 = strSchema45.exclusiveMinimum((java.lang.Boolean) true);
        schema56.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema60 = schema56.type("*/*");
        java.lang.String str61 = schema56.getName();
        io.swagger.oas.models.media.Schema schema63 = schema56.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema43.setNot(schema56);
        schema56.setMaxItems((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(discriminator41);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(schema63);
    }

    @Test
    public void test17184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17184");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Boolean boolean6 = strSchema0.getDeprecated();
        java.math.BigDecimal bigDecimal7 = strSchema0.getMultipleOf();
        io.swagger.oas.models.media.Schema schema9 = strSchema0.$ref("no description");
        java.math.BigDecimal bigDecimal10 = null;
        io.swagger.oas.models.media.Schema schema11 = schema9.multipleOf(bigDecimal10);
        io.swagger.oas.models.media.Schema schema13 = schema9.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema15 = schema9.$ref("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema17 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema17.setType("hi!");
        strSchema17.setName("no description");
        io.swagger.oas.models.media.Schema schema23 = strSchema17.type("");
        io.swagger.oas.models.media.Schema schema25 = schema23.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema26 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema26.setType("hi!");
        strSchema26.setName("no description");
        io.swagger.oas.models.media.Schema schema32 = strSchema26.type("");
        io.swagger.oas.models.media.Schema schema34 = schema32.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema35 = schema25.not(schema32);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema36 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str37 = strSchema36.getTitle();
        io.swagger.oas.models.media.Schema schema39 = strSchema36.format("");
        strSchema36.setDeprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema42 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema42.setType("hi!");
        strSchema42.setName("no description");
        io.swagger.oas.models.media.Schema schema48 = strSchema42.type("");
        io.swagger.oas.models.media.Schema schema50 = schema48.maxProperties((java.lang.Integer) 100);
        java.lang.String[] strArray52 = new java.lang.String[] { "default" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        schema50.setRequired((java.util.List<java.lang.String>) strList53);
        strSchema36.setRequired((java.util.List<java.lang.String>) strList53);
        io.swagger.oas.models.media.Schema schema57 = schema35.required((java.util.List<java.lang.String>) strList53);
        java.lang.Integer int58 = schema35.getMinLength();
        io.swagger.oas.models.media.Discriminator discriminator59 = null;
        schema35.setDiscriminator(discriminator59);
        io.swagger.oas.models.media.Schema schema61 = schema9.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema35);
        java.math.BigDecimal bigDecimal62 = null;
        io.swagger.oas.models.media.Schema schema63 = schema35.maximum(bigDecimal62);
        schema35.setReadOnly((java.lang.Boolean) false);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNull(int58);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNotNull(schema63);
    }

    @Test
    public void test17185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17185");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        strSchema0.setMaxLength((java.lang.Integer) 0);
        java.lang.Integer int9 = strSchema0.getMaxProperties();
        io.swagger.oas.models.media.Schema schema11 = strSchema0.description("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean17 = strSchema12.getDeprecated();
        io.swagger.oas.models.media.Schema schema19 = strSchema12.nullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema21 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema21.setType("hi!");
        strSchema21.setExclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema27 = strSchema21.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema28 = schema19.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (io.swagger.oas.models.media.Schema) strSchema21);
        io.swagger.oas.models.media.Schema schema30 = schema19.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema32 = schema19.exclusiveMaximum((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap33 = null;
        schema19.setProperties(strMap33);
        schema19.setDescription("class Schema {\n    title: \n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: hi!\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: \n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema37 = strSchema0.example((java.lang.Object) schema19);
        strSchema0.setPattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: true\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema37);
    }

    @Test
    public void test17186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17186");
        io.swagger.jaxrs2.OperationParser.MEDIA_TYPE = "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: 1\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}";
    }

    @Test
    public void test17187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17187");
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
        io.swagger.oas.models.media.XML xML22 = schema10.getXml();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        strSchema23.setName("no description");
        io.swagger.oas.models.media.Schema schema29 = strSchema23.addRequiredItem("*/*");
        io.swagger.oas.models.media.Schema schema31 = schema29.minItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema33 = schema29.exclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema34 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema34.setType("hi!");
        strSchema34.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap39 = null;
        io.swagger.oas.models.media.Schema schema40 = strSchema34.properties(strMap39);
        java.lang.Integer int41 = schema40.getMaxProperties();
        io.swagger.oas.models.media.Schema schema43 = schema40.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema45 = schema40.name("hi!");
        io.swagger.oas.models.media.Schema schema47 = schema40.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema49 = schema47.name("no description");
        schema33.setAdditionalProperties(schema49);
        java.util.List<java.lang.String> strList51 = schema33.getRequired();
        io.swagger.oas.models.media.Schema schema52 = schema10.required(strList51);
        schema10.addEnumItemObject("#/components/schemas/class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(xML22);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(schema52);
    }

    @Test
    public void test17188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17188");
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
        io.swagger.oas.models.media.Schema schema22 = schema11.type("hi!");
        io.swagger.oas.models.media.Schema schema24 = schema11.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema26 = schema24.pattern("hi!");
        schema24.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Integer int29 = schema24.getMaxLength();
        io.swagger.oas.models.media.Schema schema31 = schema24.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema33 = schema24.minLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema35 = schema33.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema36 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema36.setType("hi!");
        strSchema36.setName("no description");
        io.swagger.oas.models.media.Schema schema42 = strSchema36.type("");
        io.swagger.oas.models.media.Schema schema44 = schema42.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema46 = schema42.addRequiredItem("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema47 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema47.setType("hi!");
        java.lang.Boolean boolean50 = strSchema47.getWriteOnly();
        io.swagger.oas.models.media.Schema schema52 = strSchema47.type("default");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap53 = strSchema47.getProperties();
        schema46.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema47);
        java.lang.String str55 = strSchema47.getPattern();
        io.swagger.oas.models.media.Schema schema57 = strSchema47.$ref("default");
        java.math.BigDecimal bigDecimal58 = null;
        io.swagger.oas.models.media.Schema schema59 = schema57.maximum(bigDecimal58);
        java.lang.Boolean boolean60 = schema59.getDeprecated();
        io.swagger.oas.models.media.Schema schema61 = schema33.not(schema59);
        java.lang.Object obj62 = schema33.getExample();
        io.swagger.oas.models.media.Schema schema64 = schema33.deprecated((java.lang.Boolean) false);
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
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNull(boolean50);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNull(strMap53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNull(boolean60);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(schema64);
    }

    @Test
    public void test17189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17189");
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
        java.lang.String str31 = schema5.getPattern();
        schema5.setExclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema35 = schema5.maxProperties((java.lang.Integer) 0);
        java.lang.Boolean boolean36 = schema35.getUniqueItems();
        io.swagger.oas.models.media.Schema schema38 = schema35.addRequiredItem("");
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertNotNull(schema38);
    }

    @Test
    public void test17190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17190");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        strSchema0.setNullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema8 = strSchema0.type("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation9 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema11 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema11.setType("hi!");
        strSchema11.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema17 = strSchema11.addRequiredItem("");
        io.swagger.oas.models.media.Schema schema19 = schema17.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema20 = strSchema0.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema19);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setDefault((java.lang.Object) '#');
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema27 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema27.setType("hi!");
        java.util.List<java.lang.String> strList30 = strSchema27.getRequired();
        strSchema27.setReadOnly((java.lang.Boolean) true);
        java.lang.Integer int33 = strSchema27.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema34 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema34.setType("hi!");
        strSchema34.setName("no description");
        io.swagger.oas.models.media.Schema schema40 = strSchema34.type("");
        io.swagger.oas.models.media.Schema schema41 = strSchema27.not((io.swagger.oas.models.media.Schema) strSchema34);
        strSchema22.setExample((java.lang.Object) schema41);
        io.swagger.oas.models.media.Schema schema44 = schema41.maxProperties((java.lang.Integer) (-1));
        java.math.BigDecimal bigDecimal45 = schema44.getMaximum();
        java.lang.Integer int46 = schema44.getMaxItems();
        java.lang.String str47 = schema44.get$ref();
        java.lang.Integer int48 = schema44.getMinItems();
        schema44.setName("default");
        io.swagger.oas.models.media.Schema schema51 = strSchema0.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: false\n    xml: null\n}", schema44);
        java.lang.Integer int52 = schema51.getMaxItems();
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(externalDocumentation9);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(strList30);
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(bigDecimal45);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(int48);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNull(int52);
    }

    @Test
    public void test17191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17191");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema3 = strSchema0.format("");
        io.swagger.oas.models.media.Schema schema5 = strSchema0.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema7 = strSchema0.description("*/*");
        io.swagger.oas.models.media.Schema schema9 = schema7.description("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Discriminator discriminator10 = null;
        io.swagger.oas.models.media.Schema schema11 = schema9.discriminator(discriminator10);
        java.lang.Boolean boolean12 = schema11.getExclusiveMinimum();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test17192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17192");
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
        io.swagger.oas.models.media.Schema schema18 = strSchema7.addRequiredItem("");
        io.swagger.oas.models.media.Schema schema20 = strSchema7.minProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema22 = strSchema7.$ref("");
        strSchema7.setExclusiveMinimum((java.lang.Boolean) false);
        strSchema7.addEnumItemObject("hi!");
        java.math.BigDecimal bigDecimal27 = null;
        io.swagger.oas.models.media.Schema schema28 = strSchema7.maximum(bigDecimal27);
        java.math.BigDecimal bigDecimal29 = null;
        io.swagger.oas.models.media.Schema schema30 = schema28.minimum(bigDecimal29);
        io.swagger.oas.models.media.XML xML31 = schema28.getXml();
        java.math.BigDecimal bigDecimal32 = null;
        schema28.setMultipleOf(bigDecimal32);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNull(xML31);
    }

    @Test
    public void test17193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17193");
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
        schema8.setMinProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap27 = null;
        io.swagger.oas.models.media.Schema schema28 = strSchema22.properties(strMap27);
        java.lang.Integer int29 = schema28.getMaxProperties();
        io.swagger.oas.models.media.Schema schema31 = schema28.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema33 = schema28.name("hi!");
        io.swagger.oas.models.media.Schema schema35 = schema28.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema36 = schema8.example((java.lang.Object) schema35);
        schema35.setMinLength((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
    }

    @Test
    public void test17194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17194");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema6 = strSchema0.addRequiredItem("");
        io.swagger.oas.models.media.Schema schema7 = strSchema0.getAdditionalProperties();
        strSchema0.setMaxLength((java.lang.Integer) 100);
        strSchema0.set$ref("*/*");
        strSchema0.setMaxProperties((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(schema7);
    }

    @Test
    public void test17195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17195");
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema29 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema29.setType("hi!");
        strSchema29.setName("no description");
        io.swagger.oas.models.media.Schema schema35 = strSchema29.type("");
        io.swagger.oas.models.media.Schema schema37 = strSchema29.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema39 = strSchema29.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema40 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema40.setType("hi!");
        java.lang.Boolean boolean43 = strSchema40.getWriteOnly();
        io.swagger.oas.models.media.Schema schema45 = strSchema40.type("default");
        io.swagger.oas.models.media.Schema schema46 = strSchema29.not(schema45);
        io.swagger.oas.models.media.Schema schema48 = schema46.minItems((java.lang.Integer) 0);
        schema48.setExclusiveMaximum((java.lang.Boolean) true);
        schema27.setExample((java.lang.Object) schema48);
        schema48.setUniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema55 = schema48.description("");
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(schema28);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNull(boolean43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema55);
    }

    @Test
    public void test17196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17196");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.util.List<java.lang.String> strList3 = strSchema0.getRequired();
        strSchema0.setReadOnly((java.lang.Boolean) true);
        java.lang.Object obj6 = strSchema0.getExample();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.description("#/components/schemas/default");
        io.swagger.oas.models.media.Schema schema10 = strSchema0.name("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 0\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: -1\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema12 = schema10.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 10\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: true\n    maxProperties: null\n    minProperties: -1\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema12.setMaxLength((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = schema12.getExtensions();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test17197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17197");
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
        java.lang.Integer int27 = schema24.getMinLength();
        io.swagger.oas.models.media.Schema schema29 = schema24.type("");
        io.swagger.oas.models.media.Schema schema31 = schema29.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema32 = schema31.getAdditionalProperties();
        java.lang.Integer int33 = schema31.getMinProperties();
        schema31.setWriteOnly((java.lang.Boolean) true);
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
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNull(schema32);
        org.junit.Assert.assertNull(int33);
    }

    @Test
    public void test17198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17198");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        schema6.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema schema15 = strSchema9.type("");
        io.swagger.oas.models.media.Schema schema17 = schema15.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int18 = schema17.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema19.setType("hi!");
        strSchema19.setName("no description");
        io.swagger.oas.models.media.Schema schema25 = strSchema19.type("");
        io.swagger.oas.models.media.Schema schema27 = schema25.format("no description");
        io.swagger.oas.models.media.Schema schema28 = schema17.not(schema27);
        io.swagger.oas.models.media.Schema schema29 = schema6.not(schema27);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap30 = schema6.getProperties();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema32 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema32.setType("hi!");
        io.swagger.oas.models.media.Schema schema36 = strSchema32.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema38 = schema36.example((java.lang.Object) (short) 0);
        java.lang.Boolean boolean39 = schema38.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator40 = null;
        io.swagger.oas.models.media.Schema schema41 = schema38.discriminator(discriminator40);
        schema41.setMaxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema45 = schema41.exclusiveMinimum((java.lang.Boolean) false);
        schema45.setMinProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema49 = schema45.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema50 = schema6.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema45);
        java.lang.String str51 = schema45.getDescription();
        io.swagger.oas.models.media.Discriminator discriminator52 = schema45.getDiscriminator();
        io.swagger.oas.models.media.Schema schema54 = schema45.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema55 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema55.setType("hi!");
        java.lang.Boolean boolean58 = strSchema55.getWriteOnly();
        io.swagger.oas.models.media.Schema schema60 = strSchema55.type("default");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema61 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema61.setType("hi!");
        java.lang.Boolean boolean64 = strSchema61.getWriteOnly();
        io.swagger.oas.models.media.Schema schema66 = strSchema61.type("default");
        strSchema55.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema61);
        io.swagger.oas.models.media.Schema schema69 = strSchema55.$ref("*/*");
        java.math.BigDecimal bigDecimal70 = null;
        strSchema55.setMaximum(bigDecimal70);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema72 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema72.setType("hi!");
        strSchema72.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema78 = strSchema72.addRequiredItem("");
        io.swagger.oas.models.media.Schema schema80 = schema78.exclusiveMaximum((java.lang.Boolean) true);
        schema80.setMaxItems((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema83 = strSchema55.not(schema80);
        io.swagger.oas.models.media.Schema schema84 = schema80.getNot();
        schema80.setWriteOnly((java.lang.Boolean) false);
        boolean boolean87 = schema54.equals((java.lang.Object) schema80);
        io.swagger.oas.models.media.Schema schema89 = schema54.minProperties((java.lang.Integer) 10);
        java.lang.Boolean boolean90 = schema54.getNullable();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(boolean39);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(discriminator52);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNull(boolean58);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNull(boolean64);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema78);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(schema83);
        org.junit.Assert.assertNull(schema84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(schema89);
        org.junit.Assert.assertNull(boolean90);
    }

    @Test
    public void test17199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17199");
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
        io.swagger.oas.models.media.Schema schema22 = strSchema0.deprecated((java.lang.Boolean) false);
        java.lang.String str23 = strSchema0.get$ref();
        io.swagger.oas.models.media.Schema schema25 = strSchema0.nullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema26 = schema25.getAdditionalProperties();
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(schema26);
    }

    @Test
    public void test17200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17200");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = schema6.format("no description");
        io.swagger.oas.models.media.Schema schema10 = schema8.format("");
        java.lang.Boolean boolean11 = schema8.getExclusiveMinimum();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema12 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema12.setType("hi!");
        strSchema12.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap17 = null;
        io.swagger.oas.models.media.Schema schema18 = strSchema12.properties(strMap17);
        java.lang.Integer int19 = schema18.getMaxProperties();
        schema18.setMinLength((java.lang.Integer) 10);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation22 = null;
        io.swagger.oas.models.media.Schema schema23 = schema18.externalDocs(externalDocumentation22);
        java.math.BigDecimal bigDecimal24 = null;
        io.swagger.oas.models.media.Schema schema25 = schema18.maximum(bigDecimal24);
        io.swagger.oas.models.media.Schema schema26 = schema8.example((java.lang.Object) bigDecimal24);
        schema8.setMinLength((java.lang.Integer) (-1));
        java.math.BigDecimal bigDecimal29 = null;
        io.swagger.oas.models.media.Schema schema30 = schema8.minimum(bigDecimal29);
        schema30.setUniqueItems((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema30);
    }

    @Test
    public void test17201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17201");
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
        java.lang.String str17 = schema16.getFormat();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = schema16.getExtensions();
        java.lang.Integer int19 = schema16.getMinItems();
        io.swagger.oas.models.media.Schema schema21 = schema16.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema22 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema22.setType("hi!");
        strSchema22.setName("no description");
        io.swagger.oas.models.media.Schema schema28 = strSchema22.type("");
        java.lang.Integer int29 = schema28.getMaxProperties();
        java.math.BigDecimal bigDecimal30 = null;
        schema28.setMinimum(bigDecimal30);
        io.swagger.oas.models.media.Schema schema33 = schema28.maxLength((java.lang.Integer) 10);
        java.math.BigDecimal bigDecimal34 = schema28.getMinimum();
        io.swagger.oas.models.media.Schema schema36 = schema28.minProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Discriminator discriminator37 = null;
        io.swagger.oas.models.media.Schema schema38 = schema36.discriminator(discriminator37);
        io.swagger.oas.models.media.Schema schema40 = schema36.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema42 = schema40.writeOnly((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal43 = null;
        io.swagger.oas.models.media.Schema schema44 = schema42.minimum(bigDecimal43);
        io.swagger.oas.models.media.Schema schema45 = schema21.example((java.lang.Object) schema44);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str17, "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(bigDecimal34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema45);
    }

    @Test
    public void test17202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17202");
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
        io.swagger.oas.models.ExternalDocumentation externalDocumentation22 = null;
        io.swagger.oas.models.media.Schema schema23 = schema18.externalDocs(externalDocumentation22);
        io.swagger.oas.models.media.Schema schema25 = schema23.name("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation26 = schema25.getExternalDocs();
        java.lang.Integer int27 = schema25.getMinProperties();
        io.swagger.oas.models.media.Schema schema29 = schema25.exclusiveMinimum((java.lang.Boolean) false);
        java.lang.Boolean boolean30 = schema29.getDeprecated();
        io.swagger.oas.models.media.Discriminator discriminator31 = null;
        schema29.setDiscriminator(discriminator31);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(externalDocumentation26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(boolean30);
    }

    @Test
    public void test17203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17203");
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
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap16 = schema12.getProperties();
        io.swagger.oas.models.media.Schema schema18 = schema12.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema20 = schema12.addRequiredItem("");
        io.swagger.oas.models.media.Schema schema22 = schema12.readOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.XML xML23 = null;
        schema12.setXml(xML23);
        io.swagger.oas.models.media.XML xML25 = schema12.getXml();
        java.lang.Boolean boolean26 = schema12.getReadOnly();
        io.swagger.oas.models.media.Schema schema28 = schema12.exclusiveMaximum((java.lang.Boolean) false);
        schema28.setMinItems((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(xML25);
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + false + "'", boolean26, false);
        org.junit.Assert.assertNotNull(schema28);
    }

    @Test
    public void test17204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17204");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxLength((java.lang.Integer) 0);
        java.lang.Integer int9 = strSchema0.getMaxItems();
        io.swagger.oas.models.media.Schema schema11 = strSchema0.nullable((java.lang.Boolean) true);
        schema11.setName("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: 10\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test17205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17205");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        java.lang.Integer int7 = schema6.getMaxProperties();
        java.math.BigDecimal bigDecimal8 = null;
        schema6.setMinimum(bigDecimal8);
        io.swagger.oas.models.media.Schema schema11 = schema6.maxLength((java.lang.Integer) 10);
        java.lang.Boolean boolean12 = schema6.getUniqueItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema13 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema13.setType("hi!");
        strSchema13.setName("no description");
        io.swagger.oas.models.media.Schema schema19 = strSchema13.type("");
        io.swagger.oas.models.media.Schema schema21 = schema19.maxProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Discriminator discriminator22 = null;
        io.swagger.oas.models.media.Schema schema23 = schema19.discriminator(discriminator22);
        java.math.BigDecimal bigDecimal24 = schema19.getMinimum();
        java.lang.Integer int25 = schema19.getMinItems();
        schema19.setMaxItems((java.lang.Integer) 0);
        schema19.setDescription("#/components/schemas/class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema30 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema30.setType("hi!");
        strSchema30.setName("no description");
        io.swagger.oas.models.media.Schema schema36 = strSchema30.type("");
        io.swagger.oas.models.media.Schema schema38 = strSchema30.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema40 = strSchema30.maxItems((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal41 = null;
        schema40.setMultipleOf(bigDecimal41);
        io.swagger.oas.models.media.Schema schema44 = schema40.maxItems((java.lang.Integer) 100);
        schema44.setNullable((java.lang.Boolean) false);
        schema44.setMaxProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema49 = schema19.additionalProperties(schema44);
        io.swagger.oas.models.media.Schema schema50 = schema6.not(schema44);
        schema6.setFormat("");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(bigDecimal24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
    }

    @Test
    public void test17206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17206");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.String str1 = strSchema0.getTitle();
        strSchema0.setUniqueItems((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = strSchema0.getNullable();
        io.swagger.oas.models.media.Schema schema6 = strSchema0.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema8 = strSchema0.title("default");
        java.lang.String str9 = schema8.getFormat();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = schema8.getExtensions();
        java.math.BigDecimal bigDecimal11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema8.maximum(bigDecimal11);
        java.lang.String str13 = schema12.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class Schema {\n    title: default\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" + "'", str13, "class Schema {\n    title: default\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
    }

    @Test
    public void test17207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17207");
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
        java.lang.String str20 = strSchema6.getName();
        io.swagger.oas.models.media.Schema schema22 = strSchema6.deprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema24 = schema22.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean25 = schema22.getWriteOnly();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema26 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema26.setType("hi!");
        strSchema26.setName("no description");
        io.swagger.oas.models.media.Schema schema32 = strSchema26.type("");
        io.swagger.oas.models.media.Schema schema34 = strSchema26.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema36 = strSchema26.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema37 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema37.setType("hi!");
        java.lang.Boolean boolean40 = strSchema37.getWriteOnly();
        io.swagger.oas.models.media.Schema schema42 = strSchema37.type("default");
        io.swagger.oas.models.media.Schema schema43 = strSchema26.not(schema42);
        io.swagger.oas.models.media.Schema schema45 = schema43.minItems((java.lang.Integer) 0);
        schema45.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean48 = schema45.getExclusiveMaximum();
        io.swagger.oas.models.media.Discriminator discriminator49 = null;
        io.swagger.oas.models.media.Schema schema50 = schema45.discriminator(discriminator49);
        io.swagger.oas.models.media.Schema schema51 = schema22.additionalProperties(schema50);
        io.swagger.oas.models.media.XML xML52 = null;
        schema22.setXml(xML52);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNull(boolean40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertEquals("'" + boolean48 + "' != '" + true + "'", boolean48, true);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema51);
    }

    @Test
    public void test17208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17208");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        strSchema0.setMaxLength((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema8 = strSchema0.nullable((java.lang.Boolean) false);
        java.util.List<java.lang.String> strList9 = strSchema0.getRequired();
        io.swagger.oas.models.media.Schema schema11 = strSchema0.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema13 = schema11.description("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation14 = null;
        io.swagger.oas.models.media.Schema schema15 = schema11.externalDocs(externalDocumentation14);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test17209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17209");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        java.lang.String str10 = schema6.getType();
        java.lang.String str11 = schema6.getPattern();
        schema6.setMaxProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema15 = schema6.title("class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema6.setDeprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema19 = schema6.maxLength((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test17210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17210");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        strSchema0.setDefault((java.lang.Object) (byte) 100);
        strSchema0.setMinProperties((java.lang.Integer) 0);
        strSchema0.setMinProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema12 = strSchema0.deprecated((java.lang.Boolean) true);
        schema12.setNullable((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema16 = schema12.maxItems((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = schema16.getExtensions();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test17211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17211");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int5 = strSchema0.getMinLength();
        java.lang.Integer int6 = strSchema0.getMaxLength();
        java.math.BigDecimal bigDecimal7 = strSchema0.getMaximum();
        io.swagger.oas.models.media.Schema schema9 = strSchema0.name("no description");
        io.swagger.oas.models.media.Schema schema11 = strSchema0.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema13 = strSchema0.maxProperties((java.lang.Integer) 0);
        java.lang.String str14 = schema13.getPattern();
        io.swagger.oas.models.media.Schema schema16 = schema13.exclusiveMinimum((java.lang.Boolean) false);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test17212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17212");
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
        schema32.setUniqueItems((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal35 = null;
        io.swagger.oas.models.media.Schema schema36 = schema32.maximum(bigDecimal35);
        io.swagger.oas.models.media.Schema schema38 = schema32.minProperties((java.lang.Integer) 10);
        java.lang.String str39 = schema32.getTitle();
        io.swagger.oas.models.media.Schema schema41 = schema32.maxProperties((java.lang.Integer) (-1));
        schema32.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: \n    maxItems: 10\n    minItems: 100\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [default]\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
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
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(schema41);
    }

    @Test
    public void test17213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17213");
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
        schema19.setNullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        java.lang.Boolean boolean26 = strSchema23.getWriteOnly();
        io.swagger.oas.models.media.Schema schema28 = strSchema23.type("default");
        java.lang.String str29 = schema28.getDescription();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema31 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema31.setType("hi!");
        strSchema31.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap36 = null;
        io.swagger.oas.models.media.Schema schema37 = strSchema31.properties(strMap36);
        io.swagger.oas.models.media.Schema schema39 = strSchema31.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema40 = schema28.addProperties("no description", schema39);
        schema39.setWriteOnly((java.lang.Boolean) false);
        java.lang.Boolean boolean43 = schema39.getDeprecated();
        io.swagger.oas.models.media.Schema schema45 = schema39.minItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema46 = schema19.example((java.lang.Object) schema45);
        io.swagger.oas.models.media.Schema schema48 = schema45.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(boolean43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema48);
    }

    @Test
    public void test17214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17214");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        java.lang.Boolean boolean3 = strSchema0.getWriteOnly();
        io.swagger.oas.models.media.Schema schema5 = strSchema0.type("default");
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap6 = strSchema0.getProperties();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation7 = null;
        strSchema0.setExternalDocs(externalDocumentation7);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean11 = schema10.getExclusiveMinimum();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation12 = schema10.getExternalDocs();
        io.swagger.oas.models.media.Schema schema14 = schema10.maxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema16 = schema14.maxProperties((java.lang.Integer) 100);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(externalDocumentation12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test17215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17215");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.String str7 = strSchema0.getPattern();
        java.lang.String str8 = strSchema0.getPattern();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setName("no description");
        io.swagger.oas.models.media.Schema schema15 = strSchema9.type("");
        java.lang.Integer int16 = schema15.getMaxProperties();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap17 = null;
        io.swagger.oas.models.media.Schema schema18 = schema15.properties(strMap17);
        io.swagger.oas.models.media.Schema schema19 = strSchema0.example((java.lang.Object) schema15);
        io.swagger.oas.models.media.Schema schema21 = schema19.title("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: [*/*, */*]\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: no description\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema19.setName("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 100\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test17216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17216");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        java.lang.String str6 = strSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema8 = strSchema0.maxLength((java.lang.Integer) 0);
        schema8.setReadOnly((java.lang.Boolean) false);
        java.lang.String str11 = schema8.getPattern();
        io.swagger.oas.models.media.Schema schema13 = schema8.description("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation14 = schema8.getExternalDocs();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(externalDocumentation14);
    }

    @Test
    public void test17217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17217");
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
        java.lang.Integer int23 = schema6.getMaxProperties();
        java.lang.Integer int24 = schema6.getMaxItems();
        schema6.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema28 = schema6.readOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema30 = schema28.minProperties((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema30);
    }

    @Test
    public void test17218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17218");
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
        java.math.BigDecimal bigDecimal39 = null;
        io.swagger.oas.models.media.Schema schema40 = schema14.multipleOf(bigDecimal39);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema41 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema41.setType("hi!");
        java.lang.Boolean boolean44 = strSchema41.getDeprecated();
        io.swagger.oas.models.media.Schema schema46 = strSchema41.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema48 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema48.setType("hi!");
        strSchema48.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap53 = null;
        io.swagger.oas.models.media.Schema schema54 = strSchema48.properties(strMap53);
        java.lang.Integer int55 = schema54.getMaxProperties();
        io.swagger.oas.models.media.Schema schema57 = schema54.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema59 = schema54.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema60 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema60.setType("hi!");
        strSchema60.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int65 = strSchema60.getMinLength();
        java.lang.Integer int66 = strSchema60.getMaxLength();
        java.math.BigDecimal bigDecimal67 = strSchema60.getMaximum();
        io.swagger.oas.models.media.Schema schema68 = schema59.additionalProperties((io.swagger.oas.models.media.Schema) strSchema60);
        strSchema60.setType("");
        io.swagger.oas.models.media.Schema schema71 = schema46.addProperties("default", (io.swagger.oas.models.media.Schema) strSchema60);
        schema46.setDeprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.XML xML74 = null;
        io.swagger.oas.models.media.Schema schema75 = schema46.xml(xML74);
        java.lang.String[] strArray85 = new java.lang.String[] { "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 100\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: \n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: true\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 10\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 100\n    minProperties: null\n    required: [no description]\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", "class Schema {\n    title: hi!\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", "class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 0\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: []\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", "*/*", "hi!", "#/components/schemas/class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        schema46.setEnum((java.util.List<java.lang.String>) strList86);
        io.swagger.oas.models.media.Schema schema89 = schema40.required((java.util.List<java.lang.String>) strList86);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation90 = null;
        io.swagger.oas.models.media.Schema schema91 = schema89.externalDocs(externalDocumentation90);
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
        org.junit.Assert.assertNull(boolean44);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNull(int55);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNull(int65);
        org.junit.Assert.assertNull(int66);
        org.junit.Assert.assertNull(bigDecimal67);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(schema89);
        org.junit.Assert.assertNotNull(schema91);
    }

    @Test
    public void test17219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17219");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.Integer int7 = schema6.getMaxProperties();
        io.swagger.oas.models.media.Schema schema9 = schema6.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema11 = schema6.name("hi!");
        java.util.List<java.lang.String> strList12 = null;
        io.swagger.oas.models.media.Schema schema13 = schema6.required(strList12);
        java.lang.Integer int14 = schema13.getMinItems();
        schema13.setTitle("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: true\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.String str17 = schema13.getName();
        java.math.BigDecimal bigDecimal18 = schema13.getMinimum();
        java.lang.Boolean boolean19 = schema13.getExclusiveMinimum();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(bigDecimal18);
        org.junit.Assert.assertNull(boolean19);
    }

    @Test
    public void test17220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17220");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        schema6.setFormat("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean9 = schema6.getExclusiveMinimum();
        schema6.addEnumItemObject("default");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation12 = schema6.getExternalDocs();
        java.lang.String str13 = schema6.getDescription();
        io.swagger.oas.models.media.Schema schema15 = schema6.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema16 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema16.setType("hi!");
        strSchema16.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap21 = null;
        io.swagger.oas.models.media.Schema schema22 = strSchema16.properties(strMap21);
        java.lang.Integer int23 = schema22.getMaxProperties();
        io.swagger.oas.models.media.Schema schema25 = schema22.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema27 = schema22.maxProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema schema29 = schema22.addRequiredItem("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = schema29.getExtensions();
        io.swagger.oas.models.media.Schema schema32 = schema29.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: false\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 1\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: true\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema33 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema33.setType("hi!");
        strSchema33.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema39 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema39.setType("hi!");
        strSchema39.setName("no description");
        io.swagger.oas.models.media.Schema schema45 = strSchema39.type("");
        java.lang.Integer int46 = schema45.getMaxProperties();
        io.swagger.oas.models.media.Schema schema48 = schema45.name("default");
        io.swagger.oas.models.media.Schema schema49 = strSchema33.addProperties("*/*", schema48);
        java.lang.Integer int50 = schema48.getMaxProperties();
        io.swagger.oas.models.media.Schema schema52 = schema48.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        boolean boolean53 = schema32.equals((java.lang.Object) schema52);
        schema15.setDefault((java.lang.Object) schema32);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(externalDocumentation12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test17221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17221");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        schema4.setPattern("hi!");
        java.lang.Integer int7 = schema4.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema8 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema8.setType("hi!");
        io.swagger.oas.models.media.Schema schema12 = strSchema8.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema14 = schema12.example((java.lang.Object) (short) 0);
        schema12.setWriteOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema18 = schema12.maxProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema20 = schema18.maxLength((java.lang.Integer) 100);
        java.math.BigDecimal bigDecimal21 = null;
        io.swagger.oas.models.media.Schema schema22 = schema20.multipleOf(bigDecimal21);
        schema20.setMinLength((java.lang.Integer) 10);
        schema4.setNot(schema20);
        java.lang.String str26 = schema20.getPattern();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test17222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17222");
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema19 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema19.setType("hi!");
        io.swagger.oas.models.media.Schema schema23 = strSchema19.maxLength((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema25 = schema23.example((java.lang.Object) (short) 0);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema27 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema27.setType("hi!");
        strSchema27.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean32 = strSchema27.getDeprecated();
        java.lang.String str33 = strSchema27.getDescription();
        io.swagger.oas.models.media.Schema schema35 = strSchema27.maxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema37 = schema35.uniqueItems((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema39 = schema35.$ref("*/*");
        schema25.addExtension("default", (java.lang.Object) "*/*");
        boolean boolean41 = schema10.equals((java.lang.Object) schema25);
        java.math.BigDecimal bigDecimal42 = schema25.getMinimum();
        java.lang.String str43 = schema25.getName();
        io.swagger.oas.models.media.Discriminator discriminator44 = schema25.getDiscriminator();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(bigDecimal42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(discriminator44);
    }

    @Test
    public void test17223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17223");
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
        io.swagger.oas.models.media.Schema schema36 = strSchema23.minProperties((java.lang.Integer) 0);
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
        java.util.List<java.lang.String> strList54 = schema47.getEnum();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema55 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema55.setType("hi!");
        strSchema55.setName("no description");
        io.swagger.oas.models.media.Schema schema61 = strSchema55.type("");
        io.swagger.oas.models.media.Schema schema63 = schema61.maxProperties((java.lang.Integer) 100);
        java.lang.Integer int64 = schema63.getMinItems();
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema65 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema65.setType("hi!");
        strSchema65.setName("no description");
        io.swagger.oas.models.media.Schema schema71 = strSchema65.type("");
        io.swagger.oas.models.media.Schema schema73 = schema71.format("no description");
        io.swagger.oas.models.media.Schema schema74 = schema63.not(schema73);
        io.swagger.oas.models.media.Schema schema76 = schema73.format("default");
        io.swagger.oas.models.media.Schema schema78 = schema73.exclusiveMinimum((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal79 = null;
        schema78.setMinimum(bigDecimal79);
        io.swagger.oas.models.media.XML xML81 = null;
        io.swagger.oas.models.media.Schema schema82 = schema78.xml(xML81);
        schema47.setAdditionalProperties(schema82);
        io.swagger.oas.models.media.Schema schema85 = schema47.deprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema87 = schema47.format("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 0\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 0\n    required: null\n    type: default\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.math.BigDecimal bigDecimal88 = null;
        schema87.setMinimum(bigDecimal88);
        io.swagger.oas.models.media.Schema schema90 = strSchema23.additionalProperties(schema87);
        io.swagger.oas.models.media.Schema schema92 = schema90.type("#/components/schemas/default");
        java.lang.Boolean boolean93 = schema90.getExclusiveMinimum();
        java.math.BigDecimal bigDecimal94 = schema90.getMaximum();
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
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(strList54);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNull(int64);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema78);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNotNull(schema85);
        org.junit.Assert.assertNotNull(schema87);
        org.junit.Assert.assertNotNull(schema90);
        org.junit.Assert.assertNotNull(schema92);
        org.junit.Assert.assertNull(boolean93);
        org.junit.Assert.assertNull(bigDecimal94);
    }

    @Test
    public void test17224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17224");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        java.lang.Boolean boolean1 = strSchema0.getUniqueItems();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation2 = strSchema0.getExternalDocs();
        io.swagger.oas.models.media.Schema schema4 = strSchema0.description("");
        strSchema0.setDefault((java.lang.Object) (byte) 100);
        strSchema0.setMinProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema10 = strSchema0.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema12 = schema10.pattern("");
        io.swagger.oas.models.media.Schema schema14 = schema12.readOnly((java.lang.Boolean) false);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation15 = null;
        schema12.setExternalDocs(externalDocumentation15);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(externalDocumentation2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
    }

    @Test
    public void test17225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17225");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setExclusiveMaximum((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = strSchema0.getDeprecated();
        io.swagger.oas.models.media.Schema schema7 = strSchema0.nullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema9 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema9.setType("hi!");
        strSchema9.setExclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema15 = strSchema9.exclusiveMaximum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema16 = schema7.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: 100\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (io.swagger.oas.models.media.Schema) strSchema9);
        io.swagger.oas.models.media.Schema schema18 = schema7.writeOnly((java.lang.Boolean) false);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap19 = null;
        io.swagger.oas.models.media.Schema schema20 = schema7.properties(strMap19);
        java.util.List<java.lang.String> strList21 = schema20.getEnum();
        io.swagger.oas.models.media.Schema schema23 = schema20.maxProperties((java.lang.Integer) 0);
        java.lang.Integer int24 = schema23.getMaxLength();
        io.swagger.oas.models.media.Schema schema26 = schema23.uniqueItems((java.lang.Boolean) true);
        schema26.set$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: 1\n    minProperties: 100\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema30 = schema26.minLength((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema31 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema31.setType("hi!");
        java.lang.Boolean boolean34 = strSchema31.getWriteOnly();
        strSchema31.setWriteOnly((java.lang.Boolean) false);
        strSchema31.setReadOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.XML xML39 = null;
        io.swagger.oas.models.media.Schema schema40 = strSchema31.xml(xML39);
        io.swagger.oas.models.media.Schema schema42 = strSchema31.pattern("class Schema {\n    title: no description\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema44 = strSchema31.nullable((java.lang.Boolean) false);
        java.lang.Integer int45 = schema44.getMinProperties();
        io.swagger.oas.models.media.Schema schema46 = schema30.not(schema44);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNull(boolean34);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertNotNull(schema46);
    }

    @Test
    public void test17226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17226");
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
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema40 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema40.setType("hi!");
        strSchema40.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema45 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema45.setType("hi!");
        strSchema45.setName("no description");
        strSchema40.setNot((io.swagger.oas.models.media.Schema) strSchema45);
        java.math.BigDecimal bigDecimal51 = null;
        io.swagger.oas.models.media.Schema schema52 = strSchema40.minimum(bigDecimal51);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema53 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema53.setType("hi!");
        strSchema53.setName("no description");
        io.swagger.oas.models.media.Schema schema59 = strSchema53.type("");
        io.swagger.oas.models.media.Schema schema61 = schema59.format("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema62 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema62.setType("hi!");
        strSchema62.setName("no description");
        io.swagger.oas.models.media.Schema schema68 = strSchema62.type("");
        io.swagger.oas.models.media.Schema schema70 = strSchema62.writeOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema72 = strSchema62.maxItems((java.lang.Integer) 100);
        java.lang.String[] strArray75 = new java.lang.String[] { "*/*", "*/*" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        schema72.setRequired((java.util.List<java.lang.String>) strList76);
        schema61.setRequired((java.util.List<java.lang.String>) strList76);
        io.swagger.oas.models.media.Schema schema80 = strSchema40.required((java.util.List<java.lang.String>) strList76);
        strSchema32.setEnum((java.util.List<java.lang.String>) strList76);
        java.lang.Integer int82 = strSchema32.getMinLength();
        schema24.setAdditionalProperties((io.swagger.oas.models.media.Schema) strSchema32);
        schema24.setTitle("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: false\n    maxProperties: null\n    minProperties: -1\n    required: null\n    type: \n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema87 = schema24.maxItems((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema89 = schema87.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation90 = null;
        schema89.setExternalDocs(externalDocumentation90);
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
        org.junit.Assert.assertNull(strList28);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNull(int82);
        org.junit.Assert.assertNotNull(schema87);
        org.junit.Assert.assertNotNull(schema89);
    }

    @Test
    public void test17227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17227");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        java.lang.String str7 = strSchema0.getPattern();
        java.lang.Integer int8 = strSchema0.getMaxLength();
        io.swagger.oas.models.media.Discriminator discriminator9 = null;
        strSchema0.setDiscriminator(discriminator9);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test17228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17228");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setName("no description");
        io.swagger.oas.models.media.Schema schema6 = strSchema0.type("");
        io.swagger.oas.models.media.Schema schema8 = strSchema0.exclusiveMaximum((java.lang.Boolean) false);
        schema8.setDeprecated((java.lang.Boolean) false);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation11 = null;
        io.swagger.oas.models.media.Schema schema12 = schema8.externalDocs(externalDocumentation11);
        java.lang.Boolean boolean13 = schema12.getExclusiveMaximum();
        io.swagger.oas.models.media.Schema schema15 = schema12.exclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema17 = schema12.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema18 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema18.setType("hi!");
        strSchema18.setName("no description");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema23 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema23.setType("hi!");
        strSchema23.setName("no description");
        strSchema18.setNot((io.swagger.oas.models.media.Schema) strSchema23);
        java.math.BigDecimal bigDecimal29 = null;
        io.swagger.oas.models.media.Schema schema30 = strSchema18.minimum(bigDecimal29);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema31 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema31.setType("hi!");
        java.util.List<java.lang.String> strList34 = strSchema31.getRequired();
        strSchema31.setReadOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema38 = strSchema31.title("no description");
        java.lang.String str39 = schema38.getDescription();
        boolean boolean40 = schema30.equals((java.lang.Object) schema38);
        java.util.List<java.lang.String> strList41 = null;
        io.swagger.oas.models.media.Schema schema42 = schema38.required(strList41);
        schema38.setMaxItems((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema46 = schema38.minLength((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema48 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema48.setType("hi!");
        strSchema48.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap53 = null;
        io.swagger.oas.models.media.Schema schema54 = strSchema48.properties(strMap53);
        java.lang.Integer int55 = schema54.getMaxProperties();
        io.swagger.oas.models.media.Schema schema57 = schema54.minProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema59 = schema54.name("hi!");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema60 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema60.setType("hi!");
        strSchema60.setWriteOnly((java.lang.Boolean) false);
        java.lang.Integer int65 = strSchema60.getMinLength();
        java.lang.Integer int66 = strSchema60.getMaxLength();
        java.math.BigDecimal bigDecimal67 = strSchema60.getMaximum();
        io.swagger.oas.models.media.Schema schema68 = schema59.additionalProperties((io.swagger.oas.models.media.Schema) strSchema60);
        io.swagger.oas.models.media.Schema schema70 = schema68.readOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema71 = schema38.addProperties("default", schema68);
        io.swagger.oas.models.media.Schema schema73 = schema71.readOnly((java.lang.Boolean) true);
        schema12.setExample((java.lang.Object) schema73);
        io.swagger.oas.models.media.Discriminator discriminator75 = null;
        io.swagger.oas.models.media.Schema schema76 = schema73.discriminator(discriminator75);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNull(strList34);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNull(int55);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNull(int65);
        org.junit.Assert.assertNull(int66);
        org.junit.Assert.assertNull(bigDecimal67);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(schema76);
    }

    @Test
    public void test17229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17229");
        io.swagger.oas.models.media.Schema<java.lang.String> strSchema0 = new io.swagger.oas.models.media.Schema<java.lang.String>();
        strSchema0.setType("hi!");
        strSchema0.setWriteOnly((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap5 = null;
        io.swagger.oas.models.media.Schema schema6 = strSchema0.properties(strMap5);
        io.swagger.oas.models.media.Discriminator discriminator7 = null;
        io.swagger.oas.models.media.Schema schema8 = strSchema0.discriminator(discriminator7);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap9 = null;
        strSchema0.setProperties(strMap9);
        io.swagger.oas.models.media.Discriminator discriminator11 = null;
        strSchema0.setDiscriminator(discriminator11);
        io.swagger.oas.models.media.Schema schema14 = strSchema0.minLength((java.lang.Integer) 1);
        java.math.BigDecimal bigDecimal15 = null;
        io.swagger.oas.models.media.Schema schema16 = strSchema0.minimum(bigDecimal15);
        io.swagger.oas.models.media.Schema schema18 = strSchema0.description("#/components/schemas/class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: 1\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: hi!\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: true\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.XML xML19 = null;
        io.swagger.oas.models.media.Schema schema20 = strSchema0.xml(xML19);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
    }
}

