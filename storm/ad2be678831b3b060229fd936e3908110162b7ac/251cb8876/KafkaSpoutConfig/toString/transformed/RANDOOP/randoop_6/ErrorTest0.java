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
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        long long5 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder4 = strBuilder0.setSSLKeystore("", "hi!", "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objKafkaSpoutConfig0.getKafkaProps();
        int int3 = objKafkaSpoutConfig0.getMaxTupleRetries();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.getRetryService();
        int int6 = objKafkaSpoutConfig0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        int int4 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int5 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass6 = objKafkaSpoutConfig0.valueDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = objKafkaSpoutConfig0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        java.lang.String str1 = objKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer2 = objKafkaSpoutConfig0.valueDes;
        java.lang.String str3 = objKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        int int4 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int5 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        int int4 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int5 = objKafkaSpoutConfig0.getMaxTupleRetries();
        objKafkaSpoutConfig0.offsetCommitPeriodMs = 1L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = objKafkaSpoutConfig0.getKeyDeserializer();
        int int7 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer5 = objKafkaSpoutConfig0.keyDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        int int4 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int5 = objKafkaSpoutConfig0.getMaxTupleRetries();
        objKafkaSpoutConfig0.offsetCommitPeriodMs = 1L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = '4';
        int int7 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objKafkaSpoutConfig0.getKafkaProps();
        int int3 = objKafkaSpoutConfig0.getMaxTupleRetries();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass4 = objKafkaSpoutConfig0.valueDesClazz;
        int int5 = objKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objKafkaSpoutConfig0.retryService;
        long long7 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = objKafkaSpoutConfig0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long3 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        int int5 = objKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 200L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        long long7 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long8 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer9 = objKafkaSpoutConfig0.valueDes;
        org.apache.storm.kafka.spout.Subscription subscription10 = objKafkaSpoutConfig0.getSubscription();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = objKafkaSpoutConfig0.getRetryService();
        long long12 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = '4';
        org.apache.storm.kafka.spout.Subscription subscription7 = objKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = objKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = objKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder2 = strBuilder0.setMaxPartitionFectchBytes((int) (byte) 100);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = '4';
        int int7 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer8 = objKafkaSpoutConfig0.valueDes;
        java.lang.String str9 = objKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        long long4 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = objKafkaSpoutConfig0.firstPollOffsetStrategy;
        objKafkaSpoutConfig0.offsetCommitPeriodMs = 0L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        long long4 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = objKafkaSpoutConfig0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        long long5 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        int int6 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 32L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = objKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.UNIT_TEST_RETRY_SERVICE;
        objKafkaSpoutConfig0.retryService = kafkaSpoutRetryService7;
        objKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.Subscription subscription11 = objKafkaSpoutConfig0.subscription;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.getRetryService();
        int int6 = objKafkaSpoutConfig0.maxRetries;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator6 = objKafkaSpoutConfig0.translator;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator7 = objKafkaSpoutConfig0.getTranslator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>> strListBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.util.List<java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>> strListKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.List<java.lang.String>, org.apache.storm.kafka.spout.RecordTranslator<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>>(strListBuilder0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        java.lang.String str6 = objKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = objKafkaSpoutConfig0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = '4';
        org.apache.storm.kafka.spout.Subscription subscription7 = objKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.Subscription subscription8 = objKafkaSpoutConfig0.getSubscription();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass9 = objKafkaSpoutConfig0.keyDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = objKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder2 = strBuilder0.setPollTimeoutMs((long) (short) 100);
        strBuilder2.pollTimeoutMs = (short) 100;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyEnumSerializableDeserializer5 = strBuilder2.valueDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder7 = strBuilder2.setSecurityProtocol("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator6 = objKafkaSpoutConfig0.translator;
        int int7 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.Subscription subscription8 = objKafkaSpoutConfig0.subscription;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = objKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.Subscription subscription3 = objKafkaSpoutConfig0.subscription;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.Subscription subscription6 = objKafkaSpoutConfig0.getSubscription();
        org.apache.storm.kafka.spout.Subscription subscription7 = objKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator8 = objKafkaSpoutConfig0.translator;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objKafkaSpoutConfig0.getKafkaProps();
        int int3 = objKafkaSpoutConfig0.getMaxTupleRetries();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass4 = objKafkaSpoutConfig0.valueDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = objKafkaSpoutConfig0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.Subscription subscription3 = objKafkaSpoutConfig0.subscription;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        long long5 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        long long7 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer3 = objKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder2 = strBuilder0.setPollTimeoutMs((long) (short) 100);
        strBuilder2.pollTimeoutMs = (short) 100;
        long long5 = strBuilder2.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder8 = strBuilder2.setSSLKeystore("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=-1, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        int int4 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int5 = objKafkaSpoutConfig0.getMaxTupleRetries();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objKafkaSpoutConfig0.getKafkaProps();
        long long7 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long8 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass9 = objKafkaSpoutConfig0.valueDesClazz;
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 52L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.CharSequence> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>(objBuilder0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = '4';
        org.apache.storm.kafka.spout.Subscription subscription7 = objKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.Subscription subscription8 = objKafkaSpoutConfig0.getSubscription();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass9 = objKafkaSpoutConfig0.keyDesClazz;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass10 = objKafkaSpoutConfig0.valueDesClazz;
        long long11 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        long long7 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long8 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer9 = objKafkaSpoutConfig0.valueDes;
        org.apache.storm.kafka.spout.Subscription subscription10 = objKafkaSpoutConfig0.getSubscription();
        long long11 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        long long12 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        long long7 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long8 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer9 = objKafkaSpoutConfig0.valueDes;
        org.apache.storm.kafka.spout.Subscription subscription10 = objKafkaSpoutConfig0.getSubscription();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator6 = objKafkaSpoutConfig0.translator;
        int int7 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.Subscription subscription8 = objKafkaSpoutConfig0.subscription;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = objKafkaSpoutConfig0.getKafkaProps();
        objKafkaSpoutConfig0.maxRetries = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        int int4 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int5 = objKafkaSpoutConfig0.getMaxTupleRetries();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objKafkaSpoutConfig0.getKafkaProps();
        long long7 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass8 = objKafkaSpoutConfig0.valueDesClazz;
        long long9 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        long long5 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator6 = objKafkaSpoutConfig0.getTranslator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long3 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        int int5 = objKafkaSpoutConfig0.maxUncommittedOffsets;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        objKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 0;
        long long9 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer10 = objKafkaSpoutConfig0.keyDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = '4';
        org.apache.storm.kafka.spout.Subscription subscription7 = objKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = objKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = objKafkaSpoutConfig0.kafkaProps;
        objKafkaSpoutConfig0.offsetCommitPeriodMs = 35L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder2 = strBuilder0.setPollTimeoutMs((long) (short) 100);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder6 = strBuilder0.setMaxRetries(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder8 = strBuilder6.setBootstrapServers("KafkaSpoutConfig{kafkaProps={ssl.keystore.password=hi!, ssl.keystore.location=hi!, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        int int4 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int5 = objKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator6 = objKafkaSpoutConfig0.getTranslator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        int int5 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int6 = objKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder2 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder5 = strBuilder2.setSSLTruststore("KafkaSpoutConfig{kafkaProps={ssl.keystore.password=hi!, ssl.keystore.location=hi!, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}", "KafkaSpoutConfig{kafkaProps={hi!=10, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=97, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long3 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer6 = objKafkaSpoutConfig0.keyDes;
        long long7 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.Subscription subscription6 = objKafkaSpoutConfig0.getSubscription();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        long long5 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        long long6 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = '4';
        org.apache.storm.kafka.spout.Subscription subscription7 = objKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.Subscription subscription8 = objKafkaSpoutConfig0.getSubscription();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass9 = objKafkaSpoutConfig0.keyDesClazz;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = objKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objKafkaSpoutConfig0.retryService;
        int int4 = objKafkaSpoutConfig0.maxRetries;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer5 = objKafkaSpoutConfig0.keyDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator6 = objKafkaSpoutConfig0.translator;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        long long7 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long8 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer9 = objKafkaSpoutConfig0.valueDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder2 = strBuilder0.setPollTimeoutMs((long) (short) 100);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = strBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder6 = strBuilder0.setMaxRetries(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder8 = strBuilder0.setMaxPartitionFectchBytes((int) (byte) 10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator3 = objKafkaSpoutConfig0.translator;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator3 = objKafkaSpoutConfig0.translator;
        int int4 = objKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator5 = objKafkaSpoutConfig0.getTranslator();
        long long6 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.Subscription subscription7 = objKafkaSpoutConfig0.getSubscription();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = '4';
        org.apache.storm.kafka.spout.Subscription subscription7 = objKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.Subscription subscription8 = objKafkaSpoutConfig0.getSubscription();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass9 = objKafkaSpoutConfig0.keyDesClazz;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass10 = objKafkaSpoutConfig0.valueDesClazz;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer11 = objKafkaSpoutConfig0.valueDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass1 = objKafkaSpoutConfig0.valueDesClazz;
        org.apache.storm.kafka.spout.Subscription subscription2 = objKafkaSpoutConfig0.subscription;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.getRetryService();
        int int6 = objKafkaSpoutConfig0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpoutConfig0.retryService;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = objKafkaSpoutConfig0.getKeyDeserializer();
        int int9 = objKafkaSpoutConfig0.getMaxTupleRetries();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder2 = strBuilder0.setPollTimeoutMs((long) (short) 100);
        strBuilder2.pollTimeoutMs = (short) 100;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyEnumSerializableDeserializer5 = strBuilder2.valueDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder7 = strBuilder2.setSecurityProtocol("KafkaSpoutConfig{kafkaProps={ssl.keystore.password=hi!, ssl.keystore.location=hi!, bootstrap.servers=hi!}, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        long long5 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long3 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long4 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long5 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long3 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        int int5 = objKafkaSpoutConfig0.maxUncommittedOffsets;
        long long6 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        long long4 = objKafkaSpoutConfig0.pollTimeoutMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass5 = objKafkaSpoutConfig0.valueDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator6 = objKafkaSpoutConfig0.translator;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = org.apache.storm.kafka.spout.KafkaSpoutConfig.UNIT_TEST_RETRY_SERVICE;
        objKafkaSpoutConfig0.retryService = kafkaSpoutRetryService7;
        objKafkaSpoutConfig0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = objKafkaSpoutConfig0.getRetryService();
        long long12 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long3 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = objKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        long long5 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.offsetCommitPeriodMs = 200L;
        objKafkaSpoutConfig0.maxRetries = (short) 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer10 = objKafkaSpoutConfig0.valueDes;
        objKafkaSpoutConfig0.maxUncommittedOffsets = (short) 100;
        long long13 = objKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = objKafkaSpoutConfig0.firstPollOffsetStrategy;
        int int6 = objKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer3 = objKafkaSpoutConfig0.getKeyDeserializer();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = '#';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder2 = strBuilder0.setPollTimeoutMs((long) (short) 100);
        strBuilder0.pollTimeoutMs = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder6 = strBuilder0.setOffsetCommitPeriodMs(2000L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder8 = strBuilder6.setGroupId("KafkaSpoutConfig{kafkaProps=null, key=null, value=null, pollTimeoutMs=0, offsetCommitPeriodMs=97, maxRetries=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, subscription=null, translator=null, retryService=null}");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.Subscription subscription3 = objKafkaSpoutConfig0.subscription;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        long long5 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpoutConfig0.retryService;
        long long8 = objKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        long long4 = objKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objKafkaSpoutConfig0.getKafkaProps();
        int int3 = objKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = objKafkaSpoutConfig0.getRetryService();
        long long5 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        int int4 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int5 = objKafkaSpoutConfig0.getMaxTupleRetries();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objKafkaSpoutConfig0.getKafkaProps();
        long long7 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        long long8 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass9 = objKafkaSpoutConfig0.valueDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = objKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.Subscription subscription5 = objKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.Subscription subscription6 = objKafkaSpoutConfig0.getSubscription();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer4 = objKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = '4';
        org.apache.storm.kafka.spout.Subscription subscription7 = objKafkaSpoutConfig0.subscription;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator6 = objKafkaSpoutConfig0.translator;
        int int7 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int8 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer9 = objKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator6 = objKafkaSpoutConfig0.translator;
        long long7 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.storm.kafka.spout.Subscription subscription8 = objKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.Subscription subscription9 = objKafkaSpoutConfig0.getSubscription();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        int int4 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.retryService;
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 200L;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = objKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 32L;
        objKafkaSpoutConfig0.maxRetries = 10;
        long long9 = objKafkaSpoutConfig0.getPollTimeoutMs();
        java.lang.String str10 = objKafkaSpoutConfig0.toString();
        int int11 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        java.lang.String str1 = objKafkaSpoutConfig0.toString();
        int int2 = objKafkaSpoutConfig0.maxRetries;
        org.apache.storm.kafka.spout.Subscription subscription3 = objKafkaSpoutConfig0.subscription;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass4 = objKafkaSpoutConfig0.valueDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        int int5 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        long long6 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpoutConfig0.getRetryService();
        int int8 = objKafkaSpoutConfig0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        long long7 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long8 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer9 = objKafkaSpoutConfig0.valueDes;
        long long10 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer11 = objKafkaSpoutConfig0.keyDes;
        objKafkaSpoutConfig0.maxRetries = 35;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        long long7 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long8 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer9 = objKafkaSpoutConfig0.valueDes;
        org.apache.storm.kafka.spout.Subscription subscription10 = objKafkaSpoutConfig0.getSubscription();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = objKafkaSpoutConfig0.getRetryService();
        long long12 = objKafkaSpoutConfig0.getPollTimeoutMs();
        long long13 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = objKafkaSpoutConfig0.getKafkaProps();
        long long15 = objKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = '4';
        org.apache.storm.kafka.spout.Subscription subscription7 = objKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.Subscription subscription8 = objKafkaSpoutConfig0.getSubscription();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass9 = objKafkaSpoutConfig0.keyDesClazz;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass10 = objKafkaSpoutConfig0.valueDesClazz;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer11 = objKafkaSpoutConfig0.valueDes;
        java.lang.String str12 = objKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long3 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        int int5 = objKafkaSpoutConfig0.maxUncommittedOffsets;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass7 = objKafkaSpoutConfig0.keyDesClazz;
        long long8 = objKafkaSpoutConfig0.getPollTimeoutMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = objKafkaSpoutConfig0.retryService;
        int int4 = objKafkaSpoutConfig0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.Subscription subscription3 = objKafkaSpoutConfig0.subscription;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.Subscription subscription6 = objKafkaSpoutConfig0.getSubscription();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer3 = objKafkaSpoutConfig0.getKeyDeserializer();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = '#';
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass6 = objKafkaSpoutConfig0.valueDesClazz;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        long long5 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.Subscription subscription7 = objKafkaSpoutConfig0.subscription;
        int int8 = objKafkaSpoutConfig0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = objKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer10 = objKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 200L;
        java.lang.String str5 = objKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer7 = objKafkaSpoutConfig0.valueDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer3 = objKafkaSpoutConfig0.keyDes;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = objKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long5 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.maxUncommittedOffsets = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objKafkaSpoutConfig0.retryService;
        long long9 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Cloneable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>> cloneableBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Cloneable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>> cloneableKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>>(cloneableBuilder0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objKafkaSpoutConfig0.getKafkaProps();
        int int3 = objKafkaSpoutConfig0.getMaxTupleRetries();
        int int4 = objKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        long long4 = objKafkaSpoutConfig0.pollTimeoutMs;
        long long5 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        long long4 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = objKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        long long7 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long8 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer9 = objKafkaSpoutConfig0.valueDes;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = objKafkaSpoutConfig0.getKafkaProps();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer11 = objKafkaSpoutConfig0.getValueDeserializer();
        long long12 = objKafkaSpoutConfig0.pollTimeoutMs;
        int int13 = objKafkaSpoutConfig0.getMaxTupleRetries();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = objKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator6 = objKafkaSpoutConfig0.translator;
        long long7 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.storm.kafka.spout.Subscription subscription8 = objKafkaSpoutConfig0.subscription;
        int int9 = objKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator6 = objKafkaSpoutConfig0.translator;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer7 = objKafkaSpoutConfig0.keyDes;
        int int8 = objKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.Subscription subscription9 = objKafkaSpoutConfig0.getSubscription();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        long long5 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator6 = objKafkaSpoutConfig0.getTranslator();
        int int7 = objKafkaSpoutConfig0.maxRetries;
        org.apache.storm.kafka.spout.Subscription subscription8 = objKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = objKafkaSpoutConfig0.getRetryService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 200L;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass5 = objKafkaSpoutConfig0.valueDesClazz;
        java.lang.String str6 = objKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = '4';
        objKafkaSpoutConfig0.offsetCommitPeriodMs = 'a';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer9 = objKafkaSpoutConfig0.keyDes;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long11 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.Subscription subscription12 = objKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder13 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder15 = strBuilder13.setPollTimeoutMs((long) (short) 100);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService16 = strBuilder13.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.UNIT_TEST_RETRY_SERVICE = kafkaSpoutRetryService16;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_RETRY_SERVICE = kafkaSpoutRetryService16;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_RETRY_SERVICE = kafkaSpoutRetryService16;
        objKafkaSpoutConfig0.retryService = kafkaSpoutRetryService16;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator4 = objKafkaSpoutConfig0.translator;
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 32;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long3 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        long long5 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = objKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.Subscription subscription7 = objKafkaSpoutConfig0.subscription;
        objKafkaSpoutConfig0.maxRetries = 0;
        long long10 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.maxRetries = (byte) 0;
        long long4 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = objKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.Subscription subscription6 = objKafkaSpoutConfig0.subscription;
        int int7 = objKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = objKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer9 = objKafkaSpoutConfig0.keyDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.maxRetries = (byte) 0;
        long long4 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = objKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.Subscription subscription6 = objKafkaSpoutConfig0.subscription;
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator7 = objKafkaSpoutConfig0.getTranslator();
        int int8 = objKafkaSpoutConfig0.maxRetries;
        objKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        long long3 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = objKafkaSpoutConfig0.firstPollOffsetStrategy;
        long long5 = objKafkaSpoutConfig0.pollTimeoutMs;
        int int6 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int7 = objKafkaSpoutConfig0.maxRetries;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer8 = objKafkaSpoutConfig0.valueDes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.getRetryService();
        int int6 = objKafkaSpoutConfig0.maxRetries;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = objKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer8 = objKafkaSpoutConfig0.valueDes;
        org.apache.storm.kafka.spout.Subscription subscription9 = objKafkaSpoutConfig0.subscription;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objKafkaSpoutConfig0.getKafkaProps();
        int int3 = objKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.Subscription subscription4 = objKafkaSpoutConfig0.subscription;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.maxRetries = (byte) 0;
        long long4 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = objKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.Subscription subscription6 = objKafkaSpoutConfig0.subscription;
        long long7 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objKafkaSpoutConfig0.getKafkaProps();
        int int3 = objKafkaSpoutConfig0.getMaxTupleRetries();
        int int4 = objKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        int int7 = objKafkaSpoutConfig0.getMaxTupleRetries();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        java.lang.String str1 = objKafkaSpoutConfig0.toString();
        objKafkaSpoutConfig0.maxUncommittedOffsets = 100;
        long long4 = objKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = objKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer6 = objKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        int int4 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 0L;
        objKafkaSpoutConfig0.maxRetries = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator7 = objKafkaSpoutConfig0.translator;
        int int8 = objKafkaSpoutConfig0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        int int4 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass5 = objKafkaSpoutConfig0.valueDesClazz;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objKafkaSpoutConfig0.getRetryService();
        long long7 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpoutConfig0.retryService;
        long long6 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer7 = objKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer8 = objKafkaSpoutConfig0.getValueDeserializer();
        objKafkaSpoutConfig0.offsetCommitPeriodMs = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String[], java.lang.reflect.AnnotatedElement> strArrayBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String[], java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.lang.reflect.AnnotatedElement> strArrayKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String[], java.lang.reflect.AnnotatedElement>(strArrayBuilder0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 10L;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = objKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.Subscription subscription5 = objKafkaSpoutConfig0.subscription;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = objKafkaSpoutConfig0.getKeyDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.Subscription subscription3 = objKafkaSpoutConfig0.subscription;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer5 = objKafkaSpoutConfig0.getValueDeserializer();
        objKafkaSpoutConfig0.maxUncommittedOffsets = (-1);
        java.lang.String str8 = objKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator9 = objKafkaSpoutConfig0.getTranslator();
        org.apache.storm.kafka.spout.Subscription subscription10 = objKafkaSpoutConfig0.getSubscription();
        long long11 = objKafkaSpoutConfig0.pollTimeoutMs;
        long long12 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        java.lang.String str13 = objKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = objKafkaSpoutConfig0.getKafkaProps();
        int int3 = objKafkaSpoutConfig0.getMaxTupleRetries();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass4 = objKafkaSpoutConfig0.valueDesClazz;
        int int5 = objKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objKafkaSpoutConfig0.retryService;
        long long7 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = objKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer9 = objKafkaSpoutConfig0.getValueDeserializer();
        objKafkaSpoutConfig0.maxUncommittedOffsets = (short) 10;
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.Object>> wildcardClass12 = objKafkaSpoutConfig0.keyDesClazz;
        long long13 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.RecordTranslator<java.lang.Object, java.lang.CharSequence> objRecordTranslator14 = objKafkaSpoutConfig0.getTranslator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        java.lang.String str1 = objKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer2 = objKafkaSpoutConfig0.valueDes;
        java.lang.String str3 = objKafkaSpoutConfig0.toString();
        long long4 = objKafkaSpoutConfig0.partitionRefreshPeriodMs;
        org.apache.storm.kafka.spout.Subscription subscription5 = objKafkaSpoutConfig0.getSubscription();
        int int6 = objKafkaSpoutConfig0.getMaxTupleRetries();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer7 = objKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        long long5 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long6 = objKafkaSpoutConfig0.getPollTimeoutMs();
        objKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 100;
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.Subscription subscription3 = objKafkaSpoutConfig0.subscription;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        long long5 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpoutConfig0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.util.Map<java.lang.String, java.lang.Object>> firstPollOffsetStrategyEnumBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.util.Map<java.lang.String, java.lang.Object>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.util.Map<java.lang.String, java.lang.Object>> firstPollOffsetStrategyEnumKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.util.Map<java.lang.String, java.lang.Object>>(firstPollOffsetStrategyEnumBuilder0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        int int4 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int5 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.Class<? extends org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence>> wildcardClass6 = objKafkaSpoutConfig0.valueDesClazz;
        int int7 = objKafkaSpoutConfig0.maxRetries;
        objKafkaSpoutConfig0.offsetCommitPeriodMs = 2147483647;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Object> objSerializableDeserializer10 = objKafkaSpoutConfig0.keyDes;
        int int11 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = objKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.Subscription subscription1 = objKafkaSpoutConfig0.getSubscription();
        long long2 = objKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer3 = objKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpoutConfig0.kafkaProps;
        long long5 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objKafkaSpoutConfig0.getRetryService();
        org.apache.kafka.common.serialization.Deserializer<java.lang.CharSequence> charSequenceDeserializer7 = objKafkaSpoutConfig0.getValueDeserializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 32L;
        objKafkaSpoutConfig0.maxRetries = 10;
        long long9 = objKafkaSpoutConfig0.getPollTimeoutMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = 1L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = objKafkaSpoutConfig0.retryService;
        long long2 = objKafkaSpoutConfig0.getPartitionRefreshPeriodMs();
        objKafkaSpoutConfig0.partitionRefreshPeriodMs = ' ';
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.CharSequence> charSequenceSerializableDeserializer5 = objKafkaSpoutConfig0.valueDes;
        long long6 = objKafkaSpoutConfig0.pollTimeoutMs;
        long long7 = objKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int8 = objKafkaSpoutConfig0.getMaxUncommittedOffsets();
        objKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 0;
        objKafkaSpoutConfig0.maxUncommittedOffsets = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = objKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }
}

