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
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        java.lang.String str2 = restS3Service1.getDevPayUserToken();
        int int3 = restS3Service1.getInternalErrorRetryMax();
        // The following exception was thrown during execution in test generation
        try {
            restS3Service1.deleteBucketPolicy("/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid uri 'https://s3.amazonaws.com:443//home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">?<input type=\"hidden\" name=\"key\" value=\"hi!\">?<input name=\"file\" type=\"file\">?<br>?<input type=\"submit\" value=\"Upload to Amazon S3\">?</form>/?policy': escaped absolute path not valid");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = java.io.File.createTempFile("[\"content-length-range\", 58, 1]/null", "http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to create temporary file, /tmp/null5525286205646398502http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}", credentialsProvider2);
        // The following exception was thrown during execution in test generation
        try {
            restS3Service3.setBucketPolicy("[\"content-length-range\", 58, 1]", "<form action=\"https://{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"x-amz-\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid uri 'https://s3.amazonaws.com:443/[\"content-length-range\", 58, 1]/?policy': escaped absolute path not valid");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager3 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager3);
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager5 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager5);
        java.lang.String str7 = restS3Service1.getRestMetadataPrefix();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        org.codehaus.jackson.JsonFactory jsonFactory9 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider10 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider11 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig12 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig13 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory9, serializerProvider10, deserializerProvider11, serializationConfig12, deserializationConfig13);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher15 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig8, objectMapper14);
        java.text.DateFormat dateFormat16 = null;
        objectMapper14.setDateFormat(dateFormat16);
        org.codehaus.jackson.map.ObjectMapper.DefaultTyping defaultTyping18 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = objectMapper14.enableDefaultTyping(defaultTyping18);
        org.codehaus.jackson.JsonFactory jsonFactory20 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper22 = objectMapper21.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper23 = objectMapper21.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider24 = objectMapper21.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider25 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper26 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory20, serializerProvider24, deserializerProvider25);
        org.codehaus.jackson.map.SerializerFactory serializerFactory27 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper28 = objectMapper26.setSerializerFactory(serializerFactory27);
        org.codehaus.jackson.PrettyPrinter prettyPrinter29 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter30 = objectMapper28.prettyPrintingWriter(prettyPrinter29);
        org.codehaus.jackson.map.introspect.VisibilityChecker<?> wildcardVisibilityChecker31 = objectMapper28.getVisibilityChecker();
        org.codehaus.jackson.map.SerializerProvider serializerProvider32 = objectMapper28.getSerializerProvider();
        java.text.DateFormat dateFormat33 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter34 = objectMapper28.writer(dateFormat33);
        org.codehaus.jackson.map.ObjectMapper objectMapper35 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.AnnotationIntrospector annotationIntrospector36 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper37 = objectMapper35.setAnnotationIntrospector(annotationIntrospector36);
        java.lang.Object obj38 = null;
        byte[] byteArray39 = objectMapper37.writeValueAsBytes(obj38);
        org.codehaus.jackson.JsonNode jsonNode40 = objectMapper28.readTree(byteArray39);
        org.codehaus.jackson.type.TypeReference typeReference41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.String> strList42 = objectMapper14.readValue(byteArray39, typeReference41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "x-amz-meta-" + "'", str7, "x-amz-meta-");
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(serializerProvider24);
        org.junit.Assert.assertNotNull(objectMapper28);
        org.junit.Assert.assertNotNull(objectWriter30);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker31);
        org.junit.Assert.assertNotNull(serializerProvider32);
        org.junit.Assert.assertNotNull(objectWriter34);
        org.junit.Assert.assertNotNull(objectMapper37);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[110, 117, 108, 108]");
        org.junit.Assert.assertNotNull(jsonNode40);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper1 = objectMapper0.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = objectMapper0.disableDefaultTyping();
        java.lang.Object obj3 = null;
        java.lang.String str4 = objectMapper0.writeValueAsString(obj3);
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider5 = objectMapper0.getDeserializerProvider();
        org.codehaus.jackson.JsonFactory jsonFactory6 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = objectMapper7.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = objectMapper7.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider10 = objectMapper7.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider11 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory6, serializerProvider10, deserializerProvider11);
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = objectMapper0.setSerializerProvider(serializerProvider10);
        org.codehaus.jackson.FormatSchema formatSchema14 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter15 = objectMapper0.schemaBasedWriter(formatSchema14);
        org.codehaus.jackson.map.introspect.VisibilityChecker<?> wildcardVisibilityChecker16 = objectMapper0.getVisibilityChecker();
        org.codehaus.jackson.map.InjectableValues injectableValues17 = null;
        org.codehaus.jackson.map.ObjectReader objectReader18 = objectMapper0.reader(injectableValues17);
        org.junit.Assert.assertNotNull(objectMapper1);
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(deserializerProvider5);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(serializerProvider10);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker16);
        org.junit.Assert.assertNotNull(objectReader18);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.io.File file1 = new java.io.File("hi!");
        java.io.File file3 = new java.io.File(file1, "");
        java.lang.String str4 = file3.getName();
        java.net.URL uRL5 = file3.toURL();
        boolean boolean6 = file3.mkdir();
        long long7 = file3.getUsableSpace();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "hi!");
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(uRL5);
// flaky:         org.junit.Assert.assertEquals(uRL5.toString(), "file:/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 80259506176L + "'", long7 == 80259506176L);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.io.File file1 = new java.io.File("hi!");
        boolean boolean2 = file1.canRead();
        boolean boolean3 = file1.mkdirs();
        java.net.URI uRI4 = file1.toURI();
        java.io.File file5 = new java.io.File(uRI4);
        java.io.File file6 = new java.io.File(uRI4);
        java.io.File file8 = new java.io.File(file6, "http://s3.amazonaws.com.s3.amazonaws.com/?torrent");
        java.io.File file9 = file8.getParentFile();
        boolean boolean10 = file8.canWrite();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRI4);
// flaky:         org.junit.Assert.assertEquals(file5.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4");
// flaky:         org.junit.Assert.assertEquals(file5.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!");
// flaky:         org.junit.Assert.assertEquals(file6.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!");
// flaky:         org.junit.Assert.assertEquals(file8.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!/http:/s3.amazonaws.com.s3.amazonaws.com");
// flaky:         org.junit.Assert.assertEquals(file8.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!/http:/s3.amazonaws.com.s3.amazonaws.com/?torrent");
        org.junit.Assert.assertNotNull(file9);
// flaky:         org.junit.Assert.assertEquals(file9.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!/http:");
// flaky:         org.junit.Assert.assertEquals(file9.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!/http:/s3.amazonaws.com.s3.amazonaws.com");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3);
        org.jets3t.service.security.ProviderCredentials providerCredentials5 = restS3Service4.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager6 = null;
        restS3Service4.setHttpConnectionManager(httpConnectionManager6);
        org.jets3t.service.Jets3tProperties jets3tProperties8 = restS3Service4.getJetS3tProperties();
        org.apache.commons.httpclient.HostConfiguration hostConfiguration9 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "", credentialsProvider2, jets3tProperties8, hostConfiguration9);
        boolean boolean11 = restS3Service10.isAuthenticatedConnection();
        java.lang.String str12 = restS3Service10.getDevPayUserToken();
        org.jets3t.service.acl.AccessControlList accessControlList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.S3Bucket s3Bucket16 = restS3Service10.createBucket("http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent", "null", accessControlList15);
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: The requested action cannot be performed with a non-authenticated service: createBucket");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials5);
        org.junit.Assert.assertNotNull(jets3tProperties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.PrettyPrinter prettyPrinter1 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter2 = objectMapper0.prettyPrintingWriter(prettyPrinter1);
        org.codehaus.jackson.FormatSchema formatSchema3 = null;
        org.codehaus.jackson.map.ObjectReader objectReader4 = objectMapper0.schemaBasedReader(formatSchema3);
        org.codehaus.jackson.JsonFactory jsonFactory5 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = objectMapper6.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = objectMapper6.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider9 = objectMapper6.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider10 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory5, serializerProvider9, deserializerProvider10);
        org.codehaus.jackson.map.AnnotationIntrospector annotationIntrospector12 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = objectMapper11.setAnnotationIntrospector(annotationIntrospector12);
        org.codehaus.jackson.FormatSchema formatSchema14 = null;
        org.codehaus.jackson.map.ObjectReader objectReader15 = objectMapper11.schemaBasedReader(formatSchema14);
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory16 = objectMapper11.getNodeFactory();
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = objectMapper0.setNodeFactory(jsonNodeFactory16);
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = objectMapper19.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = objectMapper19.disableDefaultTyping();
        java.io.File file23 = new java.io.File("hi!");
        java.io.File file25 = new java.io.File(file23, "");
        java.lang.Class<?> wildcardClass26 = file23.getClass();
        org.codehaus.jackson.type.JavaType javaType27 = objectMapper21.constructType((java.lang.reflect.Type) wildcardClass26);
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.node.ContainerNode containerNode28 = objectMapper0.readValue("{\"{\"\": \"\"}\": \"{\"\": \"\"}\"}", javaType27);
            org.junit.Assert.fail("Expected exception of type org.codehaus.jackson.JsonParseException; message: Unexpected character ('\"' (code 34)): was expecting a colon to separate field name and value? at [Source: java.io.StringReader@6627234f; line: 1, column: 6]");
        } catch (org.codehaus.jackson.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(objectReader4);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(serializerProvider9);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectReader15);
        org.junit.Assert.assertNotNull(jsonNodeFactory16);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNull("file23.getParent() == null", file23.getParent());
        org.junit.Assert.assertEquals(file23.toString(), "hi!");
        org.junit.Assert.assertNull("file25.getParent() == null", file25.getParent());
        org.junit.Assert.assertEquals(file25.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(javaType27);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider5 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider8 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials9 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials9);
        org.jets3t.service.security.ProviderCredentials providerCredentials11 = restS3Service10.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager12 = null;
        restS3Service10.setHttpConnectionManager(httpConnectionManager12);
        org.jets3t.service.Jets3tProperties jets3tProperties14 = restS3Service10.getJetS3tProperties();
        org.apache.commons.httpclient.HostConfiguration hostConfiguration15 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials6, "", credentialsProvider8, jets3tProperties14, hostConfiguration15);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3, "http://s3.amazonaws.com//hi%21?torrent", credentialsProvider5, jets3tProperties14);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>", credentialsProvider2, jets3tProperties14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = restS3Service18.getBucketLocation("/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: S3 Error Message.");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials11);
        org.junit.Assert.assertNotNull(jets3tProperties14);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "{\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}", credentialsProvider2);
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.S3Bucket s3Bucket5 = restS3Service3.getBucket("{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: The requested action cannot be performed with a non-authenticated service: Get Bucket");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.common.base.Joiner joiner1 = com.google.common.base.Joiner.on(' ');
        com.google.common.base.Joiner.MapJoiner mapJoiner3 = joiner1.withKeyValueSeparator("[\"starts-with\", \"$[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}\", \"[\"content-length-range\", 58, 1]\"]\", \"\"]");
        com.google.common.base.Joiner joiner4 = joiner1.skipNulls();
        org.junit.Assert.assertNotNull(joiner1);
        org.junit.Assert.assertNotNull(mapJoiner3);
        org.junit.Assert.assertNotNull(joiner4);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager3 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager3);
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager5 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager5);
        java.lang.String str7 = restS3Service1.getRestMetadataPrefix();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        org.codehaus.jackson.JsonFactory jsonFactory9 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider10 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider11 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig12 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig13 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory9, serializerProvider10, deserializerProvider11, serializationConfig12, deserializationConfig13);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher15 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig8, objectMapper14);
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager16 = restS3Service1.getHttpConnectionManager();
        java.lang.String str17 = restS3Service1.getRestMetadataPrefix();
        org.jets3t.service.model.StorageObject storageObject19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.StorageObject storageObject20 = restS3Service1.putObject("http://s3.amazonaws.com/%5B%22starts-with%22%2C%20%22%24%5B%22starts-with%22%2C%20%22%24%2Fhome%2FCIN%2Flmps2%2Fsemantic-conflict-study%2FSMAT%2Foutput-test-dest%2Fdruid%2F05168808c278c080c59c19e858d9471b316cd1f5%2Frandoop-modified_4%2Fhi%21%22%2C%20%22%22%5D%22%2C%20%22%22%5D/http%3A//s3.amazonaws.com/http%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent/hi%2521%3Ftorrent?torrent", storageObject19);
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.ServiceException; message: The action Create Object in bucket http://s3.amazonaws.com/%5B%22starts-with%22%2C%20%22%24%5B%22starts-with%22%2C%20%22%24%2Fhome%2FCIN%2Flmps2%2Fsemantic-conflict-study%2FSMAT%2Foutput-test-dest%2Fdruid%2F05168808c278c080c59c19e858d9471b316cd1f5%2Frandoop-modified_4%2Fhi%21%22%2C%20%22%22%5D%22%2C%20%22%22%5D/http%3A//s3.amazonaws.com/http%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent/hi%2521%3Ftorrent?torrent cannot be performed with an invalid object: null");
        } catch (org.jets3t.service.ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "x-amz-meta-" + "'", str7, "x-amz-meta-");
        org.junit.Assert.assertNull(httpConnectionManager16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "x-amz-meta-" + "'", str17, "x-amz-meta-");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.codehaus.jackson.JsonFactory jsonFactory0 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper1 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = objectMapper1.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = objectMapper1.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider4 = objectMapper1.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider5 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory0, serializerProvider4, deserializerProvider5);
        org.codehaus.jackson.map.SerializerFactory serializerFactory7 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = objectMapper6.setSerializerFactory(serializerFactory7);
        org.codehaus.jackson.PrettyPrinter prettyPrinter9 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter10 = objectMapper8.prettyPrintingWriter(prettyPrinter9);
        org.codehaus.jackson.map.introspect.VisibilityChecker<?> wildcardVisibilityChecker11 = objectMapper8.getVisibilityChecker();
        org.codehaus.jackson.map.SerializerProvider serializerProvider12 = objectMapper8.getSerializerProvider();
        java.text.DateFormat dateFormat13 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter14 = objectMapper8.writer(dateFormat13);
        org.codehaus.jackson.map.SerializerProvider serializerProvider15 = objectMapper8.getSerializerProvider();
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(serializerProvider4);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertNotNull(objectWriter14);
        org.junit.Assert.assertNotNull(serializerProvider15);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider5 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials6);
        org.jets3t.service.security.ProviderCredentials providerCredentials8 = restS3Service7.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager9 = null;
        restS3Service7.setHttpConnectionManager(httpConnectionManager9);
        org.jets3t.service.Jets3tProperties jets3tProperties11 = restS3Service7.getJetS3tProperties();
        org.apache.commons.httpclient.HostConfiguration hostConfiguration12 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3, "", credentialsProvider5, jets3tProperties11, hostConfiguration12);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}", credentialsProvider2, jets3tProperties11);
        org.jets3t.service.model.S3Bucket s3Bucket16 = null;
        java.util.Calendar calendar18 = null;
        java.util.Calendar calendar19 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent", "[\"content-length-range\", 10, 47]", "[\"content-length-range\", 10, 47]", "[\"content-length-range\", 1, 0]" };
        java.lang.String str27 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("{\"\": \"s3.amazonaws.com\"}", strArray26);
        java.lang.String str28 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("[\"content-length-range\", 97, 100]", strArray26);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}", "[\"starts-with\", \"$/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\", \"\"]", "http://s3.amazonaws.com.s3.amazonaws.com/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent" };
        java.lang.String str35 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality(":", strArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.S3Object s3Object38 = restS3Service14.getVersionedObject("{\"x-amz-meta-\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}", s3Bucket16, "http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent", calendar18, calendar19, strArray26, strArray34, (java.lang.Long) 129486479360L, (java.lang.Long) 80259563520L);
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: The action Get Versioned Object cannot be performed with an invalid bucket: null");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials8);
        org.junit.Assert.assertNotNull(jets3tProperties11);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{\"{\"\": \"s3.amazonaws.com\"}\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}" + "'", str27, "{\"{\"\": \"s3.amazonaws.com\"}\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{\"[\"content-length-range\", 97, 100]\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}" + "'", str28, "{\"[\"content-length-range\", 97, 100]\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{\":\": \",{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"},[\"starts-with\", \"$/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\", \"\"],http://s3.amazonaws.com.s3.amazonaws.com/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent\"}" + "'", str35, "{\":\": \",{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"},[\"starts-with\", \"$/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\", \"\"],http://s3.amazonaws.com.s3.amazonaws.com/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent\"}");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        java.lang.String str2 = restS3Service1.getDevPayUserToken();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials4 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials4);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.JsonFactory jsonFactory7 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider11 = objectMapper8.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider12 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory7, serializerProvider11, deserializerProvider12);
        org.codehaus.jackson.map.SerializerFactory serializerFactory14 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = objectMapper13.setSerializerFactory(serializerFactory14);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher16 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service5, s3SegmentPusherConfig6, objectMapper13);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher17 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig3, objectMapper13);
        int int18 = restS3Service1.getInternalErrorRetryMax();
        java.lang.String str21 = restS3Service1.createTorrentUrl("http://s3.amazonaws.com//?torrent", "{\"{\"\": \"s3.amazonaws.com\"}\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}");
        // The following exception was thrown during execution in test generation
        try {
            restS3Service1.suspendBucketVersioningWithMFA("[\"[\"content-length-range\", 10, 47]\", \"${\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}\", \"[\"starts-with\", \"$[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}\", \"[\"content-length-range\", 58, 1]\"]\", \"\"]\"]", "[\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-\", \"$<form action=\"https://http://s3.amazonaws.com//hi%21?torrent.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"[\"content-length-range\", 58, 1]\"]", "");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: Failed to PUT request containing an XML document");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializerProvider11);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/%7B%22%7B%22%22%3A%20%22s3.amazonaws.com%22%7D%22%3A%20%22http%3A//s3.amazonaws.com/%257B%2522http%253A%252F%252Fs3.amazonaws.com%252Fhttp%25253A%25252F%25252Fs3.amazonaws.com%25252F%25252F%25253Ftorrent%252Fhi%252521%253Ftorrent%2522%253A%2520%2522x-amz-meta-%2522%257D/%253Cform%2520action%253D%2522https%253A//.s3.amazonaws.com/%2522%2520method%253D%2522post%2522%2520enctype%253D%2522multipart/form-data%2522%253E%250A%253Cinput%2520type%253D%2522hidden%2522%2520name%253D%2522key%2522%2520value%253D%2522hi%2521%2522%253E%250A%253Cinput%2520name%253D%2522file%2522%2520type%253D%2522file%2522%253E%250A%253Cbr%253E%250A%253Cinput%2520type%253D%2522submit%2522%2520value%253D%2522Upload%2520to%2520Amazon%2520S3%2522%253E%250A%253C/form%253E%3Ftorrent%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%201%2C%200%5D%22%7D?torrent" + "'", str21, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/%7B%22%7B%22%22%3A%20%22s3.amazonaws.com%22%7D%22%3A%20%22http%3A//s3.amazonaws.com/%257B%2522http%253A%252F%252Fs3.amazonaws.com%252Fhttp%25253A%25252F%25252Fs3.amazonaws.com%25252F%25252F%25253Ftorrent%252Fhi%252521%253Ftorrent%2522%253A%2520%2522x-amz-meta-%2522%257D/%253Cform%2520action%253D%2522https%253A//.s3.amazonaws.com/%2522%2520method%253D%2522post%2522%2520enctype%253D%2522multipart/form-data%2522%253E%250A%253Cinput%2520type%253D%2522hidden%2522%2520name%253D%2522key%2522%2520value%253D%2522hi%2521%2522%253E%250A%253Cinput%2520name%253D%2522file%2522%2520type%253D%2522file%2522%253E%250A%253Cbr%253E%250A%253Cinput%2520type%253D%2522submit%2522%2520value%253D%2522Upload%2520to%2520Amazon%2520S3%2522%253E%250A%253C/form%253E%3Ftorrent%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%201%2C%200%5D%22%7D?torrent");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.io.File file1 = new java.io.File("hi!");
        boolean boolean2 = file1.canRead();
        boolean boolean3 = file1.mkdirs();
        java.net.URI uRI4 = file1.toURI();
        java.io.File file5 = new java.io.File(uRI4);
        java.io.File file6 = new java.io.File(uRI4);
        java.io.File file7 = new java.io.File(uRI4);
        java.io.File file8 = new java.io.File(uRI4);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRI4);
// flaky:         org.junit.Assert.assertEquals(file5.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4");
// flaky:         org.junit.Assert.assertEquals(file5.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!");
// flaky:         org.junit.Assert.assertEquals(file6.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!");
// flaky:         org.junit.Assert.assertEquals(file7.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4");
// flaky:         org.junit.Assert.assertEquals(file7.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!");
// flaky:         org.junit.Assert.assertEquals(file8.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4");
// flaky:         org.junit.Assert.assertEquals(file8.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        boolean boolean4 = restS3Service1.isBucketAccessible("");
        java.lang.String str5 = restS3Service1.getRestMetadataPrefix();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.JsonFactory jsonFactory7 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider8 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider9 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig10 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig11 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory7, serializerProvider8, deserializerProvider9, serializationConfig10, deserializationConfig11);
        org.codehaus.jackson.map.ObjectWriter objectWriter13 = objectMapper12.defaultPrettyPrintingWriter();
        org.codehaus.jackson.map.ser.FilterProvider filterProvider14 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter15 = objectMapper12.writer(filterProvider14);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher16 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig6, objectMapper12);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = objectMapper18.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = objectMapper18.disableDefaultTyping();
        java.lang.Object obj21 = null;
        java.lang.String str22 = objectMapper18.writeValueAsString(obj21);
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider23 = objectMapper18.getDeserializerProvider();
        org.codehaus.jackson.JsonFactory jsonFactory24 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper25 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper26 = objectMapper25.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper27 = objectMapper25.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider28 = objectMapper25.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider29 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper30 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory24, serializerProvider28, deserializerProvider29);
        org.codehaus.jackson.map.ObjectMapper objectMapper31 = objectMapper18.setSerializerProvider(serializerProvider28);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher32 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig17, objectMapper18);
        java.lang.String str33 = restS3Service1.getDevPayUserToken();
        java.util.Date date34 = restS3Service1.getCurrentTimeWithOffset();
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "x-amz-meta-" + "'", str5, "x-amz-meta-");
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertNotNull(deserializerProvider23);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(serializerProvider28);
        org.junit.Assert.assertNotNull(objectMapper31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Thu Nov 04 08:20:43 BRT 2021");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.common.base.Joiner joiner1 = com.google.common.base.Joiner.on("http://s3.amazonaws.com//hi%21?torrent");
        org.codehaus.jackson.JsonFactory jsonFactory2 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = objectMapper3.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = objectMapper3.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider6 = objectMapper3.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider7 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory2, serializerProvider6, deserializerProvider7);
        org.codehaus.jackson.map.jsontype.SubtypeResolver subtypeResolver9 = null;
        objectMapper8.setSubtypeResolver(subtypeResolver9);
        org.codehaus.jackson.JsonFactory jsonFactory11 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = objectMapper12.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = objectMapper12.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider15 = objectMapper12.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider16 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory11, serializerProvider15, deserializerProvider16);
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.node.ObjectNode objectNode19 = objectMapper18.createObjectNode();
        org.codehaus.jackson.FormatSchema formatSchema20 = null;
        org.codehaus.jackson.map.ObjectReader objectReader21 = objectMapper18.schemaBasedReader(formatSchema20);
        org.codehaus.jackson.map.ObjectMapper objectMapper22 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.node.ObjectNode objectNode23 = objectMapper22.createObjectNode();
        org.codehaus.jackson.FormatSchema formatSchema24 = null;
        org.codehaus.jackson.map.ObjectReader objectReader25 = objectMapper22.schemaBasedReader(formatSchema24);
        byte[] byteArray27 = objectMapper22.writeValueAsBytes((java.lang.Object) 10L);
        org.codehaus.jackson.JsonNode jsonNode28 = objectMapper18.valueToTree((java.lang.Object) 10L);
        org.codehaus.jackson.JsonParser jsonParser29 = objectMapper17.treeAsTokens(jsonNode28);
        org.codehaus.jackson.JsonNode jsonNode30 = objectMapper8.readTree(jsonParser29);
        java.lang.String str31 = joiner1.join((java.lang.Iterable<org.codehaus.jackson.JsonNode>) jsonNode30);
        org.junit.Assert.assertNotNull(joiner1);
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(serializerProvider6);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(serializerProvider15);
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertNotNull(objectReader21);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertNotNull(objectReader25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[49, 48]");
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        boolean boolean4 = restS3Service1.isBucketAccessible("");
        org.jets3t.service.security.ProviderCredentials providerCredentials5 = restS3Service1.getProviderCredentials();
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = restS3Service1.getProviderCredentials();
        java.lang.String str7 = restS3Service1.getDevPayUserToken();
        java.util.Calendar calendar10 = null;
        java.util.Calendar calendar11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.lang.String str15 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("", strArray14);
        java.lang.String str16 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]", strArray14);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.lang.String str20 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("", strArray19);
        java.lang.String str21 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]", strArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.S3Object s3Object24 = restS3Service1.getObject("http://s3.amazonaws.com//hi%21?torrent", "http://s3.amazonaws.com//hi%21?torrent", calendar10, calendar11, strArray14, strArray19, (java.lang.Long) 4096L, (java.lang.Long) 80259567616L);
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: S3 Error Message.");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(providerCredentials5);
        org.junit.Assert.assertNull(providerCredentials6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{\"\": \"\"}" + "'", str15, "{\"\": \"\"}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{\"[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]\": \"\"}" + "'", str16, "{\"[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]\": \"\"}");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"\": \"\"}" + "'", str20, "{\"\": \"\"}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{\"[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]\": \"\"}" + "'", str21, "{\"[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]\": \"\"}");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = restS3Service1.renameMetadataKeys(strMap2);
        java.lang.String str4 = restS3Service1.getRestMetadataPrefix();
        // The following exception was thrown during execution in test generation
        try {
            restS3Service1.deleteBucket("");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.ServiceException; message: S3 Error Message.");
        } catch (org.jets3t.service.ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-amz-meta-" + "'", str4, "x-amz-meta-");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.size(0L);
        org.joda.time.Interval interval3 = null;
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.interval(interval3);
        java.lang.String[] strArray8 = new java.lang.String[] { "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!", "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!", "http://s3.amazonaws.com//?torrent" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        com.metamx.druid.client.DataSegment.Builder builder11 = builder2.metrics((java.util.List<java.lang.String>) strList9);
        com.metamx.druid.client.DataSegment.Builder builder13 = builder11.size(0L);
        com.metamx.druid.client.DataSegment.Builder builder15 = builder13.dataSource("/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!/[\"starts-with\", \"$/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\", \"\"]");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.io.File file1 = new java.io.File("http://s3.amazonaws.com//hi%21?torrent");
        boolean boolean3 = file1.setLastModified((long) (short) 10);
        java.io.File file4 = file1.getAbsoluteFile();
        boolean boolean6 = file1.setLastModified((long) 'a');
        boolean boolean9 = file1.setExecutable(true, false);
        org.junit.Assert.assertEquals(file1.getParent(), "http:/s3.amazonaws.com");
        org.junit.Assert.assertEquals(file1.toString(), "http:/s3.amazonaws.com/hi%21?torrent");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(file4);
// flaky:         org.junit.Assert.assertEquals(file4.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/http:/s3.amazonaws.com");
// flaky:         org.junit.Assert.assertEquals(file4.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/http:/s3.amazonaws.com/hi%21?torrent");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.common.base.Joiner joiner0 = com.metamx.druid.loading.S3SegmentPusher.JOINER;
        com.google.common.base.Joiner.MapJoiner mapJoiner2 = null; // flaky: joiner0.withKeyValueSeparator("{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}");
        java.lang.StringBuilder stringBuilder3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str7 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("", strArray6);
        java.lang.String str8 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder9 = joiner0.appendTo(stringBuilder3, (java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(joiner0);
// flaky:         org.junit.Assert.assertNotNull(mapJoiner2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"\": \"\"}" + "'", str7, "{\"\": \"\"}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{\"[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]\": \"\"}" + "'", str8, "{\"[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]\": \"\"}");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "[\"content-length-range\", 100, 4]", credentialsProvider2);
        java.lang.String str4 = restS3Service3.getRestMetadataPrefix();
        boolean boolean5 = restS3Service3.isHttpsOnly();
        org.jets3t.service.model.MultipartUpload multipartUpload6 = null;
        org.jets3t.service.model.S3Object s3Object8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.MultipartPart multipartPart9 = restS3Service3.multipartUploadPart(multipartUpload6, (java.lang.Integer) 10, s3Object8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-amz-meta-" + "'", str4, "x-amz-meta-");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider5 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider8 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials9 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials9);
        org.jets3t.service.security.ProviderCredentials providerCredentials11 = restS3Service10.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager12 = null;
        restS3Service10.setHttpConnectionManager(httpConnectionManager12);
        org.jets3t.service.Jets3tProperties jets3tProperties14 = restS3Service10.getJetS3tProperties();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials6, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent", credentialsProvider8, jets3tProperties14);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration16 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3, "[\"starts-with\", \"$<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]", credentialsProvider5, jets3tProperties14, hostConfiguration16);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "{\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}", credentialsProvider2, jets3tProperties14);
        // The following exception was thrown during execution in test generation
        try {
            restS3Service18.suspendBucketVersioning("hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: Failed to PUT request containing an XML document");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials11);
        org.junit.Assert.assertNotNull(jets3tProperties14);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager3 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager3);
        java.lang.String str5 = restS3Service1.getEndpoint();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher8 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig6, objectMapper7);
        restS3Service1.setDevPayProductToken("http://s3.amazonaws.com.s3.amazonaws.com/?torrent");
        restS3Service1.setRequesterPaysEnabled(true);
        org.jets3t.service.security.ProviderCredentials providerCredentials15 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials16 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials16);
        org.jets3t.service.security.ProviderCredentials providerCredentials18 = restS3Service17.getProviderCredentials();
        boolean boolean20 = restS3Service17.isBucketAccessible("");
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig21 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper22 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper23 = objectMapper22.disableDefaultTyping();
        org.codehaus.jackson.PrettyPrinter prettyPrinter24 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter25 = objectMapper22.writer(prettyPrinter24);
        org.codehaus.jackson.map.ObjectMapper objectMapper26 = objectMapper22.enableDefaultTyping();
        org.codehaus.jackson.FormatSchema formatSchema27 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter28 = objectMapper26.schemaBasedWriter(formatSchema27);
        org.codehaus.jackson.map.PropertyNamingStrategy propertyNamingStrategy29 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper30 = objectMapper26.setPropertyNamingStrategy(propertyNamingStrategy29);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher31 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service17, s3SegmentPusherConfig21, objectMapper30);
        java.util.Date date32 = restS3Service17.getCurrentTimeWithOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = restS3Service1.createSignedHeadUrl("http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent", "{\"{\"[\"content-length-range\", -226, -226]\": \"{\"\": \"s3.amazonaws.com\"}/hi!\"}\": \"x-amz-meta-\"}", providerCredentials15, date32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "s3.amazonaws.com" + "'", str5, "s3.amazonaws.com");
        org.junit.Assert.assertNull(providerCredentials18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(objectWriter25);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(objectWriter28);
        org.junit.Assert.assertNotNull(objectMapper30);
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Thu Nov 04 08:20:45 BRT 2021");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        java.lang.String str3 = restS3Service1.getInvokingApplicationDescription();
        java.lang.String str6 = restS3Service1.createTorrentUrl("http://s3.amazonaws.com//?torrent", "hi!");
        org.jets3t.service.security.ProviderCredentials providerCredentials7 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = restS3Service8.renameMetadataKeys(strMap9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = restS3Service1.renameMetadataKeys(strMap10);
        boolean boolean12 = restS3Service1.isRequesterPaysEnabled();
        org.apache.commons.httpclient.HttpMethod httpMethod13 = null;
        restS3Service1.authorizeHttpRequest(httpMethod13);
        java.lang.String str17 = restS3Service1.createTorrentUrl("[\"starts-with\", \"$[\"starts-with\", \"$/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\", \"\"]\", \"\"]", "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent");
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.S3Bucket s3Bucket20 = restS3Service1.getOrCreateBucket("", "http://s3.amazonaws.com/%5B%22starts-with%22%2C%20%22%24%2Fhome%2FCIN%2Flmps2%2Fsemantic-conflict-study%2FSMAT%2Foutput-test-dest%2Fdruid%2F05168808c278c080c59c19e858d9471b316cd1f5%2Frandoop-modified_4%2Fhi%21%22%2C%20%22%22%5D/http%3A//s3.amazonaws.com/%257B%2522http%253A%252F%252Fs3.amazonaws.com%252Fhttp%25253A%25252F%25252Fs3.amazonaws.com%25252F%25252F%25253Ftorrent%252Fhi%252521%253Ftorrent%2522%253A%2520%2522x-amz-meta-%2522%257D/%253Cform%2520action%253D%2522https%253A//.s3.amazonaws.com/%2522%2520method%253D%2522post%2522%2520enctype%253D%2522multipart/form-data%2522%253E%250A%253Cinput%2520type%253D%2522hidden%2522%2520name%253D%2522key%2522%2520value%253D%2522hi%2521%2522%253E%250A%253Cinput%2520name%253D%2522file%2522%2520type%253D%2522file%2522%253E%250A%253Cbr%253E%250A%253Cinput%2520type%253D%2522submit%2522%2520value%253D%2522Upload%2520to%2520Amazon%2520S3%2522%253E%250A%253C/form%253E%3Ftorrent?torrent");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: The requested action cannot be performed with a non-authenticated service: Get or Create Bucket with location");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent" + "'", str6, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://s3.amazonaws.com/%5B%22starts-with%22%2C%20%22%24%5B%22starts-with%22%2C%20%22%24%2Fhome%2FCIN%2Flmps2%2Fsemantic-conflict-study%2FSMAT%2Foutput-test-dest%2Fdruid%2F05168808c278c080c59c19e858d9471b316cd1f5%2Frandoop-modified_4%2Fhi%21%22%2C%20%22%22%5D%22%2C%20%22%22%5D/http%3A//s3.amazonaws.com/http%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent/hi%2521%3Ftorrent?torrent" + "'", str17, "http://s3.amazonaws.com/%5B%22starts-with%22%2C%20%22%24%5B%22starts-with%22%2C%20%22%24%2Fhome%2FCIN%2Flmps2%2Fsemantic-conflict-study%2FSMAT%2Foutput-test-dest%2Fdruid%2F05168808c278c080c59c19e858d9471b316cd1f5%2Frandoop-modified_4%2Fhi%21%22%2C%20%22%22%5D%22%2C%20%22%22%5D/http%3A//s3.amazonaws.com/http%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent/hi%2521%3Ftorrent?torrent");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper1 = objectMapper0.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = objectMapper0.disableDefaultTyping();
        org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion inclusion3 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = objectMapper0.setSerializationInclusion(inclusion3);
        org.codehaus.jackson.PrettyPrinter prettyPrinter5 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter6 = objectMapper4.writer(prettyPrinter5);
        org.codehaus.jackson.map.ser.FilterProvider filterProvider7 = null;
        objectMapper4.setFilters(filterProvider7);
        org.codehaus.jackson.map.InjectableValues injectableValues9 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = objectMapper4.setInjectableValues(injectableValues9);
        org.junit.Assert.assertNotNull(objectMapper1);
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectWriter6);
        org.junit.Assert.assertNotNull(objectMapper10);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper1 = objectMapper0.disableDefaultTyping();
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory2 = objectMapper0.getNodeFactory();
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = objectMapper3.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = objectMapper5.disableDefaultTyping();
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory7 = objectMapper5.getNodeFactory();
        org.codehaus.jackson.map.ObjectReader objectReader8 = objectMapper3.reader(jsonNodeFactory7);
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = objectMapper9.disableDefaultTyping();
        org.codehaus.jackson.map.SerializationConfig.Feature[] featureArray12 = new org.codehaus.jackson.map.SerializationConfig.Feature[] {};
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = objectMapper9.enable(featureArray12);
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = objectMapper3.enable(featureArray12);
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = objectMapper0.enable(featureArray12);
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory16 = objectMapper0.getNodeFactory();
        java.io.Reader reader17 = null;
        org.codehaus.jackson.type.TypeReference typeReference18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = objectMapper0.readValue(reader17, typeReference18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper1);
        org.junit.Assert.assertNotNull(jsonNodeFactory2);
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(jsonNodeFactory7);
        org.junit.Assert.assertNotNull(objectReader8);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(featureArray12);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(jsonNodeFactory16);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.size(0L);
        org.joda.time.Interval interval3 = null;
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.interval(interval3);
        java.lang.String[] strArray8 = new java.lang.String[] { "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!", "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!", "http://s3.amazonaws.com//?torrent" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        com.metamx.druid.client.DataSegment.Builder builder11 = builder2.metrics((java.util.List<java.lang.String>) strList9);
        com.metamx.druid.client.DataSegment.Builder builder13 = builder11.size(0L);
        com.metamx.druid.client.DataSegment.Builder builder15 = builder13.size((long) 11);
        com.metamx.druid.client.DataSegment.Builder builder17 = builder15.version("{\"\": \"s3.amazonaws.com\"}/hi!");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper1 = objectMapper0.disableDefaultTyping();
        org.codehaus.jackson.PrettyPrinter prettyPrinter2 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter3 = objectMapper0.writer(prettyPrinter2);
        org.codehaus.jackson.map.SerializerProvider serializerProvider4 = objectMapper0.getSerializerProvider();
        org.codehaus.jackson.JsonParser.Feature feature5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = objectMapper0.isEnabled(feature5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper1);
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(serializerProvider4);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper1 = objectMapper0.disableDefaultTyping();
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory2 = objectMapper0.getNodeFactory();
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = objectMapper0.enableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = objectMapper3.enableDefaultTyping();
        org.codehaus.jackson.PrettyPrinter prettyPrinter5 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter6 = objectMapper4.writer(prettyPrinter5);
        java.lang.Class<?> wildcardClass7 = objectWriter6.getClass();
        com.metamx.emitter.EmittingLogger emittingLogger8 = new com.metamx.emitter.EmittingLogger((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertNotNull(objectMapper1);
        org.junit.Assert.assertNotNull(jsonNodeFactory2);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectWriter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "x-amz-meta-");
        long long3 = file2.getUsableSpace();
        java.io.File file4 = file2.getCanonicalFile();
        java.io.File file6 = new java.io.File(file4, "s3.amazonaws.com");
        java.io.File file8 = new java.io.File(file6, "[\"[\"content-length-range\", 10, 47]\", \"${\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}\", \"[\"starts-with\", \"$[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}\", \"[\"content-length-range\", 58, 1]\"]\", \"\"]\"]");
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "x-amz-meta-");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(file4);
// flaky:         org.junit.Assert.assertEquals(file4.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4");
// flaky:         org.junit.Assert.assertEquals(file4.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-");
// flaky:         org.junit.Assert.assertEquals(file6.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-/s3.amazonaws.com");
// flaky:         org.junit.Assert.assertEquals(file8.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-/s3.amazonaws.com/[\"[\"content-length-range\", 10, 47]\", \"${\"http:/s3.amazonaws.com/hi%21?torrent\": \"\"}\", \"[\"starts-with\", \"$[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent");
// flaky:         org.junit.Assert.assertEquals(file8.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-/s3.amazonaws.com/[\"[\"content-length-range\", 10, 47]\", \"${\"http:/s3.amazonaws.com/hi%21?torrent\": \"\"}\", \"[\"starts-with\", \"$[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}\", \"[\"content-length-range\", 58, 1]\"]\", \"\"]\"]");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "[\"[\"\", \"$http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\", \"null\"]\", \"$http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\", \"[\"content-length-range\", 100, 4]\"]", credentialsProvider2);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager3 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager3);
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager5 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager5);
        java.lang.String str7 = restS3Service1.getRestMetadataPrefix();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        org.codehaus.jackson.JsonFactory jsonFactory9 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider10 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider11 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig12 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig13 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory9, serializerProvider10, deserializerProvider11, serializationConfig12, deserializationConfig13);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher15 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig8, objectMapper14);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        org.codehaus.jackson.JsonFactory jsonFactory17 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider18 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider19 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory17, serializerProvider18, deserializerProvider19);
        org.codehaus.jackson.map.ObjectReader objectReader21 = objectMapper20.reader();
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher22 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig16, objectMapper20);
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "x-amz-meta-" + "'", str7, "x-amz-meta-");
        org.junit.Assert.assertNotNull(objectReader21);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        java.lang.String str3 = restS3Service1.getInvokingApplicationDescription();
        restS3Service1.setRequesterPaysEnabled(false);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.JsonFactory jsonFactory7 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider11 = objectMapper8.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider12 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory7, serializerProvider11, deserializerProvider12);
        org.codehaus.jackson.map.SerializerFactory serializerFactory14 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = objectMapper13.setSerializerFactory(serializerFactory14);
        org.codehaus.jackson.PrettyPrinter prettyPrinter16 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter17 = objectMapper15.prettyPrintingWriter(prettyPrinter16);
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = objectMapper18.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = objectMapper18.disableDefaultTyping();
        java.io.File file22 = new java.io.File("hi!");
        java.io.File file24 = new java.io.File(file22, "");
        java.lang.Class<?> wildcardClass25 = file22.getClass();
        org.codehaus.jackson.type.JavaType javaType26 = objectMapper20.constructType((java.lang.reflect.Type) wildcardClass25);
        boolean boolean27 = objectMapper15.canDeserialize(javaType26);
        org.codehaus.jackson.map.ser.FilterProvider filterProvider28 = null;
        objectMapper15.setFilters(filterProvider28);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher30 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig6, objectMapper15);
        org.jets3t.service.security.ProviderCredentials providerCredentials31 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service32 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials31);
        org.jets3t.service.security.ProviderCredentials providerCredentials33 = restS3Service32.getProviderCredentials();
        java.lang.String str34 = restS3Service32.getInvokingApplicationDescription();
        boolean boolean35 = restS3Service32.isShutdown();
        s3SegmentPusher30.s3Client = restS3Service32;
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializerProvider11);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNull("file22.getParent() == null", file22.getParent());
        org.junit.Assert.assertEquals(file22.toString(), "hi!");
        org.junit.Assert.assertNull("file24.getParent() == null", file24.getParent());
        org.junit.Assert.assertEquals(file24.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(providerCredentials33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        java.lang.String str3 = restS3Service1.getInvokingApplicationDescription();
        java.lang.String str4 = restS3Service1.getDevPayProductToken();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.node.ObjectNode objectNode7 = objectMapper6.createObjectNode();
        org.codehaus.jackson.FormatSchema formatSchema8 = null;
        org.codehaus.jackson.map.ObjectReader objectReader9 = objectMapper6.schemaBasedReader(formatSchema8);
        byte[] byteArray11 = objectMapper6.writeValueAsBytes((java.lang.Object) 10L);
        org.codehaus.jackson.FormatSchema formatSchema12 = null;
        org.codehaus.jackson.map.ObjectReader objectReader13 = objectMapper6.reader(formatSchema12);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher14 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig5, objectMapper6);
        // The following exception was thrown during execution in test generation
        try {
            restS3Service1.deleteVersionedObject("/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/[\"content-length-range\", 58, 1]/null", "http://s3.amazonaws.com//?torrent", "[\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-\", \"$<form action=\"https://http://s3.amazonaws.com//hi%21?torrent.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"[\"content-length-range\", 58, 1]\"]");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: S3 Error Message.");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(objectReader9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[49, 48]");
        org.junit.Assert.assertNotNull(objectReader13);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        java.lang.String str3 = restS3Service1.getInvokingApplicationDescription();
        java.lang.String str6 = restS3Service1.createTorrentUrl("http://s3.amazonaws.com//?torrent", "hi!");
        org.jets3t.service.security.ProviderCredentials providerCredentials7 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = restS3Service8.renameMetadataKeys(strMap9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = restS3Service1.renameMetadataKeys(strMap10);
        boolean boolean12 = restS3Service1.isRequesterPaysEnabled();
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider13 = restS3Service1.getCredentialsProvider();
        // The following exception was thrown during execution in test generation
        try {
            restS3Service1.suspendBucketVersioningWithMFA("[\"starts-with\", \"$s3.amazonaws.com\", \"\"]", "{\"{\"\": \"s3.amazonaws.com\"}\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}", "{\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-\": \"\"}");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: Failed to PUT request containing an XML document");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent" + "'", str6, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(credentialsProvider13);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3);
        org.jets3t.service.security.ProviderCredentials providerCredentials5 = restS3Service4.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager6 = null;
        restS3Service4.setHttpConnectionManager(httpConnectionManager6);
        org.jets3t.service.Jets3tProperties jets3tProperties8 = restS3Service4.getJetS3tProperties();
        org.apache.commons.httpclient.HostConfiguration hostConfiguration9 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "", credentialsProvider2, jets3tProperties8, hostConfiguration9);
        boolean boolean11 = restS3Service10.isAuthenticatedConnection();
        java.lang.String str12 = restS3Service10.getDevPayUserToken();
        org.jets3t.service.model.S3Object s3Object14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.S3Object s3Object15 = restS3Service10.putObjectWithSignedUrl("<form action=\"https://http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>", s3Object14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid uri '<form action=\"https://http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">?<input type=\"hidden\" name=\"key\" value=\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\">?<input name=\"file\" type=\"file\">?<br>?<input type=\"submit\" value=\"Upload to Amazon S3\">?</form>': incorrect scheme");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials5);
        org.junit.Assert.assertNotNull(jets3tProperties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider5 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider8 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials9 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider11 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials12 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider14 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials15 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials15);
        org.jets3t.service.security.ProviderCredentials providerCredentials17 = restS3Service16.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager18 = null;
        restS3Service16.setHttpConnectionManager(httpConnectionManager18);
        org.jets3t.service.Jets3tProperties jets3tProperties20 = restS3Service16.getJetS3tProperties();
        org.apache.commons.httpclient.HostConfiguration hostConfiguration21 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service22 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials12, "", credentialsProvider14, jets3tProperties20, hostConfiguration21);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service23 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials9, "{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}", credentialsProvider11, jets3tProperties20);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service24 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials6, "{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}", credentialsProvider8, jets3tProperties20);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration25 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service26 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3, "{\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}", credentialsProvider5, jets3tProperties20, hostConfiguration25);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration27 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service28 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "<form action=\"https://http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>", credentialsProvider2, jets3tProperties20, hostConfiguration27);
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.acl.AccessControlList accessControlList30 = restS3Service28.getBucketAcl("null");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.ServiceException; message: Request Error: java.lang.NullPointerException");
        } catch (org.jets3t.service.ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials17);
        org.junit.Assert.assertNotNull(jets3tProperties20);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager3 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager3);
        java.lang.String str5 = restS3Service1.getEndpoint();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher8 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig6, objectMapper7);
        org.jets3t.service.acl.AccessControlList accessControlList11 = null;
        // The following exception was thrown during execution in test generation
        try {
            restS3Service1.putObjectAcl("[\"\", \"$[\"[\"content-length-range\", 10, 47]\", \"${\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}\", \"[\"starts-with\", \"$[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}\", \"[\"content-length-range\", 58, 1]\"]\", \"\"]\"]\", \"hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\"]", "[\"content-length-range\", 97, 100]", accessControlList11);
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.ServiceException; message: The object '[\"content-length-range\", 97, 100]' does not include ACL information");
        } catch (org.jets3t.service.ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "s3.amazonaws.com" + "'", str5, "s3.amazonaws.com");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider5 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider8 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials9 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider11 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials12 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials12);
        org.jets3t.service.security.ProviderCredentials providerCredentials14 = restS3Service13.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager15 = null;
        restS3Service13.setHttpConnectionManager(httpConnectionManager15);
        org.jets3t.service.Jets3tProperties jets3tProperties17 = restS3Service13.getJetS3tProperties();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials9, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent", credentialsProvider11, jets3tProperties17);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration19 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials6, "http://s3.amazonaws.com//hi%21?torrent", credentialsProvider8, jets3tProperties17, hostConfiguration19);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration21 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service22 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3, "<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>", credentialsProvider5, jets3tProperties17, hostConfiguration21);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration23 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service24 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "[\"{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}\", \"$http://s3.amazonaws.com//hi%21?torrent\", \"[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}\", \"[\"content-length-range\", 58, 1]\"]\"]", credentialsProvider2, jets3tProperties17, hostConfiguration23);
        org.jets3t.service.model.S3Object s3Object29 = null;
        java.util.Calendar calendar31 = null;
        java.util.Calendar calendar32 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent", "[\"content-length-range\", 10, 47]", "[\"content-length-range\", 10, 47]", "[\"content-length-range\", 1, 0]" };
        java.lang.String str40 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("{\"\": \"s3.amazonaws.com\"}", strArray39);
        java.lang.String str41 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("[\"content-length-range\", 97, 100]", strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.lang.String str44 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("", strArray43);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap45 = restS3Service24.copyVersionedObject("hi!/http:/s3.amazonaws.com", "{\"http://s3.amazonaws.com.s3.amazonaws.com/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent\": \"\"}", "[\"starts-with\", \"$[\"starts-with\", \"$/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\", \"\"]\", \"\"]", "{\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\": \"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!,/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!,http://s3.amazonaws.com//?torrent\"}", s3Object29, false, calendar31, calendar32, strArray39, strArray43);
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: The requested action cannot be performed with a non-authenticated service: copyVersionedObject");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials14);
        org.junit.Assert.assertNotNull(jets3tProperties17);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{\"{\"\": \"s3.amazonaws.com\"}\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}" + "'", str40, "{\"{\"\": \"s3.amazonaws.com\"}\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "{\"[\"content-length-range\", 97, 100]\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}" + "'", str41, "{\"[\"content-length-range\", 97, 100]\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "{\"\": \"\"}" + "'", str44, "{\"\": \"\"}");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.io.File file1 = new java.io.File("[\"[\"content-length-range\", 10, 47]\", \"${\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}\", \"[\"starts-with\", \"$[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}\", \"[\"content-length-range\", 58, 1]\"]\", \"\"]\"]");
        org.junit.Assert.assertEquals(file1.getParent(), "[\"[\"content-length-range\", 10, 47]\", \"${\"http:/s3.amazonaws.com/hi%21?torrent\": \"\"}\", \"[\"starts-with\", \"$[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent");
        org.junit.Assert.assertEquals(file1.toString(), "[\"[\"content-length-range\", 10, 47]\", \"${\"http:/s3.amazonaws.com/hi%21?torrent\": \"\"}\", \"[\"starts-with\", \"$[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}\", \"[\"content-length-range\", 58, 1]\"]\", \"\"]\"]");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.codehaus.jackson.map.SerializerFactory serializerFactory0 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper1 = new org.codehaus.jackson.map.ObjectMapper(serializerFactory0);
        org.codehaus.jackson.PrettyPrinter prettyPrinter2 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter3 = objectMapper1.writer(prettyPrinter2);
        org.junit.Assert.assertNotNull(objectWriter3);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider5 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials6);
        org.jets3t.service.security.ProviderCredentials providerCredentials8 = restS3Service7.getProviderCredentials();
        boolean boolean10 = restS3Service7.isBucketAccessible("");
        java.lang.String str11 = restS3Service7.getRestMetadataPrefix();
        boolean boolean12 = restS3Service7.isRequesterPaysEnabled();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager13 = restS3Service7.getHttpConnectionManager();
        org.jets3t.service.Jets3tProperties jets3tProperties14 = restS3Service7.getJetS3tProperties();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3, "[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}\", \"[\"content-length-range\", 58, 1]\"]", credentialsProvider5, jets3tProperties14);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration16 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>", credentialsProvider2, jets3tProperties14, hostConfiguration16);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.PrettyPrinter prettyPrinter20 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter21 = objectMapper19.prettyPrintingWriter(prettyPrinter20);
        org.codehaus.jackson.FormatSchema formatSchema22 = null;
        org.codehaus.jackson.map.ObjectReader objectReader23 = objectMapper19.schemaBasedReader(formatSchema22);
        org.codehaus.jackson.JsonFactory jsonFactory24 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper25 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper26 = objectMapper25.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper27 = objectMapper25.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider28 = objectMapper25.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider29 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper30 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory24, serializerProvider28, deserializerProvider29);
        org.codehaus.jackson.map.AnnotationIntrospector annotationIntrospector31 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper32 = objectMapper30.setAnnotationIntrospector(annotationIntrospector31);
        org.codehaus.jackson.FormatSchema formatSchema33 = null;
        org.codehaus.jackson.map.ObjectReader objectReader34 = objectMapper30.schemaBasedReader(formatSchema33);
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory35 = objectMapper30.getNodeFactory();
        org.codehaus.jackson.map.ObjectMapper objectMapper36 = objectMapper19.setNodeFactory(jsonNodeFactory35);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher37 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service17, s3SegmentPusherConfig18, objectMapper19);
        java.util.Date date38 = restS3Service17.getCurrentTimeWithOffset();
        org.junit.Assert.assertNull(providerCredentials8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "x-amz-meta-" + "'", str11, "x-amz-meta-");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(httpConnectionManager13);
        org.junit.Assert.assertNotNull(jets3tProperties14);
        org.junit.Assert.assertNotNull(objectWriter21);
        org.junit.Assert.assertNotNull(objectReader23);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(serializerProvider28);
        org.junit.Assert.assertNotNull(objectMapper32);
        org.junit.Assert.assertNotNull(objectReader34);
        org.junit.Assert.assertNotNull(jsonNodeFactory35);
        org.junit.Assert.assertNotNull(objectMapper36);
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Thu Nov 04 08:20:46 BRT 2021");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.io.File file1 = new java.io.File("{\"\": \"s3.amazonaws.com\"}");
        java.nio.file.Path path2 = file1.toPath();
        boolean boolean3 = file1.createNewFile();
        java.io.File file5 = new java.io.File(file1, "[\"starts-with\", \"${\"[\"starts-with\", \"$<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]\": \"\"}\", \"\"]");
        java.io.File file6 = file5.getAbsoluteFile();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "{\"\": \"s3.amazonaws.com\"}");
        org.junit.Assert.assertNotNull(path2);
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals(file5.getParent(), "{\"\": \"s3.amazonaws.com\"}/[\"starts-with\", \"${\"[\"starts-with\", \"$<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n<");
        org.junit.Assert.assertEquals(file5.toString(), "{\"\": \"s3.amazonaws.com\"}/[\"starts-with\", \"${\"[\"starts-with\", \"$<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]\": \"\"}\", \"\"]");
        org.junit.Assert.assertNotNull(file6);
// flaky:         org.junit.Assert.assertEquals(file6.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/{\"\": \"s3.amazonaws.com\"}/[\"starts-with\", \"${\"[\"starts-with\", \"$<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n<");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/{\"\": \"s3.amazonaws.com\"}/[\"starts-with\", \"${\"[\"starts-with\", \"$<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]\": \"\"}\", \"\"]");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "{\"{\"\": \"s3.amazonaws.com\"}\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}", credentialsProvider2);
        org.jets3t.service.acl.AccessControlList accessControlList6 = null;
        // The following exception was thrown during execution in test generation
        try {
            restS3Service3.putObjectAcl("http://s3.amazonaws.com.s3.amazonaws.com/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent", "{\"x-amz-meta-\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}", accessControlList6);
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.ServiceException; message: The object '{\"x-amz-meta-\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}' does not include ACL information");
        } catch (org.jets3t.service.ServiceException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        boolean boolean4 = restS3Service1.isBucketAccessible("");
        java.lang.String str5 = restS3Service1.getRestMetadataPrefix();
        boolean boolean6 = restS3Service1.isRequesterPaysEnabled();
        org.jets3t.service.Jets3tProperties jets3tProperties7 = restS3Service1.getJetS3tProperties();
        boolean boolean8 = restS3Service1.isAuthenticatedConnection();
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "x-amz-meta-" + "'", str5, "x-amz-meta-");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jets3tProperties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.codehaus.jackson.JsonFactory jsonFactory0 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider1 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider2 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig3 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig4 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory0, serializerProvider1, deserializerProvider2, serializationConfig3, deserializationConfig4);
        org.codehaus.jackson.map.ObjectWriter objectWriter6 = objectMapper5.defaultPrettyPrintingWriter();
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = objectMapper7.disableDefaultTyping();
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory9 = objectMapper7.getNodeFactory();
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = objectMapper5.setNodeFactory(jsonNodeFactory9);
        org.codehaus.jackson.map.ObjectWriter objectWriter11 = objectMapper5.defaultPrettyPrintingWriter();
        org.codehaus.jackson.PrettyPrinter prettyPrinter12 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter13 = objectMapper5.writer(prettyPrinter12);
        com.metamx.emitter.EmittingLogger emittingLogger15 = new com.metamx.emitter.EmittingLogger("{\"\": \"s3.amazonaws.com\"}");
        boolean boolean16 = emittingLogger15.isDebugEnabled();
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger15;
        org.codehaus.jackson.JsonFactory jsonFactory19 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = objectMapper20.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper22 = objectMapper20.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider23 = objectMapper20.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider24 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper25 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory19, serializerProvider23, deserializerProvider24);
        org.codehaus.jackson.map.jsontype.SubtypeResolver subtypeResolver26 = null;
        objectMapper25.setSubtypeResolver(subtypeResolver26);
        com.metamx.emitter.EmittingLogger emittingLogger29 = new com.metamx.emitter.EmittingLogger("s3.amazonaws.com");
        boolean boolean30 = emittingLogger29.isInfoEnabled();
        org.codehaus.jackson.map.ObjectMapper objectMapper32 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper33 = objectMapper32.disableDefaultTyping();
        org.codehaus.jackson.PrettyPrinter prettyPrinter34 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter35 = objectMapper32.writer(prettyPrinter34);
        org.codehaus.jackson.map.ObjectMapper objectMapper36 = objectMapper32.enableDefaultTyping();
        org.codehaus.jackson.map.ObjectReader objectReader37 = objectMapper32.reader();
        org.codehaus.jackson.map.ObjectMapper objectMapper38 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper39 = objectMapper38.disableDefaultTyping();
        org.codehaus.jackson.PrettyPrinter prettyPrinter40 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter41 = objectMapper38.writer(prettyPrinter40);
        org.codehaus.jackson.map.ObjectMapper objectMapper42 = objectMapper38.enableDefaultTyping();
        org.codehaus.jackson.map.DeserializationConfig.Feature[] featureArray43 = new org.codehaus.jackson.map.DeserializationConfig.Feature[] {};
        org.codehaus.jackson.map.ObjectMapper objectMapper44 = objectMapper38.enable(featureArray43);
        org.codehaus.jackson.map.ObjectMapper objectMapper45 = objectMapper32.disable(featureArray43);
        emittingLogger29.error("/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-", (java.lang.Object[]) featureArray43);
        org.codehaus.jackson.map.ObjectMapper objectMapper47 = objectMapper25.disable(featureArray43);
        emittingLogger15.info("[\"content-length-range\", 1, 0]", (java.lang.Object[]) featureArray43);
        org.codehaus.jackson.map.ObjectMapper objectMapper49 = objectMapper5.disable(featureArray43);
        org.codehaus.jackson.map.ser.FilterProvider filterProvider50 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter51 = objectMapper49.filteredWriter(filterProvider50);
        org.junit.Assert.assertNotNull(objectWriter6);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(jsonNodeFactory9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectWriter11);
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(serializerProvider23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(objectWriter35);
        org.junit.Assert.assertNotNull(objectMapper36);
        org.junit.Assert.assertNotNull(objectReader37);
        org.junit.Assert.assertNotNull(objectMapper39);
        org.junit.Assert.assertNotNull(objectWriter41);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertNotNull(featureArray43);
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertNotNull(objectMapper45);
        org.junit.Assert.assertNotNull(objectMapper47);
        org.junit.Assert.assertNotNull(objectMapper49);
        org.junit.Assert.assertNotNull(objectWriter51);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.io.File file1 = new java.io.File("hi!");
        java.io.File file3 = new java.io.File(file1, "<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
        java.io.File file5 = new java.io.File(file3, "");
        boolean boolean8 = file5.setReadable(false, true);
        java.net.URL uRL9 = file5.toURL();
        java.net.URL uRL10 = file5.toURL();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "hi!");
        org.junit.Assert.assertEquals(file3.getParent(), "hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n<");
        org.junit.Assert.assertEquals(file3.toString(), "hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
        org.junit.Assert.assertEquals(file5.getParent(), "hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n<");
        org.junit.Assert.assertEquals(file5.toString(), "hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(uRL9);
// flaky:         org.junit.Assert.assertEquals(uRL9.toString(), "file:/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
        org.junit.Assert.assertNotNull(uRL10);
// flaky:         org.junit.Assert.assertEquals(uRL10.toString(), "file:/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "[\"content-length-range\", -226, -226]", credentialsProvider2);
        org.jets3t.service.model.StorageBucket storageBucket4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.StorageBucket storageBucket5 = restS3Service3.createBucket(storageBucket4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.io.File file1 = new java.io.File("<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
        boolean boolean2 = file1.mkdir();
        long long3 = file1.getUsableSpace();
        java.lang.String str4 = file1.getPath();
        boolean boolean5 = file1.delete();
        org.junit.Assert.assertEquals(file1.getParent(), "<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n<");
        org.junit.Assert.assertEquals(file1.toString(), "<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 80259506176L + "'", long3 == 80259506176L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>" + "'", str4, "<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper1 = objectMapper0.disableDefaultTyping();
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory2 = objectMapper0.getNodeFactory();
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = objectMapper3.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = objectMapper5.disableDefaultTyping();
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory7 = objectMapper5.getNodeFactory();
        org.codehaus.jackson.map.ObjectReader objectReader8 = objectMapper3.reader(jsonNodeFactory7);
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = objectMapper9.disableDefaultTyping();
        org.codehaus.jackson.map.SerializationConfig.Feature[] featureArray12 = new org.codehaus.jackson.map.SerializationConfig.Feature[] {};
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = objectMapper9.enable(featureArray12);
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = objectMapper3.enable(featureArray12);
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = objectMapper0.enable(featureArray12);
        org.codehaus.jackson.map.Module module16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.map.ObjectMapper objectMapper17 = objectMapper0.withModule(module16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper1);
        org.junit.Assert.assertNotNull(jsonNodeFactory2);
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(jsonNodeFactory7);
        org.junit.Assert.assertNotNull(objectReader8);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(featureArray12);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(objectMapper15);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "x-amz-meta-");
        boolean boolean3 = file2.setReadOnly();
        java.io.File file4 = file2.getAbsoluteFile();
        java.net.URI uRI5 = file4.toURI();
        java.io.File file7 = new java.io.File(file4, "x-amz-meta-");
        long long8 = file7.lastModified();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "x-amz-meta-");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(file4);
// flaky:         org.junit.Assert.assertEquals(file4.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4");
// flaky:         org.junit.Assert.assertEquals(file4.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-");
        org.junit.Assert.assertNotNull(uRI5);
// flaky:         org.junit.Assert.assertEquals(file7.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-");
// flaky:         org.junit.Assert.assertEquals(file7.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-/x-amz-meta-");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.io.File file1 = new java.io.File("hi!");
        java.io.File file3 = new java.io.File(file1, "<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
        boolean boolean6 = file3.setWritable(false, true);
        boolean boolean8 = file3.setLastModified(80259567616L);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "hi!");
        org.junit.Assert.assertEquals(file3.getParent(), "hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n<");
        org.junit.Assert.assertEquals(file3.toString(), "hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.common.base.Joiner joiner1 = com.google.common.base.Joiner.on(' ');
        com.google.common.base.Joiner.MapJoiner mapJoiner3 = joiner1.withKeyValueSeparator("[\"starts-with\", \"$[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}\", \"[\"content-length-range\", 58, 1]\"]\", \"\"]");
        com.metamx.druid.loading.S3SegmentPusher.JOINER = joiner1;
        org.junit.Assert.assertNotNull(joiner1);
        org.junit.Assert.assertNotNull(mapJoiner3);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper1 = objectMapper0.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = objectMapper2.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = objectMapper2.disableDefaultTyping();
        java.io.File file6 = new java.io.File("hi!");
        java.io.File file8 = new java.io.File(file6, "");
        java.lang.Class<?> wildcardClass9 = file6.getClass();
        org.codehaus.jackson.type.JavaType javaType10 = objectMapper4.constructType((java.lang.reflect.Type) wildcardClass9);
        com.metamx.emitter.EmittingLogger emittingLogger11 = new com.metamx.emitter.EmittingLogger((java.lang.Class) wildcardClass9);
        org.codehaus.jackson.type.JavaType javaType12 = objectMapper0.constructType((java.lang.reflect.Type) wildcardClass9);
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig13 = objectMapper0.getDeserializationConfig();
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = objectMapper0.disableDefaultTyping();
        org.junit.Assert.assertNotNull(objectMapper1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(deserializationConfig13);
        org.junit.Assert.assertNotNull(objectMapper14);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        boolean boolean4 = restS3Service1.isBucketAccessible("");
        java.lang.String str5 = restS3Service1.getRestMetadataPrefix();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.JsonFactory jsonFactory7 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider8 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider9 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig10 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig11 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory7, serializerProvider8, deserializerProvider9, serializationConfig10, deserializationConfig11);
        org.codehaus.jackson.map.ObjectWriter objectWriter13 = objectMapper12.defaultPrettyPrintingWriter();
        org.codehaus.jackson.map.ser.FilterProvider filterProvider14 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter15 = objectMapper12.writer(filterProvider14);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher16 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig6, objectMapper12);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = objectMapper18.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = objectMapper18.disableDefaultTyping();
        java.lang.Object obj21 = null;
        java.lang.String str22 = objectMapper18.writeValueAsString(obj21);
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider23 = objectMapper18.getDeserializerProvider();
        org.codehaus.jackson.JsonFactory jsonFactory24 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper25 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper26 = objectMapper25.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper27 = objectMapper25.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider28 = objectMapper25.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider29 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper30 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory24, serializerProvider28, deserializerProvider29);
        org.codehaus.jackson.map.ObjectMapper objectMapper31 = objectMapper18.setSerializerProvider(serializerProvider28);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher32 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig17, objectMapper18);
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory33 = objectMapper18.getNodeFactory();
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory34 = objectMapper18.getNodeFactory();
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "x-amz-meta-" + "'", str5, "x-amz-meta-");
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertNotNull(deserializerProvider23);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(serializerProvider28);
        org.junit.Assert.assertNotNull(objectMapper31);
        org.junit.Assert.assertNotNull(jsonNodeFactory33);
        org.junit.Assert.assertNotNull(jsonNodeFactory34);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher5 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig3, objectMapper4);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher8 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig6, objectMapper7);
        java.lang.String str9 = restS3Service1.getRestMetadataPrefix();
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider10 = restS3Service1.getCredentialsProvider();
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.S3Object s3Object14 = restS3Service1.getVersionedObject("{\"[\"content-length-range\", 97, 100]\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}", "hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>", "{\"\": \"s3.amazonaws.com\"}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid uri 'https://s3.amazonaws.com:443/hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">?<input type=\"hidden\" name=\"key\" value=\"hi!\">?<input name=\"file\" type=\"file\">?<br>?<input type=\"submit\" value=\"Upload to Amazon S3\">?</form>/%7B%22%22%3A%20%22s3.amazonaws.com%22%7D?versionId=%7B%22%5B%22content-length-range%22%2C%2097%2C%20100%5D%22%3A%20%22http%3A%2F%2Fs3.amazonaws.com%2F%257B%2522http%253A%252F%252Fs3.amazonaws.com%252Fhttp%25253A%25252F%25252Fs3.amazonaws.com%25252F%25252F%25253Ftorrent%252Fhi%252521%253Ftorrent%2522%253A%2520%2522x-amz-meta-%2522%257D%2F%253Cform%2520action%253D%2522https%253A%2F%2F.s3.amazonaws.com%2F%2522%2520method%253D%2522post%2522%2520enctype%253D%2522multipart%2Fform-data%2522%253E%250A%253Cinput%2520type%253D%2522hidden%2522%2520name%253D%2522key%2522%2520value%253D%2522hi%2521%2522%253E%250A%253Cinput%2520name%253D%2522file%2522%2520type%253D%2522file%2522%253E%250A%253Cbr%253E%250A%253Cinput%2520type%253D%2522submit%2522%2520value%253D%2522Upload%2520to%2520Amazon%2520S3%2522%253E%250A%253C%2Fform%253E%3Ftorrent%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%201%2C%200%5D%22%7D': escaped absolute path not valid");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "x-amz-meta-" + "'", str9, "x-amz-meta-");
        org.junit.Assert.assertNull(credentialsProvider10);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.node.ObjectNode objectNode1 = objectMapper0.createObjectNode();
        org.codehaus.jackson.FormatSchema formatSchema2 = null;
        org.codehaus.jackson.map.ObjectReader objectReader3 = objectMapper0.schemaBasedReader(formatSchema2);
        byte[] byteArray5 = objectMapper0.writeValueAsBytes((java.lang.Object) 10L);
        org.codehaus.jackson.FormatSchema formatSchema6 = null;
        org.codehaus.jackson.map.ObjectReader objectReader7 = objectMapper0.reader(formatSchema6);
        java.text.DateFormat dateFormat8 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter9 = objectMapper0.writer(dateFormat8);
        com.metamx.emitter.EmittingLogger emittingLogger11 = new com.metamx.emitter.EmittingLogger("s3.amazonaws.com");
        boolean boolean12 = emittingLogger11.isInfoEnabled();
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = objectMapper14.disableDefaultTyping();
        org.codehaus.jackson.PrettyPrinter prettyPrinter16 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter17 = objectMapper14.writer(prettyPrinter16);
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = objectMapper14.enableDefaultTyping();
        org.codehaus.jackson.map.ObjectReader objectReader19 = objectMapper14.reader();
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = objectMapper20.disableDefaultTyping();
        org.codehaus.jackson.PrettyPrinter prettyPrinter22 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter23 = objectMapper20.writer(prettyPrinter22);
        org.codehaus.jackson.map.ObjectMapper objectMapper24 = objectMapper20.enableDefaultTyping();
        org.codehaus.jackson.map.DeserializationConfig.Feature[] featureArray25 = new org.codehaus.jackson.map.DeserializationConfig.Feature[] {};
        org.codehaus.jackson.map.ObjectMapper objectMapper26 = objectMapper20.enable(featureArray25);
        org.codehaus.jackson.map.ObjectMapper objectMapper27 = objectMapper14.disable(featureArray25);
        emittingLogger11.error("/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-", (java.lang.Object[]) featureArray25);
        org.codehaus.jackson.map.ObjectMapper objectMapper29 = objectMapper0.enable(featureArray25);
        org.codehaus.jackson.map.ObjectWriter objectWriter30 = objectMapper0.writer();
        org.junit.Assert.assertNotNull(objectNode1);
        org.junit.Assert.assertNotNull(objectReader3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[49, 48]");
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(objectWriter9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(objectReader19);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(objectWriter23);
        org.junit.Assert.assertNotNull(objectMapper24);
        org.junit.Assert.assertNotNull(featureArray25);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertNotNull(objectWriter30);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher5 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig3, objectMapper4);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher8 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig6, objectMapper7);
        java.lang.String str9 = restS3Service1.getRestMetadataPrefix();
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider10 = restS3Service1.getCredentialsProvider();
        java.lang.String str13 = restS3Service1.createTorrentUrl("<form action=\"https://http://s3.amazonaws.com//hi%21?torrent.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>", "{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}");
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.acl.AccessControlList accessControlList16 = restS3Service1.getObjectAcl("http://s3.amazonaws.com/%5B%22starts-with%22%2C%20%22%24%5B%22starts-with%22%2C%20%22%24%2Fhome%2FCIN%2Flmps2%2Fsemantic-conflict-study%2FSMAT%2Foutput-test-dest%2Fdruid%2F05168808c278c080c59c19e858d9471b316cd1f5%2Frandoop-modified_4%2Fhi%21%22%2C%20%22%22%5D%22%2C%20%22%22%5D/http%3A//s3.amazonaws.com/http%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent/hi%2521%3Ftorrent?torrent", "");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.ServiceException; message: S3 Error Message.");
        } catch (org.jets3t.service.ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "x-amz-meta-" + "'", str9, "x-amz-meta-");
        org.junit.Assert.assertNull(credentialsProvider10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://s3.amazonaws.com/%3Cform%20action%3D%22https%3A%2F%2Fhttp%3A%2F%2Fs3.amazonaws.com%2F%2Fhi%2521%3Ftorrent.s3.amazonaws.com%2F%22%20method%3D%22post%22%20enctype%3D%22multipart%2Fform-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C%2Fform%3E/%7B%22%7B%22%22%3A%20%22s3.amazonaws.com%22%7D%22%3A%20%22acl%2Cpolicy%2Ctorrent%2Clogging%2Clocation%2CrequestPayment%2Cversions%2Cversioning%2CversionId%2Cuploads%2CuploadId%2CpartNumber%2Cwebsite%2Cnotification%22%7D?torrent" + "'", str13, "http://s3.amazonaws.com/%3Cform%20action%3D%22https%3A%2F%2Fhttp%3A%2F%2Fs3.amazonaws.com%2F%2Fhi%2521%3Ftorrent.s3.amazonaws.com%2F%22%20method%3D%22post%22%20enctype%3D%22multipart%2Fform-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C%2Fform%3E/%7B%22%7B%22%22%3A%20%22s3.amazonaws.com%22%7D%22%3A%20%22acl%2Cpolicy%2Ctorrent%2Clogging%2Clocation%2CrequestPayment%2Cversions%2Cversioning%2CversionId%2Cuploads%2CuploadId%2CpartNumber%2Cwebsite%2Cnotification%22%7D?torrent");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager3 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager3);
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager5 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager5);
        java.lang.String str9 = restS3Service1.createTorrentUrl("", "hi!");
        boolean boolean11 = restS3Service1.isBucketAccessible("s3.amazonaws.com");
        java.util.Date date12 = restS3Service1.getCurrentTimeWithOffset();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.node.ObjectNode objectNode15 = objectMapper14.createObjectNode();
        org.codehaus.jackson.FormatSchema formatSchema16 = null;
        org.codehaus.jackson.map.ObjectReader objectReader17 = objectMapper14.schemaBasedReader(formatSchema16);
        byte[] byteArray19 = objectMapper14.writeValueAsBytes((java.lang.Object) 10L);
        org.codehaus.jackson.map.SerializationConfig.Feature[] featureArray20 = new org.codehaus.jackson.map.SerializationConfig.Feature[] {};
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = objectMapper14.disable(featureArray20);
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider22 = objectMapper14.getDeserializerProvider();
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher23 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig13, objectMapper14);
        java.io.File file25 = new java.io.File("http://s3.amazonaws.com//hi%21?torrent");
        boolean boolean27 = file25.setLastModified((long) (short) 10);
        java.io.File file28 = file25.getAbsoluteFile();
        boolean boolean31 = file25.setWritable(false, true);
        com.metamx.druid.client.DataSegment dataSegment32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment33 = s3SegmentPusher23.push(file25, dataSegment32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://s3.amazonaws.com//hi%21?torrent" + "'", str9, "http://s3.amazonaws.com//hi%21?torrent");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Thu Nov 04 08:20:49 BRT 2021");
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertNotNull(objectReader17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[49, 48]");
        org.junit.Assert.assertNotNull(featureArray20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(deserializerProvider22);
        org.junit.Assert.assertEquals(file25.getParent(), "http:/s3.amazonaws.com");
        org.junit.Assert.assertEquals(file25.toString(), "http:/s3.amazonaws.com/hi%21?torrent");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(file28);
// flaky:         org.junit.Assert.assertEquals(file28.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/http:/s3.amazonaws.com");
// flaky:         org.junit.Assert.assertEquals(file28.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/http:/s3.amazonaws.com/hi%21?torrent");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        java.lang.String str3 = restS3Service1.getInvokingApplicationDescription();
        boolean boolean4 = restS3Service1.isShutdown();
        org.apache.commons.httpclient.HttpMethod httpMethod5 = null;
        restS3Service1.authorizeHttpRequest(httpMethod5);
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider5 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider8 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials9 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider11 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials12 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials12);
        org.jets3t.service.security.ProviderCredentials providerCredentials14 = restS3Service13.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager15 = null;
        restS3Service13.setHttpConnectionManager(httpConnectionManager15);
        org.jets3t.service.Jets3tProperties jets3tProperties17 = restS3Service13.getJetS3tProperties();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials9, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent", credentialsProvider11, jets3tProperties17);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration19 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials6, "http://s3.amazonaws.com//hi%21?torrent", credentialsProvider8, jets3tProperties17, hostConfiguration19);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration21 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service22 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3, "<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>", credentialsProvider5, jets3tProperties17, hostConfiguration21);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration23 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service24 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "[\"{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}\", \"$http://s3.amazonaws.com//hi%21?torrent\", \"[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}\", \"[\"content-length-range\", 58, 1]\"]\"]", credentialsProvider2, jets3tProperties17, hostConfiguration23);
        restS3Service24.setDevPayProductToken("<form action=\"https://http://s3.amazonaws.com//hi%21?torrent.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
        org.junit.Assert.assertNull(providerCredentials14);
        org.junit.Assert.assertNotNull(jets3tProperties17);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager3 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager3);
        java.lang.String str5 = restS3Service1.getEndpoint();
        java.lang.String str8 = restS3Service1.createTorrentUrl("", "");
        boolean boolean9 = restS3Service1.isRequesterPaysEnabled();
        java.util.List<java.lang.String> strList10 = restS3Service1.getResourceParameterNames();
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "s3.amazonaws.com" + "'", str5, "s3.amazonaws.com");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://s3.amazonaws.com//?torrent" + "'", str8, "http://s3.amazonaws.com//?torrent");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.codehaus.jackson.JsonFactory jsonFactory0 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper1 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = objectMapper1.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = objectMapper1.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider4 = objectMapper1.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider5 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory0, serializerProvider4, deserializerProvider5);
        org.codehaus.jackson.map.SerializerFactory serializerFactory7 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = objectMapper6.setSerializerFactory(serializerFactory7);
        org.codehaus.jackson.PrettyPrinter prettyPrinter9 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter10 = objectMapper8.prettyPrintingWriter(prettyPrinter9);
        org.codehaus.jackson.map.type.TypeFactory typeFactory11 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = objectMapper8.setTypeFactory(typeFactory11);
        org.codehaus.jackson.map.SerializationConfig serializationConfig13 = objectMapper12.getSerializationConfig();
        org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion inclusion14 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = objectMapper12.setSerializationInclusion(inclusion14);
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(serializerProvider4);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(serializationConfig13);
        org.junit.Assert.assertNotNull(objectMapper15);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        java.lang.String str3 = restS3Service1.getInvokingApplicationDescription();
        java.lang.String str4 = restS3Service1.getDevPayProductToken();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.node.ObjectNode objectNode7 = objectMapper6.createObjectNode();
        org.codehaus.jackson.FormatSchema formatSchema8 = null;
        org.codehaus.jackson.map.ObjectReader objectReader9 = objectMapper6.schemaBasedReader(formatSchema8);
        byte[] byteArray11 = objectMapper6.writeValueAsBytes((java.lang.Object) 10L);
        org.codehaus.jackson.FormatSchema formatSchema12 = null;
        org.codehaus.jackson.map.ObjectReader objectReader13 = objectMapper6.reader(formatSchema12);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher14 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig5, objectMapper6);
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = objectMapper15.disableDefaultTyping();
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory17 = objectMapper15.getNodeFactory();
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = objectMapper18.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = objectMapper20.disableDefaultTyping();
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory22 = objectMapper20.getNodeFactory();
        org.codehaus.jackson.map.ObjectReader objectReader23 = objectMapper18.reader(jsonNodeFactory22);
        org.codehaus.jackson.map.ObjectMapper objectMapper24 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper25 = objectMapper24.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper26 = objectMapper24.disableDefaultTyping();
        org.codehaus.jackson.map.SerializationConfig.Feature[] featureArray27 = new org.codehaus.jackson.map.SerializationConfig.Feature[] {};
        org.codehaus.jackson.map.ObjectMapper objectMapper28 = objectMapper24.enable(featureArray27);
        org.codehaus.jackson.map.ObjectMapper objectMapper29 = objectMapper18.enable(featureArray27);
        org.codehaus.jackson.map.ObjectMapper objectMapper30 = objectMapper15.enable(featureArray27);
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory31 = objectMapper15.getNodeFactory();
        org.codehaus.jackson.map.ObjectMapper objectMapper32 = objectMapper6.setNodeFactory(jsonNodeFactory31);
        org.codehaus.jackson.map.type.TypeFactory typeFactory33 = objectMapper6.getTypeFactory();
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(objectReader9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[49, 48]");
        org.junit.Assert.assertNotNull(objectReader13);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(jsonNodeFactory17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(jsonNodeFactory22);
        org.junit.Assert.assertNotNull(objectReader23);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(featureArray27);
        org.junit.Assert.assertNotNull(objectMapper28);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertNotNull(objectMapper30);
        org.junit.Assert.assertNotNull(jsonNodeFactory31);
        org.junit.Assert.assertNotNull(objectMapper32);
        org.junit.Assert.assertNotNull(typeFactory33);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.AnnotationIntrospector annotationIntrospector1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = objectMapper0.setAnnotationIntrospector(annotationIntrospector1);
        org.codehaus.jackson.map.HandlerInstantiator handlerInstantiator3 = null;
        objectMapper0.setHandlerInstantiator(handlerInstantiator3);
        org.codehaus.jackson.Version version5 = objectMapper0.version();
        java.io.InputStream inputStream6 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials7 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials7);
        org.jets3t.service.security.ProviderCredentials providerCredentials9 = restS3Service8.getProviderCredentials();
        java.lang.String str10 = restS3Service8.getInvokingApplicationDescription();
        restS3Service8.setRequesterPaysEnabled(false);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        org.codehaus.jackson.JsonFactory jsonFactory14 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = objectMapper15.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = objectMapper15.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider18 = objectMapper15.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider19 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory14, serializerProvider18, deserializerProvider19);
        org.codehaus.jackson.map.SerializerFactory serializerFactory21 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper22 = objectMapper20.setSerializerFactory(serializerFactory21);
        org.codehaus.jackson.PrettyPrinter prettyPrinter23 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter24 = objectMapper22.prettyPrintingWriter(prettyPrinter23);
        org.codehaus.jackson.map.ObjectMapper objectMapper25 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper26 = objectMapper25.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper27 = objectMapper25.disableDefaultTyping();
        java.io.File file29 = new java.io.File("hi!");
        java.io.File file31 = new java.io.File(file29, "");
        java.lang.Class<?> wildcardClass32 = file29.getClass();
        org.codehaus.jackson.type.JavaType javaType33 = objectMapper27.constructType((java.lang.reflect.Type) wildcardClass32);
        boolean boolean34 = objectMapper22.canDeserialize(javaType33);
        org.codehaus.jackson.map.ser.FilterProvider filterProvider35 = null;
        objectMapper22.setFilters(filterProvider35);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher37 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service8, s3SegmentPusherConfig13, objectMapper22);
        org.codehaus.jackson.map.ObjectMapper objectMapper38 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper39 = objectMapper38.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper40 = objectMapper38.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider41 = objectMapper38.getSerializerProvider();
        java.text.DateFormat dateFormat42 = null;
        objectMapper38.setDateFormat(dateFormat42);
        org.codehaus.jackson.JsonFactory jsonFactory45 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper46 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper47 = objectMapper46.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper48 = objectMapper46.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider49 = objectMapper46.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider50 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper51 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory45, serializerProvider49, deserializerProvider50);
        org.codehaus.jackson.map.SerializerFactory serializerFactory52 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper53 = objectMapper51.setSerializerFactory(serializerFactory52);
        org.codehaus.jackson.PrettyPrinter prettyPrinter54 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter55 = objectMapper53.prettyPrintingWriter(prettyPrinter54);
        org.codehaus.jackson.map.ObjectMapper objectMapper56 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper57 = objectMapper56.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper58 = objectMapper56.disableDefaultTyping();
        java.io.File file60 = new java.io.File("hi!");
        java.io.File file62 = new java.io.File(file60, "");
        java.lang.Class<?> wildcardClass63 = file60.getClass();
        org.codehaus.jackson.type.JavaType javaType64 = objectMapper58.constructType((java.lang.reflect.Type) wildcardClass63);
        boolean boolean65 = objectMapper53.canDeserialize(javaType64);
        org.jets3t.service.impl.rest.httpclient.RestStorageService restStorageService66 = objectMapper38.readValue("null", javaType64);
        org.codehaus.jackson.map.ObjectReader objectReader67 = objectMapper22.reader(javaType64);
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.node.ContainerNode containerNode68 = objectMapper0.readValue(inputStream6, javaType64);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNull(providerCredentials9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(serializerProvider18);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(objectWriter24);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNull("file29.getParent() == null", file29.getParent());
        org.junit.Assert.assertEquals(file29.toString(), "hi!");
        org.junit.Assert.assertNull("file31.getParent() == null", file31.getParent());
        org.junit.Assert.assertEquals(file31.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(javaType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objectMapper39);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(serializerProvider41);
        org.junit.Assert.assertNotNull(objectMapper47);
        org.junit.Assert.assertNotNull(objectMapper48);
        org.junit.Assert.assertNotNull(serializerProvider49);
        org.junit.Assert.assertNotNull(objectMapper53);
        org.junit.Assert.assertNotNull(objectWriter55);
        org.junit.Assert.assertNotNull(objectMapper57);
        org.junit.Assert.assertNotNull(objectMapper58);
        org.junit.Assert.assertNull("file60.getParent() == null", file60.getParent());
        org.junit.Assert.assertEquals(file60.toString(), "hi!");
        org.junit.Assert.assertNull("file62.getParent() == null", file62.getParent());
        org.junit.Assert.assertEquals(file62.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(javaType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(restStorageService66);
        org.junit.Assert.assertNotNull(objectReader67);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.codehaus.jackson.JsonFactory jsonFactory0 = null;
        org.codehaus.jackson.JsonFactory jsonFactory1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = objectMapper2.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = objectMapper2.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider5 = objectMapper2.getSerializerProvider();
        org.codehaus.jackson.JsonFactory jsonFactory6 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider7 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider8 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig9 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig10 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory6, serializerProvider7, deserializerProvider8, serializationConfig9, deserializationConfig10);
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider12 = objectMapper11.getDeserializerProvider();
        org.codehaus.jackson.map.SerializationConfig serializationConfig13 = null;
        org.codehaus.jackson.JsonFactory jsonFactory14 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = objectMapper15.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = objectMapper15.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider18 = objectMapper15.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider19 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory14, serializerProvider18, deserializerProvider19);
        org.codehaus.jackson.map.SerializerFactory serializerFactory21 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper22 = objectMapper20.setSerializerFactory(serializerFactory21);
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig23 = objectMapper20.copyDeserializationConfig();
        org.codehaus.jackson.map.ObjectMapper objectMapper24 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory1, serializerProvider5, deserializerProvider12, serializationConfig13, deserializationConfig23);
        org.codehaus.jackson.JsonFactory jsonFactory25 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper26 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper27 = objectMapper26.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper28 = objectMapper26.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider29 = objectMapper26.getSerializerProvider();
        org.codehaus.jackson.JsonFactory jsonFactory30 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider31 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider32 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig33 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig34 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper35 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory30, serializerProvider31, deserializerProvider32, serializationConfig33, deserializationConfig34);
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider36 = objectMapper35.getDeserializerProvider();
        org.codehaus.jackson.map.SerializationConfig serializationConfig37 = null;
        org.codehaus.jackson.JsonFactory jsonFactory38 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper39 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper40 = objectMapper39.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper41 = objectMapper39.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider42 = objectMapper39.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider43 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper44 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory38, serializerProvider42, deserializerProvider43);
        org.codehaus.jackson.map.SerializerFactory serializerFactory45 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper46 = objectMapper44.setSerializerFactory(serializerFactory45);
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig47 = objectMapper44.copyDeserializationConfig();
        org.codehaus.jackson.map.ObjectMapper objectMapper48 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory25, serializerProvider29, deserializerProvider36, serializationConfig37, deserializationConfig47);
        org.codehaus.jackson.map.ObjectMapper objectMapper49 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory0, serializerProvider5, deserializerProvider36);
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig50 = objectMapper49.getDeserializationConfig();
        org.codehaus.jackson.map.SerializationConfig.Feature feature51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.map.ObjectMapper objectMapper53 = objectMapper49.configure(feature51, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(serializerProvider5);
        org.junit.Assert.assertNotNull(deserializerProvider12);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(serializerProvider18);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(deserializationConfig23);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(objectMapper28);
        org.junit.Assert.assertNotNull(serializerProvider29);
        org.junit.Assert.assertNotNull(deserializerProvider36);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(objectMapper41);
        org.junit.Assert.assertNotNull(serializerProvider42);
        org.junit.Assert.assertNotNull(objectMapper46);
        org.junit.Assert.assertNotNull(deserializationConfig47);
        org.junit.Assert.assertNotNull(deserializationConfig50);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.io.File file1 = new java.io.File("hi!");
        java.io.File file3 = new java.io.File(file1, "");
        boolean boolean5 = file1.setWritable(false);
        boolean boolean6 = file1.delete();
        boolean boolean9 = file1.setWritable(true, false);
        boolean boolean10 = file1.delete();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "hi!");
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.io.File file1 = new java.io.File("http://s3.amazonaws.com//hi%21?torrent");
        boolean boolean2 = file1.exists();
        java.lang.String str3 = file1.getPath();
        java.net.URL uRL4 = file1.toURL();
        org.junit.Assert.assertEquals(file1.getParent(), "http:/s3.amazonaws.com");
        org.junit.Assert.assertEquals(file1.toString(), "http:/s3.amazonaws.com/hi%21?torrent");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http:/s3.amazonaws.com/hi%21?torrent" + "'", str3, "http:/s3.amazonaws.com/hi%21?torrent");
        org.junit.Assert.assertNotNull(uRL4);
// flaky:         org.junit.Assert.assertEquals(uRL4.toString(), "file:/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/http:/s3.amazonaws.com/hi%21?torrent");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.codehaus.jackson.JsonFactory jsonFactory0 = null;
        org.codehaus.jackson.JsonFactory jsonFactory1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = objectMapper2.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = objectMapper2.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider5 = objectMapper2.getSerializerProvider();
        org.codehaus.jackson.JsonFactory jsonFactory6 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider7 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider8 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig9 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig10 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory6, serializerProvider7, deserializerProvider8, serializationConfig9, deserializationConfig10);
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider12 = objectMapper11.getDeserializerProvider();
        org.codehaus.jackson.map.SerializationConfig serializationConfig13 = null;
        org.codehaus.jackson.JsonFactory jsonFactory14 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = objectMapper15.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = objectMapper15.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider18 = objectMapper15.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider19 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory14, serializerProvider18, deserializerProvider19);
        org.codehaus.jackson.map.SerializerFactory serializerFactory21 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper22 = objectMapper20.setSerializerFactory(serializerFactory21);
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig23 = objectMapper20.copyDeserializationConfig();
        org.codehaus.jackson.map.ObjectMapper objectMapper24 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory1, serializerProvider5, deserializerProvider12, serializationConfig13, deserializationConfig23);
        org.codehaus.jackson.JsonFactory jsonFactory25 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper26 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper27 = objectMapper26.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper28 = objectMapper26.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider29 = objectMapper26.getSerializerProvider();
        org.codehaus.jackson.JsonFactory jsonFactory30 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider31 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider32 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig33 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig34 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper35 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory30, serializerProvider31, deserializerProvider32, serializationConfig33, deserializationConfig34);
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider36 = objectMapper35.getDeserializerProvider();
        org.codehaus.jackson.map.SerializationConfig serializationConfig37 = null;
        org.codehaus.jackson.JsonFactory jsonFactory38 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper39 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper40 = objectMapper39.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper41 = objectMapper39.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider42 = objectMapper39.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider43 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper44 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory38, serializerProvider42, deserializerProvider43);
        org.codehaus.jackson.map.SerializerFactory serializerFactory45 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper46 = objectMapper44.setSerializerFactory(serializerFactory45);
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig47 = objectMapper44.copyDeserializationConfig();
        org.codehaus.jackson.map.ObjectMapper objectMapper48 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory25, serializerProvider29, deserializerProvider36, serializationConfig37, deserializationConfig47);
        org.codehaus.jackson.map.ObjectMapper objectMapper49 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory0, serializerProvider5, deserializerProvider36);
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig50 = objectMapper49.getDeserializationConfig();
        org.codehaus.jackson.map.ObjectMapper objectMapper51 = objectMapper49.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper52 = objectMapper49.disableDefaultTyping();
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(serializerProvider5);
        org.junit.Assert.assertNotNull(deserializerProvider12);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(serializerProvider18);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(deserializationConfig23);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(objectMapper28);
        org.junit.Assert.assertNotNull(serializerProvider29);
        org.junit.Assert.assertNotNull(deserializerProvider36);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(objectMapper41);
        org.junit.Assert.assertNotNull(serializerProvider42);
        org.junit.Assert.assertNotNull(objectMapper46);
        org.junit.Assert.assertNotNull(deserializationConfig47);
        org.junit.Assert.assertNotNull(deserializationConfig50);
        org.junit.Assert.assertNotNull(objectMapper51);
        org.junit.Assert.assertNotNull(objectMapper52);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        com.metamx.druid.client.DataSegment.Builder builder5 = builder0.dimensions((java.util.List<java.lang.String>) strList3);
        com.metamx.druid.client.DataSegment.Builder builder7 = builder5.version("http://s3.amazonaws.com//?torrent");
        com.metamx.druid.shard.ShardSpec shardSpec8 = null;
        com.metamx.druid.client.DataSegment.Builder builder9 = builder5.shardSpec(shardSpec8);
        com.metamx.druid.client.DataSegment.Builder builder11 = builder5.version("[\"\", \"$http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\", \"null\"]");
        com.metamx.druid.client.DataSegment.Builder builder13 = builder5.dataSource("http://s3.amazonaws.com.s3.amazonaws.com/?torrent");
        com.metamx.druid.client.DataSegment.Builder builder15 = builder13.dataSource("");
        org.joda.time.Interval interval16 = null;
        com.metamx.druid.client.DataSegment.Builder builder17 = builder15.interval(interval16);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3);
        org.jets3t.service.security.ProviderCredentials providerCredentials5 = restS3Service4.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager6 = null;
        restS3Service4.setHttpConnectionManager(httpConnectionManager6);
        org.jets3t.service.Jets3tProperties jets3tProperties8 = restS3Service4.getJetS3tProperties();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "{\"\": \"s3.amazonaws.com\"}", credentialsProvider2, jets3tProperties8);
        java.lang.String str10 = restS3Service9.getDevPayUserToken();
        org.jets3t.service.security.ProviderCredentials providerCredentials13 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials13);
        org.jets3t.service.security.ProviderCredentials providerCredentials15 = restS3Service14.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager16 = null;
        restS3Service14.setHttpConnectionManager(httpConnectionManager16);
        java.lang.String str18 = restS3Service14.getEndpoint();
        java.lang.String str21 = restS3Service14.createTorrentUrl("", "");
        java.lang.String str22 = restS3Service14.getRestMetadataPrefix();
        java.util.Date date23 = restS3Service14.getCurrentTimeWithOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = restS3Service9.createSignedDeleteUrl("<form action=\"https://http://s3.amazonaws.com//hi%21?torrent.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>", "[\"content-length-range\", -226, -226]", date23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials5);
        org.junit.Assert.assertNotNull(jets3tProperties8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(providerCredentials15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "s3.amazonaws.com" + "'", str18, "s3.amazonaws.com");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://s3.amazonaws.com//?torrent" + "'", str21, "http://s3.amazonaws.com//?torrent");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "x-amz-meta-" + "'", str22, "x-amz-meta-");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Thu Nov 04 08:20:49 BRT 2021");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.io.File file1 = new java.io.File("{\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}");
        java.nio.file.Path path2 = file1.toPath();
        java.io.File file4 = new java.io.File(file1, "hi!/http:/s3.amazonaws.com");
        java.io.File file6 = new java.io.File(file1, ":");
        org.junit.Assert.assertEquals(file1.getParent(), "{\"http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent");
        org.junit.Assert.assertEquals(file1.toString(), "{\"http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}");
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertEquals(file4.getParent(), "{\"http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}/hi!/http:");
        org.junit.Assert.assertEquals(file4.toString(), "{\"http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}/hi!/http:/s3.amazonaws.com");
        org.junit.Assert.assertEquals(file6.getParent(), "{\"http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}");
        org.junit.Assert.assertEquals(file6.toString(), "{\"http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}/:");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider5 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider8 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials9 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider11 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials12 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials12);
        org.jets3t.service.security.ProviderCredentials providerCredentials14 = restS3Service13.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager15 = null;
        restS3Service13.setHttpConnectionManager(httpConnectionManager15);
        org.jets3t.service.Jets3tProperties jets3tProperties17 = restS3Service13.getJetS3tProperties();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials9, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent", credentialsProvider11, jets3tProperties17);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration19 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials6, "http://s3.amazonaws.com//hi%21?torrent", credentialsProvider8, jets3tProperties17, hostConfiguration19);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3, "{\"\": \"s3.amazonaws.com\"}/hi!", credentialsProvider5, jets3tProperties17);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service22 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/[\"content-length-range\", 58, 1]/null", credentialsProvider2, jets3tProperties17);
        org.junit.Assert.assertNull(providerCredentials14);
        org.junit.Assert.assertNotNull(jets3tProperties17);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.io.File file2 = new java.io.File("[\"starts-with\", \"$<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]", "{\"{\"\": \"s3.amazonaws.com\"}\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}");
        org.junit.Assert.assertEquals(file2.getParent(), "[\"starts-with\", \"$<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]/{\"{\"\": \"s3.amazonaws.com\"}\": \"http:/s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A/.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C");
        org.junit.Assert.assertEquals(file2.toString(), "[\"starts-with\", \"$<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]/{\"{\"\": \"s3.amazonaws.com\"}\": \"http:/s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A/.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider5 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider8 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials9 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider11 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials12 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials12);
        org.jets3t.service.security.ProviderCredentials providerCredentials14 = restS3Service13.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager15 = null;
        restS3Service13.setHttpConnectionManager(httpConnectionManager15);
        org.jets3t.service.Jets3tProperties jets3tProperties17 = restS3Service13.getJetS3tProperties();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials9, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent", credentialsProvider11, jets3tProperties17);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration19 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials6, "[\"starts-with\", \"$<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]", credentialsProvider8, jets3tProperties17, hostConfiguration19);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3, "{\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}", credentialsProvider5, jets3tProperties17);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service22 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "", credentialsProvider2, jets3tProperties17);
        org.junit.Assert.assertNull(providerCredentials14);
        org.junit.Assert.assertNotNull(jets3tProperties17);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.joda.time.Interval interval1 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3);
        org.jets3t.service.security.ProviderCredentials providerCredentials5 = restS3Service4.getProviderCredentials();
        java.lang.String str6 = restS3Service4.getInvokingApplicationDescription();
        java.lang.String str9 = restS3Service4.createTorrentUrl("http://s3.amazonaws.com//?torrent", "hi!");
        org.jets3t.service.security.ProviderCredentials providerCredentials10 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials10);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = restS3Service11.renameMetadataKeys(strMap12);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = restS3Service4.renameMetadataKeys(strMap13);
        com.metamx.druid.client.DataSegment.Builder builder15 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        com.metamx.druid.client.DataSegment.Builder builder20 = builder15.dimensions((java.util.List<java.lang.String>) strList18);
        com.metamx.druid.client.DataSegment.Builder builder22 = builder20.version("http://s3.amazonaws.com//?torrent");
        com.metamx.druid.shard.ShardSpec shardSpec23 = null;
        com.metamx.druid.client.DataSegment.Builder builder24 = builder20.shardSpec(shardSpec23);
        com.metamx.druid.client.DataSegment.Builder builder26 = builder20.version("[\"\", \"$http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\", \"null\"]");
        com.metamx.druid.client.DataSegment.Builder builder27 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        com.metamx.druid.client.DataSegment.Builder builder32 = builder27.dimensions((java.util.List<java.lang.String>) strList30);
        com.metamx.druid.client.DataSegment.Builder builder34 = builder32.version("http://s3.amazonaws.com//?torrent");
        com.metamx.druid.client.DataSegment.Builder builder36 = builder34.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder37 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        com.metamx.druid.client.DataSegment.Builder builder42 = builder37.dimensions((java.util.List<java.lang.String>) strList40);
        com.metamx.druid.client.DataSegment.Builder builder43 = builder36.metrics((java.util.List<java.lang.String>) strList40);
        com.metamx.druid.client.DataSegment.Builder builder44 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        com.metamx.druid.client.DataSegment.Builder builder49 = builder44.dimensions((java.util.List<java.lang.String>) strList47);
        com.metamx.druid.client.DataSegment.Builder builder50 = builder43.metrics((java.util.List<java.lang.String>) strList47);
        com.metamx.druid.client.DataSegment.Builder builder51 = builder20.metrics((java.util.List<java.lang.String>) strList47);
        com.metamx.druid.client.DataSegment.Builder builder52 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        com.metamx.druid.client.DataSegment.Builder builder57 = builder52.dimensions((java.util.List<java.lang.String>) strList55);
        com.metamx.druid.client.DataSegment.Builder builder59 = builder57.version("http://s3.amazonaws.com//?torrent");
        com.metamx.druid.client.DataSegment.Builder builder61 = builder59.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder62 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        com.metamx.druid.client.DataSegment.Builder builder67 = builder62.dimensions((java.util.List<java.lang.String>) strList65);
        com.metamx.druid.client.DataSegment.Builder builder68 = builder61.metrics((java.util.List<java.lang.String>) strList65);
        com.metamx.druid.client.DataSegment.Builder builder69 = builder20.dimensions((java.util.List<java.lang.String>) strList65);
        com.metamx.druid.client.DataSegment.Builder builder70 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder71 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        com.metamx.druid.client.DataSegment.Builder builder76 = builder71.dimensions((java.util.List<java.lang.String>) strList74);
        com.metamx.druid.client.DataSegment.Builder builder78 = builder76.version("http://s3.amazonaws.com//?torrent");
        com.metamx.druid.client.DataSegment.Builder builder80 = builder78.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder81 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray83 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        com.metamx.druid.client.DataSegment.Builder builder86 = builder81.dimensions((java.util.List<java.lang.String>) strList84);
        com.metamx.druid.client.DataSegment.Builder builder87 = builder80.metrics((java.util.List<java.lang.String>) strList84);
        com.metamx.druid.client.DataSegment.Builder builder88 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray90 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList91 = new java.util.ArrayList<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList91, strArray90);
        com.metamx.druid.client.DataSegment.Builder builder93 = builder88.dimensions((java.util.List<java.lang.String>) strList91);
        com.metamx.druid.client.DataSegment.Builder builder94 = builder87.metrics((java.util.List<java.lang.String>) strList91);
        com.metamx.druid.client.DataSegment.Builder builder95 = builder70.metrics((java.util.List<java.lang.String>) strList91);
        com.metamx.druid.shard.ShardSpec shardSpec96 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment98 = new com.metamx.druid.client.DataSegment("[\"starts-with\", \"$[\"starts-with\", \"$/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\", \"\"]\", \"\"]", interval1, "http:/s3.amazonaws.com/hi%21?torrent", strMap13, (java.util.List<java.lang.String>) strList65, (java.util.List<java.lang.String>) strList91, shardSpec96, (long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent" + "'", str9, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(builder95);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = restS3Service1.renameMetadataKeys(strMap2);
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager4 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager4);
        org.jets3t.service.security.ProviderCredentials providerCredentials8 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials8);
        org.jets3t.service.security.ProviderCredentials providerCredentials10 = restS3Service9.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager11 = null;
        restS3Service9.setHttpConnectionManager(httpConnectionManager11);
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager13 = null;
        restS3Service9.setHttpConnectionManager(httpConnectionManager13);
        java.lang.String str17 = restS3Service9.createTorrentUrl("", "hi!");
        boolean boolean19 = restS3Service9.isBucketAccessible("s3.amazonaws.com");
        java.util.Date date20 = restS3Service9.getCurrentTimeWithOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = restS3Service1.createSignedHeadUrl("{\":\": \",{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"},[\"starts-with\", \"$/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\", \"\"],http://s3.amazonaws.com.s3.amazonaws.com/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent\"}", "{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}", date20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(providerCredentials10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://s3.amazonaws.com//hi%21?torrent" + "'", str17, "http://s3.amazonaws.com//hi%21?torrent");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Thu Nov 04 08:20:49 BRT 2021");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "http://s3.amazonaws.com.s3.amazonaws.com/?torrent", credentialsProvider2);
        restS3Service3.shutdown();
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "{\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}", credentialsProvider2);
        org.jets3t.service.security.ProviderCredentials providerCredentials4 = restS3Service3.getAWSCredentials();
        org.jets3t.service.model.S3Bucket s3Bucket5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.S3Object[] s3ObjectArray6 = restS3Service3.listObjects(s3Bucket5);
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: The action listObjects cannot be performed with an invalid bucket: null");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials4);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = restS3Service1.renameMetadataKeys(strMap2);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = objectMapper5.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = objectMapper5.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider8 = objectMapper5.getSerializerProvider();
        java.text.DateFormat dateFormat9 = null;
        objectMapper5.setDateFormat(dateFormat9);
        org.codehaus.jackson.map.ObjectMapper.DefaultTyping defaultTyping11 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = objectMapper5.enableDefaultTyping(defaultTyping11);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher13 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig4, objectMapper12);
        org.jets3t.service.model.S3Bucket s3Bucket15 = null;
        java.util.Calendar calendar17 = null;
        java.util.Calendar calendar18 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "{\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-\": \"\"}", "[\"\", \"$[\"[\"content-length-range\", 10, 47]\", \"${\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}\", \"[\"starts-with\", \"$[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}\", \"[\"content-length-range\", 58, 1]\"]\", \"\"]\"]\", \"hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\"]" };
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.lang.String str25 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("", strArray24);
        java.lang.String str26 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]", strArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.S3Object s3Object27 = restS3Service1.getVersionedObjectDetails("<form action=\"https://http://s3.amazonaws.com//hi%21?torrent.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>", s3Bucket15, "[\"[\"starts-with\", \"$[\"starts-with\", \"$/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\", \"\"]\", \"\"]\", \"$http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent\", \"[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]\"]", calendar17, calendar18, strArray21, strArray24);
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: The action Get Versioned Object Details cannot be performed with an invalid bucket: null");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(serializerProvider8);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{\"\": \"\"}" + "'", str25, "{\"\": \"\"}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{\"[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]\": \"\"}" + "'", str26, "{\"[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]\": \"\"}");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.io.File file1 = new java.io.File("hi!");
        java.io.File file3 = new java.io.File(file1, "");
        boolean boolean5 = file1.setWritable(false);
        java.io.File file7 = new java.io.File(file1, "{\"\": \"s3.amazonaws.com\"}/hi!");
        boolean boolean8 = file7.canExecute();
        boolean boolean10 = file7.setLastModified((long) '4');
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "hi!");
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!/{\"\": \"s3.amazonaws.com\"}");
        org.junit.Assert.assertEquals(file7.toString(), "hi!/{\"\": \"s3.amazonaws.com\"}/hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper1 = objectMapper0.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = objectMapper2.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = objectMapper2.disableDefaultTyping();
        java.io.File file6 = new java.io.File("hi!");
        java.io.File file8 = new java.io.File(file6, "");
        java.lang.Class<?> wildcardClass9 = file6.getClass();
        org.codehaus.jackson.type.JavaType javaType10 = objectMapper4.constructType((java.lang.reflect.Type) wildcardClass9);
        com.metamx.emitter.EmittingLogger emittingLogger11 = new com.metamx.emitter.EmittingLogger((java.lang.Class) wildcardClass9);
        org.codehaus.jackson.type.JavaType javaType12 = objectMapper0.constructType((java.lang.reflect.Type) wildcardClass9);
        org.codehaus.jackson.map.ObjectWriter objectWriter13 = objectMapper0.writer();
        org.junit.Assert.assertNotNull(objectMapper1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(objectWriter13);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.size(0L);
        com.metamx.druid.client.DataSegment.Builder builder3 = com.metamx.druid.client.DataSegment.builder();
        org.jets3t.service.security.ProviderCredentials providerCredentials4 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials4);
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = restS3Service5.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager7 = null;
        restS3Service5.setHttpConnectionManager(httpConnectionManager7);
        java.util.List<java.lang.String> strList9 = restS3Service5.getResourceParameterNames();
        com.metamx.druid.client.DataSegment.Builder builder10 = builder3.dimensions(strList9);
        com.metamx.druid.client.DataSegment.Builder builder11 = builder2.dimensions(strList9);
        com.metamx.druid.client.DataSegment.Builder builder13 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        com.metamx.druid.client.DataSegment.Builder builder18 = builder13.dimensions((java.util.List<java.lang.String>) strList16);
        java.lang.String str19 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("[\"starts-with\", \"$<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]", (java.util.List<java.lang.String>) strList16);
        com.metamx.druid.client.DataSegment.Builder builder20 = builder11.dimensions((java.util.List<java.lang.String>) strList16);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(providerCredentials6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\"[\"starts-with\", \"$<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]\": \"\"}" + "'", str19, "{\"[\"starts-with\", \"$<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]\": \"\"}");
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.io.File file2 = new java.io.File("http://s3.amazonaws.com//?torrent", "[\"starts-with\", \"$[\"starts-with\", \"$/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\", \"\"]\", \"\"]");
        boolean boolean3 = file2.mkdir();
        org.junit.Assert.assertEquals(file2.getParent(), "http:/s3.amazonaws.com/?torrent/[\"starts-with\", \"$[\"starts-with\", \"$/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4");
        org.junit.Assert.assertEquals(file2.toString(), "http:/s3.amazonaws.com/?torrent/[\"starts-with\", \"$[\"starts-with\", \"$/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\", \"\"]\", \"\"]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        boolean boolean4 = restS3Service1.isBucketAccessible("");
        java.lang.String str5 = restS3Service1.getRestMetadataPrefix();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.JsonFactory jsonFactory7 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider8 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider9 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig10 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig11 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory7, serializerProvider8, deserializerProvider9, serializationConfig10, deserializationConfig11);
        org.codehaus.jackson.map.ObjectWriter objectWriter13 = objectMapper12.defaultPrettyPrintingWriter();
        org.codehaus.jackson.map.ser.FilterProvider filterProvider14 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter15 = objectMapper12.writer(filterProvider14);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher16 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig6, objectMapper12);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = objectMapper18.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = objectMapper18.disableDefaultTyping();
        java.lang.Object obj21 = null;
        java.lang.String str22 = objectMapper18.writeValueAsString(obj21);
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider23 = objectMapper18.getDeserializerProvider();
        org.codehaus.jackson.JsonFactory jsonFactory24 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper25 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper26 = objectMapper25.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper27 = objectMapper25.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider28 = objectMapper25.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider29 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper30 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory24, serializerProvider28, deserializerProvider29);
        org.codehaus.jackson.map.ObjectMapper objectMapper31 = objectMapper18.setSerializerProvider(serializerProvider28);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher32 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig17, objectMapper18);
        java.lang.String str33 = restS3Service1.getDevPayUserToken();
        org.jets3t.service.model.S3Bucket s3Bucket34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.acl.AccessControlList accessControlList35 = restS3Service1.getBucketAcl(s3Bucket34);
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: The action Get Bucket Access Control List cannot be performed with an invalid bucket: null");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "x-amz-meta-" + "'", str5, "x-amz-meta-");
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertNotNull(deserializerProvider23);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(serializerProvider28);
        org.junit.Assert.assertNotNull(objectMapper31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "[\"content-length-range\", 100, 4]", credentialsProvider2);
        java.lang.String str4 = restS3Service3.getRestMetadataPrefix();
        boolean boolean5 = restS3Service3.isHttpsOnly();
        org.jets3t.service.model.S3Object s3Object7 = null;
        // The following exception was thrown during execution in test generation
        try {
            restS3Service3.putObjectAcl("{\"\": \"s3.amazonaws.com\"}", s3Object7);
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: The action Put Object Access Control List cannot be performed with an invalid object: null");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-amz-meta-" + "'", str4, "x-amz-meta-");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        java.lang.String str2 = restS3Service1.getDevPayUserToken();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials4 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials4);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.JsonFactory jsonFactory7 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider11 = objectMapper8.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider12 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory7, serializerProvider11, deserializerProvider12);
        org.codehaus.jackson.map.SerializerFactory serializerFactory14 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = objectMapper13.setSerializerFactory(serializerFactory14);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher16 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service5, s3SegmentPusherConfig6, objectMapper13);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher17 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig3, objectMapper13);
        int int18 = restS3Service1.getInternalErrorRetryMax();
        java.util.List<java.lang.String> strList19 = restS3Service1.getResourceParameterNames();
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.S3Object[] s3ObjectArray21 = restS3Service1.listObjects("http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: S3 Error Message.");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializerProvider11);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        org.codehaus.jackson.JsonFactory jsonFactory3 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = objectMapper4.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = objectMapper4.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider7 = objectMapper4.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider8 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory3, serializerProvider7, deserializerProvider8);
        org.codehaus.jackson.map.SerializerFactory serializerFactory10 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = objectMapper9.setSerializerFactory(serializerFactory10);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher12 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig2, objectMapper9);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = objectMapper14.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = objectMapper14.disableDefaultTyping();
        org.codehaus.jackson.map.SerializationConfig.Feature[] featureArray17 = new org.codehaus.jackson.map.SerializationConfig.Feature[] {};
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = objectMapper14.enable(featureArray17);
        org.codehaus.jackson.map.ser.FilterProvider filterProvider19 = null;
        objectMapper18.setFilters(filterProvider19);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher21 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig13, objectMapper18);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig22 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper23 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper24 = objectMapper23.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper25 = objectMapper23.disableDefaultTyping();
        java.lang.Object obj26 = null;
        java.lang.String str27 = objectMapper23.writeValueAsString(obj26);
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider28 = objectMapper23.getDeserializerProvider();
        org.codehaus.jackson.JsonFactory jsonFactory29 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper30 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper31 = objectMapper30.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper32 = objectMapper30.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider33 = objectMapper30.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider34 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper35 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory29, serializerProvider33, deserializerProvider34);
        org.codehaus.jackson.map.ObjectMapper objectMapper36 = objectMapper23.setSerializerProvider(serializerProvider33);
        org.codehaus.jackson.JsonFactory jsonFactory37 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider38 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider39 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig40 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig41 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper42 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory37, serializerProvider38, deserializerProvider39, serializationConfig40, deserializationConfig41);
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider43 = objectMapper42.getDeserializerProvider();
        org.codehaus.jackson.map.ObjectMapper objectMapper44 = objectMapper36.setDeserializerProvider(deserializerProvider43);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher45 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig22, objectMapper36);
        org.codehaus.jackson.map.ObjectMapper objectMapper46 = s3SegmentPusher45.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper47 = s3SegmentPusher45.jsonMapper;
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(serializerProvider7);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(featureArray17);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(objectMapper24);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "null" + "'", str27, "null");
        org.junit.Assert.assertNotNull(deserializerProvider28);
        org.junit.Assert.assertNotNull(objectMapper31);
        org.junit.Assert.assertNotNull(objectMapper32);
        org.junit.Assert.assertNotNull(serializerProvider33);
        org.junit.Assert.assertNotNull(objectMapper36);
        org.junit.Assert.assertNotNull(deserializerProvider43);
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertNotNull(objectMapper46);
        org.junit.Assert.assertNotNull(objectMapper47);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider5 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials6);
        org.jets3t.service.security.ProviderCredentials providerCredentials8 = restS3Service7.getProviderCredentials();
        boolean boolean10 = restS3Service7.isBucketAccessible("");
        java.lang.String str11 = restS3Service7.getRestMetadataPrefix();
        boolean boolean12 = restS3Service7.isRequesterPaysEnabled();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager13 = restS3Service7.getHttpConnectionManager();
        org.jets3t.service.Jets3tProperties jets3tProperties14 = restS3Service7.getJetS3tProperties();
        org.apache.commons.httpclient.HostConfiguration hostConfiguration15 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent", credentialsProvider5, jets3tProperties14, hostConfiguration15);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "[\"content-length-range\", 100, 4]", credentialsProvider2, jets3tProperties14);
        // The following exception was thrown during execution in test generation
        try {
            restS3Service17.deleteVersionedObjectWithMFA("hi!", "[\"content-length-range\", 58, 1]", "s3.amazonaws.com", "[\"starts-with\", \"$s3.amazonaws.com\", \"\"]", "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid uri 'https://s3.amazonaws.com:443/[\"starts-with\", \"$s3.amazonaws.com\", \"\"]/http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent?versionId=hi%21': escaped absolute path not valid");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "x-amz-meta-" + "'", str11, "x-amz-meta-");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(httpConnectionManager13);
        org.junit.Assert.assertNotNull(jets3tProperties14);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.codehaus.jackson.JsonFactory jsonFactory0 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider1 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider2 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig3 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig4 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory0, serializerProvider1, deserializerProvider2, serializationConfig3, deserializationConfig4);
        org.codehaus.jackson.map.ObjectWriter objectWriter6 = objectMapper5.defaultPrettyPrintingWriter();
        org.codehaus.jackson.PrettyPrinter prettyPrinter7 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter8 = objectMapper5.writer(prettyPrinter7);
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = objectMapper11.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = objectMapper13.disableDefaultTyping();
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory15 = objectMapper13.getNodeFactory();
        org.codehaus.jackson.map.ObjectReader objectReader16 = objectMapper11.reader(jsonNodeFactory15);
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = objectMapper17.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = objectMapper17.disableDefaultTyping();
        org.codehaus.jackson.map.SerializationConfig.Feature[] featureArray20 = new org.codehaus.jackson.map.SerializationConfig.Feature[] {};
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = objectMapper17.enable(featureArray20);
        org.codehaus.jackson.map.ObjectMapper objectMapper22 = objectMapper11.enable(featureArray20);
        org.codehaus.jackson.map.ObjectMapper objectMapper23 = objectMapper9.enable(featureArray20);
        org.codehaus.jackson.map.ObjectMapper objectMapper24 = objectMapper5.disable(featureArray20);
        org.codehaus.jackson.map.ser.FilterProvider filterProvider25 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter26 = objectMapper5.writer(filterProvider25);
        org.codehaus.jackson.JsonFactory jsonFactory27 = objectMapper5.getJsonFactory();
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig28 = objectMapper5.copyDeserializationConfig();
        org.junit.Assert.assertNotNull(objectWriter6);
        org.junit.Assert.assertNotNull(objectWriter8);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(jsonNodeFactory15);
        org.junit.Assert.assertNotNull(objectReader16);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(featureArray20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(objectMapper24);
        org.junit.Assert.assertNotNull(objectWriter26);
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertNotNull(deserializationConfig28);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider5 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider8 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials9 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider11 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials12 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider14 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials15 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider17 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials18 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials18);
        org.jets3t.service.security.ProviderCredentials providerCredentials20 = restS3Service19.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager21 = null;
        restS3Service19.setHttpConnectionManager(httpConnectionManager21);
        org.jets3t.service.Jets3tProperties jets3tProperties23 = restS3Service19.getJetS3tProperties();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service24 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials15, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent", credentialsProvider17, jets3tProperties23);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration25 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service26 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials12, "http://s3.amazonaws.com//hi%21?torrent", credentialsProvider14, jets3tProperties23, hostConfiguration25);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration27 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service28 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials9, "{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}", credentialsProvider11, jets3tProperties23, hostConfiguration27);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration29 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service30 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials6, "[\"starts-with\", \"$[\"starts-with\", \"$/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\", \"\"]\", \"\"]", credentialsProvider8, jets3tProperties23, hostConfiguration29);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration31 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service32 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3, "[\"[\"\", \"$http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\", \"null\"]\", \"$http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\", \"[\"content-length-range\", 100, 4]\"]", credentialsProvider5, jets3tProperties23, hostConfiguration31);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service33 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "<form action=\"https://<form action=\"https://{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"x-amz-\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"[\"content-length-range\", 100, 4]\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>", credentialsProvider2, jets3tProperties23);
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider34 = restS3Service33.getCredentialsProvider();
        org.junit.Assert.assertNull(providerCredentials20);
        org.junit.Assert.assertNotNull(jets3tProperties23);
        org.junit.Assert.assertNull(credentialsProvider34);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        com.metamx.druid.client.DataSegment.Builder builder5 = builder0.dimensions((java.util.List<java.lang.String>) strList3);
        com.metamx.druid.client.DataSegment.Builder builder7 = builder5.version("http://s3.amazonaws.com//?torrent");
        com.metamx.druid.client.DataSegment.Builder builder9 = builder7.size((-1L));
        com.metamx.druid.client.DataSegment.Builder builder10 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        com.metamx.druid.client.DataSegment.Builder builder15 = builder10.dimensions((java.util.List<java.lang.String>) strList13);
        com.metamx.druid.client.DataSegment.Builder builder16 = builder7.metrics((java.util.List<java.lang.String>) strList13);
        org.joda.time.Interval interval17 = null;
        com.metamx.druid.client.DataSegment.Builder builder18 = builder7.interval(interval17);
        com.metamx.druid.client.DataSegment.Builder builder20 = builder18.dataSource("[\"content-length-range\", 58, 1]");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager3 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager3);
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager5 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager5);
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager7 = restS3Service1.getHttpConnectionManager();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        org.codehaus.jackson.JsonFactory jsonFactory9 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider10 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider11 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig12 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig13 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory9, serializerProvider10, deserializerProvider11, serializationConfig12, deserializationConfig13);
        org.codehaus.jackson.map.SerializationConfig serializationConfig15 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = objectMapper14.setSerializationConfig(serializationConfig15);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher17 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig8, objectMapper14);
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = s3SegmentPusher17.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.AnnotationIntrospector annotationIntrospector20 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = objectMapper19.setAnnotationIntrospector(annotationIntrospector20);
        org.codehaus.jackson.map.HandlerInstantiator handlerInstantiator22 = null;
        objectMapper19.setHandlerInstantiator(handlerInstantiator22);
        s3SegmentPusher17.jsonMapper = objectMapper19;
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertNull(httpConnectionManager7);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(objectMapper21);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager3 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager3);
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager5 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager5);
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager7 = restS3Service1.getHttpConnectionManager();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        org.codehaus.jackson.JsonFactory jsonFactory9 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider10 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider11 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig12 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig13 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory9, serializerProvider10, deserializerProvider11, serializationConfig12, deserializationConfig13);
        org.codehaus.jackson.map.SerializationConfig serializationConfig15 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = objectMapper14.setSerializationConfig(serializationConfig15);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher17 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig8, objectMapper14);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = s3SegmentPusher17.s3Client;
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertNull(httpConnectionManager7);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(restS3Service18);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "{\"\": \"s3.amazonaws.com\"}/hi!", credentialsProvider2);
        org.jets3t.service.security.ProviderCredentials providerCredentials4 = restS3Service3.getProviderCredentials();
        org.junit.Assert.assertNull(providerCredentials4);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        java.lang.String str2 = restS3Service1.getDevPayUserToken();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials4 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials4);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.JsonFactory jsonFactory7 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider11 = objectMapper8.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider12 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory7, serializerProvider11, deserializerProvider12);
        org.codehaus.jackson.map.SerializerFactory serializerFactory14 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = objectMapper13.setSerializerFactory(serializerFactory14);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher16 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service5, s3SegmentPusherConfig6, objectMapper13);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher17 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig3, objectMapper13);
        int int18 = restS3Service1.getInternalErrorRetryMax();
        java.lang.String str21 = restS3Service1.createTorrentUrl("http://s3.amazonaws.com//?torrent", "{\"{\"\": \"s3.amazonaws.com\"}\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}");
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider22 = restS3Service1.getCredentialsProvider();
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.S3Object s3Object26 = restS3Service1.getVersionedObjectDetails("{\"\": \"\"}", "[\"content-length-range\", 97, 100]", "[\"content-length-range\", 58, 1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid uri 'https://s3.amazonaws.com:443/[\"content-length-range\", 97, 100]/%5B%22content-length-range%22%2C%2058%2C%201%5D?versionId=%7B%22%22%3A%20%22%22%7D': escaped absolute path not valid");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializerProvider11);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/%7B%22%7B%22%22%3A%20%22s3.amazonaws.com%22%7D%22%3A%20%22http%3A//s3.amazonaws.com/%257B%2522http%253A%252F%252Fs3.amazonaws.com%252Fhttp%25253A%25252F%25252Fs3.amazonaws.com%25252F%25252F%25253Ftorrent%252Fhi%252521%253Ftorrent%2522%253A%2520%2522x-amz-meta-%2522%257D/%253Cform%2520action%253D%2522https%253A//.s3.amazonaws.com/%2522%2520method%253D%2522post%2522%2520enctype%253D%2522multipart/form-data%2522%253E%250A%253Cinput%2520type%253D%2522hidden%2522%2520name%253D%2522key%2522%2520value%253D%2522hi%2521%2522%253E%250A%253Cinput%2520name%253D%2522file%2522%2520type%253D%2522file%2522%253E%250A%253Cbr%253E%250A%253Cinput%2520type%253D%2522submit%2522%2520value%253D%2522Upload%2520to%2520Amazon%2520S3%2522%253E%250A%253C/form%253E%3Ftorrent%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%201%2C%200%5D%22%7D?torrent" + "'", str21, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/%7B%22%7B%22%22%3A%20%22s3.amazonaws.com%22%7D%22%3A%20%22http%3A//s3.amazonaws.com/%257B%2522http%253A%252F%252Fs3.amazonaws.com%252Fhttp%25253A%25252F%25252Fs3.amazonaws.com%25252F%25252F%25253Ftorrent%252Fhi%252521%253Ftorrent%2522%253A%2520%2522x-amz-meta-%2522%257D/%253Cform%2520action%253D%2522https%253A//.s3.amazonaws.com/%2522%2520method%253D%2522post%2522%2520enctype%253D%2522multipart/form-data%2522%253E%250A%253Cinput%2520type%253D%2522hidden%2522%2520name%253D%2522key%2522%2520value%253D%2522hi%2521%2522%253E%250A%253Cinput%2520name%253D%2522file%2522%2520type%253D%2522file%2522%253E%250A%253Cbr%253E%250A%253Cinput%2520type%253D%2522submit%2522%2520value%253D%2522Upload%2520to%2520Amazon%2520S3%2522%253E%250A%253C/form%253E%3Ftorrent%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%201%2C%200%5D%22%7D?torrent");
        org.junit.Assert.assertNull(credentialsProvider22);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider5 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials6);
        org.jets3t.service.security.ProviderCredentials providerCredentials8 = restS3Service7.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager9 = null;
        restS3Service7.setHttpConnectionManager(httpConnectionManager9);
        org.jets3t.service.Jets3tProperties jets3tProperties11 = restS3Service7.getJetS3tProperties();
        org.apache.commons.httpclient.HostConfiguration hostConfiguration12 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3, "", credentialsProvider5, jets3tProperties11, hostConfiguration12);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "http://s3.amazonaws.com//hi%21?torrent", credentialsProvider2, jets3tProperties11);
        org.jets3t.service.security.ProviderCredentials providerCredentials15 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider17 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials15, "null", credentialsProvider17);
        org.jets3t.service.security.ProviderCredentials providerCredentials19 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials19);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = restS3Service20.renameMetadataKeys(strMap21);
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = restS3Service18.renameMetadataKeys(strMap21);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = restS3Service14.renameMetadataKeys(strMap23);
        org.jets3t.service.model.MultipartUpload multipartUpload25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.MultipartCompleted multipartCompleted26 = restS3Service14.multipartCompleteUpload(multipartUpload25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials8);
        org.junit.Assert.assertNotNull(jets3tProperties11);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3);
        org.jets3t.service.security.ProviderCredentials providerCredentials5 = restS3Service4.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager6 = null;
        restS3Service4.setHttpConnectionManager(httpConnectionManager6);
        org.jets3t.service.Jets3tProperties jets3tProperties8 = restS3Service4.getJetS3tProperties();
        org.apache.commons.httpclient.HostConfiguration hostConfiguration9 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "", credentialsProvider2, jets3tProperties8, hostConfiguration9);
        java.lang.String str13 = restS3Service10.createTorrentUrl("<form action=\"https://{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"x-amz-\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>", "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent");
        // The following exception was thrown during execution in test generation
        try {
            restS3Service10.deleteVersionedObjectWithMFA("[\"content-length-range\", -226, -226]", "<form action=\"https://{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"x-amz-\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>", "[\"content-length-range\", 1, 0]", "[\"[\"\", \"$http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\", \"null\"]\", \"$http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\", \"[\"content-length-range\", 100, 4]\"]", "[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid uri 'https://s3.amazonaws.com:443/[\"[\"\", \"$http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\", \"null\"]\", \"$http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\", \"[\"content-length-range\", 100, 4]\"]/%5B%22starts-with%22%2C%20%22%24http%3A%2F%2Fs3.amazonaws.com.s3.amazonaws.com%2F%3Ftorrent%22%2C%20%22%22%5D&versionId=%5B%22content-length-range%22%2C%20-226%2C%20-226%5D': escaped absolute path not valid");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials5);
        org.junit.Assert.assertNotNull(jets3tProperties8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://s3.amazonaws.com/%3Cform%20action%3D%22https%3A%2F%2F%7B%22http%3A%2F%2Fs3.amazonaws.com%2F%2Fhi%2521%3Ftorrent%22%3A%20%22%22%7D.s3.amazonaws.com%2F%22%20method%3D%22post%22%20enctype%3D%22multipart%2Fform-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22x-amz-%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C%2Fform%3E/http%3A//s3.amazonaws.com/http%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent/hi%2521%3Ftorrent?torrent" + "'", str13, "http://s3.amazonaws.com/%3Cform%20action%3D%22https%3A%2F%2F%7B%22http%3A%2F%2Fs3.amazonaws.com%2F%2Fhi%2521%3Ftorrent%22%3A%20%22%22%7D.s3.amazonaws.com%2F%22%20method%3D%22post%22%20enctype%3D%22multipart%2Fform-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22x-amz-%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C%2Fform%3E/http%3A//s3.amazonaws.com/http%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent/hi%2521%3Ftorrent?torrent");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        org.apache.commons.httpclient.HttpClient httpClient3 = restS3Service1.getHttpClient();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.node.ObjectNode objectNode6 = objectMapper5.createObjectNode();
        org.codehaus.jackson.FormatSchema formatSchema7 = null;
        org.codehaus.jackson.map.ObjectReader objectReader8 = objectMapper5.schemaBasedReader(formatSchema7);
        byte[] byteArray10 = objectMapper5.writeValueAsBytes((java.lang.Object) 10L);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher11 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig4, objectMapper5);
        java.util.Calendar calendar15 = null;
        java.util.Calendar calendar16 = null;
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.lang.String str20 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("", strArray19);
        java.lang.String str21 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]", strArray19);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.lang.String str24 = org.jets3t.service.S3Service.generatePostPolicyCondition_Equality("", strArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.S3Object s3Object27 = restS3Service1.getVersionedObject("", "http://s3.amazonaws.com/%2F/x-amz-meta-?torrent", "hi!/http:/s3.amazonaws.com", calendar15, calendar16, strArray19, strArray23, (java.lang.Long) 129486479360L, (java.lang.Long) 129486516224L);
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: S3 Error Message.");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertNotNull(httpClient3);
        org.junit.Assert.assertNotNull(objectNode6);
        org.junit.Assert.assertNotNull(objectReader8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[49, 48]");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"\": \"\"}" + "'", str20, "{\"\": \"\"}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{\"[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]\": \"\"}" + "'", str21, "{\"[\"starts-with\", \"$http://s3.amazonaws.com.s3.amazonaws.com/?torrent\", \"\"]\": \"\"}");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{\"\": \"\"}" + "'", str24, "{\"\": \"\"}");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jets3t.service.security.ProviderCredentials providerCredentials4 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials4);
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = restS3Service5.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager7 = null;
        restS3Service5.setHttpConnectionManager(httpConnectionManager7);
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager9 = null;
        restS3Service5.setHttpConnectionManager(httpConnectionManager9);
        boolean boolean11 = restS3Service5.isRequesterPaysEnabled();
        com.metamx.druid.client.DataSegment.Builder builder12 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder14 = builder12.size(0L);
        org.joda.time.Interval interval15 = null;
        com.metamx.druid.client.DataSegment.Builder builder16 = builder14.interval(interval15);
        java.lang.String[] strArray20 = new java.lang.String[] { "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!", "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!", "http://s3.amazonaws.com//?torrent" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        com.metamx.druid.client.DataSegment.Builder builder23 = builder14.metrics((java.util.List<java.lang.String>) strList21);
        org.jets3t.service.security.ProviderCredentials providerCredentials24 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider26 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service27 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials24, "null", credentialsProvider26);
        org.jets3t.service.security.ProviderCredentials providerCredentials28 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service29 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials28);
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = restS3Service29.renameMetadataKeys(strMap30);
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = restS3Service27.renameMetadataKeys(strMap30);
        com.metamx.druid.client.DataSegment.Builder builder33 = builder14.loadSpec(strMap32);
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = restS3Service5.renameMetadataKeys(strMap32);
        org.jets3t.service.security.ProviderCredentials providerCredentials35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = org.jets3t.service.S3Service.createSignedUrl("{\"properties\":{},\"loaded\":false}", "{\"\": \"s3.amazonaws.com\"}", "{\"\": \"\"}", "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-/s3.amazonaws.com", strMap34, providerCredentials35, 129486479360L, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager3 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager3);
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager5 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager5);
        int int7 = restS3Service1.getInternalErrorRetryMax();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jets3t.service.model.MultipartUpload> multipartUploadList9 = restS3Service1.multipartListUploads("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The bucket name parameter must be specified when listing multipart uploads");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider5 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider8 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials9 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider11 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials12 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials12);
        org.jets3t.service.security.ProviderCredentials providerCredentials14 = restS3Service13.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager15 = null;
        restS3Service13.setHttpConnectionManager(httpConnectionManager15);
        org.jets3t.service.Jets3tProperties jets3tProperties17 = restS3Service13.getJetS3tProperties();
        org.apache.commons.httpclient.HostConfiguration hostConfiguration18 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials9, "", credentialsProvider11, jets3tProperties17, hostConfiguration18);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials6, "http://s3.amazonaws.com//hi%21?torrent", credentialsProvider8, jets3tProperties17);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration21 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service22 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3, ":", credentialsProvider5, jets3tProperties17, hostConfiguration21);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration23 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service24 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "[\"content-length-range\", -226, -226]", credentialsProvider2, jets3tProperties17, hostConfiguration23);
        org.jets3t.service.security.ProviderCredentials providerCredentials25 = restS3Service24.getProviderCredentials();
        org.junit.Assert.assertNull(providerCredentials14);
        org.junit.Assert.assertNotNull(jets3tProperties17);
        org.junit.Assert.assertNull(providerCredentials25);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        java.lang.String str3 = restS3Service1.getInvokingApplicationDescription();
        boolean boolean4 = restS3Service1.isShutdown();
        java.lang.String str5 = restS3Service1.getDevPayProductToken();
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.acl.AccessControlList accessControlList8 = restS3Service1.getObjectAcl("http://s3.amazonaws.com.s3.amazonaws.com/?torrent", "{\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.ServiceException; message: S3 Error Message.");
        } catch (org.jets3t.service.ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.io.File file1 = new java.io.File("{\"\": \"s3.amazonaws.com\"}");
        boolean boolean2 = file1.setReadOnly();
        java.io.File file4 = new java.io.File(file1, "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/http:/s3.amazonaws.com/?torrent/s3.amazonaws.com");
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "{\"\": \"s3.amazonaws.com\"}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals(file4.getParent(), "{\"\": \"s3.amazonaws.com\"}/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/http:/s3.amazonaws.com/?torrent");
        org.junit.Assert.assertEquals(file4.toString(), "{\"\": \"s3.amazonaws.com\"}/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/http:/s3.amazonaws.com/?torrent/s3.amazonaws.com");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        boolean boolean4 = restS3Service1.isBucketAccessible("");
        java.lang.String str5 = restS3Service1.getRestMetadataPrefix();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.JsonFactory jsonFactory7 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider8 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider9 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig10 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig11 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory7, serializerProvider8, deserializerProvider9, serializationConfig10, deserializationConfig11);
        org.codehaus.jackson.map.ObjectWriter objectWriter13 = objectMapper12.defaultPrettyPrintingWriter();
        org.codehaus.jackson.map.ser.FilterProvider filterProvider14 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter15 = objectMapper12.writer(filterProvider14);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher16 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig6, objectMapper12);
        org.jets3t.service.model.MultipartUpload multipartUpload17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jets3t.service.model.MultipartPart> multipartPartList18 = restS3Service1.multipartListParts(multipartUpload17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "x-amz-meta-" + "'", str5, "x-amz-meta-");
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertNotNull(objectWriter15);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        boolean boolean4 = restS3Service1.isBucketAccessible("");
        org.jets3t.service.security.ProviderCredentials providerCredentials5 = restS3Service1.getProviderCredentials();
        java.lang.String str8 = restS3Service1.createTorrentUrl("s3.amazonaws.com", "");
        boolean boolean9 = restS3Service1.isShutdown();
        java.util.Date date10 = restS3Service1.getCurrentTimeWithOffset();
        org.apache.commons.httpclient.HttpClient httpClient11 = restS3Service1.getHttpClient();
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(providerCredentials5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://s3.amazonaws.com.s3.amazonaws.com/?torrent" + "'", str8, "http://s3.amazonaws.com.s3.amazonaws.com/?torrent");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Thu Nov 04 08:20:53 BRT 2021");
        org.junit.Assert.assertNotNull(httpClient11);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.io.File file1 = new java.io.File("hi!");
        java.io.File file3 = new java.io.File(file1, "<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
        boolean boolean4 = file1.setReadOnly();
        java.lang.String str5 = file1.toString();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "hi!");
        org.junit.Assert.assertEquals(file3.getParent(), "hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n<");
        org.junit.Assert.assertEquals(file3.toString(), "hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper1 = objectMapper0.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = objectMapper0.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = objectMapper0.enableDefaultTyping();
        org.codehaus.jackson.FormatSchema formatSchema4 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter5 = objectMapper0.schemaBasedWriter(formatSchema4);
        org.junit.Assert.assertNotNull(objectMapper1);
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectWriter5);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.io.File file1 = new java.io.File("hi!");
        java.io.File file3 = new java.io.File(file1, "");
        java.lang.String str4 = file3.getName();
        java.io.File file6 = new java.io.File(file3, "[\"content-length-range\", 10, 47]");
        boolean boolean8 = file6.setExecutable(false);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "hi!");
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals(file6.getParent(), "hi!");
        org.junit.Assert.assertEquals(file6.toString(), "hi!/[\"content-length-range\", 10, 47]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager3 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager3);
        java.lang.String str5 = restS3Service1.getEndpoint();
        java.lang.String str6 = restS3Service1.getEndpoint();
        org.jets3t.service.security.ProviderCredentials providerCredentials11 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials11);
        org.jets3t.service.security.ProviderCredentials providerCredentials13 = restS3Service12.getProviderCredentials();
        java.lang.String str14 = restS3Service12.getInvokingApplicationDescription();
        java.lang.String str17 = restS3Service12.createTorrentUrl("http://s3.amazonaws.com//?torrent", "hi!");
        org.jets3t.service.security.ProviderCredentials providerCredentials18 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials18);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = restS3Service19.renameMetadataKeys(strMap20);
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = restS3Service12.renameMetadataKeys(strMap21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = restS3Service1.createSignedUrl("{\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-\": \"\"}", "[\"\", \"$[\"[\"content-length-range\", 10, 47]\", \"${\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}\", \"[\"starts-with\", \"$[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}\", \"[\"content-length-range\", 58, 1]\"]\", \"\"]\"]\", \"hi!/<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\"]", "http://s3.amazonaws.com/%5B%22starts-with%22%2C%20%22%24%2Fhome%2FCIN%2Flmps2%2Fsemantic-conflict-study%2FSMAT%2Foutput-test-dest%2Fdruid%2F05168808c278c080c59c19e858d9471b316cd1f5%2Frandoop-modified_4%2Fhi%21%22%2C%20%22%22%5D/http%3A//s3.amazonaws.com/%257B%2522http%253A%252F%252Fs3.amazonaws.com%252Fhttp%25253A%25252F%25252Fs3.amazonaws.com%25252F%25252F%25253Ftorrent%252Fhi%252521%253Ftorrent%2522%253A%2520%2522x-amz-meta-%2522%257D/%253Cform%2520action%253D%2522https%253A//.s3.amazonaws.com/%2522%2520method%253D%2522post%2522%2520enctype%253D%2522multipart/form-data%2522%253E%250A%253Cinput%2520type%253D%2522hidden%2522%2520name%253D%2522key%2522%2520value%253D%2522hi%2521%2522%253E%250A%253Cinput%2520name%253D%2522file%2522%2520type%253D%2522file%2522%253E%250A%253Cbr%253E%250A%253Cinput%2520type%253D%2522submit%2522%2520value%253D%2522Upload%2520to%2520Amazon%2520S3%2522%253E%250A%253C/form%253E%3Ftorrent?torrent", "<form action=\"https://<form action=\"https://{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"x-amz-\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"[\"content-length-range\", 100, 4]\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>", strMap21, (long) 0, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "s3.amazonaws.com" + "'", str5, "s3.amazonaws.com");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "s3.amazonaws.com" + "'", str6, "s3.amazonaws.com");
        org.junit.Assert.assertNull(providerCredentials13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent" + "'", str17, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager3 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager3);
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager5 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager5);
        java.lang.String str7 = restS3Service1.getRestMetadataPrefix();
        org.jets3t.service.model.S3Bucket s3Bucket9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.acl.AccessControlList accessControlList11 = restS3Service1.getVersionedObjectAcl("<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>", s3Bucket9, "[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}\", \"[\"content-length-range\", 58, 1]\"]");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: The action Get versioned Object Access Control List cannot be performed with an invalid bucket: null");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "x-amz-meta-" + "'", str7, "x-amz-meta-");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/%7B%22%7B%22%22%3A%20%22s3.amazonaws.com%22%7D%22%3A%20%22http%3A//s3.amazonaws.com/%257B%2522http%253A%252F%252Fs3.amazonaws.com%252Fhttp%25253A%25252F%25252Fs3.amazonaws.com%25252F%25252F%25253Ftorrent%252Fhi%252521%253Ftorrent%2522%253A%2520%2522x-amz-meta-%2522%257D/%253Cform%2520action%253D%2522https%253A//.s3.amazonaws.com/%2522%2520method%253D%2522post%2522%2520enctype%253D%2522multipart/form-data%2522%253E%250A%253Cinput%2520type%253D%2522hidden%2522%2520name%253D%2522key%2522%2520value%253D%2522hi%2521%2522%253E%250A%253Cinput%2520name%253D%2522file%2522%2520type%253D%2522file%2522%253E%250A%253Cbr%253E%250A%253Cinput%2520type%253D%2522submit%2522%2520value%253D%2522Upload%2520to%2520Amazon%2520S3%2522%253E%250A%253C/form%253E%3Ftorrent%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%201%2C%200%5D%22%7D?torrent", credentialsProvider2);
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.S3Bucket s3Bucket5 = restS3Service3.getBucket("http://s3.amazonaws.com.s3.amazonaws.com/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: The requested action cannot be performed with a non-authenticated service: Get Bucket");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.metamx.emitter.EmittingLogger emittingLogger1 = new com.metamx.emitter.EmittingLogger("[\"content-length-range\", 1, 0]");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.io.File file2 = new java.io.File("[\"starts-with\", \"$s3.amazonaws.com\", \"\"]", "http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent");
        org.junit.Assert.assertEquals(file2.getParent(), "[\"starts-with\", \"$s3.amazonaws.com\", \"\"]/http:/s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A/.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C");
        org.junit.Assert.assertEquals(file2.toString(), "[\"starts-with\", \"$s3.amazonaws.com\", \"\"]/http:/s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A/.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider5 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider8 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials9 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider11 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials12 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials12);
        org.jets3t.service.security.ProviderCredentials providerCredentials14 = restS3Service13.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager15 = null;
        restS3Service13.setHttpConnectionManager(httpConnectionManager15);
        org.jets3t.service.Jets3tProperties jets3tProperties17 = restS3Service13.getJetS3tProperties();
        org.apache.commons.httpclient.HostConfiguration hostConfiguration18 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials9, "", credentialsProvider11, jets3tProperties17, hostConfiguration18);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials6, "{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}", credentialsProvider8, jets3tProperties17);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3, "{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}", credentialsProvider5, jets3tProperties17);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service22 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "[\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-\", \"$<form action=\"https://http://s3.amazonaws.com//hi%21?torrent.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"[\"content-length-range\", 58, 1]\"]", credentialsProvider2, jets3tProperties17);
        org.junit.Assert.assertNull(providerCredentials14);
        org.junit.Assert.assertNotNull(jets3tProperties17);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        java.lang.String str2 = restS3Service1.getDevPayUserToken();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials4 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials4);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.JsonFactory jsonFactory7 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider11 = objectMapper8.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider12 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory7, serializerProvider11, deserializerProvider12);
        org.codehaus.jackson.map.SerializerFactory serializerFactory14 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = objectMapper13.setSerializerFactory(serializerFactory14);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher16 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service5, s3SegmentPusherConfig6, objectMapper13);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher17 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig3, objectMapper13);
        int int18 = restS3Service1.getInternalErrorRetryMax();
        java.lang.String str21 = restS3Service1.createTorrentUrl("http://s3.amazonaws.com//?torrent", "{\"{\"\": \"s3.amazonaws.com\"}\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}");
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig22 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials23 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service24 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials23);
        org.jets3t.service.security.ProviderCredentials providerCredentials25 = restS3Service24.getProviderCredentials();
        java.lang.String str26 = restS3Service24.getInvokingApplicationDescription();
        restS3Service24.setRequesterPaysEnabled(false);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig29 = null;
        org.codehaus.jackson.JsonFactory jsonFactory30 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper31 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper32 = objectMapper31.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper33 = objectMapper31.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider34 = objectMapper31.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider35 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper36 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory30, serializerProvider34, deserializerProvider35);
        org.codehaus.jackson.map.SerializerFactory serializerFactory37 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper38 = objectMapper36.setSerializerFactory(serializerFactory37);
        org.codehaus.jackson.PrettyPrinter prettyPrinter39 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter40 = objectMapper38.prettyPrintingWriter(prettyPrinter39);
        org.codehaus.jackson.map.ObjectMapper objectMapper41 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper42 = objectMapper41.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper43 = objectMapper41.disableDefaultTyping();
        java.io.File file45 = new java.io.File("hi!");
        java.io.File file47 = new java.io.File(file45, "");
        java.lang.Class<?> wildcardClass48 = file45.getClass();
        org.codehaus.jackson.type.JavaType javaType49 = objectMapper43.constructType((java.lang.reflect.Type) wildcardClass48);
        boolean boolean50 = objectMapper38.canDeserialize(javaType49);
        org.codehaus.jackson.map.ser.FilterProvider filterProvider51 = null;
        objectMapper38.setFilters(filterProvider51);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher53 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service24, s3SegmentPusherConfig29, objectMapper38);
        org.codehaus.jackson.FormatSchema formatSchema54 = null;
        org.codehaus.jackson.map.ObjectReader objectReader55 = objectMapper38.schemaBasedReader(formatSchema54);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher56 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig22, objectMapper38);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializerProvider11);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/%7B%22%7B%22%22%3A%20%22s3.amazonaws.com%22%7D%22%3A%20%22http%3A//s3.amazonaws.com/%257B%2522http%253A%252F%252Fs3.amazonaws.com%252Fhttp%25253A%25252F%25252Fs3.amazonaws.com%25252F%25252F%25253Ftorrent%252Fhi%252521%253Ftorrent%2522%253A%2520%2522x-amz-meta-%2522%257D/%253Cform%2520action%253D%2522https%253A//.s3.amazonaws.com/%2522%2520method%253D%2522post%2522%2520enctype%253D%2522multipart/form-data%2522%253E%250A%253Cinput%2520type%253D%2522hidden%2522%2520name%253D%2522key%2522%2520value%253D%2522hi%2521%2522%253E%250A%253Cinput%2520name%253D%2522file%2522%2520type%253D%2522file%2522%253E%250A%253Cbr%253E%250A%253Cinput%2520type%253D%2522submit%2522%2520value%253D%2522Upload%2520to%2520Amazon%2520S3%2522%253E%250A%253C/form%253E%3Ftorrent%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%201%2C%200%5D%22%7D?torrent" + "'", str21, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/%7B%22%7B%22%22%3A%20%22s3.amazonaws.com%22%7D%22%3A%20%22http%3A//s3.amazonaws.com/%257B%2522http%253A%252F%252Fs3.amazonaws.com%252Fhttp%25253A%25252F%25252Fs3.amazonaws.com%25252F%25252F%25253Ftorrent%252Fhi%252521%253Ftorrent%2522%253A%2520%2522x-amz-meta-%2522%257D/%253Cform%2520action%253D%2522https%253A//.s3.amazonaws.com/%2522%2520method%253D%2522post%2522%2520enctype%253D%2522multipart/form-data%2522%253E%250A%253Cinput%2520type%253D%2522hidden%2522%2520name%253D%2522key%2522%2520value%253D%2522hi%2521%2522%253E%250A%253Cinput%2520name%253D%2522file%2522%2520type%253D%2522file%2522%253E%250A%253Cbr%253E%250A%253Cinput%2520type%253D%2522submit%2522%2520value%253D%2522Upload%2520to%2520Amazon%2520S3%2522%253E%250A%253C/form%253E%3Ftorrent%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%2010%2C%2047%5D%2C%5B%22content-length-range%22%2C%201%2C%200%5D%22%7D?torrent");
        org.junit.Assert.assertNull(providerCredentials25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(objectMapper32);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(serializerProvider34);
        org.junit.Assert.assertNotNull(objectMapper38);
        org.junit.Assert.assertNotNull(objectWriter40);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertNotNull(objectMapper43);
        org.junit.Assert.assertNull("file45.getParent() == null", file45.getParent());
        org.junit.Assert.assertEquals(file45.toString(), "hi!");
        org.junit.Assert.assertNull("file47.getParent() == null", file47.getParent());
        org.junit.Assert.assertEquals(file47.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objectReader55);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.metamx.emitter.EmittingLogger emittingLogger1 = new com.metamx.emitter.EmittingLogger("{\"properties\":{},\"loaded\":false}");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.io.File file2 = new java.io.File("[\"content-length-range\", 100, 4]", "{\"\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}");
        org.junit.Assert.assertEquals(file2.getParent(), "[\"content-length-range\", 100, 4]/{\"\": \"http:/s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A/.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C");
        org.junit.Assert.assertEquals(file2.toString(), "[\"content-length-range\", 100, 4]/{\"\": \"http:/s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A/.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider5 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials6 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials6);
        org.jets3t.service.security.ProviderCredentials providerCredentials8 = restS3Service7.getProviderCredentials();
        boolean boolean10 = restS3Service7.isBucketAccessible("");
        java.lang.String str11 = restS3Service7.getRestMetadataPrefix();
        boolean boolean12 = restS3Service7.isRequesterPaysEnabled();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager13 = restS3Service7.getHttpConnectionManager();
        org.jets3t.service.Jets3tProperties jets3tProperties14 = restS3Service7.getJetS3tProperties();
        org.apache.commons.httpclient.HostConfiguration hostConfiguration15 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3, "{\"\": \"s3.amazonaws.com\"}/hi!", credentialsProvider5, jets3tProperties14, hostConfiguration15);
        org.apache.commons.httpclient.HostConfiguration hostConfiguration17 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "{\"[\"starts-with\", \"$<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]\": \"\"}", credentialsProvider2, jets3tProperties14, hostConfiguration17);
        org.junit.Assert.assertNull(providerCredentials8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "x-amz-meta-" + "'", str11, "x-amz-meta-");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(httpConnectionManager13);
        org.junit.Assert.assertNotNull(jets3tProperties14);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.metamx.emitter.EmittingLogger emittingLogger1 = new com.metamx.emitter.EmittingLogger("http://s3.amazonaws.com//?torrent");
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger1;
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper1 = objectMapper0.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = objectMapper0.disableDefaultTyping();
        org.codehaus.jackson.map.SerializationConfig.Feature[] featureArray3 = new org.codehaus.jackson.map.SerializationConfig.Feature[] {};
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion inclusion5 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = objectMapper4.setSerializationInclusion(inclusion5);
        org.codehaus.jackson.node.ArrayNode arrayNode7 = objectMapper6.createArrayNode();
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = objectMapper8.disableDefaultTyping();
        java.lang.Object obj11 = null;
        java.lang.String str12 = objectMapper8.writeValueAsString(obj11);
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider13 = objectMapper8.getDeserializerProvider();
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = objectMapper14.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = objectMapper14.disableDefaultTyping();
        org.codehaus.jackson.map.SerializationConfig.Feature[] featureArray17 = new org.codehaus.jackson.map.SerializationConfig.Feature[] {};
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = objectMapper14.enable(featureArray17);
        org.codehaus.jackson.map.ser.FilterProvider filterProvider19 = null;
        objectMapper18.setFilters(filterProvider19);
        org.codehaus.jackson.JsonFactory jsonFactory21 = objectMapper18.getJsonFactory();
        org.codehaus.jackson.map.ObjectMapper objectMapper22 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory21);
        org.codehaus.jackson.JsonFactory jsonFactory23 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper24 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper25 = objectMapper24.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper26 = objectMapper24.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider27 = objectMapper24.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider28 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper29 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory23, serializerProvider27, deserializerProvider28);
        org.codehaus.jackson.map.ObjectMapper objectMapper30 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.node.ObjectNode objectNode31 = objectMapper30.createObjectNode();
        org.codehaus.jackson.FormatSchema formatSchema32 = null;
        org.codehaus.jackson.map.ObjectReader objectReader33 = objectMapper30.schemaBasedReader(formatSchema32);
        byte[] byteArray35 = objectMapper30.writeValueAsBytes((java.lang.Object) 10L);
        org.codehaus.jackson.map.SerializationConfig.Feature[] featureArray36 = new org.codehaus.jackson.map.SerializationConfig.Feature[] {};
        org.codehaus.jackson.map.ObjectMapper objectMapper37 = objectMapper30.disable(featureArray36);
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider38 = objectMapper30.getDeserializerProvider();
        org.codehaus.jackson.map.ObjectMapper objectMapper39 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper40 = objectMapper39.disableDefaultTyping();
        org.codehaus.jackson.node.JsonNodeFactory jsonNodeFactory41 = objectMapper39.getNodeFactory();
        org.codehaus.jackson.map.ObjectMapper objectMapper42 = objectMapper39.enableDefaultTyping();
        org.codehaus.jackson.map.SerializationConfig serializationConfig43 = objectMapper42.getSerializationConfig();
        org.codehaus.jackson.map.ObjectMapper objectMapper44 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper45 = objectMapper44.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper46 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper47 = objectMapper46.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper48 = objectMapper46.disableDefaultTyping();
        java.io.File file50 = new java.io.File("hi!");
        java.io.File file52 = new java.io.File(file50, "");
        java.lang.Class<?> wildcardClass53 = file50.getClass();
        org.codehaus.jackson.type.JavaType javaType54 = objectMapper48.constructType((java.lang.reflect.Type) wildcardClass53);
        com.metamx.emitter.EmittingLogger emittingLogger55 = new com.metamx.emitter.EmittingLogger((java.lang.Class) wildcardClass53);
        org.codehaus.jackson.type.JavaType javaType56 = objectMapper44.constructType((java.lang.reflect.Type) wildcardClass53);
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig57 = objectMapper44.getDeserializationConfig();
        org.codehaus.jackson.map.ObjectMapper objectMapper58 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory21, serializerProvider27, deserializerProvider38, serializationConfig43, deserializationConfig57);
        org.codehaus.jackson.map.ObjectMapper objectMapper59 = objectMapper8.setSerializationConfig(serializationConfig43);
        org.codehaus.jackson.map.ObjectMapper objectMapper60 = objectMapper6.setSerializationConfig(serializationConfig43);
        org.codehaus.jackson.map.ObjectWriter objectWriter61 = objectMapper60.defaultPrettyPrintingWriter();
        org.junit.Assert.assertNotNull(objectMapper1);
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(arrayNode7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(deserializerProvider13);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(featureArray17);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(serializerProvider27);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertNotNull(objectReader33);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[49, 48]");
        org.junit.Assert.assertNotNull(featureArray36);
        org.junit.Assert.assertNotNull(objectMapper37);
        org.junit.Assert.assertNotNull(deserializerProvider38);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(jsonNodeFactory41);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertNotNull(serializationConfig43);
        org.junit.Assert.assertNotNull(objectMapper45);
        org.junit.Assert.assertNotNull(objectMapper47);
        org.junit.Assert.assertNotNull(objectMapper48);
        org.junit.Assert.assertNull("file50.getParent() == null", file50.getParent());
        org.junit.Assert.assertEquals(file50.toString(), "hi!");
        org.junit.Assert.assertNull("file52.getParent() == null", file52.getParent());
        org.junit.Assert.assertEquals(file52.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(javaType54);
        org.junit.Assert.assertNotNull(javaType56);
        org.junit.Assert.assertNotNull(deserializationConfig57);
        org.junit.Assert.assertNotNull(objectMapper59);
        org.junit.Assert.assertNotNull(objectMapper60);
        org.junit.Assert.assertNotNull(objectWriter61);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        boolean boolean4 = restS3Service1.isBucketAccessible("");
        java.lang.String str5 = restS3Service1.getRestMetadataPrefix();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.JsonFactory jsonFactory7 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider8 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider9 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig10 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig11 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory7, serializerProvider8, deserializerProvider9, serializationConfig10, deserializationConfig11);
        org.codehaus.jackson.map.ObjectWriter objectWriter13 = objectMapper12.defaultPrettyPrintingWriter();
        org.codehaus.jackson.map.ser.FilterProvider filterProvider14 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter15 = objectMapper12.writer(filterProvider14);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher16 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig6, objectMapper12);
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.S3Object s3Object18 = restS3Service1.getObjectWithSignedUrl("{\"x-amz-meta-\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid uri '{\"x-amz-meta-\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}': incorrect scheme");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "x-amz-meta-" + "'", str5, "x-amz-meta-");
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertNotNull(objectWriter15);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "[\"content-length-range\", 100, 4]", credentialsProvider2);
        java.lang.String str4 = restS3Service3.getRestMetadataPrefix();
        boolean boolean5 = restS3Service3.isHttpsOnly();
        restS3Service3.setDevPayProductToken("[\"starts-with\", \"$<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]");
        java.util.List<java.lang.String> strList8 = restS3Service3.getResourceParameterNames();
        org.jets3t.service.security.ProviderCredentials providerCredentials9 = restS3Service3.getProviderCredentials();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-amz-meta-" + "'", str4, "x-amz-meta-");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNull(providerCredentials9);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.io.File file2 = new java.io.File("", "[\"starts-with\", \"$<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]");
        java.io.File file4 = new java.io.File(file2, "[\"content-length-range\", 58, 1]");
        boolean boolean6 = file4.setReadable(false);
        org.junit.Assert.assertEquals(file2.getParent(), "/[\"starts-with\", \"$<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n<");
        org.junit.Assert.assertEquals(file2.toString(), "/[\"starts-with\", \"$<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]");
        org.junit.Assert.assertEquals(file4.getParent(), "/[\"starts-with\", \"$<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]");
        org.junit.Assert.assertEquals(file4.toString(), "/[\"starts-with\", \"$<form action=\"https:/.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]/[\"content-length-range\", 58, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.io.File file1 = new java.io.File("hi!");
        java.io.File file3 = new java.io.File(file1, "");
        boolean boolean5 = file1.setWritable(false);
        java.io.File file7 = new java.io.File(file1, "http://s3.amazonaws.com//?torrent");
        file1.deleteOnExit();
        java.lang.String str9 = file1.getCanonicalPath();
        boolean boolean10 = file1.delete();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "hi!");
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!/http:/s3.amazonaws.com");
        org.junit.Assert.assertEquals(file7.toString(), "hi!/http:/s3.amazonaws.com/?torrent");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!" + "'", str9, "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager3 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager3);
        java.lang.String str5 = restS3Service1.getEndpoint();
        java.lang.String str6 = restS3Service1.getEndpoint();
        org.apache.commons.httpclient.HttpMethod httpMethod7 = null;
        restS3Service1.authorizeHttpRequest(httpMethod7);
        java.lang.String str9 = restS3Service1.getDevPayUserToken();
        org.jets3t.service.model.StorageObject storageObject13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap15 = restS3Service1.copyObject("[\"starts-with\", \"${\"[\"starts-with\", \"$<form action=\"https://.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"\"]\": \"\"}\", \"\"]", "[\"starts-with\", \"$s3.amazonaws.com\", \"\"]", "{\"{\"\": \"s3.amazonaws.com\"}\": \"http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent,[\"content-length-range\", 10, 47],[\"content-length-range\", 10, 47],[\"content-length-range\", 1, 0]\"}", storageObject13, false);
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.ServiceException; message: The requested action cannot be performed with a non-authenticated service: copyObject");
        } catch (org.jets3t.service.ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "s3.amazonaws.com" + "'", str5, "s3.amazonaws.com");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "s3.amazonaws.com" + "'", str6, "s3.amazonaws.com");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3);
        org.jets3t.service.security.ProviderCredentials providerCredentials5 = restS3Service4.getProviderCredentials();
        boolean boolean7 = restS3Service4.isBucketAccessible("");
        java.lang.String str8 = restS3Service4.getRestMetadataPrefix();
        boolean boolean9 = restS3Service4.isRequesterPaysEnabled();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager10 = restS3Service4.getHttpConnectionManager();
        org.jets3t.service.Jets3tProperties jets3tProperties11 = restS3Service4.getJetS3tProperties();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "[\"{\"{\"\": \"s3.amazonaws.com\"}\": \"acl,policy,torrent,logging,location,requestPayment,versions,versioning,versionId,uploads,uploadId,partNumber,website,notification\"}\", \"${\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}\", \"[\"content-length-range\", 58, 1]\"]", credentialsProvider2, jets3tProperties11);
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.BaseVersionOrDeleteMarker[] baseVersionOrDeleteMarkerArray15 = restS3Service12.getObjectVersions("", "http:/s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: Failed to parse XML document with handler class org.jets3t.service.impl.rest.XmlResponsesSaxParser$ListVersionsResultsHandler");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "x-amz-meta-" + "'", str8, "x-amz-meta-");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(httpConnectionManager10);
        org.junit.Assert.assertNotNull(jets3tProperties11);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = restS3Service1.renameMetadataKeys(strMap2);
        java.lang.String str4 = restS3Service1.getRestMetadataPrefix();
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.acl.AccessControlList accessControlList6 = restS3Service1.getBucketAcl("<form action=\"https://<form action=\"https://{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"x-amz-\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"[\"content-length-range\", 100, 4]\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid uri 'https://s3.amazonaws.com:443/<form action=\"https://<form action=\"https://{\"http://s3.amazonaws.com//hi%21?torrent\": \"\"}.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">?<input type=\"hidden\" name=\"key\" value=\"x-amz-\">?<input name=\"file\" type=\"file\">?<br>?<input type=\"submit\" value=\"Upload to Amazon S3\">?</form>.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">?<input type=\"hidden\" name=\"key\" value=\"[\"content-length-range\", 100, 4]\">?<input name=\"file\" type=\"file\">?<br>?<input type=\"submit\" value=\"Upload to Amazon S3\">?</form>/&acl': escaped absolute path not valid");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-amz-meta-" + "'", str4, "x-amz-meta-");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        com.metamx.druid.client.DataSegment.Builder builder5 = builder0.dimensions((java.util.List<java.lang.String>) strList3);
        com.metamx.druid.client.DataSegment.Builder builder7 = builder5.version("http://s3.amazonaws.com//?torrent");
        com.metamx.druid.client.DataSegment.Builder builder9 = builder7.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder11 = builder9.size((long) '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.node.ObjectNode objectNode1 = objectMapper0.createObjectNode();
        org.codehaus.jackson.FormatSchema formatSchema2 = null;
        org.codehaus.jackson.map.ObjectReader objectReader3 = objectMapper0.schemaBasedReader(formatSchema2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.node.ObjectNode objectNode5 = objectMapper4.createObjectNode();
        org.codehaus.jackson.FormatSchema formatSchema6 = null;
        org.codehaus.jackson.map.ObjectReader objectReader7 = objectMapper4.schemaBasedReader(formatSchema6);
        byte[] byteArray9 = objectMapper4.writeValueAsBytes((java.lang.Object) 10L);
        org.codehaus.jackson.JsonNode jsonNode10 = objectMapper0.valueToTree((java.lang.Object) 10L);
        org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion inclusion11 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = objectMapper0.setSerializationInclusion(inclusion11);
        org.codehaus.jackson.JsonFactory jsonFactory13 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = objectMapper14.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = objectMapper14.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider17 = objectMapper14.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider18 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory13, serializerProvider17, deserializerProvider18);
        org.codehaus.jackson.JsonFactory jsonFactory20 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper22 = objectMapper21.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper23 = objectMapper21.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider24 = objectMapper21.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider25 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper26 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory20, serializerProvider24, deserializerProvider25);
        org.codehaus.jackson.map.ObjectMapper objectMapper27 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.node.ObjectNode objectNode28 = objectMapper27.createObjectNode();
        org.codehaus.jackson.FormatSchema formatSchema29 = null;
        org.codehaus.jackson.map.ObjectReader objectReader30 = objectMapper27.schemaBasedReader(formatSchema29);
        org.codehaus.jackson.map.ObjectMapper objectMapper31 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.node.ObjectNode objectNode32 = objectMapper31.createObjectNode();
        org.codehaus.jackson.FormatSchema formatSchema33 = null;
        org.codehaus.jackson.map.ObjectReader objectReader34 = objectMapper31.schemaBasedReader(formatSchema33);
        byte[] byteArray36 = objectMapper31.writeValueAsBytes((java.lang.Object) 10L);
        org.codehaus.jackson.JsonNode jsonNode37 = objectMapper27.valueToTree((java.lang.Object) 10L);
        org.codehaus.jackson.JsonParser jsonParser38 = objectMapper26.treeAsTokens(jsonNode37);
        org.codehaus.jackson.JsonNode jsonNode39 = objectMapper19.readTree(jsonParser38);
        org.codehaus.jackson.map.ObjectMapper objectMapper40 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper41 = objectMapper40.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper42 = objectMapper40.disableDefaultTyping();
        java.io.File file44 = new java.io.File("hi!");
        java.io.File file46 = new java.io.File(file44, "");
        java.lang.Class<?> wildcardClass47 = file44.getClass();
        org.codehaus.jackson.type.JavaType javaType48 = objectMapper42.constructType((java.lang.reflect.Type) wildcardClass47);
        org.codehaus.jackson.map.MappingIterator<java.util.Collection<java.lang.String>> strCollectionItor49 = objectMapper0.readValues(jsonParser38, javaType48);
        org.codehaus.jackson.map.SerializerFactory serializerFactory50 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper51 = objectMapper0.setSerializerFactory(serializerFactory50);
        org.junit.Assert.assertNotNull(objectNode1);
        org.junit.Assert.assertNotNull(objectReader3);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[49, 48]");
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(serializerProvider17);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(serializerProvider24);
        org.junit.Assert.assertNotNull(objectNode28);
        org.junit.Assert.assertNotNull(objectReader30);
        org.junit.Assert.assertNotNull(objectNode32);
        org.junit.Assert.assertNotNull(objectReader34);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[49, 48]");
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(objectMapper41);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertNull("file44.getParent() == null", file44.getParent());
        org.junit.Assert.assertEquals(file44.toString(), "hi!");
        org.junit.Assert.assertNull("file46.getParent() == null", file46.getParent());
        org.junit.Assert.assertEquals(file46.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(javaType48);
        org.junit.Assert.assertNotNull(strCollectionItor49);
        org.junit.Assert.assertNotNull(objectMapper51);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.io.File file1 = new java.io.File("http://s3.amazonaws.com//hi%21?torrent");
        boolean boolean3 = file1.setLastModified((long) (short) 10);
        boolean boolean4 = file1.canWrite();
        java.io.File file5 = file1.getAbsoluteFile();
        java.io.File file6 = null;
        java.io.File file8 = new java.io.File(file6, "x-amz-meta-");
        long long9 = file8.getUsableSpace();
        java.io.File file10 = file8.getCanonicalFile();
        java.io.File file12 = new java.io.File(file10, "s3.amazonaws.com");
        boolean boolean13 = file1.renameTo(file10);
        org.junit.Assert.assertEquals(file1.getParent(), "http:/s3.amazonaws.com");
        org.junit.Assert.assertEquals(file1.toString(), "http:/s3.amazonaws.com/hi%21?torrent");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(file5);
// flaky:         org.junit.Assert.assertEquals(file5.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/http:/s3.amazonaws.com");
// flaky:         org.junit.Assert.assertEquals(file5.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/http:/s3.amazonaws.com/hi%21?torrent");
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "x-amz-meta-");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(file10);
// flaky:         org.junit.Assert.assertEquals(file10.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4");
// flaky:         org.junit.Assert.assertEquals(file10.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-");
// flaky:         org.junit.Assert.assertEquals(file12.getParent(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-");
// flaky:         org.junit.Assert.assertEquals(file12.toString(), "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-/s3.amazonaws.com");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager3 = null;
        restS3Service1.setHttpConnectionManager(httpConnectionManager3);
        java.lang.String str5 = restS3Service1.getEndpoint();
        java.lang.String str6 = restS3Service1.getEndpoint();
        org.apache.commons.httpclient.HttpMethod httpMethod7 = null;
        restS3Service1.authorizeHttpRequest(httpMethod7);
        boolean boolean9 = restS3Service1.isShutdown();
        org.jets3t.service.Jets3tProperties jets3tProperties10 = restS3Service1.getJetS3tProperties();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        org.codehaus.jackson.JsonFactory jsonFactory12 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider13 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider14 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig15 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig16 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory12, serializerProvider13, deserializerProvider14, serializationConfig15, deserializationConfig16);
        org.codehaus.jackson.map.ObjectWriter objectWriter18 = objectMapper17.defaultPrettyPrintingWriter();
        org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion inclusion19 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = objectMapper17.setSerializationInclusion(inclusion19);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher21 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig11, objectMapper20);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig22 = null;
        s3SegmentPusher21.config = s3SegmentPusherConfig22;
        java.io.File file25 = new java.io.File("http://s3.amazonaws.com//hi%21?torrent");
        boolean boolean26 = file25.canRead();
        boolean boolean28 = file25.setReadable(false);
        java.io.File file29 = null;
        java.io.File file31 = new java.io.File(file29, "x-amz-meta-");
        boolean boolean32 = file25.renameTo(file31);
        com.metamx.druid.client.DataSegment dataSegment33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment34 = s3SegmentPusher21.push(file31, dataSegment33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "s3.amazonaws.com" + "'", str5, "s3.amazonaws.com");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "s3.amazonaws.com" + "'", str6, "s3.amazonaws.com");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jets3tProperties10);
        org.junit.Assert.assertNotNull(objectWriter18);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertEquals(file25.getParent(), "http:/s3.amazonaws.com");
        org.junit.Assert.assertEquals(file25.toString(), "http:/s3.amazonaws.com/hi%21?torrent");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull("file31.getParent() == null", file31.getParent());
        org.junit.Assert.assertEquals(file31.toString(), "x-amz-meta-");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials3 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials3);
        org.jets3t.service.security.ProviderCredentials providerCredentials5 = restS3Service4.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager6 = null;
        restS3Service4.setHttpConnectionManager(httpConnectionManager6);
        org.jets3t.service.Jets3tProperties jets3tProperties8 = restS3Service4.getJetS3tProperties();
        org.apache.commons.httpclient.HostConfiguration hostConfiguration9 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "", credentialsProvider2, jets3tProperties8, hostConfiguration9);
        boolean boolean11 = restS3Service10.isAuthenticatedConnection();
        java.lang.String str12 = restS3Service10.getDevPayUserToken();
        org.jets3t.service.model.S3Bucket s3Bucket14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.acl.AccessControlList accessControlList16 = restS3Service10.getVersionedObjectAcl("x-amz-", s3Bucket14, "http://s3.amazonaws.com/%3Cform%20action%3D%22https%3A%2F%2Fhttp%3A%2F%2Fs3.amazonaws.com%2F%2Fhi%2521%3Ftorrent.s3.amazonaws.com%2F%22%20method%3D%22post%22%20enctype%3D%22multipart%2Fform-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C%2Fform%3E/%7B%22%7B%22%22%3A%20%22s3.amazonaws.com%22%7D%22%3A%20%22acl%2Cpolicy%2Ctorrent%2Clogging%2Clocation%2CrequestPayment%2Cversions%2Cversioning%2CversionId%2Cuploads%2CuploadId%2CpartNumber%2Cwebsite%2Cnotification%22%7D?torrent");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: The action Get versioned Object Access Control List cannot be performed with an invalid bucket: null");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials5);
        org.junit.Assert.assertNotNull(jets3tProperties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher3.config;
        org.jets3t.service.security.ProviderCredentials providerCredentials5 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider7 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials8 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials8);
        org.jets3t.service.security.ProviderCredentials providerCredentials10 = restS3Service9.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager11 = null;
        restS3Service9.setHttpConnectionManager(httpConnectionManager11);
        org.jets3t.service.Jets3tProperties jets3tProperties13 = restS3Service9.getJetS3tProperties();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials5, "{\"\": \"s3.amazonaws.com\"}", credentialsProvider7, jets3tProperties13);
        s3SegmentPusher3.s3Client = restS3Service14;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = restS3Service14.checkBucketStatus("[\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-\", \"$<form action=\"https://http://s3.amazonaws.com//hi%21?torrent.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"[\"content-length-range\", 58, 1]\"]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid uri 'https://s3.amazonaws.com:443/[\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-\", \"$<form action=\"https://http://s3.amazonaws.com//hi%21?torrent.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">?<input type=\"hidden\" name=\"key\" value=\"\">?<input name=\"file\" type=\"file\">?<br>?<input type=\"submit\" value=\"Upload to Amazon S3\">?</form>\", \"[\"content-length-range\", 58, 1]\"]/&max-keys=0': escaped absolute path not valid");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        org.junit.Assert.assertNull(providerCredentials10);
        org.junit.Assert.assertNotNull(jets3tProperties13);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        java.lang.String str3 = restS3Service1.getInvokingApplicationDescription();
        org.apache.commons.httpclient.HttpClient httpClient4 = restS3Service1.getHttpClient();
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(httpClient4);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        boolean boolean4 = restS3Service1.isBucketAccessible("");
        java.lang.String str5 = restS3Service1.getRestMetadataPrefix();
        java.lang.String str6 = restS3Service1.getRestMetadataPrefix();
        // The following exception was thrown during execution in test generation
        try {
            restS3Service1.deleteObjectWithSignedUrl("[\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-\", \"$<form action=\"https://http://s3.amazonaws.com//hi%21?torrent.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>\", \"[\"content-length-range\", 58, 1]\"]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid uri '[\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-\", \"$<form action=\"https://http://s3.amazonaws.com//hi%21?torrent.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">?<input type=\"hidden\" name=\"key\" value=\"\">?<input name=\"file\" type=\"file\">?<br>?<input type=\"submit\" value=\"Upload to Amazon S3\">?</form>\", \"[\"content-length-range\", 58, 1]\"]': incorrect path");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "x-amz-meta-" + "'", str5, "x-amz-meta-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "x-amz-meta-" + "'", str6, "x-amz-meta-");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        java.lang.String str3 = restS3Service1.getInvokingApplicationDescription();
        restS3Service1.setRequesterPaysEnabled(false);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.JsonFactory jsonFactory7 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider11 = objectMapper8.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider12 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory7, serializerProvider11, deserializerProvider12);
        org.codehaus.jackson.map.SerializerFactory serializerFactory14 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = objectMapper13.setSerializerFactory(serializerFactory14);
        org.codehaus.jackson.PrettyPrinter prettyPrinter16 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter17 = objectMapper15.prettyPrintingWriter(prettyPrinter16);
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = objectMapper18.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = objectMapper18.disableDefaultTyping();
        java.io.File file22 = new java.io.File("hi!");
        java.io.File file24 = new java.io.File(file22, "");
        java.lang.Class<?> wildcardClass25 = file22.getClass();
        org.codehaus.jackson.type.JavaType javaType26 = objectMapper20.constructType((java.lang.reflect.Type) wildcardClass25);
        boolean boolean27 = objectMapper15.canDeserialize(javaType26);
        org.codehaus.jackson.map.ser.FilterProvider filterProvider28 = null;
        objectMapper15.setFilters(filterProvider28);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher30 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig6, objectMapper15);
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.model.StorageOwner storageOwner31 = restS3Service1.getAccountOwner();
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.ServiceException; message: The requested action cannot be performed with a non-authenticated service: List all buckets to find account owner");
        } catch (org.jets3t.service.ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializerProvider11);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNull("file22.getParent() == null", file22.getParent());
        org.junit.Assert.assertEquals(file22.toString(), "hi!");
        org.junit.Assert.assertNull("file24.getParent() == null", file24.getParent());
        org.junit.Assert.assertEquals(file24.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.google.common.base.Joiner joiner1 = com.google.common.base.Joiner.on("{\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/x-amz-meta-\": \"\"}");
        org.junit.Assert.assertNotNull(joiner1);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher5 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig3, objectMapper4);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher8 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig6, objectMapper7);
        boolean boolean9 = restS3Service1.isShutdown();
        // The following exception was thrown during execution in test generation
        try {
            restS3Service1.suspendBucketVersioning("<form action=\"https://http://s3.amazonaws.com/%7B%22http%3A%2F%2Fs3.amazonaws.com%2Fhttp%253A%252F%252Fs3.amazonaws.com%252F%252F%253Ftorrent%2Fhi%2521%3Ftorrent%22%3A%20%22x-amz-meta-%22%7D/%3Cform%20action%3D%22https%3A//.s3.amazonaws.com/%22%20method%3D%22post%22%20enctype%3D%22multipart/form-data%22%3E%0A%3Cinput%20type%3D%22hidden%22%20name%3D%22key%22%20value%3D%22hi%21%22%3E%0A%3Cinput%20name%3D%22file%22%20type%3D%22file%22%3E%0A%3Cbr%3E%0A%3Cinput%20type%3D%22submit%22%20value%3D%22Upload%20to%20Amazon%20S3%22%3E%0A%3C/form%3E?torrent.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
            org.junit.Assert.fail("Expected exception of type org.jets3t.service.S3ServiceException; message: Failed to PUT request containing an XML document");
        } catch (org.jets3t.service.S3ServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        org.codehaus.jackson.JsonFactory jsonFactory3 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = objectMapper4.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = objectMapper4.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider7 = objectMapper4.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider8 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory3, serializerProvider7, deserializerProvider8);
        org.codehaus.jackson.map.SerializerFactory serializerFactory10 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = objectMapper9.setSerializerFactory(serializerFactory10);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher12 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig2, objectMapper9);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        org.codehaus.jackson.JsonFactory jsonFactory14 = null;
        org.codehaus.jackson.map.SerializerProvider serializerProvider15 = null;
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider16 = null;
        org.codehaus.jackson.map.SerializationConfig serializationConfig17 = null;
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig18 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory14, serializerProvider15, deserializerProvider16, serializationConfig17, deserializationConfig18);
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider20 = objectMapper19.getDeserializerProvider();
        org.codehaus.jackson.node.ArrayNode arrayNode21 = objectMapper19.createArrayNode();
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher22 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig13, objectMapper19);
        org.jets3t.service.security.ProviderCredentials providerCredentials23 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service24 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials23);
        org.jets3t.service.security.ProviderCredentials providerCredentials25 = restS3Service24.getProviderCredentials();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig26 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper27 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher28 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service24, s3SegmentPusherConfig26, objectMapper27);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig29 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper30 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher31 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service24, s3SegmentPusherConfig29, objectMapper30);
        boolean boolean32 = restS3Service24.isShutdown();
        s3SegmentPusher22.s3Client = restS3Service24;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig34 = s3SegmentPusher22.config;
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(serializerProvider7);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(deserializerProvider20);
        org.junit.Assert.assertNotNull(arrayNode21);
        org.junit.Assert.assertNull(providerCredentials25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(s3SegmentPusherConfig34);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        java.lang.String str2 = restS3Service1.getDevPayUserToken();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials4 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials4);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.JsonFactory jsonFactory7 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider11 = objectMapper8.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider12 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory7, serializerProvider11, deserializerProvider12);
        org.codehaus.jackson.map.SerializerFactory serializerFactory14 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = objectMapper13.setSerializerFactory(serializerFactory14);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher16 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service5, s3SegmentPusherConfig6, objectMapper13);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher17 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig3, objectMapper13);
        java.lang.String str18 = restS3Service1.getDevPayUserToken();
        org.jets3t.service.security.ProviderCredentials providerCredentials21 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service22 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials21);
        org.jets3t.service.security.ProviderCredentials providerCredentials23 = restS3Service22.getProviderCredentials();
        boolean boolean25 = restS3Service22.isBucketAccessible("");
        java.lang.String str26 = restS3Service22.getRestMetadataPrefix();
        java.lang.String str27 = restS3Service22.getRestMetadataPrefix();
        org.jets3t.service.security.ProviderCredentials providerCredentials28 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service29 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials28);
        java.lang.String str30 = restS3Service29.getDevPayUserToken();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig31 = null;
        org.jets3t.service.security.ProviderCredentials providerCredentials32 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service33 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials32);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig34 = null;
        org.codehaus.jackson.JsonFactory jsonFactory35 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper36 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper37 = objectMapper36.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper38 = objectMapper36.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider39 = objectMapper36.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider40 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper41 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory35, serializerProvider39, deserializerProvider40);
        org.codehaus.jackson.map.SerializerFactory serializerFactory42 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper43 = objectMapper41.setSerializerFactory(serializerFactory42);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher44 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service33, s3SegmentPusherConfig34, objectMapper41);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher45 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service29, s3SegmentPusherConfig31, objectMapper41);
        int int46 = restS3Service29.getInternalErrorRetryMax();
        org.jets3t.service.security.ProviderCredentials providerCredentials47 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service48 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials47);
        org.jets3t.service.security.ProviderCredentials providerCredentials49 = restS3Service48.getProviderCredentials();
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager50 = null;
        restS3Service48.setHttpConnectionManager(httpConnectionManager50);
        org.apache.commons.httpclient.HttpConnectionManager httpConnectionManager52 = null;
        restS3Service48.setHttpConnectionManager(httpConnectionManager52);
        boolean boolean54 = restS3Service48.isRequesterPaysEnabled();
        com.metamx.druid.client.DataSegment.Builder builder55 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder57 = builder55.size(0L);
        org.joda.time.Interval interval58 = null;
        com.metamx.druid.client.DataSegment.Builder builder59 = builder57.interval(interval58);
        java.lang.String[] strArray63 = new java.lang.String[] { "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!", "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/druid/05168808c278c080c59c19e858d9471b316cd1f5/randoop-modified_4/hi!", "http://s3.amazonaws.com//?torrent" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        com.metamx.druid.client.DataSegment.Builder builder66 = builder57.metrics((java.util.List<java.lang.String>) strList64);
        org.jets3t.service.security.ProviderCredentials providerCredentials67 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider69 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service70 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials67, "null", credentialsProvider69);
        org.jets3t.service.security.ProviderCredentials providerCredentials71 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service72 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials71);
        java.util.Map<java.lang.String, java.lang.Object> strMap73 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap74 = restS3Service72.renameMetadataKeys(strMap73);
        java.util.Map<java.lang.String, java.lang.Object> strMap75 = restS3Service70.renameMetadataKeys(strMap73);
        com.metamx.druid.client.DataSegment.Builder builder76 = builder57.loadSpec(strMap75);
        java.util.Map<java.lang.String, java.lang.Object> strMap77 = restS3Service48.renameMetadataKeys(strMap75);
        java.util.Map<java.lang.String, java.lang.Object> strMap78 = restS3Service29.renameMetadataKeys(strMap77);
        java.util.Map<java.lang.String, java.lang.Object> strMap79 = restS3Service22.renameMetadataKeys(strMap77);
        org.jets3t.service.security.ProviderCredentials providerCredentials80 = null;
        java.util.Date date81 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str83 = restS3Service1.createSignedPutUrl("hi!", "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent", strMap77, providerCredentials80, date81, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializerProvider11);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(providerCredentials23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "x-amz-meta-" + "'", str26, "x-amz-meta-");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "x-amz-meta-" + "'", str27, "x-amz-meta-");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(objectMapper37);
        org.junit.Assert.assertNotNull(objectMapper38);
        org.junit.Assert.assertNotNull(serializerProvider39);
        org.junit.Assert.assertNotNull(objectMapper43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertNull(providerCredentials49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertNotNull(strMap78);
        org.junit.Assert.assertNotNull(strMap79);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.io.File file1 = new java.io.File("hi!");
        boolean boolean2 = file1.mkdirs();
        java.io.File file4 = new java.io.File(file1, "[\"content-length-range\", 1, 0]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = file1.setLastModified((long) (-226));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative time");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals(file4.getParent(), "hi!");
        org.junit.Assert.assertEquals(file4.toString(), "hi!/[\"content-length-range\", 1, 0]");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.apache.commons.httpclient.auth.CredentialsProvider credentialsProvider2 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0, "{\"[\"content-length-range\", -226, -226]\": \"{\"\": \"s3.amazonaws.com\"}/hi!\"}", credentialsProvider2);
        int int4 = restS3Service3.getInternalErrorRetryMax();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        java.lang.String str3 = restS3Service1.getInvokingApplicationDescription();
        java.lang.String str6 = restS3Service1.createTorrentUrl("http://s3.amazonaws.com//?torrent", "hi!");
        org.jets3t.service.security.ProviderCredentials providerCredentials7 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = restS3Service8.renameMetadataKeys(strMap9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = restS3Service1.renameMetadataKeys(strMap10);
        java.util.List<java.lang.String> strList12 = restS3Service1.getResourceParameterNames();
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent" + "'", str6, "http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        java.lang.String str3 = restS3Service1.getInvokingApplicationDescription();
        restS3Service1.setRequesterPaysEnabled(false);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.JsonFactory jsonFactory7 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = objectMapper8.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider11 = objectMapper8.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider12 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory7, serializerProvider11, deserializerProvider12);
        org.codehaus.jackson.map.SerializerFactory serializerFactory14 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = objectMapper13.setSerializerFactory(serializerFactory14);
        org.codehaus.jackson.PrettyPrinter prettyPrinter16 = null;
        org.codehaus.jackson.map.ObjectWriter objectWriter17 = objectMapper15.prettyPrintingWriter(prettyPrinter16);
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = objectMapper18.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = objectMapper18.disableDefaultTyping();
        java.io.File file22 = new java.io.File("hi!");
        java.io.File file24 = new java.io.File(file22, "");
        java.lang.Class<?> wildcardClass25 = file22.getClass();
        org.codehaus.jackson.type.JavaType javaType26 = objectMapper20.constructType((java.lang.reflect.Type) wildcardClass25);
        boolean boolean27 = objectMapper15.canDeserialize(javaType26);
        org.codehaus.jackson.map.ser.FilterProvider filterProvider28 = null;
        objectMapper15.setFilters(filterProvider28);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher30 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig6, objectMapper15);
        java.lang.String str31 = restS3Service1.getInvokingApplicationDescription();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig32 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper33 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper34 = objectMapper33.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper35 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper36 = objectMapper35.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper37 = objectMapper35.disableDefaultTyping();
        java.lang.Object obj38 = null;
        java.lang.String str39 = objectMapper35.writeValueAsString(obj38);
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider40 = objectMapper35.getDeserializerProvider();
        org.codehaus.jackson.JsonFactory jsonFactory41 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper42 = new org.codehaus.jackson.map.ObjectMapper();
        org.codehaus.jackson.map.ObjectMapper objectMapper43 = objectMapper42.disableDefaultTyping();
        org.codehaus.jackson.map.ObjectMapper objectMapper44 = objectMapper42.disableDefaultTyping();
        org.codehaus.jackson.map.SerializerProvider serializerProvider45 = objectMapper42.getSerializerProvider();
        org.codehaus.jackson.map.DeserializerProvider deserializerProvider46 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper47 = new org.codehaus.jackson.map.ObjectMapper(jsonFactory41, serializerProvider45, deserializerProvider46);
        org.codehaus.jackson.map.ObjectMapper objectMapper48 = objectMapper35.setSerializerProvider(serializerProvider45);
        org.codehaus.jackson.map.DeserializationConfig deserializationConfig49 = objectMapper35.getDeserializationConfig();
        org.codehaus.jackson.map.ObjectMapper objectMapper50 = objectMapper33.setDeserializationConfig(deserializationConfig49);
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher51 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig32, objectMapper50);
        // The following exception was thrown during execution in test generation
        try {
            org.jets3t.service.acl.AccessControlList accessControlList53 = restS3Service1.getBucketAcl("<form action=\"https://{\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">\n<input type=\"hidden\" name=\"key\" value=\"x-amz-\">\n<input name=\"file\" type=\"file\">\n<br>\n<input type=\"submit\" value=\"Upload to Amazon S3\">\n</form>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid uri 'https://s3.amazonaws.com:443/<form action=\"https://{\"http://s3.amazonaws.com/http%3A%2F%2Fs3.amazonaws.com%2F%2F%3Ftorrent/hi%21?torrent\": \"x-amz-meta-\"}.s3.amazonaws.com/\" method=\"post\" enctype=\"multipart/form-data\">?<input type=\"hidden\" name=\"key\" value=\"x-amz-\">?<input name=\"file\" type=\"file\">?<br>?<input type=\"submit\" value=\"Upload to Amazon S3\">?</form>/&acl': escaped absolute path not valid");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializerProvider11);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNull("file22.getParent() == null", file22.getParent());
        org.junit.Assert.assertEquals(file22.toString(), "hi!");
        org.junit.Assert.assertNull("file24.getParent() == null", file24.getParent());
        org.junit.Assert.assertEquals(file24.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(objectMapper34);
        org.junit.Assert.assertNotNull(objectMapper36);
        org.junit.Assert.assertNotNull(objectMapper37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "null" + "'", str39, "null");
        org.junit.Assert.assertNotNull(deserializerProvider40);
        org.junit.Assert.assertNotNull(objectMapper43);
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertNotNull(serializerProvider45);
        org.junit.Assert.assertNotNull(objectMapper48);
        org.junit.Assert.assertNotNull(deserializationConfig49);
        org.junit.Assert.assertNotNull(objectMapper50);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jets3t.service.security.ProviderCredentials providerCredentials0 = null;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = new org.jets3t.service.impl.rest.httpclient.RestS3Service(providerCredentials0);
        org.jets3t.service.security.ProviderCredentials providerCredentials2 = restS3Service1.getProviderCredentials();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher5 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig3, objectMapper4);
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher8 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service1, s3SegmentPusherConfig6, objectMapper7);
        java.lang.String str9 = restS3Service1.getRestMetadataPrefix();
        boolean boolean11 = restS3Service1.isBucketAccessible("http://s3.amazonaws.com//?torrent");
        org.jets3t.service.security.ProviderCredentials providerCredentials12 = restS3Service1.getAWSCredentials();
        org.junit.Assert.assertNull(providerCredentials2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "x-amz-meta-" + "'", str9, "x-amz-meta-");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(providerCredentials12);
    }
}
