import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig7 = strBuilder0.build();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig7 = strBuilder0.build();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = serializableKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.lang.String str7 = serializableKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.util.regex.Pattern pattern7 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        strBuilder0.pollTimeoutMs = (short) 10;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder0.build();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig9 = strBuilder0.build();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        int int4 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder4 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        int int6 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>(typeBuilder0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 200L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setMaxUncommittedOffsets((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder0.build();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setPollTimeoutMs((long) (-1));
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = strBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setMaxUncommittedOffsets((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig15 = strBuilder0.build();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 1;
        int int5 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        long long5 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = 35;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = serializableKafkaSpoutConfig0.valueDeserializer;
        long long7 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.util.regex.Pattern pattern7 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = serializableKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder5 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setOffsetCommitPeriodMs((long) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder11.build();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.lang.String str7 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder8 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.lang.String str9 = serializableKafkaSpoutConfig0.toString();
        long long10 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = serializableKafkaSpoutConfig0.keyDeserializer;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = serializableKafkaSpoutConfig0.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = serializableKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder5 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer6 = strBuilder0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig7 = strBuilder0.build();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        long long4 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 30000L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setMaxUncommittedOffsets(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder0.build();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.String> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.String> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.String>(charSequenceBuilder0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strBuilder0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig10 = strBuilder0.build();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 1;
        int int5 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = serializableKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int2 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.lang.String str7 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder8 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder9 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = 35;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = serializableKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.lang.String str6 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        int int8 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setOffsetCommitPeriodMs((long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig9 = strBuilder8.build();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        long long3 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long4 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder5 = serializableKafkaSpoutConfig0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.pollTimeoutMs = 'a';
        java.lang.String str4 = serializableKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = serializableKafkaSpoutConfig0.valueDeserializer;
        long long7 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>(typeBuilder0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        long long3 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.lang.String str7 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder8 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.lang.String str9 = serializableKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        long long4 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 1;
        int int5 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String str6 = serializableKafkaSpoutConfig0.toString();
        int int7 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 10;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer6 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        int int7 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        int int4 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.List<java.lang.String> strList5 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        int int6 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = serializableKafkaSpoutConfig0.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = serializableKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strBuilder0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder5 = strBuilder0.setOffsetCommitPeriodMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder5.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder5.setOffsetCommitPeriodMs((long) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig10 = strBuilder9.build();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setPollTimeoutMs((long) (-1));
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = strBuilder0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig13 = strBuilder0.build();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (-1);
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (short) 10;
        long long7 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strBuilder0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder5 = strBuilder0.setOffsetCommitPeriodMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder5.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder5.setPollTimeoutMs(1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig10 = strBuilder9.build();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        int int4 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = serializableKafkaSpoutConfig0.getRetryService();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = serializableKafkaSpoutConfig0.kafkaProps;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 52;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setPollTimeoutMs(32L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder11.build();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer13 = strBuilder12.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig14 = strBuilder12.build();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.reflect.AnnotatedElement> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.reflect.AnnotatedElement>(objBuilder0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = strBuilder0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig14 = strBuilder0.build();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.List<java.lang.String> strList7 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = serializableKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        long long4 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        long long7 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        int int5 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder5 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setOffsetCommitPeriodMs(200L);
        strBuilder8.offsetCommitPeriodMs = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig11 = strBuilder8.build();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setOffsetCommitPeriodMs(200L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder11.build();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strBuilder0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        long long3 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long4 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 1;
        int int5 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String str6 = serializableKafkaSpoutConfig0.toString();
        int int7 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer3 = serializableKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        java.lang.String str5 = serializableKafkaSpoutConfig0.toString();
        long long6 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.getKafkaProps();
        long long8 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        int int9 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder10 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strBuilder0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder5 = strBuilder0.setPollTimeoutMs((long) (short) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setOffsetCommitPeriodMs((long) (short) 1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer8 = strBuilder0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig9 = strBuilder0.build();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Object> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Object> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Object>(charSequenceBuilder0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.CharSequence> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.CharSequence>(strBuilder0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder10 = strBuilder0.tuplesBuilder;
        strBuilder0.maxUncommittedOffsets = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig13 = strBuilder0.build();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.String>(strComparableBuilder0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 0;
        int int5 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.Object> strBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.Object> strBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.Object>(strBuilderBuilder0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 52;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 200L;
        long long6 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        java.lang.String str5 = serializableKafkaSpoutConfig0.toString();
        long long6 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder8.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = strBuilder8.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder8.setOffsetCommitPeriodMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder13.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder15.setPollTimeoutMs(200L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy18 = strBuilder17.firstPollOffsetStrategy;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy18;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>>(strComparableBuilder0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        long long7 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        serializableKafkaSpoutConfig0.pollTimeoutMs = 100L;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.lang.String str6 = serializableKafkaSpoutConfig0.toString();
        java.lang.String str7 = serializableKafkaSpoutConfig0.toString();
        long long8 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long9 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        long long7 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        long long9 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig8 = strBuilder0.build();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(annotatedElementBuilder0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Object>(strComparableBuilder0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        int int5 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer6 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (-1);
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.List<java.lang.String> strList5 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.util.regex.Pattern pattern7 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = serializableKafkaSpoutConfig0.kafkaProps;
        long long9 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.io.Serializable>(strComparableBuilder0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>(strBuilder0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long6 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.lang.String str7 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder8 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.lang.String str9 = serializableKafkaSpoutConfig0.toString();
        java.lang.String str10 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer12 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder13 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Comparable<java.lang.String>> serializableKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Comparable<java.lang.String>> serializableKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Comparable<java.lang.String>>(serializableKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = serializableKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strBuilder0.kafkaSpoutStreams;
        int int10 = strBuilder0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setMaxUncommittedOffsets(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig13 = strBuilder12.build();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder10 = strBuilder0.setPollTimeoutMs((long) 0);
        strBuilder0.maxUncommittedOffsets = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setPollTimeoutMs(200L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig15 = strBuilder0.build();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        long long7 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder8 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.CharSequence> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.CharSequence> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.CharSequence>(typeBuilder0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder4.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder4.maxUncommittedOffsets = (-1);
        strBuilder4.offsetCommitPeriodMs = (-1L);
        long long11 = strBuilder4.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder12 = strBuilder4.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = strBuilder4.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder4.setOffsetCommitPeriodMs((long) (byte) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy16 = strBuilder4.firstPollOffsetStrategy;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy16;
        long long18 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer19 = serializableKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = serializableKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        long long7 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer9 = serializableKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        strBuilder0.offsetCommitPeriodMs = 200L;
        strBuilder0.offsetCommitPeriodMs = (byte) 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = strBuilder0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig13 = strBuilder0.build();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = serializableKafkaSpoutConfig0.getRetryService();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.getKafkaProps();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder8 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = serializableKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        long long5 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 100;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.AnnotatedElement> serializableKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.AnnotatedElement> serializableKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.AnnotatedElement>(serializableKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strBuilder0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder5 = strBuilder0.setOffsetCommitPeriodMs((long) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig6 = strBuilder0.build();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder4 = serializableKafkaSpoutConfig0.tuplesBuilder;
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer7 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = serializableKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        long long7 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) -1;
        java.lang.String str12 = serializableKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        long long2 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder5 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.String>(genericDeclarationBuilder0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder4 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = serializableKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        long long7 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        long long8 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = serializableKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.List<java.lang.String> strList1 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = serializableKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder8.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder7.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = strBuilder7.keyDeserializer;
        strBuilder7.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder7.setOffsetCommitPeriodMs((long) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig18 = strBuilder17.build();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        int int4 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer6 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = serializableKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        strBuilder0.maxUncommittedOffsets = (byte) 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = strBuilder0.retryService;
        long long10 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder11 = strBuilder0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder0.build();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        int int4 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = serializableKafkaSpoutConfig0.getRetryService();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = serializableKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.lang.String str7 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = serializableKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        int int4 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder5 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder7 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Comparable<java.lang.String>>(serializableBuilder0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.io.Serializable> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.io.Serializable> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.io.Serializable>(typeBuilder0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.lang.String str6 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        int int8 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer9 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder10 = serializableKafkaSpoutConfig0.tuplesBuilder;
        int int11 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>(annotatedElementBuilder0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = serializableKafkaSpoutConfig0.kafkaProps;
        java.util.List<java.lang.String> strList4 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        long long5 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.lang.String str6 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (-1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        long long4 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long6 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>>(annotatedElementBuilder0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 200L;
        long long6 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long7 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        int int4 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.List<java.lang.String> strList5 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder4 = serializableKafkaSpoutConfig0.tuplesBuilder;
        int int5 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder7 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        java.lang.String str8 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = serializableKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder4 = serializableKafkaSpoutConfig0.tuplesBuilder;
        int int5 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = serializableKafkaSpoutConfig0.getKafkaProps();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.String>(annotatedElementBuilder0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        long long4 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer7 = serializableKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer3 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = serializableKafkaSpoutConfig0.getRetryService();
        long long7 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        long long7 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        long long6 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder8 = serializableKafkaSpoutConfig0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        strBuilder0.maxUncommittedOffsets = (byte) 0;
        strBuilder0.pollTimeoutMs = 100;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig13 = strBuilder0.build();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>(genericDeclarationBuilder0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.AnnotatedElement>(serializableBuilder0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>(strComparableBuilder0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 1;
        int int5 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String str6 = serializableKafkaSpoutConfig0.toString();
        int int7 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        long long10 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = serializableKafkaSpoutConfig0.getKafkaProps();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = 35;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = serializableKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.lang.String str6 = serializableKafkaSpoutConfig0.toString();
        java.lang.String str7 = serializableKafkaSpoutConfig0.toString();
        long long8 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder9 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (-1);
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (short) 10;
        java.util.List<java.lang.String> strList7 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        long long8 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer9 = serializableKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        long long2 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>(strComparableBuilder0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setOffsetCommitPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder11.setMaxUncommittedOffsets((int) 'a');
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder13.setMaxUncommittedOffsets(35);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder15.setPollTimeoutMs((long) (-1));
        strBuilder17.pollTimeoutMs = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder21 = strBuilder17.setMaxUncommittedOffsets(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig22 = strBuilder21.build();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.reflect.GenericDeclaration> strBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.reflect.GenericDeclaration> strBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.reflect.GenericDeclaration>(strBuilderBuilder0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.AnnotatedElement> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.AnnotatedElement> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.AnnotatedElement>(strBuilder0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder5 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets(0);
        int int8 = strBuilder0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig9 = strBuilder0.build();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setMaxUncommittedOffsets(0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder11.setOffsetCommitPeriodMs((long) 0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder13.setPollTimeoutMs(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig16 = strBuilder13.build();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.Type> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.reflect.Type> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.reflect.Type>(objBuilder0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.Comparable<java.lang.String>> strBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.Comparable<java.lang.String>> strBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.lang.Comparable<java.lang.String>>(strBuilderBuilder0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.Type> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.Type> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.reflect.Type>(strBuilder0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.io.Serializable> strBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.io.Serializable> strBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, java.io.Serializable>(strBuilderBuilder0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.lang.String str7 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder8 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.lang.String str9 = serializableKafkaSpoutConfig0.toString();
        long long10 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 200L;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder10 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.CharSequence> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.CharSequence> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.CharSequence>(serializableBuilder0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.io.Serializable>(genericDeclarationBuilder0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(strComparableBuilder0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        strBuilder0.pollTimeoutMs = 10L;
        strBuilder0.offsetCommitPeriodMs = 0L;
        long long10 = strBuilder0.offsetCommitPeriodMs;
        strBuilder0.pollTimeoutMs = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setPollTimeoutMs(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig15 = strBuilder0.build();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder5 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = serializableKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.getKafkaProps();
        long long8 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.lang.String str10 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder11 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        int int12 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(typeBuilder0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder4 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = serializableKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.GenericDeclaration>(serializableBuilder0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.getKafkaProps();
        long long3 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = serializableKafkaSpoutConfig0.retryService;
        int int5 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.lang.String str2 = serializableKafkaSpoutConfig0.toString();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 100;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = ' ';
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        long long8 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setPollTimeoutMs((long) (-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder11.setPollTimeoutMs((long) 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig14 = strBuilder11.build();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(genericDeclarationBuilder0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 10;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer6 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strBuilder0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder5 = strBuilder0.setPollTimeoutMs((long) (short) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setOffsetCommitPeriodMs((long) (short) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setOffsetCommitPeriodMs(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig10 = strBuilder9.build();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>(genericDeclarationBuilder0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        int int9 = strBuilder0.maxUncommittedOffsets;
        strBuilder0.offsetCommitPeriodMs = (-1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder0.build();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 1;
        int int5 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String str6 = serializableKafkaSpoutConfig0.toString();
        int int7 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (-1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.String> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.String> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.String>(typeBuilder0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setPollTimeoutMs((long) (-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder11.setPollTimeoutMs((long) 35);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder14 = strBuilder11.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = strBuilder11.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer16 = strBuilder11.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig17 = strBuilder11.build();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        long long4 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer8 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        java.lang.String str9 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(serializableKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        strBuilder0.offsetCommitPeriodMs = 0L;
        strBuilder0.offsetCommitPeriodMs = 200L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setMaxUncommittedOffsets((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig14 = strBuilder13.build();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        int int5 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = strBuilder0.firstPollOffsetStrategy;
        long long2 = strBuilder0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig3 = strBuilder0.build();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setMaxUncommittedOffsets((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder11.build();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>(annotatedElementBuilder0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strComparableBuilder0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        long long4 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer8 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.GenericDeclaration> serializableKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.GenericDeclaration> serializableKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.reflect.GenericDeclaration>(serializableKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>(serializableBuilder0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.getKafkaProps();
        long long8 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        int int9 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setOffsetCommitPeriodMs((long) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder11.setMaxUncommittedOffsets((int) 'a');
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder13.setMaxUncommittedOffsets(35);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder15.setPollTimeoutMs((long) (-1));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = strBuilder15.setMaxUncommittedOffsets(1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder21 = strBuilder19.setMaxUncommittedOffsets((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig22 = strBuilder19.build();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        long long5 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = serializableKafkaSpoutConfig0.kafkaProps;
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Object> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>(serializableBuilder0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        long long4 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.regex.Pattern pattern7 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder10 = strBuilder8.setMaxUncommittedOffsets(35);
        long long11 = strBuilder8.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder8.build();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.Object>(annotatedElementBuilder0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        long long4 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer8 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = serializableKafkaSpoutConfig0.retryService;
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer12 = serializableKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.reflect.GenericDeclaration> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.reflect.GenericDeclaration>(objBuilder0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setMaxUncommittedOffsets(0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder11.setPollTimeoutMs((long) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig14 = strBuilder13.build();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig3 = strBuilder0.build();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) '#');
        long long10 = strBuilder9.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = strBuilder9.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder9.build();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        strBuilder0.offsetCommitPeriodMs = 200L;
        strBuilder0.offsetCommitPeriodMs = (byte) 0;
        strBuilder0.offsetCommitPeriodMs = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder14 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder15 = strBuilder0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig16 = strBuilder0.build();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        strBuilder0.offsetCommitPeriodMs = 200L;
        strBuilder0.pollTimeoutMs = 0L;
        strBuilder0.offsetCommitPeriodMs = 32L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig14 = strBuilder0.build();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 10;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer6 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        int int7 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int8 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setMaxUncommittedOffsets(0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setPollTimeoutMs((long) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig14 = strBuilder0.build();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder5 = strBuilder0.tuplesBuilder;
        strBuilder0.maxUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = strBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder10 = strBuilder0.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setPollTimeoutMs((long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig13 = strBuilder0.build();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 0L;
        long long4 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer8 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = serializableKafkaSpoutConfig0.retryService;
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder8.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        int int12 = strBuilder7.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = strBuilder7.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig14 = strBuilder7.build();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>(charSequenceBuilder0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.lang.String str7 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder8 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.lang.String str9 = serializableKafkaSpoutConfig0.toString();
        java.lang.String str10 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder11 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = serializableKafkaSpoutConfig0.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = serializableKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        strBuilder7.maxUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder7.setPollTimeoutMs((long) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder7.build();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        int int5 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder9 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.offsetCommitPeriodMs = '#';
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder6 = strBuilder0.setOffsetCommitPeriodMs((long) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig7 = strBuilder6.build();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        int int4 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.regex.Pattern pattern5 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = serializableKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>(genericDeclarationBuilder0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder10 = strBuilder0.tuplesBuilder;
        strBuilder0.maxUncommittedOffsets = 1;
        int int13 = strBuilder0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer14 = strBuilder0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig15 = strBuilder0.build();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strBuilder0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder5 = strBuilder0.setOffsetCommitPeriodMs((long) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder5.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder7.setPollTimeoutMs(200L);
        strBuilder9.maxUncommittedOffsets = (short) -1;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = strBuilder9.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = strBuilder9.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig14 = strBuilder9.build();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.Type> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.Type> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.Type>(serializableBuilder0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableBuilder0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Object> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Object>(objBuilder0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder4 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        int int6 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.getKafkaProps();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = serializableKafkaSpoutConfig0.getKafkaProps();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer10 = serializableKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setPollTimeoutMs((long) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder11.build();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer2 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = serializableKafkaSpoutConfig0.keyDeserializer;
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(objBuilder0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = serializableKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }
}

