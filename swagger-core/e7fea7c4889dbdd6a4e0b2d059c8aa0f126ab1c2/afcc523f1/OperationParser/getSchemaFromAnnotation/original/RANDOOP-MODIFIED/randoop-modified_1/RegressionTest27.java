import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13501");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema6 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str7 = strComparableSchema6.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema8 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema8.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema11 = strComparableSchema6.not((io.swagger.oas.models.media.Schema) strComparableSchema8);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema12 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str13 = strComparableSchema12.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema14 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema14.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema17 = strComparableSchema12.not((io.swagger.oas.models.media.Schema) strComparableSchema14);
        strComparableSchema12.setDescription("hi!");
        strComparableSchema12.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema6.setAdditionalProperties((io.swagger.oas.models.media.Schema) strComparableSchema12);
        io.swagger.oas.models.media.Schema schema24 = strComparableSchema2.not((io.swagger.oas.models.media.Schema) strComparableSchema6);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema25 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation26 = strComparableSchema25.getExternalDocs();
        java.lang.Comparable<java.lang.String> strComparable27 = strComparableSchema25.getDefault();
        java.lang.Integer int28 = strComparableSchema25.getMinProperties();
        io.swagger.oas.models.media.Schema schema30 = strComparableSchema25.minItems((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = null;
        strComparableSchema25.setExtensions(strMap31);
        io.swagger.oas.models.media.Schema schema34 = strComparableSchema25.exclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema36 = schema34.exclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema37 = strComparableSchema2.not(schema36);
        schema36.setPattern("no description");
        io.swagger.oas.models.media.Schema schema41 = schema36.description("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 1\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.math.BigDecimal bigDecimal42 = schema36.getMinimum();
        schema36.setExclusiveMaximum((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(externalDocumentation26);
        org.junit.Assert.assertNull(strComparable27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(bigDecimal42);
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation1 = strComparableSchema0.getExternalDocs();
        java.lang.Comparable<java.lang.String> strComparable2 = strComparableSchema0.getDefault();
        java.lang.Integer int3 = strComparableSchema0.getMinProperties();
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.minItems((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        strComparableSchema0.setExtensions(strMap6);
        io.swagger.oas.models.media.Schema schema9 = strComparableSchema0.exclusiveMinimum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema10 = strComparableSchema0.getNot();
        io.swagger.oas.models.media.Schema schema12 = strComparableSchema0.uniqueItems((java.lang.Boolean) false);
        org.junit.Assert.assertNull(externalDocumentation1);
        org.junit.Assert.assertNull(strComparable2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        io.swagger.oas.models.media.Schema schema9 = strComparableSchema0.title("");
        io.swagger.oas.models.media.Schema schema11 = strComparableSchema0.title("");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema12 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str13 = strComparableSchema12.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema14 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema14.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema17 = strComparableSchema12.not((io.swagger.oas.models.media.Schema) strComparableSchema14);
        strComparableSchema12.setDescription("hi!");
        java.math.BigDecimal bigDecimal20 = null;
        strComparableSchema12.setMaximum(bigDecimal20);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema22 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str23 = strComparableSchema22.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema24 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema24.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema27 = strComparableSchema22.not((io.swagger.oas.models.media.Schema) strComparableSchema24);
        strComparableSchema22.setDescription("hi!");
        strComparableSchema22.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal33 = strComparableSchema22.getMultipleOf();
        java.lang.String str34 = strComparableSchema22.get$ref();
        java.lang.String[] strArray39 = new java.lang.String[] { ",", "*/*", "hi!", "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        strComparableSchema22.setRequired((java.util.List<java.lang.String>) strList40);
        io.swagger.oas.models.media.Schema schema43 = strComparableSchema12.required((java.util.List<java.lang.String>) strList40);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema44 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str45 = strComparableSchema44.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema46 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema46.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema49 = strComparableSchema44.not((io.swagger.oas.models.media.Schema) strComparableSchema46);
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = null;
        strComparableSchema46.setExtensions(strMap50);
        strComparableSchema46.setExclusiveMaximum((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal54 = null;
        io.swagger.oas.models.media.Schema schema55 = strComparableSchema46.minimum(bigDecimal54);
        io.swagger.oas.models.media.Schema schema56 = schema43.additionalProperties((io.swagger.oas.models.media.Schema) strComparableSchema46);
        io.swagger.oas.models.media.Schema schema58 = schema56.minProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema59 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str60 = strComparableSchema59.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema61 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema61.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema64 = strComparableSchema59.not((io.swagger.oas.models.media.Schema) strComparableSchema61);
        strComparableSchema59.setDescription("hi!");
        strComparableSchema59.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema59.setNullable((java.lang.Boolean) false);
        java.lang.String str72 = strComparableSchema59.get$ref();
        io.swagger.oas.models.media.Schema schema74 = strComparableSchema59.name("");
        java.math.BigDecimal bigDecimal75 = null;
        strComparableSchema59.setMinimum(bigDecimal75);
        java.lang.Boolean boolean77 = strComparableSchema59.getReadOnly();
        io.swagger.oas.models.media.Schema schema79 = strComparableSchema59.description("*/*");
        boolean boolean80 = schema58.equals((java.lang.Object) strComparableSchema59);
        io.swagger.oas.models.media.Schema schema81 = strComparableSchema0.not(schema58);
        java.lang.String str82 = schema58.getTitle();
        java.lang.Object obj83 = schema58.getExample();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(bigDecimal33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNull(boolean77);
        org.junit.Assert.assertNotNull(schema79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(schema81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(obj83);
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap1 = null;
        io.swagger.oas.models.media.Schema schema2 = strComparableSchema0.properties(strMap1);
        java.lang.Boolean boolean3 = schema2.getNullable();
        java.lang.String str4 = schema2.getType();
        schema2.setTitle("#/components/schemas/");
        schema2.setFormat("#/components/schemas/");
        io.swagger.oas.models.media.Schema schema10 = schema2.addRequiredItem("*/*");
        java.lang.Object obj11 = schema2.getExample();
        java.math.BigDecimal bigDecimal12 = null;
        schema2.setMaximum(bigDecimal12);
        io.swagger.oas.models.media.Schema schema15 = schema2.uniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema17 = schema2.$ref("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 1\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean18 = schema2.getDeprecated();
        java.lang.Boolean boolean19 = schema2.getExclusiveMaximum();
        java.lang.Integer int20 = schema2.getMinLength();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNull(int20);
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        strComparableSchema0.addExtension("", (java.lang.Object) 0.0f);
        io.swagger.oas.models.media.Schema schema11 = strComparableSchema0.getAdditionalProperties();
        io.swagger.oas.models.media.Schema schema13 = strComparableSchema0.name("");
        io.swagger.oas.models.media.Schema schema15 = schema13.description("*/*");
        io.swagger.oas.models.media.Schema schema17 = schema13.minLength((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema18 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str19 = strComparableSchema18.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema20 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema20.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema23 = strComparableSchema18.not((io.swagger.oas.models.media.Schema) strComparableSchema20);
        strComparableSchema18.setDescription("hi!");
        strComparableSchema18.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema18.setNullable((java.lang.Boolean) false);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap31 = strComparableSchema18.getProperties();
        java.lang.Boolean boolean32 = strComparableSchema18.getReadOnly();
        java.math.BigDecimal bigDecimal33 = strComparableSchema18.getMinimum();
        strComparableSchema18.setMinLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema schema37 = strComparableSchema18.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: \n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema13.setDefault((java.lang.Object) schema37);
        schema37.setExclusiveMinimum((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertNull(bigDecimal33);
        org.junit.Assert.assertNotNull(schema37);
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        strComparableSchema0.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema0.setNullable((java.lang.Boolean) false);
        java.lang.String str13 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema schema15 = strComparableSchema0.name("");
        java.math.BigDecimal bigDecimal16 = null;
        strComparableSchema0.setMinimum(bigDecimal16);
        java.lang.Boolean boolean18 = strComparableSchema0.getReadOnly();
        io.swagger.oas.models.media.Schema schema20 = strComparableSchema0.description("*/*");
        io.swagger.oas.models.media.Schema schema22 = strComparableSchema0.addRequiredItem("*/*");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema23 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str24 = strComparableSchema23.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema25 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema25.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema28 = strComparableSchema23.not((io.swagger.oas.models.media.Schema) strComparableSchema25);
        strComparableSchema23.setDescription("hi!");
        java.math.BigDecimal bigDecimal31 = null;
        strComparableSchema23.setMaximum(bigDecimal31);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema33 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str34 = strComparableSchema33.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema35 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema35.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema38 = strComparableSchema33.not((io.swagger.oas.models.media.Schema) strComparableSchema35);
        strComparableSchema33.setDescription("hi!");
        strComparableSchema33.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal44 = strComparableSchema33.getMultipleOf();
        java.lang.String str45 = strComparableSchema33.get$ref();
        java.lang.String[] strArray50 = new java.lang.String[] { ",", "*/*", "hi!", "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        strComparableSchema33.setRequired((java.util.List<java.lang.String>) strList51);
        io.swagger.oas.models.media.Schema schema54 = strComparableSchema23.required((java.util.List<java.lang.String>) strList51);
        io.swagger.oas.models.media.Schema schema56 = strComparableSchema23.maxProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema57 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str58 = strComparableSchema57.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema59 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema59.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema62 = strComparableSchema57.not((io.swagger.oas.models.media.Schema) strComparableSchema59);
        java.lang.String str63 = strComparableSchema57.get$ref();
        java.lang.String[] strArray68 = new java.lang.String[] { "Optional.empty", "", "*/*", "no description" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        java.util.Optional<java.util.AbstractCollection<java.lang.String>> strCollectionOptional71 = java.util.Optional.ofNullable((java.util.AbstractCollection<java.lang.String>) strList69);
        io.swagger.oas.models.media.Schema schema72 = strComparableSchema57.required((java.util.List<java.lang.String>) strList69);
        io.swagger.oas.models.media.Schema schema73 = schema56.required((java.util.List<java.lang.String>) strList69);
        strComparableSchema0.setRequired((java.util.List<java.lang.String>) strList69);
        java.lang.String str75 = strComparableSchema0.getTitle();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation76 = strComparableSchema0.getExternalDocs();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(bigDecimal44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strCollectionOptional71);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(externalDocumentation76);
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema6 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.util.List<java.lang.String> strList7 = strComparableSchema6.getRequired();
        io.swagger.oas.models.media.Schema schema9 = strComparableSchema6.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema10 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str11 = strComparableSchema10.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema12 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema12.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema15 = strComparableSchema10.not((io.swagger.oas.models.media.Schema) strComparableSchema12);
        strComparableSchema10.setDescription("hi!");
        strComparableSchema10.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal21 = strComparableSchema10.getMultipleOf();
        java.lang.String str22 = strComparableSchema10.get$ref();
        java.lang.String[] strArray27 = new java.lang.String[] { ",", "*/*", "hi!", "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        strComparableSchema10.setRequired((java.util.List<java.lang.String>) strList28);
        java.lang.Integer int31 = strComparableSchema10.getMaxLength();
        strComparableSchema10.setTitle("*/*");
        io.swagger.oas.models.media.Schema schema34 = strComparableSchema6.not((io.swagger.oas.models.media.Schema) strComparableSchema10);
        io.swagger.oas.models.media.Discriminator discriminator35 = null;
        io.swagger.oas.models.media.Schema schema36 = strComparableSchema6.discriminator(discriminator35);
        java.lang.Boolean boolean37 = strComparableSchema6.getDeprecated();
        boolean boolean38 = strComparableSchema0.equals((java.lang.Object) boolean37);
        strComparableSchema0.setType("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 1\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: Optional[[class Tag {\n        name: Optional.empty\n        description: Optional.empty\n        externalDocs: null\n    }, class Tag {\n        name: hi!\n        description: hi!\n        externalDocs: null\n    }, class Tag {\n        name: #/components/schemas/\n        description: #/components/schemas/\n        externalDocs: null\n    }]]\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        strComparableSchema0.setType("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: -1\n    pattern: null\n    maxItems: null\n    minItems: -1\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(bigDecimal21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNull(boolean37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        io.swagger.oas.models.media.Schema schema2 = strComparableSchema0.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema4 = schema2.deprecated((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal5 = null;
        io.swagger.oas.models.media.Schema schema6 = schema2.maximum(bigDecimal5);
        io.swagger.oas.models.media.Schema schema8 = schema6.title("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 1\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema10 = schema8.title("hi!");
        io.swagger.oas.models.media.Schema schema12 = schema8.exclusiveMaximum((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal13 = null;
        schema12.setMinimum(bigDecimal13);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation15 = schema12.getExternalDocs();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema16 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str17 = strComparableSchema16.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema18 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema18.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema21 = strComparableSchema16.not((io.swagger.oas.models.media.Schema) strComparableSchema18);
        strComparableSchema16.setDescription("hi!");
        java.math.BigDecimal bigDecimal24 = null;
        strComparableSchema16.setMaximum(bigDecimal24);
        io.swagger.oas.models.media.Schema schema27 = strComparableSchema16.addRequiredItem("hi!");
        java.lang.Integer int28 = schema27.getMinLength();
        java.math.BigDecimal bigDecimal29 = schema27.getMaximum();
        schema27.setWriteOnly((java.lang.Boolean) true);
        java.lang.String str32 = schema27.getFormat();
        schema27.setExclusiveMaximum((java.lang.Boolean) false);
        java.lang.String str35 = schema27.getTitle();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation36 = schema27.getExternalDocs();
        io.swagger.oas.models.media.Schema schema37 = schema12.not(schema27);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(externalDocumentation15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNull(bigDecimal29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(externalDocumentation36);
        org.junit.Assert.assertNotNull(schema37);
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        strComparableSchema0.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal11 = strComparableSchema0.getMultipleOf();
        java.lang.String str12 = strComparableSchema0.get$ref();
        java.lang.String[] strArray17 = new java.lang.String[] { ",", "*/*", "hi!", "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        strComparableSchema0.setRequired((java.util.List<java.lang.String>) strList18);
        java.lang.Integer int21 = strComparableSchema0.getMaxLength();
        strComparableSchema0.setName("#/components/schemas/");
        io.swagger.oas.models.media.Schema schema25 = strComparableSchema0.$ref("#/components/schemas/");
        strComparableSchema0.setMaxProperties((java.lang.Integer) 0);
        java.math.BigDecimal bigDecimal28 = null;
        strComparableSchema0.setMinimum(bigDecimal28);
        io.swagger.oas.models.media.Schema schema31 = strComparableSchema0.deprecated((java.lang.Boolean) true);
        strComparableSchema0.setMinItems((java.lang.Integer) (-1));
        java.math.BigDecimal bigDecimal34 = null;
        io.swagger.oas.models.media.Schema schema35 = strComparableSchema0.maximum(bigDecimal34);
        java.math.BigDecimal bigDecimal36 = null;
        io.swagger.oas.models.media.Schema schema37 = schema35.maximum(bigDecimal36);
        schema37.setDescription(",");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(bigDecimal11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema37);
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema6 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str7 = strComparableSchema6.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema8 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema8.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema11 = strComparableSchema6.not((io.swagger.oas.models.media.Schema) strComparableSchema8);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema12 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str13 = strComparableSchema12.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema14 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema14.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema17 = strComparableSchema12.not((io.swagger.oas.models.media.Schema) strComparableSchema14);
        strComparableSchema12.setDescription("hi!");
        strComparableSchema12.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema6.setAdditionalProperties((io.swagger.oas.models.media.Schema) strComparableSchema12);
        io.swagger.oas.models.media.Schema schema24 = strComparableSchema2.not((io.swagger.oas.models.media.Schema) strComparableSchema6);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation25 = null;
        schema24.setExternalDocs(externalDocumentation25);
        schema24.setPattern("Optional.empty");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation29 = null;
        io.swagger.oas.models.media.Schema schema30 = schema24.externalDocs(externalDocumentation29);
        io.swagger.oas.models.media.Schema schema32 = schema24.pattern("");
        io.swagger.oas.models.media.Discriminator discriminator33 = null;
        schema32.setDiscriminator(discriminator33);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema32);
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap1 = null;
        io.swagger.oas.models.media.Schema schema2 = strComparableSchema0.properties(strMap1);
        java.lang.Boolean boolean3 = schema2.getUniqueItems();
        schema2.setExclusiveMinimum((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal6 = null;
        schema2.setMultipleOf(bigDecimal6);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema2.externalDocs(externalDocumentation8);
        io.swagger.oas.annotations.servers.Server server10 = null;
        io.swagger.oas.annotations.servers.Server[] serverArray11 = new io.swagger.oas.annotations.servers.Server[] { server10 };
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional12 = io.swagger.jaxrs2.OperationParser.getServers(serverArray11);
        boolean boolean13 = serverListOptional12.isPresent();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema14 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str15 = strComparableSchema14.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema16 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema16.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema19 = strComparableSchema14.not((io.swagger.oas.models.media.Schema) strComparableSchema16);
        java.lang.String str20 = strComparableSchema14.get$ref();
        io.swagger.oas.models.media.Schema schema21 = strComparableSchema14.getNot();
        boolean boolean22 = serverListOptional12.equals((java.lang.Object) schema21);
        java.math.BigDecimal bigDecimal23 = null;
        io.swagger.oas.models.media.Schema schema24 = schema21.multipleOf(bigDecimal23);
        io.swagger.oas.models.media.Schema schema25 = schema2.not(schema24);
        schema2.setName("class Schema {\n    title: Optional.empty\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: -1\n    uniqueItems: null\n    maxProperties: -1\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema2.setNullable((java.lang.Boolean) false);
        io.swagger.oas.models.media.Discriminator discriminator30 = null;
        io.swagger.oas.models.media.Schema schema31 = schema2.discriminator(discriminator30);
        io.swagger.oas.models.media.Schema schema33 = schema31.title("#/components/schemas/no description");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema34 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str35 = strComparableSchema34.get$ref();
        java.lang.String str36 = strComparableSchema34.getFormat();
        io.swagger.oas.models.media.Schema schema38 = strComparableSchema34.title("#/components/schemas/");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema39 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str40 = strComparableSchema39.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema41 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema41.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema44 = strComparableSchema39.not((io.swagger.oas.models.media.Schema) strComparableSchema41);
        strComparableSchema39.setDescription("hi!");
        strComparableSchema39.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema39.setNullable((java.lang.Boolean) false);
        java.lang.String str52 = strComparableSchema39.get$ref();
        io.swagger.oas.models.media.Schema schema54 = strComparableSchema39.name("");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema56 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation57 = strComparableSchema56.getExternalDocs();
        io.swagger.oas.models.media.Schema schema59 = strComparableSchema56.minItems((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema61 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str62 = strComparableSchema61.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema63 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema63.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema66 = strComparableSchema61.not((io.swagger.oas.models.media.Schema) strComparableSchema63);
        strComparableSchema61.setDescription("hi!");
        strComparableSchema61.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema61.setNullable((java.lang.Boolean) false);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap74 = strComparableSchema61.getProperties();
        io.swagger.oas.models.media.Schema schema75 = schema59.addProperties("hi!", (io.swagger.oas.models.media.Schema) strComparableSchema61);
        java.lang.Boolean boolean76 = strComparableSchema61.getDeprecated();
        io.swagger.oas.models.media.Schema schema77 = schema54.addProperties("Optional.empty", (io.swagger.oas.models.media.Schema) strComparableSchema61);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap78 = schema77.getProperties();
        strComparableSchema34.setProperties(strMap78);
        io.swagger.oas.models.media.Schema schema81 = strComparableSchema34.description("");
        io.swagger.oas.models.media.Schema schema82 = strComparableSchema34.getAdditionalProperties();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap83 = strComparableSchema34.getProperties();
        schema31.setProperties(strMap83);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(serverArray11);
        org.junit.Assert.assertNotNull(serverListOptional12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNull(externalDocumentation57);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNull(strMap74);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNull(boolean76);
        org.junit.Assert.assertNotNull(schema77);
        org.junit.Assert.assertNotNull(strMap78);
        org.junit.Assert.assertNotNull(schema81);
        org.junit.Assert.assertNull(schema82);
        org.junit.Assert.assertNotNull(strMap83);
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        strComparableSchema0.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema0.setNullable((java.lang.Boolean) false);
        java.lang.String str13 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema schema15 = strComparableSchema0.name("");
        java.math.BigDecimal bigDecimal16 = null;
        strComparableSchema0.setMinimum(bigDecimal16);
        java.lang.Boolean boolean18 = strComparableSchema0.getReadOnly();
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList19 = strComparableSchema0.getEnum();
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList20 = strComparableSchema0.getEnum();
        io.swagger.oas.models.media.Schema schema21 = strComparableSchema0.getNot();
        io.swagger.oas.models.media.Schema schema23 = schema21.type("*/*");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema25 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str26 = strComparableSchema25.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema27 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema27.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema30 = strComparableSchema25.not((io.swagger.oas.models.media.Schema) strComparableSchema27);
        strComparableSchema27.setMaxLength((java.lang.Integer) 0);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema34 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        io.swagger.oas.models.media.Schema schema36 = strComparableSchema34.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema38 = schema36.deprecated((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal39 = null;
        io.swagger.oas.models.media.Schema schema40 = schema36.maximum(bigDecimal39);
        io.swagger.oas.models.media.Schema schema42 = schema40.title("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 1\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema44 = schema42.title("hi!");
        schema42.setMinProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema47 = strComparableSchema27.addProperties(",", schema42);
        java.math.BigDecimal bigDecimal48 = null;
        io.swagger.oas.models.media.Schema schema49 = schema42.multipleOf(bigDecimal48);
        java.lang.Integer int50 = schema42.getMinLength();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema52 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str53 = strComparableSchema52.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema54 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema54.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema57 = strComparableSchema52.not((io.swagger.oas.models.media.Schema) strComparableSchema54);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema58 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str59 = strComparableSchema58.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema60 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema60.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema63 = strComparableSchema58.not((io.swagger.oas.models.media.Schema) strComparableSchema60);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema64 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str65 = strComparableSchema64.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema66 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema66.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema69 = strComparableSchema64.not((io.swagger.oas.models.media.Schema) strComparableSchema66);
        strComparableSchema64.setDescription("hi!");
        strComparableSchema64.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema58.setAdditionalProperties((io.swagger.oas.models.media.Schema) strComparableSchema64);
        io.swagger.oas.models.media.Schema schema76 = strComparableSchema54.not((io.swagger.oas.models.media.Schema) strComparableSchema58);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation77 = null;
        schema76.setExternalDocs(externalDocumentation77);
        schema76.setPattern("Optional.empty");
        io.swagger.oas.models.media.Schema schema82 = schema76.pattern("#/components/schemas/");
        io.swagger.oas.models.media.Schema schema83 = schema42.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: false\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema82);
        io.swagger.oas.models.media.Schema schema85 = schema82.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 100\n    uniqueItems: true\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: #/components/schemas/\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema82.setNullable((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema88 = schema21.addProperties("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: -1\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema82);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNull(strComparableList19);
        org.junit.Assert.assertNull(strComparableList20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNotNull(schema83);
        org.junit.Assert.assertNotNull(schema85);
        org.junit.Assert.assertNotNull(schema88);
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema6 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str7 = strComparableSchema6.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema8 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema8.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema11 = strComparableSchema6.not((io.swagger.oas.models.media.Schema) strComparableSchema8);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema12 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str13 = strComparableSchema12.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema14 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema14.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema17 = strComparableSchema12.not((io.swagger.oas.models.media.Schema) strComparableSchema14);
        strComparableSchema12.setDescription("hi!");
        strComparableSchema12.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema6.setAdditionalProperties((io.swagger.oas.models.media.Schema) strComparableSchema12);
        io.swagger.oas.models.media.Schema schema24 = strComparableSchema2.not((io.swagger.oas.models.media.Schema) strComparableSchema6);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap25 = strComparableSchema6.getProperties();
        strComparableSchema6.setUniqueItems((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema29 = strComparableSchema6.maxItems((java.lang.Integer) (-1));
        java.lang.Boolean boolean30 = schema29.getExclusiveMinimum();
        java.math.BigDecimal bigDecimal31 = schema29.getMinimum();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNull(bigDecimal31);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        strComparableSchema0.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal11 = strComparableSchema0.getMultipleOf();
        java.lang.String str12 = strComparableSchema0.get$ref();
        java.lang.String[] strArray17 = new java.lang.String[] { ",", "*/*", "hi!", "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        strComparableSchema0.setRequired((java.util.List<java.lang.String>) strList18);
        java.lang.Integer int21 = strComparableSchema0.getMaxLength();
        strComparableSchema0.setTitle("*/*");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema24 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str25 = strComparableSchema24.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema26 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema26.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema29 = strComparableSchema24.not((io.swagger.oas.models.media.Schema) strComparableSchema26);
        strComparableSchema24.setDescription("hi!");
        strComparableSchema24.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal35 = strComparableSchema24.getMultipleOf();
        java.lang.String str36 = strComparableSchema24.get$ref();
        java.math.BigDecimal bigDecimal37 = null;
        io.swagger.oas.models.media.Schema schema38 = strComparableSchema24.maximum(bigDecimal37);
        io.swagger.oas.models.media.Discriminator discriminator39 = strComparableSchema24.getDiscriminator();
        io.swagger.oas.models.media.Schema schema40 = strComparableSchema0.additionalProperties((io.swagger.oas.models.media.Schema) strComparableSchema24);
        io.swagger.oas.models.media.Schema schema42 = strComparableSchema0.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: 1\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: Optional[[class Tag {\n        name: Optional.empty\n        description: Optional.empty\n        externalDocs: null\n    }, class Tag {\n        name: hi!\n        description: hi!\n        externalDocs: null\n    }, class Tag {\n        name: #/components/schemas/\n        description: #/components/schemas/\n        externalDocs: null\n    }]]\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema42.setUniqueItems((java.lang.Boolean) false);
        java.lang.Object obj45 = schema42.getExample();
        java.math.BigDecimal bigDecimal46 = schema42.getMaximum();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(bigDecimal11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(bigDecimal35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(discriminator39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(bigDecimal46);
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap1 = null;
        io.swagger.oas.models.media.Schema schema2 = strComparableSchema0.properties(strMap1);
        java.lang.Boolean boolean3 = schema2.getUniqueItems();
        schema2.setExclusiveMinimum((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal6 = null;
        schema2.setMultipleOf(bigDecimal6);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema2.externalDocs(externalDocumentation8);
        io.swagger.oas.models.media.Schema schema11 = schema9.format("Optional.empty");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema12 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str13 = strComparableSchema12.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema14 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema14.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema17 = strComparableSchema12.not((io.swagger.oas.models.media.Schema) strComparableSchema14);
        strComparableSchema12.setDescription("hi!");
        strComparableSchema12.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal23 = strComparableSchema12.getMultipleOf();
        java.lang.String str24 = strComparableSchema12.get$ref();
        java.lang.String[] strArray29 = new java.lang.String[] { ",", "*/*", "hi!", "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        strComparableSchema12.setRequired((java.util.List<java.lang.String>) strList30);
        java.lang.Integer int33 = strComparableSchema12.getMaxLength();
        java.lang.Integer int34 = strComparableSchema12.getMaxProperties();
        io.swagger.oas.models.media.Schema schema36 = strComparableSchema12.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema37 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str38 = strComparableSchema37.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema39 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema39.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema42 = strComparableSchema37.not((io.swagger.oas.models.media.Schema) strComparableSchema39);
        strComparableSchema37.setDescription("hi!");
        strComparableSchema37.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal48 = strComparableSchema37.getMultipleOf();
        java.lang.String str49 = strComparableSchema37.get$ref();
        io.swagger.oas.models.media.Schema schema50 = schema36.example((java.lang.Object) strComparableSchema37);
        java.lang.Integer int51 = schema50.getMaxLength();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema52 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str53 = strComparableSchema52.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema54 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema54.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema57 = strComparableSchema52.not((io.swagger.oas.models.media.Schema) strComparableSchema54);
        java.lang.String str58 = strComparableSchema52.get$ref();
        java.lang.String[] strArray63 = new java.lang.String[] { "Optional.empty", "", "*/*", "no description" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.util.Optional<java.util.AbstractCollection<java.lang.String>> strCollectionOptional66 = java.util.Optional.ofNullable((java.util.AbstractCollection<java.lang.String>) strList64);
        io.swagger.oas.models.media.Schema schema67 = strComparableSchema52.required((java.util.List<java.lang.String>) strList64);
        io.swagger.oas.models.media.Schema schema68 = schema50.required((java.util.List<java.lang.String>) strList64);
        io.swagger.oas.models.media.Schema schema70 = schema68.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 100\n    uniqueItems: true\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: #/components/schemas/\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema71 = schema11.additionalProperties(schema68);
        schema71.addEnumItemObject((java.lang.Comparable<java.lang.String>) "Optional.empty");
        java.lang.Boolean boolean74 = schema71.getDeprecated();
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList75 = schema71.getEnum();
        java.lang.Class<?> wildcardClass76 = schema71.getClass();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(bigDecimal23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNull(bigDecimal48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNull(int51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strCollectionOptional66);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNull(boolean74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap1 = null;
        io.swagger.oas.models.media.Schema schema2 = strComparableSchema0.properties(strMap1);
        java.lang.Boolean boolean3 = schema2.getUniqueItems();
        schema2.setExclusiveMinimum((java.lang.Boolean) false);
        java.lang.Object obj6 = schema2.getExample();
        io.swagger.oas.models.media.Schema schema8 = schema2.minLength((java.lang.Integer) 10);
        java.util.List<java.lang.String> strList9 = schema8.getRequired();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap10 = null;
        schema8.setProperties(strMap10);
        io.swagger.oas.models.media.Schema schema13 = schema8.minItems((java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = schema8.getExtensions();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        strComparableSchema2.setExtensions(strMap6);
        strComparableSchema2.setExclusiveMaximum((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal10 = null;
        io.swagger.oas.models.media.Schema schema11 = strComparableSchema2.minimum(bigDecimal10);
        schema11.set$ref("no description");
        schema11.setDeprecated((java.lang.Boolean) false);
        schema11.setDescription("*/*");
        io.swagger.oas.models.media.Schema schema19 = schema11.format("no description");
        io.swagger.oas.models.media.Schema schema21 = schema11.readOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema23 = schema21.pattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: false\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        schema23.setPattern("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: false\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: Optional.empty\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema23);
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        strComparableSchema0.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema0.setNullable((java.lang.Boolean) false);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap13 = strComparableSchema0.getProperties();
        java.lang.Boolean boolean14 = strComparableSchema0.getReadOnly();
        java.math.BigDecimal bigDecimal15 = strComparableSchema0.getMinimum();
        strComparableSchema0.setMinLength((java.lang.Integer) 0);
        strComparableSchema0.setType("");
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = strComparableSchema0.getExtensions();
        io.swagger.oas.models.media.Schema schema22 = strComparableSchema0.uniqueItems((java.lang.Boolean) false);
        java.lang.String str23 = schema22.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(bigDecimal15);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap1 = null;
        io.swagger.oas.models.media.Schema schema2 = strComparableSchema0.properties(strMap1);
        strComparableSchema0.addEnumItemObject((java.lang.Comparable<java.lang.String>) "no description");
        java.lang.String str5 = strComparableSchema0.getFormat();
        io.swagger.oas.models.media.XML xML6 = null;
        strComparableSchema0.setXml(xML6);
        io.swagger.oas.models.media.Schema schema9 = strComparableSchema0.title("#/components/schemas/");
        io.swagger.oas.models.media.Schema schema11 = schema9.uniqueItems((java.lang.Boolean) false);
        java.lang.Object obj12 = schema11.getExample();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        java.math.BigDecimal bigDecimal8 = null;
        strComparableSchema0.setMaximum(bigDecimal8);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema10 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str11 = strComparableSchema10.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema12 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema12.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema15 = strComparableSchema10.not((io.swagger.oas.models.media.Schema) strComparableSchema12);
        strComparableSchema10.setDescription("hi!");
        strComparableSchema10.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal21 = strComparableSchema10.getMultipleOf();
        java.lang.String str22 = strComparableSchema10.get$ref();
        java.lang.String[] strArray27 = new java.lang.String[] { ",", "*/*", "hi!", "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        strComparableSchema10.setRequired((java.util.List<java.lang.String>) strList28);
        io.swagger.oas.models.media.Schema schema31 = strComparableSchema0.required((java.util.List<java.lang.String>) strList28);
        io.swagger.oas.models.media.Schema schema33 = strComparableSchema0.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation34 = null;
        io.swagger.oas.models.media.Schema schema35 = schema33.externalDocs(externalDocumentation34);
        io.swagger.oas.models.media.Schema schema37 = schema33.addRequiredItem("Optional.empty");
        schema33.setDescription("#/components/schemas/");
        io.swagger.oas.models.media.Schema schema41 = schema33.minProperties((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema43 = schema41.pattern("");
        io.swagger.oas.models.media.XML xML44 = null;
        io.swagger.oas.models.media.Schema schema45 = schema43.xml(xML44);
        io.swagger.oas.models.media.Schema schema47 = schema43.exclusiveMaximum((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(bigDecimal21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema47);
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        strComparableSchema0.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema0.setNullable((java.lang.Boolean) false);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap13 = strComparableSchema0.getProperties();
        java.lang.Boolean boolean14 = strComparableSchema0.getReadOnly();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableSchema0.getDefault();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap16 = null;
        strComparableSchema0.setProperties(strMap16);
        io.swagger.oas.models.media.Schema schema19 = strComparableSchema0.description("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: true\n    xml: null\n}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        io.swagger.oas.models.media.Schema schema2 = strComparableSchema0.writeOnly((java.lang.Boolean) false);
        java.lang.String[] strArray8 = new java.lang.String[] { "Optional.empty", "hi!", "hi!", "Optional.empty", "#/components/schemas/" };
        java.util.Optional<java.util.Set<io.swagger.oas.models.tags.Tag>> tagSetOptional9 = io.swagger.jaxrs2.OperationParser.getTags(strArray8);
        schema2.setExample((java.lang.Object) tagSetOptional9);
        java.lang.Object obj12 = null;
        schema2.addExtension("*/*", obj12);
        schema2.setDeprecated((java.lang.Boolean) false);
        java.lang.Integer int16 = schema2.getMaxLength();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema18 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str19 = strComparableSchema18.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema20 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema20.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema23 = strComparableSchema18.not((io.swagger.oas.models.media.Schema) strComparableSchema20);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema24 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str25 = strComparableSchema24.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema26 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema26.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema29 = strComparableSchema24.not((io.swagger.oas.models.media.Schema) strComparableSchema26);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema30 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str31 = strComparableSchema30.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema32 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema32.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema35 = strComparableSchema30.not((io.swagger.oas.models.media.Schema) strComparableSchema32);
        strComparableSchema30.setDescription("hi!");
        strComparableSchema30.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema24.setAdditionalProperties((io.swagger.oas.models.media.Schema) strComparableSchema30);
        io.swagger.oas.models.media.Schema schema42 = strComparableSchema20.not((io.swagger.oas.models.media.Schema) strComparableSchema24);
        java.math.BigDecimal bigDecimal43 = null;
        io.swagger.oas.models.media.Schema schema44 = schema42.multipleOf(bigDecimal43);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema45 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str46 = strComparableSchema45.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema47 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema47.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema50 = strComparableSchema45.not((io.swagger.oas.models.media.Schema) strComparableSchema47);
        strComparableSchema45.setDescription("hi!");
        strComparableSchema45.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema45.setNullable((java.lang.Boolean) false);
        java.lang.String str58 = strComparableSchema45.get$ref();
        io.swagger.oas.models.media.Schema schema60 = strComparableSchema45.name("");
        io.swagger.oas.models.media.Schema schema62 = schema60.minProperties((java.lang.Integer) 10);
        boolean boolean63 = schema44.equals((java.lang.Object) schema60);
        schema60.setWriteOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema66 = schema2.addProperties("#/components/schemas/class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: false\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", schema60);
        io.swagger.oas.models.media.Schema schema68 = schema2.name("");
        schema2.setMaxProperties((java.lang.Integer) 0);
        schema2.setReadOnly((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(tagSetOptional9);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNotNull(schema68);
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        io.swagger.oas.models.media.XML xML6 = null;
        io.swagger.oas.models.media.Schema schema7 = strComparableSchema0.xml(xML6);
        java.lang.String str8 = strComparableSchema0.getDescription();
        io.swagger.oas.models.media.Schema schema10 = strComparableSchema0.nullable((java.lang.Boolean) false);
        io.swagger.oas.models.media.XML xML11 = null;
        io.swagger.oas.models.media.Schema schema12 = strComparableSchema0.xml(xML11);
        io.swagger.oas.models.media.Schema schema14 = strComparableSchema0.minItems((java.lang.Integer) (-1));
        java.lang.Integer int15 = strComparableSchema0.getMinProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        strComparableSchema0.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema0.setNullable((java.lang.Boolean) false);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap13 = strComparableSchema0.getProperties();
        java.lang.Boolean boolean14 = strComparableSchema0.getReadOnly();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableSchema0.getDefault();
        io.swagger.oas.models.media.Schema schema17 = strComparableSchema0.addRequiredItem("");
        java.lang.Object obj18 = strComparableSchema0.getExample();
        io.swagger.oas.models.media.Schema schema20 = strComparableSchema0.nullable((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal21 = strComparableSchema0.getMaximum();
        io.swagger.oas.models.media.Discriminator discriminator22 = null;
        strComparableSchema0.setDiscriminator(discriminator22);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(bigDecimal21);
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap1 = null;
        io.swagger.oas.models.media.Schema schema2 = strComparableSchema0.properties(strMap1);
        java.lang.Boolean boolean3 = schema2.getUniqueItems();
        schema2.setExclusiveMinimum((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal6 = null;
        schema2.setMultipleOf(bigDecimal6);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema2.externalDocs(externalDocumentation8);
        io.swagger.oas.models.media.Schema schema11 = schema2.format("#/components/schemas/");
        io.swagger.oas.models.media.Discriminator discriminator12 = null;
        io.swagger.oas.models.media.Schema schema13 = schema2.discriminator(discriminator12);
        schema13.setDescription(",");
        io.swagger.oas.models.media.Schema schema17 = schema13.readOnly((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal18 = schema17.getMaximum();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap19 = schema17.getProperties();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(bigDecimal18);
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation1 = strComparableSchema0.getExternalDocs();
        java.lang.Comparable<java.lang.String> strComparable2 = strComparableSchema0.getDefault();
        java.lang.Integer int3 = strComparableSchema0.getMinProperties();
        strComparableSchema0.setWriteOnly((java.lang.Boolean) true);
        io.swagger.oas.models.media.Discriminator discriminator6 = null;
        strComparableSchema0.setDiscriminator(discriminator6);
        io.swagger.oas.models.media.Schema schema9 = strComparableSchema0.maxProperties((java.lang.Integer) 10);
        strComparableSchema0.setWriteOnly((java.lang.Boolean) false);
        org.junit.Assert.assertNull(externalDocumentation1);
        org.junit.Assert.assertNull(strComparable2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema6 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str7 = strComparableSchema6.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema8 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema8.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema11 = strComparableSchema6.not((io.swagger.oas.models.media.Schema) strComparableSchema8);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema12 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str13 = strComparableSchema12.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema14 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema14.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema17 = strComparableSchema12.not((io.swagger.oas.models.media.Schema) strComparableSchema14);
        strComparableSchema12.setDescription("hi!");
        strComparableSchema12.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema6.setAdditionalProperties((io.swagger.oas.models.media.Schema) strComparableSchema12);
        io.swagger.oas.models.media.Schema schema24 = strComparableSchema2.not((io.swagger.oas.models.media.Schema) strComparableSchema6);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation25 = null;
        schema24.setExternalDocs(externalDocumentation25);
        schema24.setPattern("Optional.empty");
        io.swagger.oas.models.media.Schema schema30 = schema24.pattern("#/components/schemas/");
        schema30.setExclusiveMaximum((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = schema30.getExtensions();
        io.swagger.oas.models.media.Schema schema35 = schema30.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema37 = schema30.exclusiveMaximum((java.lang.Boolean) true);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap38 = schema37.getProperties();
        io.swagger.oas.models.media.Schema schema40 = schema37.deprecated((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation41 = schema37.getExternalDocs();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNull(strMap33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNull(strMap38);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(externalDocumentation41);
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        java.lang.String str6 = strComparableSchema0.get$ref();
        java.lang.String[] strArray11 = new java.lang.String[] { "Optional.empty", "", "*/*", "no description" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.Optional<java.util.AbstractCollection<java.lang.String>> strCollectionOptional14 = java.util.Optional.ofNullable((java.util.AbstractCollection<java.lang.String>) strList12);
        io.swagger.oas.models.media.Schema schema15 = strComparableSchema0.required((java.util.List<java.lang.String>) strList12);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema16 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation17 = strComparableSchema16.getExternalDocs();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableSchema16.getDefault();
        java.math.BigDecimal bigDecimal19 = null;
        strComparableSchema16.setMaximum(bigDecimal19);
        strComparableSchema0.setNot((io.swagger.oas.models.media.Schema) strComparableSchema16);
        io.swagger.oas.models.media.Schema schema23 = strComparableSchema16.minLength((java.lang.Integer) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strCollectionOptional14);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(externalDocumentation17);
        org.junit.Assert.assertNull(strComparable18);
        org.junit.Assert.assertNotNull(schema23);
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        strComparableSchema0.addExtension("", (java.lang.Object) 0.0f);
        io.swagger.oas.models.media.Schema schema11 = strComparableSchema0.getAdditionalProperties();
        io.swagger.oas.models.media.Schema schema13 = strComparableSchema0.name("");
        schema13.setReadOnly((java.lang.Boolean) true);
        java.lang.Boolean boolean16 = schema13.getUniqueItems();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        strComparableSchema0.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal11 = strComparableSchema0.getMultipleOf();
        java.lang.String str12 = strComparableSchema0.get$ref();
        java.math.BigDecimal bigDecimal13 = null;
        io.swagger.oas.models.media.Schema schema14 = strComparableSchema0.maximum(bigDecimal13);
        java.lang.Integer int15 = schema14.getMaxLength();
        schema14.setMinProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Schema schema19 = schema14.title("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: false\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: Optional.empty\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Discriminator discriminator20 = null;
        schema19.setDiscriminator(discriminator20);
        java.lang.String str22 = schema19.get$ref();
        java.math.BigDecimal bigDecimal23 = schema19.getMultipleOf();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation24 = null;
        schema19.setExternalDocs(externalDocumentation24);
        java.math.BigDecimal bigDecimal26 = null;
        schema19.setMultipleOf(bigDecimal26);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(bigDecimal11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(bigDecimal23);
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        strComparableSchema0.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal11 = strComparableSchema0.getMultipleOf();
        java.lang.String str12 = strComparableSchema0.get$ref();
        java.lang.String[] strArray17 = new java.lang.String[] { ",", "*/*", "hi!", "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        strComparableSchema0.setRequired((java.util.List<java.lang.String>) strList18);
        java.lang.Integer int21 = strComparableSchema0.getMaxLength();
        java.lang.Integer int22 = strComparableSchema0.getMaxProperties();
        io.swagger.oas.models.media.Schema schema24 = strComparableSchema0.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema25 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str26 = strComparableSchema25.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema27 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema27.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema30 = strComparableSchema25.not((io.swagger.oas.models.media.Schema) strComparableSchema27);
        strComparableSchema25.setDescription("hi!");
        strComparableSchema25.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal36 = strComparableSchema25.getMultipleOf();
        java.lang.String str37 = strComparableSchema25.get$ref();
        io.swagger.oas.models.media.Schema schema38 = schema24.example((java.lang.Object) strComparableSchema25);
        schema38.setMaxItems((java.lang.Integer) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(bigDecimal11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNull(bigDecimal36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(schema38);
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        io.swagger.oas.models.ExternalDocumentation externalDocumentation1 = strComparableSchema0.getExternalDocs();
        java.lang.Integer int2 = strComparableSchema0.getMinProperties();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema3 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema3.writeOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema7 = schema5.deprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema8 = strComparableSchema0.not(schema7);
        io.swagger.oas.models.media.Schema schema10 = schema8.exclusiveMinimum((java.lang.Boolean) true);
        org.junit.Assert.assertNull(externalDocumentation1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap1 = null;
        io.swagger.oas.models.media.Schema schema2 = strComparableSchema0.properties(strMap1);
        java.lang.Boolean boolean3 = schema2.getUniqueItems();
        schema2.setExclusiveMinimum((java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal6 = null;
        schema2.setMultipleOf(bigDecimal6);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation8 = null;
        io.swagger.oas.models.media.Schema schema9 = schema2.externalDocs(externalDocumentation8);
        io.swagger.oas.annotations.servers.Server server10 = null;
        io.swagger.oas.annotations.servers.Server[] serverArray11 = new io.swagger.oas.annotations.servers.Server[] { server10 };
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional12 = io.swagger.jaxrs2.OperationParser.getServers(serverArray11);
        boolean boolean13 = serverListOptional12.isPresent();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema14 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str15 = strComparableSchema14.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema16 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema16.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema19 = strComparableSchema14.not((io.swagger.oas.models.media.Schema) strComparableSchema16);
        java.lang.String str20 = strComparableSchema14.get$ref();
        io.swagger.oas.models.media.Schema schema21 = strComparableSchema14.getNot();
        boolean boolean22 = serverListOptional12.equals((java.lang.Object) schema21);
        java.math.BigDecimal bigDecimal23 = null;
        io.swagger.oas.models.media.Schema schema24 = schema21.multipleOf(bigDecimal23);
        io.swagger.oas.models.media.Schema schema25 = schema2.not(schema24);
        io.swagger.oas.models.media.Schema schema27 = schema24.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.media.Schema schema29 = schema24.maxProperties((java.lang.Integer) 0);
        io.swagger.oas.models.media.Discriminator discriminator30 = null;
        io.swagger.oas.models.media.Schema schema31 = schema24.discriminator(discriminator30);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema32 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str33 = strComparableSchema32.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema34 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema34.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema37 = strComparableSchema32.not((io.swagger.oas.models.media.Schema) strComparableSchema34);
        strComparableSchema32.setDescription("hi!");
        strComparableSchema32.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal43 = strComparableSchema32.getMultipleOf();
        java.lang.String str44 = strComparableSchema32.get$ref();
        java.math.BigDecimal bigDecimal45 = null;
        io.swagger.oas.models.media.Schema schema46 = strComparableSchema32.maximum(bigDecimal45);
        io.swagger.oas.models.media.Discriminator discriminator47 = strComparableSchema32.getDiscriminator();
        io.swagger.oas.models.media.Schema schema49 = strComparableSchema32.exclusiveMinimum((java.lang.Boolean) true);
        java.math.BigDecimal bigDecimal50 = null;
        io.swagger.oas.models.media.Schema schema51 = schema49.minimum(bigDecimal50);
        schema49.setMaxProperties((java.lang.Integer) 10);
        io.swagger.oas.models.media.Discriminator discriminator54 = null;
        schema49.setDiscriminator(discriminator54);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema56 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.util.List<java.lang.String> strList57 = strComparableSchema56.getRequired();
        io.swagger.oas.models.media.Schema schema59 = strComparableSchema56.exclusiveMinimum((java.lang.Boolean) false);
        strComparableSchema56.setExclusiveMinimum((java.lang.Boolean) false);
        java.lang.Boolean boolean62 = strComparableSchema56.getExclusiveMinimum();
        io.swagger.oas.models.media.Schema schema64 = strComparableSchema56.type("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: true\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: \n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: false\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        io.swagger.oas.models.media.Schema schema65 = schema49.not(schema64);
        io.swagger.oas.models.media.Schema schema67 = schema49.maxItems((java.lang.Integer) 1);
        schema31.setNot(schema49);
        io.swagger.oas.models.media.Discriminator discriminator69 = schema31.getDiscriminator();
        java.lang.String str70 = schema31.get$ref();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(serverArray11);
        org.junit.Assert.assertNotNull(serverListOptional12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNull(bigDecimal43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNull(discriminator47);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNull(strList57);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertEquals("'" + boolean62 + "' != '" + false + "'", boolean62, false);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNull(discriminator69);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        strComparableSchema0.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema0.setNullable((java.lang.Boolean) false);
        java.lang.String str13 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema schema15 = strComparableSchema0.name("");
        java.math.BigDecimal bigDecimal16 = null;
        schema15.setMinimum(bigDecimal16);
        io.swagger.oas.models.media.Schema schema19 = schema15.exclusiveMinimum((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        io.swagger.oas.annotations.servers.Server server0 = null;
        io.swagger.oas.annotations.servers.Server[] serverArray1 = new io.swagger.oas.annotations.servers.Server[] { server0 };
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional2 = io.swagger.jaxrs2.OperationParser.getServers(serverArray1);
        boolean boolean3 = serverListOptional2.isPresent();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema4 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str5 = strComparableSchema4.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema6 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema6.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema9 = strComparableSchema4.not((io.swagger.oas.models.media.Schema) strComparableSchema6);
        java.lang.String str10 = strComparableSchema4.get$ref();
        io.swagger.oas.models.media.Schema schema11 = strComparableSchema4.getNot();
        boolean boolean12 = serverListOptional2.equals((java.lang.Object) schema11);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap13 = null;
        io.swagger.oas.models.media.Schema schema14 = schema11.properties(strMap13);
        io.swagger.oas.models.media.Schema schema16 = schema11.uniqueItems((java.lang.Boolean) false);
        java.lang.String str17 = schema16.getTitle();
        io.swagger.oas.models.media.Discriminator discriminator18 = schema16.getDiscriminator();
        java.math.BigDecimal bigDecimal19 = null;
        io.swagger.oas.models.media.Schema schema20 = schema16.multipleOf(bigDecimal19);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema21 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str22 = strComparableSchema21.get$ref();
        io.swagger.oas.models.media.Schema schema24 = strComparableSchema21.description("Optional.empty");
        io.swagger.oas.models.media.Schema schema26 = strComparableSchema21.uniqueItems((java.lang.Boolean) false);
        schema26.setDescription("");
        schema26.setType("");
        io.swagger.oas.models.ExternalDocumentation externalDocumentation31 = null;
        schema26.setExternalDocs(externalDocumentation31);
        java.math.BigDecimal bigDecimal33 = null;
        io.swagger.oas.models.media.Schema schema34 = schema26.multipleOf(bigDecimal33);
        java.lang.String str35 = schema26.getPattern();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema36 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str37 = strComparableSchema36.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema38 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema38.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema41 = strComparableSchema36.not((io.swagger.oas.models.media.Schema) strComparableSchema38);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema42 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str43 = strComparableSchema42.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema44 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema44.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema47 = strComparableSchema42.not((io.swagger.oas.models.media.Schema) strComparableSchema44);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema48 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str49 = strComparableSchema48.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema50 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema50.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema53 = strComparableSchema48.not((io.swagger.oas.models.media.Schema) strComparableSchema50);
        strComparableSchema48.setDescription("hi!");
        strComparableSchema48.addExtension("", (java.lang.Object) 0.0f);
        strComparableSchema42.setAdditionalProperties((io.swagger.oas.models.media.Schema) strComparableSchema48);
        io.swagger.oas.models.media.Schema schema60 = strComparableSchema38.not((io.swagger.oas.models.media.Schema) strComparableSchema42);
        java.lang.Boolean boolean61 = strComparableSchema38.getExclusiveMinimum();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema63 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str64 = strComparableSchema63.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema65 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema65.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema68 = strComparableSchema63.not((io.swagger.oas.models.media.Schema) strComparableSchema65);
        strComparableSchema63.setDescription("hi!");
        io.swagger.oas.models.media.Schema schema72 = strComparableSchema63.exclusiveMinimum((java.lang.Boolean) false);
        strComparableSchema38.addExtension("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: 1\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}", (java.lang.Object) false);
        java.lang.String[] strArray78 = new java.lang.String[] { "Optional.empty", "", "*/*", "no description" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        java.util.Optional<java.util.AbstractCollection<java.lang.String>> strCollectionOptional81 = java.util.Optional.ofNullable((java.util.AbstractCollection<java.lang.String>) strList79);
        io.swagger.oas.models.media.Schema schema82 = strComparableSchema38.required((java.util.List<java.lang.String>) strList79);
        schema26.setRequired((java.util.List<java.lang.String>) strList79);
        schema20.setDefault((java.lang.Object) schema26);
        java.math.BigDecimal bigDecimal85 = null;
        schema20.setMaximum(bigDecimal85);
        org.junit.Assert.assertNotNull(serverArray1);
        org.junit.Assert.assertNotNull(serverListOptional2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(discriminator18);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNull(boolean61);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(strCollectionOptional81);
        org.junit.Assert.assertNotNull(schema82);
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        java.math.BigDecimal bigDecimal8 = null;
        strComparableSchema0.setMaximum(bigDecimal8);
        strComparableSchema0.setTitle("*/*");
        io.swagger.oas.models.media.Schema schema13 = strComparableSchema0.readOnly((java.lang.Boolean) true);
        java.lang.String str14 = strComparableSchema0.getTitle();
        io.swagger.oas.models.media.Schema schema16 = strComparableSchema0.maxItems((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema18 = schema16.writeOnly((java.lang.Boolean) false);
        java.lang.String str19 = schema18.getDescription();
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap20 = schema18.getProperties();
        java.lang.Integer int21 = schema18.getMinItems();
        schema18.setMaxLength((java.lang.Integer) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "*/*" + "'", str14, "*/*");
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNull(int21);
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        io.swagger.oas.models.media.Schema schema9 = strComparableSchema0.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema10 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str11 = strComparableSchema10.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema12 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema12.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema15 = strComparableSchema10.not((io.swagger.oas.models.media.Schema) strComparableSchema12);
        strComparableSchema10.setDescription("hi!");
        strComparableSchema10.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal21 = strComparableSchema10.getMultipleOf();
        java.lang.String str22 = strComparableSchema10.get$ref();
        java.lang.String[] strArray27 = new java.lang.String[] { ",", "*/*", "hi!", "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        strComparableSchema10.setRequired((java.util.List<java.lang.String>) strList28);
        schema9.setNot((io.swagger.oas.models.media.Schema) strComparableSchema10);
        schema9.setName("Optional.empty");
        io.swagger.oas.models.media.Schema schema35 = schema9.format("Optional.empty");
        schema35.setDeprecated((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema39 = schema35.nullable((java.lang.Boolean) false);
        schema39.setMinItems((java.lang.Integer) 1);
        io.swagger.oas.models.media.Schema schema43 = schema39.maxProperties((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(bigDecimal21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema43);
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        java.math.BigDecimal bigDecimal8 = null;
        strComparableSchema0.setMaximum(bigDecimal8);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema10 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str11 = strComparableSchema10.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema12 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema12.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema15 = strComparableSchema10.not((io.swagger.oas.models.media.Schema) strComparableSchema12);
        strComparableSchema10.setDescription("hi!");
        strComparableSchema10.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal21 = strComparableSchema10.getMultipleOf();
        java.lang.String str22 = strComparableSchema10.get$ref();
        java.lang.String[] strArray27 = new java.lang.String[] { ",", "*/*", "hi!", "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        strComparableSchema10.setRequired((java.util.List<java.lang.String>) strList28);
        io.swagger.oas.models.media.Schema schema31 = strComparableSchema0.required((java.util.List<java.lang.String>) strList28);
        io.swagger.oas.models.media.Schema schema33 = strComparableSchema0.maxProperties((java.lang.Integer) (-1));
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema34 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str35 = strComparableSchema34.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema36 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema36.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema39 = strComparableSchema34.not((io.swagger.oas.models.media.Schema) strComparableSchema36);
        java.lang.String str40 = strComparableSchema34.get$ref();
        java.lang.String[] strArray45 = new java.lang.String[] { "Optional.empty", "", "*/*", "no description" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.Optional<java.util.AbstractCollection<java.lang.String>> strCollectionOptional48 = java.util.Optional.ofNullable((java.util.AbstractCollection<java.lang.String>) strList46);
        io.swagger.oas.models.media.Schema schema49 = strComparableSchema34.required((java.util.List<java.lang.String>) strList46);
        io.swagger.oas.models.media.Schema schema50 = schema33.required((java.util.List<java.lang.String>) strList46);
        java.lang.String str51 = schema33.getTitle();
        java.util.Optional<io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>> strComparableSchemaOptional52 = java.util.Optional.of((io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>) schema33);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(bigDecimal21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strCollectionOptional48);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strComparableSchemaOptional52);
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        java.math.BigDecimal bigDecimal8 = null;
        strComparableSchema0.setMaximum(bigDecimal8);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema10 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str11 = strComparableSchema10.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema12 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema12.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema15 = strComparableSchema10.not((io.swagger.oas.models.media.Schema) strComparableSchema12);
        strComparableSchema10.setDescription("hi!");
        strComparableSchema10.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal21 = strComparableSchema10.getMultipleOf();
        java.lang.String str22 = strComparableSchema10.get$ref();
        java.lang.String[] strArray27 = new java.lang.String[] { ",", "*/*", "hi!", "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        strComparableSchema10.setRequired((java.util.List<java.lang.String>) strList28);
        io.swagger.oas.models.media.Schema schema31 = strComparableSchema0.required((java.util.List<java.lang.String>) strList28);
        io.swagger.oas.models.media.Schema schema33 = strComparableSchema0.exclusiveMaximum((java.lang.Boolean) true);
        io.swagger.oas.models.ExternalDocumentation externalDocumentation34 = null;
        io.swagger.oas.models.media.Schema schema35 = schema33.externalDocs(externalDocumentation34);
        java.lang.Boolean boolean36 = schema35.getUniqueItems();
        io.swagger.oas.models.media.Schema schema38 = schema35.maxProperties((java.lang.Integer) 0);
        schema35.setMaxProperties((java.lang.Integer) 1);
        java.lang.Integer int41 = schema35.getMaxLength();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(bigDecimal21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNull(int41);
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.util.List<java.lang.String> strList1 = strComparableSchema0.getRequired();
        io.swagger.oas.models.media.Schema schema3 = strComparableSchema0.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema4 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str5 = strComparableSchema4.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema6 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema6.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema9 = strComparableSchema4.not((io.swagger.oas.models.media.Schema) strComparableSchema6);
        strComparableSchema4.setDescription("hi!");
        strComparableSchema4.addExtension("", (java.lang.Object) 0.0f);
        java.math.BigDecimal bigDecimal15 = strComparableSchema4.getMultipleOf();
        java.lang.String str16 = strComparableSchema4.get$ref();
        java.lang.String[] strArray21 = new java.lang.String[] { ",", "*/*", "hi!", "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        strComparableSchema4.setRequired((java.util.List<java.lang.String>) strList22);
        java.lang.Integer int25 = strComparableSchema4.getMaxLength();
        strComparableSchema4.setTitle("*/*");
        io.swagger.oas.models.media.Schema schema28 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema4);
        java.util.Map<java.lang.String, io.swagger.oas.models.media.Schema> strMap29 = schema28.getProperties();
        io.swagger.oas.models.media.Schema schema31 = schema28.addRequiredItem("class Schema {\n    title: null\n    multipleOf: null\n    maximum: null\n    exclusiveMaximum: null\n    minimum: null\n    exclusiveMinimum: null\n    maxLength: null\n    minLength: null\n    pattern: null\n    maxItems: null\n    minItems: null\n    uniqueItems: null\n    maxProperties: null\n    minProperties: null\n    required: null\n    type: null\n    not: null\n    properties: null\n    additionalProperties: null\n    description: null\n    format: null\n    $ref: null\n    nullable: null\n    readOnly: null\n    writeOnly: null\n    example: null\n    externalDocs: null\n    deprecated: null\n    xml: null\n}");
        java.lang.Boolean boolean32 = schema31.getWriteOnly();
        schema31.setUniqueItems((java.lang.Boolean) false);
        java.lang.String str35 = schema31.getDescription();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(bigDecimal15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(strMap29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema0 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableSchema0.get$ref();
        io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>> strComparableSchema2 = new io.swagger.oas.models.media.Schema<java.lang.Comparable<java.lang.String>>();
        strComparableSchema2.setWriteOnly((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema5 = strComparableSchema0.not((io.swagger.oas.models.media.Schema) strComparableSchema2);
        strComparableSchema0.setDescription("hi!");
        io.swagger.oas.models.media.Schema schema9 = strComparableSchema0.exclusiveMinimum((java.lang.Boolean) false);
        io.swagger.oas.models.media.Schema schema11 = strComparableSchema0.minProperties((java.lang.Integer) 100);
        io.swagger.oas.models.media.Schema schema13 = schema11.deprecated((java.lang.Boolean) true);
        schema13.setMaxLength((java.lang.Integer) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        io.swagger.oas.annotations.servers.Server[] serverArray0 = new io.swagger.oas.annotations.servers.Server[] {};
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional1 = io.swagger.jaxrs2.OperationParser.getServers(serverArray0);
        java.util.Optional<io.swagger.oas.annotations.servers.Server[]> serverArrayOptional2 = java.util.Optional.ofNullable(serverArray0);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional3 = io.swagger.jaxrs2.OperationParser.getServers(serverArray0);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional4 = io.swagger.jaxrs2.OperationParser.getServers(serverArray0);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional5 = io.swagger.jaxrs2.OperationParser.getServers(serverArray0);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional6 = io.swagger.jaxrs2.OperationParser.getServers(serverArray0);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional7 = io.swagger.jaxrs2.OperationParser.getServers(serverArray0);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional8 = io.swagger.jaxrs2.OperationParser.getServers(serverArray0);
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional9 = io.swagger.jaxrs2.OperationParser.getServers(serverArray0);
        io.swagger.oas.annotations.servers.Server[] serverArray10 = new io.swagger.oas.annotations.servers.Server[] {};
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional11 = io.swagger.jaxrs2.OperationParser.getServers(serverArray10);
        boolean boolean12 = serverListOptional11.isPresent();
        java.util.List<io.swagger.oas.models.servers.Server> serverList13 = null;
        java.util.List<io.swagger.oas.models.servers.Server> serverList14 = serverListOptional11.orElse(serverList13);
        io.swagger.oas.annotations.servers.Server[] serverArray15 = new io.swagger.oas.annotations.servers.Server[] {};
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional16 = io.swagger.jaxrs2.OperationParser.getServers(serverArray15);
        java.lang.String str17 = serverListOptional16.toString();
        io.swagger.oas.annotations.servers.Server[] serverArray18 = new io.swagger.oas.annotations.servers.Server[] {};
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional19 = io.swagger.jaxrs2.OperationParser.getServers(serverArray18);
        boolean boolean20 = serverListOptional19.isPresent();
        java.util.List<io.swagger.oas.models.servers.Server> serverList21 = null;
        java.util.List<io.swagger.oas.models.servers.Server> serverList22 = serverListOptional19.orElse(serverList21);
        io.swagger.oas.models.servers.Server[] serverArray23 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList24 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList24, serverArray23);
        java.util.List<io.swagger.oas.models.servers.Server> serverList26 = serverListOptional19.orElse((java.util.List<io.swagger.oas.models.servers.Server>) serverList24);
        java.util.List<io.swagger.oas.models.servers.Server> serverList27 = serverListOptional16.orElse((java.util.List<io.swagger.oas.models.servers.Server>) serverList24);
        io.swagger.oas.annotations.servers.Server[] serverArray28 = new io.swagger.oas.annotations.servers.Server[] {};
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional29 = io.swagger.jaxrs2.OperationParser.getServers(serverArray28);
        java.lang.String str30 = serverListOptional29.toString();
        io.swagger.oas.annotations.servers.Server[] serverArray31 = new io.swagger.oas.annotations.servers.Server[] {};
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional32 = io.swagger.jaxrs2.OperationParser.getServers(serverArray31);
        boolean boolean33 = serverListOptional32.isPresent();
        java.util.List<io.swagger.oas.models.servers.Server> serverList34 = null;
        java.util.List<io.swagger.oas.models.servers.Server> serverList35 = serverListOptional32.orElse(serverList34);
        io.swagger.oas.models.servers.Server[] serverArray36 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList37 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList37, serverArray36);
        java.util.List<io.swagger.oas.models.servers.Server> serverList39 = serverListOptional32.orElse((java.util.List<io.swagger.oas.models.servers.Server>) serverList37);
        java.util.List<io.swagger.oas.models.servers.Server> serverList40 = serverListOptional29.orElse((java.util.List<io.swagger.oas.models.servers.Server>) serverList37);
        java.util.List<io.swagger.oas.models.servers.Server> serverList41 = serverListOptional16.orElse((java.util.List<io.swagger.oas.models.servers.Server>) serverList37);
        java.util.List<io.swagger.oas.models.servers.Server> serverList42 = serverListOptional11.orElse((java.util.List<io.swagger.oas.models.servers.Server>) serverList37);
        boolean boolean43 = serverListOptional11.isPresent();
        io.swagger.oas.annotations.servers.Server[] serverArray44 = new io.swagger.oas.annotations.servers.Server[] {};
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional45 = io.swagger.jaxrs2.OperationParser.getServers(serverArray44);
        java.lang.String str46 = serverListOptional45.toString();
        io.swagger.oas.annotations.servers.Server[] serverArray47 = new io.swagger.oas.annotations.servers.Server[] {};
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional48 = io.swagger.jaxrs2.OperationParser.getServers(serverArray47);
        boolean boolean49 = serverListOptional48.isPresent();
        java.util.List<io.swagger.oas.models.servers.Server> serverList50 = null;
        java.util.List<io.swagger.oas.models.servers.Server> serverList51 = serverListOptional48.orElse(serverList50);
        io.swagger.oas.models.servers.Server[] serverArray52 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList53 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList53, serverArray52);
        java.util.List<io.swagger.oas.models.servers.Server> serverList55 = serverListOptional48.orElse((java.util.List<io.swagger.oas.models.servers.Server>) serverList53);
        java.util.List<io.swagger.oas.models.servers.Server> serverList56 = serverListOptional45.orElse((java.util.List<io.swagger.oas.models.servers.Server>) serverList53);
        io.swagger.oas.annotations.servers.Server[] serverArray57 = new io.swagger.oas.annotations.servers.Server[] {};
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional58 = io.swagger.jaxrs2.OperationParser.getServers(serverArray57);
        java.lang.String str59 = serverListOptional58.toString();
        io.swagger.oas.annotations.servers.Server[] serverArray60 = new io.swagger.oas.annotations.servers.Server[] {};
        java.util.Optional<java.util.List<io.swagger.oas.models.servers.Server>> serverListOptional61 = io.swagger.jaxrs2.OperationParser.getServers(serverArray60);
        boolean boolean62 = serverListOptional61.isPresent();
        java.util.List<io.swagger.oas.models.servers.Server> serverList63 = null;
        java.util.List<io.swagger.oas.models.servers.Server> serverList64 = serverListOptional61.orElse(serverList63);
        io.swagger.oas.models.servers.Server[] serverArray65 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList66 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList66, serverArray65);
        java.util.List<io.swagger.oas.models.servers.Server> serverList68 = serverListOptional61.orElse((java.util.List<io.swagger.oas.models.servers.Server>) serverList66);
        java.util.List<io.swagger.oas.models.servers.Server> serverList69 = serverListOptional58.orElse((java.util.List<io.swagger.oas.models.servers.Server>) serverList66);
        java.util.List<io.swagger.oas.models.servers.Server> serverList70 = serverListOptional45.orElse((java.util.List<io.swagger.oas.models.servers.Server>) serverList66);
        java.util.List<io.swagger.oas.models.servers.Server> serverList71 = serverListOptional11.orElse(serverList70);
        java.util.List<io.swagger.oas.models.servers.Server> serverList72 = serverListOptional9.orElse(serverList70);
        java.lang.String str73 = serverListOptional9.toString();
        org.junit.Assert.assertNotNull(serverArray0);
        org.junit.Assert.assertNotNull(serverListOptional1);
        org.junit.Assert.assertNotNull(serverArrayOptional2);
        org.junit.Assert.assertNotNull(serverListOptional3);
        org.junit.Assert.assertNotNull(serverListOptional4);
        org.junit.Assert.assertNotNull(serverListOptional5);
        org.junit.Assert.assertNotNull(serverListOptional6);
        org.junit.Assert.assertNotNull(serverListOptional7);
        org.junit.Assert.assertNotNull(serverListOptional8);
        org.junit.Assert.assertNotNull(serverListOptional9);
        org.junit.Assert.assertNotNull(serverArray10);
        org.junit.Assert.assertNotNull(serverListOptional11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(serverList14);
        org.junit.Assert.assertNotNull(serverArray15);
        org.junit.Assert.assertNotNull(serverListOptional16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Optional.empty" + "'", str17, "Optional.empty");
        org.junit.Assert.assertNotNull(serverArray18);
        org.junit.Assert.assertNotNull(serverListOptional19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(serverList22);
        org.junit.Assert.assertNotNull(serverArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(serverList26);
        org.junit.Assert.assertNotNull(serverList27);
        org.junit.Assert.assertNotNull(serverArray28);
        org.junit.Assert.assertNotNull(serverListOptional29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Optional.empty" + "'", str30, "Optional.empty");
        org.junit.Assert.assertNotNull(serverArray31);
        org.junit.Assert.assertNotNull(serverListOptional32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(serverList35);
        org.junit.Assert.assertNotNull(serverArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(serverList39);
        org.junit.Assert.assertNotNull(serverList40);
        org.junit.Assert.assertNotNull(serverList41);
        org.junit.Assert.assertNotNull(serverList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(serverArray44);
        org.junit.Assert.assertNotNull(serverListOptional45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Optional.empty" + "'", str46, "Optional.empty");
        org.junit.Assert.assertNotNull(serverArray47);
        org.junit.Assert.assertNotNull(serverListOptional48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(serverList51);
        org.junit.Assert.assertNotNull(serverArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(serverList55);
        org.junit.Assert.assertNotNull(serverList56);
        org.junit.Assert.assertNotNull(serverArray57);
        org.junit.Assert.assertNotNull(serverListOptional58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Optional.empty" + "'", str59, "Optional.empty");
        org.junit.Assert.assertNotNull(serverArray60);
        org.junit.Assert.assertNotNull(serverListOptional61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(serverList64);
        org.junit.Assert.assertNotNull(serverArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(serverList68);
        org.junit.Assert.assertNotNull(serverList69);
        org.junit.Assert.assertNotNull(serverList70);
        org.junit.Assert.assertNotNull(serverList71);
        org.junit.Assert.assertNotNull(serverList72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Optional.empty" + "'", str73, "Optional.empty");
    }
}

