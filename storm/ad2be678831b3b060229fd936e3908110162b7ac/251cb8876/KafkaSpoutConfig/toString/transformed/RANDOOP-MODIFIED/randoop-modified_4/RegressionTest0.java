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
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.CharSequence> objBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>(objBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.io.Serializable> serializableBuilder10 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.io.Serializable>("", serializableSerializableDeserializer1, serializableSerializableDeserializer2, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_RETRY_SERVICE = kafkaSpoutRetryService0;
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        long long0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 30000L + "'", long0 == 30000L);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 'a';
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        long long0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 97L + "'", long0 == 97L);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategySerializableDeserializer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilder8 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>("", strSerializableDeserializer1, firstPollOffsetStrategySerializableDeserializer2, (java.util.Collection<java.lang.String>) strList6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence>();
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>("", strComparableSerializableDeserializer1, strComparableSerializableDeserializer2, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = 0L;
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("hi!", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.Type> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.Type>();
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Map<java.lang.String, java.lang.Object>, java.lang.Cloneable> strMapBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Map<java.lang.String, java.lang.Object>, java.lang.Cloneable>();
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = strBuilder5.setRetry(kafkaSpoutRetryService7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object> strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>(strBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        long long0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 141902646130682494L + "'", long0 == 141902646130682494L);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.AbstractCollection<java.lang.String>> strCollectionSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strKafkaSpoutConfigSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.Subscription subscription3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strCollectionBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strCollectionSerializableDeserializer1, strKafkaSpoutConfigSerializableDeserializer2, subscription3);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID = (byte) -1;
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        strKafkaSpoutConfig0.pollTimeoutMs = 0L;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        int int0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2147483647 + "'", int0 == 2147483647);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        java.lang.Class<?> wildcardClass9 = strMap8.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.util.AbstractCollection<java.lang.String>> randomAccessKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.util.AbstractCollection<java.lang.String>>();
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID = 10;
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        long long0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilderBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strBuilderBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.util.List<java.lang.String>> genericDeclarationBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.util.List<java.lang.String>> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.util.List<java.lang.String>>(genericDeclarationBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_RETRY_SERVICE;
        org.junit.Assert.assertNull(kafkaSpoutRetryService0);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strBuilder10.retryService = kafkaSpoutRetryService11;
        long long13 = strBuilder10.pollTimeoutMs;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, java.util.List<java.lang.String>> strListKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, java.util.List<java.lang.String>>();
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.Class<?>> strCollectionKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.Class<?>>();
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = '#';
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        int int0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 35 + "'", int0 == 35);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (-1);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 2147483647;
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (short) 1;
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Map<java.lang.String, java.lang.Object>, java.lang.reflect.Type> strMapBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Map<java.lang.String, java.lang.Object>, java.lang.reflect.Type>();
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxRetries = 1;
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList7);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = strBuilder9.kafkaProps;
        strKafkaSpoutConfig0.kafkaProps = strMap10;
        java.lang.Class<?> wildcardClass12 = strMap10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = (short) -1;
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 141902646130682494L;
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (-1);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractList<java.lang.String>, java.util.ArrayList<java.lang.String>> strListBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, java.util.ArrayList<java.lang.String>> strListKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, java.util.ArrayList<java.lang.String>>(strListBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = '#';
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.lang.Comparable<java.lang.String>> strCollectionBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.Comparable<java.lang.String>> strCollectionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.Comparable<java.lang.String>>(strCollectionBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.lang.Cloneable> strIterableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.lang.Cloneable>();
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(objBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = '#';
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 35;
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 10;
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = strBuilder5.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder11.setMaxPartitionFectchBytes((-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder11.setSecurityProtocol("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = strBuilder11.setFetchMinBytes(100);
        java.lang.Class<?> wildcardClass18 = strBuilder17.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Cloneable, org.apache.storm.kafka.spout.Subscription> cloneableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, org.apache.storm.kafka.spout.Subscription> cloneableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, org.apache.storm.kafka.spout.Subscription>(cloneableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = ' ';
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 35;
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Iterable<java.lang.String>> strIterableSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.Subscription> subscriptionSerializableDeserializer2 = null;
        java.util.regex.Pattern pattern3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Iterable<java.lang.String>, org.apache.storm.kafka.spout.Subscription> strIterableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Iterable<java.lang.String>, org.apache.storm.kafka.spout.Subscription>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strIterableSerializableDeserializer1, subscriptionSerializableDeserializer2, pattern3);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.UNIT_TEST_RETRY_SERVICE = kafkaSpoutRetryService0;
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (short) 100;
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.util.ArrayList<java.lang.String>> genericDeclarationBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.util.ArrayList<java.lang.String>> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.util.ArrayList<java.lang.String>>(genericDeclarationBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.CharSequence> serializableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.CharSequence> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.CharSequence>(serializableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.util.Map<java.lang.String, java.lang.Object>> wildcardClassBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.util.Map<java.lang.String, java.lang.Object>>();
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (byte) 0;
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 0L;
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.util.regex.Pattern pattern3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, pattern3);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        strBuilder4.valueDes = strSerializableDeserializer5;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = strBuilder4.setRetry(kafkaSpoutRetryService7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.util.regex.Pattern pattern3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("", strSerializableDeserializer1, strSerializableDeserializer2, pattern3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = 97L;
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.UNIT_TEST_RETRY_SERVICE;
        org.junit.Assert.assertNull(kafkaSpoutRetryService0);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.Subscription> strComparableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.Subscription>();
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID = (short) 10;
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        strBuilder5.keyDes = strSerializableDeserializer6;
        long long8 = strBuilder5.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setMaxUncommittedOffsets((int) (byte) -1);
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setProp(properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(strBuilder10);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.util.AbstractList<java.lang.String>> firstPollOffsetStrategyBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.util.AbstractList<java.lang.String>> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.util.AbstractList<java.lang.String>>(firstPollOffsetStrategyBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = (byte) 10;
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable> firstPollOffsetStrategyEnumKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable>();
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.valueDesClazz;
        java.util.Properties properties7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = strBuilder5.setProp(properties7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        strBuilder5.keyDes = strSerializableDeserializer6;
        long long8 = strBuilder5.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setPollTimeoutMs((long) 0);
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = strBuilder12.setProp(properties13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, java.lang.Comparable<java.lang.String>> strListKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer2 = null;
        java.lang.String[] strArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", charSequenceSerializableDeserializer1, strComparableSerializableDeserializer2, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.Subscription> strBuilderBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.Subscription> strBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.Subscription>(strBuilderBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.Subscription subscription3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("", strSerializableDeserializer1, strSerializableDeserializer2, subscription3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>> strCollectionKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>>();
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.String[]> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.String[]>();
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("hi!", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass10 = strBuilder9.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Iterable<java.lang.String>, java.lang.String[]> strIterableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.lang.String[]> strIterableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.lang.String[]>(strIterableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long4 = strKafkaSpoutConfig0.getPollTimeoutMs();
        java.lang.Class<?> wildcardClass5 = strKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        strBuilder5.maxRetries = (byte) 100;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass10 = strBuilder5.valueDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setRetry(kafkaSpoutRetryService11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID = (byte) 100;
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = strBuilder5.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder11.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder19 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList17);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass20 = strBuilder19.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder19.firstPollOffsetStrategy = firstPollOffsetStrategy21;
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder28 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList26);
        strBuilder28.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = strBuilder28.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder32 = strBuilder19.setProp(strMap31);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder33 = strBuilder11.setProp(strMap31);
        org.apache.storm.kafka.spout.Subscription subscription34 = strBuilder11.subscription;
        java.lang.Class<?> wildcardClass35 = subscription34.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy21 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy21.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(subscription34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 35;
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID = (short) 0;
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, org.apache.storm.kafka.spout.Subscription> randomAccessKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, org.apache.storm.kafka.spout.Subscription>();
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps={bootstrap/servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.String[]> strKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.String[]>();
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 0;
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String[], java.lang.CharSequence> strArrayBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.lang.CharSequence> strArrayKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.lang.CharSequence>(strArrayBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.lang.Object> strCollectionBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.Object> strCollectionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.Object>(strCollectionBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Iterable<java.lang.String>> strIterableSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer2 = null;
        java.util.regex.Pattern pattern3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Iterable<java.lang.String>, java.lang.Comparable<java.lang.String>> strIterableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Iterable<java.lang.String>, java.lang.Comparable<java.lang.String>>("", strIterableSerializableDeserializer1, strComparableSerializableDeserializer2, pattern3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (byte) 10;
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.util.ArrayList<java.lang.String>> randomAccessKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.util.ArrayList<java.lang.String>>();
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strListKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (short) 1;
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.Subscription subscription3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, subscription3);
        strBuilder4.partitionRefreshPeriodMs = 0L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = strBuilder4.setRetry(kafkaSpoutRetryService7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Map<java.lang.String, java.lang.Object>, java.lang.reflect.GenericDeclaration> strMapBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.lang.reflect.GenericDeclaration> strMapKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.lang.reflect.GenericDeclaration>(strMapBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList9);
        strBuilder11.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = strBuilder11.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = strBuilder11.setPartitionRefreshPeriodMs((long) 1);
        int int17 = strBuilder16.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = strBuilder16.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = strBuilder16.setSecurityProtocol("hi!");
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder29 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList27);
        strBuilder29.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder35 = strBuilder29.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder37 = strBuilder35.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder43 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList41);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass44 = strBuilder43.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy45 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder43.firstPollOffsetStrategy = firstPollOffsetStrategy45;
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder52 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList50);
        strBuilder52.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap55 = strBuilder52.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder56 = strBuilder43.setProp(strMap55);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder57 = strBuilder35.setProp(strMap55);
        org.apache.storm.kafka.spout.Subscription subscription58 = strBuilder35.subscription;
        strBuilder23.subscription = subscription58;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder60 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer4, strSerializableDeserializer5, subscription58);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder61 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, subscription58);
        subscription58.refreshAssignment();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy45 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy45.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(subscription58);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("hi!", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID = (-1);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategySerializableDeserializer2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilder10 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>("", strSerializableDeserializer1, firstPollOffsetStrategySerializableDeserializer2, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>> strListBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>> strListKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>>(strListBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = 1L;
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder2 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = 141902646130682494L;
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.ArrayList<java.lang.String>> strListSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer3 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer5, strSerializableDeserializer6, (java.util.Collection<java.lang.String>) strList9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, java.lang.CharSequence> strListBuilder12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, java.lang.CharSequence>("hi!", strListSerializableDeserializer2, charSequenceSerializableDeserializer3, (java.util.Collection<java.lang.String>) strList9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder13.setBootstrapServers("");
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = strBuilder15.setProp(properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, java.lang.reflect.AnnotatedElement> strConsumerRecordFuncKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.lang.CharSequence> subscriptionKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.lang.CharSequence>();
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        strBuilder5.keyDes = strSerializableDeserializer6;
        strBuilder5.partitionRefreshPeriodMs = 141902646130682494L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = strBuilder5.setRetry(kafkaSpoutRetryService10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, strArray6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder8.setFetchMinBytes(10);
        java.lang.Class<?> wildcardClass11 = strBuilder8.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 10L;
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.reflect.GenericDeclaration> genericDeclarationSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Iterable<java.lang.String>> strIterableSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList9);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass12 = strBuilder11.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder11.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList18);
        strBuilder20.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = strBuilder20.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder24 = strBuilder11.setProp(strMap23);
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator25 = null;
        strBuilder11.translator = strRecordTranslator25;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig27 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator28 = strKafkaSpoutConfig27.translator;
        long long29 = strKafkaSpoutConfig27.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = strKafkaSpoutConfig27.kafkaProps;
        java.lang.String str31 = strKafkaSpoutConfig27.toString();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer32 = null;
        strKafkaSpoutConfig27.valueDes = objSerializableDeserializer32;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer35 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer36 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer38 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer39 = null;
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder45 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList43);
        strBuilder45.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = strBuilder45.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder50 = strBuilder45.setPartitionRefreshPeriodMs((long) 1);
        int int51 = strBuilder50.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder55 = strBuilder50.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder57 = strBuilder50.setSecurityProtocol("hi!");
        java.lang.String[] strArray60 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder63 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList61);
        strBuilder63.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder69 = strBuilder63.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder71 = strBuilder69.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray74 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder77 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList75);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass78 = strBuilder77.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy79 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder77.firstPollOffsetStrategy = firstPollOffsetStrategy79;
        java.lang.String[] strArray83 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder86 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList84);
        strBuilder86.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap89 = strBuilder86.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder90 = strBuilder77.setProp(strMap89);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder91 = strBuilder69.setProp(strMap89);
        org.apache.storm.kafka.spout.Subscription subscription92 = strBuilder69.subscription;
        strBuilder57.subscription = subscription92;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder94 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer38, strSerializableDeserializer39, subscription92);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder95 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer35, strSerializableDeserializer36, subscription92);
        strKafkaSpoutConfig27.subscription = subscription92;
        strBuilder11.subscription = subscription92;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder98 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer4, strSerializableDeserializer5, subscription92);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Iterable<java.lang.String>> genericDeclarationBuilder99 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Iterable<java.lang.String>>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", genericDeclarationSerializableDeserializer1, strIterableSerializableDeserializer2, subscription92);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy13 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy13.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNull(strRecordTranslator28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str31, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy79 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy79.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strMap89);
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(subscription92);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList7);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer2, strSerializableDeserializer3, (java.util.Collection<java.lang.String>) strList7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("", (java.util.Collection<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = strBuilder5.setMaxUncommittedOffsets(10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList14);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer17 = null;
        strBuilder16.keyDes = strSerializableDeserializer17;
        long long19 = strBuilder16.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = strBuilder16.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer23 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer24 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder30 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList28);
        strBuilder30.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = strBuilder30.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder35 = strBuilder30.setPartitionRefreshPeriodMs((long) 1);
        int int36 = strBuilder35.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder40 = strBuilder35.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder42 = strBuilder35.setSecurityProtocol("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder48 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList46);
        strBuilder48.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder54 = strBuilder48.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder56 = strBuilder54.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder62 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList60);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass63 = strBuilder62.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy64 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder62.firstPollOffsetStrategy = firstPollOffsetStrategy64;
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder71 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList69);
        strBuilder71.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap74 = strBuilder71.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder75 = strBuilder62.setProp(strMap74);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder76 = strBuilder54.setProp(strMap74);
        org.apache.storm.kafka.spout.Subscription subscription77 = strBuilder54.subscription;
        strBuilder42.subscription = subscription77;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder79 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer23, strSerializableDeserializer24, subscription77);
        strBuilder16.subscription = subscription77;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder81 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer9, strSerializableDeserializer10, subscription77);
        strBuilder5.subscription = subscription77;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass83 = strBuilder5.valueDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService84 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder85 = strBuilder5.setRetry(kafkaSpoutRetryService84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 141902646130682494L + "'", long19 == 141902646130682494L);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy64 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy64.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(subscription77);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder5.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPollTimeoutMs((long) 2147483647);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setPartitionRefreshPeriodMs(0L);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = strBuilder5.setRetry(kafkaSpoutRetryService13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy7 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy7.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.lang.reflect.GenericDeclaration> strIterableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.util.AbstractList<java.lang.String>> annotatedElementBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.util.AbstractList<java.lang.String>> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.util.AbstractList<java.lang.String>>(annotatedElementBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator4 = strKafkaSpoutConfig3.translator;
        long long5 = strKafkaSpoutConfig3.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = strKafkaSpoutConfig3.kafkaProps;
        java.lang.String str7 = strKafkaSpoutConfig3.toString();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer8 = null;
        strKafkaSpoutConfig3.valueDes = objSerializableDeserializer8;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer11 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer14 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer15 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList19);
        strBuilder21.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = strBuilder21.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder26 = strBuilder21.setPartitionRefreshPeriodMs((long) 1);
        int int27 = strBuilder26.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder31 = strBuilder26.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder33 = strBuilder26.setSecurityProtocol("hi!");
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder39 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList37);
        strBuilder39.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder45 = strBuilder39.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder47 = strBuilder45.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder53 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList51);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass54 = strBuilder53.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy55 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder53.firstPollOffsetStrategy = firstPollOffsetStrategy55;
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder62 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList60);
        strBuilder62.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap65 = strBuilder62.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder66 = strBuilder53.setProp(strMap65);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder67 = strBuilder45.setProp(strMap65);
        org.apache.storm.kafka.spout.Subscription subscription68 = strBuilder45.subscription;
        strBuilder33.subscription = subscription68;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder70 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer14, strSerializableDeserializer15, subscription68);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder71 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer11, strSerializableDeserializer12, subscription68);
        strKafkaSpoutConfig3.subscription = subscription68;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder73 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("", strSerializableDeserializer1, strSerializableDeserializer2, subscription68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strRecordTranslator4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str7, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy55 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy55.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(subscription68);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.Subscription subscription3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, subscription3);
        org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>> strConsumerRecordFunc5 = null;
        org.apache.storm.tuple.Fields fields6 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = strBuilder4.setRecordTranslator(strConsumerRecordFunc5, fields6, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder8.setProp(properties9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.util.List<java.lang.String>> strMapKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.util.List<java.lang.String>>();
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = 100;
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>();
        int int1 = strBuilder0.maxRetries;
        long long2 = strBuilder0.offsetCommitPeriodMs;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder5.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList12);
        strBuilder14.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = strBuilder14.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder5.setProp(strMap17);
        long long19 = strBuilder5.pollTimeoutMs;
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList23);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass26 = strBuilder25.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy27 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder25.firstPollOffsetStrategy = firstPollOffsetStrategy27;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder29 = strBuilder5.setFirstPollOffsetStrategy(firstPollOffsetStrategy27);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder35 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList33);
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator36 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder37 = strBuilder35.setRecordTranslator(strRecordTranslator36);
        strBuilder35.partitionRefreshPeriodMs = 35;
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = strBuilder35.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder41 = strBuilder29.setProp(strMap40);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder43 = strBuilder41.setRetry(kafkaSpoutRetryService42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy7 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy7.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy27 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy27.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strBuilder41);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = 0;
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = '4';
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strCollectionKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.lang.reflect.AnnotatedElement> strBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Subscription, java.util.Collection<java.lang.String>> subscriptionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Subscription, java.util.Collection<java.lang.String>>();
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 0;
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.Subscription subscription7 = strBuilder5.subscription;
        int int8 = strBuilder5.maxUncommittedOffsets;
        strBuilder5.partitionRefreshPeriodMs = '#';
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Iterable<java.lang.String>> firstPollOffsetStrategyEnumKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Iterable<java.lang.String>>();
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.AbstractCollection<java.lang.String>> strCollectionSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.Collection<java.lang.String>> strCollectionSerializableDeserializer6 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer8, strSerializableDeserializer9, (java.util.Collection<java.lang.String>) strList12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.util.Collection<java.lang.String>> strCollectionBuilder15 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.util.Collection<java.lang.String>>("hi!", strCollectionSerializableDeserializer5, strCollectionSerializableDeserializer6, (java.util.Collection<java.lang.String>) strList12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer2, strSerializableDeserializer3, (java.util.Collection<java.lang.String>) strList12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("", (java.util.Collection<java.lang.String>) strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = strBuilder5.setMaxUncommittedOffsets(10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList14);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer17 = null;
        strBuilder16.keyDes = strSerializableDeserializer17;
        long long19 = strBuilder16.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = strBuilder16.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer23 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer24 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder30 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList28);
        strBuilder30.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = strBuilder30.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder35 = strBuilder30.setPartitionRefreshPeriodMs((long) 1);
        int int36 = strBuilder35.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder40 = strBuilder35.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder42 = strBuilder35.setSecurityProtocol("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder48 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList46);
        strBuilder48.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder54 = strBuilder48.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder56 = strBuilder54.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder62 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList60);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass63 = strBuilder62.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy64 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder62.firstPollOffsetStrategy = firstPollOffsetStrategy64;
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder71 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList69);
        strBuilder71.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap74 = strBuilder71.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder75 = strBuilder62.setProp(strMap74);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder76 = strBuilder54.setProp(strMap74);
        org.apache.storm.kafka.spout.Subscription subscription77 = strBuilder54.subscription;
        strBuilder42.subscription = subscription77;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder79 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer23, strSerializableDeserializer24, subscription77);
        strBuilder16.subscription = subscription77;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder81 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer9, strSerializableDeserializer10, subscription77);
        strBuilder5.subscription = subscription77;
        strBuilder5.offsetCommitPeriodMs = '#';
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy64 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy64.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(subscription77);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.reflect.AnnotatedElement> annotatedElementSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.AbstractList<java.lang.String>> strListSerializableDeserializer2 = null;
        java.util.regex.Pattern pattern3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.util.AbstractList<java.lang.String>> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.util.AbstractList<java.lang.String>>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", annotatedElementSerializableDeserializer1, strListSerializableDeserializer2, pattern3);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.io.Serializable> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.io.Serializable>();
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = '4';
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strKafkaSpoutConfigSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.RandomAccess> randomAccessSerializableDeserializer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.util.RandomAccess> strKafkaSpoutConfigBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.util.RandomAccess>("", strKafkaSpoutConfigSerializableDeserializer1, randomAccessSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID = (byte) 1;
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.io.Serializable> strRecordTranslatorKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.io.Serializable>();
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, java.util.List<java.lang.String>> strConsumerRecordFuncKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, java.util.List<java.lang.String>>();
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setSecurityProtocol("hi!");
        java.lang.Class<?> wildcardClass13 = strBuilder5.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>> strBuilderSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.reflect.Type> typeSerializableDeserializer2 = null;
        java.util.regex.Pattern pattern3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.lang.reflect.Type> strBuilderBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.lang.reflect.Type>("KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strBuilderSerializableDeserializer1, typeSerializableDeserializer2, pattern3);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>> strBuilderSerializableDeserializer2 = null;
        java.util.regex.Pattern pattern3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>>("", serializableSerializableDeserializer1, strBuilderSerializableDeserializer2, pattern3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (short) -1;
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = ' ';
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 32;
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = strBuilder7.setGroupId("hi!");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = strBuilder9.keyDes;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNull(strSerializableDeserializer10);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        int int6 = strBuilder5.maxRetries;
        org.apache.storm.kafka.spout.Subscription subscription7 = strBuilder5.subscription;
        java.util.regex.Pattern pattern9 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", pattern9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig11 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int12 = strKafkaSpoutConfig11.getMaxTupleRetries();
        strKafkaSpoutConfig11.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig11.maxUncommittedOffsets = 35;
        strKafkaSpoutConfig11.maxUncommittedOffsets = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig19 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int20 = strKafkaSpoutConfig19.getMaxTupleRetries();
        long long21 = strKafkaSpoutConfig19.getPollTimeoutMs();
        strKafkaSpoutConfig19.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy24 = strKafkaSpoutConfig19.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator25 = strKafkaSpoutConfig19.getTranslator();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy26 = strKafkaSpoutConfig19.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig27 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int28 = strKafkaSpoutConfig27.getMaxTupleRetries();
        strKafkaSpoutConfig27.maxRetries = 1;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder36 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList34);
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = strBuilder36.kafkaProps;
        strKafkaSpoutConfig27.kafkaProps = strMap37;
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = strKafkaSpoutConfig27.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = strKafkaSpoutConfig27.kafkaProps;
        strKafkaSpoutConfig19.kafkaProps = strMap40;
        strKafkaSpoutConfig11.kafkaProps = strMap40;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder43 = strBuilder10.setProp(strMap40);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder44 = strBuilder5.setProp(strMap40);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer45 = null;
        strBuilder5.keyDes = strSerializableDeserializer45;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy24);
        org.junit.Assert.assertNull(strRecordTranslator25);
        org.junit.Assert.assertNull(firstPollOffsetStrategy26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder44);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object> firstPollOffsetStrategyEnumKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object>();
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.util.Map<java.lang.String, java.lang.Object>> strIterableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.util.Map<java.lang.String, java.lang.Object>>();
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID = 0;
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (short) -1;
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.util.AbstractCollection<java.lang.String>> annotatedElementBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.util.AbstractCollection<java.lang.String>> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.util.AbstractCollection<java.lang.String>>(annotatedElementBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.lang.CharSequence> strRecordTranslatorKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.lang.CharSequence>();
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> subscriptionKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = (byte) -1;
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID = '4';
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder5.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList12);
        strBuilder14.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = strBuilder14.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder5.setProp(strMap17);
        long long19 = strBuilder5.pollTimeoutMs;
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList23);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass26 = strBuilder25.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy27 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder25.firstPollOffsetStrategy = firstPollOffsetStrategy27;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder29 = strBuilder5.setFirstPollOffsetStrategy(firstPollOffsetStrategy27);
        java.lang.Class<?> wildcardClass30 = firstPollOffsetStrategy27.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy7 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy7.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy27 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy27.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = 35;
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.String>();
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.Subscription subscription7 = strBuilder5.subscription;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = strBuilder5.setMaxRetries((-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder5.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder5.setMaxPollRecords(2147483647);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Map<java.lang.String, java.lang.Object>, java.lang.Object> strMapBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.lang.Object> strMapKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.lang.Object>(strMapBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.util.RandomAccess> serializableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.util.RandomAccess> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.util.RandomAccess>(serializableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        strBuilder5.keyDes = strSerializableDeserializer6;
        long long8 = strBuilder5.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setPollTimeoutMs((long) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = strBuilder12.valueDes;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNull(strSerializableDeserializer13);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 100;
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray4);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder6 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strArray4);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList13);
        strBuilder15.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = strBuilder15.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = strBuilder15.setPartitionRefreshPeriodMs((long) 1);
        int int21 = strBuilder20.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = strBuilder20.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder27 = strBuilder20.setSecurityProtocol("hi!");
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder33 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList31);
        strBuilder33.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder39 = strBuilder33.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder41 = strBuilder39.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder47 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList45);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass48 = strBuilder47.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy49 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder47.firstPollOffsetStrategy = firstPollOffsetStrategy49;
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder56 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList54);
        strBuilder56.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap59 = strBuilder56.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder60 = strBuilder47.setProp(strMap59);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder61 = strBuilder39.setProp(strMap59);
        org.apache.storm.kafka.spout.Subscription subscription62 = strBuilder39.subscription;
        strBuilder27.subscription = subscription62;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder64 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer8, strSerializableDeserializer9, subscription62);
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder70 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList68);
        strBuilder70.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap73 = strBuilder70.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder75 = strBuilder70.setPartitionRefreshPeriodMs((long) 1);
        int int76 = strBuilder75.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder80 = strBuilder75.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig81 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int82 = strKafkaSpoutConfig81.getMaxTupleRetries();
        strKafkaSpoutConfig81.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService85 = strKafkaSpoutConfig81.retryService;
        java.lang.String[] strArray88 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList89 = new java.util.ArrayList<java.lang.String>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList89, strArray88);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder91 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList89);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass92 = strBuilder91.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy93 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder91.firstPollOffsetStrategy = firstPollOffsetStrategy93;
        strKafkaSpoutConfig81.firstPollOffsetStrategy = firstPollOffsetStrategy93;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder96 = strBuilder75.setFirstPollOffsetStrategy(firstPollOffsetStrategy93);
        strBuilder64.firstPollOffsetStrategy = firstPollOffsetStrategy93;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder98 = strBuilder6.setFirstPollOffsetStrategy(firstPollOffsetStrategy93);
        int int99 = strBuilder98.maxRetries;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy49 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy49.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(subscription62);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService85);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy93 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy93.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder96);
        org.junit.Assert.assertNotNull(strBuilder98);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 32 + "'", int99 == 32);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.String>(strComparableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator6 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = strBuilder5.setRecordTranslator(strRecordTranslator6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList11);
        strBuilder13.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = strBuilder13.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder13.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = strBuilder13.setSecurityProtocol("hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder22 = strBuilder13.setFetchMinBytes(2147483647);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig23 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig23.maxRetries = (short) 1;
        long long26 = strKafkaSpoutConfig23.offsetCommitPeriodMs;
        java.lang.String str27 = strKafkaSpoutConfig23.toString();
        int int28 = strKafkaSpoutConfig23.getMaxTupleRetries();
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder34 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList32);
        strBuilder34.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = strBuilder34.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder39 = strBuilder34.setPartitionRefreshPeriodMs((long) 1);
        int int40 = strBuilder39.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder44 = strBuilder39.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder46 = strBuilder39.setSecurityProtocol("hi!");
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder52 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList50);
        strBuilder52.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder58 = strBuilder52.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder60 = strBuilder58.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder66 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList64);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass67 = strBuilder66.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy68 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder66.firstPollOffsetStrategy = firstPollOffsetStrategy68;
        java.lang.String[] strArray72 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder75 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList73);
        strBuilder75.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap78 = strBuilder75.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder79 = strBuilder66.setProp(strMap78);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder80 = strBuilder58.setProp(strMap78);
        org.apache.storm.kafka.spout.Subscription subscription81 = strBuilder58.subscription;
        strBuilder46.subscription = subscription81;
        subscription81.refreshAssignment();
        strKafkaSpoutConfig23.subscription = subscription81;
        strBuilder13.subscription = subscription81;
        strBuilder5.subscription = subscription81;
        long long87 = strBuilder5.pollTimeoutMs;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str27, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy68 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy68.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strMap78);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(subscription81);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 100L + "'", long87 == 100L);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, java.lang.Class<?>> strListKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, java.lang.Class<?>>();
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.ArrayList<java.lang.String>> strListSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer6 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer8, strSerializableDeserializer9, (java.util.Collection<java.lang.String>) strList12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, java.lang.CharSequence> strListBuilder15 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, java.lang.CharSequence>("hi!", strListSerializableDeserializer5, charSequenceSerializableDeserializer6, (java.util.Collection<java.lang.String>) strList12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> firstPollOffsetStrategyEnumKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>>();
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.AbstractCollection<java.lang.String>> strCollectionSerializableDeserializer5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.util.AbstractCollection<java.lang.String>> strComparableBuilder11 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.util.AbstractCollection<java.lang.String>>("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strComparableSerializableDeserializer4, strCollectionSerializableDeserializer5, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("", strSerializableDeserializer1, strSerializableDeserializer2, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strBuilder10);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.ArrayList<java.lang.String>> strListSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer3 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer5, strSerializableDeserializer6, (java.util.Collection<java.lang.String>) strList9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, java.lang.CharSequence> strListBuilder12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, java.lang.CharSequence>("hi!", strListSerializableDeserializer2, charSequenceSerializableDeserializer3, (java.util.Collection<java.lang.String>) strList9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder13.setBootstrapServers("");
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = strBuilder13.setProp(properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = (byte) 1;
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.util.RandomAccess> strKafkaSpoutConfigKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.util.RandomAccess>();
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.String> typeKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.String>();
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.util.Map<java.lang.String, java.lang.Object>> charSequenceBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.util.Map<java.lang.String, java.lang.Object>> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.util.Map<java.lang.String, java.lang.Object>>(charSequenceBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer7 = null;
        strKafkaSpoutConfig0.keyDes = strSerializableDeserializer7;
        int int9 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.lang.String[]> strIterableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.lang.String[]>();
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = strBuilder5.setMaxUncommittedOffsets(10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList14);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer17 = null;
        strBuilder16.keyDes = strSerializableDeserializer17;
        long long19 = strBuilder16.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = strBuilder16.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer23 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer24 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder30 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList28);
        strBuilder30.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = strBuilder30.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder35 = strBuilder30.setPartitionRefreshPeriodMs((long) 1);
        int int36 = strBuilder35.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder40 = strBuilder35.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder42 = strBuilder35.setSecurityProtocol("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder48 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList46);
        strBuilder48.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder54 = strBuilder48.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder56 = strBuilder54.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder62 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList60);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass63 = strBuilder62.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy64 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder62.firstPollOffsetStrategy = firstPollOffsetStrategy64;
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder71 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList69);
        strBuilder71.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap74 = strBuilder71.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder75 = strBuilder62.setProp(strMap74);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder76 = strBuilder54.setProp(strMap74);
        org.apache.storm.kafka.spout.Subscription subscription77 = strBuilder54.subscription;
        strBuilder42.subscription = subscription77;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder79 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer23, strSerializableDeserializer24, subscription77);
        strBuilder16.subscription = subscription77;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder81 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer9, strSerializableDeserializer10, subscription77);
        strBuilder5.subscription = subscription77;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer83 = strBuilder5.keyDes;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy64 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy64.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(subscription77);
        org.junit.Assert.assertNull(strSerializableDeserializer83);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        strKafkaSpoutConfig0.pollTimeoutMs = 1;
        java.lang.Class<?> wildcardClass8 = strKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertNull(strRecordTranslator5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.lang.String str8 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = null;
        strKafkaSpoutConfig0.retryService = kafkaSpoutRetryService9;
        long long11 = strKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.Subscription subscription12 = strKafkaSpoutConfig0.subscription;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
        org.junit.Assert.assertNull(strRecordTranslator6);
        org.junit.Assert.assertNull(firstPollOffsetStrategy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str8, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(subscription12);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> subscriptionKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer1 = strKafkaSpoutConfig0.getValueDeserializer();
        int int2 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer4 = strKafkaSpoutConfig0.valueDes;
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList8);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass11 = strBuilder10.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder10.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder19 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList17);
        strBuilder19.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = strBuilder19.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = strBuilder10.setProp(strMap22);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy24 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder23.firstPollOffsetStrategy = firstPollOffsetStrategy24;
        strKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy24;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer27 = strKafkaSpoutConfig0.getValueDeserializer();
        strKafkaSpoutConfig0.pollTimeoutMs = 52;
        org.junit.Assert.assertNull(objDeserializer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(objSerializableDeserializer4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy24 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy24.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(objDeserializer27);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = 32;
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 'a';
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer7 = null;
        strKafkaSpoutConfig0.keyDes = strSerializableDeserializer7;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        strKafkaSpoutConfig0.keyDes = strSerializableDeserializer9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer12 = null;
        strKafkaSpoutConfig0.valueDes = objSerializableDeserializer12;
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy11);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = strBuilder7.setSSLKeystore("hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = strBuilder11.setSSLKeystore("KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = strBuilder14.setProp(properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Object> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Object>();
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.RandomAccess, java.util.List<java.lang.String>> randomAccessBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.RandomAccess, java.util.List<java.lang.String>>();
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer3 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer4 = strKafkaSpoutConfig0.valueDes;
        int int5 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList9);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer12 = null;
        strBuilder11.keyDes = strSerializableDeserializer12;
        long long14 = strBuilder11.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = strBuilder11.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer18 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer19 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList23);
        strBuilder25.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = strBuilder25.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder30 = strBuilder25.setPartitionRefreshPeriodMs((long) 1);
        int int31 = strBuilder30.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder35 = strBuilder30.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder37 = strBuilder30.setSecurityProtocol("hi!");
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder43 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList41);
        strBuilder43.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder49 = strBuilder43.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder51 = strBuilder49.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder57 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList55);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass58 = strBuilder57.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy59 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder57.firstPollOffsetStrategy = firstPollOffsetStrategy59;
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder66 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList64);
        strBuilder66.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap69 = strBuilder66.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder70 = strBuilder57.setProp(strMap69);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder71 = strBuilder49.setProp(strMap69);
        org.apache.storm.kafka.spout.Subscription subscription72 = strBuilder49.subscription;
        strBuilder37.subscription = subscription72;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder74 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer18, strSerializableDeserializer19, subscription72);
        strBuilder11.subscription = subscription72;
        strKafkaSpoutConfig0.subscription = subscription72;
        long long77 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 35;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strRecordTranslator1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(strDeserializer3);
        org.junit.Assert.assertNull(objSerializableDeserializer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy59 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy59.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(subscription72);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = strBuilder5.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder11.setMaxPartitionFectchBytes((-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder11.setSecurityProtocol("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = strBuilder11.setProp(properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyEnumSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String[]> strArraySerializableDeserializer2 = null;
        java.util.regex.Pattern pattern3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String[]> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String[]>("KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", firstPollOffsetStrategyEnumSerializableDeserializer1, strArraySerializableDeserializer2, pattern3);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.util.AbstractCollection<java.lang.String>> strCollectionKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.util.AbstractCollection<java.lang.String>>();
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strKafkaSpoutConfigSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.reflect.AnnotatedElement> annotatedElementSerializableDeserializer2 = null;
        java.lang.String[] strArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.reflect.AnnotatedElement> strKafkaSpoutConfigBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.reflect.AnnotatedElement>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strKafkaSpoutConfigSerializableDeserializer1, annotatedElementSerializableDeserializer2, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID = (short) -1;
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.reflect.AnnotatedElement> annotatedElementSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> strConsumerRecordFuncSerializableDeserializer3 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.Collection<java.lang.String>> strCollectionSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.AbstractList<java.lang.String>> strListSerializableDeserializer13 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, java.util.AbstractList<java.lang.String>> strCollectionBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, java.util.AbstractList<java.lang.String>>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strCollectionSerializableDeserializer12, strListSerializableDeserializer13, strArray15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer9, strSerializableDeserializer10, strArray15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strArray15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder19 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer5, strSerializableDeserializer6, strArray15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> annotatedElementBuilder20 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", annotatedElementSerializableDeserializer2, strConsumerRecordFuncSerializableDeserializer3, strArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strBuilder18);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator6 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = strBuilder5.setRecordTranslator(strRecordTranslator6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList11);
        strBuilder13.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = strBuilder13.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder13.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = strBuilder13.setSecurityProtocol("hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder22 = strBuilder13.setFetchMinBytes(2147483647);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig23 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig23.maxRetries = (short) 1;
        long long26 = strKafkaSpoutConfig23.offsetCommitPeriodMs;
        java.lang.String str27 = strKafkaSpoutConfig23.toString();
        int int28 = strKafkaSpoutConfig23.getMaxTupleRetries();
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder34 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList32);
        strBuilder34.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = strBuilder34.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder39 = strBuilder34.setPartitionRefreshPeriodMs((long) 1);
        int int40 = strBuilder39.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder44 = strBuilder39.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder46 = strBuilder39.setSecurityProtocol("hi!");
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder52 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList50);
        strBuilder52.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder58 = strBuilder52.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder60 = strBuilder58.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder66 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList64);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass67 = strBuilder66.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy68 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder66.firstPollOffsetStrategy = firstPollOffsetStrategy68;
        java.lang.String[] strArray72 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder75 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList73);
        strBuilder75.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap78 = strBuilder75.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder79 = strBuilder66.setProp(strMap78);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder80 = strBuilder58.setProp(strMap78);
        org.apache.storm.kafka.spout.Subscription subscription81 = strBuilder58.subscription;
        strBuilder46.subscription = subscription81;
        subscription81.refreshAssignment();
        strKafkaSpoutConfig23.subscription = subscription81;
        strBuilder13.subscription = subscription81;
        strBuilder5.subscription = subscription81;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder89 = strBuilder5.setSSLKeystore("", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder91 = strBuilder5.setMaxPartitionFectchBytes((int) (byte) -1);
        java.util.Properties properties92 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder93 = strBuilder5.setProp(properties92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str27, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy68 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy68.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strMap78);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(subscription81);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder91);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, java.lang.reflect.GenericDeclaration> strListKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList6);
        strBuilder9.pollTimeoutMs = 2147483647;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer14 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder19 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray18);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer13, strSerializableDeserializer14, strArray18);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder22 = strBuilder20.setGroupId("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator23 = strBuilder20.translator;
        org.apache.storm.tuple.Fields fields24 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder26 = strBuilder9.setRecordTranslator((org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>) strRecordTranslator23, fields24, "");
        java.lang.Class<?> wildcardClass27 = strRecordTranslator23.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strRecordTranslator23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (-1L);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = '4';
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.lang.reflect.GenericDeclaration> strArrayKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxRetries = 1;
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList7);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = strBuilder9.kafkaProps;
        strKafkaSpoutConfig0.kafkaProps = strMap10;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = strKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer13 = null;
        strKafkaSpoutConfig0.valueDes = objSerializableDeserializer13;
        long long15 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer16 = null;
        strKafkaSpoutConfig0.valueDes = objSerializableDeserializer16;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 32;
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> genericDeclarationBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(genericDeclarationBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        strBuilder5.keyDes = strSerializableDeserializer6;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        long long9 = strBuilder5.pollTimeoutMs;
        strBuilder5.maxRetries = (short) 100;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps={enable/auto/commit=false, bootstrap/servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strIterableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractList<java.lang.String>, java.lang.reflect.GenericDeclaration> strListBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, java.lang.reflect.GenericDeclaration> strListKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, java.lang.reflect.GenericDeclaration>(strListBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = '4';
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>>();
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.util.AbstractList<java.lang.String>> genericDeclarationKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.util.AbstractList<java.lang.String>>();
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, strArray6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder8.setGroupId("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList14);
        strBuilder16.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = strBuilder16.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = strBuilder16.setPartitionRefreshPeriodMs((long) 1);
        int int22 = strBuilder21.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder26 = strBuilder21.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig27 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int28 = strKafkaSpoutConfig27.getMaxTupleRetries();
        strKafkaSpoutConfig27.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService31 = strKafkaSpoutConfig27.retryService;
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder37 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList35);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass38 = strBuilder37.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy39 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder37.firstPollOffsetStrategy = firstPollOffsetStrategy39;
        strKafkaSpoutConfig27.firstPollOffsetStrategy = firstPollOffsetStrategy39;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder42 = strBuilder21.setFirstPollOffsetStrategy(firstPollOffsetStrategy39);
        strBuilder8.firstPollOffsetStrategy = firstPollOffsetStrategy39;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig44 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int45 = strKafkaSpoutConfig44.getMaxTupleRetries();
        strKafkaSpoutConfig44.maxRetries = 1;
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder53 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList51);
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = strBuilder53.kafkaProps;
        strKafkaSpoutConfig44.kafkaProps = strMap54;
        strBuilder8.kafkaProps = strMap54;
        java.lang.Class<?> wildcardClass57 = strBuilder8.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy39 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy39.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.lang.Object> strMapKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.lang.Object>();
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList6);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass9 = strBuilder8.keyDesClazz;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass10 = strBuilder8.valueDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = strBuilder8.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.Subscription subscription12 = strBuilder8.subscription;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, subscription12);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder13.setRetry(kafkaSpoutRetryService14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy11 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy11.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = null;
        strKafkaSpoutConfig0.translator = strRecordTranslator5;
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strKafkaSpoutConfig0.getKafkaProps();
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str7, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String[], org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strArrayBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strArrayKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>>(strArrayBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Iterable<java.lang.String>> strIterableSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.List<java.lang.String>> strListSerializableDeserializer2 = null;
        java.util.regex.Pattern pattern3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Iterable<java.lang.String>, java.util.List<java.lang.String>> strIterableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Iterable<java.lang.String>, java.util.List<java.lang.String>>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strIterableSerializableDeserializer1, strListSerializableDeserializer2, pattern3);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, java.util.Map<java.lang.String, java.lang.Object>> strListKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, java.util.Map<java.lang.String, java.lang.Object>>();
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.AbstractCollection<java.lang.String>> strCollectionSerializableDeserializer5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.util.AbstractCollection<java.lang.String>> strComparableBuilder11 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.util.AbstractCollection<java.lang.String>>("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strComparableSerializableDeserializer4, strCollectionSerializableDeserializer5, strArray9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, strArray9);
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = strBuilder12.setProp(properties13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strBuilder10);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.lang.String[] strArray4 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("", strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Class<?>> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Class<?>>();
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractList<java.lang.String>, java.lang.String> strListBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, java.lang.String> strListKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, java.lang.String>(strListBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList6);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass9 = strBuilder8.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder8.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList15);
        strBuilder17.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = strBuilder17.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = strBuilder8.setProp(strMap20);
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator22 = null;
        strBuilder8.translator = strRecordTranslator22;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig24 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator25 = strKafkaSpoutConfig24.translator;
        long long26 = strKafkaSpoutConfig24.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = strKafkaSpoutConfig24.kafkaProps;
        java.lang.String str28 = strKafkaSpoutConfig24.toString();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer29 = null;
        strKafkaSpoutConfig24.valueDes = objSerializableDeserializer29;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer32 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer33 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer35 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer36 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder42 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList40);
        strBuilder42.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = strBuilder42.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder47 = strBuilder42.setPartitionRefreshPeriodMs((long) 1);
        int int48 = strBuilder47.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder52 = strBuilder47.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder54 = strBuilder47.setSecurityProtocol("hi!");
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder60 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList58);
        strBuilder60.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder66 = strBuilder60.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder68 = strBuilder66.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder74 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList72);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass75 = strBuilder74.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy76 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder74.firstPollOffsetStrategy = firstPollOffsetStrategy76;
        java.lang.String[] strArray80 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder83 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList81);
        strBuilder83.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap86 = strBuilder83.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder87 = strBuilder74.setProp(strMap86);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder88 = strBuilder66.setProp(strMap86);
        org.apache.storm.kafka.spout.Subscription subscription89 = strBuilder66.subscription;
        strBuilder54.subscription = subscription89;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder91 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer35, strSerializableDeserializer36, subscription89);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder92 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer32, strSerializableDeserializer33, subscription89);
        strKafkaSpoutConfig24.subscription = subscription89;
        strBuilder8.subscription = subscription89;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder95 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, subscription89);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder99 = strBuilder95.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy10 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy10.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNull(strRecordTranslator25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str28, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy76 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy76.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strMap86);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(subscription89);
        org.junit.Assert.assertNotNull(strBuilder99);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 'a';
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPartitionRefreshPeriodMs((long) 1);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList14);
        strBuilder16.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = strBuilder16.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = strBuilder16.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = strBuilder16.setSecurityProtocol("hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = strBuilder16.setFetchMinBytes(2147483647);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig26 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig26.maxRetries = (short) 1;
        long long29 = strKafkaSpoutConfig26.offsetCommitPeriodMs;
        java.lang.String str30 = strKafkaSpoutConfig26.toString();
        int int31 = strKafkaSpoutConfig26.getMaxTupleRetries();
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder37 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList35);
        strBuilder37.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = strBuilder37.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder42 = strBuilder37.setPartitionRefreshPeriodMs((long) 1);
        int int43 = strBuilder42.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder47 = strBuilder42.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder49 = strBuilder42.setSecurityProtocol("hi!");
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder55 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList53);
        strBuilder55.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder61 = strBuilder55.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder63 = strBuilder61.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray66 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder69 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList67);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass70 = strBuilder69.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy71 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder69.firstPollOffsetStrategy = firstPollOffsetStrategy71;
        java.lang.String[] strArray75 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder78 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList76);
        strBuilder78.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap81 = strBuilder78.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder82 = strBuilder69.setProp(strMap81);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder83 = strBuilder61.setProp(strMap81);
        org.apache.storm.kafka.spout.Subscription subscription84 = strBuilder61.subscription;
        strBuilder49.subscription = subscription84;
        subscription84.refreshAssignment();
        strKafkaSpoutConfig26.subscription = subscription84;
        strBuilder16.subscription = subscription84;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator89 = strBuilder16.translator;
        org.apache.storm.tuple.Fields fields90 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder91 = strBuilder10.setRecordTranslator((org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>) strRecordTranslator89, fields90);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder93 = strBuilder91.setGroupId("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder95 = strBuilder91.setBootstrapServers("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder97 = strBuilder91.setMaxPollRecords(32);
        long long98 = strBuilder91.pollTimeoutMs;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str30, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy71 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy71.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(subscription84);
        org.junit.Assert.assertNotNull(strRecordTranslator89);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder93);
        org.junit.Assert.assertNotNull(strBuilder95);
        org.junit.Assert.assertNotNull(strBuilder97);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + (-1L) + "'", long98 == (-1L));
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, strArray6);
        strBuilder8.maxRetries = '#';
        long long11 = strBuilder8.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer12 = strBuilder8.valueDes;
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(strSerializableDeserializer12);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strListBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strListKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>>(strListBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.RandomAccess, java.lang.reflect.AnnotatedElement> randomAccessBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.RandomAccess, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer3 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer4 = strKafkaSpoutConfig0.valueDes;
        int int5 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList9);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer12 = null;
        strBuilder11.keyDes = strSerializableDeserializer12;
        long long14 = strBuilder11.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = strBuilder11.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer18 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer19 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList23);
        strBuilder25.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = strBuilder25.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder30 = strBuilder25.setPartitionRefreshPeriodMs((long) 1);
        int int31 = strBuilder30.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder35 = strBuilder30.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder37 = strBuilder30.setSecurityProtocol("hi!");
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder43 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList41);
        strBuilder43.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder49 = strBuilder43.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder51 = strBuilder49.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder57 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList55);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass58 = strBuilder57.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy59 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder57.firstPollOffsetStrategy = firstPollOffsetStrategy59;
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder66 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList64);
        strBuilder66.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap69 = strBuilder66.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder70 = strBuilder57.setProp(strMap69);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder71 = strBuilder49.setProp(strMap69);
        org.apache.storm.kafka.spout.Subscription subscription72 = strBuilder49.subscription;
        strBuilder37.subscription = subscription72;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder74 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer18, strSerializableDeserializer19, subscription72);
        strBuilder11.subscription = subscription72;
        strKafkaSpoutConfig0.subscription = subscription72;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService77 = strKafkaSpoutConfig0.getRetryService();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strRecordTranslator1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(strDeserializer3);
        org.junit.Assert.assertNull(objSerializableDeserializer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy59 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy59.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(subscription72);
        org.junit.Assert.assertNull(kafkaSpoutRetryService77);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>> strConsumerRecordFunc7 = null;
        org.apache.storm.tuple.Fields fields8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setRecordTranslator(strConsumerRecordFunc7, fields8, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        long long11 = strBuilder5.pollTimeoutMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass12 = strBuilder5.valueDesClazz;
        long long13 = strBuilder5.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder5.setMaxPartitionFectchBytes((int) (short) 100);
        strBuilder5.partitionRefreshPeriodMs = 'a';
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> firstPollOffsetStrategyBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>>(firstPollOffsetStrategyBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> strListBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> strListKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>>(strListBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = strKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = strKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = strKafkaSpoutConfig0.getValueDeserializer();
        java.lang.Class<?> wildcardClass8 = strKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertNull(strRecordTranslator1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str4, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(objDeserializer6);
        org.junit.Assert.assertNull(objDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 52;
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(charSequenceBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, java.util.List<java.lang.String>> strListKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, java.util.List<java.lang.String>>();
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 30000L;
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (short) 0;
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String[]> strArraySerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.Collection<java.lang.String>> strCollectionSerializableDeserializer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList6);
        strBuilder8.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = strBuilder8.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder8.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder8.setSecurityProtocol("hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = strBuilder8.setFetchMinBytes(2147483647);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig18 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig18.maxRetries = (short) 1;
        long long21 = strKafkaSpoutConfig18.offsetCommitPeriodMs;
        java.lang.String str22 = strKafkaSpoutConfig18.toString();
        int int23 = strKafkaSpoutConfig18.getMaxTupleRetries();
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder29 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList27);
        strBuilder29.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = strBuilder29.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder34 = strBuilder29.setPartitionRefreshPeriodMs((long) 1);
        int int35 = strBuilder34.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder39 = strBuilder34.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder41 = strBuilder34.setSecurityProtocol("hi!");
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder47 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList45);
        strBuilder47.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder53 = strBuilder47.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder55 = strBuilder53.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder61 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList59);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass62 = strBuilder61.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy63 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder61.firstPollOffsetStrategy = firstPollOffsetStrategy63;
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder70 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList68);
        strBuilder70.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap73 = strBuilder70.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder74 = strBuilder61.setProp(strMap73);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder75 = strBuilder53.setProp(strMap73);
        org.apache.storm.kafka.spout.Subscription subscription76 = strBuilder53.subscription;
        strBuilder41.subscription = subscription76;
        subscription76.refreshAssignment();
        strKafkaSpoutConfig18.subscription = subscription76;
        strBuilder8.subscription = subscription76;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String[], java.util.Collection<java.lang.String>> strArrayBuilder81 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String[], java.util.Collection<java.lang.String>>("", strArraySerializableDeserializer1, strCollectionSerializableDeserializer2, subscription76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str22, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy63 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy63.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(subscription76);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.util.AbstractCollection<java.lang.String>> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.util.AbstractCollection<java.lang.String>>();
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPartitionRefreshPeriodMs((long) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer12 = strBuilder5.keyDes;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(strSerializableDeserializer12);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Cloneable, java.util.ArrayList<java.lang.String>> cloneableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, java.util.ArrayList<java.lang.String>> cloneableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, java.util.ArrayList<java.lang.String>>(cloneableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, org.apache.storm.kafka.spout.Subscription> strKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, org.apache.storm.kafka.spout.Subscription>();
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.lang.reflect.AnnotatedElement> strBuilderBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.lang.reflect.AnnotatedElement> strBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.lang.reflect.AnnotatedElement>(strBuilderBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.util.List<java.lang.String>> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.util.List<java.lang.String>>();
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        strBuilder5.keyDes = strSerializableDeserializer6;
        long long8 = strBuilder5.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator11 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setRecordTranslator(strRecordTranslator11);
        strBuilder5.partitionRefreshPeriodMs = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder5.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer20 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer21 = null;
        org.apache.storm.kafka.spout.Subscription subscription22 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer20, strSerializableDeserializer21, subscription22);
        strBuilder23.partitionRefreshPeriodMs = 0L;
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder31 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList29);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass32 = strBuilder31.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy33 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder31.firstPollOffsetStrategy = firstPollOffsetStrategy33;
        strBuilder23.firstPollOffsetStrategy = firstPollOffsetStrategy33;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder36 = strBuilder5.setFirstPollOffsetStrategy(firstPollOffsetStrategy33);
        strBuilder36.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer39 = null;
        strBuilder36.keyDes = strSerializableDeserializer39;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy33 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy33.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder36);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.lang.reflect.Type> strRecordTranslatorKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.lang.reflect.Type>();
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Subscription, java.lang.Cloneable> subscriptionBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.lang.Cloneable> subscriptionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.lang.Cloneable>(subscriptionBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "hi!", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer4, strSerializableDeserializer5, (java.util.Collection<java.lang.String>) strList13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray3);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        strBuilder4.keyDes = strSerializableDeserializer5;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer7 = null;
        strBuilder4.keyDes = strSerializableDeserializer7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder4.setSecurityProtocol("");
        long long11 = strBuilder4.partitionRefreshPeriodMs;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPartitionRefreshPeriodMs((long) 1);
        int int11 = strBuilder10.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder10.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = strBuilder10.setSecurityProtocol("hi!");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer18 = null;
        strBuilder17.keyDes = strSerializableDeserializer18;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = strBuilder17.setGroupId("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = strBuilder21.setMaxPollRecords((int) (short) -1);
        strBuilder21.pollTimeoutMs = (byte) 100;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, java.lang.String> strListKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, java.lang.String>();
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setSecurityProtocol("hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList16);
        strBuilder18.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = strBuilder18.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = strBuilder18.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = strBuilder18.setSecurityProtocol("hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder27 = strBuilder18.setFetchMinBytes(2147483647);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig28 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig28.maxRetries = (short) 1;
        long long31 = strKafkaSpoutConfig28.offsetCommitPeriodMs;
        java.lang.String str32 = strKafkaSpoutConfig28.toString();
        int int33 = strKafkaSpoutConfig28.getMaxTupleRetries();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder39 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList37);
        strBuilder39.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = strBuilder39.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder44 = strBuilder39.setPartitionRefreshPeriodMs((long) 1);
        int int45 = strBuilder44.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder49 = strBuilder44.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder51 = strBuilder44.setSecurityProtocol("hi!");
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder57 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList55);
        strBuilder57.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder63 = strBuilder57.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder65 = strBuilder63.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder71 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList69);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass72 = strBuilder71.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy73 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder71.firstPollOffsetStrategy = firstPollOffsetStrategy73;
        java.lang.String[] strArray77 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder80 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList78);
        strBuilder80.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap83 = strBuilder80.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder84 = strBuilder71.setProp(strMap83);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder85 = strBuilder63.setProp(strMap83);
        org.apache.storm.kafka.spout.Subscription subscription86 = strBuilder63.subscription;
        strBuilder51.subscription = subscription86;
        subscription86.refreshAssignment();
        strKafkaSpoutConfig28.subscription = subscription86;
        strBuilder18.subscription = subscription86;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator91 = strBuilder18.translator;
        org.apache.storm.tuple.Fields fields92 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder94 = strBuilder5.setRecordTranslator((org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>) strRecordTranslator91, fields92, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        java.util.Map<java.lang.String, java.lang.Object> strMap95 = strBuilder94.kafkaProps;
        java.util.Properties properties96 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder97 = strBuilder94.setProp(properties96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str32, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy73 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy73.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strMap83);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(subscription86);
        org.junit.Assert.assertNotNull(strRecordTranslator91);
        org.junit.Assert.assertNotNull(strBuilder94);
        org.junit.Assert.assertNotNull(strMap95);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.util.AbstractList<java.lang.String>> charSequenceKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.util.AbstractList<java.lang.String>>();
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.Object>> strRecordTranslatorBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.Object>> strRecordTranslatorKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.Object>>(strRecordTranslatorBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = strBuilder7.setSSLKeystore("hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        long long12 = strBuilder11.partitionRefreshPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass13 = strBuilder11.keyDesClazz;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertNull(wildcardClass13);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator6 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = strBuilder5.setRecordTranslator(strRecordTranslator6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = strBuilder5.setBootstrapServers("");
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass10 = strBuilder5.keyDesClazz;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig8 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int9 = strKafkaSpoutConfig8.getMaxTupleRetries();
        strKafkaSpoutConfig8.maxRetries = 1;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList15);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = strBuilder17.kafkaProps;
        strKafkaSpoutConfig8.kafkaProps = strMap18;
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = strKafkaSpoutConfig8.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = strKafkaSpoutConfig8.kafkaProps;
        strKafkaSpoutConfig0.kafkaProps = strMap21;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer23 = strKafkaSpoutConfig0.valueDes;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
        org.junit.Assert.assertNull(strRecordTranslator6);
        org.junit.Assert.assertNull(firstPollOffsetStrategy7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(objSerializableDeserializer23);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (byte) 0;
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.String[]> typeKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.String[]>();
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer8, strSerializableDeserializer9, (java.util.Collection<java.lang.String>) strList12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer5, strSerializableDeserializer6, (java.util.Collection<java.lang.String>) strList12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", (java.util.Collection<java.lang.String>) strList12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Subscription, java.lang.CharSequence> subscriptionBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.lang.CharSequence> subscriptionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.lang.CharSequence>(subscriptionBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        java.lang.String str3 = strKafkaSpoutConfig0.toString();
        long long4 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str3, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxRetries = 1;
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList7);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = strBuilder9.kafkaProps;
        strKafkaSpoutConfig0.kafkaProps = strMap10;
        java.lang.String str12 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.Subscription subscription13 = strKafkaSpoutConfig0.subscription;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str12, "KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNull(subscription13);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.RandomAccess, java.lang.String[]> randomAccessBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.lang.String[]> randomAccessKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.lang.String[]>(randomAccessBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strMapKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID = 35L;
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID = 0L;
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.util.Collection<java.lang.String> strCollection3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=100, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, strCollection3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.reflect.Type> strCollectionKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.reflect.Type>();
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.lang.CharSequence> strCollectionBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.CharSequence> strCollectionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.CharSequence>(strCollectionBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer1 = strKafkaSpoutConfig0.getValueDeserializer();
        int int2 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer4 = strKafkaSpoutConfig0.valueDes;
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList8);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass11 = strBuilder10.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder10.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder19 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList17);
        strBuilder19.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = strBuilder19.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = strBuilder10.setProp(strMap22);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy24 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder23.firstPollOffsetStrategy = firstPollOffsetStrategy24;
        strKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy24;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer27 = strKafkaSpoutConfig0.getKeyDeserializer();
        strKafkaSpoutConfig0.maxRetries = '#';
        org.junit.Assert.assertNull(objDeserializer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(objSerializableDeserializer4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy24 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy24.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strDeserializer27);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer2, strSerializableDeserializer3, (java.util.Collection<java.lang.String>) strList7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("", (java.util.Collection<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = strBuilder5.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder11.setMaxPartitionFectchBytes((-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder11.setMaxPollRecords(100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = strBuilder15.setMaxPollRecords((int) ' ');
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig18 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator19 = strKafkaSpoutConfig18.translator;
        long long20 = strKafkaSpoutConfig18.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = strKafkaSpoutConfig18.kafkaProps;
        java.lang.String str22 = strKafkaSpoutConfig18.toString();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer23 = null;
        strKafkaSpoutConfig18.valueDes = objSerializableDeserializer23;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer26 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer27 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer29 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder36 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList34);
        strBuilder36.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = strBuilder36.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder41 = strBuilder36.setPartitionRefreshPeriodMs((long) 1);
        int int42 = strBuilder41.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder46 = strBuilder41.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder48 = strBuilder41.setSecurityProtocol("hi!");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder54 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList52);
        strBuilder54.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder60 = strBuilder54.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder62 = strBuilder60.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder68 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList66);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass69 = strBuilder68.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy70 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder68.firstPollOffsetStrategy = firstPollOffsetStrategy70;
        java.lang.String[] strArray74 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder77 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList75);
        strBuilder77.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap80 = strBuilder77.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder81 = strBuilder68.setProp(strMap80);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder82 = strBuilder60.setProp(strMap80);
        org.apache.storm.kafka.spout.Subscription subscription83 = strBuilder60.subscription;
        strBuilder48.subscription = subscription83;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder85 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer29, strSerializableDeserializer30, subscription83);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder86 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer26, strSerializableDeserializer27, subscription83);
        strKafkaSpoutConfig18.subscription = subscription83;
        strBuilder15.subscription = subscription83;
        java.lang.Class<?> wildcardClass89 = strBuilder15.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNull(strRecordTranslator19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str22, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy70 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy70.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strMap80);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(subscription83);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (short) 0;
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>> strBuilderBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>> strBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>>(strBuilderBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        strBuilder5.maxRetries = (byte) 100;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass10 = strBuilder5.valueDesClazz;
        strBuilder5.pollTimeoutMs = 35;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, java.lang.String[]> strListKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, java.lang.String[]>();
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.util.AbstractCollection<java.lang.String>> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.util.AbstractCollection<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = objKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.util.Collection<java.lang.String>> strMapKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.util.Collection<java.lang.String>>();
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass7 = strBuilder5.valueDesClazz;
        strBuilder5.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.String> strKafkaSpoutConfig10 = strBuilder5.build();
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setProp(properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strKafkaSpoutConfig10);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 0L;
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Iterable<java.lang.String>> objBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Iterable<java.lang.String>> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Iterable<java.lang.String>>(objBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Map<java.lang.String, java.lang.Object>, java.lang.reflect.AnnotatedElement> strMapBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Map<java.lang.String, java.lang.Object>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type> firstPollOffsetStrategyEnumKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type>();
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Object> charSequenceBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Object> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Object>(charSequenceBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
        strKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass8 = strKafkaSpoutConfig0.valueDesClazz;
        org.junit.Assert.assertNull(strRecordTranslator1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str4, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST));
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.Subscription subscription3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, subscription3);
        org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>> strConsumerRecordFunc5 = null;
        org.apache.storm.tuple.Fields fields6 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = strBuilder4.setRecordTranslator(strConsumerRecordFunc5, fields6, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer10, strSerializableDeserializer11, strArray15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder19 = strBuilder17.setGroupId("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList23);
        strBuilder25.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = strBuilder25.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder30 = strBuilder25.setPartitionRefreshPeriodMs((long) 1);
        int int31 = strBuilder30.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder35 = strBuilder30.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig36 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int37 = strKafkaSpoutConfig36.getMaxTupleRetries();
        strKafkaSpoutConfig36.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService40 = strKafkaSpoutConfig36.retryService;
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder46 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList44);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass47 = strBuilder46.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy48 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder46.firstPollOffsetStrategy = firstPollOffsetStrategy48;
        strKafkaSpoutConfig36.firstPollOffsetStrategy = firstPollOffsetStrategy48;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder51 = strBuilder30.setFirstPollOffsetStrategy(firstPollOffsetStrategy48);
        strBuilder17.firstPollOffsetStrategy = firstPollOffsetStrategy48;
        strBuilder4.firstPollOffsetStrategy = firstPollOffsetStrategy48;
        java.util.Properties properties54 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder55 = strBuilder4.setProp(properties54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy48 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy48.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder51);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer4, strSerializableDeserializer5, strArray9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, strArray9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder12.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        java.lang.Class<?> wildcardClass15 = firstPollOffsetStrategy13.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy13 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy13.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList6);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        strBuilder8.keyDes = strSerializableDeserializer9;
        long long11 = strBuilder8.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder8.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer15 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer16 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder22 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList20);
        strBuilder22.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = strBuilder22.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder27 = strBuilder22.setPartitionRefreshPeriodMs((long) 1);
        int int28 = strBuilder27.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder32 = strBuilder27.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder34 = strBuilder27.setSecurityProtocol("hi!");
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder40 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList38);
        strBuilder40.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder46 = strBuilder40.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder48 = strBuilder46.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder54 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList52);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass55 = strBuilder54.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy56 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder54.firstPollOffsetStrategy = firstPollOffsetStrategy56;
        java.lang.String[] strArray60 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder63 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList61);
        strBuilder63.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap66 = strBuilder63.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder67 = strBuilder54.setProp(strMap66);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder68 = strBuilder46.setProp(strMap66);
        org.apache.storm.kafka.spout.Subscription subscription69 = strBuilder46.subscription;
        strBuilder34.subscription = subscription69;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder71 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer15, strSerializableDeserializer16, subscription69);
        strBuilder8.subscription = subscription69;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder73 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("", strSerializableDeserializer1, strSerializableDeserializer2, subscription69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy56 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy56.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(subscription69);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.Type>();
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.util.AbstractCollection<java.lang.String>> firstPollOffsetStrategyKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.util.AbstractCollection<java.lang.String>>();
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.ArrayList<java.lang.String>> strListSerializableDeserializer2 = null;
        java.util.regex.Pattern pattern3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.util.ArrayList<java.lang.String>> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.util.ArrayList<java.lang.String>>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", objSerializableDeserializer1, strListSerializableDeserializer2, pattern3);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = strBuilder5.keyDes;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setRetry(kafkaSpoutRetryService9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNull(strSerializableDeserializer8);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = strKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer9 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        strKafkaSpoutConfig0.retryService = kafkaSpoutRetryService10;
        strKafkaSpoutConfig0.pollTimeoutMs = 0L;
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str7, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNull(objDeserializer8);
        org.junit.Assert.assertNull(strDeserializer9);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (-1);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.AbstractCollection<java.lang.String>> strCollectionSerializableDeserializer8 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.Collection<java.lang.String>> strCollectionSerializableDeserializer9 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer11 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer12 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer11, strSerializableDeserializer12, (java.util.Collection<java.lang.String>) strList15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.util.Collection<java.lang.String>> strCollectionBuilder18 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.util.Collection<java.lang.String>>("hi!", strCollectionSerializableDeserializer8, strCollectionSerializableDeserializer9, (java.util.Collection<java.lang.String>) strList15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder19 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer5, strSerializableDeserializer6, (java.util.Collection<java.lang.String>) strList15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer2, strSerializableDeserializer3, (java.util.Collection<java.lang.String>) strList15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("", (java.util.Collection<java.lang.String>) strList15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.Subscription subscription7 = strBuilder5.subscription;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = strBuilder5.setMaxRetries((-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder5.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        strBuilder13.maxRetries = (-1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder5.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList12);
        strBuilder14.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = strBuilder14.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder5.setProp(strMap17);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = strBuilder5.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = strBuilder5.setMaxRetries((int) (short) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy24 = strBuilder23.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder26 = strBuilder23.setRetry(kafkaSpoutRetryService25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy7 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy7.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy24 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy24.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>> strListKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>>();
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 2147483647;
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (short) -1;
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, java.util.AbstractList<java.lang.String>> strCollectionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, java.util.AbstractList<java.lang.String>>();
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 10;
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (short) 0;
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPartitionRefreshPeriodMs((long) 1);
        int int11 = strBuilder10.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder10.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = strBuilder10.setSecurityProtocol("hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList21);
        strBuilder23.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder29 = strBuilder23.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder31 = strBuilder29.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder37 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList35);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass38 = strBuilder37.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy39 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder37.firstPollOffsetStrategy = firstPollOffsetStrategy39;
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder46 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList44);
        strBuilder46.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = strBuilder46.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder50 = strBuilder37.setProp(strMap49);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder51 = strBuilder29.setProp(strMap49);
        org.apache.storm.kafka.spout.Subscription subscription52 = strBuilder29.subscription;
        strBuilder17.subscription = subscription52;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder55 = strBuilder17.setPartitionRefreshPeriodMs((long) (byte) 100);
        strBuilder17.pollTimeoutMs = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy58 = strBuilder17.firstPollOffsetStrategy;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy39 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy39.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(subscription52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy58 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy58.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (byte) 100;
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=UNCOMMITTED_EARLIEST, subscription=null, translator=null, retryService=null}", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=UNCOMMITTED_EARLIEST, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (short) 0;
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig5 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig5.translator;
        long long7 = strKafkaSpoutConfig5.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strKafkaSpoutConfig5.kafkaProps;
        java.lang.String str9 = strKafkaSpoutConfig5.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = strKafkaSpoutConfig5.kafkaProps;
        long long11 = strKafkaSpoutConfig5.getPartitionRefreshPeriodMs();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer12 = strKafkaSpoutConfig5.valueDes;
        strKafkaSpoutConfig5.maxUncommittedOffsets = (byte) 1;
        java.lang.String str15 = strKafkaSpoutConfig5.toString();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList19);
        strBuilder21.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder27 = strBuilder21.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder29 = strBuilder27.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder35 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList33);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass36 = strBuilder35.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy37 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder35.firstPollOffsetStrategy = firstPollOffsetStrategy37;
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder44 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList42);
        strBuilder44.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = strBuilder44.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder48 = strBuilder35.setProp(strMap47);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder49 = strBuilder27.setProp(strMap47);
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = org.apache.storm.kafka.spout.KafkaSpoutConfig.setDefaultsAndGetKafkaProps(strMap47);
        strKafkaSpoutConfig5.kafkaProps = strMap50;
        strKafkaSpoutConfig0.kafkaProps = strMap50;
        java.lang.String str53 = strKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer54 = strKafkaSpoutConfig0.getValueDeserializer();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strRecordTranslator6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str9, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(objSerializableDeserializer12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str15, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy37 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy37.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str53, "KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNull(objDeserializer54);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long4 = strKafkaSpoutConfig0.getPollTimeoutMs();
        long long5 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass6 = strKafkaSpoutConfig0.valueDesClazz;
        strKafkaSpoutConfig0.pollTimeoutMs = 'a';
        int int9 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = null;
        strKafkaSpoutConfig0.keyDes = strSerializableDeserializer10;
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Class<?>>();
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = 'a';
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>>();
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        int int6 = strBuilder5.maxRetries;
        strBuilder5.partitionRefreshPeriodMs = (byte) -1;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.String> charSequenceKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.String>();
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (byte) -1;
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, java.util.RandomAccess> strListBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, java.util.RandomAccess>();
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList5);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList11);
        strBuilder13.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = strBuilder13.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder13.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService19 = null;
        strBuilder18.retryService = kafkaSpoutRetryService19;
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = strBuilder18.kafkaProps;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator22 = strBuilder18.translator;
        strBuilder7.translator = strRecordTranslator22;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator24 = strBuilder7.translator;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder26 = strBuilder7.setBootstrapServers("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        long long27 = strBuilder26.pollTimeoutMs;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strRecordTranslator22);
        org.junit.Assert.assertNotNull(strRecordTranslator24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig5 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig5.translator;
        long long7 = strKafkaSpoutConfig5.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strKafkaSpoutConfig5.kafkaProps;
        java.lang.String str9 = strKafkaSpoutConfig5.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = strKafkaSpoutConfig5.kafkaProps;
        long long11 = strKafkaSpoutConfig5.getPartitionRefreshPeriodMs();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer12 = strKafkaSpoutConfig5.valueDes;
        strKafkaSpoutConfig5.maxUncommittedOffsets = (byte) 1;
        java.lang.String str15 = strKafkaSpoutConfig5.toString();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList19);
        strBuilder21.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder27 = strBuilder21.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder29 = strBuilder27.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder35 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList33);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass36 = strBuilder35.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy37 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder35.firstPollOffsetStrategy = firstPollOffsetStrategy37;
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder44 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList42);
        strBuilder44.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = strBuilder44.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder48 = strBuilder35.setProp(strMap47);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder49 = strBuilder27.setProp(strMap47);
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = org.apache.storm.kafka.spout.KafkaSpoutConfig.setDefaultsAndGetKafkaProps(strMap47);
        strKafkaSpoutConfig5.kafkaProps = strMap50;
        strKafkaSpoutConfig0.kafkaProps = strMap50;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy53 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        java.util.Map<java.lang.String, java.lang.Object> strMap56 = strKafkaSpoutConfig0.kafkaProps;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strRecordTranslator6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str9, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(objSerializableDeserializer12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str15, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy37 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy37.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNull(firstPollOffsetStrategy53);
        org.junit.Assert.assertNotNull(strMap56);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Iterable<java.lang.String>, java.lang.Cloneable> strIterableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.lang.Cloneable> strIterableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.lang.Cloneable>(strIterableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.RandomAccess, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> randomAccessBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> randomAccessKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>>(randomAccessBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        long long6 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator9 = strKafkaSpoutConfig0.translator;
        long long10 = strKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer11 = null;
        strKafkaSpoutConfig0.valueDes = objSerializableDeserializer11;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(strRecordTranslator9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (byte) -1;
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder5.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList12);
        strBuilder14.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = strBuilder14.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder5.setProp(strMap17);
        long long19 = strBuilder5.pollTimeoutMs;
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList23);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass26 = strBuilder25.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy27 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder25.firstPollOffsetStrategy = firstPollOffsetStrategy27;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder29 = strBuilder5.setFirstPollOffsetStrategy(firstPollOffsetStrategy27);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer30 = strBuilder29.valueDes;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy7 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy7.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy27 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy27.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNull(strSerializableDeserializer30);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, java.util.AbstractList<java.lang.String>> cloneableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, java.util.AbstractList<java.lang.String>>();
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = strBuilder7.setFetchMinBytes((int) (short) -1);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList13);
        strBuilder15.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = strBuilder15.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = strBuilder15.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder22 = strBuilder15.setSecurityProtocol("hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder24 = strBuilder15.setFetchMinBytes(2147483647);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig25 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig25.maxRetries = (short) 1;
        long long28 = strKafkaSpoutConfig25.offsetCommitPeriodMs;
        java.lang.String str29 = strKafkaSpoutConfig25.toString();
        int int30 = strKafkaSpoutConfig25.getMaxTupleRetries();
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder36 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList34);
        strBuilder36.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = strBuilder36.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder41 = strBuilder36.setPartitionRefreshPeriodMs((long) 1);
        int int42 = strBuilder41.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder46 = strBuilder41.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder48 = strBuilder41.setSecurityProtocol("hi!");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder54 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList52);
        strBuilder54.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder60 = strBuilder54.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder62 = strBuilder60.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder68 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList66);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass69 = strBuilder68.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy70 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder68.firstPollOffsetStrategy = firstPollOffsetStrategy70;
        java.lang.String[] strArray74 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder77 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList75);
        strBuilder77.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap80 = strBuilder77.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder81 = strBuilder68.setProp(strMap80);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder82 = strBuilder60.setProp(strMap80);
        org.apache.storm.kafka.spout.Subscription subscription83 = strBuilder60.subscription;
        strBuilder48.subscription = subscription83;
        subscription83.refreshAssignment();
        strKafkaSpoutConfig25.subscription = subscription83;
        strBuilder15.subscription = subscription83;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator88 = strBuilder15.translator;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder89 = strBuilder7.setRecordTranslator(strRecordTranslator88);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder93 = strBuilder89.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str29, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy70 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy70.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strMap80);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(subscription83);
        org.junit.Assert.assertNotNull(strRecordTranslator88);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder93);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator7 = null;
        strBuilder5.translator = strRecordTranslator7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder10.setSSLKeystore("", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder13.setRetry(kafkaSpoutRetryService14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = strBuilder7.setFetchMinBytes((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = strBuilder7.setPollTimeoutMs((long) 0);
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder7.setProp(properties12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyEnumBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement>(firstPollOffsetStrategyEnumBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.reflect.AnnotatedElement> strKafkaSpoutConfigBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.reflect.AnnotatedElement> strKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.reflect.AnnotatedElement>(strKafkaSpoutConfigBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxRetries = 1;
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList7);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = strBuilder9.kafkaProps;
        strKafkaSpoutConfig0.kafkaProps = strMap10;
        int int12 = strKafkaSpoutConfig0.getMaxTupleRetries();
        int int13 = strKafkaSpoutConfig0.maxRetries;
        boolean boolean14 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = null;
        strKafkaSpoutConfig0.retryService = kafkaSpoutRetryService15;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.lang.reflect.AnnotatedElement> randomAccessKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>> strConsumerRecordFunc7 = null;
        org.apache.storm.tuple.Fields fields8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setRecordTranslator(strConsumerRecordFunc7, fields8, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        long long11 = strBuilder5.pollTimeoutMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass12 = strBuilder5.valueDesClazz;
        long long13 = strBuilder5.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder5.setMaxPartitionFectchBytes((int) (short) 100);
        org.apache.storm.kafka.spout.Subscription subscription16 = strBuilder15.subscription;
        org.apache.storm.kafka.spout.Subscription subscription17 = null;
        strBuilder15.subscription = subscription17;
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = strBuilder15.setProp(properties19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList5);
        int int8 = strBuilder7.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = strBuilder7.retryService;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(kafkaSpoutRetryService9);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.util.AbstractList<java.lang.String>> strRecordTranslatorBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.util.AbstractList<java.lang.String>> strRecordTranslatorKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.util.AbstractList<java.lang.String>>(strRecordTranslatorBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setRetry(kafkaSpoutRetryService11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strBuilder10);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> cloneableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>>();
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> wildcardClassKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>>();
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        strBuilder5.keyDes = strSerializableDeserializer6;
        long long8 = strBuilder5.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator11 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setRecordTranslator(strRecordTranslator11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = strBuilder12.setOffsetCommitPeriodMs((long) (-1));
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer15 = null;
        strBuilder14.keyDes = strSerializableDeserializer15;
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder14.setProp(properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.Subscription subscription7 = strBuilder5.subscription;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = strBuilder5.setMaxUncommittedOffsets((int) (byte) -1);
        int int10 = strBuilder9.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder9.setRetry(kafkaSpoutRetryService11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 141902646130682494L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        strKafkaSpoutConfig0.retryService = kafkaSpoutRetryService3;
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList8);
        strBuilder10.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = strBuilder10.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder10.setPartitionRefreshPeriodMs((long) 1);
        int int16 = strBuilder15.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = strBuilder15.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig21 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int22 = strKafkaSpoutConfig21.getMaxTupleRetries();
        strKafkaSpoutConfig21.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService25 = strKafkaSpoutConfig21.retryService;
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder31 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList29);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass32 = strBuilder31.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy33 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder31.firstPollOffsetStrategy = firstPollOffsetStrategy33;
        strKafkaSpoutConfig21.firstPollOffsetStrategy = firstPollOffsetStrategy33;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder36 = strBuilder15.setFirstPollOffsetStrategy(firstPollOffsetStrategy33);
        strKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy33;
        int int38 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int39 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy33 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy33.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.util.ArrayList<java.lang.String>> strArrayKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.util.ArrayList<java.lang.String>>();
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String[], java.util.AbstractList<java.lang.String>> strArrayBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.util.AbstractList<java.lang.String>> strArrayKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.util.AbstractList<java.lang.String>>(strArrayBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder5.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList12);
        strBuilder14.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = strBuilder14.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder5.setProp(strMap17);
        int int19 = strBuilder5.maxUncommittedOffsets;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy7 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy7.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = strBuilder5.setFetchMinBytes((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setSecurityProtocol("");
        strBuilder10.maxUncommittedOffsets = 'a';
        strBuilder10.maxRetries = 32;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.Subscription subscription3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, subscription3);
        org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>> strConsumerRecordFunc5 = null;
        org.apache.storm.tuple.Fields fields6 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = strBuilder4.setRecordTranslator(strConsumerRecordFunc5, fields6, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        strBuilder4.keyDes = strSerializableDeserializer9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = strBuilder4.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray20);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder22 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strArray20);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = strBuilder14.setProp("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", (java.lang.Object) strBuilder22);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass24 = strBuilder22.keyDesClazz;
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strKafkaSpoutConfig0.keyDesClazz;
        long long7 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<?> wildcardClass8 = strKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = ' ';
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = strKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = strKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer7 = strKafkaSpoutConfig0.keyDes;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass8 = strKafkaSpoutConfig0.valueDesClazz;
        org.junit.Assert.assertNull(strRecordTranslator1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str4, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(objDeserializer6);
        org.junit.Assert.assertNull(strSerializableDeserializer7);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.util.regex.Pattern pattern3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=100, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, pattern3);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        strBuilder4.valueDes = strSerializableDeserializer5;
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList9);
        strBuilder11.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = strBuilder11.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = strBuilder11.setPartitionRefreshPeriodMs((long) 1);
        int int17 = strBuilder16.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = strBuilder16.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = strBuilder16.setSecurityProtocol("hi!");
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder29 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList27);
        strBuilder29.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder35 = strBuilder29.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder37 = strBuilder35.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder43 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList41);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass44 = strBuilder43.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy45 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder43.firstPollOffsetStrategy = firstPollOffsetStrategy45;
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder52 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList50);
        strBuilder52.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap55 = strBuilder52.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder56 = strBuilder43.setProp(strMap55);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder57 = strBuilder35.setProp(strMap55);
        org.apache.storm.kafka.spout.Subscription subscription58 = strBuilder35.subscription;
        strBuilder23.subscription = subscription58;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder60 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer4, strSerializableDeserializer5, subscription58);
        java.lang.String str61 = subscription58.getTopicsString();
        subscription58.refreshAssignment();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder63 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, subscription58);
        long long64 = strBuilder63.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy65 = strBuilder63.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder67 = strBuilder63.setRetry(kafkaSpoutRetryService66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy45 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy45.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(subscription58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 97L + "'", long64 == 97L);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy65 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy65.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        strBuilder5.keyDes = strSerializableDeserializer6;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass9 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = strBuilder5.setRetry(kafkaSpoutRetryService10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID = 32;
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = strBuilder5.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder11.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder19 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList17);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass20 = strBuilder19.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder19.firstPollOffsetStrategy = firstPollOffsetStrategy21;
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder28 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList26);
        strBuilder28.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = strBuilder28.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder32 = strBuilder19.setProp(strMap31);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder33 = strBuilder11.setProp(strMap31);
        strBuilder33.partitionRefreshPeriodMs = 35L;
        strBuilder33.pollTimeoutMs = 141902646130682494L;
        int int38 = strBuilder33.maxRetries;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy21 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy21.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPartitionRefreshPeriodMs((long) 1);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList14);
        strBuilder16.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = strBuilder16.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = strBuilder16.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = strBuilder16.setSecurityProtocol("hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = strBuilder16.setFetchMinBytes(2147483647);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig26 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig26.maxRetries = (short) 1;
        long long29 = strKafkaSpoutConfig26.offsetCommitPeriodMs;
        java.lang.String str30 = strKafkaSpoutConfig26.toString();
        int int31 = strKafkaSpoutConfig26.getMaxTupleRetries();
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder37 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList35);
        strBuilder37.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = strBuilder37.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder42 = strBuilder37.setPartitionRefreshPeriodMs((long) 1);
        int int43 = strBuilder42.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder47 = strBuilder42.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder49 = strBuilder42.setSecurityProtocol("hi!");
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder55 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList53);
        strBuilder55.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder61 = strBuilder55.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder63 = strBuilder61.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray66 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder69 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList67);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass70 = strBuilder69.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy71 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder69.firstPollOffsetStrategy = firstPollOffsetStrategy71;
        java.lang.String[] strArray75 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder78 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList76);
        strBuilder78.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap81 = strBuilder78.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder82 = strBuilder69.setProp(strMap81);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder83 = strBuilder61.setProp(strMap81);
        org.apache.storm.kafka.spout.Subscription subscription84 = strBuilder61.subscription;
        strBuilder49.subscription = subscription84;
        subscription84.refreshAssignment();
        strKafkaSpoutConfig26.subscription = subscription84;
        strBuilder16.subscription = subscription84;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator89 = strBuilder16.translator;
        org.apache.storm.tuple.Fields fields90 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder91 = strBuilder10.setRecordTranslator((org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>) strRecordTranslator89, fields90);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder93 = strBuilder91.setGroupId("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder95 = strBuilder91.setBootstrapServers("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder97 = strBuilder91.setMaxPollRecords(32);
        strBuilder97.maxUncommittedOffsets = '#';
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str30, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy71 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy71.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(subscription84);
        org.junit.Assert.assertNotNull(strRecordTranslator89);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder93);
        org.junit.Assert.assertNotNull(strBuilder95);
        org.junit.Assert.assertNotNull(strBuilder97);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> randomAccessKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        java.lang.String str3 = strKafkaSpoutConfig0.toString();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 97L;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str3, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>(strComparableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, java.lang.Comparable<java.lang.String>> strListBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = '#';
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>>();
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strKafkaSpoutConfig0.keyDesClazz;
        long long7 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator8 = null;
        strKafkaSpoutConfig0.translator = strRecordTranslator8;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long4 = strKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, java.util.Map<java.lang.String, java.lang.Object>> strConsumerRecordFuncKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, java.util.Map<java.lang.String, java.lang.Object>>();
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList5);
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder9 = strBuilder7.setProp(properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String[], java.util.AbstractCollection<java.lang.String>> strArrayBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.util.AbstractCollection<java.lang.String>> strArrayKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.util.AbstractCollection<java.lang.String>>(strArrayBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        long long6 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long7 = strKafkaSpoutConfig0.pollTimeoutMs;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertNull(strRecordTranslator5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        strBuilder5.keyDes = strSerializableDeserializer6;
        long long8 = strBuilder5.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder19 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList17);
        strBuilder19.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = strBuilder19.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder24 = strBuilder19.setPartitionRefreshPeriodMs((long) 1);
        int int25 = strBuilder24.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder29 = strBuilder24.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder31 = strBuilder24.setSecurityProtocol("hi!");
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder37 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList35);
        strBuilder37.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder43 = strBuilder37.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder45 = strBuilder43.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder51 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList49);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass52 = strBuilder51.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy53 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder51.firstPollOffsetStrategy = firstPollOffsetStrategy53;
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder60 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList58);
        strBuilder60.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap63 = strBuilder60.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder64 = strBuilder51.setProp(strMap63);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder65 = strBuilder43.setProp(strMap63);
        org.apache.storm.kafka.spout.Subscription subscription66 = strBuilder43.subscription;
        strBuilder31.subscription = subscription66;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder68 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer12, strSerializableDeserializer13, subscription66);
        strBuilder5.subscription = subscription66;
        strBuilder5.maxUncommittedOffsets = 35;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer73 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer74 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder79 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray78);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder80 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer73, strSerializableDeserializer74, strArray78);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder82 = strBuilder80.setGroupId("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator83 = strBuilder80.translator;
        strBuilder5.translator = strRecordTranslator83;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService85 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder86 = strBuilder5.setRetry(kafkaSpoutRetryService85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy53 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy53.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(subscription66);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strRecordTranslator83);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = 52L;
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, org.apache.storm.kafka.spout.Subscription> strListKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, org.apache.storm.kafka.spout.Subscription>();
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer1 = strKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer3 = null;
        strKafkaSpoutConfig0.valueDes = objSerializableDeserializer3;
        org.junit.Assert.assertNull(objDeserializer1);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.lang.String[]> randomAccessKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.lang.String[]>();
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strListKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("hi!", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, java.lang.Object> strListKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, java.lang.Object>();
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String[], java.lang.String> strArrayBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.lang.String> strArrayKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.lang.String>(strArrayBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID = ' ';
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, java.lang.reflect.AnnotatedElement> strListBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, java.lang.reflect.AnnotatedElement> strListKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, java.lang.reflect.AnnotatedElement>(strListBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 35L;
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        strKafkaSpoutConfig0.pollTimeoutMs = 100L;
        java.lang.Class<?> wildcardClass6 = strKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPartitionRefreshPeriodMs((long) 1);
        int int11 = strBuilder10.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder10.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = strBuilder10.setSecurityProtocol("hi!");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer18 = null;
        strBuilder17.keyDes = strSerializableDeserializer18;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = strBuilder17.setGroupId("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy22 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = strBuilder17.setFirstPollOffsetStrategy(firstPollOffsetStrategy22);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = strBuilder17.setBootstrapServers("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy22 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy22.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=52, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=52, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder5.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPollTimeoutMs((long) 2147483647);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setPartitionRefreshPeriodMs(0L);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass13 = strBuilder12.valueDesClazz;
        int int14 = strBuilder12.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer15 = null;
        strBuilder12.valueDes = strSerializableDeserializer15;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy7 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy7.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_PARTITION_REFRESH_PERIOD_MS = (short) 10;
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.util.AbstractCollection<java.lang.String>> strIterableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.util.AbstractCollection<java.lang.String>>();
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.AnnotatedElement>(serializableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = strBuilder5.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder11.setMaxPartitionFectchBytes((-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder11.setMaxPollRecords(100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = strBuilder15.setMaxPollRecords((int) ' ');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer18 = null;
        strBuilder17.valueDes = strSerializableDeserializer18;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, java.util.Map<java.lang.String, java.lang.Object>> strListKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, java.util.Map<java.lang.String, java.lang.Object>>();
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = ' ';
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> strCollectionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>>();
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.util.ArrayList<java.lang.String>> firstPollOffsetStrategyKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.util.ArrayList<java.lang.String>>();
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.Subscription> strBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.Subscription>();
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        strBuilder5.keyDes = strSerializableDeserializer6;
        long long8 = strBuilder5.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator11 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setRecordTranslator(strRecordTranslator11);
        strBuilder5.partitionRefreshPeriodMs = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder5.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer20 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer21 = null;
        org.apache.storm.kafka.spout.Subscription subscription22 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer20, strSerializableDeserializer21, subscription22);
        strBuilder23.partitionRefreshPeriodMs = 0L;
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder31 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList29);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass32 = strBuilder31.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy33 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder31.firstPollOffsetStrategy = firstPollOffsetStrategy33;
        strBuilder23.firstPollOffsetStrategy = firstPollOffsetStrategy33;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder36 = strBuilder5.setFirstPollOffsetStrategy(firstPollOffsetStrategy33);
        int int37 = strBuilder36.maxUncommittedOffsets;
        strBuilder36.maxRetries = (short) -1;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass40 = strBuilder36.keyDesClazz;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy33 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy33.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.valueDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = strBuilder5.setBootstrapServers("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        long long9 = strBuilder8.partitionRefreshPeriodMs;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.reflect.GenericDeclaration> genericDeclarationSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer7 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer7, strSerializableDeserializer8, strArray12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationBuilder15 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", genericDeclarationSerializableDeserializer4, charSequenceSerializableDeserializer5, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("", strSerializableDeserializer1, strSerializableDeserializer2, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        long long6 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long7 = strKafkaSpoutConfig0.pollTimeoutMs;
        java.lang.String str8 = strKafkaSpoutConfig0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertNull(strRecordTranslator5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str8, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=UNCOMMITTED_EARLIEST, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer7 = null;
        strKafkaSpoutConfig0.keyDes = strSerializableDeserializer7;
        long long9 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.CharSequence> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.CharSequence>();
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = strBuilder5.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder11.setMaxPartitionFectchBytes((-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder11.setMaxPollRecords(100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = strBuilder15.setMaxPollRecords((int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder23 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList21);
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator24 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = strBuilder23.setRecordTranslator(strRecordTranslator24);
        strBuilder23.partitionRefreshPeriodMs = 35;
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder33 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList31);
        strBuilder33.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder39 = strBuilder33.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder41 = strBuilder39.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder47 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList45);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass48 = strBuilder47.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy49 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder47.firstPollOffsetStrategy = firstPollOffsetStrategy49;
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder56 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList54);
        strBuilder56.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap59 = strBuilder56.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder60 = strBuilder47.setProp(strMap59);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder61 = strBuilder39.setProp(strMap59);
        org.apache.storm.kafka.spout.Subscription subscription62 = strBuilder39.subscription;
        strBuilder39.pollTimeoutMs = 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.String> strKafkaSpoutConfig65 = strBuilder39.build();
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder71 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList69);
        strBuilder71.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap74 = strBuilder71.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder76 = strBuilder71.setPartitionRefreshPeriodMs((long) 1);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass77 = strBuilder71.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder79 = strBuilder71.setGroupId("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator80 = strBuilder71.translator;
        strBuilder39.translator = strRecordTranslator80;
        org.apache.storm.tuple.Fields fields82 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder84 = strBuilder23.setRecordTranslator((org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>) strRecordTranslator80, fields82, "KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.tuple.Fields fields85 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder87 = strBuilder17.setRecordTranslator((org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>) strRecordTranslator80, fields85, "KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder89 = strBuilder87.setMaxUncommittedOffsets((int) (short) 0);
        java.lang.Class<?> wildcardClass90 = strBuilder87.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy49 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy49.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(subscription62);
        org.junit.Assert.assertNotNull(strKafkaSpoutConfig65);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strRecordTranslator80);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.AbstractList<java.lang.String>> strListSerializableDeserializer6 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strKafkaSpoutConfigSerializableDeserializer7 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.Collection<java.lang.String>> strCollectionSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.AbstractList<java.lang.String>> strListSerializableDeserializer13 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, java.util.AbstractList<java.lang.String>> strCollectionBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, java.util.AbstractList<java.lang.String>>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strCollectionSerializableDeserializer12, strListSerializableDeserializer13, strArray15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer9, strSerializableDeserializer10, strArray15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractList<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strListBuilder18 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractList<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>>("hi!", strListSerializableDeserializer6, strKafkaSpoutConfigSerializableDeserializer7, strArray15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder19 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer3, strSerializableDeserializer4, strArray15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=52, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder21 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPartitionRefreshPeriodMs((long) 1);
        int int11 = strBuilder10.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder10.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = strBuilder10.setPartitionRefreshPeriodMs((long) '4');
        org.apache.storm.kafka.spout.Subscription subscription18 = strBuilder17.subscription;
        java.lang.String str19 = subscription18.getTopicsString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.util.regex.Pattern pattern3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.String> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=52, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", objSerializableDeserializer1, strSerializableDeserializer2, pattern3);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.util.AbstractList<java.lang.String>> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.util.AbstractList<java.lang.String>>();
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.reflect.AnnotatedElement> strCollectionKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPartitionRefreshPeriodMs((long) 1);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass11 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder5.setGroupId("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator14 = strBuilder5.translator;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = strBuilder5.setMaxRetries((int) (byte) 10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer17 = null;
        strBuilder16.keyDes = strSerializableDeserializer17;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strRecordTranslator14);
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList9);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass12 = strBuilder11.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder11.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList18);
        strBuilder20.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = strBuilder20.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder24 = strBuilder11.setProp(strMap23);
        long long25 = strBuilder11.pollTimeoutMs;
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder31 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList29);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass32 = strBuilder31.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy33 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder31.firstPollOffsetStrategy = firstPollOffsetStrategy33;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder35 = strBuilder11.setFirstPollOffsetStrategy(firstPollOffsetStrategy33);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder41 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList39);
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator42 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder43 = strBuilder41.setRecordTranslator(strRecordTranslator42);
        strBuilder41.partitionRefreshPeriodMs = 35;
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = strBuilder41.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder47 = strBuilder35.setProp(strMap46);
        strKafkaSpoutConfig0.kafkaProps = strMap46;
        long long49 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        int int50 = strKafkaSpoutConfig0.maxRetries;
        long long51 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer52 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy13 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy13.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy33 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy33.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNull(strDeserializer52);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 1L;
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder5.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPollTimeoutMs((long) 2147483647);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setPartitionRefreshPeriodMs(0L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = strBuilder5.setMaxPartitionFectchBytes((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = strBuilder5.setRetry(kafkaSpoutRetryService15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: retryService cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy7 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy7.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.lang.Object> strRecordTranslatorKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.lang.Object>();
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = strKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = strKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer7 = strKafkaSpoutConfig0.keyDes;
        org.apache.storm.kafka.spout.Subscription subscription8 = strKafkaSpoutConfig0.subscription;
        strKafkaSpoutConfig0.maxRetries = (byte) -1;
        org.junit.Assert.assertNull(strRecordTranslator1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str4, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(objDeserializer6);
        org.junit.Assert.assertNull(strSerializableDeserializer7);
        org.junit.Assert.assertNull(subscription8);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = strKafkaSpoutConfig0.keyDes;
        strKafkaSpoutConfig0.maxRetries = 32;
        int int6 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(strSerializableDeserializer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=32, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str7, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=32, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList6);
        strBuilder8.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = strBuilder8.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder8.setPartitionRefreshPeriodMs((long) 1);
        int int14 = strBuilder13.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder13.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = strBuilder13.setPartitionRefreshPeriodMs((long) '4');
        org.apache.storm.kafka.spout.Subscription subscription21 = strBuilder20.subscription;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder22 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, subscription21);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder24 = strBuilder22.setBootstrapServers("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=52, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        java.lang.Class<?> wildcardClass25 = strBuilder24.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.String> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.String>();
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strArray11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=-1, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer4, strSerializableDeserializer5, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("", strSerializableDeserializer1, strSerializableDeserializer2, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bootstrap servers cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = strBuilder5.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder5.setSSLKeystore("hi!", "KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = strBuilder5.setProp(properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        strBuilder5.keyDes = strSerializableDeserializer6;
        long long8 = strBuilder5.partitionRefreshPeriodMs;
        int int9 = strBuilder5.maxRetries;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer2 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = strKafkaSpoutConfig0.keyDes;
        org.apache.storm.kafka.spout.Subscription subscription4 = strKafkaSpoutConfig0.subscription;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass5 = strKafkaSpoutConfig0.keyDesClazz;
        org.junit.Assert.assertNull(strRecordTranslator1);
        org.junit.Assert.assertNull(strDeserializer2);
        org.junit.Assert.assertNull(strSerializableDeserializer3);
        org.junit.Assert.assertNull(subscription4);
        org.junit.Assert.assertNull(wildcardClass5);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 0L;
        org.apache.storm.kafka.spout.Subscription subscription9 = null;
        strKafkaSpoutConfig0.subscription = subscription9;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass11 = strKafkaSpoutConfig0.valueDesClazz;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = strKafkaSpoutConfig0.kafkaProps;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertNull(strRecordTranslator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str6, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.serialVersionUID = (short) 100;
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 0;
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        long long8 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer9 = strKafkaSpoutConfig0.valueDes;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str7, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(objSerializableDeserializer9);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (short) 10;
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.lang.String[]> subscriptionKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.lang.String[]>();
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder5.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList12);
        strBuilder14.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = strBuilder14.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder5.setProp(strMap17);
        long long19 = strBuilder5.pollTimeoutMs;
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList23);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass26 = strBuilder25.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy27 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder25.firstPollOffsetStrategy = firstPollOffsetStrategy27;
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder34 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList32);
        strBuilder34.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = strBuilder34.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder38 = strBuilder25.setProp(strMap37);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy39 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder38.firstPollOffsetStrategy = firstPollOffsetStrategy39;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder41 = strBuilder5.setFirstPollOffsetStrategy(firstPollOffsetStrategy39);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder43 = strBuilder41.setGroupId("hi!");
        org.apache.storm.kafka.spout.Subscription subscription44 = strBuilder41.subscription;
        strBuilder41.pollTimeoutMs = 1;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy7 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy7.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy27 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy27.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy39 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy39.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(subscription44);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps={enable.auto.commit=false, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer5 = null;
        strKafkaSpoutConfig0.valueDes = objSerializableDeserializer5;
        long long7 = strKafkaSpoutConfig0.pollTimeoutMs;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strRecordTranslator1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" + "'", str4, "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList10);
        strBuilder12.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = strBuilder12.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = strBuilder12.setPartitionRefreshPeriodMs((long) 1);
        int int18 = strBuilder17.maxRetries;
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder24 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList22);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass25 = strBuilder24.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy26 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder24.firstPollOffsetStrategy = firstPollOffsetStrategy26;
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder33 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList31);
        strBuilder33.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = strBuilder33.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder37 = strBuilder24.setProp(strMap36);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy38 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder37.firstPollOffsetStrategy = firstPollOffsetStrategy38;
        strBuilder17.firstPollOffsetStrategy = firstPollOffsetStrategy38;
        strKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy38;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer42 = null;
        strKafkaSpoutConfig0.keyDes = strSerializableDeserializer42;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy44 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strSerializableDeserializer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(firstPollOffsetStrategy6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy26 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy26.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy38 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy38.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy44 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy44.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.AbstractCollection<java.lang.String>> strCollectionSerializableDeserializer5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.util.AbstractCollection<java.lang.String>> strComparableBuilder11 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.util.AbstractCollection<java.lang.String>>("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strComparableSerializableDeserializer4, strCollectionSerializableDeserializer5, strArray9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, strArray9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = strBuilder12.setMaxPartitionFectchBytes(0);
        strBuilder12.maxRetries = 0;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long4 = strKafkaSpoutConfig0.getPollTimeoutMs();
        long long5 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass6 = strKafkaSpoutConfig0.valueDesClazz;
        strKafkaSpoutConfig0.pollTimeoutMs = 'a';
        int int9 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = strKafkaSpoutConfig0.kafkaProps;
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.Type> typeKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.Type>();
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 32;
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.util.Map<java.lang.String, java.lang.Object>> annotatedElementKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.util.Map<java.lang.String, java.lang.Object>>();
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.util.ArrayList<java.lang.String>> strComparableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.util.ArrayList<java.lang.String>> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.util.ArrayList<java.lang.String>>(strComparableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.util.Collection<java.lang.String>> firstPollOffsetStrategyBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.util.Collection<java.lang.String>> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.util.Collection<java.lang.String>>(firstPollOffsetStrategyBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer5, strSerializableDeserializer6, (java.util.Collection<java.lang.String>) strList9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer2, strSerializableDeserializer3, (java.util.Collection<java.lang.String>) strList9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", (java.util.Collection<java.lang.String>) strList9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = strBuilder13.setGroupId("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=52, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer16 = strBuilder15.keyDes;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNull(strSerializableDeserializer16);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.ArrayList<java.lang.String>> strListSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.ArrayList<java.lang.String>> strListSerializableDeserializer3 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.AbstractCollection<java.lang.String>> strCollectionSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.Collection<java.lang.String>> strCollectionSerializableDeserializer6 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder14 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer8, strSerializableDeserializer9, (java.util.Collection<java.lang.String>) strList12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.util.Collection<java.lang.String>> strCollectionBuilder15 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.util.Collection<java.lang.String>>("hi!", strCollectionSerializableDeserializer5, strCollectionSerializableDeserializer6, (java.util.Collection<java.lang.String>) strList12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>> strListBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>>("hi!", strListSerializableDeserializer2, strListSerializableDeserializer3, (java.util.Collection<java.lang.String>) strList12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", (java.util.Collection<java.lang.String>) strList12);
        java.lang.Class<?> wildcardClass18 = strBuilder17.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.util.regex.Pattern pattern1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder2 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", pattern1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = strBuilder2.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder11 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList9);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer12 = null;
        strBuilder11.keyDes = strSerializableDeserializer12;
        long long14 = strBuilder11.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder16 = strBuilder11.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer18 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer19 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList23);
        strBuilder25.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = strBuilder25.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder30 = strBuilder25.setPartitionRefreshPeriodMs((long) 1);
        int int31 = strBuilder30.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder35 = strBuilder30.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder37 = strBuilder30.setSecurityProtocol("hi!");
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder43 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList41);
        strBuilder43.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder49 = strBuilder43.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder51 = strBuilder49.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder57 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList55);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass58 = strBuilder57.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy59 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder57.firstPollOffsetStrategy = firstPollOffsetStrategy59;
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder66 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList64);
        strBuilder66.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap69 = strBuilder66.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder70 = strBuilder57.setProp(strMap69);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder71 = strBuilder49.setProp(strMap69);
        org.apache.storm.kafka.spout.Subscription subscription72 = strBuilder49.subscription;
        strBuilder37.subscription = subscription72;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder74 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer18, strSerializableDeserializer19, subscription72);
        strBuilder11.subscription = subscription72;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder76 = strBuilder4.setProp("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", (java.lang.Object) subscription72);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy77 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder78 = strBuilder76.setFirstPollOffsetStrategy(firstPollOffsetStrategy77);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer79 = null;
        strBuilder76.valueDes = strSerializableDeserializer79;
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy59 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy59.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(subscription72);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy77 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy77.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder78);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.AnnotatedElement> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> strListKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>>();
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(firstPollOffsetStrategyBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.util.List<java.lang.String>> typeBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.util.List<java.lang.String>> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.util.List<java.lang.String>>(typeBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 97;
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        strBuilder5.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strBuilder5.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder10 = strBuilder5.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder12 = strBuilder5.setSecurityProtocol("hi!");
        long long13 = strBuilder5.offsetCommitPeriodMs;
        strBuilder5.maxRetries = 'a';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.AbstractCollection<java.lang.String>> strCollectionSerializableDeserializer18 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.util.Collection<java.lang.String>> strCollectionSerializableDeserializer19 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer21 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer22 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder27 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("hi!", strSerializableDeserializer21, strSerializableDeserializer22, (java.util.Collection<java.lang.String>) strList25);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.util.Collection<java.lang.String>> strCollectionBuilder28 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.util.Collection<java.lang.String>>("hi!", strCollectionSerializableDeserializer18, strCollectionSerializableDeserializer19, (java.util.Collection<java.lang.String>) strList25);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder29 = strBuilder5.setProp("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", (java.lang.Object) "hi!");
        int int30 = strBuilder29.maxUncommittedOffsets;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer2 = strKafkaSpoutConfig0.getKeyDeserializer();
        int int3 = strKafkaSpoutConfig0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = null;
        strKafkaSpoutConfig0.retryService = kafkaSpoutRetryService4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strRecordTranslator1);
        org.junit.Assert.assertNull(strDeserializer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.io.Serializable> strKafkaSpoutConfigBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.io.Serializable> strKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.io.Serializable>(strKafkaSpoutConfigBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer1 = null;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strSerializableDeserializer1, strSerializableDeserializer2, (java.util.Collection<java.lang.String>) strList5);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList11);
        strBuilder13.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = strBuilder13.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder18 = strBuilder13.setPartitionRefreshPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService19 = null;
        strBuilder18.retryService = kafkaSpoutRetryService19;
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = strBuilder18.kafkaProps;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator22 = strBuilder18.translator;
        strBuilder7.translator = strRecordTranslator22;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String> strRecordTranslator24 = strBuilder7.translator;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder26 = strBuilder7.setBootstrapServers("KafkaSpoutConfig{kafkaProps={bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService27 = strBuilder7.retryService;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strRecordTranslator22);
        org.junit.Assert.assertNotNull(strRecordTranslator24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNull(kafkaSpoutRetryService27);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray3);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder6 = strBuilder4.setMaxRetries((int) (short) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = strBuilder6.setMaxPollRecords((int) '4');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = strBuilder8.keyDes;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        strBuilder8.retryService = kafkaSpoutRetryService10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder13 = strBuilder8.setMaxRetries((int) 'a');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer14 = null;
        strBuilder13.keyDes = strSerializableDeserializer14;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNull(strSerializableDeserializer9);
        org.junit.Assert.assertNotNull(strBuilder13);
    }
}

