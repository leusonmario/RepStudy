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
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder2 = strBuilder0.setGroupId("");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        strKafkaSpoutConfig0.pollTimeoutMs = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long4 = strKafkaSpoutConfig0.getPollTimeoutMs();
        long long5 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass6 = strKafkaSpoutConfig0.valueDesClazz;
        strKafkaSpoutConfig0.pollTimeoutMs = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>();
        int int1 = strBuilder0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder3 = strBuilder0.setSecurityProtocol("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strKafkaSpoutConfig0.keyDes;
        long long7 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        long long7 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        long long8 = strKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        long long6 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long7 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long4 = strKafkaSpoutConfig0.getPollTimeoutMs();
        long long5 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long6 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer2 = strKafkaSpoutConfig0.getKeyDeserializer();
        int int3 = strKafkaSpoutConfig0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strKafkaSpoutConfig0.keyDes;
        long long7 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Subscription, java.util.Collection<java.lang.String>> subscriptionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Subscription, java.util.Collection<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.util.Collection<java.lang.String>> subscriptionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.util.Collection<java.lang.String>>(subscriptionBuilder0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        java.lang.String str5 = strKafkaSpoutConfig0.toString();
        strKafkaSpoutConfig0.pollTimeoutMs = (short) 1;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator8 = strKafkaSpoutConfig0.getTranslator();
        strKafkaSpoutConfig0.pollTimeoutMs = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        int int8 = strKafkaSpoutConfig0.getMaxTupleRetries();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer8 = strKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.getRetryService();
        long long5 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 141902646130682494L;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator3 = strKafkaSpoutConfig0.translator;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long4 = strKafkaSpoutConfig0.getPollTimeoutMs();
        long long5 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass6 = strKafkaSpoutConfig0.valueDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        long long6 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = strKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = strKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer7 = strKafkaSpoutConfig0.keyDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>>(strBuilderBuilder0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = strBuilder0.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long4 = strKafkaSpoutConfig0.getPollTimeoutMs();
        long long5 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass6 = strKafkaSpoutConfig0.valueDesClazz;
        strKafkaSpoutConfig0.pollTimeoutMs = 'a';
        int int9 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        strKafkaSpoutConfig0.maxUncommittedOffsets = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        java.lang.String str5 = strKafkaSpoutConfig0.toString();
        int int6 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long7 = strKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass4 = strKafkaSpoutConfig0.keyDesClazz;
        int int5 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        java.lang.String str3 = strKafkaSpoutConfig0.toString();
        long long4 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str5 = strKafkaSpoutConfig0.toString();
        strKafkaSpoutConfig0.pollTimeoutMs = 52;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer8 = strKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = strKafkaSpoutConfig0.getKafkaProps();
        long long8 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>();
        int int1 = strBuilder0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder3 = strBuilder0.setMaxPartitionFectchBytes((int) (short) 10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        long long6 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer8 = strKafkaSpoutConfig0.valueDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>();
        int int1 = strBuilder0.maxRetries;
        strBuilder0.offsetCommitPeriodMs = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = strBuilder0.setSecurityProtocol("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=1, maxUncommittedOffsets=1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        long long7 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        strKafkaSpoutConfig0.pollTimeoutMs = 100L;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = strKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator8 = strKafkaSpoutConfig0.translator;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strKafkaSpoutConfig0.keyDes;
        strKafkaSpoutConfig0.pollTimeoutMs = 52L;
        long long9 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        long long6 = strKafkaSpoutConfig0.pollTimeoutMs;
        long long7 = strKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass4 = strKafkaSpoutConfig0.valueDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = strKafkaSpoutConfig0.getRetryService();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strKafkaSpoutConfig0.keyDesClazz;
        int int7 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strBuilder0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer1 = strKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = strKafkaSpoutConfig0.getKafkaProps();
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = strKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        int int9 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int6 = strKafkaSpoutConfig0.getMaxTupleRetries();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strKafkaSpoutConfig0.keyDes;
        strKafkaSpoutConfig0.pollTimeoutMs = 52L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        long long7 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        long long6 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long7 = strKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        long long7 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long8 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        int int9 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strKafkaSpoutConfig0.keyDes;
        strKafkaSpoutConfig0.pollTimeoutMs = 52L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.lang.String str8 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.lang.String str8 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.lang.String str3 = strKafkaSpoutConfig0.toString();
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long8 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = strKafkaSpoutConfig0.keyDes;
        java.lang.String str10 = strKafkaSpoutConfig0.toString();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
        strKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass8 = strKafkaSpoutConfig0.valueDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass4 = strKafkaSpoutConfig0.keyDesClazz;
        int int5 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = strKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = strKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer7 = strKafkaSpoutConfig0.keyDes;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator8 = strKafkaSpoutConfig0.getTranslator();
        long long9 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int10 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.Subscription subscription12 = strKafkaSpoutConfig0.subscription;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = strKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
        strKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strKafkaSpoutConfig0.keyDesClazz;
        long long7 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        strKafkaSpoutConfig0.maxRetries = ' ';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = strKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.maxRetries = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strKafkaSpoutConfig0.keyDes;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        int int9 = strKafkaSpoutConfig0.getMaxTupleRetries();
        int int10 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.translator;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = (-1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass4 = strKafkaSpoutConfig0.keyDesClazz;
        strKafkaSpoutConfig0.pollTimeoutMs = 0L;
        int int7 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.reflect.AnnotatedElement>(serializableBuilder0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        int int5 = strKafkaSpoutConfig0.getMaxTupleRetries();
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
        subscription58.refreshAssignment();
        strKafkaSpoutConfig0.subscription = subscription58;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean62 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long4 = strKafkaSpoutConfig0.getPollTimeoutMs();
        long long5 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (short) 1;
        long long8 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long9 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.maxRetries = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator4 = strKafkaSpoutConfig0.translator;
        strKafkaSpoutConfig0.pollTimeoutMs = 10;
        long long7 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        long long7 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long8 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer9 = strKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.Subscription subscription10 = strKafkaSpoutConfig0.subscription;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strKafkaSpoutConfig0.keyDes;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 97;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        strKafkaSpoutConfig0.pollTimeoutMs = 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = strKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        java.lang.String str3 = strKafkaSpoutConfig0.toString();
        long long4 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str5 = strKafkaSpoutConfig0.toString();
        strKafkaSpoutConfig0.pollTimeoutMs = 52;
        long long8 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass9 = strKafkaSpoutConfig0.valueDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer2 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = strKafkaSpoutConfig0.keyDes;
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 2147483647L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.lang.String str8 = strKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer9 = strKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strKafkaSpoutConfig0.keyDes;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = strKafkaSpoutConfig0.getKafkaProps();
        int int8 = strKafkaSpoutConfig0.getMaxTupleRetries();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>(annotatedElementBuilder0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.pollTimeoutMs = '4';
        int int6 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        strKafkaSpoutConfig0.maxUncommittedOffsets = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, java.util.RandomAccess> strListBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, java.util.RandomAccess>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, java.util.RandomAccess> strListKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, java.util.RandomAccess>(strListBuilder0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        long long7 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        java.lang.String str5 = strKafkaSpoutConfig0.toString();
        int int6 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = strKafkaSpoutConfig0.retryService;
        long long8 = strKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass4 = strKafkaSpoutConfig0.keyDesClazz;
        strKafkaSpoutConfig0.pollTimeoutMs = 0L;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass7 = strKafkaSpoutConfig0.keyDesClazz;
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.lang.String str3 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator4 = strKafkaSpoutConfig0.getTranslator();
        int int5 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        strKafkaSpoutConfig0.maxRetries = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass4 = strKafkaSpoutConfig0.keyDesClazz;
        strKafkaSpoutConfig0.pollTimeoutMs = (-1L);
        long long7 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.lang.String str8 = strKafkaSpoutConfig0.toString();
        int int9 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator10 = strKafkaSpoutConfig0.translator;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        int int3 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        int int4 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.Subscription subscription5 = strKafkaSpoutConfig0.subscription;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long8 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = strKafkaSpoutConfig0.keyDes;
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 97L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.util.ArrayList<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.util.ArrayList<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.util.ArrayList<java.lang.String>> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.util.ArrayList<java.lang.String>>(strBuilder0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer2 = strKafkaSpoutConfig0.getKeyDeserializer();
        int int3 = strKafkaSpoutConfig0.maxRetries;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator4 = strKafkaSpoutConfig0.translator;
        long long5 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        long long3 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        int int4 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.Subscription subscription5 = strKafkaSpoutConfig0.subscription;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strKafkaSpoutConfig0.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer2 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = strKafkaSpoutConfig0.keyDes;
        org.apache.storm.kafka.spout.Subscription subscription4 = strKafkaSpoutConfig0.subscription;
        long long5 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.util.AbstractCollection<java.lang.String>> strRecordTranslatorBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.util.AbstractCollection<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.util.AbstractCollection<java.lang.String>> strRecordTranslatorKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.util.AbstractCollection<java.lang.String>>(strRecordTranslatorBuilder0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass4 = strKafkaSpoutConfig0.valueDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = strKafkaSpoutConfig0.getRetryService();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 10;
        java.lang.String str9 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        long long10 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.util.Collection<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.util.Collection<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.util.Collection<java.lang.String>> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.util.Collection<java.lang.String>>(strBuilder0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long4 = strKafkaSpoutConfig0.getPollTimeoutMs();
        long long5 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass6 = strKafkaSpoutConfig0.valueDesClazz;
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 141902646130682494L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.util.List<java.lang.String>> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.util.List<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.util.List<java.lang.String>> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.util.List<java.lang.String>>(objBuilder0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Object> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Object> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.Object>(typeBuilder0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strCollectionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strCollectionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strCollectionBuilder0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        long long6 = strKafkaSpoutConfig0.pollTimeoutMs;
        long long7 = strKafkaSpoutConfig0.pollTimeoutMs;
        long long8 = strKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.translator;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.pollTimeoutMs = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.Subscription> strRecordTranslatorBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.Subscription>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.Subscription> strRecordTranslatorKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.Subscription>(strRecordTranslatorBuilder0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.lang.String str3 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator4 = strKafkaSpoutConfig0.getTranslator();
        int int5 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass5 = strKafkaSpoutConfig0.valueDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, java.util.ArrayList<java.lang.String>> strCollectionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, java.util.ArrayList<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<java.lang.String>, java.util.ArrayList<java.lang.String>> strCollectionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<java.lang.String>, java.util.ArrayList<java.lang.String>>(strCollectionBuilder0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass4 = strKafkaSpoutConfig0.keyDesClazz;
        strKafkaSpoutConfig0.pollTimeoutMs = 0L;
        int int7 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        int int8 = strKafkaSpoutConfig0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>>(typeBuilder0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.lang.String str8 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator10 = strKafkaSpoutConfig0.getTranslator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = strKafkaSpoutConfig0.getValueDeserializer();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 52;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Cloneable, java.lang.Comparable<java.lang.String>> cloneableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Cloneable, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, java.lang.Comparable<java.lang.String>> cloneableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, java.lang.Comparable<java.lang.String>>(cloneableBuilder0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = strKafkaSpoutConfig0.getValueDeserializer();
        int int6 = strKafkaSpoutConfig0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = strKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        long long10 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = strKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator9 = strKafkaSpoutConfig0.translator;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.Subscription subscription6 = strKafkaSpoutConfig0.getSubscription();
        int int7 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, java.util.AbstractList<java.lang.String>> strCollectionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, java.util.AbstractList<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<java.lang.String>, java.util.AbstractList<java.lang.String>> strCollectionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<java.lang.String>, java.util.AbstractList<java.lang.String>>(strCollectionBuilder0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.lang.String[]> strCollectionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.lang.String[]>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.String[]> strCollectionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.String[]>(strCollectionBuilder0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        long long6 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long7 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass8 = strKafkaSpoutConfig0.valueDesClazz;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass9 = strKafkaSpoutConfig0.keyDesClazz;
        java.lang.String str10 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer1 = strKafkaSpoutConfig0.getValueDeserializer();
        int int2 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        long long4 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str5 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int7 = strKafkaSpoutConfig0.getMaxTupleRetries();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Map<java.lang.String, java.lang.Object>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strMapBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Map<java.lang.String, java.lang.Object>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strMapKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMapBuilder0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>>(strComparableBuilder0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, java.io.Serializable> strListBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, java.io.Serializable> strListKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, java.io.Serializable>(strListBuilder0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.util.Collection<java.lang.String>> strBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.util.Collection<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.util.Collection<java.lang.String>> strBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.util.Collection<java.lang.String>>(strBuilderBuilder0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.translator;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.util.Collection<java.lang.String>> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.util.Collection<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.util.Collection<java.lang.String>> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.util.Collection<java.lang.String>>(charSequenceBuilder0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>> strConsumerRecordFuncBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>> strConsumerRecordFuncKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>>(strConsumerRecordFuncBuilder0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = strKafkaSpoutConfig0.keyDes;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.translator;
        strKafkaSpoutConfig0.pollTimeoutMs = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 1;
        int int7 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        int int3 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator4 = strKafkaSpoutConfig0.getTranslator();
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = strKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = strKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = strKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = strKafkaSpoutConfig0.getValueDeserializer();
        int int8 = strKafkaSpoutConfig0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 0;
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        long long8 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = strKafkaSpoutConfig0.getValueDeserializer();
        int int6 = strKafkaSpoutConfig0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer3 = strKafkaSpoutConfig0.getValueDeserializer();
        strKafkaSpoutConfig0.maxRetries = 10;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        strKafkaSpoutConfig0.maxRetries = ' ';
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = strKafkaSpoutConfig0.kafkaProps;
        int int11 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        java.lang.String str12 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.Subscription subscription6 = strKafkaSpoutConfig0.subscription;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = strKafkaSpoutConfig0.getValueDeserializer();
        int int8 = strKafkaSpoutConfig0.maxRetries;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = strKafkaSpoutConfig0.keyDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        long long6 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        org.apache.storm.kafka.spout.Subscription subscription9 = strKafkaSpoutConfig0.subscription;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = (-1L);
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer8 = strKafkaSpoutConfig0.getKeyDeserializer();
        long long9 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = strKafkaSpoutConfig0.getRetryService();
        long long11 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        long long3 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        java.lang.String str3 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.RandomAccess, java.io.Serializable> randomAccessBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.RandomAccess, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.io.Serializable> randomAccessKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.io.Serializable>(randomAccessBuilder0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        long long28 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Subscription, java.util.RandomAccess> subscriptionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Subscription, java.util.RandomAccess>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.util.RandomAccess> subscriptionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.util.RandomAccess>(subscriptionBuilder0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        long long6 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long7 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass8 = strKafkaSpoutConfig0.valueDesClazz;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = strKafkaSpoutConfig0.getKafkaProps();
        int int10 = strKafkaSpoutConfig0.getMaxTupleRetries();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        long long5 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        long long7 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.lang.String str8 = strKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer9 = strKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer1 = strKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = strKafkaSpoutConfig0.getKafkaProps();
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        strKafkaSpoutConfig0.maxRetries = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        int int2 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer1 = strKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = strKafkaSpoutConfig0.getKafkaProps();
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        strKafkaSpoutConfig0.maxRetries = 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = strKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = strKafkaSpoutConfig0.kafkaProps;
        long long6 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer7 = strKafkaSpoutConfig0.getKeyDeserializer();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 1;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator10 = strKafkaSpoutConfig0.translator;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strBuilder0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>(typeBuilder0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 1;
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        int int2 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig5 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = strKafkaSpoutConfig5.getValueDeserializer();
        int int7 = strKafkaSpoutConfig5.getMaxUncommittedOffsets();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strKafkaSpoutConfig5.getKafkaProps();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer9 = strKafkaSpoutConfig5.valueDes;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder15 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList13);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass16 = strBuilder15.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder15.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder24 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList22);
        strBuilder24.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = strBuilder24.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder28 = strBuilder15.setProp(strMap27);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder28.firstPollOffsetStrategy = firstPollOffsetStrategy29;
        strKafkaSpoutConfig5.firstPollOffsetStrategy = firstPollOffsetStrategy29;
        int int32 = strKafkaSpoutConfig5.maxUncommittedOffsets;
        long long33 = strKafkaSpoutConfig5.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy34 = strKafkaSpoutConfig5.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy35 = strKafkaSpoutConfig5.firstPollOffsetStrategy;
        strKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy35;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer37 = strKafkaSpoutConfig0.valueDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.getRetryService();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass5 = strKafkaSpoutConfig0.valueDesClazz;
        int int6 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator4 = strKafkaSpoutConfig0.translator;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator7 = strKafkaSpoutConfig0.translator;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass8 = strKafkaSpoutConfig0.keyDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = strKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = strKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = strKafkaSpoutConfig0.getValueDeserializer();
        int int8 = strKafkaSpoutConfig0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.String> strKafkaSpoutConfig1 = strBuilder0.build();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer1 = strKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = strKafkaSpoutConfig0.getKafkaProps();
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        strKafkaSpoutConfig0.maxRetries = 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpoutConfig0.getRetryService();
        long long7 = strKafkaSpoutConfig0.pollTimeoutMs;
        strKafkaSpoutConfig0.maxRetries = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer1 = strKafkaSpoutConfig0.getValueDeserializer();
        int int2 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        long long4 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str5 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.Subscription subscription7 = strKafkaSpoutConfig0.subscription;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        long long6 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, java.util.Map<java.lang.String, java.lang.Object>> strCollectionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Collection<java.lang.String>, java.util.Map<java.lang.String, java.lang.Object>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<java.lang.String>, java.util.Map<java.lang.String, java.lang.Object>> strCollectionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Collection<java.lang.String>, java.util.Map<java.lang.String, java.lang.Object>>(strCollectionBuilder0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.String[]> strKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.String[]>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.String[]> strKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.String[]>(strKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long4 = strKafkaSpoutConfig0.getPollTimeoutMs();
        long long5 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass6 = strKafkaSpoutConfig0.valueDesClazz;
        long long7 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator8 = strKafkaSpoutConfig0.getTranslator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        int int27 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        long long28 = strKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy30 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass31 = strKafkaSpoutConfig0.keyDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean32 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = strKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = strKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer7 = strKafkaSpoutConfig0.keyDes;
        org.apache.storm.kafka.spout.Subscription subscription8 = strKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = strKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = strKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.translator;
        int int7 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long8 = strKafkaSpoutConfig0.getPollTimeoutMs();
        long long9 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        long long7 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        strKafkaSpoutConfig0.pollTimeoutMs = (-1L);
        long long10 = strKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        long long7 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = strKafkaSpoutConfig0.retryService;
        long long13 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        int int5 = strKafkaSpoutConfig0.getMaxTupleRetries();
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
        subscription58.refreshAssignment();
        strKafkaSpoutConfig0.subscription = subscription58;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer62 = strKafkaSpoutConfig0.valueDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str63 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> strCollectionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> strCollectionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>>(strCollectionBuilder0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.Subscription subscription6 = strKafkaSpoutConfig0.getSubscription();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = strKafkaSpoutConfig0.keyDes;
        strKafkaSpoutConfig0.maxRetries = 32;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer6 = strKafkaSpoutConfig0.getKeyDeserializer();
        long long7 = strKafkaSpoutConfig0.getPollTimeoutMs();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass8 = strKafkaSpoutConfig0.valueDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Subscription, java.util.AbstractList<java.lang.String>> subscriptionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Subscription, java.util.AbstractList<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.util.AbstractList<java.lang.String>> subscriptionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.util.AbstractList<java.lang.String>>(subscriptionBuilder0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractList<java.lang.String>, java.util.RandomAccess> strListBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractList<java.lang.String>, java.util.RandomAccess>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, java.util.RandomAccess> strListKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractList<java.lang.String>, java.util.RandomAccess>(strListBuilder0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 0;
        org.apache.storm.kafka.spout.Subscription subscription7 = strKafkaSpoutConfig0.getSubscription();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig8 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig8.maxRetries = (short) 1;
        long long11 = strKafkaSpoutConfig8.offsetCommitPeriodMs;
        java.lang.String str12 = strKafkaSpoutConfig8.toString();
        int int13 = strKafkaSpoutConfig8.getMaxTupleRetries();
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
        subscription66.refreshAssignment();
        strKafkaSpoutConfig8.subscription = subscription66;
        strKafkaSpoutConfig0.subscription = subscription66;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer71 = strKafkaSpoutConfig0.valueDes;
        int int72 = strKafkaSpoutConfig0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str73 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = strKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer9 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer10 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.Subscription subscription11 = strKafkaSpoutConfig0.getSubscription();
        org.apache.storm.kafka.spout.Subscription subscription12 = strKafkaSpoutConfig0.subscription;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        long long7 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long4 = strKafkaSpoutConfig0.getPollTimeoutMs();
        long long5 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.maxRetries = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.RandomAccess, java.util.AbstractCollection<java.lang.String>> randomAccessBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.RandomAccess, java.util.AbstractCollection<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.util.AbstractCollection<java.lang.String>> randomAccessKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.util.AbstractCollection<java.lang.String>>(randomAccessBuilder0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass4 = strKafkaSpoutConfig0.keyDesClazz;
        int int5 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strListBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strListKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strListBuilder0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
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
        int int27 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        long long28 = strKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long30 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int31 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        long long32 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean35 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.util.AbstractList<java.lang.String>> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.util.AbstractList<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.util.AbstractList<java.lang.String>> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.util.AbstractList<java.lang.String>>(objBuilder0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>(genericDeclarationBuilder0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long8 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long9 = strKafkaSpoutConfig0.getPollTimeoutMs();
        long long10 = strKafkaSpoutConfig0.pollTimeoutMs;
        java.lang.String str11 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
        strKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = strKafkaSpoutConfig0.kafkaProps;
        long long8 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = strKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = strKafkaSpoutConfig0.getRetryService();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Iterable<java.lang.String>> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Iterable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Iterable<java.lang.String>> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.Iterable<java.lang.String>>(charSequenceBuilder0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(annotatedElementBuilder0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass4 = strKafkaSpoutConfig0.keyDesClazz;
        org.apache.storm.kafka.spout.Subscription subscription5 = strKafkaSpoutConfig0.getSubscription();
        org.apache.storm.kafka.spout.Subscription subscription6 = strKafkaSpoutConfig0.getSubscription();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Iterable<java.lang.String>, java.io.Serializable> strIterableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Iterable<java.lang.String>, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.io.Serializable> strIterableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, java.io.Serializable>(strIterableBuilder0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.util.List<java.lang.String>> strCollectionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.util.List<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.util.List<java.lang.String>> strCollectionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.util.List<java.lang.String>>(strCollectionBuilder0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
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
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService27 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer28 = strKafkaSpoutConfig0.keyDes;
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder33 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray32);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder35 = strBuilder33.setMaxUncommittedOffsets(35);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.String> strKafkaSpoutConfig36 = strBuilder33.build();
        org.apache.storm.kafka.spout.Subscription subscription37 = strBuilder33.subscription;
        strKafkaSpoutConfig0.subscription = subscription37;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean39 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long7 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        strKafkaSpoutConfig0.maxRetries = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator4 = strKafkaSpoutConfig0.translator;
        long long5 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        int int6 = strKafkaSpoutConfig0.maxRetries;
        strKafkaSpoutConfig0.maxUncommittedOffsets = (short) 0;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass9 = strKafkaSpoutConfig0.valueDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.Object> strKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.Object> strKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, java.lang.Object>(strKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.Subscription subscription4 = strKafkaSpoutConfig0.subscription;
        long long5 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        long long6 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        strKafkaSpoutConfig0.maxUncommittedOffsets = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = strKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, org.apache.storm.kafka.spout.Subscription> strConsumerRecordFuncBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, org.apache.storm.kafka.spout.Subscription>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, org.apache.storm.kafka.spout.Subscription> strConsumerRecordFuncKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>, org.apache.storm.kafka.spout.Subscription>(strConsumerRecordFuncBuilder0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.CharSequence> charSequenceBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.CharSequence> charSequenceKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.CharSequence, java.lang.CharSequence>(charSequenceBuilder0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer2 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass4 = strKafkaSpoutConfig0.keyDesClazz;
        int int5 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strBuilder5.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder8 = strBuilder5.setPollTimeoutMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig9.maxRetries = (short) 1;
        long long12 = strKafkaSpoutConfig9.offsetCommitPeriodMs;
        java.lang.String str13 = strKafkaSpoutConfig9.toString();
        int int14 = strKafkaSpoutConfig9.getMaxTupleRetries();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList18);
        strBuilder20.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = strBuilder20.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder25 = strBuilder20.setPartitionRefreshPeriodMs((long) 1);
        int int26 = strBuilder25.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder30 = strBuilder25.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder32 = strBuilder25.setSecurityProtocol("hi!");
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder38 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList36);
        strBuilder38.maxRetries = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder44 = strBuilder38.setSSLKeystore("", "", "hi!");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder46 = strBuilder44.setMaxPartitionFectchBytes((-1));
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder52 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList50);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass53 = strBuilder52.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy54 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder52.firstPollOffsetStrategy = firstPollOffsetStrategy54;
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder61 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList59);
        strBuilder61.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = strBuilder61.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder65 = strBuilder52.setProp(strMap64);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder66 = strBuilder44.setProp(strMap64);
        org.apache.storm.kafka.spout.Subscription subscription67 = strBuilder44.subscription;
        strBuilder32.subscription = subscription67;
        subscription67.refreshAssignment();
        strKafkaSpoutConfig9.subscription = subscription67;
        strBuilder5.subscription = subscription67;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder73 = strBuilder5.setGroupId("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder75 = strBuilder5.setPollTimeoutMs((long) (byte) 100);
        strBuilder5.maxRetries = 97;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig79 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int80 = strKafkaSpoutConfig79.getMaxTupleRetries();
        long long81 = strKafkaSpoutConfig79.getPollTimeoutMs();
        strKafkaSpoutConfig79.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy84 = strKafkaSpoutConfig79.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator85 = strKafkaSpoutConfig79.getTranslator();
        long long86 = strKafkaSpoutConfig79.partitionRefreshPeriodMs;
        strKafkaSpoutConfig79.offsetCommitPeriodMs = 0L;
        strKafkaSpoutConfig79.maxUncommittedOffsets = 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService91 = strKafkaSpoutConfig79.retryService;
        long long92 = strKafkaSpoutConfig79.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService93 = strKafkaSpoutConfig79.getRetryService();
        int int94 = strKafkaSpoutConfig79.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder95 = strBuilder5.setProp("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=97, maxRetries=0, maxUncommittedOffsets=35, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", (java.lang.Object) strKafkaSpoutConfig79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean96 = strKafkaSpoutConfig79.isConsumerAutoCommitMode();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.util.AbstractCollection<java.lang.String>> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.util.AbstractCollection<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.util.AbstractCollection<java.lang.String>> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.util.AbstractCollection<java.lang.String>>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        long long6 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        strKafkaSpoutConfig0.maxUncommittedOffsets = ' ';
        strKafkaSpoutConfig0.pollTimeoutMs = 52;
        org.apache.storm.kafka.spout.Subscription subscription11 = strKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer12 = strKafkaSpoutConfig0.valueDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, org.apache.storm.kafka.spout.Subscription> strKafkaSpoutConfigBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, org.apache.storm.kafka.spout.Subscription>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, org.apache.storm.kafka.spout.Subscription> strKafkaSpoutConfigKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>, org.apache.storm.kafka.spout.Subscription>(strKafkaSpoutConfigBuilder0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass4 = strKafkaSpoutConfig0.valueDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = strKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.Subscription subscription6 = strKafkaSpoutConfig0.subscription;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = strKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.lang.Cloneable> strBuilderBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.lang.Cloneable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.lang.Cloneable> strBuilderKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>, java.lang.Cloneable>(strBuilderBuilder0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer3 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer4 = strKafkaSpoutConfig0.valueDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strKafkaSpoutConfig0.keyDesClazz;
        int int7 = strKafkaSpoutConfig0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        java.lang.String str5 = strKafkaSpoutConfig0.toString();
        int int6 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = strKafkaSpoutConfig0.retryService;
        long long8 = strKafkaSpoutConfig0.pollTimeoutMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass9 = strKafkaSpoutConfig0.valueDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.lang.Iterable<java.lang.String>> strCollectionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, java.lang.Iterable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.Iterable<java.lang.String>> strCollectionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, java.lang.Iterable<java.lang.String>>(strCollectionBuilder0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        long long6 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator9 = strKafkaSpoutConfig0.translator;
        org.apache.storm.kafka.spout.Subscription subscription10 = strKafkaSpoutConfig0.subscription;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = strKafkaSpoutConfig0.getValueDeserializer();
        long long3 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator4 = strKafkaSpoutConfig0.getTranslator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Map<java.lang.String, java.lang.Object>, java.lang.reflect.Type> strMapBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.Map<java.lang.String, java.lang.Object>, java.lang.reflect.Type>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.lang.reflect.Type> strMapKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.Map<java.lang.String, java.lang.Object>, java.lang.reflect.Type>(strMapBuilder0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 0;
        org.apache.storm.kafka.spout.Subscription subscription7 = strKafkaSpoutConfig0.getSubscription();
        long long8 = strKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.util.AbstractCollection<java.lang.String>> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.util.AbstractCollection<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.util.AbstractCollection<java.lang.String>> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.util.AbstractCollection<java.lang.String>>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Cloneable, java.lang.reflect.AnnotatedElement> cloneableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Cloneable, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, java.lang.reflect.AnnotatedElement> cloneableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, java.lang.reflect.AnnotatedElement>(cloneableBuilder0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.io.Serializable>(genericDeclarationBuilder0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass4 = strKafkaSpoutConfig0.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = strKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass5 = strKafkaSpoutConfig0.keyDesClazz;
        long long6 = strKafkaSpoutConfig0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = strKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strKafkaSpoutConfig0.keyDesClazz;
        long long7 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int8 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Cloneable> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Cloneable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Cloneable> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.lang.Cloneable>(genericDeclarationBuilder0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = strKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = strKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer7 = strKafkaSpoutConfig0.keyDes;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator8 = strKafkaSpoutConfig0.getTranslator();
        long long9 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int10 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.Subscription subscription12 = strKafkaSpoutConfig0.subscription;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 100;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = strKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Subscription, java.io.Serializable> subscriptionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Subscription, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.io.Serializable> subscriptionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.io.Serializable>(subscriptionBuilder0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, java.lang.reflect.GenericDeclaration> strListBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, java.lang.reflect.GenericDeclaration> strListKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, java.lang.reflect.GenericDeclaration>(strListBuilder0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String[], org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strArrayBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String[], org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strArrayKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strArrayBuilder0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        java.lang.String str5 = strKafkaSpoutConfig0.toString();
        int int6 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long7 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.maxRetries = '4';
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        long long11 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator12 = strKafkaSpoutConfig0.getTranslator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        java.lang.String str5 = strKafkaSpoutConfig0.toString();
        strKafkaSpoutConfig0.pollTimeoutMs = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass4 = strKafkaSpoutConfig0.valueDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = strKafkaSpoutConfig0.getRetryService();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 10;
        java.lang.String str9 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
        strKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = strKafkaSpoutConfig0.getValueDeserializer();
        java.lang.String str8 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>(typeBuilder0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 100;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator9 = strKafkaSpoutConfig0.translator;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator5 = strKafkaSpoutConfig0.getTranslator();
        long long6 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        strKafkaSpoutConfig0.maxUncommittedOffsets = ' ';
        strKafkaSpoutConfig0.pollTimeoutMs = 52;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = strKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = strKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer9 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer10 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.Subscription subscription11 = strKafkaSpoutConfig0.getSubscription();
        java.lang.String str12 = strKafkaSpoutConfig0.toString();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass13 = strKafkaSpoutConfig0.valueDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.RandomAccess, java.lang.reflect.AnnotatedElement> randomAccessBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.RandomAccess, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.lang.reflect.AnnotatedElement> randomAccessKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.lang.reflect.AnnotatedElement>(randomAccessBuilder0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        int int3 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator4 = strKafkaSpoutConfig0.getTranslator();
        strKafkaSpoutConfig0.pollTimeoutMs = 2147483647L;
        int int7 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer8 = strKafkaSpoutConfig0.valueDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator4 = strKafkaSpoutConfig0.translator;
        strKafkaSpoutConfig0.pollTimeoutMs = 10;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer7 = strKafkaSpoutConfig0.getKeyDeserializer();
        long long8 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.lang.String str9 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.lang.reflect.GenericDeclaration> strRecordTranslatorBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.lang.reflect.GenericDeclaration> strRecordTranslatorKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, java.lang.reflect.GenericDeclaration>(strRecordTranslatorBuilder0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Cloneable, java.util.List<java.lang.String>> cloneableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Cloneable, java.util.List<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, java.util.List<java.lang.String>> cloneableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, java.util.List<java.lang.String>>(cloneableBuilder0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>> strRecordTranslatorBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>> strRecordTranslatorKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>>(strRecordTranslatorBuilder0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        int int5 = strKafkaSpoutConfig0.getMaxTupleRetries();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        strKafkaSpoutConfig0.maxRetries = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = strKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer12 = strKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.kafkaProps;
        java.lang.String str4 = strKafkaSpoutConfig0.toString();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass5 = strKafkaSpoutConfig0.keyDesClazz;
        long long6 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.Subscription subscription7 = strKafkaSpoutConfig0.subscription;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        org.apache.storm.kafka.spout.Subscription subscription7 = strKafkaSpoutConfig0.getSubscription();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Subscription, java.util.ArrayList<java.lang.String>> subscriptionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.Subscription, java.util.ArrayList<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.util.ArrayList<java.lang.String>> subscriptionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.Subscription, java.util.ArrayList<java.lang.String>>(subscriptionBuilder0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass4 = strKafkaSpoutConfig0.keyDesClazz;
        strKafkaSpoutConfig0.pollTimeoutMs = (-1L);
        long long7 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.lang.String str8 = strKafkaSpoutConfig0.toString();
        int int9 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator10 = strKafkaSpoutConfig0.translator;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass11 = strKafkaSpoutConfig0.keyDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator4 = strKafkaSpoutConfig0.translator;
        strKafkaSpoutConfig0.pollTimeoutMs = 10;
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        long long8 = strKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.getRetryService();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass5 = strKafkaSpoutConfig0.valueDesClazz;
        int int6 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.Subscription subscription8 = strKafkaSpoutConfig0.subscription;
        int int9 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.util.List<java.lang.String>> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.util.List<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.util.List<java.lang.String>> genericDeclarationKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.GenericDeclaration, java.util.List<java.lang.String>>(genericDeclarationBuilder0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = strKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer4 = strKafkaSpoutConfig0.keyDes;
        int int5 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strKafkaSpoutConfig0.keyDes;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer7 = strKafkaSpoutConfig0.getKeyDeserializer();
        int int8 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass9 = strKafkaSpoutConfig0.keyDesClazz;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator10 = strKafkaSpoutConfig0.translator;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strKafkaSpoutConfig0.keyDes;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        java.lang.String str9 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator10 = strKafkaSpoutConfig0.translator;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>>(strBuilder0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer1 = strKafkaSpoutConfig0.getValueDeserializer();
        long long2 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        int int3 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer1 = strKafkaSpoutConfig0.getValueDeserializer();
        int int2 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator3 = strKafkaSpoutConfig0.translator;
        long long4 = strKafkaSpoutConfig0.getPollTimeoutMs();
        long long5 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer6 = strKafkaSpoutConfig0.getKeyDeserializer();
        strKafkaSpoutConfig0.maxRetries = (short) 10;
        strKafkaSpoutConfig0.pollTimeoutMs = 100L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        long long4 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        int int5 = strKafkaSpoutConfig0.getMaxTupleRetries();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long3 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 0;
        org.apache.storm.kafka.spout.Subscription subscription7 = strKafkaSpoutConfig0.getSubscription();
        long long8 = strKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        long long8 = strKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer11 = strKafkaSpoutConfig0.valueDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        java.lang.String str5 = strKafkaSpoutConfig0.toString();
        strKafkaSpoutConfig0.pollTimeoutMs = (short) 1;
        java.lang.String str8 = strKafkaSpoutConfig0.toString();
        java.lang.String str9 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = strKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        long long6 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        int int8 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.Subscription subscription9 = strKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig10 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = strKafkaSpoutConfig10.getValueDeserializer();
        int int12 = strKafkaSpoutConfig10.getMaxUncommittedOffsets();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = strKafkaSpoutConfig10.getKafkaProps();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer14 = strKafkaSpoutConfig10.valueDes;
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder20 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList18);
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass21 = strBuilder20.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy22 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder20.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder29 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", (java.util.Collection<java.lang.String>) strList27);
        strBuilder29.maxRetries = (byte) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = strBuilder29.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder33 = strBuilder20.setProp(strMap32);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy34 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder33.firstPollOffsetStrategy = firstPollOffsetStrategy34;
        strKafkaSpoutConfig10.firstPollOffsetStrategy = firstPollOffsetStrategy34;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer37 = strKafkaSpoutConfig10.getKeyDeserializer();
        long long38 = strKafkaSpoutConfig10.offsetCommitPeriodMs;
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}" };
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder44 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("hi!", strArray43);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder45 = org.apache.storm.kafka.spout.KafkaSpoutConfig.builder("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=100, maxRetries=1, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", strArray43);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy46 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        strBuilder45.firstPollOffsetStrategy = firstPollOffsetStrategy46;
        strKafkaSpoutConfig10.firstPollOffsetStrategy = firstPollOffsetStrategy46;
        strKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy46;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str50 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>> strCollectionBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.AbstractCollection<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>> strCollectionKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>>(strCollectionBuilder0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass6 = strKafkaSpoutConfig0.keyDesClazz;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = strKafkaSpoutConfig0.getKafkaProps();
        long long8 = strKafkaSpoutConfig0.partitionRefreshPeriodMs;
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 97;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer2 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer3 = strKafkaSpoutConfig0.keyDes;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        java.lang.String str5 = strKafkaSpoutConfig0.toString();
        long long6 = strKafkaSpoutConfig0.pollTimeoutMs;
        long long7 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpoutConfig0.retryService;
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(strComparableBuilder0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        long long2 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.pollTimeoutMs = '4';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strKafkaSpoutConfig0.getRetryService();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = strKafkaSpoutConfig0.getValueDeserializer();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass8 = strKafkaSpoutConfig0.valueDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = strKafkaSpoutConfig0.getValueDeserializer();
        int int6 = strKafkaSpoutConfig0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = strKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, org.apache.storm.kafka.spout.Func<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.String>, java.util.List<java.lang.Object>>>(typeBuilder0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>(strBuilder0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 1;
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer8 = strKafkaSpoutConfig0.valueDes;
        org.apache.storm.kafka.spout.Subscription subscription9 = strKafkaSpoutConfig0.subscription;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 52;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = strKafkaSpoutConfig0.getKafkaProps();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass13 = strKafkaSpoutConfig0.keyDesClazz;
        strKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>> strListBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.ArrayList<java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>> strListKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.ArrayList<java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.String>>(strListBuilder0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        long long5 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.lang.String str8 = strKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer9 = strKafkaSpoutConfig0.getKeyDeserializer();
        strKafkaSpoutConfig0.pollTimeoutMs = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.CharSequence> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>(objBuilder0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = strKafkaSpoutConfig0.retryService;
        strKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        strKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.util.AbstractList<java.lang.String>> serializableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.util.AbstractList<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.util.AbstractList<java.lang.String>> serializableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.util.AbstractList<java.lang.String>>(serializableBuilder0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer1 = strKafkaSpoutConfig0.getValueDeserializer();
        int int2 = strKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strKafkaSpoutConfig0.getKafkaProps();
        long long4 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.lang.String str5 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.Subscription subscription7 = strKafkaSpoutConfig0.subscription;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = strKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
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
        int int27 = strKafkaSpoutConfig0.maxUncommittedOffsets;
        long long28 = strKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy30 = strKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass31 = strKafkaSpoutConfig0.keyDesClazz;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass32 = strKafkaSpoutConfig0.keyDesClazz;
        org.apache.storm.kafka.spout.Subscription subscription33 = strKafkaSpoutConfig0.subscription;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        strKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = strKafkaSpoutConfig0.retryService;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass5 = strKafkaSpoutConfig0.keyDesClazz;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer6 = strKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = strKafkaSpoutConfig0.retryService;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer8 = strKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        strKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 1;
        java.lang.String str7 = strKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer8 = strKafkaSpoutConfig0.valueDes;
        org.apache.storm.kafka.spout.Subscription subscription9 = strKafkaSpoutConfig0.subscription;
        strKafkaSpoutConfig0.maxUncommittedOffsets = 52;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = strKafkaSpoutConfig0.getKafkaProps();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.String>> wildcardClass13 = strKafkaSpoutConfig0.keyDesClazz;
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        java.lang.String str16 = strKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        int int1 = strKafkaSpoutConfig0.getMaxTupleRetries();
        long long2 = strKafkaSpoutConfig0.getPollTimeoutMs();
        strKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = strKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator6 = strKafkaSpoutConfig0.getTranslator();
        strKafkaSpoutConfig0.maxRetries = 'a';
        org.apache.storm.kafka.spout.Subscription subscription9 = strKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer10 = strKafkaSpoutConfig0.valueDes;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer11 = strKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.util.List<java.lang.String>> annotatedElementBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.util.List<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.util.List<java.lang.String>> annotatedElementKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.util.List<java.lang.String>>(annotatedElementBuilder0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        strKafkaSpoutConfig0.maxRetries = (short) 1;
        long long3 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = strKafkaSpoutConfig0.getKafkaProps();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = strKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.RandomAccess, java.lang.CharSequence> randomAccessBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.RandomAccess, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.lang.CharSequence> randomAccessKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.RandomAccess, java.lang.CharSequence>(randomAccessBuilder0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String[], java.util.RandomAccess> strArrayBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String[], java.util.RandomAccess>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.util.RandomAccess> strArrayKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.util.RandomAccess>(strArrayBuilder0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object> strKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Object>();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator1 = strKafkaSpoutConfig0.translator;
        org.apache.kafka.common.serialization.Deserializer<java.lang.String> strDeserializer2 = strKafkaSpoutConfig0.getKeyDeserializer();
        int int3 = strKafkaSpoutConfig0.maxRetries;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Object> strRecordTranslator4 = strKafkaSpoutConfig0.translator;
        long long5 = strKafkaSpoutConfig0.pollTimeoutMs;
        java.lang.String str6 = strKafkaSpoutConfig0.toString();
        long long7 = strKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long8 = strKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Iterable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strIterableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Iterable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strIterableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Iterable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strIterableBuilder0);
    }
}

