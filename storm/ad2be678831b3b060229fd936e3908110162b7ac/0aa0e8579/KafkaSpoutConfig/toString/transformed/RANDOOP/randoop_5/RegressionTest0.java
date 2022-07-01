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
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.KEY_DESERIALIZER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "key.deserializer" + "'", str0, "key.deserializer");
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 10;
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 100;
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.BOOTSTRAP_SERVERS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bootstrap.servers" + "'", str0, "bootstrap.servers");
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        long long0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 30000L + "'", long0 == 30000L);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(firstPollOffsetStrategyEnumBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.ENABLE_AUTO_COMMIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enable.auto.commit" + "'", str0, "enable.auto.commit");
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
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
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 'a';
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 'a';
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.io.Serializable> strBuilderKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.io.Serializable> strBuilderBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.io.Serializable>(strMap0, kafkaSpoutStreams1, strBuilderKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        int int0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = serializableKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap6 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strBuilder0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = strBuilder0.retryService;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNull(kafkaSpoutRetryService13);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.VALUE_DESERIALIZER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "value.deserializer" + "'", str0, "value.deserializer");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> serializableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> serializableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        int int0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 97 + "'", int0 == 97);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.GROUP_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "group.id" + "'", str0, "group.id");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        long long0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 200L + "'", long0 == 200L);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig11 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (short) 0;
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 0L;
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        int int11 = strBuilder0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = strBuilder0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig15 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(kafkaSpoutRetryService14);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (byte) 0;
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.AUTO_COMMIT_INTERVAL_MS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "auto.commit.interval.ms" + "'", str0, "auto.commit.interval.ms");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig9 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder2 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder2;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        strBuilder9.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        strBuilder9.maxUncommittedOffsets = 10;
        strBuilder9.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy20 = strBuilder9.firstPollOffsetStrategy;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy20;
        java.lang.Class<?> wildcardClass22 = firstPollOffsetStrategy20.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy10 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy10.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy14 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy14.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy20 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy20.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Object> serializableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>(serializableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        java.lang.Class<?> wildcardClass1 = firstPollOffsetStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy0 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy0.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 0L;
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 10;
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap13 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(objDeserializer8);
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (byte) 1;
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder1);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.String> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.String>();
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = '#';
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
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
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 97L;
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 'a';
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.Type> serializableKafkaSpoutConfigKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.Type> serializableKafkaSpoutConfigBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutConfigKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 10;
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams13;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        strBuilder0.maxUncommittedOffsets = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig13 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setOffsetCommitPeriodMs((long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = strBuilder8.kafkaProps;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
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
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.kafkaProps;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 1;
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 0;
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.Type> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.Type>();
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.reflect.GenericDeclaration> strBuilderBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.reflect.GenericDeclaration> strBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.reflect.GenericDeclaration>(strBuilderBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (short) 1;
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer1 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (short) 1;
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = ' ';
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (byte) 10;
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.reflect.Type> strBuilderBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.reflect.Type> strBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.reflect.Type>(strBuilderBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        strBuilder0.kafkaProps = strMap9;
        java.lang.Class<?> wildcardClass11 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy7 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy7.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long11 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(objDeserializer8);
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (short) 1;
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Class<?>>();
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap11;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService13;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder15 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap17 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder15);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = serializableKafkaSpoutConfig0.getKafkaProps();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = serializableKafkaSpoutConfig0.valueDeserializer;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long13 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService14;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 200L;
        java.lang.Class<?> wildcardClass18 = serializableKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(objDeserializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = serializableKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        long long8 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap4 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setKeyDeserializer(strSerializableDeserializer13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig15 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        long long4 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap6;
        long long8 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(objDeserializer5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap11;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService13;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer15 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer15;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = '4';
        int int11 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer12 = serializableKafkaSpoutConfig0.keyDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(pattern8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNull(serializableDeserializer12);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strBuilder0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder5 = strBuilder0.setOffsetCommitPeriodMs((long) (byte) 10);
        java.lang.Class<?> wildcardClass6 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        strBuilder0.retryService = kafkaSpoutRetryService7;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        strBuilder0.kafkaProps = strMap9;
        java.lang.Class<?> wildcardClass11 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Object> typeBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Object> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Object>(typeBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = strBuilder7.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (short) 10;
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = ' ';
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 10L;
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (-1);
        long long6 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        strBuilder0.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer15 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setKeyDeserializer(strSerializableDeserializer15);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams17;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder20 = strBuilder0.setMaxUncommittedOffsets((int) (short) 100);
        java.lang.Class<?> wildcardClass21 = strBuilder20.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String> firstPollOffsetStrategyEnumKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String>();
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams10;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap13 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(pattern8);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.valueDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        org.junit.Assert.assertNull(objDeserializer4);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = strBuilder0.firstPollOffsetStrategy;
        long long12 = strBuilder0.offsetCommitPeriodMs;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy11 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy11.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 30000L + "'", long12 == 30000L);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder0.setPollTimeoutMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams16 = null;
        strBuilder15.kafkaSpoutStreams = kafkaSpoutStreams16;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(objDeserializer8);
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        strBuilder0.pollTimeoutMs = 10L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = strBuilder0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = strBuilder0.kafkaProps;
        long long12 = strBuilder0.pollTimeoutMs;
        strBuilder0.pollTimeoutMs = 30000L;
        java.lang.Class<?> wildcardClass15 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNull(kafkaSpoutStreams10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
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
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (byte) 1;
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 1;
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder7 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder7;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig9 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNull(strSerializableDeserializer6);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        int int4 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer5;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = serializableKafkaSpoutConfig0.getValueDeserializer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(objDeserializer7);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = serializableKafkaSpoutConfig0.retryService;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer5 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer5;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        long long4 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        int int7 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(objDeserializer5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams7;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        int int4 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer5;
        int int7 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = strBuilder0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig14 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 0;
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (byte) 10;
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        long long7 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(pattern8);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 35;
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (-1);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder5 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder5.firstPollOffsetStrategy = firstPollOffsetStrategy6;
        strBuilder5.maxUncommittedOffsets = (-1);
        long long10 = strBuilder5.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder5.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder5.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer15 = null;
        strBuilder5.valueDeserializer = strComparableSerializableDeserializer15;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder18 = strBuilder5.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy20 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder19.firstPollOffsetStrategy = firstPollOffsetStrategy20;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder22 = strBuilder5.setFirstPollOffsetStrategy(firstPollOffsetStrategy20);
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy20;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy6 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy6.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy20 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy20.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
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
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (short) 100;
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (short) -1;
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
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
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        strBuilder0.retryService = kafkaSpoutRetryService7;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        strBuilder0.kafkaProps = strMap9;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig11 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer1 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer1;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer3 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
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
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.retryService;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer3 = serializableKafkaSpoutConfig0.getValueDeserializer();
        java.lang.Class<?> wildcardClass4 = serializableKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(objDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        int int9 = strBuilder0.maxUncommittedOffsets;
        java.lang.Class<?> wildcardClass10 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = '#';
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (-1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer10 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setMaxUncommittedOffsets((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.String> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = 1;
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap11;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer13 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap15 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(objDeserializer13);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilderKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilderBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, strBuilderKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams5;
        int int7 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> charSequenceKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>>();
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 52;
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer13;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = null;
        strBuilder0.retryService = kafkaSpoutRetryService15;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration>(firstPollOffsetStrategyEnumBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.regex.Pattern pattern14 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = pattern14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        org.junit.Assert.assertNull(pattern14);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap13 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(objDeserializer11);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.regex.Pattern pattern14 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        java.lang.String str15 = serializableKafkaSpoutConfig0.toString();
        java.lang.Class<?> wildcardClass16 = serializableKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        org.junit.Assert.assertNull(pattern14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str15, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder0.setPollTimeoutMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder16.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        strBuilder15.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer20 = null;
        strBuilder15.keyDeserializer = strSerializableDeserializer20;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig22 = strBuilder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy17 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy17.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder11 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = serializableKafkaSpoutConfig0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder11);
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (short) 100;
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (short) 0;
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        strBuilder0.offsetCommitPeriodMs = 200L;
        strBuilder0.pollTimeoutMs = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setMaxUncommittedOffsets((int) (short) 100);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer15 = strBuilder14.valueDeserializer;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNull(strComparableSerializableDeserializer15);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strComparableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder16.kafkaSpoutStreams = kafkaSpoutStreams17;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder20 = strBuilder16.setPollTimeoutMs(30000L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig21 = strBuilder20.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 200L;
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.reflect.Type> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.Type> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.String> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.String>();
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        strBuilder0.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setOffsetCommitPeriodMs((long) (short) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder18 = strBuilder0.setPollTimeoutMs((long) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService19 = strBuilder0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig20 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNull(kafkaSpoutRetryService19);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>();
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = serializableKafkaSpoutConfig0.valueDeserializer;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long13 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = serializableKafkaSpoutConfig0.getRetryService();
        java.lang.Class<?> wildcardClass15 = serializableKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(objDeserializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 52;
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 100L;
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 97;
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = strBuilder0.retryService;
        strBuilder0.offsetCommitPeriodMs = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer16 = strBuilder0.valueDeserializer;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        org.junit.Assert.assertNull(kafkaSpoutStreams15);
        org.junit.Assert.assertNull(strComparableSerializableDeserializer16);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = serializableKafkaSpoutConfig0.valueDeserializer;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long13 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = serializableKafkaSpoutConfig0.getRetryService();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(objDeserializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService14);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer10 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy15 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder14.firstPollOffsetStrategy = firstPollOffsetStrategy15;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = strBuilder17.setMaxUncommittedOffsets(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig20 = strBuilder19.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 200L + "'", long5 == 200L);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy15 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy15.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer9 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer9;
        java.lang.Class<?> wildcardClass11 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 200L + "'", long5 == 200L);
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (short) -1;
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (-1);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder0.setPollTimeoutMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder16 = null;
        strBuilder15.tuplesBuilder = strKafkaSpoutTuplesBuilder16;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig18 = strBuilder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (byte) 1;
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (-1);
        long long6 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer5 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer5;
        serializableKafkaSpoutConfig0.pollTimeoutMs = (short) 0;
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        org.junit.Assert.assertNull(firstPollOffsetStrategy4);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder0.setPollTimeoutMs((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig16 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        strBuilder0.kafkaProps = strMap8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setPollTimeoutMs((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 200L + "'", long7 == 200L);
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.CharSequence> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.CharSequence>();
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (byte) 100;
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        long long6 = strBuilder0.offsetCommitPeriodMs;
        long long7 = strBuilder0.offsetCommitPeriodMs;
        int int8 = strBuilder0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer9;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 200L + "'", long5 == 200L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.getValueDeserializer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(objDeserializer8);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (short) -1;
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder2 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder2;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = serializableKafkaSpoutConfig0.kafkaProps;
        java.util.List<java.lang.String> strList5 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 35;
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        long long4 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        java.lang.Class<?> wildcardClass5 = serializableKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Class<?>> serializableKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Class<?>>();
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap6;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = serializableKafkaSpoutConfig0.getRetryService();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
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
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> charSequenceBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>(charSequenceBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap8;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer10 = serializableKafkaSpoutConfig0.keyDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(serializableDeserializer10);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.String> typeKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.String>();
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = '#';
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (short) 1;
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        strBuilder0.maxUncommittedOffsets = (byte) 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder9 = strBuilder0.tuplesBuilder;
        int int10 = strBuilder0.maxUncommittedOffsets;
        strBuilder0.pollTimeoutMs = 100L;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 200L + "'", long5 == 200L);
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.Class<?>> strBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.Class<?>>();
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (byte) -1;
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (short) 0;
        int int13 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap15 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams5;
        int int7 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap8;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = '4';
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder3.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        strBuilder3.kafkaSpoutStreams = kafkaSpoutStreams6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder3.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        strBuilder3.maxUncommittedOffsets = 10;
        strBuilder3.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = strBuilder3.firstPollOffsetStrategy;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        int int16 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap18 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy4 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy4.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy14 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy14.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder4.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder4.maxUncommittedOffsets = (-1);
        strBuilder4.offsetCommitPeriodMs = (-1L);
        long long11 = strBuilder4.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder12 = null;
        strBuilder4.tuplesBuilder = strKafkaSpoutTuplesBuilder12;
        strBuilder4.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams16 = strBuilder4.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = strBuilder4.kafkaSpoutStreams;
        long long18 = strBuilder4.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy20 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder19.firstPollOffsetStrategy = firstPollOffsetStrategy20;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams22 = null;
        strBuilder19.kafkaSpoutStreams = kafkaSpoutStreams22;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy24 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder19.firstPollOffsetStrategy = firstPollOffsetStrategy24;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy26 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        strBuilder19.firstPollOffsetStrategy = firstPollOffsetStrategy26;
        strBuilder4.firstPollOffsetStrategy = firstPollOffsetStrategy26;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy26;
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap30;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder1);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(kafkaSpoutStreams16);
        org.junit.Assert.assertNull(kafkaSpoutStreams17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy20 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy20.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy24 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy24.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy26 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy26.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
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
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder11 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.util.regex.Pattern pattern12 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder11);
        org.junit.Assert.assertNull(pattern12);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer10 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer10;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = serializableKafkaSpoutConfig0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(kafkaSpoutRetryService13);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.kafkaProps;
        long long6 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer7 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer7;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = serializableKafkaSpoutConfig0.getKafkaProps();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        org.junit.Assert.assertNull(objDeserializer4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 100;
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = serializableKafkaSpoutConfig0.getRetryService();
        java.lang.Class<?> wildcardClass13 = serializableKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(objDeserializer8);
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.getValueDeserializer();
        long long5 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = strBuilder0.kafkaSpoutStreams;
        long long14 = strBuilder0.offsetCommitPeriodMs;
        strBuilder0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer17 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer17;
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = strBuilder0.kafkaProps;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig20 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap8;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer10 = serializableKafkaSpoutConfig0.keyDeserializer;
        java.lang.Class<?> wildcardClass11 = serializableKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(serializableDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer5 = strBuilder0.valueDeserializer;
        long long6 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer8;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strComparableSerializableDeserializer5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>>();
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder4 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap5;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder7 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder7;
        java.lang.String str9 = serializableKafkaSpoutConfig0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertNull(serializableDeserializer3);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str9, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 30000L;
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer12 = serializableKafkaSpoutConfig0.keyDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(objDeserializer8);
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        org.junit.Assert.assertNull(serializableDeserializer12);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strBuilder0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder14.setOffsetCommitPeriodMs((long) 100);
        strBuilder16.pollTimeoutMs = ' ';
        java.lang.Class<?> wildcardClass19 = strBuilder16.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 52;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer3 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.junit.Assert.assertNull(objDeserializer3);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>(genericDeclarationBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap11;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService13;
        java.util.regex.Pattern pattern15 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(pattern15);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        long long4 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(objDeserializer5);
        org.junit.Assert.assertNull(pattern6);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strBuilder0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig15 = strBuilder14.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = strBuilder0.kafkaSpoutStreams;
        long long14 = strBuilder0.offsetCommitPeriodMs;
        strBuilder0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams17;
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        strBuilder0.kafkaProps = strMap19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = strBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer22 = strBuilder0.keyDeserializer;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 30000L + "'", long7 == 30000L);
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy21 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy21.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strSerializableDeserializer22);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (byte) -1;
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Class<?>> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Class<?>>();
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = strBuilder0.kafkaSpoutStreams;
        long long14 = strBuilder0.offsetCommitPeriodMs;
        strBuilder0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams17;
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        strBuilder0.kafkaProps = strMap19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = strBuilder0.firstPollOffsetStrategy;
        strBuilder0.pollTimeoutMs = (byte) 10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer24 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig26 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 30000L + "'", long7 == 30000L);
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy21 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy21.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
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
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = '4';
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (byte) 10;
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = strBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder12.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        strBuilder12.maxUncommittedOffsets = (-1);
        long long17 = strBuilder12.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = strBuilder12.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder21 = strBuilder12.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer22 = null;
        strBuilder12.valueDeserializer = strComparableSerializableDeserializer22;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = strBuilder12.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder26 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy27 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder26.firstPollOffsetStrategy = firstPollOffsetStrategy27;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder29 = strBuilder12.setFirstPollOffsetStrategy(firstPollOffsetStrategy27);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder30 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig31 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy11 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy11.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy13 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy13.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy27 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy27.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.reflect.AnnotatedElement> strBuilderKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.reflect.AnnotatedElement> strBuilderBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, strBuilderKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        int int4 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer5;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = serializableKafkaSpoutConfig0.getValueDeserializer();
        java.util.List<java.lang.String> strList8 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder9 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap11 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(objDeserializer7);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder9);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>>();
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = serializableKafkaSpoutConfig0.valueDeserializer;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long13 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(objDeserializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.lang.Object> wildcardClassBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.lang.Object>();
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder9 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap11 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder9);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (byte) 100;
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object>();
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer12 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        org.junit.Assert.assertNull(serializableDeserializer12);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        strBuilder0.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setOffsetCommitPeriodMs((long) (short) 100);
        long long17 = strBuilder16.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer18 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = strBuilder16.setValueDeserializer(strComparableSerializableDeserializer18);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer20 = null;
        strBuilder19.valueDeserializer = strComparableSerializableDeserializer20;
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        strBuilder19.kafkaProps = strMap22;
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = strBuilder19.kafkaProps;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        strBuilder0.offsetCommitPeriodMs = 200L;
        strBuilder0.offsetCommitPeriodMs = (byte) 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = strBuilder0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        strBuilder0.kafkaProps = strMap13;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer15 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams16 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams16;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        org.junit.Assert.assertNull(strSerializableDeserializer15);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (short) 10;
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.getValueDeserializer();
        java.lang.Class<?> wildcardClass9 = serializableKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(objDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 100;
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        strBuilder0.retryService = kafkaSpoutRetryService7;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        strBuilder0.kafkaProps = strMap9;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        long long13 = strBuilder0.pollTimeoutMs;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(kafkaSpoutRetryService11);
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (short) 0;
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder5 = strBuilder0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        strBuilder0.kafkaProps = strMap6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig10 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
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
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService4;
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        long long7 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = serializableKafkaSpoutConfig0.getRetryService();
        int int9 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 100;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap13 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 10;
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder3.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        strBuilder3.kafkaSpoutStreams = kafkaSpoutStreams6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder3.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        strBuilder3.maxUncommittedOffsets = 10;
        strBuilder3.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = strBuilder3.firstPollOffsetStrategy;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        int int16 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap17;
        long long19 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap21 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy4 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy4.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy14 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy14.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder6 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.getKafkaProps();
        java.util.List<java.lang.String> strList8 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder14 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap16 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(objDeserializer8);
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder14);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap11;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer13 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(objDeserializer13);
        org.junit.Assert.assertNull(kafkaSpoutStreams14);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer13;
        java.lang.Class<?> wildcardClass15 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        int int4 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer5;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = serializableKafkaSpoutConfig0.getValueDeserializer();
        java.util.List<java.lang.String> strList8 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer9 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder10 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(objDeserializer7);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(serializableDeserializer9);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder10);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.AnnotatedElement> serializableKafkaSpoutConfigKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.AnnotatedElement> serializableKafkaSpoutConfigBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutConfigKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (short) 100;
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = '4';
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer12 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(pattern8);
        org.junit.Assert.assertNull(objDeserializer11);
        org.junit.Assert.assertNull(serializableDeserializer12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        strBuilder9.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        strBuilder9.maxUncommittedOffsets = 10;
        strBuilder9.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy20 = strBuilder9.firstPollOffsetStrategy;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy20;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder23 = strBuilder0.setPollTimeoutMs((long) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer24 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = strBuilder0.setKeyDeserializer(strSerializableDeserializer24);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer26 = strBuilder25.keyDeserializer;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy10 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy10.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy14 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy14.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy20 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy20.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNull(strSerializableDeserializer26);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.List<java.lang.String> strList6 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
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
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 100;
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap6;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer8 = serializableKafkaSpoutConfig0.keyDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(serializableDeserializer8);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setKeyDeserializer(strSerializableDeserializer13);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder15 = strBuilder14.tuplesBuilder;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder15);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = serializableKafkaSpoutConfig0.valueDeserializer;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long13 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService14;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 200L;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer18 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService19 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService19;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(objDeserializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(objDeserializer18);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = 'a';
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        strBuilder0.pollTimeoutMs = 10L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setMaxUncommittedOffsets(100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = strBuilder11.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = strBuilder11.keyDeserializer;
        strBuilder11.maxUncommittedOffsets = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder16.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        strBuilder16.maxUncommittedOffsets = (-1);
        strBuilder16.offsetCommitPeriodMs = (-1L);
        long long23 = strBuilder16.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder24 = null;
        strBuilder16.tuplesBuilder = strKafkaSpoutTuplesBuilder24;
        strBuilder16.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams28 = strBuilder16.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams29 = strBuilder16.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder30 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy31 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder30.firstPollOffsetStrategy = firstPollOffsetStrategy31;
        strBuilder30.maxUncommittedOffsets = (-1);
        long long35 = strBuilder30.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder37 = strBuilder30.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder39 = strBuilder30.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer40 = null;
        strBuilder30.valueDeserializer = strComparableSerializableDeserializer40;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder43 = strBuilder30.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder44 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy45 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder44.firstPollOffsetStrategy = firstPollOffsetStrategy45;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder47 = strBuilder30.setFirstPollOffsetStrategy(firstPollOffsetStrategy45);
        strBuilder16.firstPollOffsetStrategy = firstPollOffsetStrategy45;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder49 = strBuilder11.setFirstPollOffsetStrategy(firstPollOffsetStrategy45);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer50 = strBuilder49.valueDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass51 = strComparableSerializableDeserializer50.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strSerializableDeserializer13);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy17 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy17.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutStreams28);
        org.junit.Assert.assertNull(kafkaSpoutStreams29);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy31 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy31.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy45 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy45.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNull(strComparableSerializableDeserializer50);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        int int4 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = strBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder12.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        strBuilder12.maxUncommittedOffsets = (-1);
        long long17 = strBuilder12.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = strBuilder12.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder21 = strBuilder12.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer22 = null;
        strBuilder12.valueDeserializer = strComparableSerializableDeserializer22;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = strBuilder12.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder26 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy27 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder26.firstPollOffsetStrategy = firstPollOffsetStrategy27;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder29 = strBuilder12.setFirstPollOffsetStrategy(firstPollOffsetStrategy27);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder30 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy27);
        long long31 = strBuilder30.pollTimeoutMs;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig32 = strBuilder30.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy11 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy11.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy13 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy13.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy27 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy27.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder13 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder13;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        strBuilder0.kafkaProps = strMap8;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setKeyDeserializer(strSerializableDeserializer10);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setMaxUncommittedOffsets(0);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder15 = strBuilder14.tuplesBuilder;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer16 = strBuilder14.keyDeserializer;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder15);
        org.junit.Assert.assertNull(strSerializableDeserializer16);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 10;
        int int6 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer7;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        strBuilder0.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer15 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setKeyDeserializer(strSerializableDeserializer15);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams17;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy20 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder19.firstPollOffsetStrategy = firstPollOffsetStrategy20;
        strBuilder19.maxUncommittedOffsets = (-1);
        long long24 = strBuilder19.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer25 = strBuilder19.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams26 = null;
        strBuilder19.kafkaSpoutStreams = kafkaSpoutStreams26;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder28 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder28.firstPollOffsetStrategy = firstPollOffsetStrategy29;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams31 = null;
        strBuilder28.kafkaSpoutStreams = kafkaSpoutStreams31;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy33 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder28.firstPollOffsetStrategy = firstPollOffsetStrategy33;
        strBuilder28.maxUncommittedOffsets = 10;
        strBuilder28.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy39 = strBuilder28.firstPollOffsetStrategy;
        strBuilder19.firstPollOffsetStrategy = firstPollOffsetStrategy39;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder41 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy39);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig42 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long43 = serializableKafkaSpoutConfig42.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams44 = null;
        serializableKafkaSpoutConfig42.kafkaSpoutStreams = kafkaSpoutStreams44;
        java.util.regex.Pattern pattern46 = serializableKafkaSpoutConfig42.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService47 = null;
        serializableKafkaSpoutConfig42.retryService = kafkaSpoutRetryService47;
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = serializableKafkaSpoutConfig42.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder50 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy51 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder50.firstPollOffsetStrategy = firstPollOffsetStrategy51;
        strBuilder50.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder55 = strBuilder50.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams56 = strBuilder50.kafkaSpoutStreams;
        strBuilder50.offsetCommitPeriodMs = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder60 = strBuilder50.setPollTimeoutMs((-1L));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy61 = strBuilder60.firstPollOffsetStrategy;
        serializableKafkaSpoutConfig42.firstPollOffsetStrategy = firstPollOffsetStrategy61;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder63 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy61);
        java.lang.Class<?> wildcardClass64 = strBuilder63.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy20 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy20.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNull(strSerializableDeserializer25);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy29 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy29.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy33 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy33.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy39 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy39.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(pattern46);
        org.junit.Assert.assertNull(strMap49);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy51 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy51.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder55);
        org.junit.Assert.assertNull(kafkaSpoutStreams56);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy61 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy61.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder7 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap8;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 30000L;
        long long12 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap14 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 30000L + "'", long12 == 30000L);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>(strBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        strBuilder0.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setOffsetCommitPeriodMs((long) (short) 100);
        long long17 = strBuilder16.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer18 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = strBuilder16.setValueDeserializer(strComparableSerializableDeserializer18);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer20 = null;
        strBuilder19.valueDeserializer = strComparableSerializableDeserializer20;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder23 = strBuilder19.setOffsetCommitPeriodMs((long) ' ');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer24 = null;
        strBuilder19.keyDeserializer = strSerializableDeserializer24;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder23);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = null;
        strBuilder0.retryService = kafkaSpoutRetryService12;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig14 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder5 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder5);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertNull(serializableDeserializer3);
        org.junit.Assert.assertNull(serializableDeserializer4);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams15;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer17 = strBuilder0.valueDeserializer;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        org.junit.Assert.assertNull(strComparableSerializableDeserializer17);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.lang.String str2 = serializableKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap4 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str2, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer10 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer14 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer14;
        strBuilder0.offsetCommitPeriodMs = (byte) 10;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer10 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy15 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder14.firstPollOffsetStrategy = firstPollOffsetStrategy15;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig18 = strBuilder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy15 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy15.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer11 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap14 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(serializableDeserializer11);
        org.junit.Assert.assertNull(firstPollOffsetStrategy12);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder5 = strBuilder0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        strBuilder0.kafkaProps = strMap6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig10 = strBuilder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder10 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder10.firstPollOffsetStrategy = firstPollOffsetStrategy11;
        strBuilder10.maxUncommittedOffsets = (-1);
        long long15 = strBuilder10.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer16 = strBuilder10.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder10.kafkaSpoutStreams = kafkaSpoutStreams17;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer19 = null;
        strBuilder10.valueDeserializer = strComparableSerializableDeserializer19;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer21 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder22 = strBuilder10.setKeyDeserializer(strSerializableDeserializer21);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder23 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy24 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder23.firstPollOffsetStrategy = firstPollOffsetStrategy24;
        strBuilder23.maxUncommittedOffsets = (-1);
        long long28 = strBuilder23.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder30 = strBuilder23.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder32 = strBuilder23.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer33 = null;
        strBuilder23.valueDeserializer = strComparableSerializableDeserializer33;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder36 = strBuilder23.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder37 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy38 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder37.firstPollOffsetStrategy = firstPollOffsetStrategy38;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder40 = strBuilder23.setFirstPollOffsetStrategy(firstPollOffsetStrategy38);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder41 = strBuilder22.setFirstPollOffsetStrategy(firstPollOffsetStrategy38);
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy38;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig43 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy11 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy11.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(strSerializableDeserializer16);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy24 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy24.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy38 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy38.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 97;
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = serializableKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder8 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = serializableKafkaSpoutConfig0.getKafkaProps();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap11 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
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
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder5 = strBuilder0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        strBuilder0.kafkaProps = strMap6;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder5);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.GenericDeclaration> serializableKafkaSpoutConfigKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.GenericDeclaration> serializableKafkaSpoutConfigBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutConfigKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.String> strBuilderKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.String> strBuilderBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.String>(strMap0, kafkaSpoutStreams1, strBuilderKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder14 = null;
        strBuilder13.tuplesBuilder = strKafkaSpoutTuplesBuilder14;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer16 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder13.setValueDeserializer(strComparableSerializableDeserializer16);
        java.lang.Class<?> wildcardClass18 = strBuilder17.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
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
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder2 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder2;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy6);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.CharSequence> strBuilderKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.CharSequence> strBuilderBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, strBuilderKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        strBuilder0.pollTimeoutMs = 10L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer8 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        strBuilder0.retryService = kafkaSpoutRetryService10;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (short) 100;
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer13;
        long long15 = strBuilder0.offsetCommitPeriodMs;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig16 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 30000L + "'", long15 == 30000L);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = 35;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = serializableKafkaSpoutConfig0.retryService;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
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
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (byte) 0;
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Object> serializableKafkaSpoutConfigKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Object> serializableKafkaSpoutConfigBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Object>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutConfigKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService8;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.getKafkaProps();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = strMap10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.String> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.String>(strBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.getKafkaProps();
        java.util.regex.Pattern pattern11 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap13 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(pattern11);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = '4';
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        long long4 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap6;
        long long8 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer9 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap12 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(objDeserializer5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(serializableDeserializer9);
        org.junit.Assert.assertNull(kafkaSpoutStreams10);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder0.setPollTimeoutMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder16.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        strBuilder15.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer20 = null;
        strBuilder15.keyDeserializer = strSerializableDeserializer20;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer22 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder23 = strBuilder15.setValueDeserializer(strComparableSerializableDeserializer22);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer24 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = strBuilder23.setValueDeserializer(strComparableSerializableDeserializer24);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy17 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy17.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        java.lang.Class<?> wildcardClass1 = strBuilder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>(typeBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.retryService;
        java.lang.String str11 = serializableKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer12 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer13 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap15 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=EARLIEST, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str11, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=EARLIEST, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(objDeserializer12);
        org.junit.Assert.assertNull(serializableDeserializer13);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.getRetryService();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = serializableKafkaSpoutConfig0.getKafkaProps();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder11 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = serializableKafkaSpoutConfig0.getKafkaProps();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strBuilder0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder14.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer17 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder18 = strBuilder14.setKeyDeserializer(strSerializableDeserializer17);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder19 = null;
        strBuilder18.tuplesBuilder = strKafkaSpoutTuplesBuilder19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder22 = strBuilder18.setMaxUncommittedOffsets((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig23 = strBuilder18.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        strBuilder0.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer15 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setKeyDeserializer(strSerializableDeserializer15);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams17;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder20 = strBuilder0.setMaxUncommittedOffsets((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig21 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> firstPollOffsetStrategyEnumKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> serializableKafkaSpoutConfigKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> serializableKafkaSpoutConfigBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutConfigKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = strBuilder0.retryService;
        strBuilder0.offsetCommitPeriodMs = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setPollTimeoutMs((long) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        strBuilder0.kafkaProps = strMap17;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        int int21 = strBuilder0.maxUncommittedOffsets;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder12 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(objDeserializer8);
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder12);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> annotatedElementBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer5 = strBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strBuilder0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig7 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strComparableSerializableDeserializer5);
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer11 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer12 = serializableKafkaSpoutConfig0.keyDeserializer;
        java.lang.Class<?> wildcardClass13 = serializableKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(serializableDeserializer11);
        org.junit.Assert.assertNull(serializableDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableKafkaSpoutConfigKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (-1L);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        int int11 = strBuilder0.maxUncommittedOffsets;
        long long12 = strBuilder0.pollTimeoutMs;
        strBuilder0.pollTimeoutMs = 10;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder15 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder15;
        java.lang.Class<?> wildcardClass17 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder14 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer15 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(objDeserializer8);
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder14);
        org.junit.Assert.assertNull(objDeserializer15);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer9 = strBuilder0.valueDeserializer;
        java.lang.Class<?> wildcardClass10 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(strComparableSerializableDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.Type>();
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer3;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams5;
        java.util.List<java.lang.String> strList7 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        strBuilder0.pollTimeoutMs = 10L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = strBuilder0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = strBuilder0.kafkaProps;
        long long12 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setMaxUncommittedOffsets(0);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = strBuilder14.retryService;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(kafkaSpoutStreams10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNull(kafkaSpoutRetryService15);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.List<java.lang.String> strList6 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder9 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder9;
        serializableKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap14 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.getValueDeserializer();
        long long5 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer6 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        java.lang.Class<?> wildcardClass7 = serializableKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(serializableDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.kafkaProps;
        long long6 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer7 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer7;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = serializableKafkaSpoutConfig0.getKafkaProps();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        org.junit.Assert.assertNull(objDeserializer4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> annotatedElementKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilderKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilderBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, strBuilderKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder16.kafkaSpoutStreams = kafkaSpoutStreams17;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder20 = strBuilder16.setPollTimeoutMs(30000L);
        strBuilder20.maxUncommittedOffsets = (short) -1;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer23 = null;
        strBuilder20.valueDeserializer = strComparableSerializableDeserializer23;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object>();
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder5 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder5.firstPollOffsetStrategy = firstPollOffsetStrategy6;
        strBuilder5.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer10 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder5.setValueDeserializer(strComparableSerializableDeserializer10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder12.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = null;
        strBuilder12.kafkaSpoutStreams = kafkaSpoutStreams15;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder12.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy19 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        strBuilder12.firstPollOffsetStrategy = firstPollOffsetStrategy19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder21 = strBuilder5.setFirstPollOffsetStrategy(firstPollOffsetStrategy19);
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy19;
        java.lang.Class<?> wildcardClass23 = serializableKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy6 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy6.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy13 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy13.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy17 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy17.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy19 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy19.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap11;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = serializableKafkaSpoutConfig0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService15);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer4;
        java.util.List<java.lang.String> strList6 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap11;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer13 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        long long15 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.util.regex.Pattern pattern16 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap18 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(objDeserializer13);
        org.junit.Assert.assertNull(kafkaSpoutStreams14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(pattern16);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> wildcardClassKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>();
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder16.kafkaSpoutStreams = kafkaSpoutStreams17;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder20 = strBuilder16.setPollTimeoutMs(30000L);
        java.lang.Class<?> wildcardClass21 = strBuilder16.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        strBuilder0.pollTimeoutMs = 10L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setMaxUncommittedOffsets(100);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        strBuilder11.kafkaSpoutStreams = kafkaSpoutStreams12;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig14 = strBuilder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.io.Serializable> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.io.Serializable> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.io.Serializable>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer9 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder10 = serializableKafkaSpoutConfig0.tuplesBuilder;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(pattern8);
        org.junit.Assert.assertNull(objDeserializer9);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder10);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Comparable<java.lang.String>> serializableKafkaSpoutConfigBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Comparable<java.lang.String>> serializableKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Comparable<java.lang.String>>(serializableKafkaSpoutConfigBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (byte) 100;
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        java.lang.String str5 = serializableKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertNull(serializableDeserializer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str5, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder1;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap3;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 97;
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES = (short) 10;
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 52;
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.lang.String> wildcardClassBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.lang.String>();
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.lang.String str6 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        org.junit.Assert.assertNull(serializableDeserializer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str6, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder5 = strBuilder0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        strBuilder0.kafkaProps = strMap6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) (short) 100);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer10;
        java.lang.Class<?> wildcardClass12 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = (short) 10;
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer5 = strBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        strBuilder7.kafkaSpoutStreams = kafkaSpoutStreams10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        strBuilder7.maxUncommittedOffsets = 10;
        strBuilder7.offsetCommitPeriodMs = 30000L;
        int int18 = strBuilder7.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams19 = null;
        strBuilder7.kafkaSpoutStreams = kafkaSpoutStreams19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder21 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy22 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder21.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams26 = strBuilder0.kafkaSpoutStreams;
        long long27 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer28 = strBuilder0.valueDeserializer;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strComparableSerializableDeserializer5);
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy22 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy22.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(kafkaSpoutStreams26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertNull(strComparableSerializableDeserializer28);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder6 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(kafkaSpoutRetryService5);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder6);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        strBuilder0.maxUncommittedOffsets = (byte) 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder9 = strBuilder0.tuplesBuilder;
        int int10 = strBuilder0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setOffsetCommitPeriodMs((-1L));
        int int13 = strBuilder0.maxUncommittedOffsets;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer3;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder6 = strBuilder0.setKeyDeserializer(strSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer7 = null;
        strBuilder6.valueDeserializer = strComparableSerializableDeserializer7;
        long long9 = strBuilder6.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = null;
        strBuilder6.keyDeserializer = strSerializableDeserializer10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder6.setKeyDeserializer(strSerializableDeserializer12);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = strBuilder6.kafkaProps;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder16.kafkaSpoutStreams = kafkaSpoutStreams17;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder20 = strBuilder16.setPollTimeoutMs(30000L);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams21 = null;
        strBuilder16.kafkaSpoutStreams = kafkaSpoutStreams21;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.io.Serializable> typeBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.io.Serializable> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.io.Serializable>(typeBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService1;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder5 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder5);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.kafkaProps;
        long long6 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        org.junit.Assert.assertNull(objDeserializer4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
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
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        strBuilder0.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setOffsetCommitPeriodMs((long) (short) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder18 = strBuilder0.setPollTimeoutMs((long) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService19 = null;
        strBuilder0.retryService = kafkaSpoutRetryService19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = strBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder23 = strBuilder0.setOffsetCommitPeriodMs((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig24 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy21 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy21.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder23);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = serializableKafkaSpoutConfig0.retryService;
        long long8 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(firstPollOffsetStrategy4);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = strBuilder13.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = strBuilder13.kafkaProps;
        strBuilder13.pollTimeoutMs = 10;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig18 = strBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap11;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = serializableKafkaSpoutConfig0.retryService;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 200L;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(kafkaSpoutRetryService15);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.lang.Class<?> wildcardClass4 = serializableKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        int int11 = strBuilder0.maxUncommittedOffsets;
        strBuilder0.offsetCommitPeriodMs = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder14 = strBuilder0.tuplesBuilder;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder14);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer12 = serializableKafkaSpoutConfig0.keyDeserializer;
        java.lang.String str13 = serializableKafkaSpoutConfig0.toString();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (short) 0;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(objDeserializer8);
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        org.junit.Assert.assertNull(serializableDeserializer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str13, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        int int11 = strBuilder0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = strBuilder0.firstPollOffsetStrategy;
        strBuilder0.pollTimeoutMs = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = null;
        strBuilder0.retryService = kafkaSpoutRetryService15;
        int int17 = strBuilder0.maxUncommittedOffsets;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (byte) 10;
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        strBuilder0.maxUncommittedOffsets = (byte) 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer9 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer9;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer11 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer11);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        strBuilder0.kafkaProps = strMap13;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder7 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder10 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer11 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig13 = strBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer10 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        int int13 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer14 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(serializableDeserializer14);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = strBuilder0.kafkaSpoutStreams;
        long long14 = strBuilder0.offsetCommitPeriodMs;
        strBuilder0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams17;
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        strBuilder0.kafkaProps = strMap19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = strBuilder0.firstPollOffsetStrategy;
        strBuilder0.pollTimeoutMs = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig24 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy21 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy21.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.CharSequence> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.CharSequence>();
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder1;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (byte) 0;
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService4;
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        long long7 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder9 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder9;
        long long11 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence>();
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
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
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer5 = strBuilder0.valueDeserializer;
        strBuilder0.offsetCommitPeriodMs = 0L;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig8 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strComparableSerializableDeserializer5);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = serializableKafkaSpoutConfig0.valueDeserializer;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long13 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService14;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 200L;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer18 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams19 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams19;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(objDeserializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(objDeserializer18);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.reflect.GenericDeclaration> strBuilderKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder5 = strBuilder0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        strBuilder0.kafkaProps = strMap6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) (short) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = null;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.io.Serializable> strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.io.Serializable> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.io.Serializable>(strBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams13;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = serializableKafkaSpoutConfig0.kafkaProps;
        long long16 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.getValueDeserializer();
        long long5 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = ' ';
        java.lang.Class<?> wildcardClass8 = serializableKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        strBuilder0.kafkaProps = strMap8;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setKeyDeserializer(strSerializableDeserializer10);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = strBuilder0.retryService;
        int int13 = strBuilder0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder14 = strBuilder0.tuplesBuilder;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig15 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder14);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = serializableKafkaSpoutConfig0.valueDeserializer;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long13 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService14;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 200L;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer18 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService19 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService19;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams21 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams21;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(objDeserializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(objDeserializer18);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        int int11 = strBuilder0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer15 = strBuilder0.valueDeserializer;
        java.lang.Class<?> wildcardClass16 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(kafkaSpoutRetryService14);
        org.junit.Assert.assertNull(strComparableSerializableDeserializer15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder5 = strBuilder0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        strBuilder0.kafkaProps = strMap6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) (short) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setPollTimeoutMs(52L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder12.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        strBuilder12.maxUncommittedOffsets = (-1);
        long long17 = strBuilder12.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = strBuilder12.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder21 = strBuilder12.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer22 = null;
        strBuilder12.valueDeserializer = strComparableSerializableDeserializer22;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = strBuilder12.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder26 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy27 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder26.firstPollOffsetStrategy = firstPollOffsetStrategy27;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder29 = strBuilder12.setFirstPollOffsetStrategy(firstPollOffsetStrategy27);
        strBuilder11.firstPollOffsetStrategy = firstPollOffsetStrategy27;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig31 = strBuilder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy13 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy13.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy27 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy27.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder29);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap11;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService13;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder15 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer16 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer16;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams18 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap20 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder15);
        org.junit.Assert.assertNull(kafkaSpoutStreams18);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder4 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder4);
        org.junit.Assert.assertNull(kafkaSpoutRetryService5);
        org.junit.Assert.assertNull(objDeserializer6);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder4 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder4);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> wildcardClassKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> genericDeclarationKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>>();
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (short) -1;
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = strBuilder0.firstPollOffsetStrategy;
        long long2 = strBuilder0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        strBuilder0.kafkaProps = strMap3;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder6 = strBuilder0.setKeyDeserializer(strSerializableDeserializer5);
        strBuilder0.offsetCommitPeriodMs = 52;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setMaxUncommittedOffsets(0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder11.setPollTimeoutMs((long) 1);
        strBuilder11.maxUncommittedOffsets = 52;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNull(strSerializableDeserializer9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        strBuilder0.pollTimeoutMs = (short) 10;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        strBuilder13.pollTimeoutMs = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig16 = strBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 0;
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = serializableKafkaSpoutConfig0.retryService;
        long long10 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder11 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(kafkaSpoutRetryService9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder11);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = serializableKafkaSpoutConfig0.getKafkaProps();
        java.util.List<java.lang.String> strList13 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer14 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer14;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strList13);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        strBuilder0.maxUncommittedOffsets = (byte) 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder9 = strBuilder0.tuplesBuilder;
        int int10 = strBuilder0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setOffsetCommitPeriodMs((-1L));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder12.setMaxUncommittedOffsets((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = strBuilder12.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        long long4 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap6;
        long long8 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer9 = serializableKafkaSpoutConfig0.keyDeserializer;
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder11.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        strBuilder11.maxUncommittedOffsets = (-1);
        long long16 = strBuilder11.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder18 = strBuilder11.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder20 = strBuilder11.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder21 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy22 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder21.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        strBuilder21.maxUncommittedOffsets = (-1);
        long long26 = strBuilder21.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer27 = strBuilder21.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams28 = null;
        strBuilder21.kafkaSpoutStreams = kafkaSpoutStreams28;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer30 = null;
        strBuilder21.valueDeserializer = strComparableSerializableDeserializer30;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer32 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder33 = strBuilder21.setKeyDeserializer(strSerializableDeserializer32);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder34 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy35 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder34.firstPollOffsetStrategy = firstPollOffsetStrategy35;
        strBuilder34.maxUncommittedOffsets = (-1);
        long long39 = strBuilder34.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder41 = strBuilder34.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder43 = strBuilder34.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer44 = null;
        strBuilder34.valueDeserializer = strComparableSerializableDeserializer44;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder47 = strBuilder34.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder48 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy49 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder48.firstPollOffsetStrategy = firstPollOffsetStrategy49;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder51 = strBuilder34.setFirstPollOffsetStrategy(firstPollOffsetStrategy49);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder52 = strBuilder33.setFirstPollOffsetStrategy(firstPollOffsetStrategy49);
        strBuilder11.firstPollOffsetStrategy = firstPollOffsetStrategy49;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy49;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(objDeserializer5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(serializableDeserializer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy22 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy22.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNull(strSerializableDeserializer27);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy35 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy35.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy49 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy49.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder2 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder2;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder5 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder5.firstPollOffsetStrategy = firstPollOffsetStrategy6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        strBuilder5.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder5.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        strBuilder5.maxUncommittedOffsets = 10;
        strBuilder5.offsetCommitPeriodMs = 30000L;
        long long16 = strBuilder5.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer17 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder18 = strBuilder5.setValueDeserializer(strComparableSerializableDeserializer17);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = strBuilder18.kafkaProps;
        strBuilder18.offsetCommitPeriodMs = 0L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer22 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder23 = strBuilder18.setKeyDeserializer(strSerializableDeserializer22);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig24 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams25 = serializableKafkaSpoutConfig24.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = serializableKafkaSpoutConfig24.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder27 = serializableKafkaSpoutConfig24.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams28 = null;
        serializableKafkaSpoutConfig24.kafkaSpoutStreams = kafkaSpoutStreams28;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder30 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy31 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder30.firstPollOffsetStrategy = firstPollOffsetStrategy31;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams33 = null;
        strBuilder30.kafkaSpoutStreams = kafkaSpoutStreams33;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy35 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder30.firstPollOffsetStrategy = firstPollOffsetStrategy35;
        strBuilder30.maxUncommittedOffsets = 10;
        strBuilder30.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder42 = strBuilder30.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy43 = strBuilder30.firstPollOffsetStrategy;
        serializableKafkaSpoutConfig24.firstPollOffsetStrategy = firstPollOffsetStrategy43;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder45 = strBuilder23.setFirstPollOffsetStrategy(firstPollOffsetStrategy43);
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy43;
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap48 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer4);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy6 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy6.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy10 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy10.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 30000L + "'", long16 == 30000L);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNull(kafkaSpoutStreams25);
        org.junit.Assert.assertNull(strMap26);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder27);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy31 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy31.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy35 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy35.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy43 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy43.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder45);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        strBuilder0.kafkaProps = strMap8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setPollTimeoutMs((long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = strBuilder11.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig13 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long14 = serializableKafkaSpoutConfig13.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = null;
        serializableKafkaSpoutConfig13.kafkaSpoutStreams = kafkaSpoutStreams15;
        java.util.regex.Pattern pattern17 = serializableKafkaSpoutConfig13.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService18 = null;
        serializableKafkaSpoutConfig13.retryService = kafkaSpoutRetryService18;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams20 = serializableKafkaSpoutConfig13.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig13.firstPollOffsetStrategy = firstPollOffsetStrategy21;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder23 = strBuilder11.setFirstPollOffsetStrategy(firstPollOffsetStrategy21);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder24 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy25 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder24.firstPollOffsetStrategy = firstPollOffsetStrategy25;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams27 = null;
        strBuilder24.kafkaSpoutStreams = kafkaSpoutStreams27;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder24.firstPollOffsetStrategy = firstPollOffsetStrategy29;
        strBuilder24.maxUncommittedOffsets = 10;
        strBuilder24.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService35 = null;
        strBuilder24.retryService = kafkaSpoutRetryService35;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder38 = strBuilder24.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder40 = strBuilder38.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder41 = strBuilder40.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy42 = strBuilder40.firstPollOffsetStrategy;
        strBuilder11.firstPollOffsetStrategy = firstPollOffsetStrategy42;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams44 = null;
        strBuilder11.kafkaSpoutStreams = kafkaSpoutStreams44;
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = null;
        strBuilder11.kafkaProps = strMap46;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(pattern17);
        org.junit.Assert.assertNull(kafkaSpoutStreams20);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy21 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy21.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy25 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy25.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy29 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy29.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder41);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy42 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy42.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> typeBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>>(typeBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
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

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer3;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder6 = strBuilder0.setKeyDeserializer(strSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer7 = null;
        strBuilder6.valueDeserializer = strComparableSerializableDeserializer7;
        long long9 = strBuilder6.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = null;
        strBuilder6.keyDeserializer = strSerializableDeserializer10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder6.setKeyDeserializer(strSerializableDeserializer12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig14 = strBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer3 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long5 = serializableKafkaSpoutConfig4.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        serializableKafkaSpoutConfig4.kafkaSpoutStreams = kafkaSpoutStreams6;
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig4.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = null;
        serializableKafkaSpoutConfig4.retryService = kafkaSpoutRetryService9;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig4.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig4.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        int int15 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap17 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(objDeserializer3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(pattern8);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Class<?>> genericDeclarationKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Class<?>>();
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder4 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = serializableKafkaSpoutConfig0.getRetryService();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder4);
        org.junit.Assert.assertNull(kafkaSpoutRetryService5);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer10 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder11 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long12 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        org.junit.Assert.assertNull(objDeserializer10);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder2 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder2;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = serializableKafkaSpoutConfig0.kafkaProps;
        long long5 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer6 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer6;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer4;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder1);
        org.junit.Assert.assertNull(objDeserializer6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        int int5 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder6 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder6);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder4 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap5;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = serializableKafkaSpoutConfig0.retryService;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertNull(serializableDeserializer3);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder4);
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer3;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder6 = strBuilder0.setKeyDeserializer(strSerializableDeserializer5);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = strBuilder0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = kafkaSpoutStreams7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> typeKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder6 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        strBuilder7.kafkaSpoutStreams = kafkaSpoutStreams10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy14);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer17 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder18 = strBuilder0.tuplesBuilder;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy14 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy14.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNull(strSerializableDeserializer17);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder18);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = strBuilder0.kafkaSpoutStreams;
        long long14 = strBuilder0.offsetCommitPeriodMs;
        strBuilder0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer17 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer17;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder19 = strBuilder0.tuplesBuilder;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig20 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder19);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        strBuilder0.kafkaProps = strMap8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setPollTimeoutMs((long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = strBuilder11.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig13 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long14 = serializableKafkaSpoutConfig13.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = null;
        serializableKafkaSpoutConfig13.kafkaSpoutStreams = kafkaSpoutStreams15;
        java.util.regex.Pattern pattern17 = serializableKafkaSpoutConfig13.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService18 = null;
        serializableKafkaSpoutConfig13.retryService = kafkaSpoutRetryService18;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams20 = serializableKafkaSpoutConfig13.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig13.firstPollOffsetStrategy = firstPollOffsetStrategy21;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder23 = strBuilder11.setFirstPollOffsetStrategy(firstPollOffsetStrategy21);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder24 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy25 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder24.firstPollOffsetStrategy = firstPollOffsetStrategy25;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams27 = null;
        strBuilder24.kafkaSpoutStreams = kafkaSpoutStreams27;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder24.firstPollOffsetStrategy = firstPollOffsetStrategy29;
        strBuilder24.maxUncommittedOffsets = 10;
        strBuilder24.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService35 = null;
        strBuilder24.retryService = kafkaSpoutRetryService35;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder38 = strBuilder24.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder40 = strBuilder38.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder41 = strBuilder40.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy42 = strBuilder40.firstPollOffsetStrategy;
        strBuilder11.firstPollOffsetStrategy = firstPollOffsetStrategy42;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams44 = null;
        strBuilder11.kafkaSpoutStreams = kafkaSpoutStreams44;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService46 = strBuilder11.retryService;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(pattern17);
        org.junit.Assert.assertNull(kafkaSpoutStreams20);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy21 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy21.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy25 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy25.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy29 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy29.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder41);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy42 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy42.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNull(kafkaSpoutRetryService46);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 1L;
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.CharSequence> serializableKafkaSpoutConfigBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.CharSequence> serializableKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.CharSequence>(serializableKafkaSpoutConfigBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = '4';
        int int11 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer12 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = serializableKafkaSpoutConfig0.getRetryService();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = serializableKafkaSpoutConfig0.getKafkaProps();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(pattern8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNull(serializableDeserializer12);
        org.junit.Assert.assertNull(kafkaSpoutRetryService13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (-1L);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> strKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 10;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer6 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        int int7 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        org.junit.Assert.assertNull(serializableDeserializer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        long long6 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder7 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder7;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder9 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder11.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = null;
        strBuilder11.kafkaSpoutStreams = kafkaSpoutStreams14;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy16 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder11.firstPollOffsetStrategy = firstPollOffsetStrategy16;
        strBuilder11.offsetCommitPeriodMs = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams20 = strBuilder11.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder22 = strBuilder11.setMaxUncommittedOffsets(100);
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
        strBuilder22.kafkaProps = strMap23;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer25 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder26 = strBuilder22.setKeyDeserializer(strSerializableDeserializer25);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder27 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy28 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder27.firstPollOffsetStrategy = firstPollOffsetStrategy28;
        strBuilder27.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer32 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder33 = strBuilder27.setValueDeserializer(strComparableSerializableDeserializer32);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder34 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy35 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder34.firstPollOffsetStrategy = firstPollOffsetStrategy35;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams37 = null;
        strBuilder34.kafkaSpoutStreams = kafkaSpoutStreams37;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy39 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder34.firstPollOffsetStrategy = firstPollOffsetStrategy39;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy41 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        strBuilder34.firstPollOffsetStrategy = firstPollOffsetStrategy41;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder43 = strBuilder27.setFirstPollOffsetStrategy(firstPollOffsetStrategy41);
        java.util.Map<java.lang.String, java.lang.Object> strMap44 = strBuilder27.kafkaProps;
        int int45 = strBuilder27.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy46 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder47 = strBuilder27.setFirstPollOffsetStrategy(firstPollOffsetStrategy46);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder48 = strBuilder22.setFirstPollOffsetStrategy(firstPollOffsetStrategy46);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder49 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy46);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig50 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy16 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy16.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNull(kafkaSpoutStreams20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy28 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy28.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy35 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy35.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy39 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy39.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy41 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy41.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNull(strMap44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy46 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy46.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder49);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        strBuilder0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder4 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer3);
        strBuilder0.offsetCommitPeriodMs = 0;
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer2 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(serializableDeserializer2);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = 52L;
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder2 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder2;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = serializableKafkaSpoutConfig0.kafkaProps;
        long long5 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        org.junit.Assert.assertNull(firstPollOffsetStrategy4);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.retryService;
        serializableKafkaSpoutConfig0.pollTimeoutMs = (short) 10;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder13 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer14 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer14;
        serializableKafkaSpoutConfig0.pollTimeoutMs = (short) 0;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder13);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>();
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams10;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap13;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder16 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams17;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        org.junit.Assert.assertNull(kafkaSpoutStreams15);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder16);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strBuilder0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        strBuilder0.offsetCommitPeriodMs = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService17 = strBuilder0.retryService;
        strBuilder0.offsetCommitPeriodMs = 10;
        java.lang.Class<?> wildcardClass20 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNull(kafkaSpoutRetryService17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setKeyDeserializer(strSerializableDeserializer10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long13 = serializableKafkaSpoutConfig12.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer14 = serializableKafkaSpoutConfig12.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder15 = serializableKafkaSpoutConfig12.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams16 = serializableKafkaSpoutConfig12.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy18 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder17.firstPollOffsetStrategy = firstPollOffsetStrategy18;
        strBuilder17.maxUncommittedOffsets = (-1);
        long long22 = strBuilder17.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder24 = strBuilder17.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder26 = strBuilder17.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer27 = null;
        strBuilder17.valueDeserializer = strComparableSerializableDeserializer27;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder30 = strBuilder17.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder31 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy32 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder31.firstPollOffsetStrategy = firstPollOffsetStrategy32;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder34 = strBuilder17.setFirstPollOffsetStrategy(firstPollOffsetStrategy32);
        serializableKafkaSpoutConfig12.firstPollOffsetStrategy = firstPollOffsetStrategy32;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder36 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig37 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNull(kafkaSpoutRetryService9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(objDeserializer14);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder15);
        org.junit.Assert.assertNull(kafkaSpoutStreams16);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy18 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy18.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy32 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy32.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = strBuilder0.keyDeserializer;
        long long10 = strBuilder0.offsetCommitPeriodMs;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(strSerializableDeserializer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer9 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer9;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer11 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setKeyDeserializer(strSerializableDeserializer11);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer13;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long13 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(firstPollOffsetStrategy11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        long long4 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = serializableKafkaSpoutConfig0.valueDeserializer;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = serializableKafkaSpoutConfig0.retryService;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer9 = serializableKafkaSpoutConfig0.valueDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(objDeserializer5);
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        org.junit.Assert.assertNull(objDeserializer9);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = serializableKafkaSpoutConfig0.valueDeserializer;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long13 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService14;
        int int16 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.regex.Pattern pattern17 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder18 = serializableKafkaSpoutConfig0.tuplesBuilder;
        int int19 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        long long20 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<?> wildcardClass21 = serializableKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(objDeserializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(pattern17);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer9 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService10;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(pattern8);
        org.junit.Assert.assertNull(objDeserializer9);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        long long7 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(kafkaSpoutStreams8);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer8 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer8;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer10 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer10;
        java.lang.Class<?> wildcardClass12 = serializableKafkaSpoutConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer1 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer1;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer3 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer3;
        serializableKafkaSpoutConfig0.pollTimeoutMs = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer5 = strBuilder0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = strBuilder0.kafkaProps;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setKeyDeserializer(strSerializableDeserializer7);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer9 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer9;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNull(strComparableSerializableDeserializer5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = 100L;
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        long long7 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertNull(objDeserializer8);
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap8;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.kafkaProps;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap8;
        long long10 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = serializableKafkaSpoutConfig0.kafkaProps;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer9 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder10 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig11 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>(genericDeclarationBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder4 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder4;
        long long6 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams7;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer9 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer9;
        java.lang.String str11 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder12 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder12;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str11, "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}");
        org.junit.Assert.assertNull(kafkaSpoutStreams14);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.String> typeBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.String> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.String>(typeBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer11 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer12 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer13 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer13;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 97L;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(serializableDeserializer11);
        org.junit.Assert.assertNull(serializableDeserializer12);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Comparable<java.lang.String>> serializableKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer10 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy15 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder14.firstPollOffsetStrategy = firstPollOffsetStrategy15;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = strBuilder17.setMaxUncommittedOffsets(0);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        strBuilder19.kafkaProps = strMap20;
        java.lang.Class<?> wildcardClass22 = strBuilder19.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy15 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy15.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = serializableKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder8 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = serializableKafkaSpoutConfig0.getKafkaProps();
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        strBuilder0.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer15 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setKeyDeserializer(strSerializableDeserializer15);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams17;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder20 = strBuilder0.setPollTimeoutMs((long) '4');
        long long21 = strBuilder0.pollTimeoutMs;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig22 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer9 = strBuilder0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        strBuilder0.kafkaProps = strMap10;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(strComparableSerializableDeserializer9);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.io.Serializable> strBuilderKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.io.Serializable> strBuilderBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.io.Serializable>(strMap0, kafkaSpoutStreams1, strBuilderKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        int int4 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer5;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(objDeserializer7);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> strComparableBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>(strComparableBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setPollTimeoutMs((long) (-1));
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        strBuilder11.valueDeserializer = strComparableSerializableDeserializer12;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = strBuilder11.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy15 = strBuilder11.firstPollOffsetStrategy;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig16 = strBuilder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNull(kafkaSpoutRetryService14);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy15 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy15.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.getKafkaProps();
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams11;
        long long13 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(kafkaSpoutStreams10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }
}

