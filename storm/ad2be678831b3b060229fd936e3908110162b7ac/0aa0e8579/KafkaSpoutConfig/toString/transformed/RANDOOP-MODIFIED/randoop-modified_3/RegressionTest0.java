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
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.AUTO_COMMIT_INTERVAL_MS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "auto.commit.interval.ms" + "'", str0, "auto.commit.interval.ms");
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (-1);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.String> charSequenceKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.String>();
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.VALUE_DESERIALIZER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "value.deserializer" + "'", str0, "value.deserializer");
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        long long0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 200L + "'", long0 == 200L);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        int int0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>(objBuilderBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.BOOTSTRAP_SERVERS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bootstrap.servers" + "'", str0, "bootstrap.servers");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 10;
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        long long0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 30000L + "'", long0 == 30000L);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> serializableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(serializableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer6 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer6;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService8;
        java.lang.Class<?> wildcardClass10 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (short) 100;
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        objBuilder0.kafkaSpoutStreams = kafkaSpoutStreams5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = objBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder4);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(charSequenceDeserializer6);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration> objBuilderKafkaSpoutConfigBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration> objBuilderKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration>(objBuilderKafkaSpoutConfigBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> charSequenceBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(charSequenceBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.regex.Pattern pattern5 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pattern5);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (short) 100;
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
        java.lang.Class<?> wildcardClass1 = firstPollOffsetStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy0 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST + "'", firstPollOffsetStrategy0.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(serializableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (short) 0;
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable>();
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 'a';
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.Class<?> wildcardClass5 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(charSequenceDeserializer3);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 10L;
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 10;
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.ENABLE_AUTO_COMMIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enable.auto.commit" + "'", str0, "enable.auto.commit");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (byte) 100;
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy3 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy3.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(charSequenceDeserializer5);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.regex.Pattern pattern5 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilderKafkaSpoutConfig0.getRetryService();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pattern5);
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        int int0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objBuilder4.retryService;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig10 = objBuilder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        org.junit.Assert.assertNotNull(objBuilder9);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.KEY_DESERIALIZER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "key.deserializer" + "'", str0, "key.deserializer");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object>();
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        int int5 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 0;
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String> firstPollOffsetStrategyBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object>(firstPollOffsetStrategyBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Class<?>> charSequenceKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Class<?>>();
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (short) 0;
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.GROUP_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "group.id" + "'", str0, "group.id");
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer2 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        java.lang.Class<?> wildcardClass3 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(objBuilderDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer6 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objBuilderKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objBuilderBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(strMap0, kafkaSpoutStreams1, objBuilderKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = '4';
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (byte) 100;
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 1;
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder0.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objBuilder6.retryService = kafkaSpoutRetryService7;
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        long long3 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder4 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder4;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer6 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer6;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer8 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(charSequenceDeserializer8);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 1L;
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.CharSequence> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.CharSequence>();
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Comparable<java.lang.String>> objBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Comparable<java.lang.String>> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Comparable<java.lang.String>>(objBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.Type> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.Type>();
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> annotatedElementKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = ' ';
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.Type> objBuilderBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.Type> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.Type>(objBuilderBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Class<?>>();
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long5 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str4, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str5, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer4;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService6;
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(charSequenceDeserializer1);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str8, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder8 = objBuilder4.setKeyDeserializer(objSerializableDeserializer7);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder11 = objBuilder9.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = objBuilder9.firstPollOffsetStrategy;
        objBuilder8.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        java.lang.Class<?> wildcardClass14 = objBuilder8.getClass();
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNotNull(objBuilder8);
        org.junit.Assert.assertNotNull(objBuilder11);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.String>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (-1);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (byte) 0;
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer6;
        java.lang.Class<?> wildcardClass8 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.reflect.AnnotatedElement> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>(annotatedElementBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(charSequenceDeserializer3);
        org.junit.Assert.assertNull(objBuilderKafkaSpoutTuplesBuilder6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.String>(genericDeclarationBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder1 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 0L;
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> strComparableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(strComparableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder1 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder1;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap4 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder8 = objBuilder4.setKeyDeserializer(objSerializableDeserializer7);
        long long9 = objBuilder4.pollTimeoutMs;
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNotNull(objBuilder8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        objBuilder4.maxUncommittedOffsets = 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder8 = objBuilder4.setMaxUncommittedOffsets((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = objBuilder4.getClass();
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer7 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 52;
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer4;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService6;
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.Class<?> wildcardClass9 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertNull(charSequenceDeserializer1);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str8, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer6;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer8 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer8;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap11 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer1 = objBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder3 = objBuilder0.setValueDeserializer(serializableSerializableDeserializer2);
        long long4 = objBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objBuilder0.retryService;
        org.junit.Assert.assertNull(serializableSerializableDeserializer1);
        org.junit.Assert.assertNotNull(objBuilder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService5);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilder2.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer4 = objBuilder2.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        objBuilder2.kafkaProps = strMap5;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer7 = objBuilder2.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder8 = null;
        objBuilder2.tuplesBuilder = objKafkaSpoutTuplesBuilder8;
        org.junit.Assert.assertNotNull(objBuilder2);
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        org.junit.Assert.assertNull(serializableSerializableDeserializer4);
        org.junit.Assert.assertNull(serializableSerializableDeserializer7);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = ' ';
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> genericDeclarationBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.reflect.GenericDeclaration> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.lang.CharSequence> wildcardClassBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.lang.CharSequence>();
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.Type> objBuilderKafkaSpoutConfigBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.Type> objBuilderKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.Type>(objBuilderKafkaSpoutConfigBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objBuilderKafkaSpoutConfig0.retryService;
        long long6 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str4, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutRetryService5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer7 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer7;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams9;
        java.lang.Class<?> wildcardClass11 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder1 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder1;
        java.lang.Class<?> wildcardClass3 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 0L;
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Object> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Object>();
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams5;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.lang.Class<?>> wildcardClassBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.lang.Class<?>>();
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.reflect.Type> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.Type> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>();
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strComparableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strComparableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = '4';
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 30000L;
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setPollTimeoutMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder3 = null;
        objBuilder2.tuplesBuilder = objKafkaSpoutTuplesBuilder3;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig5 = objBuilder2.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder2);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.CharSequence> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.CharSequence> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        long long4 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(charSequenceDeserializer3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer4;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService6;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(charSequenceDeserializer1);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(firstPollOffsetStrategy2);
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder8 = objBuilder4.setKeyDeserializer(objSerializableDeserializer7);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = objBuilder8.firstPollOffsetStrategy;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = objBuilder8.kafkaProps;
        objBuilder8.pollTimeoutMs = 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = objBuilder8.firstPollOffsetStrategy;
        java.lang.Class<?> wildcardClass14 = firstPollOffsetStrategy13.getClass();
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNotNull(objBuilder8);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy9 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy9.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy13 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy13.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 0;
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        long long3 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder4 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutStreams8);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (byte) 10;
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        long long6 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        int int7 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str5, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (byte) -1;
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (byte) 0;
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (byte) 1;
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> charSequenceKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.Comparable<java.lang.String>> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Comparable<java.lang.String>> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Object> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Object>();
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (byte) 0;
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder8 = objBuilder4.setKeyDeserializer(objSerializableDeserializer7);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = objBuilder8.firstPollOffsetStrategy;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = objBuilder8.kafkaProps;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig11 = objBuilder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNotNull(objBuilder8);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy9 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy9.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long3 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int5 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(charSequenceDeserializer1);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        long long3 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder4 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder4;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer6 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer6;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objBuilderKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objBuilderBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, objBuilderKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> typeKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> typeBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer7 = objBuilder4.valueDeserializer;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer8);
        objBuilder9.offsetCommitPeriodMs = (-1L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig12 = objBuilder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNull(serializableSerializableDeserializer7);
        org.junit.Assert.assertNotNull(objBuilder9);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (byte) 1;
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        java.lang.Class<?> wildcardClass5 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy3 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy3.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        int int5 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.regex.Pattern pattern6 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str7, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.Type> typeKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.Type>();
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration> objBuilderKafkaSpoutConfigKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration> objBuilderKafkaSpoutConfigBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, objBuilderKafkaSpoutConfigKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        int int7 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(charSequenceDeserializer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setMaxUncommittedOffsets(1);
        java.lang.Class<?> wildcardClass3 = objBuilder0.getClass();
        org.junit.Assert.assertNotNull(objBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        int int5 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(charSequenceDeserializer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str7, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.CharSequence> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.CharSequence> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder8 = objBuilder4.setKeyDeserializer(objSerializableDeserializer7);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = objBuilder8.firstPollOffsetStrategy;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = objBuilder8.kafkaProps;
        objBuilder8.pollTimeoutMs = 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = objBuilder8.firstPollOffsetStrategy;
        java.lang.Class<?> wildcardClass14 = objBuilder8.getClass();
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNotNull(objBuilder8);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy9 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy9.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy13 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy13.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (short) 0;
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        objBuilder4.kafkaProps = strMap5;
        long long7 = objBuilder4.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder4.setMaxUncommittedOffsets((int) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder10 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder10.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder14 = objBuilder10.setFirstPollOffsetStrategy(firstPollOffsetStrategy13);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder16 = objBuilder14.setOffsetCommitPeriodMs((long) (-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder17 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder17.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder21 = objBuilder17.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy22 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder23 = objBuilder17.setFirstPollOffsetStrategy(firstPollOffsetStrategy22);
        objBuilder14.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        objBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer26 = objBuilder9.keyDeserializer;
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(objBuilder9);
        org.junit.Assert.assertNotNull(objBuilder14);
        org.junit.Assert.assertNotNull(objBuilder16);
        org.junit.Assert.assertNotNull(objBuilder21);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy22 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy22.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(objBuilder23);
        org.junit.Assert.assertNull(objSerializableDeserializer26);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strComparableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objBuilderKafkaSpoutConfigKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objBuilderKafkaSpoutConfigBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(strMap0, kafkaSpoutStreams1, objBuilderKafkaSpoutConfigKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        int int6 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        objBuilderKafkaSpoutConfig0.kafkaProps = strMap7;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer9 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer9;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str4, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str5, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        int int5 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        long long6 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder7.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objBuilder7.firstPollOffsetStrategy;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.util.regex.Pattern pattern13 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(objBuilder9);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy10 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy10.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(pattern13);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = objBuilderKafkaSpoutTuplesBuilder6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(charSequenceDeserializer3);
        org.junit.Assert.assertNull(objBuilderKafkaSpoutTuplesBuilder6);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = '4';
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Comparable<java.lang.String>> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objBuilderKafkaSpoutConfigKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objBuilderKafkaSpoutConfigBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, objBuilderKafkaSpoutConfigKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        objBuilder0.kafkaProps = strMap3;
        long long5 = objBuilder0.offsetCommitPeriodMs;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = objBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.String> typeKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.String> typeBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.String>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.CharSequence> objBuilderKafkaSpoutConfigBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.CharSequence> objBuilderKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.CharSequence>(objBuilderKafkaSpoutConfigBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder0.setOffsetCommitPeriodMs((long) (short) -1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer7 = objBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objBuilder0.retryService = kafkaSpoutRetryService8;
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNull(objSerializableDeserializer7);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(charSequenceDeserializer3);
        org.junit.Assert.assertNull(objBuilderKafkaSpoutTuplesBuilder6);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setPollTimeoutMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = objBuilder0.tuplesBuilder;
        objBuilder0.pollTimeoutMs = (byte) -1;
        int int7 = objBuilder0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer8 = objBuilder0.valueDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = serializableSerializableDeserializer8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder2);
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(serializableSerializableDeserializer8);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer3 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(charSequenceDeserializer1);
        org.junit.Assert.assertNull(charSequenceDeserializer2);
        org.junit.Assert.assertNull(objBuilderDeserializer3);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>();
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig5 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = null;
        objBuilderKafkaSpoutConfig5.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        objBuilderKafkaSpoutConfig5.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        java.lang.Class<?> wildcardClass11 = firstPollOffsetStrategy8.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 10;
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (short) -1;
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.Type> objBuilderKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.Type>();
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type>();
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 32L;
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = ' ';
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer6;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer8 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService10;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams12;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setPollTimeoutMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder3 = null;
        objBuilder2.tuplesBuilder = objKafkaSpoutTuplesBuilder3;
        java.lang.Class<?> wildcardClass5 = objBuilder2.getClass();
        org.junit.Assert.assertNotNull(objBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer1 = objBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder3 = objBuilder0.setValueDeserializer(serializableSerializableDeserializer2);
        long long4 = objBuilder3.pollTimeoutMs;
        int int5 = objBuilder3.maxUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = objBuilder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializableSerializableDeserializer1);
        org.junit.Assert.assertNotNull(objBuilder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilder0.kafkaProps;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer6 = objBuilder0.valueDeserializer;
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(serializableSerializableDeserializer6);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.String>();
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> typeBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(typeBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.lang.String> wildcardClassBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.lang.String>();
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 52;
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>();
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.GenericDeclaration> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        objBuilder4.kafkaProps = strMap5;
        long long7 = objBuilder4.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder4.setMaxUncommittedOffsets((int) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder11 = objBuilder9.setMaxUncommittedOffsets((int) (short) 0);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder12 = null;
        objBuilder11.tuplesBuilder = objKafkaSpoutTuplesBuilder12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder15 = objBuilder11.setPollTimeoutMs((long) (byte) 0);
        objBuilder11.pollTimeoutMs = 0L;
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(objBuilder9);
        org.junit.Assert.assertNotNull(objBuilder11);
        org.junit.Assert.assertNotNull(objBuilder15);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        objBuilder0.pollTimeoutMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer7 = null;
        objBuilder0.valueDeserializer = serializableSerializableDeserializer7;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = null;
        objBuilder0.retryService = kafkaSpoutRetryService9;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig11 = objBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder4);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams5;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (byte) 100;
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(strBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objBuilderKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> firstPollOffsetStrategyKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer4;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 32L;
        org.junit.Assert.assertNull(charSequenceDeserializer1);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object>();
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        objBuilder0.pollTimeoutMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer7 = objBuilder0.keyDeserializer;
        long long8 = objBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer9 = objBuilder0.keyDeserializer;
        objBuilder0.maxUncommittedOffsets = (byte) -1;
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNull(objSerializableDeserializer7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertNull(objSerializableDeserializer9);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type> firstPollOffsetStrategyEnumKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type>();
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.GenericDeclaration> objBuilderKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.GenericDeclaration> objBuilderBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, objBuilderKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        long long6 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        int int7 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str5, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str8, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer4;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        objBuilderKafkaSpoutConfig0.kafkaProps = strMap6;
        org.junit.Assert.assertNull(charSequenceDeserializer1);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Class<?>> objBuilderKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Class<?>>();
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setPollTimeoutMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder5 = objBuilder0.setValueDeserializer(serializableSerializableDeserializer4);
        long long6 = objBuilder0.pollTimeoutMs;
        org.junit.Assert.assertNotNull(objBuilder2);
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertNotNull(objBuilder5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.CharSequence> charSequenceKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.CharSequence>();
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.Type> strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.Type> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.Type>(strBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        objBuilderKafkaSpoutConfig0.kafkaProps = strMap6;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy3 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy3.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(charSequenceDeserializer5);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.AnnotatedElement> objBuilderBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.AnnotatedElement> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.reflect.AnnotatedElement>(objBuilderBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        int int5 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService6;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer8 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        java.util.regex.Pattern pattern9 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objBuilderDeserializer8);
        org.junit.Assert.assertNull(pattern9);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.String> typeKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.String>();
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer4;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer8 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        long long9 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        java.lang.Class<?> wildcardClass10 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(firstPollOffsetStrategy7);
        org.junit.Assert.assertNull(charSequenceDeserializer8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (short) 1;
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        long long6 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        int int7 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str5, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str8, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.Class<?>> wildcardClassKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.Class<?>>();
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        objBuilder4.kafkaProps = strMap5;
        objBuilder4.offsetCommitPeriodMs = (byte) 1;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer9 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder10 = objBuilder4.setKeyDeserializer(objSerializableDeserializer9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig11 = objBuilder10.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder10);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objBuilderKafkaSpoutConfig0.retryService;
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService7;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str4, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutRetryService5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str6, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (byte) 0;
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        int int5 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(charSequenceDeserializer6);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (short) 0;
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = '#';
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.io.Serializable> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.io.Serializable>();
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> serializableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> serializableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 35L;
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.io.Serializable>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyEnumBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(firstPollOffsetStrategyEnumBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer6 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer6;
        java.util.List<java.lang.String> strList8 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        int int9 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder5;
        java.util.regex.Pattern pattern7 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pattern7);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>(annotatedElementBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer2;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable>();
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder0.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer7 = null;
        objBuilder6.keyDeserializer = objSerializableDeserializer7;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        objBuilder6.kafkaProps = strMap9;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer11 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder12 = objBuilder6.setKeyDeserializer(objSerializableDeserializer11);
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNotNull(objBuilder12);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder1 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        int int5 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.lang.Class<?> wildcardClass6 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy3 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy3.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 32;
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.String> wildcardClassKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.String>();
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long3 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService4;
        long long6 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(charSequenceDeserializer1);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Class<?>> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Class<?>>();
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (short) 1;
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder8 = objBuilder4.setKeyDeserializer(objSerializableDeserializer7);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder11 = objBuilder9.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = objBuilder9.firstPollOffsetStrategy;
        objBuilder8.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        objBuilder8.maxUncommittedOffsets = 100;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer16 = objBuilder8.keyDeserializer;
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNotNull(objBuilder8);
        org.junit.Assert.assertNotNull(objBuilder11);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNull(objSerializableDeserializer16);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.String>(annotatedElementBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Object>();
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        objBuilderKafkaSpoutConfig0.kafkaProps = strMap6;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer8 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long10 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy3 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy3.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(charSequenceDeserializer5);
        org.junit.Assert.assertNull(objBuilderDeserializer8);
        org.junit.Assert.assertNull(kafkaSpoutRetryService9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        objBuilderKafkaSpoutConfig0.kafkaProps = strMap6;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder8 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder9 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer10 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy3 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy3.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(charSequenceDeserializer5);
        org.junit.Assert.assertNull(objBuilderKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(objBuilderKafkaSpoutTuplesBuilder9);
        org.junit.Assert.assertNull(objBuilderDeserializer10);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.regex.Pattern pattern2 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.Class<?> wildcardClass4 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertNull(charSequenceDeserializer1);
        org.junit.Assert.assertNull(pattern2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (byte) 10;
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement>(firstPollOffsetStrategyBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.GenericDeclaration> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer4;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str8 = objBuilderKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap12 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str7, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str8, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object>();
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        objBuilder4.maxUncommittedOffsets = 10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer7 = objBuilder4.valueDeserializer;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer8);
        objBuilder9.offsetCommitPeriodMs = (short) 100;
        objBuilder9.pollTimeoutMs = 1;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig14 = objBuilder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNull(serializableSerializableDeserializer7);
        org.junit.Assert.assertNotNull(objBuilder9);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 10L;
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = (short) 0;
        objBuilder0.maxUncommittedOffsets = (byte) 10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer5 = objBuilder0.keyDeserializer;
        org.junit.Assert.assertNull(objSerializableDeserializer5);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer1 = objBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder3 = objBuilder0.setValueDeserializer(serializableSerializableDeserializer2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = objBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializableSerializableDeserializer1);
        org.junit.Assert.assertNotNull(objBuilder3);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 100;
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (short) -1;
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilderKafkaSpoutConfig0.retryService;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str4, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 52L;
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str5, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(firstPollOffsetStrategy6);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>(typeBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy3);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setOffsetCommitPeriodMs((long) (-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder7.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder11 = objBuilder7.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder13 = objBuilder7.setFirstPollOffsetStrategy(firstPollOffsetStrategy12);
        objBuilder4.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        long long15 = objBuilder4.offsetCommitPeriodMs;
        long long16 = objBuilder4.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder18 = objBuilder4.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder20 = objBuilder4.setPollTimeoutMs((long) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService21 = objBuilder4.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService22 = null;
        objBuilder4.retryService = kafkaSpoutRetryService22;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer24 = null;
        objBuilder4.keyDeserializer = objSerializableDeserializer24;
        java.lang.Class<?> wildcardClass26 = objBuilder4.getClass();
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNotNull(objBuilder11);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(objBuilder13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(objBuilder18);
        org.junit.Assert.assertNotNull(objBuilder20);
        org.junit.Assert.assertNull(kafkaSpoutRetryService21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence>();
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration> objBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.reflect.GenericDeclaration> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.reflect.GenericDeclaration>(objBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer3 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(charSequenceDeserializer1);
        org.junit.Assert.assertNull(charSequenceDeserializer2);
        org.junit.Assert.assertNull(objBuilderDeserializer3);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objBuilderKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        objBuilderKafkaSpoutConfig0.kafkaProps = strMap6;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str4, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutRetryService5);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (short) 10;
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (-1);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer4;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objBuilderKafkaSpoutConfig0.kafkaProps;
        long long7 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService6;
        java.lang.Class<?> wildcardClass8 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(charSequenceDeserializer3);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertNull(objBuilderKafkaSpoutTuplesBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> genericDeclarationBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(genericDeclarationBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objBuilderKafkaSpoutConfig0.retryService;
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService7;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams9;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap12 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str4, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutRetryService5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str6, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        objBuilder4.kafkaProps = strMap5;
        long long7 = objBuilder4.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder4.setMaxUncommittedOffsets((int) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder11 = objBuilder9.setMaxUncommittedOffsets((int) (short) 0);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder12 = null;
        objBuilder11.tuplesBuilder = objKafkaSpoutTuplesBuilder12;
        long long14 = objBuilder11.offsetCommitPeriodMs;
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(objBuilder9);
        org.junit.Assert.assertNotNull(objBuilder11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        long long4 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long5 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(charSequenceDeserializer1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer4;
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        long long7 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        java.lang.Class<?> wildcardClass8 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str6, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer3 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService4;
        long long6 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        long long7 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        org.junit.Assert.assertNull(charSequenceDeserializer1);
        org.junit.Assert.assertNull(charSequenceDeserializer2);
        org.junit.Assert.assertNull(objBuilderDeserializer3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> genericDeclarationBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(genericDeclarationBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Class<?>> typeKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Class<?>>();
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String>();
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 1;
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        objBuilder4.maxUncommittedOffsets = 10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer7 = objBuilder4.valueDeserializer;
        objBuilder4.offsetCommitPeriodMs = (short) 1;
        objBuilder4.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder13 = objBuilder4.setOffsetCommitPeriodMs(1L);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = objBuilder4.retryService;
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNull(serializableSerializableDeserializer7);
        org.junit.Assert.assertNotNull(objBuilder13);
        org.junit.Assert.assertNull(kafkaSpoutRetryService14);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.Type> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.Type>();
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.reflect.Type> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.Type> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object>();
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        int int5 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer6;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.Object> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        objBuilder4.kafkaProps = strMap5;
        long long7 = objBuilder4.offsetCommitPeriodMs;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig8 = objBuilder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 52L;
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer7 = objBuilder4.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder4.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder10 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder10.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder14 = objBuilder10.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer15 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder16 = objBuilder14.setValueDeserializer(serializableSerializableDeserializer15);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService17 = objBuilder14.retryService;
        objBuilder14.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer20 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder21 = objBuilder14.setKeyDeserializer(objSerializableDeserializer20);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder22 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder24 = objBuilder22.setPollTimeoutMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy25 = objBuilder24.firstPollOffsetStrategy;
        objBuilder14.firstPollOffsetStrategy = firstPollOffsetStrategy25;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder27 = objBuilder9.setFirstPollOffsetStrategy(firstPollOffsetStrategy25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig28 = objBuilder27.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNull(serializableSerializableDeserializer7);
        org.junit.Assert.assertNotNull(objBuilder9);
        org.junit.Assert.assertNotNull(objBuilder14);
        org.junit.Assert.assertNotNull(objBuilder16);
        org.junit.Assert.assertNull(kafkaSpoutRetryService17);
        org.junit.Assert.assertNotNull(objBuilder21);
        org.junit.Assert.assertNotNull(objBuilder24);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy25 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy25.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(objBuilder27);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objBuilder4.retryService;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig10 = objBuilder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        org.junit.Assert.assertNotNull(objBuilder9);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer1 = objBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder3 = objBuilder0.setValueDeserializer(serializableSerializableDeserializer2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder5 = objBuilder3.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objBuilder3.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer7 = objBuilder3.keyDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig8 = objBuilder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializableSerializableDeserializer1);
        org.junit.Assert.assertNotNull(objBuilder3);
        org.junit.Assert.assertNotNull(objBuilder5);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy6 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy6.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNull(objSerializableDeserializer7);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String> firstPollOffsetStrategyKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String>();
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderKafkaSpoutConfigKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderKafkaSpoutConfigBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(strMap0, kafkaSpoutStreams1, objBuilderKafkaSpoutConfigKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = (short) 0;
        long long3 = objBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objBuilder0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = objBuilder0.setPollTimeoutMs(100L);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder7.setValueDeserializer(serializableSerializableDeserializer8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig10 = objBuilder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(objBuilder7);
        org.junit.Assert.assertNotNull(objBuilder9);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = strList2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy3 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy3.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(objBuilderKafkaSpoutTuplesBuilder5);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(strBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilder2.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long5 = objBuilderKafkaSpoutConfig4.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList6 = objBuilderKafkaSpoutConfig4.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objBuilderKafkaSpoutConfig4.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer8 = null;
        objBuilderKafkaSpoutConfig4.valueDeserializer = charSequenceDeserializer8;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = objBuilderKafkaSpoutConfig4.kafkaProps;
        java.lang.String str11 = objBuilderKafkaSpoutConfig4.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = null;
        objBuilderKafkaSpoutConfig4.retryService = kafkaSpoutRetryService12;
        long long14 = objBuilderKafkaSpoutConfig4.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy15 = objBuilderKafkaSpoutConfig4.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder16.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder20 = objBuilder16.setOffsetCommitPeriodMs((long) 100);
        objBuilder20.maxUncommittedOffsets = 10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer23 = objBuilder20.valueDeserializer;
        objBuilder20.offsetCommitPeriodMs = (short) 1;
        objBuilder20.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder29 = objBuilder20.setOffsetCommitPeriodMs(1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy30 = objBuilder29.firstPollOffsetStrategy;
        objBuilderKafkaSpoutConfig4.firstPollOffsetStrategy = firstPollOffsetStrategy30;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder32 = objBuilder2.setFirstPollOffsetStrategy(firstPollOffsetStrategy30);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig33 = objBuilder2.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder2);
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str11, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy15);
        org.junit.Assert.assertNotNull(objBuilder20);
        org.junit.Assert.assertNull(serializableSerializableDeserializer23);
        org.junit.Assert.assertNotNull(objBuilder29);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy30 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy30.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(objBuilder32);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.regex.Pattern pattern5 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.util.List<java.lang.String> strList7 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pattern5);
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap6 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(pattern4);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setPollTimeoutMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = objBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = objBuilder7.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder9.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder13 = objBuilder9.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer14 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder15 = objBuilder13.setValueDeserializer(serializableSerializableDeserializer14);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer16 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder17 = objBuilder13.setKeyDeserializer(objSerializableDeserializer16);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy18 = objBuilder17.firstPollOffsetStrategy;
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = objBuilder17.kafkaProps;
        objBuilder17.pollTimeoutMs = 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy22 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder23 = objBuilder17.setFirstPollOffsetStrategy(firstPollOffsetStrategy22);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder24 = objBuilder7.setFirstPollOffsetStrategy(firstPollOffsetStrategy22);
        int int25 = objBuilder7.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer26 = objBuilder7.keyDeserializer;
        org.junit.Assert.assertNotNull(objBuilder2);
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder4);
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder5);
        org.junit.Assert.assertNotNull(objBuilder7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(objBuilder13);
        org.junit.Assert.assertNotNull(objBuilder15);
        org.junit.Assert.assertNotNull(objBuilder17);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy18 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy18.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy22 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy22.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(objBuilder23);
        org.junit.Assert.assertNotNull(objBuilder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNull(objSerializableDeserializer26);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        objBuilder4.maxUncommittedOffsets = 10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer7 = objBuilder4.valueDeserializer;
        objBuilder4.offsetCommitPeriodMs = (short) 1;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        objBuilder4.kafkaProps = strMap10;
        int int12 = objBuilder4.maxUncommittedOffsets;
        objBuilder4.offsetCommitPeriodMs = 0L;
        objBuilder4.pollTimeoutMs = 52;
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNull(serializableSerializableDeserializer7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type> firstPollOffsetStrategyBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> strComparableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 100L;
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        long long3 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder4 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder4;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer6 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer6;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objBuilderKafkaSpoutConfig0.getRetryService();
        long long9 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams5;
        java.util.regex.Pattern pattern7 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        long long8 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer9 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer9;
        java.lang.Class<?> wildcardClass11 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pattern7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder8 = objBuilder4.setPollTimeoutMs((long) (byte) 1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer9 = objBuilder4.valueDeserializer;
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNotNull(objBuilder8);
        org.junit.Assert.assertNull(serializableSerializableDeserializer9);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 1;
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService3;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        objBuilderKafkaSpoutConfig0.kafkaProps = strMap5;
        java.lang.Class<?> wildcardClass7 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(firstPollOffsetStrategy2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.io.Serializable> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.io.Serializable> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.io.Serializable>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int2 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder4 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        java.lang.Class<?> wildcardClass5 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertNull(objBuilderKafkaSpoutTuplesBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 'a';
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.String> objBuilderKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.String> objBuilderBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.String>(strMap0, kafkaSpoutStreams1, objBuilderKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.CharSequence> typeKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.CharSequence>();
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        objBuilder4.kafkaProps = strMap5;
        long long7 = objBuilder4.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder4.setMaxUncommittedOffsets((int) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder11 = objBuilder9.setMaxUncommittedOffsets((int) (short) 0);
        int int12 = objBuilder11.maxUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig13 = objBuilder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(objBuilder9);
        org.junit.Assert.assertNotNull(objBuilder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 30000L;
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.String> serializableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.String> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.String>(serializableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Object> objBuilderKafkaSpoutConfigKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Object> objBuilderKafkaSpoutConfigBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Object>(strMap0, kafkaSpoutStreams1, objBuilderKafkaSpoutConfigKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder1 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder1;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.CharSequence> objBuilderKafkaSpoutConfigKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.CharSequence>();
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.Type> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.Type>();
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        long long3 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder4 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder6;
        long long8 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer9 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap12 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(objBuilderDeserializer9);
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilder0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = kafkaSpoutRetryService3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.io.Serializable>();
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 97;
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = '4';
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer6 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer6;
        long long8 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<?> wildcardClass9 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.String>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer7 = objBuilder4.valueDeserializer;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer8);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        objBuilder4.retryService = kafkaSpoutRetryService10;
        objBuilder4.pollTimeoutMs = 97L;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig14 = objBuilder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNull(serializableSerializableDeserializer7);
        org.junit.Assert.assertNotNull(objBuilder9);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        int int4 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer7 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer7;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer9 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charSequenceDeserializer9);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer7 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer7;
        long long9 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = objBuilderKafkaSpoutConfig0.getRetryService();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(charSequenceDeserializer6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (short) -1;
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (byte) 10;
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 1;
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.util.List<java.lang.String> strList1 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        java.util.regex.Pattern pattern4 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer8 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        long long9 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(charSequenceDeserializer3);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str5, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str6, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(objBuilderDeserializer8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        int int6 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer9 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer9;
        java.lang.String str11 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str12 = objBuilderKafkaSpoutConfig0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str4, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str5, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str11, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str12, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (byte) 100;
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer1 = objBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder3 = objBuilder0.setOffsetCommitPeriodMs((long) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder5 = objBuilder3.setValueDeserializer(serializableSerializableDeserializer4);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer6 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = objBuilder5.setKeyDeserializer(objSerializableDeserializer6);
        java.lang.Class<?> wildcardClass8 = objBuilder7.getClass();
        org.junit.Assert.assertNull(serializableSerializableDeserializer1);
        org.junit.Assert.assertNotNull(objBuilder3);
        org.junit.Assert.assertNotNull(objBuilder5);
        org.junit.Assert.assertNotNull(objBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> charSequenceBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(charSequenceBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.reflect.AnnotatedElement> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = objBuilder6.firstPollOffsetStrategy;
        java.lang.Class<?> wildcardClass8 = objBuilder6.getClass();
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy7 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy7.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (short) 1;
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objBuilderKafkaSpoutConfig0.retryService;
        long long8 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(charSequenceDeserializer6);
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.String> objBuilderBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.String> objBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.String>(objBuilderBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.String> objBuilderKafkaSpoutConfigKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.String> objBuilderKafkaSpoutConfigBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.String>(strMap0, kafkaSpoutStreams1, objBuilderKafkaSpoutConfigKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder0.setOffsetCommitPeriodMs((long) (short) -1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer7 = objBuilder0.keyDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = objSerializableDeserializer7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNull(objSerializableDeserializer7);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer4;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objBuilderKafkaSpoutConfig0.kafkaProps;
        long long7 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> wildcardClassKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 97;
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        java.lang.String str4 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str5 = objBuilderKafkaSpoutConfig0.toString();
        int int6 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer9 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer9;
        java.util.List<java.lang.String> strList11 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService12;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str4, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str5, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strList11);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer4;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer8 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder9.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = objBuilder9.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = objBuilder9.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder15 = objBuilder9.setOffsetCommitPeriodMs((long) (short) -1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer16 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder17 = objBuilder9.setValueDeserializer(serializableSerializableDeserializer16);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder18 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer19 = objBuilder18.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder21 = objBuilder18.setOffsetCommitPeriodMs((long) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer22 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder23 = objBuilder21.setValueDeserializer(serializableSerializableDeserializer22);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer24 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder25 = objBuilder23.setKeyDeserializer(objSerializableDeserializer24);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer26 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder27 = objBuilder23.setKeyDeserializer(objSerializableDeserializer26);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy28 = objBuilder27.firstPollOffsetStrategy;
        objBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy28;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy28;
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap32 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str7, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(objBuilderDeserializer8);
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        org.junit.Assert.assertNull(kafkaSpoutRetryService13);
        org.junit.Assert.assertNotNull(objBuilder15);
        org.junit.Assert.assertNotNull(objBuilder17);
        org.junit.Assert.assertNull(serializableSerializableDeserializer19);
        org.junit.Assert.assertNotNull(objBuilder21);
        org.junit.Assert.assertNotNull(objBuilder23);
        org.junit.Assert.assertNotNull(objBuilder25);
        org.junit.Assert.assertNotNull(objBuilder27);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy28 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy28.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.List<java.lang.String> strList3 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.getRetryService();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer7 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer7;
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.String str10 = objBuilderKafkaSpoutConfig0.toString();
        int int11 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=-1, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str9, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=-1, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=-1, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str10, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=-1, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        objBuilderKafkaSpoutConfig0.kafkaProps = strMap3;
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        java.lang.Class<?> wildcardClass8 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(charSequenceDeserializer2);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy3);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setOffsetCommitPeriodMs((long) (-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder7.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder11 = objBuilder7.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder13 = objBuilder7.setFirstPollOffsetStrategy(firstPollOffsetStrategy12);
        objBuilder4.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        long long15 = objBuilder4.offsetCommitPeriodMs;
        long long16 = objBuilder4.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder18 = objBuilder4.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams19 = null;
        objBuilder4.kafkaSpoutStreams = kafkaSpoutStreams19;
        objBuilder4.offsetCommitPeriodMs = (byte) 1;
        java.lang.Class<?> wildcardClass23 = objBuilder4.getClass();
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNotNull(objBuilder11);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(objBuilder13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(objBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objBuilderKafkaSpoutConfig0.kafkaSpoutStreams;
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 10;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer7 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(charSequenceDeserializer1);
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        org.junit.Assert.assertNull(objBuilderDeserializer7);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Comparable<java.lang.String>> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder5;
        java.util.regex.Pattern pattern7 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer8 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pattern7);
        org.junit.Assert.assertNull(charSequenceDeserializer8);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> objBuilderKafkaSpoutConfigBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> objBuilderKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>(objBuilderKafkaSpoutConfigBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 32L;
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer1 = objBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder3 = objBuilder0.setOffsetCommitPeriodMs((long) 0);
        objBuilder3.offsetCommitPeriodMs = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objBuilder3.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder8 = objBuilder3.setOffsetCommitPeriodMs(100L);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer9 = null;
        objBuilder8.valueDeserializer = serializableSerializableDeserializer9;
        java.lang.Class<?> wildcardClass11 = objBuilder8.getClass();
        org.junit.Assert.assertNull(serializableSerializableDeserializer1);
        org.junit.Assert.assertNotNull(objBuilder3);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy6 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy6.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(objBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.Object> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Object> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Object>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder5;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        objBuilderKafkaSpoutConfig0.kafkaProps = strMap7;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = objBuilderKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder10 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder10.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder14 = objBuilder10.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer15 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder16 = objBuilder14.setValueDeserializer(serializableSerializableDeserializer15);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer17 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder18 = objBuilder14.setKeyDeserializer(objSerializableDeserializer17);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder19 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder21 = objBuilder19.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy22 = objBuilder19.firstPollOffsetStrategy;
        objBuilder18.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer25 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService9);
        org.junit.Assert.assertNotNull(objBuilder14);
        org.junit.Assert.assertNotNull(objBuilder16);
        org.junit.Assert.assertNotNull(objBuilder18);
        org.junit.Assert.assertNotNull(objBuilder21);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy22 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy22.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNull(charSequenceDeserializer25);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        int int5 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        long long7 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams8;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap11 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str6, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> typeBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(typeBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (short) 10;
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objBuilderKafkaSpoutConfigKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.CharSequence> objBuilderKafkaSpoutConfigKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.CharSequence> objBuilderKafkaSpoutConfigBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, objBuilderKafkaSpoutConfigKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer8 = objBuilderKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder9 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(charSequenceDeserializer6);
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        org.junit.Assert.assertNull(objBuilderDeserializer8);
        org.junit.Assert.assertNull(objBuilderKafkaSpoutTuplesBuilder9);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer2 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer3 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer3;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = kafkaSpoutStreams5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(objBuilderDeserializer2);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer7 = objBuilder4.valueDeserializer;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer8 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer8);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer10 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder11 = objBuilder4.setKeyDeserializer(objSerializableDeserializer10);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = objBuilder4.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        objBuilder4.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNull(serializableSerializableDeserializer7);
        org.junit.Assert.assertNotNull(objBuilder9);
        org.junit.Assert.assertNotNull(objBuilder11);
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Object>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String> firstPollOffsetStrategyEnumKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String>();
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> serializableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> serializableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        objBuilder4.kafkaProps = strMap5;
        objBuilder4.offsetCommitPeriodMs = (byte) 1;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer9 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder10 = objBuilder4.setKeyDeserializer(objSerializableDeserializer9);
        objBuilder10.maxUncommittedOffsets = 100;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        objBuilder10.kafkaProps = strMap13;
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder10);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setPollTimeoutMs(200L);
        objBuilder0.offsetCommitPeriodMs = 32;
        org.junit.Assert.assertNotNull(objBuilder4);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        long long5 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<?> wildcardClass6 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy3 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy3.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        java.lang.Class<?> wildcardClass7 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(charSequenceDeserializer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str6, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder5 = objBuilder0.setPollTimeoutMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = objBuilder0.setOffsetCommitPeriodMs(200L);
        objBuilder7.maxUncommittedOffsets = (byte) 10;
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        org.junit.Assert.assertNotNull(objBuilder5);
        org.junit.Assert.assertNotNull(objBuilder7);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 200L;
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 97L;
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        int int5 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.regex.Pattern pattern6 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        int int8 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str7, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.io.Serializable>(strComparableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (short) 10;
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer4;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer8 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        long long9 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer10 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = objBuilderKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(firstPollOffsetStrategy7);
        org.junit.Assert.assertNull(charSequenceDeserializer8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.io.Serializable> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.io.Serializable>();
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer4;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objBuilderKafkaSpoutConfig0.kafkaProps;
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService8;
        long long10 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.util.regex.Pattern pattern12 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer13 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str7, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy11);
        org.junit.Assert.assertNull(pattern12);
        org.junit.Assert.assertNull(charSequenceDeserializer13);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 0;
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = objBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder5 = objBuilder0.setPollTimeoutMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = objBuilder0.setOffsetCommitPeriodMs(200L);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer8 = null;
        objBuilder0.keyDeserializer = objSerializableDeserializer8;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig10 = objBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        org.junit.Assert.assertNotNull(objBuilder5);
        org.junit.Assert.assertNotNull(objBuilder7);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = '#';
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.String> strKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 200L;
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder2 = objBuilder0.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = objBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder5 = objBuilder0.setPollTimeoutMs((long) '#');
        long long6 = objBuilder5.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objBuilder5.retryService;
        org.junit.Assert.assertNotNull(objBuilder2);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy3 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy3.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(objBuilder5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder5;
        java.lang.Class<?> wildcardClass7 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertNull(charSequenceDeserializer1);
        org.junit.Assert.assertNull(charSequenceDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.retryService;
        long long5 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        int int5 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        long long7 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        long long9 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs = 32L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService12;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str6, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutStreams8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence>();
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.String> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.String> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.String>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setValueDeserializer(serializableSerializableDeserializer5);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objBuilder4.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder4.setOffsetCommitPeriodMs(30000L);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = objBuilder4.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = objBuilder4.kafkaProps;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig12 = objBuilder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        org.junit.Assert.assertNotNull(objBuilder9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.CharSequence> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.CharSequence>();
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.Object>();
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> genericDeclarationBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder2 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder2;
        int int4 = objBuilderKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams5;
        long long7 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService6;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService8;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.CharSequence> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.CharSequence>();
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objBuilderKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objBuilderKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = null;
        objBuilderKafkaSpoutConfig0.retryService = kafkaSpoutRetryService6;
        long long8 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(charSequenceDeserializer3);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        org.junit.Assert.assertNull(objBuilderKafkaSpoutTuplesBuilder5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer1 = objBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder3 = objBuilder0.setValueDeserializer(serializableSerializableDeserializer2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder5 = objBuilder3.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objBuilder3.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer7 = objBuilder3.keyDeserializer;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer8 = null;
        objBuilder3.keyDeserializer = objSerializableDeserializer8;
        java.lang.Class<?> wildcardClass10 = objBuilder3.getClass();
        org.junit.Assert.assertNull(serializableSerializableDeserializer1);
        org.junit.Assert.assertNotNull(objBuilder3);
        org.junit.Assert.assertNotNull(objBuilder5);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy6 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy6.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNull(objSerializableDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> typeKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> typeBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        int int5 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        long long7 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        java.util.List<java.lang.String> strList8 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objBuilderKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str6, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 100;
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object>();
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        objBuilderKafkaSpoutConfig0.kafkaProps = strMap3;
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (short) 100;
        java.lang.String str7 = objBuilderKafkaSpoutConfig0.toString();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = 200L;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = objBuilderKafkaSpoutConfig0.getKafkaProps();
        int int11 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String str12 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder13 = objBuilderKafkaSpoutConfig0.tuplesBuilder;
        java.lang.Class<?> wildcardClass14 = objBuilderKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(charSequenceDeserializer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=100, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str7, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=100, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=200, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str12, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=200, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(objBuilderKafkaSpoutTuplesBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer1 = objBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder3 = objBuilder0.setOffsetCommitPeriodMs((long) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder5 = objBuilder3.setValueDeserializer(serializableSerializableDeserializer4);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer6 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = objBuilder5.setKeyDeserializer(objSerializableDeserializer6);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer8 = objBuilder5.valueDeserializer;
        org.junit.Assert.assertNull(serializableSerializableDeserializer1);
        org.junit.Assert.assertNotNull(objBuilder3);
        org.junit.Assert.assertNotNull(objBuilder5);
        org.junit.Assert.assertNotNull(objBuilder7);
        org.junit.Assert.assertNull(serializableSerializableDeserializer8);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy3);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder6 = objBuilder4.setOffsetCommitPeriodMs((long) (-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder7.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder11 = objBuilder7.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder13 = objBuilder7.setFirstPollOffsetStrategy(firstPollOffsetStrategy12);
        objBuilder4.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        long long15 = objBuilder4.offsetCommitPeriodMs;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig16 = objBuilder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNotNull(objBuilder6);
        org.junit.Assert.assertNotNull(objBuilder11);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(objBuilder13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = '#';
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        int int2 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int3 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        objBuilderKafkaSpoutConfig0.kafkaProps = strMap4;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer6 = objBuilderKafkaSpoutConfig0.keyDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(objBuilderDeserializer6);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.CharSequence> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.CharSequence>();
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> serializableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>(serializableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.pollTimeoutMs;
        long long2 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long4 = objBuilderKafkaSpoutConfig3.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList5 = objBuilderKafkaSpoutConfig3.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = objBuilderKafkaSpoutConfig3.getValueDeserializer();
        java.util.regex.Pattern pattern7 = objBuilderKafkaSpoutConfig3.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        objBuilderKafkaSpoutConfig3.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder12 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap14 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(charSequenceDeserializer6);
        org.junit.Assert.assertNull(pattern7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        org.junit.Assert.assertNull(objBuilderKafkaSpoutTuplesBuilder12);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> wildcardClassKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>>();
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>> genericDeclarationKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>>();
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        objBuilderKafkaSpoutConfig0.pollTimeoutMs = (byte) 0;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy3);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer5 = objBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder7 = objBuilder0.setOffsetCommitPeriodMs((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig8 = objBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertNull(objSerializableDeserializer5);
        org.junit.Assert.assertNotNull(objBuilder7);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (byte) 10;
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = objBuilder0.setOffsetCommitPeriodMs((long) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        objBuilder4.kafkaProps = strMap5;
        long long7 = objBuilder4.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder9 = objBuilder4.setMaxUncommittedOffsets((int) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder10 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder10.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder14 = objBuilder10.setFirstPollOffsetStrategy(firstPollOffsetStrategy13);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder16 = objBuilder14.setOffsetCommitPeriodMs((long) (-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder17 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder17.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder21 = objBuilder17.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy22 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder23 = objBuilder17.setFirstPollOffsetStrategy(firstPollOffsetStrategy22);
        objBuilder14.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        objBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder26 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder26.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder30 = objBuilder26.setFirstPollOffsetStrategy(firstPollOffsetStrategy29);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder32 = objBuilder30.setOffsetCommitPeriodMs((long) (-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder33 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder33.offsetCommitPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder37 = objBuilder33.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy38 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder39 = objBuilder33.setFirstPollOffsetStrategy(firstPollOffsetStrategy38);
        objBuilder30.firstPollOffsetStrategy = firstPollOffsetStrategy38;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder42 = objBuilder30.setPollTimeoutMs(0L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig43 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long44 = objBuilderKafkaSpoutConfig43.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList45 = objBuilderKafkaSpoutConfig43.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy46 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        objBuilderKafkaSpoutConfig43.firstPollOffsetStrategy = firstPollOffsetStrategy46;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer48 = objBuilderKafkaSpoutConfig43.valueDeserializer;
        long long49 = objBuilderKafkaSpoutConfig43.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder50 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder52 = objBuilder50.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy53 = objBuilder50.firstPollOffsetStrategy;
        objBuilderKafkaSpoutConfig43.firstPollOffsetStrategy = firstPollOffsetStrategy53;
        objBuilder42.firstPollOffsetStrategy = firstPollOffsetStrategy53;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder56 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer57 = objBuilder56.valueDeserializer;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.io.Serializable> serializableSerializableDeserializer58 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder59 = objBuilder56.setValueDeserializer(serializableSerializableDeserializer58);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder61 = objBuilder59.setMaxUncommittedOffsets((int) (byte) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy62 = objBuilder59.firstPollOffsetStrategy;
        objBuilder42.firstPollOffsetStrategy = firstPollOffsetStrategy62;
        objBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy62;
        long long65 = objBuilder9.offsetCommitPeriodMs;
        org.junit.Assert.assertNotNull(objBuilder4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(objBuilder9);
        org.junit.Assert.assertNotNull(objBuilder14);
        org.junit.Assert.assertNotNull(objBuilder16);
        org.junit.Assert.assertNotNull(objBuilder21);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy22 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy22.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(objBuilder23);
        org.junit.Assert.assertNotNull(objBuilder30);
        org.junit.Assert.assertNotNull(objBuilder32);
        org.junit.Assert.assertNotNull(objBuilder37);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy38 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy38.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(objBuilder39);
        org.junit.Assert.assertNotNull(objBuilder42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNull(strList45);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy46 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy46.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(charSequenceDeserializer48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(objBuilder52);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy53 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy53.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNull(serializableSerializableDeserializer57);
        org.junit.Assert.assertNotNull(objBuilder59);
        org.junit.Assert.assertNotNull(objBuilder61);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy62 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy62.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 100L + "'", long65 == 100L);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = objBuilderKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>> objBuilderDeserializer4 = null;
        objBuilderKafkaSpoutConfig0.keyDeserializer = objBuilderDeserializer4;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = null;
        objBuilderKafkaSpoutConfig0.valueDeserializer = charSequenceDeserializer6;
        java.util.regex.Pattern pattern8 = objBuilderKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str9 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objBuilderKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = objBuilderKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap13 = objBuilderKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(pattern8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str9, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
        org.junit.Assert.assertNull(kafkaSpoutRetryService11);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>();
        objBuilder0.offsetCommitPeriodMs = 1L;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        objBuilder0.kafkaProps = strMap3;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = objBuilder0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder8 = objBuilder0.setKeyDeserializer(objSerializableDeserializer7);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy6 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy6.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(objBuilder8);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type>();
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        long long1 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList2 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        long long3 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder4 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder6 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder6;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder8 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder8;
        int int10 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder12 = objBuilderKafkaSpoutConfig0.getTuplesBuilder();
        long long13 = objBuilderKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(firstPollOffsetStrategy11);
        org.junit.Assert.assertNull(objBuilderKafkaSpoutTuplesBuilder12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer1 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer2 = objBuilderKafkaSpoutConfig0.valueDeserializer;
        objBuilderKafkaSpoutConfig0.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder5 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.junit.Assert.assertNull(charSequenceDeserializer1);
        org.junit.Assert.assertNull(charSequenceDeserializer2);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>();
        java.lang.String str1 = objBuilderKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objBuilderKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        int int5 = objBuilderKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String str6 = objBuilderKafkaSpoutConfig0.toString();
        long long7 = objBuilderKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = objBuilderKafkaSpoutConfig0.getKafkaSpoutStreams();
        long long9 = objBuilderKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objBuilderKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>, java.lang.CharSequence> objBuilderKafkaSpoutTuplesBuilder11 = null;
        objBuilderKafkaSpoutConfig0.tuplesBuilder = objBuilderKafkaSpoutTuplesBuilder11;
        java.util.List<java.lang.String> strList13 = objBuilderKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        objBuilderKafkaSpoutConfig0.kafkaProps = strMap14;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str6, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutStreams8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
        org.junit.Assert.assertNull(strList13);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

